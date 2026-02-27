package M4;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: renamed from: M4.q4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0808q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5024a;

    public C0808q4(Context context) {
        com.google.android.gms.common.internal.r.m(context);
        this.f5024a = context;
    }

    public final int a(final Intent intent, int i9, final int i10) {
        C0776l2 c0776l2H = C0776l2.H(this.f5024a, null, null);
        final C0858z1 c0858z1D = c0776l2H.d();
        if (intent == null) {
            c0858z1D.w().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        c0776l2H.b();
        c0858z1D.v().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i10), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            h(new Runnable() { // from class: M4.n4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4954a.c(i10, c0858z1D, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            k().r().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new D2(S4.f0(this.f5024a), null);
        }
        k().w().b("onBind received unknown action", action);
        return null;
    }

    public final /* synthetic */ void c(int i9, C0858z1 c0858z1, Intent intent) {
        if (((InterfaceC0802p4) this.f5024a).c(i9)) {
            c0858z1.v().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i9));
            k().v().a("Completed wakeful intent.");
            ((InterfaceC0802p4) this.f5024a).d(intent);
        }
    }

    public final /* synthetic */ void d(C0858z1 c0858z1, JobParameters jobParameters) {
        c0858z1.v().a("AppMeasurementJobService processed last upload request.");
        ((InterfaceC0802p4) this.f5024a).e(jobParameters, false);
    }

    public final void e() {
        C0776l2 c0776l2H = C0776l2.H(this.f5024a, null, null);
        C0858z1 c0858z1D = c0776l2H.d();
        c0776l2H.b();
        c0858z1D.v().a("Local AppMeasurementService is starting up");
    }

    public final void f() {
        C0776l2 c0776l2H = C0776l2.H(this.f5024a, null, null);
        C0858z1 c0858z1D = c0776l2H.d();
        c0776l2H.b();
        c0858z1D.v().a("Local AppMeasurementService is shutting down");
    }

    public final void g(Intent intent) {
        if (intent == null) {
            k().r().a("onRebind called with null intent");
        } else {
            k().v().b("onRebind called. action", intent.getAction());
        }
    }

    public final void h(Runnable runnable) {
        S4 s4F0 = S4.f0(this.f5024a);
        s4F0.f().z(new RunnableC0796o4(this, s4F0, runnable));
    }

    public final boolean i(final JobParameters jobParameters) {
        C0776l2 c0776l2H = C0776l2.H(this.f5024a, null, null);
        final C0858z1 c0858z1D = c0776l2H.d();
        String string = jobParameters.getExtras().getString("action");
        c0776l2H.b();
        c0858z1D.v().b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        h(new Runnable() { // from class: M4.m4
            @Override // java.lang.Runnable
            public final void run() {
                this.f4941a.d(c0858z1D, jobParameters);
            }
        });
        return true;
    }

    public final boolean j(Intent intent) {
        if (intent == null) {
            k().r().a("onUnbind called with null intent");
            return true;
        }
        k().v().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final C0858z1 k() {
        return C0776l2.H(this.f5024a, null, null).d();
    }
}
