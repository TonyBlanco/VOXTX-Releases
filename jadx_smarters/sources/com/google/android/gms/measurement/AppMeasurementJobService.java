package com.google.android.gms.measurement;

import M4.C0808q4;
import M4.InterfaceC0802p4;
import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(DateTimeConstants.HOURS_PER_DAY)
public final class AppMeasurementJobService extends JobService implements InterfaceC0802p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0808q4 f26944a;

    public final C0808q4 a() {
        if (this.f26944a == null) {
            this.f26944a = new C0808q4(this);
        }
        return this.f26944a;
    }

    @Override // M4.InterfaceC0802p4
    public final boolean c(int i9) {
        throw new UnsupportedOperationException();
    }

    @Override // M4.InterfaceC0802p4
    public final void d(Intent intent) {
    }

    @Override // M4.InterfaceC0802p4
    public final void e(JobParameters jobParameters, boolean z9) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        a().e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        a().f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        a().g(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        a().i(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        a().j(intent);
        return true;
    }
}
