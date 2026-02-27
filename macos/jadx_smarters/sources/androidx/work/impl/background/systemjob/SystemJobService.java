package androidx.work.impl.background.systemjob;

import Q0.k;
import R0.b;
import R0.j;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f17369d = k.f("SystemJobService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f17370a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f17371c = new HashMap();

    public static String a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // R0.b
    public void d(String str, boolean z9) {
        JobParameters jobParameters;
        k.c().a(f17369d, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f17371c) {
            jobParameters = (JobParameters) this.f17371c.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z9);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            j jVarM = j.m(getApplicationContext());
            this.f17370a = jVarM;
            jVarM.o().c(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            k.c().h(f17369d, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        j jVar = this.f17370a;
        if (jVar != null) {
            jVar.o().i(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        WorkerParameters.a aVar;
        if (this.f17370a == null) {
            k.c().a(f17369d, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String strA = a(jobParameters);
        if (TextUtils.isEmpty(strA)) {
            k.c().b(f17369d, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f17371c) {
            try {
                if (this.f17371c.containsKey(strA)) {
                    k.c().a(f17369d, String.format("Job is already being executed by SystemJobService: %s", strA), new Throwable[0]);
                    return false;
                }
                k.c().a(f17369d, String.format("onStartJob for %s", strA), new Throwable[0]);
                this.f17371c.put(strA, jobParameters);
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 24) {
                    aVar = new WorkerParameters.a();
                    if (jobParameters.getTriggeredContentUris() != null) {
                        aVar.f17275b = Arrays.asList(jobParameters.getTriggeredContentUris());
                    }
                    if (jobParameters.getTriggeredContentAuthorities() != null) {
                        aVar.f17274a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                    }
                    if (i9 >= 28) {
                        aVar.f17276c = jobParameters.getNetwork();
                    }
                } else {
                    aVar = null;
                }
                this.f17370a.x(strA, aVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f17370a == null) {
            k.c().a(f17369d, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String strA = a(jobParameters);
        if (TextUtils.isEmpty(strA)) {
            k.c().b(f17369d, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        k.c().a(f17369d, String.format("onStopJob for %s", strA), new Throwable[0]);
        synchronized (this.f17371c) {
            this.f17371c.remove(strA);
        }
        this.f17370a.z(strA);
        return !this.f17370a.o().f(strA);
    }
}
