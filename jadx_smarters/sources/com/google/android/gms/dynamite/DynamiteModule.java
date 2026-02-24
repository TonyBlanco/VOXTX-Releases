package com.google.android.gms.dynamite;

import G4.j;
import G4.k;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1418q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import w4.C2921i;

/* JADX INFO: loaded from: classes3.dex */
public final class DynamiteModule {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Boolean f26908h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f26909i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f26910j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f26911k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Boolean f26912l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static j f26917q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static k f26918r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26919a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ThreadLocal f26913m = new ThreadLocal();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ThreadLocal f26914n = new G4.f();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b.a f26915o = new com.google.android.gms.dynamite.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f26902b = new com.google.android.gms.dynamite.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f26903c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f26904d = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f26905e = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f26906f = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f26907g = new g();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f26916p = new h();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        public /* synthetic */ a(String str, G4.i iVar) {
            super(str);
        }

        public /* synthetic */ a(String str, Throwable th, G4.i iVar) {
            super(str, th);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str, boolean z9);

            int b(Context context, String str);
        }

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0256b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f26920a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f26921b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f26922c = 0;
        }

        C0256b a(Context context, String str, a aVar);
    }

    public DynamiteModule(Context context) {
        r.m(context);
        this.f26919a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC1418q.b(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e9) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e9.getMessage())));
            return 0;
        }
    }

    public static int c(Context context, String str) {
        return f(context, str, false);
    }

    /* JADX WARN: Not initialized variable reg: 17, insn: 0x0226: MOVE (r6 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]), block:B:116:0x0226 */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.dynamite.DynamiteModule e(android.content.Context r18, com.google.android.gms.dynamite.DynamiteModule.b r19, java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0175 A[Catch: all -> 0x00e9, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00e9, blocks: (B:3:0x0002, B:64:0x00de, B:66:0x00e4, B:73:0x0108, B:101:0x0167, B:105:0x0175, B:123:0x01c7, B:124:0x01ca, B:118:0x01bf, B:71:0x00ed, B:126:0x01cc, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00db, B:21:0x0049, B:45:0x00a0, B:48:0x00a3, B:55:0x00b9, B:63:0x00dd, B:61:0x00bf), top: B:137:0x0002, inners: #1, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad A[Catch: all -> 0x0036, TryCatch #12 {, blocks: (B:9:0x0026, B:11:0x0032, B:52:0x00b6, B:16:0x003b, B:18:0x0042, B:20:0x0048, B:25:0x004e, B:27:0x0052, B:31:0x005c, B:33:0x0064, B:36:0x006b, B:43:0x0097, B:44:0x009f, B:39:0x0072, B:41:0x0078, B:42:0x0089, B:47:0x00a2, B:50:0x00a5, B:51:0x00ad, B:17:0x003e), top: B:144:0x0026, inners: #4 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x01bd -> B:132:0x01c2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x01bf -> B:132:0x01c2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int f(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.f(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int g(android.content.Context r8, java.lang.String r9, boolean r10, boolean r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static DynamiteModule h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    public static void i(ClassLoader classLoader) throws a {
        k kVar;
        G4.i iVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                kVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                kVar = iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new k(iBinder);
            }
            f26918r = kVar;
        } catch (ClassNotFoundException e9) {
            e = e9;
            throw new a("Failed to instantiate dynamite loader", e, iVar);
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new a("Failed to instantiate dynamite loader", e, iVar);
        } catch (InstantiationException e11) {
            e = e11;
            throw new a("Failed to instantiate dynamite loader", e, iVar);
        } catch (NoSuchMethodException e12) {
            e = e12;
            throw new a("Failed to instantiate dynamite loader", e, iVar);
        } catch (InvocationTargetException e13) {
            e = e13;
            throw new a("Failed to instantiate dynamite loader", e, iVar);
        }
    }

    public static boolean j(Cursor cursor) {
        G4.h hVar = (G4.h) f26913m.get();
        if (hVar == null || hVar.f2179a != null) {
            return false;
        }
        hVar.f2179a = cursor;
        return true;
    }

    public static boolean k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f26912l)) {
            return true;
        }
        boolean z9 = false;
        if (f26912l == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (C2921i.h().j(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z9 = true;
            }
            f26912l = Boolean.valueOf(z9);
            if (z9 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f26910j = true;
            }
        }
        if (!z9) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z9;
    }

    public static j l(Context context) {
        j jVar;
        synchronized (DynamiteModule.class) {
            j jVar2 = f26917q;
            if (jVar2 != null) {
                return jVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    jVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    jVar = iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new j(iBinder);
                }
                if (jVar != null) {
                    f26917q = jVar;
                    return jVar;
                }
            } catch (Exception e9) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e9.getMessage());
            }
            return null;
        }
    }

    public Context b() {
        return this.f26919a;
    }

    public IBinder d(String str) throws a {
        try {
            return (IBinder) this.f26919a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e9) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e9, null);
        }
    }
}
