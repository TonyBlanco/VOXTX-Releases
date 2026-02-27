package C2;

import C2.v;
import K2.C0692g;
import K2.C0693h;
import K2.C0694i;
import K2.C0695j;
import K2.InterfaceC0689d;
import K2.N;
import K2.V;
import android.content.Context;
import j8.InterfaceC2104a;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC2104a f998a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC2104a f999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC2104a f1000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC2104a f1001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC2104a f1002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC2104a f1003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC2104a f1004h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InterfaceC2104a f1005i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InterfaceC2104a f1006j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC2104a f1007k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InterfaceC2104a f1008l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InterfaceC2104a f1009m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InterfaceC2104a f1010n;

    public static final class b implements v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f1011a;

        public b() {
        }

        @Override // C2.v.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.f1011a = (Context) E2.d.b(context);
            return this;
        }

        @Override // C2.v.a
        public v build() {
            E2.d.a(this.f1011a, Context.class);
            return new e(this.f1011a);
        }
    }

    public e(Context context) {
        e(context);
    }

    public static v.a d() {
        return new b();
    }

    @Override // C2.v
    public InterfaceC0689d a() {
        return (InterfaceC0689d) this.f1004h.get();
    }

    @Override // C2.v
    public u c() {
        return (u) this.f1010n.get();
    }

    public final void e(Context context) {
        this.f998a = E2.a.a(k.a());
        E2.b bVarA = E2.c.a(context);
        this.f999c = bVarA;
        D2.j jVarA = D2.j.a(bVarA, M2.c.a(), M2.d.a());
        this.f1000d = jVarA;
        this.f1001e = E2.a.a(D2.l.a(this.f999c, jVarA));
        this.f1002f = V.a(this.f999c, C0692g.a(), C0694i.a());
        this.f1003g = E2.a.a(C0693h.a(this.f999c));
        this.f1004h = E2.a.a(N.a(M2.c.a(), M2.d.a(), C0695j.a(), this.f1002f, this.f1003g));
        I2.g gVarB = I2.g.b(M2.c.a());
        this.f1005i = gVarB;
        I2.i iVarA = I2.i.a(this.f999c, this.f1004h, gVarB, M2.d.a());
        this.f1006j = iVarA;
        InterfaceC2104a interfaceC2104a = this.f998a;
        InterfaceC2104a interfaceC2104a2 = this.f1001e;
        InterfaceC2104a interfaceC2104a3 = this.f1004h;
        this.f1007k = I2.d.a(interfaceC2104a, interfaceC2104a2, iVarA, interfaceC2104a3, interfaceC2104a3);
        InterfaceC2104a interfaceC2104a4 = this.f999c;
        InterfaceC2104a interfaceC2104a5 = this.f1001e;
        InterfaceC2104a interfaceC2104a6 = this.f1004h;
        this.f1008l = J2.s.a(interfaceC2104a4, interfaceC2104a5, interfaceC2104a6, this.f1006j, this.f998a, interfaceC2104a6, M2.c.a(), M2.d.a(), this.f1004h);
        InterfaceC2104a interfaceC2104a7 = this.f998a;
        InterfaceC2104a interfaceC2104a8 = this.f1004h;
        this.f1009m = J2.w.a(interfaceC2104a7, interfaceC2104a8, this.f1006j, interfaceC2104a8);
        this.f1010n = E2.a.a(w.a(M2.c.a(), M2.d.a(), this.f1007k, this.f1008l, this.f1009m));
    }
}
