package M4;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.zzbs;
import com.google.android.gms.internal.measurement.zzbt;

/* JADX INFO: loaded from: classes3.dex */
public final class C4 extends E4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AlarmManager f4215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractC0791o f4216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f4217f;

    public C4(S4 s42) {
        super(s42);
        this.f4215d = (AlarmManager) this.f4245a.c().getSystemService("alarm");
    }

    private final void r() {
        JobScheduler jobScheduler = (JobScheduler) this.f4245a.c().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(o());
        }
    }

    @Override // M4.E4
    public final boolean l() {
        AlarmManager alarmManager = this.f4215d;
        if (alarmManager != null) {
            alarmManager.cancel(p());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        r();
        return false;
    }

    public final void m() {
        i();
        this.f4245a.d().v().a("Unscheduling upload");
        AlarmManager alarmManager = this.f4215d;
        if (alarmManager != null) {
            alarmManager.cancel(p());
        }
        q().b();
        if (Build.VERSION.SDK_INT >= 24) {
            r();
        }
    }

    public final void n(long j9) {
        i();
        this.f4245a.b();
        Context contextC = this.f4245a.c();
        if (!a5.a0(contextC)) {
            this.f4245a.d().q().a("Receiver not registered/enabled");
        }
        if (!a5.b0(contextC, false)) {
            this.f4245a.d().q().a("Service not registered/enabled");
        }
        m();
        this.f4245a.d().v().b("Scheduling upload, millis", Long.valueOf(j9));
        long jB = this.f4245a.a().b() + j9;
        this.f4245a.z();
        if (j9 < Math.max(0L, ((Long) AbstractC0781m1.f4934z.a(null)).longValue()) && !q().e()) {
            q().d(j9);
        }
        this.f4245a.b();
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.f4215d;
            if (alarmManager != null) {
                this.f4245a.z();
                alarmManager.setInexactRepeating(2, jB, Math.max(((Long) AbstractC0781m1.f4924u.a(null)).longValue(), j9), p());
                return;
            }
            return;
        }
        Context contextC2 = this.f4245a.c();
        ComponentName componentName = new ComponentName(contextC2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iO = o();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        zzbt.zza(contextC2, new JobInfo.Builder(iO, componentName).setMinimumLatency(j9).setOverrideDeadline(j9 + j9).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final int o() {
        if (this.f4217f == null) {
            this.f4217f = Integer.valueOf("measurement".concat(String.valueOf(this.f4245a.c().getPackageName())).hashCode());
        }
        return this.f4217f.intValue();
    }

    public final PendingIntent p() {
        Context contextC = this.f4245a.c();
        return PendingIntent.getBroadcast(contextC, 0, new Intent().setClassName(contextC, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzbs.zza);
    }

    public final AbstractC0791o q() {
        if (this.f4216e == null) {
            this.f4216e = new B4(this, this.f4234b.b0());
        }
        return this.f4216e;
    }
}
