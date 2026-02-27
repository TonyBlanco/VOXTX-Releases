package t4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.AbstractC1409h;
import com.google.android.gms.common.internal.C1406e;
import w4.C2916d;

/* JADX INFO: loaded from: classes3.dex */
public final class I extends AbstractC1409h {
    public I(Context context, Looper looper, C1406e c1406e, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
        super(context, looper, 161, c1406e, bVar, cVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        return iInterfaceQueryLocalInterface instanceof C2785l ? (C2785l) iInterfaceQueryLocalInterface : new C2785l(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final C2916d[] getApiFeatures() {
        return n4.C.f45276n;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final String getStartServiceAction() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
