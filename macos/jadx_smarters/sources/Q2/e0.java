package Q2;

import Q2.InterfaceC1027m;
import d4.AbstractC1684a;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends G {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f7803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f7804j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final short f7805k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7806l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7807m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f7808n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f7809o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7810p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7811q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7812r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f7813s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f7814t;

    public e0() {
        this(150000L, 20000L, (short) 1024);
    }

    public e0(long j9, long j10, short s9) {
        AbstractC1684a.a(j10 <= j9);
        this.f7803i = j9;
        this.f7804j = j10;
        this.f7805k = s9;
        byte[] bArr = d4.k0.f39782f;
        this.f7808n = bArr;
        this.f7809o = bArr;
    }

    @Override // Q2.InterfaceC1027m
    public void b(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !f()) {
            int i9 = this.f7810p;
            if (i9 == 0) {
                s(byteBuffer);
            } else if (i9 == 1) {
                r(byteBuffer);
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException();
                }
                t(byteBuffer);
            }
        }
    }

    @Override // Q2.G
    public InterfaceC1027m.a g(InterfaceC1027m.a aVar) throws InterfaceC1027m.b {
        if (aVar.f7889c == 2) {
            return this.f7807m ? aVar : InterfaceC1027m.a.f7886e;
        }
        throw new InterfaceC1027m.b(aVar);
    }

    @Override // Q2.G
    public void h() {
        if (this.f7807m) {
            this.f7806l = this.f7578b.f7890d;
            int iL = l(this.f7803i) * this.f7806l;
            if (this.f7808n.length != iL) {
                this.f7808n = new byte[iL];
            }
            int iL2 = l(this.f7804j) * this.f7806l;
            this.f7812r = iL2;
            if (this.f7809o.length != iL2) {
                this.f7809o = new byte[iL2];
            }
        }
        this.f7810p = 0;
        this.f7814t = 0L;
        this.f7811q = 0;
        this.f7813s = false;
    }

    @Override // Q2.G
    public void i() {
        int i9 = this.f7811q;
        if (i9 > 0) {
            q(this.f7808n, i9);
        }
        if (this.f7813s) {
            return;
        }
        this.f7814t += (long) (this.f7812r / this.f7806l);
    }

    @Override // Q2.G, Q2.InterfaceC1027m
    public boolean isActive() {
        return this.f7807m;
    }

    @Override // Q2.G
    public void j() {
        this.f7807m = false;
        this.f7812r = 0;
        byte[] bArr = d4.k0.f39782f;
        this.f7808n = bArr;
        this.f7809o = bArr;
    }

    public final int l(long j9) {
        return (int) ((j9 * ((long) this.f7578b.f7887a)) / 1000000);
    }

    public final int m(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        do {
            iLimit -= 2;
            if (iLimit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(iLimit)) <= this.f7805k);
        int i9 = this.f7806l;
        return ((iLimit / i9) * i9) + i9;
    }

    public final int n(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f7805k) {
                int i9 = this.f7806l;
                return i9 * (iPosition / i9);
            }
        }
        return byteBuffer.limit();
    }

    public long o() {
        return this.f7814t;
    }

    public final void p(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        k(iRemaining).put(byteBuffer).flip();
        if (iRemaining > 0) {
            this.f7813s = true;
        }
    }

    public final void q(byte[] bArr, int i9) {
        k(i9).put(bArr, 0, i9).flip();
        if (i9 > 0) {
            this.f7813s = true;
        }
    }

    public final void r(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iN = n(byteBuffer);
        int iPosition = iN - byteBuffer.position();
        byte[] bArr = this.f7808n;
        int length = bArr.length;
        int i9 = this.f7811q;
        int i10 = length - i9;
        if (iN < iLimit && iPosition < i10) {
            q(bArr, i9);
            this.f7811q = 0;
            this.f7810p = 0;
            return;
        }
        int iMin = Math.min(iPosition, i10);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f7808n, this.f7811q, iMin);
        int i11 = this.f7811q + iMin;
        this.f7811q = i11;
        byte[] bArr2 = this.f7808n;
        if (i11 == bArr2.length) {
            if (this.f7813s) {
                q(bArr2, this.f7812r);
                this.f7814t += (long) ((this.f7811q - (this.f7812r * 2)) / this.f7806l);
            } else {
                this.f7814t += (long) ((i11 - this.f7812r) / this.f7806l);
            }
            v(byteBuffer, this.f7808n, this.f7811q);
            this.f7811q = 0;
            this.f7810p = 2;
        }
        byteBuffer.limit(iLimit);
    }

    public final void s(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f7808n.length));
        int iM = m(byteBuffer);
        if (iM == byteBuffer.position()) {
            this.f7810p = 1;
        } else {
            byteBuffer.limit(iM);
            p(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    public final void t(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iN = n(byteBuffer);
        byteBuffer.limit(iN);
        this.f7814t += (long) (byteBuffer.remaining() / this.f7806l);
        v(byteBuffer, this.f7809o, this.f7812r);
        if (iN < iLimit) {
            q(this.f7809o, this.f7812r);
            this.f7810p = 0;
            byteBuffer.limit(iLimit);
        }
    }

    public void u(boolean z9) {
        this.f7807m = z9;
    }

    public final void v(ByteBuffer byteBuffer, byte[] bArr, int i9) {
        int iMin = Math.min(byteBuffer.remaining(), this.f7812r);
        int i10 = this.f7812r - iMin;
        System.arraycopy(bArr, i9 - i10, this.f7809o, 0, i10);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f7809o, i10, iMin);
    }
}
