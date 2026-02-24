package com.google.android.exoplayer2.decoder;

import O2.C0936z0;
import com.google.android.exoplayer2.decoder.a;
import com.google.android.gms.common.api.a;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class VideoDecoderOutputBuffer extends a {
    public static final int COLORSPACE_BT2020 = 3;
    public static final int COLORSPACE_BT601 = 1;
    public static final int COLORSPACE_BT709 = 2;
    public static final int COLORSPACE_UNKNOWN = 0;
    public int colorspace;
    public ByteBuffer data;
    public int decoderPrivate;
    public C0936z0 format;
    public int height;
    public int mode;
    private final a.InterfaceC0238a owner;
    public ByteBuffer supplementalData;
    public int width;
    public ByteBuffer[] yuvPlanes;
    public int[] yuvStrides;

    public VideoDecoderOutputBuffer(a.InterfaceC0238a interfaceC0238a) {
        this.owner = interfaceC0238a;
    }

    private static boolean isSafeToMultiply(int i9, int i10) {
        return i9 >= 0 && i10 >= 0 && (i10 <= 0 || i9 < a.e.API_PRIORITY_OTHER / i10);
    }

    public void init(long j9, int i9, ByteBuffer byteBuffer) {
        this.timeUs = j9;
        this.mode = i9;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            this.supplementalData = null;
            return;
        }
        addFlag(268435456);
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBuffer2 = this.supplementalData;
        if (byteBuffer2 == null || byteBuffer2.capacity() < iLimit) {
            this.supplementalData = ByteBuffer.allocate(iLimit);
        } else {
            this.supplementalData.clear();
        }
        this.supplementalData.put(byteBuffer);
        this.supplementalData.flip();
        byteBuffer.position(0);
    }

    public void initForPrivateFrame(int i9, int i10) {
        this.width = i9;
        this.height = i10;
    }

    public boolean initForYuvFrame(int i9, int i10, int i11, int i12, int i13) {
        this.width = i9;
        this.height = i10;
        this.colorspace = i13;
        int i14 = (int) ((((long) i10) + 1) / 2);
        if (isSafeToMultiply(i11, i10) && isSafeToMultiply(i12, i14)) {
            int i15 = i10 * i11;
            int i16 = i14 * i12;
            int i17 = (i16 * 2) + i15;
            if (isSafeToMultiply(i16, 2) && i17 >= i15) {
                ByteBuffer byteBuffer = this.data;
                if (byteBuffer == null || byteBuffer.capacity() < i17) {
                    this.data = ByteBuffer.allocateDirect(i17);
                } else {
                    this.data.position(0);
                    this.data.limit(i17);
                }
                if (this.yuvPlanes == null) {
                    this.yuvPlanes = new ByteBuffer[3];
                }
                ByteBuffer byteBuffer2 = this.data;
                ByteBuffer[] byteBufferArr = this.yuvPlanes;
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferArr[0] = byteBufferSlice;
                byteBufferSlice.limit(i15);
                byteBuffer2.position(i15);
                ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
                byteBufferArr[1] = byteBufferSlice2;
                byteBufferSlice2.limit(i16);
                byteBuffer2.position(i15 + i16);
                ByteBuffer byteBufferSlice3 = byteBuffer2.slice();
                byteBufferArr[2] = byteBufferSlice3;
                byteBufferSlice3.limit(i16);
                if (this.yuvStrides == null) {
                    this.yuvStrides = new int[3];
                }
                int[] iArr = this.yuvStrides;
                iArr[0] = i11;
                iArr[1] = i12;
                iArr[2] = i12;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.decoder.a
    public void release() {
        this.owner.a(this);
    }
}
