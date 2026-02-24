package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: loaded from: classes3.dex */
public final class W extends zza implements Y {
    public W(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.Y
    public final boolean Q0(w4.J j9, F4.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, j9);
        zzc.zze(parcelZza, aVar);
        Parcel parcelZzB = zzB(5, parcelZza);
        boolean zZzf = zzc.zzf(parcelZzB);
        parcelZzB.recycle();
        return zZzf;
    }

    @Override // com.google.android.gms.common.internal.Y
    public final w4.H Z0(w4.F f9) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, f9);
        Parcel parcelZzB = zzB(6, parcelZza);
        w4.H h9 = (w4.H) zzc.zza(parcelZzB, w4.H.CREATOR);
        parcelZzB.recycle();
        return h9;
    }

    @Override // com.google.android.gms.common.internal.Y
    public final w4.H j(w4.F f9) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, f9);
        Parcel parcelZzB = zzB(8, parcelZza);
        w4.H h9 = (w4.H) zzc.zza(parcelZzB, w4.H.CREATOR);
        parcelZzB.recycle();
        return h9;
    }

    @Override // com.google.android.gms.common.internal.Y
    public final boolean zzi() throws RemoteException {
        Parcel parcelZzB = zzB(7, zza());
        boolean zZzf = zzc.zzf(parcelZzB);
        parcelZzB.recycle();
        return zZzf;
    }
}
