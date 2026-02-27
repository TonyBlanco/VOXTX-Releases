package L3;

import d3.InterfaceC1674k;
import d3.w;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.M;
import d4.k0;
import w5.AbstractC2930b;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K3.h f4033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f4034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4036d = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4037e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4039g;

    public i(K3.h hVar) {
        this.f4033a = hVar;
    }

    public static int e(M m9) {
        int iA = AbstractC2930b.a(m9.e(), new byte[]{0, 0, 1, -74});
        if (iA == -1) {
            return 0;
        }
        m9.U(iA + 4);
        return (m9.j() >> 6) == 0 ? 1 : 0;
    }

    @Override // L3.k
    public void a(long j9, long j10) {
        this.f4036d = j9;
        this.f4038f = j10;
        this.f4039g = 0;
    }

    @Override // L3.k
    public void b(long j9, int i9) {
    }

    @Override // L3.k
    public void c(M m9, long j9, int i9, boolean z9) {
        int iB;
        AbstractC1684a.i(this.f4034b);
        int i10 = this.f4037e;
        if (i10 != -1 && i9 != (iB = K3.e.b(i10))) {
            AbstractC1681B.j("RtpMpeg4Reader", k0.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iB), Integer.valueOf(i9)));
        }
        int iA = m9.a();
        this.f4034b.b(m9, iA);
        if (this.f4039g == 0) {
            this.f4035c = e(m9);
        }
        this.f4039g += iA;
        if (z9) {
            if (this.f4036d == -9223372036854775807L) {
                this.f4036d = j9;
            }
            this.f4034b.f(m.a(this.f4038f, j9, this.f4036d, 90000), this.f4035c, this.f4039g, 0, null);
            this.f4039g = 0;
        }
        this.f4037e = i9;
    }

    @Override // L3.k
    public void d(InterfaceC1674k interfaceC1674k, int i9) {
        w wVarE = interfaceC1674k.e(i9, 2);
        this.f4034b = wVarE;
        ((w) k0.j(wVarE)).d(this.f4033a.f3742c);
    }
}
