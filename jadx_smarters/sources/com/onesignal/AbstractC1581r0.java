package com.onesignal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.onesignal.F1;
import java.util.Iterator;

/* JADX INFO: renamed from: com.onesignal.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1581r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f38819c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f38820a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Thread f38821b;

    public static boolean n() {
        return true;
    }

    public void a(Context context) {
        F1.c1(F1.v.DEBUG, getClass().getSimpleName() + " cancel background sync");
        synchronized (f38819c) {
            try {
                if (n()) {
                    ((JobScheduler) context.getSystemService("jobscheduler")).cancel(e());
                } else {
                    ((AlarmManager) context.getSystemService("alarm")).cancel(m(context));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(Context context, Runnable runnable) {
        F1.c1(F1.v.DEBUG, "OSBackground sync, calling initWithContext");
        F1.K0(context);
        Thread thread = new Thread(runnable, f());
        this.f38821b = thread;
        OSUtils.W(thread);
    }

    public abstract Class c();

    public abstract Class d();

    public abstract int e();

    public abstract String f();

    public final boolean g(Context context) {
        return AbstractC1551h.a(context, "android.permission.RECEIVE_BOOT_COMPLETED") == 0;
    }

    public final boolean h(Context context) {
        Thread thread;
        Iterator<JobInfo> it = ((JobScheduler) context.getSystemService("jobscheduler")).getAllPendingJobs().iterator();
        while (it.hasNext()) {
            if (it.next().getId() == e() && (thread = this.f38821b) != null && thread.isAlive()) {
                return true;
            }
        }
        return false;
    }

    public void i(Context context, long j9) {
        synchronized (f38819c) {
            try {
                if (n()) {
                    k(context, j9);
                } else {
                    j(context, j9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(Context context, long j9) {
        F1.a(F1.v.VERBOSE, getClass().getSimpleName() + " scheduleServiceSyncTask:atTime: " + j9);
        ((AlarmManager) context.getSystemService("alarm")).set(0, F1.v0().a() + j9, m(context));
    }

    public final void k(Context context, long j9) {
        F1.v vVar = F1.v.VERBOSE;
        F1.a(vVar, "OSBackgroundSync scheduleSyncServiceAsJob:atTime: " + j9);
        if (h(context)) {
            F1.a(vVar, "OSBackgroundSync scheduleSyncServiceAsJob Scheduler already running!");
            this.f38820a = true;
            return;
        }
        JobInfo.Builder builder = new JobInfo.Builder(e(), new ComponentName(context, (Class<?>) c()));
        builder.setMinimumLatency(j9).setRequiredNetworkType(1);
        if (g(context)) {
            builder.setPersisted(true);
        }
        try {
            int iSchedule = ((JobScheduler) context.getSystemService("jobscheduler")).schedule(builder.build());
            F1.a(F1.v.INFO, "OSBackgroundSync scheduleSyncServiceAsJob:result: " + iSchedule);
        } catch (NullPointerException e9) {
            F1.b(F1.v.ERROR, "scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e9);
        }
    }

    public boolean l() {
        Thread thread = this.f38821b;
        if (thread == null || !thread.isAlive()) {
            return false;
        }
        this.f38821b.interrupt();
        return true;
    }

    public final PendingIntent m(Context context) {
        return PendingIntent.getService(context, e(), new Intent(context, (Class<?>) d()), 201326592);
    }
}
