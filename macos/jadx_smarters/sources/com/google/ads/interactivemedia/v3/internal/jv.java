package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class jv extends ju {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f23417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f23418e;

    @Override // com.google.ads.interactivemedia.v3.internal.jb
    public final void e(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) af.s(this.f23418e);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferJ = j(((iLimit - iPosition) / this.f23410b.f23332e) * this.f23411c.f23332e);
        while (iPosition < iLimit) {
            for (int i9 : iArr) {
                byteBufferJ.putShort(byteBuffer.getShort(i9 + i9 + iPosition));
            }
            iPosition += this.f23410b.f23332e;
        }
        byteBuffer.position(iLimit);
        byteBufferJ.flip();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ju
    public final iz i(iz izVar) throws ja {
        int[] iArr = this.f23417d;
        if (iArr == null) {
            return iz.f23328a;
        }
        if (izVar.f23331d != 2) {
            throw new ja(izVar);
        }
        boolean z9 = izVar.f23330c != iArr.length;
        int i9 = 0;
        while (true) {
            int length = iArr.length;
            if (i9 >= length) {
                return z9 ? new iz(izVar.f23329b, length, 2) : iz.f23328a;
            }
            int i10 = iArr[i9];
            if (i10 >= izVar.f23330c) {
                throw new ja(izVar);
            }
            z9 |= i10 != i9;
            i9++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ju
    public final void k() {
        this.f23418e = this.f23417d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ju
    public final void m() {
        this.f23418e = null;
        this.f23417d = null;
    }

    public final void o(int[] iArr) {
        this.f23417d = iArr;
    }
}
