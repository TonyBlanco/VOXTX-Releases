package M4;

import android.os.Bundle;

/* JADX INFO: renamed from: M4.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0723c3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f4631a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0824t3 f4632c;

    public RunnableC0723c3(C0824t3 c0824t3, Bundle bundle) {
        this.f4632c = c0824t3;
        this.f4631a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0824t3 c0824t3 = this.f4632c;
        Bundle bundle = this.f4631a;
        c0824t3.h();
        c0824t3.i();
        com.google.android.gms.common.internal.r.m(bundle);
        String strG = com.google.android.gms.common.internal.r.g(bundle.getString("name"));
        if (!c0824t3.f4245a.o()) {
            c0824t3.f4245a.d().v().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            c0824t3.f4245a.L().s(new C0725d(bundle.getString("app_id"), "", new V4(strG, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c0824t3.f4245a.N().y0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
