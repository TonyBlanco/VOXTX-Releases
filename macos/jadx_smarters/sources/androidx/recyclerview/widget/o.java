package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends RecyclerView.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f17090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Scroller f17091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView.t f17092c = new a();

    public class a extends RecyclerView.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f17093a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i9) {
            super.a(recyclerView, i9);
            if (i9 == 0 && this.f17093a) {
                this.f17093a = false;
                o.this.k();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i9, int i10) {
            if (i9 == 0 && i10 == 0) {
                return;
            }
            this.f17093a = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean a(int i9, int i10) {
        RecyclerView.o layoutManager = this.f17090a.getLayoutManager();
        if (layoutManager == null || this.f17090a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f17090a.getMinFlingVelocity();
        return (Math.abs(i10) > minFlingVelocity || Math.abs(i9) > minFlingVelocity) && j(layoutManager, i9, i10);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f17090a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            f();
        }
        this.f17090a = recyclerView;
        if (recyclerView != null) {
            i();
            this.f17091b = new Scroller(this.f17090a.getContext(), new DecelerateInterpolator());
            k();
        }
    }

    public abstract int[] c(RecyclerView.o oVar, View view);

    public RecyclerView.z d(RecyclerView.o oVar) {
        return e(oVar);
    }

    public abstract h e(RecyclerView.o oVar);

    public final void f() {
        this.f17090a.d1(this.f17092c);
        this.f17090a.setOnFlingListener(null);
    }

    public abstract View g(RecyclerView.o oVar);

    public abstract int h(RecyclerView.o oVar, int i9, int i10);

    public final void i() {
        if (this.f17090a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f17090a.l(this.f17092c);
        this.f17090a.setOnFlingListener(this);
    }

    public final boolean j(RecyclerView.o oVar, int i9, int i10) {
        RecyclerView.z zVarD;
        int iH;
        if (!(oVar instanceof RecyclerView.z.b) || (zVarD = d(oVar)) == null || (iH = h(oVar, i9, i10)) == -1) {
            return false;
        }
        zVarD.p(iH);
        oVar.h2(zVarD);
        return true;
    }

    public void k() {
        RecyclerView.o layoutManager;
        View viewG;
        RecyclerView recyclerView = this.f17090a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewG = g(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewG);
        int i9 = iArrC[0];
        if (i9 == 0 && iArrC[1] == 0) {
            return;
        }
        this.f17090a.q1(i9, iArrC[1]);
    }
}
