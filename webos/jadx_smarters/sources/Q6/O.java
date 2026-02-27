package q6;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class O {
    public static boolean a(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    public static void b(Context context) {
        if (P.b(context)) {
            return;
        }
        d(new Executor() { // from class: q6.N
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, context, e(context));
    }

    public static /* synthetic */ void c(Context context, boolean z9, TaskCompletionSource taskCompletionSource) {
        try {
            if (!a(context)) {
                String strValueOf = String.valueOf(context.getPackageName());
                Log.e("FirebaseMessaging", strValueOf.length() != 0 ? "error configuring notification delegate for package ".concat(strValueOf) : new String("error configuring notification delegate for package "));
                taskCompletionSource.trySetResult(null);
                return;
            }
            P.c(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z9) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate(null);
            }
            taskCompletionSource.trySetResult(null);
        } catch (Throwable th) {
            taskCompletionSource.trySetResult(null);
            throw th;
        }
    }

    public static Task d(Executor executor, final Context context, final boolean z9) {
        if (!C4.m.k()) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: q6.M
            @Override // java.lang.Runnable
            public final void run() {
                O.c(context, z9, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
