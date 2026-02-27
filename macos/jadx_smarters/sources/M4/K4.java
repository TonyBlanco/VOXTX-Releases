package M4;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes3.dex */
public final class K4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d5 f4346a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f4347c;

    public K4(AppMeasurementDynamiteService appMeasurementDynamiteService, d5 d5Var) {
        this.f4347c = appMeasurementDynamiteService;
        this.f4346a = d5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4347c.f26947a.I().H(this.f4346a);
    }
}
