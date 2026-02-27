package B4;

import C4.m;
import E4.e;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.u0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f668b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile b f669c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f670a = new ConcurrentHashMap();

    public static b b() {
        if (f669c == null) {
            synchronized (f668b) {
                try {
                    if (f669c == null) {
                        f669c = new b();
                    }
                } finally {
                }
            }
        }
        b bVar = f669c;
        r.m(bVar);
        return bVar;
    }

    public static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    public static boolean g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof u0);
    }

    public static final boolean h(Context context, Intent intent, ServiceConnection serviceConnection, int i9, Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!m.k() || executor == null) ? context.bindService(intent, serviceConnection, i9) : context.bindService(intent, i9, executor, serviceConnection);
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i9) {
        return f(context, context.getClass().getName(), intent, serviceConnection, i9, true, null);
    }

    public void c(Context context, ServiceConnection serviceConnection) {
        if (!g(serviceConnection) || !this.f670a.containsKey(serviceConnection)) {
            e(context, serviceConnection);
            return;
        }
        try {
            e(context, (ServiceConnection) this.f670a.get(serviceConnection));
        } finally {
            this.f670a.remove(serviceConnection);
        }
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i9, Executor executor) {
        return f(context, str, intent, serviceConnection, 4225, true, executor);
    }

    public final boolean f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i9, boolean z9, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((e.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!g(serviceConnection)) {
            return h(context, intent, serviceConnection, i9, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f670a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zH = h(context, intent, serviceConnection, i9, executor);
            if (zH) {
                return zH;
            }
            return false;
        } finally {
            this.f670a.remove(serviceConnection, serviceConnection);
        }
    }
}
