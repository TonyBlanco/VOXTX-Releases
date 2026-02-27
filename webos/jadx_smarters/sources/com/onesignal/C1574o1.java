package com.onesignal;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import com.onesignal.F1;
import com.onesignal.O;
import java.lang.ref.WeakReference;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: renamed from: com.onesignal.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1574o1 extends AbstractC1581r0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f38792e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static C1574o1 f38793f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f38794d = 0L;

    /* JADX INFO: renamed from: com.onesignal.o1$a */
    public static class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference f38795a;

        public a(Service service) {
            this.f38795a = new WeakReference(service);
        }

        @Override // com.onesignal.C1574o1.c
        public void a() {
            F1.a(F1.v.DEBUG, "LegacySyncRunnable:Stopped");
            if (this.f38795a.get() != null) {
                ((Service) this.f38795a.get()).stopSelf();
            }
        }
    }

    /* JADX INFO: renamed from: com.onesignal.o1$b */
    public static class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference f38796a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public JobParameters f38797c;

        public b(JobService jobService, JobParameters jobParameters) {
            this.f38796a = new WeakReference(jobService);
            this.f38797c = jobParameters;
        }

        @Override // com.onesignal.C1574o1.c
        public void a() {
            F1.a(F1.v.DEBUG, "LollipopSyncRunnable:JobFinished needsJobReschedule: " + C1574o1.q().f38820a);
            boolean z9 = C1574o1.q().f38820a;
            C1574o1.q().f38820a = false;
            if (this.f38796a.get() != null) {
                ((JobService) this.f38796a.get()).jobFinished(this.f38797c, z9);
            }
        }
    }

    /* JADX INFO: renamed from: com.onesignal.o1$c */
    public static abstract class c implements Runnable {

        /* JADX INFO: renamed from: com.onesignal.o1$c$a */
        public class a implements O.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ BlockingQueue f38798a;

            public a(BlockingQueue blockingQueue) {
                this.f38798a = blockingQueue;
            }

            @Override // com.onesignal.O.b
            public void a(O.d dVar) {
                Object obj = dVar;
                if (dVar == null) {
                    obj = new Object();
                }
                this.f38798a.offer(obj);
            }

            @Override // com.onesignal.O.b
            public O.f getType() {
                return O.f.SYNC_SERVICE;
            }
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AbstractC1581r0.f38819c) {
                C1574o1.q().f38794d = 0L;
            }
            if (F1.y0() == null) {
                a();
                return;
            }
            F1.f38274d = F1.n0();
            W1.k();
            try {
                ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
                O.g(F1.f38270b, false, false, new a(arrayBlockingQueue));
                Object objTake = arrayBlockingQueue.take();
                if (objTake instanceof O.d) {
                    W1.w((O.d) objTake);
                }
            } catch (InterruptedException e9) {
                e9.printStackTrace();
            }
            W1.u(true);
            F1.a0().d();
            a();
        }
    }

    public static C1574o1 q() {
        if (f38793f == null) {
            synchronized (f38792e) {
                try {
                    if (f38793f == null) {
                        f38793f = new C1574o1();
                    }
                } finally {
                }
            }
        }
        return f38793f;
    }

    @Override // com.onesignal.AbstractC1581r0
    public Class c() {
        return SyncJobService.class;
    }

    @Override // com.onesignal.AbstractC1581r0
    public Class d() {
        return SyncService.class;
    }

    @Override // com.onesignal.AbstractC1581r0
    public int e() {
        return 2071862118;
    }

    @Override // com.onesignal.AbstractC1581r0
    public String f() {
        return "OS_SYNCSRV_BG_SYNC";
    }

    public void p(Context context) {
        synchronized (AbstractC1581r0.f38819c) {
            try {
                this.f38794d = 0L;
                if (O.m(context)) {
                    return;
                }
                a(context);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void r(Context context, long j9) {
        F1.a(F1.v.VERBOSE, "OSSyncService scheduleLocationUpdateTask:delayMs: " + j9);
        t(context, j9);
    }

    public void s(Context context) {
        F1.a(F1.v.VERBOSE, "OSSyncService scheduleSyncTask:SYNC_AFTER_BG_DELAY_MS: 30000");
        t(context, 30000L);
    }

    public void t(Context context, long j9) {
        synchronized (AbstractC1581r0.f38819c) {
            try {
                if (this.f38794d.longValue() == 0 || F1.v0().a() + j9 <= this.f38794d.longValue()) {
                    if (j9 < 5000) {
                        j9 = 5000;
                    }
                    i(context, j9);
                    this.f38794d = Long.valueOf(F1.v0().a() + j9);
                    return;
                }
                F1.a(F1.v.VERBOSE, "OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: " + this.f38794d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
