package com.amazonaws.services.s3.internal.crypto;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class CipherLiteInputStream extends SdkFilterInputStream {
    private static final int BYTE_MASK = 255;
    private static final int DEFAULT_IN_BUFFER_SIZE = 512;
    private static final int MAX_RETRY = 1000;
    private final byte[] bufin;
    private byte[] bufout;
    private CipherLite cipherLite;
    private int currPos;
    private boolean eof;
    private final boolean lastMultiPart;
    private int maxPos;
    private final boolean multipart;

    public CipherLiteInputStream(InputStream inputStream) {
        this(inputStream, CipherLite.NULL, 512, false, false);
    }

    public CipherLiteInputStream(InputStream inputStream, CipherLite cipherLite) {
        this(inputStream, cipherLite, 512, false, false);
    }

    public CipherLiteInputStream(InputStream inputStream, CipherLite cipherLite, int i9) {
        this(inputStream, cipherLite, i9, false, false);
    }

    public CipherLiteInputStream(InputStream inputStream, CipherLite cipherLite, int i9, boolean z9, boolean z10) {
        super(inputStream);
        this.eof = false;
        this.currPos = 0;
        this.maxPos = 0;
        if (z10 && !z9) {
            throw new IllegalArgumentException("lastMultiPart can only be true if multipart is true");
        }
        this.multipart = z9;
        this.lastMultiPart = z10;
        this.cipherLite = cipherLite;
        if (i9 > 0 && i9 % 512 == 0) {
            this.bufin = new byte[i9];
            return;
        }
        throw new IllegalArgumentException("buffsize (" + i9 + ") must be a positive multiple of 512");
    }

    private int nextChunk() throws IOException {
        abortIfNeeded();
        if (this.eof) {
            return -1;
        }
        this.bufout = null;
        int i9 = ((FilterInputStream) this).in.read(this.bufin);
        if (i9 != -1) {
            byte[] bArrUpdate = this.cipherLite.update(this.bufin, 0, i9);
            this.bufout = bArrUpdate;
            this.currPos = 0;
            int length = bArrUpdate != null ? bArrUpdate.length : 0;
            this.maxPos = length;
            return length;
        }
        this.eof = true;
        if (!this.multipart || this.lastMultiPart) {
            try {
                byte[] bArrDoFinal = this.cipherLite.doFinal();
                this.bufout = bArrDoFinal;
                if (bArrDoFinal == null) {
                    return -1;
                }
                this.currPos = 0;
                int length2 = bArrDoFinal.length;
                this.maxPos = length2;
                return length2;
            } catch (BadPaddingException e9) {
                if (S3CryptoScheme.isAesGcm(this.cipherLite.getCipherAlgorithm())) {
                    throw new SecurityException(e9);
                }
            } catch (IllegalBlockSizeException unused) {
            }
        }
        return -1;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() {
        abortIfNeeded();
        return this.maxPos - this.currPos;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterInputStream) this).in.close();
        if (!this.multipart && !S3CryptoScheme.isAesGcm(this.cipherLite.getCipherAlgorithm())) {
            try {
                this.cipherLite.doFinal();
            } catch (BadPaddingException | IllegalBlockSizeException unused) {
            }
        }
        this.currPos = 0;
        this.maxPos = 0;
        abortIfNeeded();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void mark(int i9) {
        abortIfNeeded();
        ((FilterInputStream) this).in.mark(i9);
        this.cipherLite.mark();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        abortIfNeeded();
        return ((FilterInputStream) this).in.markSupported() && this.cipherLite.markSupported();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.currPos >= this.maxPos) {
            if (this.eof) {
                return -1;
            }
            int i9 = 0;
            while (i9 <= 1000) {
                int iNextChunk = nextChunk();
                i9++;
                if (iNextChunk != 0) {
                    if (iNextChunk == -1) {
                        return -1;
                    }
                }
            }
            throw new IOException("exceeded maximum number of attempts to read next chunk of data");
        }
        byte[] bArr = this.bufout;
        int i10 = this.currPos;
        this.currPos = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i9, int i10) throws IOException {
        if (this.currPos >= this.maxPos) {
            if (this.eof) {
                return -1;
            }
            int i11 = 0;
            while (i11 <= 1000) {
                int iNextChunk = nextChunk();
                i11++;
                if (iNextChunk != 0) {
                    if (iNextChunk == -1) {
                        return -1;
                    }
                }
            }
            throw new IOException("exceeded maximum number of attempts to read next chunk of data");
        }
        if (i10 <= 0) {
            return 0;
        }
        int i12 = this.maxPos;
        int i13 = this.currPos;
        int i14 = i12 - i13;
        if (i10 >= i14) {
            i10 = i14;
        }
        System.arraycopy(this.bufout, i13, bArr, i9, i10);
        this.currPos += i10;
        return i10;
    }

    public void renewCipherLite() {
        this.cipherLite = this.cipherLite.recreate();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        abortIfNeeded();
        ((FilterInputStream) this).in.reset();
        this.cipherLite.reset();
        resetInternal();
    }

    public final void resetInternal() {
        if (markSupported()) {
            this.currPos = 0;
            this.maxPos = 0;
            this.eof = false;
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j9) throws IOException {
        abortIfNeeded();
        int i9 = this.maxPos;
        int i10 = this.currPos;
        long j10 = i9 - i10;
        if (j9 > j10) {
            j9 = j10;
        }
        if (j9 < 0) {
            return 0L;
        }
        this.currPos = (int) (((long) i10) + j9);
        return j9;
    }
}
