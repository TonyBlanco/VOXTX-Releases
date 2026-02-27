package F;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f1771a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f1772b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f1773c = new Object();

    public static class a {
        public static Drawable a(Resources resources, int i9, Resources.Theme theme) {
            return resources.getDrawable(i9, theme);
        }

        public static Drawable b(Resources resources, int i9, int i10, Resources.Theme theme) {
            return resources.getDrawableForDensity(i9, i10, theme);
        }
    }

    public static class b {
        public static int a(Resources resources, int i9, Resources.Theme theme) {
            return resources.getColor(i9, theme);
        }

        public static ColorStateList b(Resources resources, int i9, Resources.Theme theme) {
            return resources.getColorStateList(i9, theme);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColorStateList f1774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Configuration f1775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1776c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f1774a = colorStateList;
            this.f1775b = configuration;
            this.f1776c = theme == null ? 0 : theme.hashCode();
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f1777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Resources.Theme f1778b;

        public d(Resources resources, Resources.Theme theme) {
            this.f1777a = resources;
            this.f1778b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f1777a.equals(dVar.f1777a) && O.c.a(this.f1778b, dVar.f1778b);
        }

        public int hashCode() {
            return O.c.b(this.f1777a, this.f1778b);
        }
    }

    public static abstract class e {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i9, Handler handler) {
            e(handler).post(new Runnable() { // from class: F.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1784a.f(i9);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: F.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1782a.g(typeface);
                }
            });
        }

        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public abstract void f(int i9);

        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public abstract void g(Typeface typeface);
    }

    public static final class f {

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Object f1779a = new Object();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static Method f1780b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static boolean f1781c;

            /* JADX WARN: Removed duplicated region for block: B:31:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static void a(android.content.res.Resources.Theme r6) {
                /*
                    java.lang.Object r0 = F.h.f.a.f1779a
                    monitor-enter(r0)
                    boolean r1 = F.h.f.a.f1781c     // Catch: java.lang.Throwable -> L17
                    r2 = 0
                    if (r1 != 0) goto L23
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r2)     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    F.h.f.a.f1780b = r3     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    goto L21
                L17:
                    r6 = move-exception
                    goto L39
                L19:
                    r3 = move-exception
                    java.lang.String r4 = "ResourcesCompat"
                    java.lang.String r5 = "Failed to retrieve rebase() method"
                    android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L17
                L21:
                    F.h.f.a.f1781c = r1     // Catch: java.lang.Throwable -> L17
                L23:
                    java.lang.reflect.Method r1 = F.h.f.a.f1780b     // Catch: java.lang.Throwable -> L17
                    if (r1 == 0) goto L37
                    r1.invoke(r6, r2)     // Catch: java.lang.Throwable -> L17 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L2d
                    goto L37
                L2b:
                    r6 = move-exception
                    goto L2e
                L2d:
                    r6 = move-exception
                L2e:
                    java.lang.String r1 = "ResourcesCompat"
                    java.lang.String r3 = "Failed to invoke rebase() method via reflection"
                    android.util.Log.i(r1, r3, r6)     // Catch: java.lang.Throwable -> L17
                    F.h.f.a.f1780b = r2     // Catch: java.lang.Throwable -> L17
                L37:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                    return
                L39:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: F.h.f.a.a(android.content.res.Resources$Theme):void");
            }
        }

        public static class b {
            public static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 29) {
                b.a(theme);
            } else if (i9 >= 23) {
                a.a(theme);
            }
        }
    }

    public static void a(d dVar, int i9, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f1773c) {
            try {
                WeakHashMap weakHashMap = f1772b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i9, new c(colorStateList, dVar.f1777a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.f1776c == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList b(F.h.d r5, int r6) {
        /*
            java.lang.Object r0 = F.h.f1773c
            monitor-enter(r0)
            java.util.WeakHashMap r1 = F.h.f1772b     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            F.h$c r2 = (F.h.c) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f1775b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f1777a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f1778b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f1776c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f1776c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f1774a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: F.h.b(F.h$d, int):android.content.res.ColorStateList");
    }

    public static Typeface c(Context context, int i9) {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i9, new TypedValue(), 0, null, null, false, true);
    }

    public static int d(Resources resources, int i9, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 23 ? b.a(resources, i9, theme) : resources.getColor(i9);
    }

    public static ColorStateList e(Resources resources, int i9, Resources.Theme theme) {
        d dVar = new d(resources, theme);
        ColorStateList colorStateListB = b(dVar, i9);
        if (colorStateListB != null) {
            return colorStateListB;
        }
        ColorStateList colorStateListL = l(resources, i9, theme);
        if (colorStateListL == null) {
            return Build.VERSION.SDK_INT >= 23 ? b.b(resources, i9, theme) : resources.getColorStateList(i9);
        }
        a(dVar, i9, colorStateListL, theme);
        return colorStateListL;
    }

    public static Drawable f(Resources resources, int i9, Resources.Theme theme) {
        return a.a(resources, i9, theme);
    }

    public static Drawable g(Resources resources, int i9, int i10, Resources.Theme theme) {
        return a.b(resources, i9, i10, theme);
    }

    public static Typeface h(Context context, int i9) {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i9, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface i(Context context, int i9, TypedValue typedValue, int i10, e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i9, typedValue, i10, eVar, null, true, false);
    }

    public static void j(Context context, int i9, e eVar, Handler handler) {
        O.h.f(eVar);
        if (context.isRestricted()) {
            eVar.c(-4, handler);
        } else {
            n(context, i9, new TypedValue(), 0, eVar, handler, false, false);
        }
    }

    public static TypedValue k() {
        ThreadLocal threadLocal = f1771a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static ColorStateList l(Resources resources, int i9, Resources.Theme theme) {
        if (m(resources, i9)) {
            return null;
        }
        try {
            return F.c.a(resources, resources.getXml(i9), theme);
        } catch (Exception e9) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e9);
            return null;
        }
    }

    public static boolean m(Resources resources, int i9) {
        TypedValue typedValueK = k();
        resources.getValue(i9, typedValueK, true);
        int i10 = typedValueK.type;
        return i10 >= 28 && i10 <= 31;
    }

    public static Typeface n(Context context, int i9, TypedValue typedValue, int i10, e eVar, Handler handler, boolean z9, boolean z10) {
        Resources resources = context.getResources();
        resources.getValue(i9, typedValue, true);
        Typeface typefaceO = o(context, resources, typedValue, i9, i10, eVar, handler, z9, z10);
        if (typefaceO != null || eVar != null || z10) {
            return typefaceO;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i9) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface o(android.content.Context r16, android.content.res.Resources r17, android.util.TypedValue r18, int r19, int r20, F.h.e r21, android.os.Handler r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F.h.o(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, F.h$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
