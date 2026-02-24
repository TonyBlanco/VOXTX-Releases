package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class V implements InterfaceC1415n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f26781a;

    public V(IBinder iBinder) {
        this.f26781a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f26781a;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1415n
    public final void i0(InterfaceC1414m interfaceC1414m, C1408g c1408g) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(interfaceC1414m != null ? interfaceC1414m.asBinder() : null);
            if (c1408g != null) {
                parcelObtain.writeInt(1);
                n0.a(c1408g, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f26781a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }
}
