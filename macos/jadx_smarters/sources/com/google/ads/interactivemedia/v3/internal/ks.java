package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class ks extends ju {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f23571h = cq.f22645f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23572i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f23573j;

    @Override // com.google.ads.interactivemedia.v3.internal.ju, com.google.ads.interactivemedia.v3.internal.jb
    public final ByteBuffer b() {
        int i9;
        if (super.h() && (i9 = this.f23572i) > 0) {
            j(i9).put(this.f23571h, 0, this.f23572i).flip();
            this.f23572i = 0;
        }
        return super.b();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jb
    public final void e(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i9 = iLimit - iPosition;
        if (i9 == 0) {
            return;
        }
        int iMin = Math.min(i9, this.f23570g);
        this.f23573j += (long) (iMin / this.f23410b.f23332e);
        this.f23570g -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f23570g > 0) {
            return;
        }
        int i10 = i9 - iMin;
        int length = (this.f23572i + i10) - this.f23571h.length;
        ByteBuffer byteBufferJ = j(length);
        int iD = cq.d(length, 0, this.f23572i);
        byteBufferJ.put(this.f23571h, 0, iD);
        int iD2 = cq.d(length - iD, 0, i10);
        byteBuffer.limit(byteBuffer.position() + iD2);
        byteBufferJ.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i11 = i10 - iD2;
        int i12 = this.f23572i - iD;
        this.f23572i = i12;
        byte[] bArr = this.f23571h;
        System.arraycopy(bArr, iD, bArr, 0, i12);
        byteBuffer.get(this.f23571h, this.f23572i, i11);
        this.f23572i += i11;
        byteBufferJ.flip();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ju, com.google.ads.interactivemedia.v3.internal.jb
    public final boolean h() {
        return super.h() && this.f23572i == 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ju
    public final iz i(iz izVar) throws ja {
        if (izVar.f23331d != 2) {
            throw new ja(izVar);
        }
        this.f23569f = true;
        return (this.f23567d == 0 && this.f23568e == 0) ? iz.f23328a : izVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ju
    public final void k() {
        if (this.f23569f) {
            this.f23569f = false;
            int i9 = this.f23568e;
            int i10 = this.f23410b.f23332e;
            this.f23571h = new byte[i9 * i10];
            this.f23570g = this.f23567d * i10;
        }
        this.f23572i = 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ju
    public final void l() {
        if (this.f23569f) {
            int i9 = this.f23572i;
            if (i9 > 0) {
                this.f23573j += (long) (i9 / this.f23410b.f23332e);
            }
            this.f23572i = 0;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ju
    public final void m() {
        this.f23571h = cq.f22645f;
    }

    public final long o() {
        return this.f23573j;
    }

    public final void p() {
        this.f23573j = 0L;
    }

    public final void q(int i9, int i10) {
        this.f23567d = i9;
        this.f23568e = i10;
    }
}
