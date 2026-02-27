package e4;

import O2.C0936z0;
import android.os.Handler;
import android.os.SystemClock;
import d4.AbstractC1684a;
import d4.k0;

/* JADX INFO: renamed from: e4.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1735A {

    /* JADX INFO: renamed from: e4.A$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f40170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC1735A f40171b;

        public a(Handler handler, InterfaceC1735A interfaceC1735A) {
            this.f40170a = interfaceC1735A != null ? (Handler) AbstractC1684a.e(handler) : null;
            this.f40171b = interfaceC1735A;
        }

        public void A(final Object obj) {
            if (this.f40170a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f40170a.post(new Runnable() { // from class: e4.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f40394a.w(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void B(final long j9, final int i9) {
            Handler handler = this.f40170a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: e4.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f40412a.x(j9, i9);
                    }
                });
            }
        }

        public void C(final Exception exc) {
            Handler handler = this.f40170a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: e4.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f40401a.y(exc);
                    }
                });
            }
        }

        public void D(final C1737C c1737c) {
            Handler handler = this.f40170a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: e4.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f40389a.z(c1737c);
                    }
                });
            }
        }

        public void k(final String str, final long j9, final long j10) {
            Handler handler = this.f40170a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: e4.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f40403a.q(str, j9, j10);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f40170a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: e4.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f40397a.r(str);
                    }
                });
            }
        }

        public void m(final U2.e eVar) {
            eVar.c();
            Handler handler = this.f40170a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: e4.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f40399a.s(eVar);
                    }
                });
            }
        }

        public void n(final int i9, final long j9) {
            Handler handler = this.f40170a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: e4.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f40391a.t(i9, j9);
                    }
                });
            }
        }

        public void o(final U2.e eVar) {
            Handler handler = this.f40170a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: e4.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f40407a.u(eVar);
                    }
                });
            }
        }

        public void p(final C0936z0 c0936z0, final U2.h hVar) {
            Handler handler = this.f40170a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: e4.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f40409a.v(c0936z0, hVar);
                    }
                });
            }
        }

        public final /* synthetic */ void q(String str, long j9, long j10) {
            ((InterfaceC1735A) k0.j(this.f40171b)).d(str, j9, j10);
        }

        public final /* synthetic */ void r(String str) {
            ((InterfaceC1735A) k0.j(this.f40171b)).c(str);
        }

        public final /* synthetic */ void s(U2.e eVar) {
            eVar.c();
            ((InterfaceC1735A) k0.j(this.f40171b)).h(eVar);
        }

        public final /* synthetic */ void t(int i9, long j9) {
            ((InterfaceC1735A) k0.j(this.f40171b)).s(i9, j9);
        }

        public final /* synthetic */ void u(U2.e eVar) {
            ((InterfaceC1735A) k0.j(this.f40171b)).p(eVar);
        }

        public final /* synthetic */ void v(C0936z0 c0936z0, U2.h hVar) {
            ((InterfaceC1735A) k0.j(this.f40171b)).H(c0936z0);
            ((InterfaceC1735A) k0.j(this.f40171b)).q(c0936z0, hVar);
        }

        public final /* synthetic */ void w(Object obj, long j9) {
            ((InterfaceC1735A) k0.j(this.f40171b)).v(obj, j9);
        }

        public final /* synthetic */ void x(long j9, int i9) {
            ((InterfaceC1735A) k0.j(this.f40171b)).y(j9, i9);
        }

        public final /* synthetic */ void y(Exception exc) {
            ((InterfaceC1735A) k0.j(this.f40171b)).m(exc);
        }

        public final /* synthetic */ void z(C1737C c1737c) {
            ((InterfaceC1735A) k0.j(this.f40171b)).j(c1737c);
        }
    }

    void H(C0936z0 c0936z0);

    void c(String str);

    void d(String str, long j9, long j10);

    void h(U2.e eVar);

    void j(C1737C c1737c);

    void m(Exception exc);

    void p(U2.e eVar);

    void q(C0936z0 c0936z0, U2.h hVar);

    void s(int i9, long j9);

    void v(Object obj, long j9);

    void y(long j9, int i9);
}
