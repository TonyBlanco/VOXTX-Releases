package M4;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes3.dex */
public final class e5 implements P2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzci f4667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f4668b;

    public e5(AppMeasurementDynamiteService appMeasurementDynamiteService, zzci zzciVar) {
        this.f4668b = appMeasurementDynamiteService;
        this.f4667a = zzciVar;
    }

    @Override // M4.P2
    public final void a(String str, String str2, Bundle bundle, long j9) {
        try {
            this.f4667a.zze(str, str2, bundle, j9);
        } catch (RemoteException e9) {
            C0776l2 c0776l2 = this.f4668b.f26947a;
            if (c0776l2 != null) {
                c0776l2.d().w().b("Event listener threw exception", e9);
            }
        }
    }
}
