package androidx.leanback.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.leanback.widget.AbstractC1169y;
import androidx.leanback.widget.B;
import androidx.leanback.widget.C1164t;
import androidx.leanback.widget.F;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC1169y f15260a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public VerticalGridView f15261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public F f15262d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15265g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1164t f15263e = new C1164t();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15264f = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f15266h = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final B f15267i = new C0174a();

    /* JADX INFO: renamed from: androidx.leanback.app.a$a, reason: collision with other inner class name */
    public class C0174a extends B {
        public C0174a() {
        }

        @Override // androidx.leanback.widget.B
        public void a(RecyclerView recyclerView, RecyclerView.D d9, int i9, int i10) {
            a aVar = a.this;
            if (aVar.f15266h.f15269a) {
                return;
            }
            aVar.f15264f = i9;
            aVar.J(recyclerView, d9, i9, i10);
        }
    }

    public class b extends RecyclerView.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f15269a = false;

        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            g();
        }

        public void f() {
            if (this.f15269a) {
                this.f15269a = false;
                a.this.f15263e.i0(this);
            }
        }

        public void g() {
            f();
            a aVar = a.this;
            VerticalGridView verticalGridView = aVar.f15261c;
            if (verticalGridView != null) {
                verticalGridView.setSelectedPosition(aVar.f15264f);
            }
        }

        public void h() {
            this.f15269a = true;
            a.this.f15263e.b0(this);
        }
    }

    public final C1164t A() {
        return this.f15263e;
    }

    public abstract int B();

    public int D() {
        return this.f15264f;
    }

    public VerticalGridView E() {
        return this.f15261c;
    }

    public abstract void J(RecyclerView recyclerView, RecyclerView.D d9, int i9, int i10);

    public boolean L() {
        VerticalGridView verticalGridView = this.f15261c;
        if (verticalGridView == null) {
            this.f15265g = true;
            return false;
        }
        verticalGridView.setAnimateChildLayout(false);
        this.f15261c.setScrollEnabled(false);
        return true;
    }

    public void P(AbstractC1169y abstractC1169y) {
        if (this.f15260a != abstractC1169y) {
            this.f15260a = abstractC1169y;
            X();
        }
    }

    public void S() {
        if (this.f15260a == null) {
            return;
        }
        RecyclerView.g adapter = this.f15261c.getAdapter();
        C1164t c1164t = this.f15263e;
        if (adapter != c1164t) {
            this.f15261c.setAdapter(c1164t);
        }
        if (this.f15263e.n() == 0 && this.f15264f >= 0) {
            this.f15266h.h();
            return;
        }
        int i9 = this.f15264f;
        if (i9 >= 0) {
            this.f15261c.setSelectedPosition(i9);
        }
    }

    public void T(int i9) {
        W(i9, true);
    }

    public void W(int i9, boolean z9) {
        if (this.f15264f == i9) {
            return;
        }
        this.f15264f = i9;
        VerticalGridView verticalGridView = this.f15261c;
        if (verticalGridView == null || this.f15266h.f15269a) {
            return;
        }
        if (z9) {
            verticalGridView.setSelectedPositionSmooth(i9);
        } else {
            verticalGridView.setSelectedPosition(i9);
        }
    }

    public void X() {
        this.f15263e.s0(this.f15260a);
        this.f15263e.z0(this.f15262d);
        if (this.f15261c != null) {
            S();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(B(), viewGroup, false);
        this.f15261c = x(viewInflate);
        if (this.f15265g) {
            this.f15265g = false;
            L();
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f15266h.f();
        this.f15261c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("currentSelectedPosition", this.f15264f);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (bundle != null) {
            this.f15264f = bundle.getInt("currentSelectedPosition", -1);
        }
        S();
        this.f15261c.setOnChildViewHolderSelectedListener(this.f15267i);
    }

    public abstract VerticalGridView x(View view);

    public AbstractC1169y z() {
        return this.f15260a;
    }
}
