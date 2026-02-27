package J2;

import K2.InterfaceC0689d;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import org.apache.commons.logging.LogFactory;

/* JADX INFO: loaded from: classes3.dex */
public class d implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0689d f3037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f3038c;

    public d(Context context, InterfaceC0689d interfaceC0689d, f fVar) {
        this.f3036a = context;
        this.f3037b = interfaceC0689d;
        this.f3038c = fVar;
    }

    @Override // J2.x
    public void a(C2.p pVar, int i9, boolean z9) {
        ComponentName componentName = new ComponentName(this.f3036a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f3036a.getSystemService("jobscheduler");
        int iC = c(pVar);
        if (!z9 && d(jobScheduler, iC, i9)) {
            G2.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
            return;
        }
        long jB = this.f3037b.b(pVar);
        JobInfo.Builder builderC = this.f3038c.c(new JobInfo.Builder(iC, componentName), pVar.d(), jB, i9);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i9);
        persistableBundle.putString("backendName", pVar.b());
        persistableBundle.putInt(LogFactory.PRIORITY_KEY, N2.a.a(pVar.d()));
        if (pVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(pVar.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        G2.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", pVar, Integer.valueOf(iC), Long.valueOf(this.f3038c.g(pVar.d(), jB, i9)), Long.valueOf(jB), Integer.valueOf(i9));
        jobScheduler.schedule(builderC.build());
    }

    @Override // J2.x
    public void b(C2.p pVar, int i9) {
        a(pVar, i9, false);
    }

    public int c(C2.p pVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f3036a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(pVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(N2.a.a(pVar.d())).array());
        if (pVar.c() != null) {
            adler32.update(pVar.c());
        }
        return (int) adler32.getValue();
    }

    public final boolean d(JobScheduler jobScheduler, int i9, int i10) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i11 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i9) {
                return i11 >= i10;
            }
        }
        return false;
    }
}
