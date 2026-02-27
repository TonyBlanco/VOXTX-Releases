package t4;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.AbstractC1409h;
import com.google.android.gms.common.internal.C1406e;
import w4.C2916d;

/* JADX INFO: loaded from: classes3.dex */
public final class S extends AbstractC1409h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2775b f50699g = new C2775b("CastClientImplCxless");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CastDevice f50700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f50701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f50702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f50703f;

    public S(Context context, Looper looper, C1406e c1406e, CastDevice castDevice, long j9, Bundle bundle, String str, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
        super(context, looper, 10, c1406e, bVar, cVar);
        this.f50700c = castDevice;
        this.f50701d = j9;
        this.f50702e = bundle;
        this.f50703f = str;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return iInterfaceQueryLocalInterface instanceof C2782i ? (C2782i) iInterfaceQueryLocalInterface : new C2782i(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c, com.google.android.gms.common.api.a.f
    public final void disconnect() {
        try {
            try {
                ((C2782i) getService()).zzf();
            } finally {
                super.disconnect();
            }
        } catch (RemoteException | IllegalStateException e9) {
            f50699g.b(e9, "Error while disconnecting the controller interface", new Object[0]);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final C2916d[] getApiFeatures() {
        return n4.C.f45276n;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        f50699g.a("getRemoteService()", new Object[0]);
        this.f50700c.P(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.f50701d);
        bundle.putString("connectionless_client_record_id", this.f50703f);
        Bundle bundle2 = this.f50702e;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final int getMinApkVersion() {
        return 19390000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
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
