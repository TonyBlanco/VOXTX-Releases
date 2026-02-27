package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class kp extends ju {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f23523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f23524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23526i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f23527j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f23528k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f23529l;

    public kp() {
        af.u(true);
        byte[] bArr = cq.f22645f;
        this.f23523f = bArr;
        this.f23524g = bArr;
    }

    private final int q(long j9) {
        return (int) ((j9 * ((long) this.f23410b.f23329b)) / 1000000);
    }

    private final int r(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > 1024) {
                int i9 = this.f23521d;
                return i9 * (iPosition / i9);
            }
        }
        return byteBuffer.limit();
    }

    private final void s(byte[] bArr, int i9) {
        j(i9).put(bArr, 0, i9).flip();
        if (i9 > 0) {
            this.f23528k = true;
        }
    }

    private final void t(ByteBuffer byteBuffer, byte[] bArr, int i9) {
        int iMin = Math.min(byteBuffer.remaining(), this.f23527j);
        int i10 = this.f23527j - iMin;
        System.arraycopy(bArr, i9 - i10, this.f23524g, 0, i10);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f23524g, i10, iMin);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jb
    public final void e(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !n()) {
            int i9 = this.f23525h;
            int i10 = 1;
            if (i9 == 0) {
                iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f23523f.length));
                int iLimit2 = byteBuffer.limit();
                while (true) {
                    iLimit2 -= 2;
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.getShort(iLimit2)) > 1024) {
                        int i11 = this.f23521d;
                        iPosition = ((iLimit2 / i11) * i11) + i11;
                        break;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f23525h = i10;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    j(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f23528k = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i9 != 1) {
                iLimit = byteBuffer.limit();
                int iR = r(byteBuffer);
                byteBuffer.limit(iR);
                this.f23529l += (long) (byteBuffer.remaining() / this.f23521d);
                t(byteBuffer, this.f23524g, this.f23527j);
                if (iR < iLimit) {
                    s(this.f23524g, this.f23527j);
                    this.f23525h = 0;
                    byteBuffer.limit(iLimit);
                }
            } else {
                iLimit = byteBuffer.limit();
                int iR2 = r(byteBuffer);
                int iPosition2 = iR2 - byteBuffer.position();
                byte[] bArr = this.f23523f;
                int length = bArr.length;
                int i12 = this.f23526i;
                int i13 = length - i12;
                if (iR2 >= iLimit || iPosition2 >= i13) {
                    int iMin = Math.min(iPosition2, i13);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f23523f, this.f23526i, iMin);
                    int i14 = this.f23526i + iMin;
                    this.f23526i = i14;
                    byte[] bArr2 = this.f23523f;
                    if (i14 == bArr2.length) {
                        if (this.f23528k) {
                            s(bArr2, this.f23527j);
                            long j9 = this.f23529l;
                            int i15 = this.f23526i;
                            int i16 = this.f23527j;
                            this.f23529l = j9 + ((long) ((i15 - (i16 + i16)) / this.f23521d));
                            i14 = i15;
                        } else {
                            this.f23529l += (long) ((i14 - this.f23527j) / this.f23521d);
                        }
                        t(byteBuffer, this.f23523f, i14);
                        this.f23526i = 0;
                        i10 = 2;
                        this.f23525h = i10;
                    }
                    byteBuffer.limit(iLimit);
                } else {
                    s(bArr, i12);
                    this.f23526i = 0;
                    this.f23525h = 0;
                }
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ju, com.google.ads.interactivemedia.v3.internal.jb
    public final boolean g() {
        return this.f23522e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ju
    public final iz i(iz izVar) throws ja {
        if (izVar.f23331d == 2) {
            return this.f23522e ? izVar : iz.f23328a;
        }
        throw new ja(izVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ju
    public final void k() {
        if (this.f23522e) {
            this.f23521d = this.f23410b.f23332e;
            int iQ = q(150000L) * this.f23521d;
            if (this.f23523f.length != iQ) {
                this.f23523f = new byte[iQ];
            }
            int iQ2 = q(20000L) * this.f23521d;
            this.f23527j = iQ2;
            if (this.f23524g.length != iQ2) {
                this.f23524g = new byte[iQ2];
            }
        }
        this.f23525h = 0;
        this.f23529l = 0L;
        this.f23526i = 0;
        this.f23528k = false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ju
    public final void l() {
        int i9 = this.f23526i;
        if (i9 > 0) {
            s(this.f23523f, i9);
        }
        if (this.f23528k) {
            return;
        }
        this.f23529l += (long) (this.f23527j / this.f23521d);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ju
    public final void m() {
        this.f23522e = false;
        this.f23527j = 0;
        byte[] bArr = cq.f22645f;
        this.f23523f = bArr;
        this.f23524g = bArr;
    }

    public final long o() {
        return this.f23529l;
    }

    public final void p(boolean z9) {
        this.f23522e = z9;
    }
}
