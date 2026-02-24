package P;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X f6773b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f6774a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Field f6775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Field f6776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static Field f6777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static boolean f6778d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f6775a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f6776b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f6777c = declaredField3;
                declaredField3.setAccessible(true);
                f6778d = true;
            } catch (ReflectiveOperationException e9) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e9.getMessage(), e9);
            }
        }

        public static X a(View view) {
            if (f6778d && view.isAttachedToWindow()) {
                try {
                    Object obj = f6775a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f6776b.get(obj);
                        Rect rect2 = (Rect) f6777c.get(obj);
                        if (rect != null && rect2 != null) {
                            X xA = new b().b(G.b.c(rect)).c(G.b.c(rect2)).a();
                            xA.r(xA);
                            xA.d(view.getRootView());
                            return xA;
                        }
                    }
                } catch (IllegalAccessException e9) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e9.getMessage(), e9);
                }
            }
            return null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f6779a;

        public b() {
            int i9 = Build.VERSION.SDK_INT;
            this.f6779a = i9 >= 30 ? new e() : i9 >= 29 ? new d() : new c();
        }

        public b(X x9) {
            int i9 = Build.VERSION.SDK_INT;
            this.f6779a = i9 >= 30 ? new e(x9) : i9 >= 29 ? new d(x9) : new c(x9);
        }

        public X a() {
            return this.f6779a.b();
        }

        public b b(G.b bVar) {
            this.f6779a.d(bVar);
            return this;
        }

        public b c(G.b bVar) {
            this.f6779a.f(bVar);
            return this;
        }
    }

    public static class c extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static Field f6780e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static boolean f6781f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static Constructor f6782g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static boolean f6783h;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WindowInsets f6784c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public G.b f6785d;

        public c() {
            this.f6784c = h();
        }

        public c(X x9) {
            super(x9);
            this.f6784c = x9.t();
        }

        private static WindowInsets h() {
            if (!f6781f) {
                try {
                    f6780e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e9) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e9);
                }
                f6781f = true;
            }
            Field field = f6780e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e10);
                }
            }
            if (!f6783h) {
                try {
                    f6782g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
                }
                f6783h = true;
            }
            Constructor constructor = f6782g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e12);
                }
            }
            return null;
        }

        @Override // P.X.f
        public X b() {
            a();
            X xU = X.u(this.f6784c);
            xU.p(this.f6788b);
            xU.s(this.f6785d);
            return xU;
        }

        @Override // P.X.f
        public void d(G.b bVar) {
            this.f6785d = bVar;
        }

        @Override // P.X.f
        public void f(G.b bVar) {
            WindowInsets windowInsets = this.f6784c;
            if (windowInsets != null) {
                this.f6784c = windowInsets.replaceSystemWindowInsets(bVar.f2104a, bVar.f2105b, bVar.f2106c, bVar.f2107d);
            }
        }
    }

    public static class d extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WindowInsets.Builder f6786c;

        public d() {
            this.f6786c = f0.a();
        }

        public d(X x9) {
            super(x9);
            WindowInsets windowInsetsT = x9.t();
            this.f6786c = windowInsetsT != null ? e0.a(windowInsetsT) : f0.a();
        }

        @Override // P.X.f
        public X b() {
            a();
            X xU = X.u(this.f6786c.build());
            xU.p(this.f6788b);
            return xU;
        }

        @Override // P.X.f
        public void c(G.b bVar) {
            this.f6786c.setMandatorySystemGestureInsets(bVar.e());
        }

        @Override // P.X.f
        public void d(G.b bVar) {
            this.f6786c.setStableInsets(bVar.e());
        }

        @Override // P.X.f
        public void e(G.b bVar) {
            this.f6786c.setSystemGestureInsets(bVar.e());
        }

        @Override // P.X.f
        public void f(G.b bVar) {
            this.f6786c.setSystemWindowInsets(bVar.e());
        }

        @Override // P.X.f
        public void g(G.b bVar) {
            this.f6786c.setTappableElementInsets(bVar.e());
        }
    }

    public static class e extends d {
        public e() {
        }

        public e(X x9) {
            super(x9);
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final X f6787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public G.b[] f6788b;

        public f() {
            this(new X((X) null));
        }

        public f(X x9) {
            this.f6787a = x9;
        }

        public final void a() {
            G.b[] bVarArr = this.f6788b;
            if (bVarArr != null) {
                G.b bVarF = bVarArr[m.a(1)];
                G.b bVarF2 = this.f6788b[m.a(2)];
                if (bVarF2 == null) {
                    bVarF2 = this.f6787a.f(2);
                }
                if (bVarF == null) {
                    bVarF = this.f6787a.f(1);
                }
                f(G.b.a(bVarF, bVarF2));
                G.b bVar = this.f6788b[m.a(16)];
                if (bVar != null) {
                    e(bVar);
                }
                G.b bVar2 = this.f6788b[m.a(32)];
                if (bVar2 != null) {
                    c(bVar2);
                }
                G.b bVar3 = this.f6788b[m.a(64)];
                if (bVar3 != null) {
                    g(bVar3);
                }
            }
        }

        public abstract X b();

        public void c(G.b bVar) {
        }

        public abstract void d(G.b bVar);

        public void e(G.b bVar) {
        }

        public abstract void f(G.b bVar);

        public void g(G.b bVar) {
        }
    }

    public static class g extends l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static boolean f6789h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static Method f6790i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static Class f6791j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static Field f6792k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static Field f6793l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WindowInsets f6794c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public G.b[] f6795d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public G.b f6796e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public X f6797f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public G.b f6798g;

        public g(X x9, g gVar) {
            this(x9, new WindowInsets(gVar.f6794c));
        }

        public g(X x9, WindowInsets windowInsets) {
            super(x9);
            this.f6796e = null;
            this.f6794c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private G.b t(int i9, boolean z9) {
            G.b bVarA = G.b.f2103e;
            for (int i10 = 1; i10 <= 256; i10 <<= 1) {
                if ((i9 & i10) != 0) {
                    bVarA = G.b.a(bVarA, u(i10, z9));
                }
            }
            return bVarA;
        }

        private G.b v() {
            X x9 = this.f6797f;
            return x9 != null ? x9.g() : G.b.f2103e;
        }

        private G.b w(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f6789h) {
                x();
            }
            Method method = f6790i;
            if (method != null && f6791j != null && f6792k != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f6792k.get(f6793l.get(objInvoke));
                    if (rect != null) {
                        return G.b.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e9) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e9.getMessage(), e9);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void x() {
            try {
                f6790i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f6791j = cls;
                f6792k = cls.getDeclaredField("mVisibleInsets");
                f6793l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f6792k.setAccessible(true);
                f6793l.setAccessible(true);
            } catch (ReflectiveOperationException e9) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e9.getMessage(), e9);
            }
            f6789h = true;
        }

        @Override // P.X.l
        public void d(View view) {
            G.b bVarW = w(view);
            if (bVarW == null) {
                bVarW = G.b.f2103e;
            }
            q(bVarW);
        }

        @Override // P.X.l
        public void e(X x9) {
            x9.r(this.f6797f);
            x9.q(this.f6798g);
        }

        @Override // P.X.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f6798g, ((g) obj).f6798g);
            }
            return false;
        }

        @Override // P.X.l
        public G.b g(int i9) {
            return t(i9, false);
        }

        @Override // P.X.l
        public final G.b k() {
            if (this.f6796e == null) {
                this.f6796e = G.b.b(this.f6794c.getSystemWindowInsetLeft(), this.f6794c.getSystemWindowInsetTop(), this.f6794c.getSystemWindowInsetRight(), this.f6794c.getSystemWindowInsetBottom());
            }
            return this.f6796e;
        }

        @Override // P.X.l
        public X m(int i9, int i10, int i11, int i12) {
            b bVar = new b(X.u(this.f6794c));
            bVar.c(X.m(k(), i9, i10, i11, i12));
            bVar.b(X.m(i(), i9, i10, i11, i12));
            return bVar.a();
        }

        @Override // P.X.l
        public boolean o() {
            return this.f6794c.isRound();
        }

        @Override // P.X.l
        public void p(G.b[] bVarArr) {
            this.f6795d = bVarArr;
        }

        @Override // P.X.l
        public void q(G.b bVar) {
            this.f6798g = bVar;
        }

        @Override // P.X.l
        public void r(X x9) {
            this.f6797f = x9;
        }

        public G.b u(int i9, boolean z9) {
            G.b bVarG;
            int i10;
            if (i9 == 1) {
                return z9 ? G.b.b(0, Math.max(v().f2105b, k().f2105b), 0, 0) : G.b.b(0, k().f2105b, 0, 0);
            }
            if (i9 == 2) {
                if (z9) {
                    G.b bVarV = v();
                    G.b bVarI = i();
                    return G.b.b(Math.max(bVarV.f2104a, bVarI.f2104a), 0, Math.max(bVarV.f2106c, bVarI.f2106c), Math.max(bVarV.f2107d, bVarI.f2107d));
                }
                G.b bVarK = k();
                X x9 = this.f6797f;
                bVarG = x9 != null ? x9.g() : null;
                int iMin = bVarK.f2107d;
                if (bVarG != null) {
                    iMin = Math.min(iMin, bVarG.f2107d);
                }
                return G.b.b(bVarK.f2104a, 0, bVarK.f2106c, iMin);
            }
            if (i9 != 8) {
                if (i9 == 16) {
                    return j();
                }
                if (i9 == 32) {
                    return h();
                }
                if (i9 == 64) {
                    return l();
                }
                if (i9 != 128) {
                    return G.b.f2103e;
                }
                X x10 = this.f6797f;
                C0972n c0972nE = x10 != null ? x10.e() : f();
                return c0972nE != null ? G.b.b(c0972nE.b(), c0972nE.d(), c0972nE.c(), c0972nE.a()) : G.b.f2103e;
            }
            G.b[] bVarArr = this.f6795d;
            bVarG = bVarArr != null ? bVarArr[m.a(8)] : null;
            if (bVarG != null) {
                return bVarG;
            }
            G.b bVarK2 = k();
            G.b bVarV2 = v();
            int i11 = bVarK2.f2107d;
            if (i11 > bVarV2.f2107d) {
                return G.b.b(0, 0, 0, i11);
            }
            G.b bVar = this.f6798g;
            return (bVar == null || bVar.equals(G.b.f2103e) || (i10 = this.f6798g.f2107d) <= bVarV2.f2107d) ? G.b.f2103e : G.b.b(0, 0, 0, i10);
        }
    }

    public static class h extends g {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public G.b f6799m;

        public h(X x9, h hVar) {
            super(x9, hVar);
            this.f6799m = null;
            this.f6799m = hVar.f6799m;
        }

        public h(X x9, WindowInsets windowInsets) {
            super(x9, windowInsets);
            this.f6799m = null;
        }

        @Override // P.X.l
        public X b() {
            return X.u(this.f6794c.consumeStableInsets());
        }

        @Override // P.X.l
        public X c() {
            return X.u(this.f6794c.consumeSystemWindowInsets());
        }

        @Override // P.X.l
        public final G.b i() {
            if (this.f6799m == null) {
                this.f6799m = G.b.b(this.f6794c.getStableInsetLeft(), this.f6794c.getStableInsetTop(), this.f6794c.getStableInsetRight(), this.f6794c.getStableInsetBottom());
            }
            return this.f6799m;
        }

        @Override // P.X.l
        public boolean n() {
            return this.f6794c.isConsumed();
        }

        @Override // P.X.l
        public void s(G.b bVar) {
            this.f6799m = bVar;
        }
    }

    public static class i extends h {
        public i(X x9, i iVar) {
            super(x9, iVar);
        }

        public i(X x9, WindowInsets windowInsets) {
            super(x9, windowInsets);
        }

        @Override // P.X.l
        public X a() {
            return X.u(this.f6794c.consumeDisplayCutout());
        }

        @Override // P.X.g, P.X.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f6794c, iVar.f6794c) && Objects.equals(this.f6798g, iVar.f6798g);
        }

        @Override // P.X.l
        public C0972n f() {
            return C0972n.e(this.f6794c.getDisplayCutout());
        }

        @Override // P.X.l
        public int hashCode() {
            return this.f6794c.hashCode();
        }
    }

    public static class j extends i {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public G.b f6800n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public G.b f6801o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public G.b f6802p;

        public j(X x9, j jVar) {
            super(x9, jVar);
            this.f6800n = null;
            this.f6801o = null;
            this.f6802p = null;
        }

        public j(X x9, WindowInsets windowInsets) {
            super(x9, windowInsets);
            this.f6800n = null;
            this.f6801o = null;
            this.f6802p = null;
        }

        @Override // P.X.l
        public G.b h() {
            if (this.f6801o == null) {
                this.f6801o = G.b.d(this.f6794c.getMandatorySystemGestureInsets());
            }
            return this.f6801o;
        }

        @Override // P.X.l
        public G.b j() {
            if (this.f6800n == null) {
                this.f6800n = G.b.d(this.f6794c.getSystemGestureInsets());
            }
            return this.f6800n;
        }

        @Override // P.X.l
        public G.b l() {
            if (this.f6802p == null) {
                this.f6802p = G.b.d(this.f6794c.getTappableElementInsets());
            }
            return this.f6802p;
        }

        @Override // P.X.g, P.X.l
        public X m(int i9, int i10, int i11, int i12) {
            return X.u(this.f6794c.inset(i9, i10, i11, i12));
        }

        @Override // P.X.h, P.X.l
        public void s(G.b bVar) {
        }
    }

    public static class k extends j {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final X f6803q = X.u(WindowInsets.CONSUMED);

        public k(X x9, k kVar) {
            super(x9, kVar);
        }

        public k(X x9, WindowInsets windowInsets) {
            super(x9, windowInsets);
        }

        @Override // P.X.g, P.X.l
        public final void d(View view) {
        }

        @Override // P.X.g, P.X.l
        public G.b g(int i9) {
            return G.b.d(this.f6794c.getInsets(n.a(i9)));
        }
    }

    public static class l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final X f6804b = new b().a().a().b().c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final X f6805a;

        public l(X x9) {
            this.f6805a = x9;
        }

        public X a() {
            return this.f6805a;
        }

        public X b() {
            return this.f6805a;
        }

        public X c() {
            return this.f6805a;
        }

        public void d(View view) {
        }

        public void e(X x9) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return o() == lVar.o() && n() == lVar.n() && O.c.a(k(), lVar.k()) && O.c.a(i(), lVar.i()) && O.c.a(f(), lVar.f());
        }

        public C0972n f() {
            return null;
        }

        public G.b g(int i9) {
            return G.b.f2103e;
        }

        public G.b h() {
            return k();
        }

        public int hashCode() {
            return O.c.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        public G.b i() {
            return G.b.f2103e;
        }

        public G.b j() {
            return k();
        }

        public G.b k() {
            return G.b.f2103e;
        }

        public G.b l() {
            return k();
        }

        public X m(int i9, int i10, int i11, int i12) {
            return f6804b;
        }

        public boolean n() {
            return false;
        }

        public boolean o() {
            return false;
        }

        public void p(G.b[] bVarArr) {
        }

        public void q(G.b bVar) {
        }

        public void r(X x9) {
        }

        public void s(G.b bVar) {
        }
    }

    public static final class m {
        public static int a(int i9) {
            if (i9 == 1) {
                return 0;
            }
            if (i9 == 2) {
                return 1;
            }
            if (i9 == 4) {
                return 2;
            }
            if (i9 == 8) {
                return 3;
            }
            if (i9 == 16) {
                return 4;
            }
            if (i9 == 32) {
                return 5;
            }
            if (i9 == 64) {
                return 6;
            }
            if (i9 == 128) {
                return 7;
            }
            if (i9 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i9);
        }

        public static int b() {
            return 32;
        }

        public static int c() {
            return 7;
        }
    }

    public static final class n {
        public static int a(int i9) {
            int iStatusBars;
            int i10 = 0;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i9 & i11) != 0) {
                    if (i11 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i11 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i11 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i11 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i11 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i11 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i11 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i11 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i10 |= iStatusBars;
                }
            }
            return i10;
        }
    }

    static {
        f6773b = Build.VERSION.SDK_INT >= 30 ? k.f6803q : l.f6804b;
    }

    public X(X x9) {
        if (x9 == null) {
            this.f6774a = new l(this);
            return;
        }
        l lVar = x9.f6774a;
        int i9 = Build.VERSION.SDK_INT;
        this.f6774a = (i9 < 30 || !(lVar instanceof k)) ? (i9 < 29 || !(lVar instanceof j)) ? (i9 < 28 || !(lVar instanceof i)) ? lVar instanceof h ? new h(this, (h) lVar) : lVar instanceof g ? new g(this, (g) lVar) : new l(this) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
        lVar.e(this);
    }

    public X(WindowInsets windowInsets) {
        int i9 = Build.VERSION.SDK_INT;
        this.f6774a = i9 >= 30 ? new k(this, windowInsets) : i9 >= 29 ? new j(this, windowInsets) : i9 >= 28 ? new i(this, windowInsets) : new h(this, windowInsets);
    }

    public static G.b m(G.b bVar, int i9, int i10, int i11, int i12) {
        int iMax = Math.max(0, bVar.f2104a - i9);
        int iMax2 = Math.max(0, bVar.f2105b - i10);
        int iMax3 = Math.max(0, bVar.f2106c - i11);
        int iMax4 = Math.max(0, bVar.f2107d - i12);
        return (iMax == i9 && iMax2 == i10 && iMax3 == i11 && iMax4 == i12) ? bVar : G.b.b(iMax, iMax2, iMax3, iMax4);
    }

    public static X u(WindowInsets windowInsets) {
        return v(windowInsets, null);
    }

    public static X v(WindowInsets windowInsets, View view) {
        X x9 = new X((WindowInsets) O.h.f(windowInsets));
        if (view != null && L.V(view)) {
            x9.r(L.K(view));
            x9.d(view.getRootView());
        }
        return x9;
    }

    public X a() {
        return this.f6774a.a();
    }

    public X b() {
        return this.f6774a.b();
    }

    public X c() {
        return this.f6774a.c();
    }

    public void d(View view) {
        this.f6774a.d(view);
    }

    public C0972n e() {
        return this.f6774a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof X) {
            return O.c.a(this.f6774a, ((X) obj).f6774a);
        }
        return false;
    }

    public G.b f(int i9) {
        return this.f6774a.g(i9);
    }

    public G.b g() {
        return this.f6774a.i();
    }

    public int h() {
        return this.f6774a.k().f2107d;
    }

    public int hashCode() {
        l lVar = this.f6774a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public int i() {
        return this.f6774a.k().f2104a;
    }

    public int j() {
        return this.f6774a.k().f2106c;
    }

    public int k() {
        return this.f6774a.k().f2105b;
    }

    public X l(int i9, int i10, int i11, int i12) {
        return this.f6774a.m(i9, i10, i11, i12);
    }

    public boolean n() {
        return this.f6774a.n();
    }

    public X o(int i9, int i10, int i11, int i12) {
        return new b(this).c(G.b.b(i9, i10, i11, i12)).a();
    }

    public void p(G.b[] bVarArr) {
        this.f6774a.p(bVarArr);
    }

    public void q(G.b bVar) {
        this.f6774a.q(bVar);
    }

    public void r(X x9) {
        this.f6774a.r(x9);
    }

    public void s(G.b bVar) {
        this.f6774a.s(bVar);
    }

    public WindowInsets t() {
        l lVar = this.f6774a;
        if (lVar instanceof g) {
            return ((g) lVar).f6794c;
        }
        return null;
    }
}
