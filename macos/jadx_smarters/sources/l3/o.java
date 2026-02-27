package L3;

import O2.C0936z0;
import d3.InterfaceC1674k;
import d3.w;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.M;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K3.h f4062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f4063b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4071j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4072k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4073l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4064c = -9223372036854775807L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4067f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4068g = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4065d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4066e = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4069h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4070i = -1;

    public o(K3.h hVar) {
        this.f4062a = hVar;
    }

    private void e() {
        w wVar = (w) AbstractC1684a.e(this.f4063b);
        long j9 = this.f4068g;
        boolean z9 = this.f4073l;
        wVar.f(j9, z9 ? 1 : 0, this.f4067f, 0, null);
        this.f4067f = -1;
        this.f4068g = -9223372036854775807L;
        this.f4071j = false;
    }

    @Override // L3.k
    public void a(long j9, long j10) {
        this.f4064c = j9;
        this.f4067f = -1;
        this.f4065d = j10;
    }

    @Override // L3.k
    public void b(long j9, int i9) {
        AbstractC1684a.g(this.f4064c == -9223372036854775807L);
        this.f4064c = j9;
    }

    @Override // L3.k
    public void c(M m9, long j9, int i9, boolean z9) {
        int i10;
        int i11;
        AbstractC1684a.i(this.f4063b);
        if (f(m9, i9)) {
            if (this.f4067f == -1 && this.f4071j) {
                this.f4073l = (m9.j() & 4) == 0;
            }
            if (!this.f4072k && (i10 = this.f4069h) != -1 && (i11 = this.f4070i) != -1) {
                C0936z0 c0936z0 = this.f4062a.f3742c;
                if (i10 != c0936z0.f6472r || i11 != c0936z0.f6473s) {
                    this.f4063b.d(c0936z0.b().n0(this.f4069h).S(this.f4070i).G());
                }
                this.f4072k = true;
            }
            int iA = m9.a();
            this.f4063b.b(m9, iA);
            int i12 = this.f4067f;
            if (i12 == -1) {
                this.f4067f = iA;
            } else {
                this.f4067f = i12 + iA;
            }
            this.f4068g = m.a(this.f4065d, j9, this.f4064c, 90000);
            if (z9) {
                e();
            }
            this.f4066e = i9;
        }
    }

    @Override // L3.k
    public void d(InterfaceC1674k interfaceC1674k, int i9) {
        w wVarE = interfaceC1674k.e(i9, 2);
        this.f4063b = wVarE;
        wVarE.d(this.f4062a.f3742c);
    }

    public final boolean f(M m9, int i9) {
        String strD;
        int iH = m9.H();
        if ((iH & 8) != 8) {
            if (this.f4071j) {
                int iB = K3.e.b(this.f4066e);
                strD = i9 < iB ? k0.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iB), Integer.valueOf(i9)) : "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.";
            }
            AbstractC1681B.j("RtpVp9Reader", strD);
            return false;
        }
        if (this.f4071j && this.f4067f > 0) {
            e();
        }
        this.f4071j = true;
        if ((iH & 128) != 0 && (m9.H() & 128) != 0 && m9.a() < 1) {
            return false;
        }
        int i10 = iH & 16;
        AbstractC1684a.b(i10 == 0, "VP9 flexible mode is not supported.");
        if ((iH & 32) != 0) {
            m9.V(1);
            if (m9.a() < 1) {
                return false;
            }
            if (i10 == 0) {
                m9.V(1);
            }
        }
        if ((iH & 2) != 0) {
            int iH2 = m9.H();
            int i11 = (iH2 >> 5) & 7;
            if ((iH2 & 16) != 0) {
                int i12 = i11 + 1;
                if (m9.a() < i12 * 4) {
                    return false;
                }
                for (int i13 = 0; i13 < i12; i13++) {
                    this.f4069h = m9.N();
                    this.f4070i = m9.N();
                }
            }
            if ((iH2 & 8) != 0) {
                int iH3 = m9.H();
                if (m9.a() < iH3) {
                    return false;
                }
                for (int i14 = 0; i14 < iH3; i14++) {
                    int iN = (m9.N() & 12) >> 2;
                    if (m9.a() < iN) {
                        return false;
                    }
                    m9.V(iN);
                }
            }
        }
        return true;
    }
}
