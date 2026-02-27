package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends RecyclerView.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17089g = true;

    public abstract boolean A(RecyclerView.D d9);

    public final void B(RecyclerView.D d9) {
        J(d9);
        h(d9);
    }

    public final void C(RecyclerView.D d9) {
        K(d9);
    }

    public final void D(RecyclerView.D d9, boolean z9) {
        L(d9, z9);
        h(d9);
    }

    public final void E(RecyclerView.D d9, boolean z9) {
        M(d9, z9);
    }

    public final void F(RecyclerView.D d9) {
        N(d9);
        h(d9);
    }

    public final void G(RecyclerView.D d9) {
        O(d9);
    }

    public final void H(RecyclerView.D d9) {
        P(d9);
        h(d9);
    }

    public final void I(RecyclerView.D d9) {
        Q(d9);
    }

    public void J(RecyclerView.D d9) {
    }

    public void K(RecyclerView.D d9) {
    }

    public void L(RecyclerView.D d9, boolean z9) {
    }

    public void M(RecyclerView.D d9, boolean z9) {
    }

    public void N(RecyclerView.D d9) {
    }

    public void O(RecyclerView.D d9) {
    }

    public void P(RecyclerView.D d9) {
    }

    public void Q(RecyclerView.D d9) {
    }

    public void R(boolean z9) {
        this.f17089g = z9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean a(RecyclerView.D d9, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i9;
        int i10;
        return (cVar == null || ((i9 = cVar.f16764a) == (i10 = cVar2.f16764a) && cVar.f16765b == cVar2.f16765b)) ? x(d9) : z(d9, i9, cVar.f16765b, i10, cVar2.f16765b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean b(RecyclerView.D d9, RecyclerView.D d10, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i9;
        int i10;
        int i11 = cVar.f16764a;
        int i12 = cVar.f16765b;
        if (d10.M()) {
            int i13 = cVar.f16764a;
            i10 = cVar.f16765b;
            i9 = i13;
        } else {
            i9 = cVar2.f16764a;
            i10 = cVar2.f16765b;
        }
        return y(d9, d10, i11, i12, i9, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean c(RecyclerView.D d9, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i9 = cVar.f16764a;
        int i10 = cVar.f16765b;
        View view = d9.f16733a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f16764a;
        int top = cVar2 == null ? view.getTop() : cVar2.f16765b;
        if (d9.y() || (i9 == left && i10 == top)) {
            return A(d9);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return z(d9, i9, i10, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean d(RecyclerView.D d9, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i9 = cVar.f16764a;
        int i10 = cVar2.f16764a;
        if (i9 != i10 || cVar.f16765b != cVar2.f16765b) {
            return z(d9, i9, cVar.f16765b, i10, cVar2.f16765b);
        }
        F(d9);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean f(RecyclerView.D d9) {
        return !this.f17089g || d9.w();
    }

    public abstract boolean x(RecyclerView.D d9);

    public abstract boolean y(RecyclerView.D d9, RecyclerView.D d10, int i9, int i10, int i11, int i12);

    public abstract boolean z(RecyclerView.D d9, int i9, int i10, int i11, int i12);
}
