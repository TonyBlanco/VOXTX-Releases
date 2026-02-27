package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class atb extends app implements atd {
    public atb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atd
    public final void e() throws RemoteException {
        w(3, a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atd
    public final void f(int i9) throws RemoteException {
        Parcel parcelA = a();
        parcelA.writeInt(i9);
        w(7, parcelA);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atd
    public final void g(int i9) throws RemoteException {
        Parcel parcelA = a();
        parcelA.writeInt(i9);
        w(6, parcelA);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atd
    public final void h(byte[] bArr) throws RemoteException {
        Parcel parcelA = a();
        parcelA.writeByteArray(bArr);
        w(5, parcelA);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atd
    public final void i(aro aroVar, String str) throws RemoteException {
        Parcel parcelA = a();
        apr.e(parcelA, aroVar);
        parcelA.writeString(str);
        parcelA.writeString(null);
        w(8, parcelA);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atd
    public final void j() throws RemoteException {
        Parcel parcelA = a();
        parcelA.writeIntArray(null);
        w(4, parcelA);
    }
}
