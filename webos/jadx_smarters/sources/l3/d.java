package L3;

import d3.InterfaceC1674k;
import d3.w;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.M;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f3986h = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f3987i = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K3.h f3988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f3991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3992e = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3994g = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f3993f = 0;

    public d(K3.h hVar) {
        this.f3988a = hVar;
        this.f3989b = "audio/amr-wb".equals(AbstractC1684a.e(hVar.f3742c.f6467m));
        this.f3990c = hVar.f3741b;
    }

    public static int e(int i9, boolean z9) {
        boolean z10 = (i9 >= 0 && i9 <= 8) || i9 == 15;
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(z9 ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i9);
        AbstractC1684a.b(z10, sb.toString());
        return z9 ? f3987i[i9] : f3986h[i9];
    }

    @Override // L3.k
    public void a(long j9, long j10) {
        this.f3992e = j9;
        this.f3993f = j10;
    }

    @Override // L3.k
    public void b(long j9, int i9) {
        this.f3992e = j9;
    }

    @Override // L3.k
    public void c(M m9, long j9, int i9, boolean z9) {
        int iB;
        AbstractC1684a.i(this.f3991d);
        int i10 = this.f3994g;
        if (i10 != -1 && i9 != (iB = K3.e.b(i10))) {
            AbstractC1681B.j("RtpAmrReader", k0.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(iB), Integer.valueOf(i9)));
        }
        m9.V(1);
        int iE = e((m9.j() >> 3) & 15, this.f3989b);
        int iA = m9.a();
        AbstractC1684a.b(iA == iE, "compound payload not supported currently");
        this.f3991d.b(m9, iA);
        this.f3991d.f(m.a(this.f3993f, j9, this.f3992e, this.f3990c), 1, iA, 0, null);
        this.f3994g = i9;
    }

    @Override // L3.k
    public void d(InterfaceC1674k interfaceC1674k, int i9) {
        w wVarE = interfaceC1674k.e(i9, 1);
        this.f3991d = wVarE;
        wVarE.d(this.f3988a.f3742c);
    }
}
