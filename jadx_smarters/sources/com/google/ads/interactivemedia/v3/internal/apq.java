package com.google.ads.interactivemedia.v3.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public class apq extends Binder implements IInterface {
    public apq(String str) {
        attachInterface(this, str);
    }

    public boolean a(int i9, Parcel parcel, Parcel parcel2) throws RemoteException {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i9, parcel, parcel2, i10)) {
            return true;
        }
        return a(i9, parcel, parcel2);
    }
}
