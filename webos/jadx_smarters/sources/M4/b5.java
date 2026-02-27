package M4;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes3.dex */
public final class b5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzcf f4614a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f4617e;

    public b5(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, String str, String str2) {
        this.f4617e = appMeasurementDynamiteService;
        this.f4614a = zzcfVar;
        this.f4615c = str;
        this.f4616d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4617e.f26947a.L().T(this.f4614a, this.f4615c, this.f4616d);
    }
}
