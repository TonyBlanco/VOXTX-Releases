package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class ko extends ju {
    @Override // com.google.ads.interactivemedia.v3.internal.jb
    public final void e(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i9 = iLimit - iPosition;
        int i10 = this.f23410b.f23331d;
        if (i10 == 3) {
            i9 += i9;
        } else if (i10 == 4) {
            i9 /= 2;
        } else if (i10 != 268435456) {
            if (i10 != 536870912) {
                if (i10 != 805306368) {
                    throw new IllegalStateException();
                }
                i9 /= 2;
            } else {
                i9 /= 3;
                i9 += i9;
            }
        }
        ByteBuffer byteBufferJ = j(i9);
        int i11 = this.f23410b.f23331d;
        if (i11 == 3) {
            while (iPosition < iLimit) {
                byteBufferJ.put((byte) 0);
                byteBufferJ.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i11 == 4) {
            while (iPosition < iLimit) {
                short sA = (short) (cq.a(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferJ.put((byte) (sA & 255));
                byteBufferJ.put((byte) ((sA >> 8) & 255));
                iPosition += 4;
            }
        } else if (i11 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 1));
                byteBufferJ.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i11 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 1));
                byteBufferJ.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i11 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 2));
                byteBufferJ.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferJ.flip();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ju
    public final iz i(iz izVar) throws ja {
        int i9 = izVar.f23331d;
        if (i9 != 3) {
            if (i9 == 2) {
                return iz.f23328a;
            }
            if (i9 != 268435456 && i9 != 536870912 && i9 != 805306368 && i9 != 4) {
                throw new ja(izVar);
            }
        }
        return new iz(izVar.f23329b, izVar.f23330c, 2);
    }
}
