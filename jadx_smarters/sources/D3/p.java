package D3;

import O2.C0936z0;
import b4.C1227s;
import b4.InterfaceC1224o;
import b4.r;
import com.google.android.gms.common.api.a;
import d3.C1666c;
import d3.w;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f1429p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0936z0 f1430q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f1431r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1432s;

    public p(InterfaceC1224o interfaceC1224o, C1227s c1227s, C0936z0 c0936z0, int i9, Object obj, long j9, long j10, long j11, int i10, C0936z0 c0936z02) {
        super(interfaceC1224o, c1227s, c0936z0, i9, obj, j9, j10, -9223372036854775807L, -9223372036854775807L, j11);
        this.f1429p = i10;
        this.f1430q = c0936z02;
    }

    @Override // b4.G.e
    public void a() {
        c cVarJ = j();
        cVarJ.b(0L);
        w wVarE = cVarJ.e(0, this.f1429p);
        wVarE.d(this.f1430q);
        try {
            long jA = this.f1384j.a(this.f1377c.e(this.f1431r));
            if (jA != -1) {
                jA += this.f1431r;
            }
            C1666c c1666c = new C1666c(this.f1384j, this.f1431r, jA);
            for (int iA = 0; iA != -1; iA = wVarE.a(c1666c, a.e.API_PRIORITY_OTHER, true)) {
                this.f1431r += (long) iA;
            }
            wVarE.f(this.f1382h, 1, (int) this.f1431r, 0, null);
            r.a(this.f1384j);
            this.f1432s = true;
        } catch (Throwable th) {
            r.a(this.f1384j);
            throw th;
        }
    }

    @Override // b4.G.e
    public void c() {
    }

    @Override // D3.n
    public boolean h() {
        return this.f1432s;
    }
}
