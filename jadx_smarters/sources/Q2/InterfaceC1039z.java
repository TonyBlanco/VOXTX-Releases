package Q2;

import O2.C0936z0;
import android.os.Handler;
import d4.AbstractC1684a;

/* JADX INFO: renamed from: Q2.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1039z {

    /* JADX INFO: renamed from: Q2.z$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f7916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC1039z f7917b;

        public a(Handler handler, InterfaceC1039z interfaceC1039z) {
            this.f7916a = interfaceC1039z != null ? (Handler) AbstractC1684a.e(handler) : null;
            this.f7917b = interfaceC1039z;
        }

        public final /* synthetic */ void A(int i9, long j9, long j10) {
            ((InterfaceC1039z) d4.k0.j(this.f7917b)).x(i9, j9, j10);
        }

        public void B(final long j9) {
            Handler handler = this.f7916a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: Q2.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7899a.y(j9);
                    }
                });
            }
        }

        public void C(final boolean z9) {
            Handler handler = this.f7916a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: Q2.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7914a.z(z9);
                    }
                });
            }
        }

        public void D(final int i9, final long j9, final long j10) {
            Handler handler = this.f7916a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: Q2.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7910a.A(i9, j9, j10);
                    }
                });
            }
        }

        public void k(final Exception exc) {
            Handler handler = this.f7916a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: Q2.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7897a.r(exc);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Handler handler = this.f7916a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: Q2.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7908a.s(exc);
                    }
                });
            }
        }

        public void m(final String str, final long j9, final long j10) {
            Handler handler = this.f7916a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: Q2.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7893a.t(str, j9, j10);
                    }
                });
            }
        }

        public void n(final String str) {
            Handler handler = this.f7916a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: Q2.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7891a.u(str);
                    }
                });
            }
        }

        public void o(final U2.e eVar) {
            eVar.c();
            Handler handler = this.f7916a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: Q2.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7903a.v(eVar);
                    }
                });
            }
        }

        public void p(final U2.e eVar) {
            Handler handler = this.f7916a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: Q2.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7901a.w(eVar);
                    }
                });
            }
        }

        public void q(final C0936z0 c0936z0, final U2.h hVar) {
            Handler handler = this.f7916a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: Q2.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7905a.x(c0936z0, hVar);
                    }
                });
            }
        }

        public final /* synthetic */ void r(Exception exc) {
            ((InterfaceC1039z) d4.k0.j(this.f7917b)).w(exc);
        }

        public final /* synthetic */ void s(Exception exc) {
            ((InterfaceC1039z) d4.k0.j(this.f7917b)).b(exc);
        }

        public final /* synthetic */ void t(String str, long j9, long j10) {
            ((InterfaceC1039z) d4.k0.j(this.f7917b)).g(str, j9, j10);
        }

        public final /* synthetic */ void u(String str) {
            ((InterfaceC1039z) d4.k0.j(this.f7917b)).f(str);
        }

        public final /* synthetic */ void v(U2.e eVar) {
            eVar.c();
            ((InterfaceC1039z) d4.k0.j(this.f7917b)).n(eVar);
        }

        public final /* synthetic */ void w(U2.e eVar) {
            ((InterfaceC1039z) d4.k0.j(this.f7917b)).i(eVar);
        }

        public final /* synthetic */ void x(C0936z0 c0936z0, U2.h hVar) {
            ((InterfaceC1039z) d4.k0.j(this.f7917b)).C(c0936z0);
            ((InterfaceC1039z) d4.k0.j(this.f7917b)).r(c0936z0, hVar);
        }

        public final /* synthetic */ void y(long j9) {
            ((InterfaceC1039z) d4.k0.j(this.f7917b)).l(j9);
        }

        public final /* synthetic */ void z(boolean z9) {
            ((InterfaceC1039z) d4.k0.j(this.f7917b)).a(z9);
        }
    }

    void C(C0936z0 c0936z0);

    void a(boolean z9);

    void b(Exception exc);

    void f(String str);

    void g(String str, long j9, long j10);

    void i(U2.e eVar);

    void l(long j9);

    void n(U2.e eVar);

    void r(C0936z0 c0936z0, U2.h hVar);

    void w(Exception exc);

    void x(int i9, long j9, long j10);
}
