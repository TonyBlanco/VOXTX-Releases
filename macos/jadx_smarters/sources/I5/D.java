package I5;

import j6.InterfaceC2101a;
import j6.InterfaceC2102b;

/* JADX INFO: loaded from: classes3.dex */
public class D implements InterfaceC2102b, InterfaceC2101a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC2101a.InterfaceC0356a f2847c = new InterfaceC2101a.InterfaceC0356a() { // from class: I5.A
        @Override // j6.InterfaceC2101a.InterfaceC0356a
        public final void a(InterfaceC2102b interfaceC2102b) {
            D.f(interfaceC2102b);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterfaceC2102b f2848d = new InterfaceC2102b() { // from class: I5.B
        @Override // j6.InterfaceC2102b
        public final Object get() {
            return D.g();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC2101a.InterfaceC0356a f2849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile InterfaceC2102b f2850b;

    public D(InterfaceC2101a.InterfaceC0356a interfaceC0356a, InterfaceC2102b interfaceC2102b) {
        this.f2849a = interfaceC0356a;
        this.f2850b = interfaceC2102b;
    }

    public static D e() {
        return new D(f2847c, f2848d);
    }

    public static /* synthetic */ void f(InterfaceC2102b interfaceC2102b) {
    }

    public static /* synthetic */ Object g() {
        return null;
    }

    public static /* synthetic */ void h(InterfaceC2101a.InterfaceC0356a interfaceC0356a, InterfaceC2101a.InterfaceC0356a interfaceC0356a2, InterfaceC2102b interfaceC2102b) {
        interfaceC0356a.a(interfaceC2102b);
        interfaceC0356a2.a(interfaceC2102b);
    }

    public static D i(InterfaceC2102b interfaceC2102b) {
        return new D(null, interfaceC2102b);
    }

    @Override // j6.InterfaceC2101a
    public void a(final InterfaceC2101a.InterfaceC0356a interfaceC0356a) {
        InterfaceC2102b interfaceC2102b;
        InterfaceC2102b interfaceC2102b2;
        InterfaceC2102b interfaceC2102b3 = this.f2850b;
        InterfaceC2102b interfaceC2102b4 = f2848d;
        if (interfaceC2102b3 != interfaceC2102b4) {
            interfaceC0356a.a(interfaceC2102b3);
            return;
        }
        synchronized (this) {
            interfaceC2102b = this.f2850b;
            if (interfaceC2102b != interfaceC2102b4) {
                interfaceC2102b2 = interfaceC2102b;
            } else {
                final InterfaceC2101a.InterfaceC0356a interfaceC0356a2 = this.f2849a;
                this.f2849a = new InterfaceC2101a.InterfaceC0356a() { // from class: I5.C
                    @Override // j6.InterfaceC2101a.InterfaceC0356a
                    public final void a(InterfaceC2102b interfaceC2102b5) {
                        D.h(interfaceC0356a2, interfaceC0356a, interfaceC2102b5);
                    }
                };
                interfaceC2102b2 = null;
            }
        }
        if (interfaceC2102b2 != null) {
            interfaceC0356a.a(interfaceC2102b);
        }
    }

    @Override // j6.InterfaceC2102b
    public Object get() {
        return this.f2850b.get();
    }

    public void j(InterfaceC2102b interfaceC2102b) {
        InterfaceC2101a.InterfaceC0356a interfaceC0356a;
        if (this.f2850b != f2848d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC0356a = this.f2849a;
            this.f2849a = null;
            this.f2850b = interfaceC2102b;
        }
        interfaceC0356a.a(interfaceC2102b);
    }
}
