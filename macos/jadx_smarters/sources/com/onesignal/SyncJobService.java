package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.onesignal.C1574o1;
import com.onesignal.F1;

/* JADX INFO: loaded from: classes4.dex */
public class SyncJobService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        C1574o1.q().b(this, new C1574o1.b(this, jobParameters));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        boolean zL = C1574o1.q().l();
        F1.a(F1.v.DEBUG, "SyncJobService onStopJob called, system conditions not available reschedule: " + zL);
        return zL;
    }
}
