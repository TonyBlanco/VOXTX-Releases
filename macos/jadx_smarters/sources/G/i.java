package G;

import F.e;
import M.g;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class i extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f2125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Constructor f2126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Method f2127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Method f2128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Method f2129k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Method f2130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Method f2131m;

    public i() {
        Class clsU;
        Constructor constructorV;
        Method methodR;
        Method methodS;
        Method methodW;
        Method methodQ;
        Method methodT;
        try {
            clsU = u();
            constructorV = v(clsU);
            methodR = r(clsU);
            methodS = s(clsU);
            methodW = w(clsU);
            methodQ = q(clsU);
            methodT = t(clsU);
        } catch (ClassNotFoundException | NoSuchMethodException e9) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e9.getClass().getName(), e9);
            clsU = null;
            constructorV = null;
            methodR = null;
            methodS = null;
            methodW = null;
            methodQ = null;
            methodT = null;
        }
        this.f2125g = clsU;
        this.f2126h = constructorV;
        this.f2127i = methodR;
        this.f2128j = methodS;
        this.f2129k = methodW;
        this.f2130l = methodQ;
        this.f2131m = methodT;
    }

    @Override // G.g, G.l
    public Typeface a(Context context, e.c cVar, Resources resources, int i9) {
        if (!p()) {
            return super.a(context, cVar, resources, i9);
        }
        Object objK = k();
        if (objK == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            if (!m(context, objK, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                l(objK);
                return null;
            }
        }
        if (o(objK)) {
            return h(objK);
        }
        return null;
    }

    @Override // G.g, G.l
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i9) {
        Typeface typefaceH;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!p()) {
            g.b bVarF = f(bVarArr, i9);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarF.d(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(bVarF.e()).setItalic(bVarF.f()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map mapH = m.h(context, bVarArr, cancellationSignal);
        Object objK = k();
        if (objK == null) {
            return null;
        }
        boolean z9 = false;
        for (g.b bVar : bVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) mapH.get(bVar.d());
            if (byteBuffer != null) {
                if (!n(objK, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                    l(objK);
                    return null;
                }
                z9 = true;
            }
        }
        if (!z9) {
            l(objK);
            return null;
        }
        if (o(objK) && (typefaceH = h(objK)) != null) {
            return Typeface.create(typefaceH, i9);
        }
        return null;
    }

    @Override // G.l
    public Typeface d(Context context, Resources resources, int i9, String str, int i10) {
        if (!p()) {
            return super.d(context, resources, i9, str, i10);
        }
        Object objK = k();
        if (objK == null) {
            return null;
        }
        if (!m(context, objK, str, 0, -1, -1, null)) {
            l(objK);
            return null;
        }
        if (o(objK)) {
            return h(objK);
        }
        return null;
    }

    public Typeface h(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f2125g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f2131m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final Object k() {
        try {
            return this.f2126h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void l(Object obj) {
        try {
            this.f2130l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean m(Context context, Object obj, String str, int i9, int i10, int i11, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2127i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean n(Object obj, ByteBuffer byteBuffer, int i9, int i10, int i11) {
        try {
            return ((Boolean) this.f2128j.invoke(obj, byteBuffer, Integer.valueOf(i9), null, Integer.valueOf(i10), Integer.valueOf(i11))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean o(Object obj) {
        try {
            return ((Boolean) this.f2129k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean p() {
        if (this.f2127i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f2127i != null;
    }

    public Method q(Class cls) {
        return cls.getMethod("abortCreation", null);
    }

    public Method r(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method s(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method t(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class u() {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor v(Class cls) {
        return cls.getConstructor(null);
    }

    public Method w(Class cls) {
        return cls.getMethod("freeze", null);
    }
}
