package d4;

import O2.AbstractC0926v1;
import O2.C0909p1;
import O2.C0917s1;
import O2.C0921u;
import O2.C0936z0;
import O2.H0;
import O2.InterfaceC0920t1;
import O2.InterfaceC0933y;
import O2.Q1;
import O2.R0;
import O2.V1;
import Q2.C1019e;
import android.os.Looper;
import android.widget.TextView;
import e4.C1737C;
import e4.C1740c;
import java.util.List;
import java.util.Locale;
import q3.C2540a;

/* JADX INFO: renamed from: d4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1694k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0933y f39772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f39773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f39774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39775d;

    /* JADX INFO: renamed from: d4.k$b */
    public final class b implements InterfaceC0920t1.d, Runnable {
        public b() {
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void A(C1019e c1019e) {
            AbstractC0926v1.a(this, c1019e);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void B(boolean z9) {
            AbstractC0926v1.j(this, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public void E(int i9) {
            C1694k.this.k();
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void J(boolean z9) {
            AbstractC0926v1.y(this, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void M(int i9, boolean z9) {
            AbstractC0926v1.f(this, i9, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void O(InterfaceC0920t1.b bVar) {
            AbstractC0926v1.b(this, bVar);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void P() {
            AbstractC0926v1.w(this);
        }

        @Override // O2.InterfaceC0920t1.d
        public void S(InterfaceC0920t1.e eVar, InterfaceC0920t1.e eVar2, int i9) {
            C1694k.this.k();
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void U(int i9, int i10) {
            AbstractC0926v1.A(this, i9, i10);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void V(Q1 q12, int i9) {
            AbstractC0926v1.B(this, q12, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void W(C0909p1 c0909p1) {
            AbstractC0926v1.s(this, c0909p1);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void Y(Z3.z zVar) {
            AbstractC0926v1.C(this, zVar);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void a(boolean z9) {
            AbstractC0926v1.z(this, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void a0(C0921u c0921u) {
            AbstractC0926v1.e(this, c0921u);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void b0(int i9) {
            AbstractC0926v1.u(this, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void d0(boolean z9) {
            AbstractC0926v1.h(this, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void e(C2540a c2540a) {
            AbstractC0926v1.m(this, c2540a);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void f0(V1 v12) {
            AbstractC0926v1.D(this, v12);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void g0(boolean z9, int i9) {
            AbstractC0926v1.t(this, z9, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void h0(H0 h02, int i9) {
            AbstractC0926v1.k(this, h02, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void i0(R0 r02) {
            AbstractC0926v1.l(this, r02);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void j(C1737C c1737c) {
            AbstractC0926v1.E(this, c1737c);
        }

        @Override // O2.InterfaceC0920t1.d
        public void j0(boolean z9, int i9) {
            C1694k.this.k();
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void k(List list) {
            AbstractC0926v1.d(this, list);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void l0(C0909p1 c0909p1) {
            AbstractC0926v1.r(this, c0909p1);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void m0(InterfaceC0920t1 interfaceC0920t1, InterfaceC0920t1.c cVar) {
            AbstractC0926v1.g(this, interfaceC0920t1, cVar);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void n0(boolean z9) {
            AbstractC0926v1.i(this, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void onRepeatModeChanged(int i9) {
            AbstractC0926v1.x(this, i9);
        }

        @Override // java.lang.Runnable
        public void run() {
            C1694k.this.k();
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void t(C0917s1 c0917s1) {
            AbstractC0926v1.o(this, c0917s1);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void u(P3.f fVar) {
            AbstractC0926v1.c(this, fVar);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void z(int i9) {
            AbstractC0926v1.q(this, i9);
        }
    }

    public C1694k(InterfaceC0933y interfaceC0933y, TextView textView) {
        AbstractC1684a.a(interfaceC0933y.x() == Looper.getMainLooper());
        this.f39772a = interfaceC0933y;
        this.f39773b = textView;
        this.f39774c = new b();
    }

    public static String b(C1740c c1740c) {
        if (c1740c == null || !c1740c.g()) {
            return "";
        }
        return " colr:" + c1740c.l();
    }

    public static String d(U2.e eVar) {
        if (eVar == null) {
            return "";
        }
        eVar.c();
        return " sib:" + eVar.f9688d + " sb:" + eVar.f9690f + " rb:" + eVar.f9689e + " db:" + eVar.f9691g + " mcdb:" + eVar.f9693i + " dk:" + eVar.f9694j;
    }

    public static String e(float f9) {
        if (f9 == -1.0f || f9 == 1.0f) {
            return "";
        }
        return " par:" + String.format(Locale.US, "%.02f", Float.valueOf(f9));
    }

    public static String g(long j9, int i9) {
        return i9 == 0 ? "N/A" : String.valueOf((long) (j9 / ((double) i9)));
    }

    public String a() {
        C0936z0 c0936z0S = this.f39772a.S();
        U2.e eVarC0 = this.f39772a.c0();
        if (c0936z0S == null || eVarC0 == null) {
            return "";
        }
        return "\n" + c0936z0S.f6467m + "(id:" + c0936z0S.f6456a + " hz:" + c0936z0S.f6447A + " ch:" + c0936z0S.f6480z + d(eVarC0) + ")";
    }

    public String c() {
        return f() + h() + a();
    }

    public String f() {
        int playbackState = this.f39772a.getPlaybackState();
        return String.format("playWhenReady:%s playbackState:%s item:%s", Boolean.valueOf(this.f39772a.E()), playbackState != 1 ? playbackState != 2 ? playbackState != 3 ? playbackState != 4 ? "unknown" : "ended" : "ready" : "buffering" : "idle", Integer.valueOf(this.f39772a.X()));
    }

    public String h() {
        C0936z0 c0936z0A = this.f39772a.a();
        U2.e eVarQ = this.f39772a.Q();
        if (c0936z0A == null || eVarQ == null) {
            return "";
        }
        return "\n" + c0936z0A.f6467m + "(id:" + c0936z0A.f6456a + " r:" + c0936z0A.f6472r + "x" + c0936z0A.f6473s + b(c0936z0A.f6479y) + e(c0936z0A.f6476v) + d(eVarQ) + " vfpo: " + g(eVarQ.f9695k, eVarQ.f9696l) + ")";
    }

    public final void i() {
        if (this.f39775d) {
            return;
        }
        this.f39775d = true;
        this.f39772a.B(this.f39774c);
        k();
    }

    public final void j() {
        if (this.f39775d) {
            this.f39775d = false;
            this.f39772a.l(this.f39774c);
            this.f39773b.removeCallbacks(this.f39774c);
        }
    }

    public final void k() {
        this.f39773b.setText(c());
        this.f39773b.removeCallbacks(this.f39774c);
        this.f39773b.postDelayed(this.f39774c, 1000L);
    }
}
