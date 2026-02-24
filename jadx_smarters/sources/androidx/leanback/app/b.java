package androidx.leanback.app;

import android.animation.TimeAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.leanback.widget.C1164t;
import androidx.leanback.widget.C1166v;
import androidx.leanback.widget.E;
import androidx.leanback.widget.HorizontalGridView;
import androidx.leanback.widget.InterfaceC1148c;
import androidx.leanback.widget.InterfaceC1149d;
import androidx.leanback.widget.M;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.RecyclerView;
import g0.AbstractC1801f;
import g0.g;
import g0.h;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b extends androidx.leanback.app.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C1164t.d f15271j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15272k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15274m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f15277p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public InterfaceC1149d f15278q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InterfaceC1148c f15279r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15280s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public RecyclerView.u f15282u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f15283v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C1164t.b f15284w;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f15273l = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15275n = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15276o = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Interpolator f15281t = new DecelerateInterpolator(2.0f);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1164t.b f15285x = new a();

    public class a extends C1164t.b {
        public a() {
        }

        @Override // androidx.leanback.widget.C1164t.b
        public void a(E e9, int i9) {
            C1164t.b bVar = b.this.f15284w;
            if (bVar != null) {
                bVar.a(e9, i9);
            }
        }

        @Override // androidx.leanback.widget.C1164t.b
        public void b(C1164t.d dVar) {
            b.k0(dVar, b.this.f15273l);
            M m9 = (M) dVar.Q();
            M.b bVarM = m9.m(dVar.R());
            m9.B(bVarM, b.this.f15276o);
            m9.k(bVarM, b.this.f15277p);
            C1164t.b bVar = b.this.f15284w;
            if (bVar != null) {
                bVar.b(dVar);
            }
        }

        @Override // androidx.leanback.widget.C1164t.b
        public void c(C1164t.d dVar) {
            C1164t.b bVar = b.this.f15284w;
            if (bVar != null) {
                bVar.c(dVar);
            }
        }

        @Override // androidx.leanback.widget.C1164t.b
        public void e(C1164t.d dVar) {
            VerticalGridView verticalGridViewE = b.this.E();
            if (verticalGridViewE != null) {
                verticalGridViewE.setClipChildren(false);
            }
            b.this.m0(dVar);
            b bVar = b.this;
            bVar.f15274m = true;
            dVar.S(bVar.new C0175b(dVar));
            b.l0(dVar, false, true);
            C1164t.b bVar2 = b.this.f15284w;
            if (bVar2 != null) {
                bVar2.e(dVar);
            }
            M.b bVarM = ((M) dVar.Q()).m(dVar.R());
            bVarM.l(b.this.f15278q);
            bVarM.k(b.this.f15279r);
        }

        @Override // androidx.leanback.widget.C1164t.b
        public void f(C1164t.d dVar) {
            C1164t.d dVar2 = b.this.f15271j;
            if (dVar2 == dVar) {
                b.l0(dVar2, false, true);
                b.this.f15271j = null;
            }
            C1164t.b bVar = b.this.f15284w;
            if (bVar != null) {
                bVar.f(dVar);
            }
        }

        @Override // androidx.leanback.widget.C1164t.b
        public void g(C1164t.d dVar) {
            b.l0(dVar, false, true);
            C1164t.b bVar = b.this.f15284w;
            if (bVar != null) {
                bVar.g(dVar);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.leanback.app.b$b, reason: collision with other inner class name */
    public final class C0175b implements TimeAnimator.TimeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final M f15287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final E.a f15288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeAnimator f15289c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f15290d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Interpolator f15291e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f15292f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f15293g;

        public C0175b(C1164t.d dVar) {
            TimeAnimator timeAnimator = new TimeAnimator();
            this.f15289c = timeAnimator;
            this.f15287a = (M) dVar.Q();
            this.f15288b = dVar.R();
            timeAnimator.setTimeListener(this);
        }

        public void a(boolean z9, boolean z10) {
            this.f15289c.end();
            float f9 = z9 ? 1.0f : 0.0f;
            if (z10) {
                this.f15287a.E(this.f15288b, f9);
                return;
            }
            if (this.f15287a.o(this.f15288b) != f9) {
                b bVar = b.this;
                this.f15290d = bVar.f15280s;
                this.f15291e = bVar.f15281t;
                float fO = this.f15287a.o(this.f15288b);
                this.f15292f = fO;
                this.f15293g = f9 - fO;
                this.f15289c.start();
            }
        }

        public void b(long j9, long j10) {
            float interpolation;
            int i9 = this.f15290d;
            if (j9 >= i9) {
                this.f15289c.end();
                interpolation = 1.0f;
            } else {
                interpolation = (float) (j9 / ((double) i9));
            }
            Interpolator interpolator = this.f15291e;
            if (interpolator != null) {
                interpolation = interpolator.getInterpolation(interpolation);
            }
            this.f15287a.E(this.f15288b, this.f15292f + (interpolation * this.f15293g));
        }

        @Override // android.animation.TimeAnimator.TimeListener
        public void onTimeUpdate(TimeAnimator timeAnimator, long j9, long j10) {
            if (this.f15289c.isRunning()) {
                b(j9, j10);
            }
        }
    }

    public static M.b Z(C1164t.d dVar) {
        if (dVar == null) {
            return null;
        }
        return ((M) dVar.Q()).m(dVar.R());
    }

    public static void k0(C1164t.d dVar, boolean z9) {
        ((M) dVar.Q()).C(dVar.R(), z9);
    }

    public static void l0(C1164t.d dVar, boolean z9, boolean z10) {
        ((C0175b) dVar.P()).a(z9, z10);
        ((M) dVar.Q()).D(dVar.R(), z9);
    }

    @Override // androidx.leanback.app.a
    public int B() {
        return h.f41056i;
    }

    @Override // androidx.leanback.app.a
    public /* bridge */ /* synthetic */ int D() {
        return super.D();
    }

    @Override // androidx.leanback.app.a
    public void J(RecyclerView recyclerView, RecyclerView.D d9, int i9, int i10) {
        C1164t.d dVar = this.f15271j;
        if (dVar == d9 && this.f15272k == i10) {
            return;
        }
        this.f15272k = i10;
        if (dVar != null) {
            l0(dVar, false, false);
        }
        C1164t.d dVar2 = (C1164t.d) d9;
        this.f15271j = dVar2;
        if (dVar2 != null) {
            l0(dVar2, true, false);
        }
    }

    @Override // androidx.leanback.app.a
    public boolean L() {
        boolean zL = super.L();
        if (zL) {
            Y(true);
        }
        return zL;
    }

    @Override // androidx.leanback.app.a
    public /* bridge */ /* synthetic */ void T(int i9) {
        super.T(i9);
    }

    @Override // androidx.leanback.app.a
    public /* bridge */ /* synthetic */ void W(int i9, boolean z9) {
        super.W(i9, z9);
    }

    @Override // androidx.leanback.app.a
    public void X() {
        super.X();
        this.f15271j = null;
        this.f15274m = false;
        C1164t c1164tA = A();
        if (c1164tA != null) {
            c1164tA.t0(this.f15285x);
        }
    }

    public final void Y(boolean z9) {
        this.f15277p = z9;
        VerticalGridView verticalGridViewE = E();
        if (verticalGridViewE != null) {
            int childCount = verticalGridViewE.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                C1164t.d dVar = (C1164t.d) verticalGridViewE.i0(verticalGridViewE.getChildAt(i9));
                M m9 = (M) dVar.Q();
                m9.k(m9.m(dVar.R()), z9);
            }
        }
    }

    public void b0(int i9) {
        if (i9 == Integer.MIN_VALUE) {
            return;
        }
        this.f15275n = i9;
        VerticalGridView verticalGridViewE = E();
        if (verticalGridViewE != null) {
            verticalGridViewE.setItemAlignmentOffset(0);
            verticalGridViewE.setItemAlignmentOffsetPercent(-1.0f);
            verticalGridViewE.setItemAlignmentOffsetWithPadding(true);
            verticalGridViewE.setWindowAlignmentOffset(this.f15275n);
            verticalGridViewE.setWindowAlignmentOffsetPercent(-1.0f);
            verticalGridViewE.setWindowAlignment(0);
        }
    }

    public void c0(boolean z9) {
        this.f15273l = z9;
        VerticalGridView verticalGridViewE = E();
        if (verticalGridViewE != null) {
            int childCount = verticalGridViewE.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                k0((C1164t.d) verticalGridViewE.i0(verticalGridViewE.getChildAt(i9)), this.f15273l);
            }
        }
    }

    public void i0(InterfaceC1148c interfaceC1148c) {
        this.f15279r = interfaceC1148c;
        if (this.f15274m) {
            throw new IllegalStateException("Item clicked listener must be set before views are created");
        }
    }

    public void j0(InterfaceC1149d interfaceC1149d) {
        this.f15278q = interfaceC1149d;
        VerticalGridView verticalGridViewE = E();
        if (verticalGridViewE != null) {
            int childCount = verticalGridViewE.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                Z((C1164t.d) verticalGridViewE.i0(verticalGridViewE.getChildAt(i9))).l(this.f15278q);
            }
        }
    }

    public void m0(C1164t.d dVar) {
        M.b bVarM = ((M) dVar.Q()).m(dVar.R());
        if (bVarM instanceof C1166v.d) {
            C1166v.d dVar2 = (C1166v.d) bVarM;
            HorizontalGridView horizontalGridViewO = dVar2.o();
            RecyclerView.u uVar = this.f15282u;
            if (uVar == null) {
                this.f15282u = horizontalGridViewO.getRecycledViewPool();
            } else {
                horizontalGridViewO.setRecycledViewPool(uVar);
            }
            C1164t c1164tN = dVar2.n();
            ArrayList arrayList = this.f15283v;
            if (arrayList == null) {
                this.f15283v = c1164tN.k0();
            } else {
                c1164tN.A0(arrayList);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15280s = getResources().getInteger(g.f41043a);
    }

    @Override // androidx.leanback.app.a, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.leanback.app.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f15274m = false;
        super.onDestroyView();
    }

    @Override // androidx.leanback.app.a, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.leanback.app.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        E().setItemAlignmentViewId(AbstractC1801f.f41040x);
        E().setSaveChildrenPolicy(2);
        b0(this.f15275n);
        this.f15282u = null;
        this.f15283v = null;
    }

    @Override // androidx.leanback.app.a
    public VerticalGridView x(View view) {
        return (VerticalGridView) view.findViewById(AbstractC1801f.f41020d);
    }
}
