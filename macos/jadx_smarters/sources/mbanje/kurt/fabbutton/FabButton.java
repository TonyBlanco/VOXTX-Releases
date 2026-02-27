package mbanje.kurt.fabbutton;

import M8.b;
import M8.c;
import M8.d;
import M8.e;
import M8.f;
import P.L;
import P.T;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;
import java.util.List;
import mbanje.kurt.fabbutton.CircleImageView;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes4.dex */
@CoordinatorLayout.d(Behavior.class)
public class FabButton extends FrameLayout implements CircleImageView.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CircleImageView f44821a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ProgressRingView f44822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f44823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f44824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f44825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f44827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f44828i;

    public static class Behavior extends CoordinatorLayout.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f44829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f44830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f44831c;

        public class a implements T {
            public a() {
            }

            @Override // P.T
            public void a(View view) {
                Behavior.this.f44830b = false;
            }

            @Override // P.T
            public void b(View view) {
                Behavior.this.f44830b = false;
                view.setVisibility(8);
            }

            @Override // P.T
            public void c(View view) {
                Behavior.this.f44830b = true;
            }
        }

        public final void F(FabButton fabButton) {
            fabButton.setVisibility(0);
            L.e(fabButton).f(1.0f).g(1.0f).b(1.0f).i(M8.a.f5221b).p().j(null).n();
        }

        public final void G(FabButton fabButton) {
            L.e(fabButton).f(0.0f).g(0.0f).b(0.0f).i(M8.a.f5221b).p().j(new a()).n();
        }

        public final float H(CoordinatorLayout coordinatorLayout, FabButton fabButton) {
            List listS = coordinatorLayout.s(fabButton);
            int size = listS.size();
            float fMin = 0.0f;
            for (int i9 = 0; i9 < size; i9++) {
                View view = (View) listS.get(i9);
                if ((view instanceof Snackbar$SnackbarLayout) && coordinatorLayout.g(fabButton, view)) {
                    fMin = Math.min(fMin, L.N(view) - view.getHeight());
                }
            }
            return fMin;
        }

        public final int I(AppBarLayout appBarLayout) {
            int iF = L.F(appBarLayout);
            if (iF != 0) {
                return iF * 2;
            }
            int childCount = appBarLayout.getChildCount();
            if (childCount >= 1) {
                return L.F(appBarLayout.getChildAt(childCount - 1)) * 2;
            }
            return 0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public boolean e(CoordinatorLayout coordinatorLayout, FabButton fabButton, View view) {
            return view instanceof Snackbar$SnackbarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public boolean h(CoordinatorLayout coordinatorLayout, FabButton fabButton, View view) {
            if (view instanceof Snackbar$SnackbarLayout) {
                L(coordinatorLayout, fabButton, view);
                return false;
            }
            if (!(view instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f44829a == null) {
                this.f44829a = new Rect();
            }
            Rect rect = this.f44829a;
            f.a(coordinatorLayout, view, rect);
            if (rect.bottom > I(appBarLayout)) {
                if (fabButton.getVisibility() == 0) {
                    return false;
                }
                F(fabButton);
                return false;
            }
            if (this.f44830b || fabButton.getVisibility() != 0) {
                return false;
            }
            G(fabButton);
            return false;
        }

        public final void L(CoordinatorLayout coordinatorLayout, FabButton fabButton, View view) {
            float fH = H(coordinatorLayout, fabButton);
            if (fH != this.f44831c) {
                L.e(fabButton).c();
                if (Math.abs(fH - this.f44831c) == view.getHeight()) {
                    L.e(fabButton).o(fH).i(M8.a.f5221b).j(null);
                } else {
                    L.M0(fabButton, fH);
                }
                this.f44831c = fH;
            }
        }
    }

    public FabButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44823d = 0.14f;
        c(context, attributeSet, 0);
    }

    @Override // mbanje.kurt.fabbutton.CircleImageView.b
    public void a() {
        this.f44821a.h(this.f44827h, this.f44828i);
        if (this.f44828i) {
            this.f44822c.setVisibility(8);
        }
    }

    @Override // mbanje.kurt.fabbutton.CircleImageView.b
    public void b(boolean z9) {
        if (z9) {
            this.f44822c.setVisibility(0);
            this.f44822c.e();
        } else {
            this.f44822c.f(true);
            this.f44822c.setVisibility(8);
        }
    }

    public void c(Context context, AttributeSet attributeSet, int i9) {
        int i10;
        float f9;
        int resourceId;
        View viewInflate = View.inflate(context, d.f5226a, this);
        setClipChildren(false);
        this.f44821a = (CircleImageView) viewInflate.findViewById(c.f5224a);
        this.f44822c = (ProgressRingView) viewInflate.findViewById(c.f5225b);
        this.f44821a.setFabViewListener(this);
        this.f44822c.setFabViewListener(this);
        int i11 = DefaultRenderer.BACKGROUND_COLOR;
        int integer = 4000;
        float f10 = 0.0f;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.f5227a);
            int color = typedArrayObtainStyledAttributes.getColor(e.f5236j, DefaultRenderer.BACKGROUND_COLOR);
            int color2 = typedArrayObtainStyledAttributes.getColor(e.f5240n, DefaultRenderer.BACKGROUND_COLOR);
            f10 = typedArrayObtainStyledAttributes.getFloat(e.f5230d, 0.0f);
            f9 = typedArrayObtainStyledAttributes.getFloat(e.f5229c, 100.0f);
            this.f44824e = typedArrayObtainStyledAttributes.getBoolean(e.f5231e, false);
            this.f44825f = typedArrayObtainStyledAttributes.getBoolean(e.f5237k, true);
            integer = typedArrayObtainStyledAttributes.getInteger(e.f5232f, 4000);
            resourceId = typedArrayObtainStyledAttributes.getResourceId(e.f5228b, -1);
            this.f44823d = typedArrayObtainStyledAttributes.getFloat(e.f5241o, this.f44823d);
            this.f44826g = typedArrayObtainStyledAttributes.getResourceId(e.f5238l, b.f5223a);
            this.f44827h = typedArrayObtainStyledAttributes.getBoolean(e.f5242p, false);
            this.f44828i = typedArrayObtainStyledAttributes.getBoolean(e.f5239m, false);
            this.f44821a.setShowShadow(typedArrayObtainStyledAttributes.getBoolean(e.f5243q, true));
            typedArrayObtainStyledAttributes.recycle();
            i10 = color2;
            i11 = color;
        } else {
            i10 = DefaultRenderer.BACKGROUND_COLOR;
            f9 = 0.0f;
            resourceId = -1;
        }
        this.f44821a.setColor(i11);
        this.f44821a.setShowEndBitmap(this.f44827h);
        this.f44821a.setRingWidthRatio(this.f44823d);
        this.f44822c.setProgressColor(i10);
        this.f44822c.setProgress(f10);
        this.f44822c.setMaxProgress(f9);
        this.f44822c.setAutostartanim(this.f44825f);
        this.f44822c.setAnimDuration(integer);
        this.f44822c.setRingWidthRatio(this.f44823d);
        this.f44822c.setIndeterminate(this.f44824e);
        if (resourceId != -1) {
            this.f44821a.f(resourceId, this.f44826g);
        }
    }

    public void d(boolean z9) {
        this.f44821a.i(z9);
    }

    public void e(boolean z9) {
        this.f44821a.setShowShadow(z9);
        invalidate();
    }

    public void setColor(int i9) {
        this.f44821a.setColor(i9);
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        this.f44821a.setEnabled(z9);
        this.f44822c.setEnabled(z9);
    }

    public void setIndeterminate(boolean z9) {
        this.f44824e = z9;
        this.f44822c.setIndeterminate(z9);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f44822c.setOnClickListener(onClickListener);
        this.f44821a.setOnClickListener(onClickListener);
    }

    public void setProgress(float f9) {
        this.f44822c.setProgress(f9);
    }

    public void setProgressColor(int i9) {
        this.f44822c.setProgressColor(i9);
    }

    public void setShadow(boolean z9) {
        this.f44821a.setShowShadow(z9);
    }
}
