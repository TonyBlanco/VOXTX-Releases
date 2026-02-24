package V2;

import B3.C;
import android.os.Handler;
import d4.AbstractC1684a;
import d4.k0;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: V2.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1065w {

    /* JADX INFO: renamed from: V2.w$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C.b f10031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList f10032c;

        /* JADX INFO: renamed from: V2.w$a$a, reason: collision with other inner class name */
        public static final class C0128a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f10033a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public InterfaceC1065w f10034b;

            public C0128a(Handler handler, InterfaceC1065w interfaceC1065w) {
                this.f10033a = handler;
                this.f10034b = interfaceC1065w;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public a(CopyOnWriteArrayList copyOnWriteArrayList, int i9, C.b bVar) {
            this.f10032c = copyOnWriteArrayList;
            this.f10030a = i9;
            this.f10031b = bVar;
        }

        public void g(Handler handler, InterfaceC1065w interfaceC1065w) {
            AbstractC1684a.e(handler);
            AbstractC1684a.e(interfaceC1065w);
            this.f10032c.add(new C0128a(handler, interfaceC1065w));
        }

        public void h() {
            for (C0128a c0128a : this.f10032c) {
                final InterfaceC1065w interfaceC1065w = c0128a.f10034b;
                k0.Y0(c0128a.f10033a, new Runnable() { // from class: V2.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10028a.n(interfaceC1065w);
                    }
                });
            }
        }

        public void i() {
            for (C0128a c0128a : this.f10032c) {
                final InterfaceC1065w interfaceC1065w = c0128a.f10034b;
                k0.Y0(c0128a.f10033a, new Runnable() { // from class: V2.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10024a.o(interfaceC1065w);
                    }
                });
            }
        }

        public void j() {
            for (C0128a c0128a : this.f10032c) {
                final InterfaceC1065w interfaceC1065w = c0128a.f10034b;
                k0.Y0(c0128a.f10033a, new Runnable() { // from class: V2.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10026a.p(interfaceC1065w);
                    }
                });
            }
        }

        public void k(final int i9) {
            for (C0128a c0128a : this.f10032c) {
                final InterfaceC1065w interfaceC1065w = c0128a.f10034b;
                k0.Y0(c0128a.f10033a, new Runnable() { // from class: V2.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10021a.q(interfaceC1065w, i9);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            for (C0128a c0128a : this.f10032c) {
                final InterfaceC1065w interfaceC1065w = c0128a.f10034b;
                k0.Y0(c0128a.f10033a, new Runnable() { // from class: V2.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10016a.r(interfaceC1065w, exc);
                    }
                });
            }
        }

        public void m() {
            for (C0128a c0128a : this.f10032c) {
                final InterfaceC1065w interfaceC1065w = c0128a.f10034b;
                k0.Y0(c0128a.f10033a, new Runnable() { // from class: V2.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10019a.s(interfaceC1065w);
                    }
                });
            }
        }

        public final /* synthetic */ void n(InterfaceC1065w interfaceC1065w) {
            interfaceC1065w.T(this.f10030a, this.f10031b);
        }

        public final /* synthetic */ void o(InterfaceC1065w interfaceC1065w) {
            interfaceC1065w.G(this.f10030a, this.f10031b);
        }

        public final /* synthetic */ void p(InterfaceC1065w interfaceC1065w) {
            interfaceC1065w.C(this.f10030a, this.f10031b);
        }

        public final /* synthetic */ void q(InterfaceC1065w interfaceC1065w, int i9) {
            interfaceC1065w.K(this.f10030a, this.f10031b);
            interfaceC1065w.N(this.f10030a, this.f10031b, i9);
        }

        public final /* synthetic */ void r(InterfaceC1065w interfaceC1065w, Exception exc) {
            interfaceC1065w.Q(this.f10030a, this.f10031b, exc);
        }

        public final /* synthetic */ void s(InterfaceC1065w interfaceC1065w) {
            interfaceC1065w.c0(this.f10030a, this.f10031b);
        }

        public void t(InterfaceC1065w interfaceC1065w) {
            for (C0128a c0128a : this.f10032c) {
                if (c0128a.f10034b == interfaceC1065w) {
                    this.f10032c.remove(c0128a);
                }
            }
        }

        public a u(int i9, C.b bVar) {
            return new a(this.f10032c, i9, bVar);
        }
    }

    void C(int i9, C.b bVar);

    void G(int i9, C.b bVar);

    void K(int i9, C.b bVar);

    void N(int i9, C.b bVar, int i10);

    void Q(int i9, C.b bVar, Exception exc);

    void T(int i9, C.b bVar);

    void c0(int i9, C.b bVar);
}
