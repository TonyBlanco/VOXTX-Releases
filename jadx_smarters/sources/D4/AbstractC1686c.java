package d4;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: d4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1686c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f39756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f39757b;

    public static IBinder a(Bundle bundle, String str) {
        return k0.f39777a >= 18 ? bundle.getBinder(str) : b(bundle, str);
    }

    public static IBinder b(Bundle bundle, String str) {
        String str2;
        Method method = f39756a;
        if (method != null) {
            return (IBinder) method.invoke(bundle, str);
        }
        try {
            Method method2 = Bundle.class.getMethod("getIBinder", String.class);
            f39756a = method2;
            method2.setAccessible(true);
            method = f39756a;
            try {
                return (IBinder) method.invoke(bundle, str);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e9) {
                e = e9;
                str2 = "Failed to invoke getIBinder via reflection";
            }
        } catch (NoSuchMethodException e10) {
            e = e10;
            str2 = "Failed to retrieve getIBinder method";
        }
        AbstractC1681B.h("BundleUtil", str2, e);
        return null;
    }

    public static void c(Bundle bundle, String str, IBinder iBinder) {
        if (k0.f39777a >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            d(bundle, str, iBinder);
        }
    }

    public static void d(Bundle bundle, String str, IBinder iBinder) {
        Method method = f39757b;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                f39757b = method2;
                method2.setAccessible(true);
                method = f39757b;
            } catch (NoSuchMethodException e9) {
                AbstractC1681B.h("BundleUtil", "Failed to retrieve putIBinder method", e9);
                return;
            }
        }
        try {
            method.invoke(bundle, str, iBinder);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e10) {
            AbstractC1681B.h("BundleUtil", "Failed to invoke putIBinder via reflection", e10);
        }
    }
}
