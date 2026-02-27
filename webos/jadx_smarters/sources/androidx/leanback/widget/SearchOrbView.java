package androidx.leanback.widget;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import g0.AbstractC1796a;
import g0.AbstractC1797b;
import g0.AbstractC1798c;
import g0.AbstractC1799d;
import g0.AbstractC1800e;
import g0.AbstractC1801f;

/* JADX INFO: loaded from: classes.dex */
public class SearchOrbView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View.OnClickListener f15543a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f15544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f15545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f15546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f15547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f15548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f15549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f15550i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f15551j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f15552k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f15553l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ValueAnimator f15554m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15555n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15556o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArgbEvaluator f15557p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ValueAnimator.AnimatorUpdateListener f15558q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f15559r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ValueAnimator.AnimatorUpdateListener f15560s;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SearchOrbView.this.setOrbViewColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SearchOrbView.this.setSearchOrbZ(valueAnimator.getAnimatedFraction());
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15565c;

        public c(int i9, int i10, int i11) {
            this.f15563a = i9;
            this.f15564b = i10 == i9 ? a(i9) : i10;
            this.f15565c = i11;
        }

        public static int a(int i9) {
            return Color.argb((int) ((Color.alpha(i9) * 0.85f) + 38.25f), (int) ((Color.red(i9) * 0.85f) + 38.25f), (int) ((Color.green(i9) * 0.85f) + 38.25f), (int) ((Color.blue(i9) * 0.85f) + 38.25f));
        }
    }

    public SearchOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1796a.f40958c);
    }

    public SearchOrbView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15557p = new ArgbEvaluator();
        this.f15558q = new a();
        this.f15560s = new b();
        Resources resources = context.getResources();
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutResourceId(), (ViewGroup) this, true);
        this.f15544c = viewInflate;
        this.f15545d = viewInflate.findViewById(AbstractC1801f.f41012A);
        this.f15546e = (ImageView) this.f15544c.findViewById(AbstractC1801f.f41026j);
        this.f15549h = context.getResources().getFraction(AbstractC1800e.f41009g, 1, 1);
        this.f15550i = context.getResources().getInteger(g0.g.f41046d);
        this.f15551j = context.getResources().getInteger(g0.g.f41047e);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(AbstractC1798c.f40994v);
        this.f15553l = dimensionPixelSize;
        this.f15552k = context.getResources().getDimensionPixelSize(AbstractC1798c.f40995w);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.l.f41096Z, i9, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(g0.l.f41102c0);
        setOrbIcon(drawable == null ? resources.getDrawable(AbstractC1799d.f40997a) : drawable);
        int color = typedArrayObtainStyledAttributes.getColor(g0.l.f41100b0, resources.getColor(AbstractC1797b.f40959a));
        setOrbColors(new c(color, typedArrayObtainStyledAttributes.getColor(g0.l.f41098a0, color), typedArrayObtainStyledAttributes.getColor(g0.l.f41104d0, 0)));
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClipChildren(false);
        setOnClickListener(this);
        setSoundEffectsEnabled(false);
        setSearchOrbZ(0.0f);
        P.L.O0(this.f15546e, dimensionPixelSize);
    }

    public void a(boolean z9) {
        float f9 = z9 ? this.f15549h : 1.0f;
        this.f15544c.animate().scaleX(f9).scaleY(f9).setDuration(this.f15551j).start();
        d(z9, this.f15551j);
        b(z9);
    }

    public void b(boolean z9) {
        this.f15555n = z9;
        e();
    }

    public void c(float f9) {
        this.f15545d.setScaleX(f9);
        this.f15545d.setScaleY(f9);
    }

    public final void d(boolean z9, int i9) {
        if (this.f15559r == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f15559r = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(this.f15560s);
        }
        if (z9) {
            this.f15559r.start();
        } else {
            this.f15559r.reverse();
        }
        this.f15559r.setDuration(i9);
    }

    public final void e() {
        ValueAnimator valueAnimator = this.f15554m;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f15554m = null;
        }
        if (this.f15555n && this.f15556o) {
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(this.f15557p, Integer.valueOf(this.f15548g.f15563a), Integer.valueOf(this.f15548g.f15564b), Integer.valueOf(this.f15548g.f15563a));
            this.f15554m = valueAnimatorOfObject;
            valueAnimatorOfObject.setRepeatCount(-1);
            this.f15554m.setDuration(this.f15550i * 2);
            this.f15554m.addUpdateListener(this.f15558q);
            this.f15554m.start();
        }
    }

    public float getFocusedZoom() {
        return this.f15549h;
    }

    public int getLayoutResourceId() {
        return g0.h.f41058k;
    }

    public int getOrbColor() {
        return this.f15548g.f15563a;
    }

    public c getOrbColors() {
        return this.f15548g;
    }

    public Drawable getOrbIcon() {
        return this.f15547f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15556o = true;
        e();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f15543a;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f15556o = false;
        e();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z9, int i9, Rect rect) {
        super.onFocusChanged(z9, i9, rect);
        a(z9);
    }

    public void setOnOrbClickedListener(View.OnClickListener onClickListener) {
        this.f15543a = onClickListener;
    }

    public void setOrbColor(int i9) {
        setOrbColors(new c(i9, i9, 0));
    }

    public void setOrbColors(c cVar) {
        this.f15548g = cVar;
        this.f15546e.setColorFilter(cVar.f15565c);
        if (this.f15554m == null) {
            setOrbViewColor(this.f15548g.f15563a);
        } else {
            b(true);
        }
    }

    public void setOrbIcon(Drawable drawable) {
        this.f15547f = drawable;
        this.f15546e.setImageDrawable(drawable);
    }

    public void setOrbViewColor(int i9) {
        if (this.f15545d.getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) this.f15545d.getBackground()).setColor(i9);
        }
    }

    public void setSearchOrbZ(float f9) {
        View view = this.f15545d;
        float f10 = this.f15552k;
        P.L.O0(view, f10 + (f9 * (this.f15553l - f10)));
    }
}
