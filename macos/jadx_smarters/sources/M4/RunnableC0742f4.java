package M4;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: renamed from: M4.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0742f4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC0754h4 f4680a;

    public RunnableC0742f4(ServiceConnectionC0754h4 serviceConnectionC0754h4) {
        this.f4680a = serviceConnectionC0754h4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0760i4 c0760i4 = this.f4680a.f4724d;
        Context contextC = c0760i4.f4245a.c();
        this.f4680a.f4724d.f4245a.b();
        C0760i4.M(c0760i4, new ComponentName(contextC, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
