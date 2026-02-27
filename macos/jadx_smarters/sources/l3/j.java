package L3;

import O2.C0936z0;
import Q2.d0;
import d3.InterfaceC1674k;
import d3.w;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.M;
import d4.k0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K3.h f4040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f4041b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4043d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4046g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4042c = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4044e = -1;

    public j(K3.h hVar) {
        this.f4040a = hVar;
    }

    public static void e(M m9) {
        int iF = m9.f();
        AbstractC1684a.b(m9.g() > 18, "ID Header has insufficient data");
        AbstractC1684a.b(m9.E(8).equals("OpusHead"), "ID Header missing");
        AbstractC1684a.b(m9.H() == 1, "version number must always be 1");
        m9.U(iF);
    }

    @Override // L3.k
    public void a(long j9, long j10) {
        this.f4042c = j9;
        this.f4043d = j10;
    }

    @Override // L3.k
    public void b(long j9, int i9) {
        this.f4042c = j9;
    }

    @Override // L3.k
    public void c(M m9, long j9, int i9, boolean z9) {
        AbstractC1684a.i(this.f4041b);
        if (!this.f4045f) {
            e(m9);
            List listA = d0.a(m9.e());
            C0936z0.b bVarB = this.f4040a.f3742c.b();
            bVarB.V(listA);
            this.f4041b.d(bVarB.G());
            this.f4045f = true;
        } else if (this.f4046g) {
            int iB = K3.e.b(this.f4044e);
            if (i9 != iB) {
                AbstractC1681B.j("RtpOpusReader", k0.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(iB), Integer.valueOf(i9)));
            }
            int iA = m9.a();
            this.f4041b.b(m9, iA);
            this.f4041b.f(m.a(this.f4043d, j9, this.f4042c, 48000), 1, iA, 0, null);
        } else {
            AbstractC1684a.b(m9.g() >= 8, "Comment Header has insufficient data");
            AbstractC1684a.b(m9.E(8).equals("OpusTags"), "Comment Header should follow ID Header");
            this.f4046g = true;
        }
        this.f4044e = i9;
    }

    @Override // L3.k
    public void d(InterfaceC1674k interfaceC1674k, int i9) {
        w wVarE = interfaceC1674k.e(i9, 1);
        this.f4041b = wVarE;
        wVarE.d(this.f4040a.f3742c);
    }
}
