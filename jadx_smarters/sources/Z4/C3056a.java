package z4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C1422v;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* JADX INFO: renamed from: z4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3056a extends zaa implements IInterface {
    public C3056a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void A(C1422v c1422v) throws RemoteException {
        Parcel parcelZaa = zaa();
        zac.zac(parcelZaa, c1422v);
        zad(1, parcelZaa);
    }
}
