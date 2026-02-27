package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C1371k;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzav {
    private final zzbg<zzam> zza;
    private final Context zzb;
    private boolean zzc = false;
    private final Map<C1371k.a, zzau> zzd = new HashMap();
    private final Map<C1371k.a, zzas> zze = new HashMap();
    private final Map<C1371k.a, zzar> zzf = new HashMap();

    public zzav(Context context, zzbg<zzam> zzbgVar) {
        this.zzb = context;
        this.zza = zzbgVar;
    }

    public final Location zza(String str) throws RemoteException {
        ((zzh) this.zza).zza.checkConnected();
        return ((zzh) this.zza).zza().zzn(str);
    }

    @Deprecated
    public final Location zzb() throws RemoteException {
        ((zzh) this.zza).zza.checkConnected();
        return ((zzh) this.zza).zza().zzm();
    }

    public final LocationAvailability zzc() throws RemoteException {
        ((zzh) this.zza).zza.checkConnected();
        return ((zzh) this.zza).zza().zzs(this.zzb.getPackageName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(LocationRequest locationRequest, C1371k c1371k, zzai zzaiVar) throws RemoteException {
        zzau zzauVar;
        zzau zzauVar2;
        ((zzh) this.zza).zza.checkConnected();
        C1371k.a aVarB = c1371k.b();
        if (aVarB == null) {
            zzauVar2 = null;
        } else {
            synchronized (this.zzd) {
                try {
                    zzauVar = this.zzd.get(aVarB);
                    if (zzauVar == null) {
                        zzauVar = new zzau(c1371k);
                    }
                    this.zzd.put(aVarB, zzauVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzauVar2 = zzauVar;
        }
        if (zzauVar2 == null) {
            return;
        }
        ((zzh) this.zza).zza().zzo(new zzbc(1, zzba.zza(null, locationRequest), zzauVar2, null, null, zzaiVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(zzba zzbaVar, C1371k c1371k, zzai zzaiVar) throws RemoteException {
        zzar zzarVar;
        ((zzh) this.zza).zza.checkConnected();
        C1371k.a aVarB = c1371k.b();
        if (aVarB == null) {
            zzarVar = null;
        } else {
            synchronized (this.zzf) {
                try {
                    zzar zzarVar2 = this.zzf.get(aVarB);
                    if (zzarVar2 == null) {
                        zzarVar2 = new zzar(c1371k);
                    }
                    zzarVar = zzarVar2;
                    this.zzf.put(aVarB, zzarVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zzar zzarVar3 = zzarVar;
        if (zzarVar3 == null) {
            return;
        }
        ((zzh) this.zza).zza().zzo(new zzbc(1, zzbaVar, null, null, zzarVar3, zzaiVar));
    }

    public final void zzf(zzba zzbaVar, PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzo(zzbc.zzb(zzbaVar, pendingIntent, zzaiVar));
    }

    public final void zzg(LocationRequest locationRequest, PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzo(zzbc.zzb(zzba.zza(null, locationRequest), pendingIntent, zzaiVar));
    }

    public final void zzh(C1371k.a aVar, zzai zzaiVar) throws RemoteException {
        ((zzh) this.zza).zza.checkConnected();
        r.n(aVar, "Invalid null listener key");
        synchronized (this.zzd) {
            try {
                zzau zzauVarRemove = this.zzd.remove(aVar);
                if (zzauVarRemove != null) {
                    zzauVarRemove.zzc();
                    ((zzh) this.zza).zza().zzo(zzbc.zza(zzauVarRemove, zzaiVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzi(C1371k.a aVar, zzai zzaiVar) throws RemoteException {
        ((zzh) this.zza).zza.checkConnected();
        r.n(aVar, "Invalid null listener key");
        synchronized (this.zzf) {
            try {
                zzar zzarVarRemove = this.zzf.remove(aVar);
                if (zzarVarRemove != null) {
                    zzarVarRemove.zzc();
                    ((zzh) this.zza).zza().zzo(zzbc.zzc(zzarVarRemove, zzaiVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzj(PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzo(new zzbc(2, null, null, pendingIntent, null, zzaiVar));
    }

    public final void zzk(boolean z9) throws RemoteException {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzp(z9);
        this.zzc = z9;
    }

    public final void zzl(Location location) throws RemoteException {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzq(location);
    }

    public final void zzm(zzai zzaiVar) throws RemoteException {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzr(zzaiVar);
    }

    public final void zzn() throws RemoteException {
        synchronized (this.zzd) {
            try {
                for (zzau zzauVar : this.zzd.values()) {
                    if (zzauVar != null) {
                        ((zzh) this.zza).zza().zzo(zzbc.zza(zzauVar, null));
                    }
                }
                this.zzd.clear();
            } finally {
            }
        }
        synchronized (this.zzf) {
            try {
                for (zzar zzarVar : this.zzf.values()) {
                    if (zzarVar != null) {
                        ((zzh) this.zza).zza().zzo(zzbc.zzc(zzarVar, null));
                    }
                }
                this.zzf.clear();
            } finally {
            }
        }
        synchronized (this.zze) {
            try {
                for (zzas zzasVar : this.zze.values()) {
                    if (zzasVar != null) {
                        ((zzh) this.zza).zza().zzu(new zzl(2, null, zzasVar, null));
                    }
                }
                this.zze.clear();
            } finally {
            }
        }
    }

    public final void zzo() throws RemoteException {
        if (this.zzc) {
            zzk(false);
        }
    }
}
