package com.google.android.gms.internal.cast;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzds extends zza implements IInterface {
    public zzds(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
    }

    public final void zze() throws RemoteException {
        zzd(3, zza());
    }

    public final void zzf(zzdr zzdrVar, int i9) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzdrVar);
        parcelZza.writeInt(i9);
        zzd(5, parcelZza);
    }

    public final void zzg(zzdr zzdrVar, zzdu zzduVar, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzdrVar);
        zzc.zze(parcelZza, zzduVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzc.zzc(parcelZza, bundle);
        zzd(7, parcelZza);
    }

    public final void zzh(zzdr zzdrVar, PendingIntent pendingIntent, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzdrVar);
        zzc.zzc(parcelZza, pendingIntent);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzc.zzc(parcelZza, bundle);
        zzd(8, parcelZza);
    }

    public final void zzi(zzdr zzdrVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzdrVar);
        zzd(6, parcelZza);
    }
}
