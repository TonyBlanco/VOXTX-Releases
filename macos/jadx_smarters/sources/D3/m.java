package D3;

import D3.g;
import O2.C0936z0;
import b4.C1227s;
import b4.InterfaceC1224o;
import b4.P;
import b4.r;
import d3.C1666c;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g f1423k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g.b f1424l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f1425m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f1426n;

    public m(InterfaceC1224o interfaceC1224o, C1227s c1227s, C0936z0 c0936z0, int i9, Object obj, g gVar) {
        super(interfaceC1224o, c1227s, 2, c0936z0, i9, obj, -9223372036854775807L, -9223372036854775807L);
        this.f1423k = gVar;
    }

    @Override // b4.G.e
    public void a() {
        if (this.f1425m == 0) {
            this.f1423k.d(this.f1424l, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C1227s c1227sE = this.f1377c.e(this.f1425m);
            P p9 = this.f1384j;
            C1666c c1666c = new C1666c(p9, c1227sE.f17604g, p9.a(c1227sE));
            while (!this.f1426n && this.f1423k.a(c1666c)) {
                try {
                } finally {
                    this.f1425m = c1666c.getPosition() - this.f1377c.f17604g;
                }
            }
        } finally {
            r.a(this.f1384j);
        }
    }

    @Override // b4.G.e
    public void c() {
        this.f1426n = true;
    }

    public void g(g.b bVar) {
        this.f1424l = bVar;
    }
}
