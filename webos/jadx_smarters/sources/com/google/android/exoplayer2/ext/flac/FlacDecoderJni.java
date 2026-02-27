package com.google.android.exoplayer2.ext.flac;

import O2.C0897l1;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.extractor.g;
import d3.InterfaceC1673j;
import d3.u;
import d4.k0;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
final class FlacDecoderJni {
    private static final int TEMP_BUFFER_SIZE = 8192;
    private ByteBuffer byteBufferData;
    private boolean endOfExtractorInput;
    private InterfaceC1673j extractorInput;
    private final long nativeDecoderContext;
    private byte[] tempBuffer;

    public static final class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f25337a;

        public a(String str, int i9) {
            super(str);
            this.f25337a = i9;
        }
    }

    public FlacDecoderJni() throws e {
        if (!h.isAvailable()) {
            throw new e("Failed to load decoder native libraries.");
        }
        long jFlacInit = flacInit();
        this.nativeDecoderContext = jFlacInit;
        if (jFlacInit == 0) {
            throw new e("Failed to initialize decoder");
        }
    }

    private native FlacStreamMetadata flacDecodeMetadata(long j9) throws IOException;

    private native int flacDecodeToArray(long j9, byte[] bArr) throws IOException;

    private native int flacDecodeToBuffer(long j9, ByteBuffer byteBuffer) throws IOException;

    private native void flacFlush(long j9);

    private native long flacGetDecodePosition(long j9);

    private native long flacGetLastFrameFirstSampleIndex(long j9);

    private native long flacGetLastFrameTimestamp(long j9);

    private native long flacGetNextFrameFirstSampleIndex(long j9);

    private native boolean flacGetSeekPoints(long j9, long j10, long[] jArr);

    private native String flacGetStateString(long j9);

    private native long flacInit();

    private native boolean flacIsDecoderAtEndOfStream(long j9);

    private native void flacRelease(long j9);

    private native void flacReset(long j9, long j10);

    private int readFromExtractorInput(InterfaceC1673j interfaceC1673j, byte[] bArr, int i9, int i10) throws IOException {
        int i11 = interfaceC1673j.read(bArr, i9, i10);
        if (i11 != -1) {
            return i11;
        }
        this.endOfExtractorInput = true;
        return 0;
    }

    public void clearData() {
        this.byteBufferData = null;
        this.extractorInput = null;
    }

    public void decodeSample(ByteBuffer byteBuffer) throws a, IOException {
        byteBuffer.clear();
        int iFlacDecodeToBuffer = byteBuffer.isDirect() ? flacDecodeToBuffer(this.nativeDecoderContext, byteBuffer) : flacDecodeToArray(this.nativeDecoderContext, byteBuffer.array());
        if (iFlacDecodeToBuffer < 0) {
            if (!isDecoderAtEndOfInput()) {
                throw new a("Cannot decode FLAC frame", iFlacDecodeToBuffer);
            }
            iFlacDecodeToBuffer = 0;
        }
        byteBuffer.limit(iFlacDecodeToBuffer);
    }

    public void decodeSampleWithBacktrackPosition(ByteBuffer byteBuffer, long j9) throws a, IOException {
        try {
            decodeSample(byteBuffer);
        } catch (IOException e9) {
            if (j9 >= 0) {
                reset(j9);
                InterfaceC1673j interfaceC1673j = this.extractorInput;
                if (interfaceC1673j != null) {
                    interfaceC1673j.o(j9, e9);
                }
            }
            throw e9;
        }
    }

    public FlacStreamMetadata decodeStreamMetadata() throws IOException {
        FlacStreamMetadata flacStreamMetadataFlacDecodeMetadata = flacDecodeMetadata(this.nativeDecoderContext);
        if (flacStreamMetadataFlacDecodeMetadata != null) {
            return flacStreamMetadataFlacDecodeMetadata;
        }
        throw C0897l1.a("Failed to decode stream metadata", null);
    }

    public void flush() {
        flacFlush(this.nativeDecoderContext);
    }

    public long getDecodePosition() {
        return flacGetDecodePosition(this.nativeDecoderContext);
    }

    public long getLastFrameFirstSampleIndex() {
        return flacGetLastFrameFirstSampleIndex(this.nativeDecoderContext);
    }

    public long getLastFrameTimestamp() {
        return flacGetLastFrameTimestamp(this.nativeDecoderContext);
    }

    public long getNextFrameFirstSampleIndex() {
        return flacGetNextFrameFirstSampleIndex(this.nativeDecoderContext);
    }

    public g.a getSeekPoints(long j9) {
        long[] jArr = new long[4];
        if (!flacGetSeekPoints(this.nativeDecoderContext, j9, jArr)) {
            return null;
        }
        u uVar = new u(jArr[0], jArr[1]);
        return new g.a(uVar, jArr[2] == jArr[0] ? uVar : new u(jArr[2], jArr[3]));
    }

    public String getStateString() {
        return flacGetStateString(this.nativeDecoderContext);
    }

    public boolean isDecoderAtEndOfInput() {
        return flacIsDecoderAtEndOfStream(this.nativeDecoderContext);
    }

    public boolean isEndOfData() {
        ByteBuffer byteBuffer = this.byteBufferData;
        if (byteBuffer != null) {
            return byteBuffer.remaining() == 0;
        }
        if (this.extractorInput != null) {
            return this.endOfExtractorInput;
        }
        return true;
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        int iRemaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.byteBufferData;
        if (byteBuffer2 != null) {
            int iMin = Math.min(iRemaining, byteBuffer2.remaining());
            int iLimit = this.byteBufferData.limit();
            ByteBuffer byteBuffer3 = this.byteBufferData;
            byteBuffer3.limit(byteBuffer3.position() + iMin);
            byteBuffer.put(this.byteBufferData);
            this.byteBufferData.limit(iLimit);
            return iMin;
        }
        InterfaceC1673j interfaceC1673j = this.extractorInput;
        if (interfaceC1673j == null) {
            return -1;
        }
        byte[] bArr = (byte[]) k0.j(this.tempBuffer);
        int iMin2 = Math.min(iRemaining, 8192);
        int fromExtractorInput = readFromExtractorInput(interfaceC1673j, bArr, 0, iMin2);
        if (fromExtractorInput < 4) {
            fromExtractorInput += readFromExtractorInput(interfaceC1673j, bArr, fromExtractorInput, iMin2 - fromExtractorInput);
        }
        int i9 = fromExtractorInput;
        byteBuffer.put(bArr, 0, i9);
        return i9;
    }

    public void release() {
        flacRelease(this.nativeDecoderContext);
    }

    public void reset(long j9) {
        flacReset(this.nativeDecoderContext, j9);
    }

    public void setData(InterfaceC1673j interfaceC1673j) {
        this.byteBufferData = null;
        this.extractorInput = interfaceC1673j;
        this.endOfExtractorInput = false;
        if (this.tempBuffer == null) {
            this.tempBuffer = new byte[8192];
        }
    }

    public void setData(ByteBuffer byteBuffer) {
        this.byteBufferData = byteBuffer;
        this.extractorInput = null;
    }
}
