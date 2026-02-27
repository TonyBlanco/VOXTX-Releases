package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class apv extends app implements apx {
    public apv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final int b() throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final aro c(aro aroVar, aro aroVar2) throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final aro d(aro aroVar, aro aroVar2) throws RemoteException {
        Parcel parcelA = a();
        apr.e(parcelA, aroVar);
        apr.e(parcelA, aroVar2);
        Parcel parcelV = v(6, parcelA);
        aro aroVarB = arn.b(parcelV.readStrongBinder());
        parcelV.recycle();
        return aroVarB;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final String e(aro aroVar, String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final String f(aro aroVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final String g(aro aroVar, byte[] bArr) throws RemoteException {
        Parcel parcelA = a();
        apr.e(parcelA, aroVar);
        parcelA.writeByteArray(null);
        Parcel parcelV = v(12, parcelA);
        String string = parcelV.readString();
        parcelV.recycle();
        return string;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final String h(aro aroVar, aro aroVar2, aro aroVar3, aro aroVar4) throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final String i(aro aroVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final String j() throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final String k(aro aroVar, aro aroVar2, aro aroVar3) throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final void l(aro aroVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final void m(aro aroVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final void n(String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final void o(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final boolean p(aro aroVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final boolean q(aro aroVar) throws RemoteException {
        Parcel parcelA = a();
        apr.e(parcelA, aroVar);
        Parcel parcelV = v(4, parcelA);
        boolean zF = apr.f(parcelV);
        parcelV.recycle();
        return zF;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final boolean r() throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final boolean s(String str, boolean z9) throws RemoteException {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final boolean t() throws RemoteException {
        throw null;
    }
}
