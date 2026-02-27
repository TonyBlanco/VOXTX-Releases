package B3;

import B3.C;
import O2.C0936z0;
import O2.H0;
import O2.Q1;
import android.net.Uri;
import b4.C1208A;
import b4.C1227s;
import b4.InterfaceC1211b;
import b4.InterfaceC1224o;
import d4.AbstractC1684a;
import r5.AbstractC2679h;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends AbstractC0493a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1227s f533i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC1224o.a f534j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0936z0 f535k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f536l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b4.F f537m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f538n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Q1 f539o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final H0 f540p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b4.S f541q;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1224o.a f542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b4.F f543b = new C1208A();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f544c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f545d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f546e;

        public b(InterfaceC1224o.a aVar) {
            this.f542a = (InterfaceC1224o.a) AbstractC1684a.e(aVar);
        }

        public d0 a(H0.k kVar, long j9) {
            return new d0(this.f546e, kVar, this.f542a, j9, this.f543b, this.f544c, this.f545d);
        }

        public b b(b4.F f9) {
            if (f9 == null) {
                f9 = new C1208A();
            }
            this.f543b = f9;
            return this;
        }
    }

    public d0(String str, H0.k kVar, InterfaceC1224o.a aVar, long j9, b4.F f9, boolean z9, Object obj) {
        this.f534j = aVar;
        this.f536l = j9;
        this.f537m = f9;
        this.f538n = z9;
        H0 h0A = new H0.c().m(Uri.EMPTY).g(kVar.f5653a.toString()).k(AbstractC2743y.A(kVar)).l(obj).a();
        this.f540p = h0A;
        C0936z0.b bVarW = new C0936z0.b().g0((String) AbstractC2679h.a(kVar.f5654c, "text/x-unknown")).X(kVar.f5655d).i0(kVar.f5656e).e0(kVar.f5657f).W(kVar.f5658g);
        String str2 = kVar.f5659h;
        this.f535k = bVarW.U(str2 == null ? str : str2).G();
        this.f533i = new C1227s.b().i(kVar.f5653a).b(1).a();
        this.f539o = new b0(j9, true, false, false, null, h0A);
    }

    @Override // B3.C
    public InterfaceC0517z E(C.b bVar, InterfaceC1211b interfaceC1211b, long j9) {
        return new c0(this.f533i, this.f534j, this.f541q, this.f535k, this.f536l, this.f537m, f0(bVar), this.f538n);
    }

    @Override // B3.C
    public void P() {
    }

    @Override // B3.C
    public void Y(InterfaceC0517z interfaceC0517z) {
        ((c0) interfaceC0517z).q();
    }

    @Override // B3.C
    public H0 e() {
        return this.f540p;
    }

    @Override // B3.AbstractC0493a
    public void l0(b4.S s9) {
        this.f541q = s9;
        m0(this.f539o);
    }

    @Override // B3.AbstractC0493a
    public void n0() {
    }
}
