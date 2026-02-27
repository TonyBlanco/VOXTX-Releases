package N4;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
import org.chromium.net.ApiVersion;
import w4.C2921i;
import w4.C2922j;
import w4.C2923k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5350a = "a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2921i f5351b = C2921i.h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f5352c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static DynamiteModule f5353d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f5354e = "0";

    public static boolean a() {
        return b() != null;
    }

    public static DynamiteModule b() {
        DynamiteModule dynamiteModule;
        synchronized (f5352c) {
            dynamiteModule = f5353d;
        }
        return dynamiteModule;
    }

    public static String c() {
        String str;
        synchronized (f5352c) {
            str = f5354e;
        }
        return str;
    }

    public static void d(Context context) {
        synchronized (f5352c) {
            try {
                if (a()) {
                    return;
                }
                r.n(context, "Context must not be null");
                try {
                    ((ClassLoader) r.m(a.class.getClassLoader())).loadClass("org.chromium.net.CronetEngine");
                    int apiLevel = ApiVersion.getApiLevel();
                    C2921i c2921i = f5351b;
                    c2921i.n(context, 11925000);
                    try {
                        DynamiteModule dynamiteModuleE = DynamiteModule.e(context, DynamiteModule.f26902b, "com.google.android.gms.cronet_dynamite");
                        try {
                            Class<?> clsLoadClass = dynamiteModuleE.b().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                            if (clsLoadClass.getClassLoader() == a.class.getClassLoader()) {
                                Log.e(f5350a, "ImplVersion class is missing from Cronet module.");
                                throw new C2922j(8);
                            }
                            Method method = clsLoadClass.getMethod("getApiLevel", null);
                            Method method2 = clsLoadClass.getMethod("getCronetVersion", null);
                            int iIntValue = ((Integer) r.m((Integer) method.invoke(null, null))).intValue();
                            f5354e = (String) r.m((String) method2.invoke(null, null));
                            if (apiLevel <= iIntValue) {
                                f5353d = dynamiteModuleE;
                                return;
                            }
                            Intent intentD = c2921i.d(context, 2, "cr");
                            if (intentD == null) {
                                Log.e(f5350a, "Unable to fetch error resolution intent");
                                throw new C2922j(2);
                            }
                            String str = f5354e;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 174);
                            sb.append("Google Play Services update is required. The API Level of the client is ");
                            sb.append(apiLevel);
                            sb.append(". The API Level of the implementation is ");
                            sb.append(iIntValue);
                            sb.append(". The Cronet implementation version is ");
                            sb.append(str);
                            throw new C2923k(2, sb.toString(), intentD);
                        } catch (Exception e9) {
                            Log.e(f5350a, "Unable to read Cronet version from the Cronet module ", e9);
                            throw ((C2922j) new C2922j(8).initCause(e9));
                        }
                    } catch (DynamiteModule.a e10) {
                        Log.e(f5350a, "Unable to load Cronet module", e10);
                        throw ((C2922j) new C2922j(8).initCause(e10));
                    }
                } catch (ClassNotFoundException e11) {
                    Log.e(f5350a, "Cronet API is not available. Have you included all required dependencies?");
                    throw ((C2922j) new C2922j(10).initCause(e11));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
