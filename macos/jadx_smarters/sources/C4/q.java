package C4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f1150a = Process.myUid();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f1151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f1152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f1153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f1154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Method f1155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Method f1156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Method f1157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Method f1158i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Boolean f1159j;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        f1151b = method;
        if (m.c()) {
            try {
                method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
            } catch (Exception unused2) {
                method2 = null;
            }
        } else {
            method2 = null;
        }
        f1152c = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f1153d = method3;
        try {
            method4 = WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
            method4 = null;
        }
        f1154e = method4;
        if (m.c()) {
            try {
                method5 = WorkSource.class.getMethod("getName", Integer.TYPE);
            } catch (Exception unused5) {
                method5 = null;
            }
        } else {
            method5 = null;
        }
        f1155f = method5;
        if (m.j()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e9) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e9);
                method6 = null;
            }
        } else {
            method6 = null;
        }
        f1156g = method6;
        if (m.j()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e10) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e10);
                method7 = null;
            }
        } else {
            method7 = null;
        }
        f1157h = method7;
        if (m.j()) {
            try {
                method8 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method8.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
                method8 = null;
            }
        } else {
            method8 = null;
        }
        f1158i = method8;
        f1159j = null;
    }

    public static void a(WorkSource workSource, int i9, String str) {
        Method method = f1152c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i9), str);
                return;
            } catch (Exception e9) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e9);
                return;
            }
        }
        Method method2 = f1151b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i9));
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
        }
    }

    public static WorkSource b(Context context, String str) {
        String str2;
        ApplicationInfo applicationInfoC;
        if (context == null || context.getPackageManager() == null || str == null) {
            return null;
        }
        try {
            applicationInfoC = E4.e.a(context).c(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "Could not find package: ";
        }
        if (applicationInfoC == null) {
            str2 = "Could not get applicationInfo from package: ";
            Log.e("WorkSourceUtil", str2.concat(str));
            return null;
        }
        int i9 = applicationInfoC.uid;
        WorkSource workSource = new WorkSource();
        a(workSource, i9, str);
        return workSource;
    }

    public static synchronized boolean c(Context context) {
        Boolean bool = f1159j;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        boolean z9 = E.b.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
        f1159j = Boolean.valueOf(z9);
        return z9;
    }
}
