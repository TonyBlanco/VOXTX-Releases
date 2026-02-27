package com.google.android.gms.internal.location;

import J4.C0645d;
import J4.C0649h;
import J4.C0653l;
import J4.C0658q;
import J4.P;
import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.InterfaceC1365h;
import com.google.android.gms.location.LocationAvailability;

/* JADX INFO: loaded from: classes3.dex */
public interface zzam extends IInterface {
    void zzd(C0649h c0649h, PendingIntent pendingIntent, zzak zzakVar) throws RemoteException;

    void zze(PendingIntent pendingIntent, zzak zzakVar, String str) throws RemoteException;

    void zzf(String[] strArr, zzak zzakVar, String str) throws RemoteException;

    void zzg(P p9, zzak zzakVar) throws RemoteException;

    void zzh(long j9, boolean z9, PendingIntent pendingIntent) throws RemoteException;

    void zzi(C0645d c0645d, PendingIntent pendingIntent, InterfaceC1365h interfaceC1365h) throws RemoteException;

    void zzj(PendingIntent pendingIntent, InterfaceC1365h interfaceC1365h) throws RemoteException;

    void zzk(PendingIntent pendingIntent) throws RemoteException;

    void zzl(PendingIntent pendingIntent, InterfaceC1365h interfaceC1365h) throws RemoteException;

    @Deprecated
    Location zzm() throws RemoteException;

    Location zzn(String str) throws RemoteException;

    void zzo(zzbc zzbcVar) throws RemoteException;

    void zzp(boolean z9) throws RemoteException;

    void zzq(Location location) throws RemoteException;

    void zzr(zzai zzaiVar) throws RemoteException;

    LocationAvailability zzs(String str) throws RemoteException;

    void zzt(C0653l c0653l, zzao zzaoVar, String str) throws RemoteException;

    void zzu(zzl zzlVar) throws RemoteException;

    void zzv(PendingIntent pendingIntent, C0658q c0658q, InterfaceC1365h interfaceC1365h) throws RemoteException;
}
