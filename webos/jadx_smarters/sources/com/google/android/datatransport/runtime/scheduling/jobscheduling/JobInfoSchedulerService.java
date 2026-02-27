package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import C2.p;
import C2.u;
import N2.a;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import org.apache.commons.logging.LogFactory;

/* JADX INFO: loaded from: classes3.dex */
public class JobInfoSchedulerService extends JobService {
    public final /* synthetic */ void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i9 = jobParameters.getExtras().getInt(LogFactory.PRIORITY_KEY);
        int i10 = jobParameters.getExtras().getInt("attemptNumber");
        u.f(getApplicationContext());
        p.a aVarD = p.a().b(string).d(a.b(i9));
        if (string2 != null) {
            aVarD.c(Base64.decode(string2, 0));
        }
        u.c().e().v(aVarD.a(), i10, new Runnable() { // from class: J2.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f3039a.b(jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
