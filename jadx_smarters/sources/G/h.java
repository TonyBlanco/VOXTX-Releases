package G;

import F.e;
import M.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class h extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f2121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Constructor f2122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f2123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f2124e;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e9) {
            Log.e("TypefaceCompatApi24Impl", e9.getClass().getName(), e9);
            method = null;
            cls = null;
            method2 = null;
        }
        f2122c = constructor;
        f2121b = cls;
        f2123d = method2;
        f2124e = method;
    }

    public static boolean g(Object obj, ByteBuffer byteBuffer, int i9, int i10, boolean z9) {
        try {
            return ((Boolean) f2123d.invoke(obj, byteBuffer, Integer.valueOf(i9), null, Integer.valueOf(i10), Boolean.valueOf(z9))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface h(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f2121b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f2124e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean i() {
        Method method = f2123d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object j() {
        try {
            return f2122c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // G.l
    public Typeface a(Context context, e.c cVar, Resources resources, int i9) {
        Object objJ = j();
        if (objJ == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            ByteBuffer byteBufferB = m.b(context, resources, dVar.b());
            if (byteBufferB == null || !g(objJ, byteBufferB, dVar.c(), dVar.e(), dVar.f())) {
                return null;
            }
        }
        return h(objJ);
    }

    @Override // G.l
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i9) {
        Object objJ = j();
        if (objJ == null) {
            return null;
        }
        s.i iVar = new s.i();
        for (g.b bVar : bVarArr) {
            Uri uriD = bVar.d();
            ByteBuffer byteBufferF = (ByteBuffer) iVar.get(uriD);
            if (byteBufferF == null) {
                byteBufferF = m.f(context, cancellationSignal, uriD);
                iVar.put(uriD, byteBufferF);
            }
            if (byteBufferF == null || !g(objJ, byteBufferF, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        Typeface typefaceH = h(objJ);
        if (typefaceH == null) {
            return null;
        }
        return Typeface.create(typefaceH, i9);
    }
}
