package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class apy extends app implements apz {
    public apy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apz
    public final IBinder e(aro aroVar, aro aroVar2, byte[] bArr) throws RemoteException {
        Parcel parcelA = a();
        apr.e(parcelA, aroVar);
        apr.e(parcelA, aroVar2);
        parcelA.writeByteArray(bArr);
        Parcel parcelV = v(3, parcelA);
        IBinder strongBinder = parcelV.readStrongBinder();
        parcelV.recycle();
        return strongBinder;
    }
}
