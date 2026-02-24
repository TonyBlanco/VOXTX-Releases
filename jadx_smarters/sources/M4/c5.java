package M4;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes3.dex */
public final class c5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzcf f4635a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f4636c;

    public c5(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar) {
        this.f4636c = appMeasurementDynamiteService;
        this.f4635a = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4636c.f26947a.N().E(this.f4635a, this.f4636c.f26947a.n());
    }
}
