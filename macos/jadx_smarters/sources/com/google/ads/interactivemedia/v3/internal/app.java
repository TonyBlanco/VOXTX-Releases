package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public class app implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f20495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20496b;

    public app(IBinder iBinder, String str) {
        this.f20495a = iBinder;
        this.f20496b = str;
    }

    public final Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f20496b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f20495a;
    }

    public final Parcel v(int i9, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f20495a.transact(i9, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e9) {
                parcelObtain.recycle();
                throw e9;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final void w(int i9, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f20495a.transact(i9, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public final void x(Parcel parcel) throws RemoteException {
        try {
            this.f20495a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
