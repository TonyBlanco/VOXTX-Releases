package L3;

import O2.C0897l1;
import d3.InterfaceC1674k;
import d3.w;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.G;
import d4.M;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K3.h f4009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f4010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4011e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f4015i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f4008b = new M(G.f39651a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f4007a = new M();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4012f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4013g = -1;

    public f(K3.h hVar) {
        this.f4009c = hVar;
    }

    public static int e(int i9) {
        return i9 == 5 ? 1 : 0;
    }

    @Override // L3.k
    public void a(long j9, long j10) {
        this.f4012f = j9;
        this.f4014h = 0;
        this.f4015i = j10;
    }

    @Override // L3.k
    public void b(long j9, int i9) {
    }

    @Override // L3.k
    public void c(M m9, long j9, int i9, boolean z9) throws C0897l1 {
        try {
            int i10 = m9.e()[0] & 31;
            AbstractC1684a.i(this.f4010d);
            if (i10 > 0 && i10 < 24) {
                g(m9);
            } else if (i10 == 24) {
                h(m9);
            } else {
                if (i10 != 28) {
                    throw C0897l1.c(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i10)), null);
                }
                f(m9, i9);
            }
            if (z9) {
                if (this.f4012f == -9223372036854775807L) {
                    this.f4012f = j9;
                }
                this.f4010d.f(m.a(this.f4015i, j9, this.f4012f, 90000), this.f4011e, this.f4014h, 0, null);
                this.f4014h = 0;
            }
            this.f4013g = i9;
        } catch (IndexOutOfBoundsException e9) {
            throw C0897l1.c(null, e9);
        }
    }

    @Override // L3.k
    public void d(InterfaceC1674k interfaceC1674k, int i9) {
        w wVarE = interfaceC1674k.e(i9, 2);
        this.f4010d = wVarE;
        ((w) k0.j(wVarE)).d(this.f4009c.f3742c);
    }

    public final void f(M m9, int i9) {
        byte b9 = m9.e()[0];
        byte b10 = m9.e()[1];
        int i10 = (b9 & 224) | (b10 & 31);
        boolean z9 = (b10 & 128) > 0;
        boolean z10 = (b10 & 64) > 0;
        if (z9) {
            this.f4014h += i();
            m9.e()[1] = (byte) i10;
            this.f4007a.R(m9.e());
            this.f4007a.U(1);
        } else {
            int iB = K3.e.b(this.f4013g);
            if (i9 != iB) {
                AbstractC1681B.j("RtpH264Reader", k0.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iB), Integer.valueOf(i9)));
                return;
            } else {
                this.f4007a.R(m9.e());
                this.f4007a.U(2);
            }
        }
        int iA = this.f4007a.a();
        this.f4010d.b(this.f4007a, iA);
        this.f4014h += iA;
        if (z10) {
            this.f4011e = e(i10 & 31);
        }
    }

    public final void g(M m9) {
        int iA = m9.a();
        this.f4014h += i();
        this.f4010d.b(m9, iA);
        this.f4014h += iA;
        this.f4011e = e(m9.e()[0] & 31);
    }

    public final void h(M m9) {
        m9.H();
        while (m9.a() > 4) {
            int iN = m9.N();
            this.f4014h += i();
            this.f4010d.b(m9, iN);
            this.f4014h += iN;
        }
        this.f4011e = 0;
    }

    public final int i() {
        this.f4008b.U(0);
        int iA = this.f4008b.a();
        ((w) AbstractC1684a.e(this.f4010d)).b(this.f4008b, iA);
        return iA;
    }
}
