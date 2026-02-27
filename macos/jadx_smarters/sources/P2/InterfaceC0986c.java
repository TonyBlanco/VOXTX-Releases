package P2;

import B3.C;
import B3.C0512u;
import B3.C0515x;
import O2.C0909p1;
import O2.C0917s1;
import O2.C0921u;
import O2.C0936z0;
import O2.H0;
import O2.InterfaceC0920t1;
import O2.Q1;
import O2.R0;
import O2.V1;
import Q2.C1019e;
import android.util.SparseArray;
import d4.AbstractC1684a;
import d4.C1701s;
import e4.C1737C;
import java.io.IOException;
import java.util.List;
import q3.C2540a;

/* JADX INFO: renamed from: P2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0986c {

    /* JADX INFO: renamed from: P2.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Q1 f7008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C.b f7010d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f7011e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Q1 f7012f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f7013g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final C.b f7014h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f7015i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f7016j;

        public a(long j9, Q1 q12, int i9, C.b bVar, long j10, Q1 q13, int i10, C.b bVar2, long j11, long j12) {
            this.f7007a = j9;
            this.f7008b = q12;
            this.f7009c = i9;
            this.f7010d = bVar;
            this.f7011e = j10;
            this.f7012f = q13;
            this.f7013g = i10;
            this.f7014h = bVar2;
            this.f7015i = j11;
            this.f7016j = j12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f7007a == aVar.f7007a && this.f7009c == aVar.f7009c && this.f7011e == aVar.f7011e && this.f7013g == aVar.f7013g && this.f7015i == aVar.f7015i && this.f7016j == aVar.f7016j && r5.j.a(this.f7008b, aVar.f7008b) && r5.j.a(this.f7010d, aVar.f7010d) && r5.j.a(this.f7012f, aVar.f7012f) && r5.j.a(this.f7014h, aVar.f7014h);
        }

        public int hashCode() {
            return r5.j.b(Long.valueOf(this.f7007a), this.f7008b, Integer.valueOf(this.f7009c), this.f7010d, Long.valueOf(this.f7011e), this.f7012f, Integer.valueOf(this.f7013g), this.f7014h, Long.valueOf(this.f7015i), Long.valueOf(this.f7016j));
        }
    }

    /* JADX INFO: renamed from: P2.c$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1701s f7017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray f7018b;

        public b(C1701s c1701s, SparseArray sparseArray) {
            this.f7017a = c1701s;
            SparseArray sparseArray2 = new SparseArray(c1701s.d());
            for (int i9 = 0; i9 < c1701s.d(); i9++) {
                int iC = c1701s.c(i9);
                sparseArray2.append(iC, (a) AbstractC1684a.e((a) sparseArray.get(iC)));
            }
            this.f7018b = sparseArray2;
        }

        public boolean a(int i9) {
            return this.f7017a.a(i9);
        }

        public int b(int i9) {
            return this.f7017a.c(i9);
        }

        public a c(int i9) {
            return (a) AbstractC1684a.e((a) this.f7018b.get(i9));
        }

        public int d() {
            return this.f7017a.d();
        }
    }

    void A(a aVar, boolean z9);

    void B(a aVar, int i9, long j9, long j10);

    void C(a aVar, H0 h02, int i9);

    void D(a aVar, Object obj, long j9);

    void E(a aVar, U2.e eVar);

    void F(a aVar, C0909p1 c0909p1);

    void G(a aVar, C0515x c0515x);

    void H(a aVar, R0 r02);

    void I(a aVar, Exception exc);

    void J(a aVar, C0921u c0921u);

    void K(a aVar, int i9);

    void L(a aVar);

    void M(a aVar, C1019e c1019e);

    void N(a aVar, String str);

    void O(a aVar, int i9, int i10, int i11, float f9);

    void P(a aVar, boolean z9);

    void Q(a aVar);

    void R(a aVar, C0936z0 c0936z0);

    void T(a aVar, U2.e eVar);

    void U(a aVar, Exception exc);

    void V(a aVar, int i9);

    void W(a aVar, Exception exc);

    void X(a aVar, int i9);

    void Y(a aVar, C0515x c0515x);

    void Z(a aVar, String str);

    void a(a aVar, C0936z0 c0936z0, U2.h hVar);

    void a0(a aVar, C0512u c0512u, C0515x c0515x, IOException iOException, boolean z9);

    void b0(a aVar, boolean z9);

    void c(a aVar);

    void c0(a aVar, long j9);

    void d(a aVar, C0512u c0512u, C0515x c0515x);

    void d0(a aVar, C2540a c2540a);

    void e(a aVar, int i9);

    void e0(a aVar, int i9);

    void f(a aVar);

    void f0(a aVar, boolean z9, int i9);

    void g(a aVar, boolean z9);

    void g0(a aVar, String str, long j9);

    void h(a aVar, Z3.z zVar);

    void h0(a aVar, int i9, long j9);

    void i(a aVar);

    void i0(a aVar, int i9, long j9, long j10);

    void j(a aVar, Exception exc);

    void j0(a aVar, boolean z9, int i9);

    void k(a aVar, V1 v12);

    void k0(a aVar);

    void l(a aVar, C0936z0 c0936z0, U2.h hVar);

    void l0(a aVar, boolean z9);

    void m(a aVar);

    void m0(a aVar, int i9, boolean z9);

    void n(a aVar, long j9, int i9);

    void n0(a aVar, C0936z0 c0936z0);

    void o(a aVar, int i9, int i10);

    void o0(a aVar, C1737C c1737c);

    void p(a aVar, InterfaceC0920t1.e eVar, InterfaceC0920t1.e eVar2, int i9);

    void p0(a aVar, C0512u c0512u, C0515x c0515x);

    void q(a aVar, U2.e eVar);

    void q0(a aVar, List list);

    void r(a aVar, P3.f fVar);

    void r0(a aVar, C0909p1 c0909p1);

    void s(a aVar, String str, long j9, long j10);

    void s0(a aVar, U2.e eVar);

    void t(a aVar, C0917s1 c0917s1);

    void t0(a aVar, String str, long j9, long j10);

    void u(a aVar, String str, long j9);

    void u0(InterfaceC0920t1 interfaceC0920t1, b bVar);

    void w(a aVar, InterfaceC0920t1.b bVar);

    void y(a aVar, C0512u c0512u, C0515x c0515x);

    void z(a aVar, int i9);
}
