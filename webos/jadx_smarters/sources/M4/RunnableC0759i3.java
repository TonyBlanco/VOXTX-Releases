package M4;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: renamed from: M4.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0759i3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzcf f4740a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f4741c;

    public RunnableC0759i3(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar) {
        this.f4741c = appMeasurementDynamiteService;
        this.f4740a = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4741c.f26947a.L().R(this.f4740a);
    }
}
