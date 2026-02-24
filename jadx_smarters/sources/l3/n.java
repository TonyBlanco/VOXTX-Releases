package L3;

import O2.C0936z0;
import d3.InterfaceC1674k;
import d3.w;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.M;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K3.h f4052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f4053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4054c = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4055d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4056e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4057f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4058g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4061j;

    public n(K3.h hVar) {
        this.f4052a = hVar;
    }

    private void e() {
        w wVar = (w) AbstractC1684a.e(this.f4053b);
        long j9 = this.f4057f;
        boolean z9 = this.f4060i;
        wVar.f(j9, z9 ? 1 : 0, this.f4056e, 0, null);
        this.f4056e = -1;
        this.f4057f = -9223372036854775807L;
        this.f4059h = false;
    }

    @Override // L3.k
    public void a(long j9, long j10) {
        this.f4054c = j9;
        this.f4056e = -1;
        this.f4058g = j10;
    }

    @Override // L3.k
    public void b(long j9, int i9) {
        AbstractC1684a.g(this.f4054c == -9223372036854775807L);
        this.f4054c = j9;
    }

    @Override // L3.k
    public void c(M m9, long j9, int i9, boolean z9) {
        AbstractC1684a.i(this.f4053b);
        if (f(m9, i9)) {
            if (this.f4056e == -1 && this.f4059h) {
                this.f4060i = (m9.j() & 1) == 0;
            }
            if (!this.f4061j) {
                int iF = m9.f();
                m9.U(iF + 6);
                int iZ = m9.z() & 16383;
                int iZ2 = m9.z() & 16383;
                m9.U(iF);
                C0936z0 c0936z0 = this.f4052a.f3742c;
                if (iZ != c0936z0.f6472r || iZ2 != c0936z0.f6473s) {
                    this.f4053b.d(c0936z0.b().n0(iZ).S(iZ2).G());
                }
                this.f4061j = true;
            }
            int iA = m9.a();
            this.f4053b.b(m9, iA);
            int i10 = this.f4056e;
            if (i10 == -1) {
                this.f4056e = iA;
            } else {
                this.f4056e = i10 + iA;
            }
            this.f4057f = m.a(this.f4058g, j9, this.f4054c, 90000);
            if (z9) {
                e();
            }
            this.f4055d = i9;
        }
    }

    @Override // L3.k
    public void d(InterfaceC1674k interfaceC1674k, int i9) {
        w wVarE = interfaceC1674k.e(i9, 2);
        this.f4053b = wVarE;
        wVarE.d(this.f4052a.f3742c);
    }

    public final boolean f(M m9, int i9) {
        String strD;
        int iH = m9.H();
        if ((iH & 16) != 16 || (iH & 7) != 0) {
            if (this.f4059h) {
                int iB = K3.e.b(this.f4055d);
                strD = i9 < iB ? k0.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iB), Integer.valueOf(i9)) : "RTP packet is not the start of a new VP8 partition, skipping.";
            }
            AbstractC1681B.j("RtpVP8Reader", strD);
            return false;
        }
        if (this.f4059h && this.f4056e > 0) {
            e();
        }
        this.f4059h = true;
        if ((iH & 128) != 0) {
            int iH2 = m9.H();
            if ((iH2 & 128) != 0 && (m9.H() & 128) != 0) {
                m9.V(1);
            }
            if ((iH2 & 64) != 0) {
                m9.V(1);
            }
            if ((iH2 & 32) != 0 || (iH2 & 16) != 0) {
                m9.V(1);
            }
        }
        return true;
    }
}
