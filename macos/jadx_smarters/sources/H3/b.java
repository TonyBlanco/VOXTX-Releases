package H3;

import O2.C0936z0;
import d3.InterfaceC1672i;
import d3.InterfaceC1673j;
import d3.InterfaceC1674k;
import d4.AbstractC1684a;
import d4.Z;
import k3.C2143f;
import l3.C2182g;
import n3.C2249b;
import n3.C2252e;
import n3.C2255h;
import n3.H;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d3.t f2416d = new d3.t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1672i f2417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0936z0 f2418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z f2419c;

    public b(InterfaceC1672i interfaceC1672i, C0936z0 c0936z0, Z z9) {
        this.f2417a = interfaceC1672i;
        this.f2418b = c0936z0;
        this.f2419c = z9;
    }

    @Override // H3.k
    public boolean a(InterfaceC1673j interfaceC1673j) {
        return this.f2417a.d(interfaceC1673j, f2416d) == 0;
    }

    @Override // H3.k
    public void b(InterfaceC1674k interfaceC1674k) {
        this.f2417a.b(interfaceC1674k);
    }

    @Override // H3.k
    public void c() {
        this.f2417a.a(0L, 0L);
    }

    @Override // H3.k
    public boolean d() {
        InterfaceC1672i interfaceC1672i = this.f2417a;
        return (interfaceC1672i instanceof H) || (interfaceC1672i instanceof C2182g);
    }

    @Override // H3.k
    public boolean e() {
        InterfaceC1672i interfaceC1672i = this.f2417a;
        return (interfaceC1672i instanceof C2255h) || (interfaceC1672i instanceof C2249b) || (interfaceC1672i instanceof C2252e) || (interfaceC1672i instanceof C2143f);
    }

    @Override // H3.k
    public k f() {
        InterfaceC1672i c2143f;
        AbstractC1684a.g(!d());
        InterfaceC1672i interfaceC1672i = this.f2417a;
        if (interfaceC1672i instanceof u) {
            c2143f = new u(this.f2418b.f6458d, this.f2419c);
        } else if (interfaceC1672i instanceof C2255h) {
            c2143f = new C2255h();
        } else if (interfaceC1672i instanceof C2249b) {
            c2143f = new C2249b();
        } else if (interfaceC1672i instanceof C2252e) {
            c2143f = new C2252e();
        } else {
            if (!(interfaceC1672i instanceof C2143f)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: " + this.f2417a.getClass().getSimpleName());
            }
            c2143f = new C2143f();
        }
        return new b(c2143f, this.f2418b, this.f2419c);
    }
}
