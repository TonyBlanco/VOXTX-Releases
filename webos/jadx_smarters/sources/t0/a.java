package T0;

import Q0.k;
import R0.j;
import Z0.g;
import Z0.h;
import a1.f;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f9497a = k.f("Alarms");

    public static void a(Context context, j jVar, String str) {
        h hVarY = jVar.q().y();
        g gVarA = hVarY.a(str);
        if (gVarA != null) {
            b(context, str, gVarA.f10791b);
            k.c().a(f9497a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            hVarY.d(str);
        }
    }

    public static void b(Context context, String str, int i9) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i9, androidx.work.impl.background.systemalarm.a.b(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        k.c().a(f9497a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i9)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void c(Context context, j jVar, String str, long j9) {
        int iB;
        WorkDatabase workDatabaseQ = jVar.q();
        h hVarY = workDatabaseQ.y();
        g gVarA = hVarY.a(str);
        if (gVarA != null) {
            b(context, str, gVarA.f10791b);
            iB = gVarA.f10791b;
        } else {
            iB = new f(workDatabaseQ).b();
            hVarY.c(new g(str, iB));
        }
        d(context, str, iB, j9);
    }

    public static void d(Context context, String str, int i9, long j9) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i9, androidx.work.impl.background.systemalarm.a.b(context, str), Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j9, service);
        }
    }
}
