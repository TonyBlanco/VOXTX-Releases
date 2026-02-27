package M4;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class U1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T1 f4507a;

    public U1(T1 t12) {
        com.google.android.gms.common.internal.r.m(t12);
        this.f4507a = t12;
    }

    public final void a(Context context, Intent intent) {
        C0776l2 c0776l2H = C0776l2.H(context, null, null);
        C0858z1 c0858z1D = c0776l2H.d();
        if (intent == null) {
            c0858z1D.w().a("Receiver called with null intent");
            return;
        }
        c0776l2H.b();
        String action = intent.getAction();
        c0858z1D.v().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                c0858z1D.w().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            c0858z1D.v().a("Starting wakeful intent.");
            this.f4507a.a(context, className);
        }
    }
}
