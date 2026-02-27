package k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import c.AbstractC1238a;

/* JADX INFO: renamed from: k.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2106a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0361a f43282a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f43283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionMenuView f43284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.appcompat.widget.a f43285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public P.S f43287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f43288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f43289i;

    /* JADX INFO: renamed from: k.a$a, reason: collision with other inner class name */
    public class C0361a implements P.T {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f43290a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f43291b;

        public C0361a() {
        }

        @Override // P.T
        public void a(View view) {
            this.f43290a = true;
        }

        @Override // P.T
        public void b(View view) {
            if (this.f43290a) {
                return;
            }
            AbstractC2106a abstractC2106a = AbstractC2106a.this;
            abstractC2106a.f43287g = null;
            AbstractC2106a.super.setVisibility(this.f43291b);
        }

        @Override // P.T
        public void c(View view) {
            AbstractC2106a.super.setVisibility(0);
            this.f43290a = false;
        }

        public C0361a d(P.S s9, int i9) {
            AbstractC2106a.this.f43287g = s9;
            this.f43291b = i9;
            return this;
        }
    }

    public AbstractC2106a(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f43282a = new C0361a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(AbstractC1238a.f17742a, typedValue, true) || typedValue.resourceId == 0) {
            this.f43283c = context;
        } else {
            this.f43283c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int d(int i9, int i10, boolean z9) {
        return z9 ? i9 - i10 : i9 + i10;
    }

    public int c(View view, int i9, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE), i10);
        return Math.max(0, (i9 - view.getMeasuredWidth()) - i11);
    }

    public int e(View view, int i9, int i10, int i11, boolean z9) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i12 = i10 + ((i11 - measuredHeight) / 2);
        if (z9) {
            view.layout(i9 - measuredWidth, i12, i9, measuredHeight + i12);
        } else {
            view.layout(i9, i12, i9 + measuredWidth, measuredHeight + i12);
        }
        return z9 ? -measuredWidth : measuredWidth;
    }

    public P.S f(int i9, long j9) {
        P.S sB;
        P.S s9 = this.f43287g;
        if (s9 != null) {
            s9.c();
        }
        if (i9 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            sB = P.L.e(this).b(1.0f);
        } else {
            sB = P.L.e(this).b(0.0f);
        }
        sB.h(j9);
        sB.j(this.f43282a.d(sB, i9));
        return sB;
    }

    public int getAnimatedVisibility() {
        return this.f43287g != null ? this.f43282a.f43291b : getVisibility();
    }

    public int getContentHeight() {
        return this.f43286f;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, c.j.f18046a, AbstractC1238a.f17744c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(c.j.f18093j, 0));
        typedArrayObtainStyledAttributes.recycle();
        androidx.appcompat.widget.a aVar = this.f43285e;
        if (aVar != null) {
            aVar.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f43289i = false;
        }
        if (!this.f43289i) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f43289i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f43289i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f43288h = false;
        }
        if (!this.f43288h) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f43288h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f43288h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i9);

    @Override // android.view.View
    public void setVisibility(int i9) {
        if (i9 != getVisibility()) {
            P.S s9 = this.f43287g;
            if (s9 != null) {
                s9.c();
            }
            super.setVisibility(i9);
        }
    }
}
