package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.o f17079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f17081c;

    public static class a extends j {
        public a(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.j
        public int d(View view) {
            return this.f17079a.r0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f17079a.q0(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f17079a.p0(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int g(View view) {
            return this.f17079a.o0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int h() {
            return this.f17079a.I0();
        }

        @Override // androidx.recyclerview.widget.j
        public int i() {
            return this.f17079a.I0() - this.f17079a.k();
        }

        @Override // androidx.recyclerview.widget.j
        public int j() {
            return this.f17079a.k();
        }

        @Override // androidx.recyclerview.widget.j
        public int k() {
            return this.f17079a.J0();
        }

        @Override // androidx.recyclerview.widget.j
        public int l() {
            return this.f17079a.v0();
        }

        @Override // androidx.recyclerview.widget.j
        public int m() {
            return this.f17079a.o();
        }

        @Override // androidx.recyclerview.widget.j
        public int n() {
            return (this.f17079a.I0() - this.f17079a.o()) - this.f17079a.k();
        }

        @Override // androidx.recyclerview.widget.j
        public int p(View view) {
            this.f17079a.H0(view, true, this.f17081c);
            return this.f17081c.right;
        }

        @Override // androidx.recyclerview.widget.j
        public int q(View view) {
            this.f17079a.H0(view, true, this.f17081c);
            return this.f17081c.left;
        }

        @Override // androidx.recyclerview.widget.j
        public void r(int i9) {
            this.f17079a.Y0(i9);
        }
    }

    public static class b extends j {
        public b(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.j
        public int d(View view) {
            return this.f17079a.m0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f17079a.p0(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f17079a.q0(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int g(View view) {
            return this.f17079a.s0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.j
        public int h() {
            return this.f17079a.u0();
        }

        @Override // androidx.recyclerview.widget.j
        public int i() {
            return this.f17079a.u0() - this.f17079a.b();
        }

        @Override // androidx.recyclerview.widget.j
        public int j() {
            return this.f17079a.b();
        }

        @Override // androidx.recyclerview.widget.j
        public int k() {
            return this.f17079a.v0();
        }

        @Override // androidx.recyclerview.widget.j
        public int l() {
            return this.f17079a.J0();
        }

        @Override // androidx.recyclerview.widget.j
        public int m() {
            return this.f17079a.n();
        }

        @Override // androidx.recyclerview.widget.j
        public int n() {
            return (this.f17079a.u0() - this.f17079a.n()) - this.f17079a.b();
        }

        @Override // androidx.recyclerview.widget.j
        public int p(View view) {
            this.f17079a.H0(view, true, this.f17081c);
            return this.f17081c.bottom;
        }

        @Override // androidx.recyclerview.widget.j
        public int q(View view) {
            this.f17079a.H0(view, true, this.f17081c);
            return this.f17081c.top;
        }

        @Override // androidx.recyclerview.widget.j
        public void r(int i9) {
            this.f17079a.Z0(i9);
        }
    }

    public j(RecyclerView.o oVar) {
        this.f17080b = Integer.MIN_VALUE;
        this.f17081c = new Rect();
        this.f17079a = oVar;
    }

    public /* synthetic */ j(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static j a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static j b(RecyclerView.o oVar, int i9) {
        if (i9 == 0) {
            return a(oVar);
        }
        if (i9 == 1) {
            return c(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static j c(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f17080b) {
            return 0;
        }
        return n() - this.f17080b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i9);

    public void s() {
        this.f17080b = n();
    }
}
