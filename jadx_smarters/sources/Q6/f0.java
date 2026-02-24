package q6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f47063a = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f47064b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Q4.a f47065c;

    public static void a(Context context) {
        if (f47065c == null) {
            Q4.a aVar = new Q4.a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f47065c = aVar;
            aVar.d(true);
        }
    }

    public static void b(Intent intent) {
        synchronized (f47064b) {
            try {
                if (f47065c != null && c(intent)) {
                    d(intent, false);
                    f47065c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean c(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    public static void d(Intent intent, boolean z9) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z9);
    }

    public static ComponentName e(Context context, Intent intent) {
        synchronized (f47064b) {
            try {
                a(context);
                boolean zC = c(intent);
                d(intent, true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!zC) {
                    f47065c.a(f47063a);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
