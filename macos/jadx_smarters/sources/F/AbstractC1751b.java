package f;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;

/* JADX INFO: renamed from: f.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1751b extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f40483a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f40484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f40485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f40486e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f40488g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f40490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Runnable f40491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f40492k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f40493l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f40494m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40487f = 255;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f40489h = -1;

    /* JADX INFO: renamed from: f.b$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1751b.this.a(true);
            AbstractC1751b.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: f.b$b, reason: collision with other inner class name */
    public static class C0325b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* JADX INFO: renamed from: f.b$c */
    public static class c implements Drawable.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable.Callback f40496a;

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f40496a;
            this.f40496a = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f40496a = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j9) {
            Drawable.Callback callback = this.f40496a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j9);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f40496a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: renamed from: f.b$d */
    public static abstract class d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f40497A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f40498B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public boolean f40499C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public ColorFilter f40500D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public boolean f40501E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public ColorStateList f40502F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public PorterDuff.Mode f40503G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public boolean f40504H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public boolean f40505I;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC1751b f40506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Resources f40507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f40508c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f40509d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f40510e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SparseArray f40511f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Drawable[] f40512g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f40513h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f40514i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f40515j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Rect f40516k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f40517l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f40518m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f40519n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f40520o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f40521p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f40522q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f40523r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f40524s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f40525t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f40526u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f40527v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f40528w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f40529x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public boolean f40530y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f40531z;

        public d(d dVar, AbstractC1751b abstractC1751b, Resources resources) {
            this.f40514i = false;
            this.f40517l = false;
            this.f40529x = true;
            this.f40497A = 0;
            this.f40498B = 0;
            this.f40506a = abstractC1751b;
            this.f40507b = resources != null ? resources : dVar != null ? dVar.f40507b : null;
            int iF = AbstractC1751b.f(resources, dVar != null ? dVar.f40508c : 0);
            this.f40508c = iF;
            if (dVar == null) {
                this.f40512g = new Drawable[10];
                this.f40513h = 0;
                return;
            }
            this.f40509d = dVar.f40509d;
            this.f40510e = dVar.f40510e;
            this.f40527v = true;
            this.f40528w = true;
            this.f40514i = dVar.f40514i;
            this.f40517l = dVar.f40517l;
            this.f40529x = dVar.f40529x;
            this.f40530y = dVar.f40530y;
            this.f40531z = dVar.f40531z;
            this.f40497A = dVar.f40497A;
            this.f40498B = dVar.f40498B;
            this.f40499C = dVar.f40499C;
            this.f40500D = dVar.f40500D;
            this.f40501E = dVar.f40501E;
            this.f40502F = dVar.f40502F;
            this.f40503G = dVar.f40503G;
            this.f40504H = dVar.f40504H;
            this.f40505I = dVar.f40505I;
            if (dVar.f40508c == iF) {
                if (dVar.f40515j) {
                    this.f40516k = dVar.f40516k != null ? new Rect(dVar.f40516k) : null;
                    this.f40515j = true;
                }
                if (dVar.f40518m) {
                    this.f40519n = dVar.f40519n;
                    this.f40520o = dVar.f40520o;
                    this.f40521p = dVar.f40521p;
                    this.f40522q = dVar.f40522q;
                    this.f40518m = true;
                }
            }
            if (dVar.f40523r) {
                this.f40524s = dVar.f40524s;
                this.f40523r = true;
            }
            if (dVar.f40525t) {
                this.f40526u = dVar.f40526u;
                this.f40525t = true;
            }
            Drawable[] drawableArr = dVar.f40512g;
            this.f40512g = new Drawable[drawableArr.length];
            this.f40513h = dVar.f40513h;
            SparseArray sparseArray = dVar.f40511f;
            this.f40511f = sparseArray != null ? sparseArray.clone() : new SparseArray(this.f40513h);
            int i9 = this.f40513h;
            for (int i10 = 0; i10 < i9; i10++) {
                Drawable drawable = drawableArr[i10];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f40511f.put(i10, constantState);
                    } else {
                        this.f40512g[i10] = drawableArr[i10];
                    }
                }
            }
        }

        public final int a(Drawable drawable) {
            int i9 = this.f40513h;
            if (i9 >= this.f40512g.length) {
                o(i9, i9 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f40506a);
            this.f40512g[i9] = drawable;
            this.f40513h++;
            this.f40510e = drawable.getChangingConfigurations() | this.f40510e;
            p();
            this.f40516k = null;
            this.f40515j = false;
            this.f40518m = false;
            this.f40527v = false;
            return i9;
        }

        public final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i9 = this.f40513h;
                Drawable[] drawableArr = this.f40512g;
                for (int i10 = 0; i10 < i9; i10++) {
                    Drawable drawable = drawableArr[i10];
                    if (drawable != null && H.a.b(drawable)) {
                        H.a.a(drawableArr[i10], theme);
                        this.f40510e |= drawableArr[i10].getChangingConfigurations();
                    }
                }
                y(C0325b.c(theme));
            }
        }

        public boolean c() {
            if (this.f40527v) {
                return this.f40528w;
            }
            e();
            this.f40527v = true;
            int i9 = this.f40513h;
            Drawable[] drawableArr = this.f40512g;
            for (int i10 = 0; i10 < i9; i10++) {
                if (drawableArr[i10].getConstantState() == null) {
                    this.f40528w = false;
                    return false;
                }
            }
            this.f40528w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i9 = this.f40513h;
            Drawable[] drawableArr = this.f40512g;
            for (int i10 = 0; i10 < i9; i10++) {
                Drawable drawable = drawableArr[i10];
                if (drawable == null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f40511f.get(i10);
                    if (constantState != null && C0325b.a(constantState)) {
                        return true;
                    }
                } else if (H.a.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        public void d() {
            this.f40518m = true;
            e();
            int i9 = this.f40513h;
            Drawable[] drawableArr = this.f40512g;
            this.f40520o = -1;
            this.f40519n = -1;
            this.f40522q = 0;
            this.f40521p = 0;
            for (int i10 = 0; i10 < i9; i10++) {
                Drawable drawable = drawableArr[i10];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f40519n) {
                    this.f40519n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f40520o) {
                    this.f40520o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f40521p) {
                    this.f40521p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f40522q) {
                    this.f40522q = minimumHeight;
                }
            }
        }

        public final void e() {
            SparseArray sparseArray = this.f40511f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i9 = 0; i9 < size; i9++) {
                    this.f40512g[this.f40511f.keyAt(i9)] = s(((Drawable.ConstantState) this.f40511f.valueAt(i9)).newDrawable(this.f40507b));
                }
                this.f40511f = null;
            }
        }

        public final int f() {
            return this.f40512g.length;
        }

        public final Drawable g(int i9) {
            int iIndexOfKey;
            Drawable drawable = this.f40512g[i9];
            if (drawable != null) {
                return drawable;
            }
            SparseArray sparseArray = this.f40511f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i9)) < 0) {
                return null;
            }
            Drawable drawableS = s(((Drawable.ConstantState) this.f40511f.valueAt(iIndexOfKey)).newDrawable(this.f40507b));
            this.f40512g[i9] = drawableS;
            this.f40511f.removeAt(iIndexOfKey);
            if (this.f40511f.size() == 0) {
                this.f40511f = null;
            }
            return drawableS;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f40509d | this.f40510e;
        }

        public final int h() {
            return this.f40513h;
        }

        public final int i() {
            if (!this.f40518m) {
                d();
            }
            return this.f40520o;
        }

        public final int j() {
            if (!this.f40518m) {
                d();
            }
            return this.f40522q;
        }

        public final int k() {
            if (!this.f40518m) {
                d();
            }
            return this.f40521p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f40514i) {
                return null;
            }
            Rect rect2 = this.f40516k;
            if (rect2 != null || this.f40515j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i9 = this.f40513h;
            Drawable[] drawableArr = this.f40512g;
            for (int i10 = 0; i10 < i9; i10++) {
                if (drawableArr[i10].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i11 = rect3.left;
                    if (i11 > rect.left) {
                        rect.left = i11;
                    }
                    int i12 = rect3.top;
                    if (i12 > rect.top) {
                        rect.top = i12;
                    }
                    int i13 = rect3.right;
                    if (i13 > rect.right) {
                        rect.right = i13;
                    }
                    int i14 = rect3.bottom;
                    if (i14 > rect.bottom) {
                        rect.bottom = i14;
                    }
                }
            }
            this.f40515j = true;
            this.f40516k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f40518m) {
                d();
            }
            return this.f40519n;
        }

        public final int n() {
            if (this.f40523r) {
                return this.f40524s;
            }
            e();
            int i9 = this.f40513h;
            Drawable[] drawableArr = this.f40512g;
            int opacity = i9 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i10 = 1; i10 < i9; i10++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i10].getOpacity());
            }
            this.f40524s = opacity;
            this.f40523r = true;
            return opacity;
        }

        public void o(int i9, int i10) {
            Drawable[] drawableArr = new Drawable[i10];
            Drawable[] drawableArr2 = this.f40512g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i9);
            }
            this.f40512g = drawableArr;
        }

        public void p() {
            this.f40523r = false;
            this.f40525t = false;
        }

        public final boolean q() {
            return this.f40517l;
        }

        public abstract void r();

        public final Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                H.a.m(drawable, this.f40531z);
            }
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.f40506a);
            return drawableMutate;
        }

        public final void t(boolean z9) {
            this.f40517l = z9;
        }

        public final void u(int i9) {
            this.f40497A = i9;
        }

        public final void v(int i9) {
            this.f40498B = i9;
        }

        public final boolean w(int i9, int i10) {
            int i11 = this.f40513h;
            Drawable[] drawableArr = this.f40512g;
            boolean z9 = false;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                if (drawable != null) {
                    boolean zM = Build.VERSION.SDK_INT >= 23 ? H.a.m(drawable, i9) : false;
                    if (i12 == i10) {
                        z9 = zM;
                    }
                }
            }
            this.f40531z = i9;
            return z9;
        }

        public final void x(boolean z9) {
            this.f40514i = z9;
        }

        public final void y(Resources resources) {
            if (resources != null) {
                this.f40507b = resources;
                int iF = AbstractC1751b.f(resources, this.f40508c);
                int i9 = this.f40508c;
                this.f40508c = iF;
                if (i9 != iF) {
                    this.f40518m = false;
                    this.f40515j = false;
                }
            }
        }
    }

    public static int f(Resources resources, int i9) {
        if (resources != null) {
            i9 = resources.getDisplayMetrics().densityDpi;
        }
        if (i9 == 0) {
            return 160;
        }
        return i9;
    }

    public void a(boolean z9) {
        boolean z10;
        boolean z11 = true;
        this.f40488g = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable = this.f40485d;
        if (drawable != null) {
            long j9 = this.f40492k;
            if (j9 == 0) {
                z10 = false;
            } else if (j9 <= jUptimeMillis) {
                drawable.setAlpha(this.f40487f);
                this.f40492k = 0L;
                z10 = false;
            } else {
                drawable.setAlpha(((255 - (((int) ((j9 - jUptimeMillis) * 255)) / this.f40483a.f40497A)) * this.f40487f) / 255);
                z10 = true;
            }
        } else {
            this.f40492k = 0L;
            z10 = false;
        }
        Drawable drawable2 = this.f40486e;
        if (drawable2 != null) {
            long j10 = this.f40493l;
            if (j10 == 0) {
                z11 = z10;
            } else if (j10 <= jUptimeMillis) {
                drawable2.setVisible(false, false);
                this.f40486e = null;
                this.f40493l = 0L;
                z11 = z10;
            } else {
                drawable2.setAlpha(((((int) ((j10 - jUptimeMillis) * 255)) / this.f40483a.f40498B) * this.f40487f) / 255);
            }
        } else {
            this.f40493l = 0L;
            z11 = z10;
        }
        if (z9 && z11) {
            scheduleSelf(this.f40491j, jUptimeMillis + 16);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f40483a.b(theme);
    }

    public abstract d b();

    public int c() {
        return this.f40489h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f40483a.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.f40494m == null) {
            this.f40494m = new c();
        }
        drawable.setCallback(this.f40494m.b(drawable.getCallback()));
        try {
            if (this.f40483a.f40497A <= 0 && this.f40488g) {
                drawable.setAlpha(this.f40487f);
            }
            d dVar = this.f40483a;
            if (dVar.f40501E) {
                drawable.setColorFilter(dVar.f40500D);
            } else {
                if (dVar.f40504H) {
                    H.a.o(drawable, dVar.f40502F);
                }
                d dVar2 = this.f40483a;
                if (dVar2.f40505I) {
                    H.a.p(drawable, dVar2.f40503G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f40483a.f40529x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                H.a.m(drawable, H.a.f(this));
            }
            H.a.j(drawable, this.f40483a.f40499C);
            Rect rect = this.f40484c;
            if (rect != null) {
                H.a.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            drawable.setCallback(this.f40494m.a());
        } catch (Throwable th) {
            drawable.setCallback(this.f40494m.a());
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f40485d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f40486e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final boolean e() {
        return isAutoMirrored() && H.a.f(this) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f40489h
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            f.b$d r0 = r9.f40483a
            int r0 = r0.f40498B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f40486e
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f40485d
            if (r0 == 0) goto L29
            r9.f40486e = r0
            f.b$d r0 = r9.f40483a
            int r0 = r0.f40498B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f40493l = r0
            goto L35
        L29:
            r9.f40486e = r4
            r9.f40493l = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f40485d
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            f.b$d r0 = r9.f40483a
            int r1 = r0.f40513h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f40485d = r0
            r9.f40489h = r10
            if (r0 == 0) goto L5a
            f.b$d r10 = r9.f40483a
            int r10 = r10.f40497A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f40492k = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f40485d = r4
            r10 = -1
            r9.f40489h = r10
        L5a:
            long r0 = r9.f40492k
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f40493l
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.f40491j
            if (r0 != 0) goto L73
            f.b$a r0 = new f.b$a
            r0.<init>()
            r9.f40491j = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.a(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: f.AbstractC1751b.g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f40487f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f40483a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f40483a.c()) {
            return null;
        }
        this.f40483a.f40509d = getChangingConfigurations();
        return this.f40483a;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f40485d;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f40484c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f40483a.q()) {
            return this.f40483a.i();
        }
        Drawable drawable = this.f40485d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f40483a.q()) {
            return this.f40483a.m();
        }
        Drawable drawable = this.f40485d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f40483a.q()) {
            return this.f40483a.j();
        }
        Drawable drawable = this.f40485d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f40483a.q()) {
            return this.f40483a.k();
        }
        Drawable drawable = this.f40485d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f40485d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f40483a.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f40485d;
        if (drawable != null) {
            C0325b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect rectL = this.f40483a.l();
        if (rectL != null) {
            rect.set(rectL);
            padding = (rectL.right | ((rectL.left | rectL.top) | rectL.bottom)) != 0;
        } else {
            Drawable drawable = this.f40485d;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (e()) {
            int i9 = rect.left;
            rect.left = rect.right;
            rect.right = i9;
        }
        return padding;
    }

    public void h(d dVar) {
        this.f40483a = dVar;
        int i9 = this.f40489h;
        if (i9 >= 0) {
            Drawable drawableG = dVar.g(i9);
            this.f40485d = drawableG;
            if (drawableG != null) {
                d(drawableG);
            }
        }
        this.f40486e = null;
    }

    public final void i(Resources resources) {
        this.f40483a.y(resources);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f40483a;
        if (dVar != null) {
            dVar.p();
        }
        if (drawable != this.f40485d || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f40483a.f40499C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z9;
        Drawable drawable = this.f40486e;
        boolean z10 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f40486e = null;
            z9 = true;
        } else {
            z9 = false;
        }
        Drawable drawable2 = this.f40485d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f40488g) {
                this.f40485d.setAlpha(this.f40487f);
            }
        }
        if (this.f40493l != 0) {
            this.f40493l = 0L;
            z9 = true;
        }
        if (this.f40492k != 0) {
            this.f40492k = 0L;
        } else {
            z10 = z9;
        }
        if (z10) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f40490i && super.mutate() == this) {
            d dVarB = b();
            dVarB.r();
            h(dVarB);
            this.f40490i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f40486e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f40485d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i9) {
        return this.f40483a.w(i9, c());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i9) {
        Drawable drawable = this.f40486e;
        if (drawable != null) {
            return drawable.setLevel(i9);
        }
        Drawable drawable2 = this.f40485d;
        if (drawable2 != null) {
            return drawable2.setLevel(i9);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j9) {
        if (drawable != this.f40485d || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j9);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        if (this.f40488g && this.f40487f == i9) {
            return;
        }
        this.f40488g = true;
        this.f40487f = i9;
        Drawable drawable = this.f40485d;
        if (drawable != null) {
            if (this.f40492k == 0) {
                drawable.setAlpha(i9);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z9) {
        d dVar = this.f40483a;
        if (dVar.f40499C != z9) {
            dVar.f40499C = z9;
            Drawable drawable = this.f40485d;
            if (drawable != null) {
                H.a.j(drawable, z9);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f40483a;
        dVar.f40501E = true;
        if (dVar.f40500D != colorFilter) {
            dVar.f40500D = colorFilter;
            Drawable drawable = this.f40485d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z9) {
        d dVar = this.f40483a;
        if (dVar.f40529x != z9) {
            dVar.f40529x = z9;
            Drawable drawable = this.f40485d;
            if (drawable != null) {
                drawable.setDither(z9);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f9, float f10) {
        Drawable drawable = this.f40485d;
        if (drawable != null) {
            H.a.k(drawable, f9, f10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i9, int i10, int i11, int i12) {
        Rect rect = this.f40484c;
        if (rect == null) {
            this.f40484c = new Rect(i9, i10, i11, i12);
        } else {
            rect.set(i9, i10, i11, i12);
        }
        Drawable drawable = this.f40485d;
        if (drawable != null) {
            H.a.l(drawable, i9, i10, i11, i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i9) {
        setTintList(ColorStateList.valueOf(i9));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f40483a;
        dVar.f40504H = true;
        if (dVar.f40502F != colorStateList) {
            dVar.f40502F = colorStateList;
            H.a.o(this.f40485d, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f40483a;
        dVar.f40505I = true;
        if (dVar.f40503G != mode) {
            dVar.f40503G = mode;
            H.a.p(this.f40485d, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z9, boolean z10) {
        boolean visible = super.setVisible(z9, z10);
        Drawable drawable = this.f40486e;
        if (drawable != null) {
            drawable.setVisible(z9, z10);
        }
        Drawable drawable2 = this.f40485d;
        if (drawable2 != null) {
            drawable2.setVisible(z9, z10);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f40485d || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
