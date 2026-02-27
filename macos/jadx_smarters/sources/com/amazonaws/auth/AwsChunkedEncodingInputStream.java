package com.amazonaws.auth;

import android.support.v4.media.session.PlaybackStateCompat;
import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.SdkInputStream;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class AwsChunkedEncodingInputStream extends SdkInputStream {
    private static final int BIT_MASK = 255;
    private static final String CHUNK_SIGNATURE_HEADER = ";chunk-signature=";
    private static final String CHUNK_STRING_TO_SIGN_PREFIX = "AWS4-HMAC-SHA256-PAYLOAD";
    private static final String CLRF = "\r\n";
    private static final int DEFAULT_BUFFER_SIZE = 262144;
    private static final int DEFAULT_CHUNK_SIZE = 131072;
    protected static final String DEFAULT_ENCODING = "UTF-8";
    private static final int SIGNATURE_LENGTH = 64;
    private final AWS4Signer aws4Signer;
    private ChunkContentIterator currentChunkIterator;
    private final String dateTime;
    private DecodedStreamBuffer decodedStreamBuffer;
    private final String headerSignature;
    private InputStream is;
    private boolean isAtStart;
    private boolean isTerminating;
    private final byte[] kSigning;
    private final String keyPath;
    private final int maxBufferSize;
    private String priorChunkSignature;
    private static final byte[] FINAL_CHUNK = new byte[0];
    private static final Log log = LogFactory.getLog((Class<?>) AwsChunkedEncodingInputStream.class);

    public AwsChunkedEncodingInputStream(InputStream inputStream, int i9, byte[] bArr, String str, String str2, String str3, AWS4Signer aWS4Signer) {
        this.is = null;
        this.isAtStart = true;
        this.isTerminating = false;
        if (inputStream instanceof AwsChunkedEncodingInputStream) {
            AwsChunkedEncodingInputStream awsChunkedEncodingInputStream = (AwsChunkedEncodingInputStream) inputStream;
            i9 = Math.max(awsChunkedEncodingInputStream.maxBufferSize, i9);
            this.is = awsChunkedEncodingInputStream.is;
            this.decodedStreamBuffer = awsChunkedEncodingInputStream.decodedStreamBuffer;
        } else {
            this.is = inputStream;
            this.decodedStreamBuffer = null;
        }
        if (i9 < DEFAULT_CHUNK_SIZE) {
            throw new IllegalArgumentException("Max buffer size should not be less than chunk size");
        }
        this.maxBufferSize = i9;
        this.kSigning = bArr;
        this.dateTime = str;
        this.keyPath = str2;
        this.headerSignature = str3;
        this.priorChunkSignature = str3;
        this.aws4Signer = aWS4Signer;
    }

    public AwsChunkedEncodingInputStream(InputStream inputStream, byte[] bArr, String str, String str2, String str3, AWS4Signer aWS4Signer) {
        this(inputStream, DEFAULT_BUFFER_SIZE, bArr, str, str2, str3, aWS4Signer);
    }

    private static long calculateSignedChunkLength(long j9) {
        return ((long) (Long.toHexString(j9).length() + 83)) + j9 + ((long) 2);
    }

    public static long calculateStreamContentLength(long j9) {
        if (j9 < 0) {
            throw new IllegalArgumentException("Nonnegative content length expected.");
        }
        long j10 = j9 / 131072;
        long j11 = j9 % 131072;
        return (j10 * calculateSignedChunkLength(131072L)) + (j11 > 0 ? calculateSignedChunkLength(j11) : 0L) + calculateSignedChunkLength(0L);
    }

    private byte[] createSignedChunk(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(bArr.length));
        String hex = BinaryUtils.toHex(this.aws4Signer.sign("AWS4-HMAC-SHA256-PAYLOAD\n" + this.dateTime + "\n" + this.keyPath + "\n" + this.priorChunkSignature + "\n" + BinaryUtils.toHex(this.aws4Signer.hash("")) + "\n" + BinaryUtils.toHex(this.aws4Signer.hash(bArr)), this.kSigning, SigningAlgorithm.HmacSHA256));
        this.priorChunkSignature = hex;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CHUNK_SIGNATURE_HEADER);
        sb2.append(hex);
        sb.append(sb2.toString());
        sb.append(CLRF);
        try {
            String string = sb.toString();
            Charset charset = StringUtils.UTF8;
            byte[] bytes = string.getBytes(charset);
            byte[] bytes2 = CLRF.getBytes(charset);
            byte[] bArr2 = new byte[bytes.length + bArr.length + bytes2.length];
            System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
            System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
            System.arraycopy(bytes2, 0, bArr2, bytes.length + bArr.length, bytes2.length);
            return bArr2;
        } catch (Exception e9) {
            throw new AmazonClientException("Unable to sign the chunked data. " + e9.getMessage(), e9);
        }
    }

    private boolean setUpNextChunk() throws IOException {
        byte[] bArr = new byte[DEFAULT_CHUNK_SIZE];
        int i9 = 0;
        while (i9 < DEFAULT_CHUNK_SIZE) {
            DecodedStreamBuffer decodedStreamBuffer = this.decodedStreamBuffer;
            if (decodedStreamBuffer == null || !decodedStreamBuffer.hasNext()) {
                int i10 = this.is.read(bArr, i9, DEFAULT_CHUNK_SIZE - i9);
                if (i10 == -1) {
                    break;
                }
                DecodedStreamBuffer decodedStreamBuffer2 = this.decodedStreamBuffer;
                if (decodedStreamBuffer2 != null) {
                    decodedStreamBuffer2.buffer(bArr, i9, i10);
                }
                i9 += i10;
            } else {
                bArr[i9] = this.decodedStreamBuffer.next();
                i9++;
            }
        }
        if (i9 == 0) {
            this.currentChunkIterator = new ChunkContentIterator(createSignedChunk(FINAL_CHUNK));
            return true;
        }
        if (i9 < DEFAULT_CHUNK_SIZE) {
            byte[] bArr2 = new byte[i9];
            System.arraycopy(bArr, 0, bArr2, 0, i9);
            bArr = bArr2;
        }
        this.currentChunkIterator = new ChunkContentIterator(createSignedChunk(bArr));
        return false;
    }

    @Override // com.amazonaws.internal.SdkInputStream
    public InputStream getWrappedInputStream() {
        return this.is;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i9) {
        try {
            abortIfNeeded();
            if (!this.isAtStart) {
                throw new UnsupportedOperationException("Chunk-encoded stream only supports mark() at the start of the stream.");
            }
            if (this.is.markSupported()) {
                Log log2 = log;
                if (log2.isDebugEnabled()) {
                    log2.debug("AwsChunkedEncodingInputStream marked at the start of the stream (will directly mark the wrapped stream since it's mark-supported).");
                }
                this.is.mark(a.e.API_PRIORITY_OTHER);
            } else {
                Log log3 = log;
                if (log3.isDebugEnabled()) {
                    log3.debug("AwsChunkedEncodingInputStream marked at the start of the stream (initializing the buffer since the wrapped stream is not mark-supported).");
                }
                this.decodedStreamBuffer = new DecodedStreamBuffer(this.maxBufferSize);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = new byte[1];
        int i9 = read(bArr, 0, 1);
        if (i9 == -1) {
            return i9;
        }
        Log log2 = log;
        if (log2.isDebugEnabled()) {
            log2.debug("One byte read from the stream.");
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i9, int i10) throws IOException {
        abortIfNeeded();
        bArr.getClass();
        if (i9 < 0 || i10 < 0 || i10 > bArr.length - i9) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 == 0) {
            return 0;
        }
        ChunkContentIterator chunkContentIterator = this.currentChunkIterator;
        if (chunkContentIterator == null || !chunkContentIterator.hasNext()) {
            if (this.isTerminating) {
                return -1;
            }
            this.isTerminating = setUpNextChunk();
        }
        int i11 = this.currentChunkIterator.read(bArr, i9, i10);
        if (i11 > 0) {
            this.isAtStart = false;
            Log log2 = log;
            if (log2.isDebugEnabled()) {
                log2.debug(i11 + " byte read from the stream.");
            }
        }
        return i11;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        try {
            abortIfNeeded();
            this.currentChunkIterator = null;
            this.priorChunkSignature = this.headerSignature;
            if (this.is.markSupported()) {
                Log log2 = log;
                if (log2.isDebugEnabled()) {
                    log2.debug("AwsChunkedEncodingInputStream reset (will reset the wrapped stream because it is mark-supported).");
                }
                this.is.reset();
            } else {
                Log log3 = log;
                if (log3.isDebugEnabled()) {
                    log3.debug("AwsChunkedEncodingInputStream reset (will use the buffer of the decoded stream).");
                }
                DecodedStreamBuffer decodedStreamBuffer = this.decodedStreamBuffer;
                if (decodedStreamBuffer == null) {
                    throw new IOException("Cannot reset the stream because the mark is not set.");
                }
                decodedStreamBuffer.startReadBuffer();
            }
            this.currentChunkIterator = null;
            this.isAtStart = true;
            this.isTerminating = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j9) throws IOException {
        int i9;
        if (j9 <= 0) {
            return 0L;
        }
        int iMin = (int) Math.min(PlaybackStateCompat.ACTION_SET_REPEAT_MODE, j9);
        byte[] bArr = new byte[iMin];
        long j10 = j9;
        while (j10 > 0 && (i9 = read(bArr, 0, iMin)) >= 0) {
            j10 -= (long) i9;
        }
        return j9 - j10;
    }
}
