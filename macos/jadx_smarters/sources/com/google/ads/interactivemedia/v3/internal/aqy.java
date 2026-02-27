package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class aqy extends app implements ara {
    public aqy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.signalsdk.ISignalSdkService");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ara
    public final void e(arb arbVar, aqx aqxVar) throws RemoteException {
        Parcel parcelA = a();
        apr.d(parcelA, arbVar);
        apr.e(parcelA, aqxVar);
        x(parcelA);
    }
}
