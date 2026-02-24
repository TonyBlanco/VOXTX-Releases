package androidx.work.impl.utils;

import L.a;
import Q0.k;
import Q0.t;
import R0.f;
import R0.h;
import R0.j;
import U0.m;
import Z0.n;
import Z0.p;
import Z0.q;
import a1.d;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f17402e = k.f("ForceStopRunnable");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f17403f = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17404a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f17405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17406d = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f17407a = k.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            k.c().g(f17407a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, j jVar) {
        this.f17404a = context.getApplicationContext();
        this.f17405c = jVar;
    }

    public static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    public static PendingIntent d(Context context, int i9) {
        return PendingIntent.getBroadcast(context, -1, c(context), i9);
    }

    public static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentD = d(context, a.c() ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f17403f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentD);
        }
    }

    public boolean a() {
        boolean zI = Build.VERSION.SDK_INT >= 23 ? m.i(this.f17404a, this.f17405c) : false;
        WorkDatabase workDatabaseQ = this.f17405c.q();
        q qVarB = workDatabaseQ.B();
        n nVarA = workDatabaseQ.A();
        workDatabaseQ.c();
        try {
            List<p> listQ = qVarB.q();
            boolean z9 = (listQ == null || listQ.isEmpty()) ? false : true;
            if (z9) {
                for (p pVar : listQ) {
                    qVarB.d(t.ENQUEUED, pVar.f10811a);
                    qVarB.m(pVar.f10811a, -1L);
                }
            }
            nVarA.b();
            workDatabaseQ.r();
            workDatabaseQ.g();
            return z9 || zI;
        } catch (Throwable th) {
            workDatabaseQ.g();
            throw th;
        }
    }

    public void b() {
        boolean zA = a();
        if (h()) {
            k.c().a(f17402e, "Rescheduling Workers.", new Throwable[0]);
            this.f17405c.u();
            this.f17405c.n().c(false);
        } else if (e()) {
            k.c().a(f17402e, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f17405c.u();
        } else if (zA) {
            k.c().a(f17402e, "Found unfinished work, scheduling it.", new Throwable[0]);
            f.b(this.f17405c.k(), this.f17405c.q(), this.f17405c.p());
        }
    }

    public boolean e() {
        try {
            PendingIntent pendingIntentD = d(this.f17404a, a.c() ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (pendingIntentD != null) {
                    pendingIntentD.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.f17404a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i9 = 0; i9 < historicalProcessExitReasons.size(); i9++) {
                        if (d.a(historicalProcessExitReasons.get(i9)).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentD == null) {
                g(this.f17404a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e9) {
            e = e9;
            k.c().h(f17402e, "Ignoring exception", e);
            return true;
        } catch (SecurityException e10) {
            e = e10;
            k.c().h(f17402e, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        androidx.work.a aVarK = this.f17405c.k();
        if (TextUtils.isEmpty(aVarK.c())) {
            k.c().a(f17402e, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zB = a1.j.b(this.f17404a, aVarK);
        k.c().a(f17402e, String.format("Is default app process = %s", Boolean.valueOf(zB)), new Throwable[0]);
        return zB;
    }

    public boolean h() {
        return this.f17405c.n().a();
    }

    public void i(long j9) {
        try {
            Thread.sleep(j9);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i9;
        try {
            if (!f()) {
                return;
            }
            while (true) {
                h.e(this.f17404a);
                k.c().a(f17402e, "Performing cleanup operations.", new Throwable[0]);
                try {
                    b();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e9) {
                    i9 = this.f17406d + 1;
                    this.f17406d = i9;
                    if (i9 >= 3) {
                        k.c().b(f17402e, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e9);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e9);
                        this.f17405c.k().d();
                        throw illegalStateException;
                    }
                    k.c().a(f17402e, String.format("Retrying after %s", Long.valueOf(((long) i9) * 300)), e9);
                    i(((long) this.f17406d) * 300);
                }
                k.c().a(f17402e, String.format("Retrying after %s", Long.valueOf(((long) i9) * 300)), e9);
                i(((long) this.f17406d) * 300);
            }
        } finally {
            this.f17405c.t();
        }
    }
}
