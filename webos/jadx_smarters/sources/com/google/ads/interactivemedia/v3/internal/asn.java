package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class asn extends app implements aso {
    public asn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aso
    public final asl e(ask askVar) throws RemoteException {
        Parcel parcelA = a();
        apr.d(parcelA, askVar);
        Parcel parcelV = v(1, parcelA);
        asl aslVar = (asl) apr.a(parcelV, asl.CREATOR);
        parcelV.recycle();
        return aslVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aso
    public final ast f(ass assVar) throws RemoteException {
        Parcel parcelA = a();
        apr.d(parcelA, assVar);
        Parcel parcelV = v(3, parcelA);
        ast astVar = (ast) apr.a(parcelV, ast.CREATOR);
        parcelV.recycle();
        return astVar;
    }
}
