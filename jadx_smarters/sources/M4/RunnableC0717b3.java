package M4;

import android.os.Bundle;

/* JADX INFO: renamed from: M4.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0717b3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f4606a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0824t3 f4607c;

    public RunnableC0717b3(C0824t3 c0824t3, Bundle bundle) {
        this.f4607c = c0824t3;
        this.f4606a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0824t3 c0824t3 = this.f4607c;
        Bundle bundle = this.f4606a;
        c0824t3.h();
        c0824t3.i();
        com.google.android.gms.common.internal.r.m(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        com.google.android.gms.common.internal.r.g(string);
        com.google.android.gms.common.internal.r.g(string2);
        com.google.android.gms.common.internal.r.m(bundle.get("value"));
        if (!c0824t3.f4245a.o()) {
            c0824t3.f4245a.d().v().a("Conditional property not set since app measurement is disabled");
            return;
        }
        V4 v42 = new V4(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            C0832v c0832vY0 = c0824t3.f4245a.N().y0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            c0824t3.f4245a.L().s(new C0725d(bundle.getString("app_id"), string2, v42, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), c0824t3.f4245a.N().y0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), c0832vY0, bundle.getLong("time_to_live"), c0824t3.f4245a.N().y0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
