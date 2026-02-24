package B3;

import B3.C;
import O2.C0936z0;
import android.os.Handler;
import d4.AbstractC1684a;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public interface J {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C.b f302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList f303c;

        /* JADX INFO: renamed from: B3.J$a$a, reason: collision with other inner class name */
        public static final class C0006a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f304a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public J f305b;

            public C0006a(Handler handler, J j9) {
                this.f304a = handler;
                this.f305b = j9;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public a(CopyOnWriteArrayList copyOnWriteArrayList, int i9, C.b bVar) {
            this.f303c = copyOnWriteArrayList;
            this.f301a = i9;
            this.f302b = bVar;
        }

        public void A(final C0512u c0512u, final C0515x c0515x) {
            for (C0006a c0006a : this.f303c) {
                final J j9 = c0006a.f305b;
                d4.k0.Y0(c0006a.f304a, new Runnable() { // from class: B3.G
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f290a.n(j9, c0512u, c0515x);
                    }
                });
            }
        }

        public void B(J j9) {
            for (C0006a c0006a : this.f303c) {
                if (c0006a.f305b == j9) {
                    this.f303c.remove(c0006a);
                }
            }
        }

        public void C(int i9, long j9, long j10) {
            D(new C0515x(1, i9, null, 3, null, d4.k0.x1(j9), d4.k0.x1(j10)));
        }

        public void D(final C0515x c0515x) {
            final C.b bVar = (C.b) AbstractC1684a.e(this.f302b);
            for (C0006a c0006a : this.f303c) {
                final J j9 = c0006a.f305b;
                d4.k0.Y0(c0006a.f304a, new Runnable() { // from class: B3.H
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f294a.o(j9, bVar, c0515x);
                    }
                });
            }
        }

        public a E(int i9, C.b bVar) {
            return new a(this.f303c, i9, bVar);
        }

        public void g(Handler handler, J j9) {
            AbstractC1684a.e(handler);
            AbstractC1684a.e(j9);
            this.f303c.add(new C0006a(handler, j9));
        }

        public void h(int i9, C0936z0 c0936z0, int i10, Object obj, long j9) {
            i(new C0515x(1, i9, c0936z0, i10, obj, d4.k0.x1(j9), -9223372036854775807L));
        }

        public void i(final C0515x c0515x) {
            for (C0006a c0006a : this.f303c) {
                final J j9 = c0006a.f305b;
                d4.k0.Y0(c0006a.f304a, new Runnable() { // from class: B3.I
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f298a.j(j9, c0515x);
                    }
                });
            }
        }

        public final /* synthetic */ void j(J j9, C0515x c0515x) {
            j9.Z(this.f301a, this.f302b, c0515x);
        }

        public final /* synthetic */ void k(J j9, C0512u c0512u, C0515x c0515x) {
            j9.I(this.f301a, this.f302b, c0512u, c0515x);
        }

        public final /* synthetic */ void l(J j9, C0512u c0512u, C0515x c0515x) {
            j9.D(this.f301a, this.f302b, c0512u, c0515x);
        }

        public final /* synthetic */ void m(J j9, C0512u c0512u, C0515x c0515x, IOException iOException, boolean z9) {
            j9.L(this.f301a, this.f302b, c0512u, c0515x, iOException, z9);
        }

        public final /* synthetic */ void n(J j9, C0512u c0512u, C0515x c0515x) {
            j9.R(this.f301a, this.f302b, c0512u, c0515x);
        }

        public final /* synthetic */ void o(J j9, C.b bVar, C0515x c0515x) {
            j9.o(this.f301a, bVar, c0515x);
        }

        public void p(C0512u c0512u, int i9) {
            q(c0512u, i9, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void q(C0512u c0512u, int i9, int i10, C0936z0 c0936z0, int i11, Object obj, long j9, long j10) {
            r(c0512u, new C0515x(i9, i10, c0936z0, i11, obj, d4.k0.x1(j9), d4.k0.x1(j10)));
        }

        public void r(final C0512u c0512u, final C0515x c0515x) {
            for (C0006a c0006a : this.f303c) {
                final J j9 = c0006a.f305b;
                d4.k0.Y0(c0006a.f304a, new Runnable() { // from class: B3.F
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f286a.k(j9, c0512u, c0515x);
                    }
                });
            }
        }

        public void s(C0512u c0512u, int i9) {
            t(c0512u, i9, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void t(C0512u c0512u, int i9, int i10, C0936z0 c0936z0, int i11, Object obj, long j9, long j10) {
            u(c0512u, new C0515x(i9, i10, c0936z0, i11, obj, d4.k0.x1(j9), d4.k0.x1(j10)));
        }

        public void u(final C0512u c0512u, final C0515x c0515x) {
            for (C0006a c0006a : this.f303c) {
                final J j9 = c0006a.f305b;
                d4.k0.Y0(c0006a.f304a, new Runnable() { // from class: B3.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f276a.l(j9, c0512u, c0515x);
                    }
                });
            }
        }

        public void v(C0512u c0512u, int i9, int i10, C0936z0 c0936z0, int i11, Object obj, long j9, long j10, IOException iOException, boolean z9) {
            x(c0512u, new C0515x(i9, i10, c0936z0, i11, obj, d4.k0.x1(j9), d4.k0.x1(j10)), iOException, z9);
        }

        public void w(C0512u c0512u, int i9, IOException iOException, boolean z9) {
            v(c0512u, i9, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z9);
        }

        public void x(final C0512u c0512u, final C0515x c0515x, final IOException iOException, final boolean z9) {
            for (C0006a c0006a : this.f303c) {
                final J j9 = c0006a.f305b;
                d4.k0.Y0(c0006a.f304a, new Runnable() { // from class: B3.E
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f280a.m(j9, c0512u, c0515x, iOException, z9);
                    }
                });
            }
        }

        public void y(C0512u c0512u, int i9) {
            z(c0512u, i9, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void z(C0512u c0512u, int i9, int i10, C0936z0 c0936z0, int i11, Object obj, long j9, long j10) {
            A(c0512u, new C0515x(i9, i10, c0936z0, i11, obj, d4.k0.x1(j9), d4.k0.x1(j10)));
        }
    }

    void D(int i9, C.b bVar, C0512u c0512u, C0515x c0515x);

    void I(int i9, C.b bVar, C0512u c0512u, C0515x c0515x);

    void L(int i9, C.b bVar, C0512u c0512u, C0515x c0515x, IOException iOException, boolean z9);

    void R(int i9, C.b bVar, C0512u c0512u, C0515x c0515x);

    void Z(int i9, C.b bVar, C0515x c0515x);

    void o(int i9, C.b bVar, C0515x c0515x);
}
