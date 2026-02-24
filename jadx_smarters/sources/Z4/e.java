package z4;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC1361f;
import com.google.android.gms.common.api.internal.InterfaceC1377n;
import com.google.android.gms.common.internal.AbstractC1409h;
import com.google.android.gms.common.internal.C1406e;
import com.google.android.gms.common.internal.C1425y;
import com.google.android.gms.internal.base.zaf;
import w4.C2916d;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends AbstractC1409h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1425y f52846c;

    public e(Context context, Looper looper, C1406e c1406e, C1425y c1425y, InterfaceC1361f interfaceC1361f, InterfaceC1377n interfaceC1377n) {
        super(context, looper, 270, c1406e, interfaceC1361f, interfaceC1377n);
        this.f52846c = c1425y;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof C3056a ? (C3056a) iInterfaceQueryLocalInterface : new C3056a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final C2916d[] getApiFeatures() {
        return zaf.zab;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f52846c.b();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
