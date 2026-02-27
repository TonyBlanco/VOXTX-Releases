package G;

import F.e;
import M.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class g extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Class f2116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Constructor f2117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f2118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f2119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f2120f;

    public static boolean g(Object obj, String str, int i9, boolean z9) throws NoSuchMethodException {
        j();
        try {
            return ((Boolean) f2118d.invoke(obj, str, Integer.valueOf(i9), Boolean.valueOf(z9))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    private static Typeface h(Object obj) throws NoSuchMethodException {
        j();
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f2116b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f2119e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    public static void j() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f2120f) {
            return;
        }
        f2120f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e9) {
            Log.e("TypefaceCompatApi21Impl", e9.getClass().getName(), e9);
            method = null;
            cls = null;
            method2 = null;
        }
        f2117c = constructor;
        f2116b = cls;
        f2118d = method2;
        f2119e = method;
    }

    private static Object k() throws NoSuchMethodException {
        j();
        try {
            return f2117c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override // G.l
    public Typeface a(Context context, e.c cVar, Resources resources, int i9) throws NoSuchMethodException {
        Object objK = k();
        for (e.d dVar : cVar.a()) {
            File fileE = m.e(context);
            if (fileE == null) {
                return null;
            }
            try {
                if (!m.c(fileE, resources, dVar.b())) {
                    return null;
                }
                if (!g(objK, fileE.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileE.delete();
            }
        }
        return h(objK);
    }

    @Override // G.l
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i9) {
        if (bVarArr.length < 1) {
            return null;
        }
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
                File fileI = i(parcelFileDescriptorOpenFileDescriptor);
                if (fileI != null && fileI.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(fileI);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceC = super.c(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceC;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final File i(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}
