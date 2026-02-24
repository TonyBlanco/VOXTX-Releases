package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class kk extends ju {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f23508d = Float.floatToIntBits(Float.NaN);

    private static void o(int i9, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i9) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f23508d) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jb
    public final void e(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferJ;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i9 = iLimit - iPosition;
        int i10 = this.f23410b.f23331d;
        if (i10 == 536870912) {
            byteBufferJ = j((i9 / 3) * 4);
            while (iPosition < iLimit) {
                o(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferJ);
                iPosition += 3;
            }
        } else {
            if (i10 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferJ = j(i9);
            while (iPosition < iLimit) {
                o((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferJ);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferJ.flip();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ju
    public final iz i(iz izVar) throws ja {
        int i9 = izVar.f23331d;
        if (cq.X(i9)) {
            return i9 != 4 ? new iz(izVar.f23329b, izVar.f23330c, 4) : iz.f23328a;
        }
        throw new ja(izVar);
    }
}
