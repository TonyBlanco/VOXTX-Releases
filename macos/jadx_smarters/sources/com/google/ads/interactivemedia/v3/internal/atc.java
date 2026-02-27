package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class atc extends apq implements atd {
    public atc() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    public atc(byte[] bArr) {
        this();
    }

    public static atd b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
        return iInterfaceQueryLocalInterface instanceof atd ? (atd) iInterfaceQueryLocalInterface : new atb(iBinder);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apq
    public final boolean a(int i9, Parcel parcel, Parcel parcel2) throws RemoteException {
        switch (i9) {
            case 2:
                arn.b(parcel.readStrongBinder());
                parcel.readString();
                apr.b(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.createIntArray();
                apr.b(parcel);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.createByteArray();
                apr.b(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
            case 7:
                parcel.readInt();
                apr.b(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                arn.b(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                apr.b(parcel);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atd
    public final void e() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atd
    public final void f(int i9) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atd
    public final void g(int i9) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atd
    public final void h(byte[] bArr) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atd
    public final void i(aro aroVar, String str) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atd
    public final void j() {
    }
}
