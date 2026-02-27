package com.cooltechworks.views.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import s2.AbstractC2706a;

/* JADX INFO: loaded from: classes.dex */
public class ShimmerRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public RecyclerView.g f18551M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public s2.d f18552N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public RecyclerView.o f18553O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public RecyclerView.o f18554P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public e f18555Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public boolean f18556R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public int f18557S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public int f18558T0;

    public class a extends LinearLayoutManager {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public boolean I() {
            return ShimmerRecyclerView.this.f18556R0;
        }
    }

    public class b extends LinearLayoutManager {
        public b(Context context, int i9, boolean z9) {
            super(context, i9, z9);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public boolean H() {
            return ShimmerRecyclerView.this.f18556R0;
        }
    }

    public class c extends GridLayoutManager {
        public c(Context context, int i9) {
            super(context, i9);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public boolean I() {
            return ShimmerRecyclerView.this.f18556R0;
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18562a;

        static {
            int[] iArr = new int[e.values().length];
            f18562a = iArr;
            try {
                iArr[e.LINEAR_VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18562a[e.LINEAR_HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18562a[e.GRID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum e {
        LINEAR_VERTICAL,
        LINEAR_HORIZONTAL,
        GRID
    }

    public ShimmerRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        F1(context, attributeSet);
    }

    private void F1(Context context, AttributeSet attributeSet) {
        e eVar;
        this.f18552N0 = new s2.d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s2.c.f49872g, 0, 0);
        try {
            setDemoLayoutReference(typedArrayObtainStyledAttributes.getResourceId(s2.c.f49877l, s2.b.f49864a));
            setDemoChildCount(typedArrayObtainStyledAttributes.getInteger(s2.c.f49874i, 10));
            setGridChildCount(typedArrayObtainStyledAttributes.getInteger(s2.c.f49876k, 2));
            int integer = typedArrayObtainStyledAttributes.getInteger(s2.c.f49878m, 0);
            if (integer == 0) {
                eVar = e.LINEAR_VERTICAL;
            } else if (integer == 1) {
                eVar = e.LINEAR_HORIZONTAL;
            } else {
                if (integer != 2) {
                    throw new IllegalArgumentException("This value for layout manager is not valid!");
                }
                eVar = e.GRID;
            }
            setDemoLayoutManager(eVar);
            int integer2 = typedArrayObtainStyledAttributes.getInteger(s2.c.f49873h, 0);
            int color = typedArrayObtainStyledAttributes.getColor(s2.c.f49880o, D1(AbstractC2706a.f49863a));
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(s2.c.f49881p);
            int integer3 = typedArrayObtainStyledAttributes.getInteger(s2.c.f49875j, 1500);
            boolean z9 = typedArrayObtainStyledAttributes.getBoolean(s2.c.f49879n, false);
            typedArrayObtainStyledAttributes.recycle();
            this.f18552N0.p0(integer2);
            this.f18552N0.q0(color);
            this.f18552N0.s0(drawable);
            this.f18552N0.r0(integer3);
            this.f18552N0.l0(z9);
            H1();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final int D1(int i9) {
        return Build.VERSION.SDK_INT >= 23 ? getContext().getColor(i9) : getResources().getColor(i9);
    }

    public void E1() {
        this.f18556R0 = true;
        setLayoutManager(this.f18554P0);
        setAdapter(this.f18551M0);
    }

    public final void G1() {
        RecyclerView.o aVar;
        int i9 = d.f18562a[this.f18555Q0.ordinal()];
        if (i9 == 1) {
            aVar = new a(getContext());
        } else if (i9 == 2) {
            aVar = new b(getContext(), 0, false);
        } else if (i9 != 3) {
            return;
        } else {
            aVar = new c(getContext(), this.f18558T0);
        }
        this.f18553O0 = aVar;
    }

    public void H1() {
        this.f18556R0 = false;
        if (this.f18553O0 == null) {
            G1();
        }
        setLayoutManager(this.f18553O0);
        setAdapter(this.f18552N0);
    }

    public RecyclerView.g getActualAdapter() {
        return this.f18551M0;
    }

    public int getLayoutReference() {
        return this.f18557S0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.g gVar) {
        if (gVar == null) {
            this.f18551M0 = null;
        } else if (gVar != this.f18552N0) {
            this.f18551M0 = gVar;
        }
        super.setAdapter(gVar);
    }

    public void setDemoChildCount(int i9) {
        this.f18552N0.n0(i9);
    }

    public void setDemoLayoutManager(e eVar) {
        this.f18555Q0 = eVar;
    }

    public void setDemoLayoutReference(int i9) {
        this.f18557S0 = i9;
        this.f18552N0.m0(getLayoutReference());
    }

    public void setDemoShimmerDuration(int i9) {
        this.f18552N0.r0(i9);
    }

    public void setGridChildCount(int i9) {
        this.f18558T0 = i9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.o oVar) {
        if (oVar == null) {
            this.f18554P0 = null;
        } else if (oVar != this.f18553O0) {
            this.f18554P0 = oVar;
        }
        super.setLayoutManager(oVar);
    }
}
