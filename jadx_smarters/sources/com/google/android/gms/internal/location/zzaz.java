package com.google.android.gms.internal.location;

import C4.b;
import J4.C0645d;
import J4.C0649h;
import J4.C0653l;
import J4.P;
import J4.a0;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.C1371k;
import com.google.android.gms.common.api.internal.InterfaceC1359e;
import com.google.android.gms.common.internal.C1406e;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaz extends zzi {
    private final zzav zzf;

    public zzaz(Context context, Looper looper, GoogleApiClient.b bVar, GoogleApiClient.c cVar, String str, C1406e c1406e) {
        super(context, looper, bVar, cVar, str, c1406e);
        this.zzf = new zzav(context, this.zze);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c, com.google.android.gms.common.api.a.f
    public final void disconnect() {
        synchronized (this.zzf) {
            if (isConnected()) {
                try {
                    this.zzf.zzn();
                    this.zzf.zzo();
                } catch (Exception e9) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e9);
                }
                super.disconnect();
            } else {
                super.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final LocationAvailability zzA() throws RemoteException {
        return this.zzf.zzc();
    }

    public final void zzB(zzba zzbaVar, C1371k c1371k, zzai zzaiVar) throws RemoteException {
        synchronized (this.zzf) {
            this.zzf.zze(zzbaVar, c1371k, zzaiVar);
        }
    }

    public final void zzC(LocationRequest locationRequest, C1371k c1371k, zzai zzaiVar) throws RemoteException {
        synchronized (this.zzf) {
            this.zzf.zzd(locationRequest, c1371k, zzaiVar);
        }
    }

    public final void zzD(zzba zzbaVar, PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        this.zzf.zzf(zzbaVar, pendingIntent, zzaiVar);
    }

    public final void zzE(LocationRequest locationRequest, PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        this.zzf.zzg(locationRequest, pendingIntent, zzaiVar);
    }

    public final void zzF(C1371k.a aVar, zzai zzaiVar) throws RemoteException {
        this.zzf.zzh(aVar, zzaiVar);
    }

    public final void zzG(PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        this.zzf.zzj(pendingIntent, zzaiVar);
    }

    public final void zzH(C1371k.a aVar, zzai zzaiVar) throws RemoteException {
        this.zzf.zzi(aVar, zzaiVar);
    }

    public final void zzI(boolean z9) throws RemoteException {
        this.zzf.zzk(z9);
    }

    public final void zzJ(Location location) throws RemoteException {
        this.zzf.zzl(location);
    }

    public final void zzK(zzai zzaiVar) throws RemoteException {
        this.zzf.zzm(zzaiVar);
    }

    public final void zzL(C0653l c0653l, InterfaceC1359e interfaceC1359e, String str) throws RemoteException {
        checkConnected();
        r.b(c0653l != null, "locationSettingsRequest can't be null nor empty.");
        r.b(interfaceC1359e != null, "listener can't be null.");
        ((zzam) getService()).zzt(c0653l, new zzay(interfaceC1359e), null);
    }

    public final void zzq(long j9, PendingIntent pendingIntent) throws RemoteException {
        checkConnected();
        r.m(pendingIntent);
        r.b(j9 >= 0, "detectionIntervalMillis must be >= 0");
        ((zzam) getService()).zzh(j9, true, pendingIntent);
    }

    public final void zzr(C0645d c0645d, PendingIntent pendingIntent, InterfaceC1359e interfaceC1359e) throws RemoteException {
        checkConnected();
        r.n(c0645d, "activityTransitionRequest must be specified.");
        r.n(pendingIntent, "PendingIntent must be specified.");
        r.n(interfaceC1359e, "ResultHolder not provided.");
        ((zzam) getService()).zzi(c0645d, pendingIntent, new com.google.android.gms.common.api.internal.r(interfaceC1359e));
    }

    public final void zzs(PendingIntent pendingIntent, InterfaceC1359e interfaceC1359e) throws RemoteException {
        checkConnected();
        r.n(interfaceC1359e, "ResultHolder not provided.");
        ((zzam) getService()).zzj(pendingIntent, new com.google.android.gms.common.api.internal.r(interfaceC1359e));
    }

    public final void zzt(PendingIntent pendingIntent) throws RemoteException {
        checkConnected();
        r.m(pendingIntent);
        ((zzam) getService()).zzk(pendingIntent);
    }

    public final void zzu(PendingIntent pendingIntent, InterfaceC1359e interfaceC1359e) throws RemoteException {
        checkConnected();
        r.n(pendingIntent, "PendingIntent must be specified.");
        r.n(interfaceC1359e, "ResultHolder not provided.");
        ((zzam) getService()).zzl(pendingIntent, new com.google.android.gms.common.api.internal.r(interfaceC1359e));
    }

    public final void zzv(C0649h c0649h, PendingIntent pendingIntent, InterfaceC1359e interfaceC1359e) throws RemoteException {
        checkConnected();
        r.n(c0649h, "geofencingRequest can't be null.");
        r.n(pendingIntent, "PendingIntent must be specified.");
        r.n(interfaceC1359e, "ResultHolder not provided.");
        ((zzam) getService()).zzd(c0649h, pendingIntent, new zzaw(interfaceC1359e));
    }

    public final void zzw(P p9, InterfaceC1359e interfaceC1359e) throws RemoteException {
        checkConnected();
        r.n(p9, "removeGeofencingRequest can't be null.");
        r.n(interfaceC1359e, "ResultHolder not provided.");
        ((zzam) getService()).zzg(p9, new zzax(interfaceC1359e));
    }

    public final void zzx(PendingIntent pendingIntent, InterfaceC1359e interfaceC1359e) throws RemoteException {
        checkConnected();
        r.n(pendingIntent, "PendingIntent must be specified.");
        r.n(interfaceC1359e, "ResultHolder not provided.");
        ((zzam) getService()).zze(pendingIntent, new zzax(interfaceC1359e), getContext().getPackageName());
    }

    public final void zzy(List<String> list, InterfaceC1359e interfaceC1359e) throws RemoteException {
        checkConnected();
        r.b(list != null && list.size() > 0, "geofenceRequestIds can't be null nor empty.");
        r.n(interfaceC1359e, "ResultHolder not provided.");
        ((zzam) getService()).zzf((String[]) list.toArray(new String[0]), new zzax(interfaceC1359e), getContext().getPackageName());
    }

    public final Location zzz(String str) throws RemoteException {
        return b.b(getAvailableFeatures(), a0.f3278c) ? this.zzf.zza(str) : this.zzf.zzb();
    }
}
