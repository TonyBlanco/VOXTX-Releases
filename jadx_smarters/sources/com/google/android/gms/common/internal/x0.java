package com.google.android.gms.common.internal;

import F4.a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zza;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends zza implements T {
    public x0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.T
    public final int zzc() throws RemoteException {
        Parcel parcelZzB = zzB(2, zza());
        int i9 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i9;
    }

    @Override // com.google.android.gms.common.internal.T
    public final F4.a zzd() throws RemoteException {
        Parcel parcelZzB = zzB(1, zza());
        F4.a aVarA = a.AbstractBinderC0028a.A(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarA;
    }
}
