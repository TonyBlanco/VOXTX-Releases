package U4;

import P.L;
import R4.f;
import R4.j;
import R4.k;
import U4.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import f5.s;
import f5.u;
import i5.C1894d;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import l5.C2198g;

/* JADX INFO: loaded from: classes3.dex */
public class a extends Drawable implements s.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f9766o = k.f8857k;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f9767p = R4.b.f8668c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f9768a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2198g f9769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f9770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f9771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f9772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f9773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f9774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9775i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f9776j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f9777k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f9778l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public WeakReference f9779m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public WeakReference f9780n;

    /* JADX INFO: renamed from: U4.a$a, reason: collision with other inner class name */
    public class RunnableC0124a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f9781a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f9782c;

        public RunnableC0124a(View view, FrameLayout frameLayout) {
            this.f9781a = view;
            this.f9782c = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.y(this.f9781a, this.f9782c);
        }
    }

    public a(Context context, int i9, int i10, int i11, c.a aVar) {
        this.f9768a = new WeakReference(context);
        u.c(context);
        this.f9771e = new Rect();
        this.f9769c = new C2198g();
        s sVar = new s(this);
        this.f9770d = sVar;
        sVar.e().setTextAlign(Paint.Align.CENTER);
        v(k.f8849c);
        this.f9772f = new c(context, i9, i10, i11, aVar);
        t();
    }

    public static a c(Context context) {
        return new a(context, 0, f9767p, f9766o, null);
    }

    private void u(C1894d c1894d) {
        Context context;
        if (this.f9770d.d() == c1894d || (context = (Context) this.f9768a.get()) == null) {
            return;
        }
        this.f9770d.h(c1894d, context);
        z();
    }

    private void v(int i9) {
        Context context = (Context) this.f9768a.get();
        if (context == null) {
            return;
        }
        u(new C1894d(context, i9));
    }

    public static void x(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    public final void A() {
        this.f9775i = ((int) Math.pow(10.0d, ((double) h()) - 1.0d)) - 1;
    }

    @Override // f5.s.b
    public void a() {
        invalidateSelf();
    }

    public final void b(Context context, Rect rect, View view) {
        float f9;
        int iK = k();
        int iF = this.f9772f.f();
        this.f9774h = (iF == 8388691 || iF == 8388693) ? rect.bottom - iK : rect.top + iK;
        if (i() <= 9) {
            f9 = !l() ? this.f9772f.f9786c : this.f9772f.f9787d;
            this.f9776j = f9;
            this.f9778l = f9;
        } else {
            float f10 = this.f9772f.f9787d;
            this.f9776j = f10;
            this.f9778l = f10;
            f9 = (this.f9770d.f(e()) / 2.0f) + this.f9772f.f9788e;
        }
        this.f9777k = f9;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(l() ? R4.d.f8705D : R4.d.f8702A);
        int iJ = j();
        int iF2 = this.f9772f.f();
        this.f9773g = (iF2 == 8388659 || iF2 == 8388691 ? L.E(view) != 0 : L.E(view) == 0) ? ((rect.right + this.f9777k) - dimensionPixelSize) - iJ : (rect.left - this.f9777k) + dimensionPixelSize + iJ;
    }

    public final void d(Canvas canvas) {
        Rect rect = new Rect();
        String strE = e();
        this.f9770d.e().getTextBounds(strE, 0, strE.length(), rect);
        canvas.drawText(strE, this.f9773g, this.f9774h + (rect.height() / 2), this.f9770d.e());
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f9769c.draw(canvas);
        if (l()) {
            d(canvas);
        }
    }

    public final String e() {
        if (i() <= this.f9775i) {
            return NumberFormat.getInstance(this.f9772f.o()).format(i());
        }
        Context context = (Context) this.f9768a.get();
        return context == null ? "" : String.format(this.f9772f.o(), context.getString(j.f8838l), Integer.valueOf(this.f9775i), "+");
    }

    public CharSequence f() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!l()) {
            return this.f9772f.i();
        }
        if (this.f9772f.j() == 0 || (context = (Context) this.f9768a.get()) == null) {
            return null;
        }
        return i() <= this.f9775i ? context.getResources().getQuantityString(this.f9772f.j(), i(), Integer.valueOf(i())) : context.getString(this.f9772f.h(), Integer.valueOf(this.f9775i));
    }

    public FrameLayout g() {
        WeakReference weakReference = this.f9780n;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f9772f.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f9771e.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f9771e.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public int h() {
        return this.f9772f.m();
    }

    public int i() {
        if (l()) {
            return this.f9772f.n();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public final int j() {
        return (l() ? this.f9772f.k() : this.f9772f.l()) + this.f9772f.b();
    }

    public final int k() {
        return (l() ? this.f9772f.p() : this.f9772f.q()) + this.f9772f.c();
    }

    public boolean l() {
        return this.f9772f.r();
    }

    public final void m() {
        this.f9770d.e().setAlpha(getAlpha());
        invalidateSelf();
    }

    public final void n() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f9772f.e());
        if (this.f9769c.x() != colorStateListValueOf) {
            this.f9769c.W(colorStateListValueOf);
            invalidateSelf();
        }
    }

    public final void o() {
        WeakReference weakReference = this.f9779m;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f9779m.get();
        WeakReference weakReference2 = this.f9780n;
        y(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
    }

    @Override // android.graphics.drawable.Drawable, f5.s.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final void p() {
        this.f9770d.e().setColor(this.f9772f.g());
        invalidateSelf();
    }

    public final void q() {
        A();
        this.f9770d.i(true);
        z();
        invalidateSelf();
    }

    public final void r() {
        this.f9770d.i(true);
        z();
        invalidateSelf();
    }

    public final void s() {
        boolean zS = this.f9772f.s();
        setVisible(zS, false);
        if (!d.f9807a || g() == null || zS) {
            return;
        }
        ((ViewGroup) g().getParent()).invalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        this.f9772f.u(i9);
        m();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void t() {
        q();
        r();
        m();
        n();
        p();
        o();
        z();
        s();
    }

    public final void w(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != f.f8796t) {
            WeakReference weakReference = this.f9780n;
            if (weakReference == null || weakReference.get() != viewGroup) {
                x(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(f.f8796t);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int iIndexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(iIndexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, iIndexOfChild);
                this.f9780n = new WeakReference(frameLayout);
                frameLayout.post(new RunnableC0124a(view, frameLayout));
            }
        }
    }

    public void y(View view, FrameLayout frameLayout) {
        this.f9779m = new WeakReference(view);
        boolean z9 = d.f9807a;
        if (z9 && frameLayout == null) {
            w(view);
        } else {
            this.f9780n = new WeakReference(frameLayout);
        }
        if (!z9) {
            x(view);
        }
        z();
        invalidateSelf();
    }

    public final void z() {
        Context context = (Context) this.f9768a.get();
        WeakReference weakReference = this.f9779m;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f9771e);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference weakReference2 = this.f9780n;
        ViewGroup viewGroup = weakReference2 != null ? (FrameLayout) weakReference2.get() : null;
        if (viewGroup != null || d.f9807a) {
            if (viewGroup == null) {
                viewGroup = (ViewGroup) view.getParent();
            }
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        b(context, rect2, view);
        d.d(this.f9771e, this.f9773g, this.f9774h, this.f9777k, this.f9778l);
        this.f9769c.T(this.f9776j);
        if (rect.equals(this.f9771e)) {
            return;
        }
        this.f9769c.setBounds(this.f9771e);
    }
}
