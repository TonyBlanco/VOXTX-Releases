package org.apache.commons.codec.binary;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import okio.Segment;
import org.apache.commons.codec.binary.BaseNCodec;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes4.dex */
public class BaseNCodecInputStream extends FilterInputStream {
    private final BaseNCodec baseNCodec;
    private final BaseNCodec.Context context;
    private final boolean doEncode;
    private final byte[] singleByte;

    public BaseNCodecInputStream(InputStream inputStream, BaseNCodec baseNCodec, boolean z9) {
        super(inputStream);
        this.singleByte = new byte[1];
        this.context = new BaseNCodec.Context();
        this.doEncode = z9;
        this.baseNCodec = baseNCodec;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return !this.context.eof ? 1 : 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i9) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i9 = read(this.singleByte, 0, 1);
        while (i9 == 0) {
            i9 = read(this.singleByte, 0, 1);
        }
        if (i9 <= 0) {
            return -1;
        }
        byte b9 = this.singleByte[0];
        return b9 < 0 ? b9 + 256 : b9;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i9, int i10) throws IOException {
        bArr.getClass();
        if (i9 < 0 || i10 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i9 > bArr.length || i9 + i10 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 == 0) {
            return 0;
        }
        int results = 0;
        while (results == 0) {
            if (!this.baseNCodec.hasData(this.context)) {
                byte[] bArr2 = new byte[this.doEncode ? 4096 : Segment.SIZE];
                int i11 = ((FilterInputStream) this).in.read(bArr2);
                if (this.doEncode) {
                    this.baseNCodec.encode(bArr2, 0, i11, this.context);
                } else {
                    this.baseNCodec.decode(bArr2, 0, i11, this.context);
                }
            }
            results = this.baseNCodec.readResults(bArr, i9, i10, this.context);
        }
        return results;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        throw new IOException("mark/reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j9) throws IOException {
        int i9;
        if (j9 < 0) {
            throw new IllegalArgumentException("Negative skip length: " + j9);
        }
        byte[] bArr = new byte[IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED];
        long j10 = j9;
        while (j10 > 0 && (i9 = read(bArr, 0, (int) Math.min(IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED, j10))) != -1) {
            j10 -= (long) i9;
        }
        return j9 - j10;
    }
}
