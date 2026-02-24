package D3;

import D3.g;
import O2.C0936z0;
import b4.C1227s;
import b4.InterfaceC1224o;
import b4.P;
import b4.r;
import d3.C1666c;

/* JADX INFO: loaded from: classes3.dex */
public class k extends a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f1415p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f1416q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f1417r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f1418s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f1419t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1420u;

    public k(InterfaceC1224o interfaceC1224o, C1227s c1227s, C0936z0 c0936z0, int i9, Object obj, long j9, long j10, long j11, long j12, long j13, int i10, long j14, g gVar) {
        super(interfaceC1224o, c1227s, c0936z0, i9, obj, j9, j10, j11, j12, j13);
        this.f1415p = i10;
        this.f1416q = j14;
        this.f1417r = gVar;
    }

    @Override // b4.G.e
    public final void a() {
        if (this.f1418s == 0) {
            c cVarJ = j();
            cVarJ.b(this.f1416q);
            g gVar = this.f1417r;
            g.b bVarL = l(cVarJ);
            long j9 = this.f1349l;
            long j10 = j9 == -9223372036854775807L ? -9223372036854775807L : j9 - this.f1416q;
            long j11 = this.f1350m;
            gVar.d(bVarL, j10, j11 == -9223372036854775807L ? -9223372036854775807L : j11 - this.f1416q);
        }
        try {
            C1227s c1227sE = this.f1377c.e(this.f1418s);
            P p9 = this.f1384j;
            C1666c c1666c = new C1666c(p9, c1227sE.f17604g, p9.a(c1227sE));
            do {
                try {
                    if (this.f1419t) {
                        break;
                    }
                } finally {
                    this.f1418s = c1666c.getPosition() - this.f1377c.f17604g;
                }
            } while (this.f1417r.a(c1666c));
            r.a(this.f1384j);
            this.f1420u = !this.f1419t;
        } catch (Throwable th) {
            r.a(this.f1384j);
            throw th;
        }
    }

    @Override // b4.G.e
    public final void c() {
        this.f1419t = true;
    }

    @Override // D3.n
    public long g() {
        return this.f1427k + ((long) this.f1415p);
    }

    @Override // D3.n
    public boolean h() {
        return this.f1420u;
    }

    public g.b l(c cVar) {
        return cVar;
    }
}
