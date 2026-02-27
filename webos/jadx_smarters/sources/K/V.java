package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import f.C1750a;
import g.AbstractC1793c;
import g.AbstractC1794d;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s.C2700f;
import s.C2701g;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static V f43235i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f43237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s.i f43238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s.j f43239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap f43240d = new WeakHashMap(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f43241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f43242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f43243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f43234h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f43236j = new c(6);

    public static class a implements e {
        @Override // k.V.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1750a.l(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e9) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e9);
                return null;
            }
        }
    }

    public static class b implements e {
        @Override // k.V.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return L0.b.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e9) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e9);
                return null;
            }
        }
    }

    public static class c extends C2701g {
        public c(int i9) {
            super(i9);
        }

        public static int b(int i9, PorterDuff.Mode mode) {
            return ((i9 + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter c(int i9, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(b(i9, mode)));
        }

        public PorterDuffColorFilter d(int i9, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(b(i9, mode)), porterDuffColorFilter);
        }
    }

    public static class d implements e {
        @Override // k.V.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    AbstractC1793c.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e9) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e9);
                }
            }
            return null;
        }
    }

    public interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface f {
        ColorStateList a(Context context, int i9);

        boolean b(Context context, int i9, Drawable drawable);

        PorterDuff.Mode c(int i9);

        Drawable d(V v9, Context context, int i9);

        boolean e(Context context, int i9, Drawable drawable);
    }

    public static class g implements e {
        @Override // k.V.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return L0.g.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e9) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e9);
                return null;
            }
        }
    }

    public static long e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    public static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized V h() {
        try {
            if (f43235i == null) {
                V v9 = new V();
                f43235i = v9;
                p(v9);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f43235i;
    }

    public static synchronized PorterDuffColorFilter l(int i9, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterC;
        c cVar = f43236j;
        porterDuffColorFilterC = cVar.c(i9, mode);
        if (porterDuffColorFilterC == null) {
            porterDuffColorFilterC = new PorterDuffColorFilter(i9, mode);
            cVar.d(i9, mode, porterDuffColorFilterC);
        }
        return porterDuffColorFilterC;
    }

    public static void p(V v9) {
        if (Build.VERSION.SDK_INT < 24) {
            v9.a("vector", new g());
            v9.a("animated-vector", new b());
            v9.a("animated-selector", new a());
            v9.a("drawable", new d());
        }
    }

    public static boolean q(Drawable drawable) {
        return (drawable instanceof L0.g) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    public static void w(Drawable drawable, b0 b0Var, int[] iArr) {
        int[] state = drawable.getState();
        if (M.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z9 = b0Var.f43301d;
        if (z9 || b0Var.f43300c) {
            drawable.setColorFilter(g(z9 ? b0Var.f43298a : null, b0Var.f43300c ? b0Var.f43299b : f43234h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final void a(String str, e eVar) {
        if (this.f43238b == null) {
            this.f43238b = new s.i();
        }
        this.f43238b.put(str, eVar);
    }

    public final synchronized boolean b(Context context, long j9, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            C2700f c2700f = (C2700f) this.f43240d.get(context);
            if (c2700f == null) {
                c2700f = new C2700f();
                this.f43240d.put(context, c2700f);
            }
            c2700f.k(j9, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(Context context, int i9, ColorStateList colorStateList) {
        if (this.f43237a == null) {
            this.f43237a = new WeakHashMap();
        }
        s.j jVar = (s.j) this.f43237a.get(context);
        if (jVar == null) {
            jVar = new s.j();
            this.f43237a.put(context, jVar);
        }
        jVar.b(i9, colorStateList);
    }

    public final void d(Context context) {
        if (this.f43242f) {
            return;
        }
        this.f43242f = true;
        Drawable drawableJ = j(context, AbstractC1794d.f40938a);
        if (drawableJ == null || !q(drawableJ)) {
            this.f43242f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    public final Drawable f(Context context, int i9) {
        if (this.f43241e == null) {
            this.f43241e = new TypedValue();
        }
        TypedValue typedValue = this.f43241e;
        context.getResources().getValue(i9, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        f fVar = this.f43243g;
        Drawable drawableD = fVar == null ? null : fVar.d(this, context, i9);
        if (drawableD != null) {
            drawableD.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, jE, drawableD);
        }
        return drawableD;
    }

    public final synchronized Drawable i(Context context, long j9) {
        C2700f c2700f = (C2700f) this.f43240d.get(context);
        if (c2700f == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c2700f.g(j9);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c2700f.l(j9);
        }
        return null;
    }

    public synchronized Drawable j(Context context, int i9) {
        return k(context, i9, false);
    }

    public synchronized Drawable k(Context context, int i9, boolean z9) {
        Drawable drawableR;
        try {
            d(context);
            drawableR = r(context, i9);
            if (drawableR == null) {
                drawableR = f(context, i9);
            }
            if (drawableR == null) {
                drawableR = E.b.getDrawable(context, i9);
            }
            if (drawableR != null) {
                drawableR = v(context, i9, z9, drawableR);
            }
            if (drawableR != null) {
                M.b(drawableR);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableR;
    }

    public synchronized ColorStateList m(Context context, int i9) {
        ColorStateList colorStateListN;
        colorStateListN = n(context, i9);
        if (colorStateListN == null) {
            f fVar = this.f43243g;
            colorStateListN = fVar == null ? null : fVar.a(context, i9);
            if (colorStateListN != null) {
                c(context, i9, colorStateListN);
            }
        }
        return colorStateListN;
    }

    public final ColorStateList n(Context context, int i9) {
        s.j jVar;
        WeakHashMap weakHashMap = this.f43237a;
        if (weakHashMap == null || (jVar = (s.j) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) jVar.g(i9);
    }

    public PorterDuff.Mode o(int i9) {
        f fVar = this.f43243g;
        if (fVar == null) {
            return null;
        }
        return fVar.c(i9);
    }

    public final Drawable r(Context context, int i9) {
        int next;
        s.i iVar = this.f43238b;
        if (iVar == null || iVar.isEmpty()) {
            return null;
        }
        s.j jVar = this.f43239c;
        if (jVar != null) {
            String str = (String) jVar.g(i9);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f43238b.get(str) == null)) {
                return null;
            }
        } else {
            this.f43239c = new s.j();
        }
        if (this.f43241e == null) {
            this.f43241e = new TypedValue();
        }
        TypedValue typedValue = this.f43241e;
        Resources resources = context.getResources();
        resources.getValue(i9, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i9);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f43239c.b(i9, name);
                e eVar = (e) this.f43238b.get(name);
                if (eVar != null) {
                    drawableI = eVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableI != null) {
                    drawableI.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, jE, drawableI);
                }
            } catch (Exception e9) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e9);
            }
        }
        if (drawableI == null) {
            this.f43239c.b(i9, "appcompat_skip_skip");
        }
        return drawableI;
    }

    public synchronized void s(Context context) {
        C2700f c2700f = (C2700f) this.f43240d.get(context);
        if (c2700f != null) {
            c2700f.d();
        }
    }

    public synchronized Drawable t(Context context, l0 l0Var, int i9) {
        try {
            Drawable drawableR = r(context, i9);
            if (drawableR == null) {
                drawableR = l0Var.a(i9);
            }
            if (drawableR == null) {
                return null;
            }
            return v(context, i9, false, drawableR);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void u(f fVar) {
        this.f43243g = fVar;
    }

    public final Drawable v(Context context, int i9, boolean z9, Drawable drawable) {
        ColorStateList colorStateListM = m(context, i9);
        if (colorStateListM == null) {
            f fVar = this.f43243g;
            if ((fVar == null || !fVar.e(context, i9, drawable)) && !x(context, i9, drawable) && z9) {
                return null;
            }
            return drawable;
        }
        if (M.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable drawableR = H.a.r(drawable);
        H.a.o(drawableR, colorStateListM);
        PorterDuff.Mode modeO = o(i9);
        if (modeO == null) {
            return drawableR;
        }
        H.a.p(drawableR, modeO);
        return drawableR;
    }

    public boolean x(Context context, int i9, Drawable drawable) {
        f fVar = this.f43243g;
        return fVar != null && fVar.b(context, i9, drawable);
    }
}
