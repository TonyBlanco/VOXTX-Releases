package A3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f93d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f94a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComponentName f95b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JobScheduler f96c;

    /* JADX INFO: renamed from: A3.a$a, reason: collision with other inner class name */
    public static final class JobServiceC0001a extends JobService {
    }

    static {
        f93d = (k0.f39777a >= 26 ? 16 : 0) | 15;
    }

    public a(Context context, int i9) {
        Context applicationContext = context.getApplicationContext();
        this.f94a = i9;
        this.f95b = new ComponentName(applicationContext, (Class<?>) JobServiceC0001a.class);
        this.f96c = (JobScheduler) AbstractC1684a.e((JobScheduler) applicationContext.getSystemService("jobscheduler"));
    }

    public static JobInfo c(int i9, ComponentName componentName, c cVar, String str, String str2) {
        c cVarA = cVar.a(f93d);
        if (!cVarA.equals(cVar)) {
            AbstractC1681B.j("PlatformScheduler", "Ignoring unsupported requirements: " + (cVarA.e() ^ cVar.e()));
        }
        JobInfo.Builder builder = new JobInfo.Builder(i9, componentName);
        if (cVar.w()) {
            builder.setRequiredNetworkType(2);
        } else if (cVar.r()) {
            builder.setRequiredNetworkType(1);
        }
        builder.setRequiresDeviceIdle(cVar.k());
        builder.setRequiresCharging(cVar.f());
        if (k0.f39777a >= 26 && cVar.v()) {
            builder.setRequiresStorageNotLow(true);
        }
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("service_action", str);
        persistableBundle.putString("service_package", str2);
        persistableBundle.putInt("requirements", cVar.e());
        builder.setExtras(persistableBundle);
        return builder.build();
    }

    @Override // A3.g
    public boolean a(c cVar, String str, String str2) {
        return this.f96c.schedule(c(this.f94a, this.f95b, cVar, str2, str)) == 1;
    }

    @Override // A3.g
    public c b(c cVar) {
        return cVar.a(f93d);
    }

    @Override // A3.g
    public boolean cancel() {
        this.f96c.cancel(this.f94a);
        return true;
    }
}
