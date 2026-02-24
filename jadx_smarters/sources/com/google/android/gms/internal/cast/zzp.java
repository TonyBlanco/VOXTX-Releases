package com.google.android.gms.internal.cast;

import C4.e;
import C4.h;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.internal.r;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o4.C2325b;
import t4.C2775b;
import u0.C2812L;

/* JADX INFO: loaded from: classes3.dex */
public final class zzp {
    private static final C2775b zza = new C2775b("DialogDiscovery");
    private static final String zzb = "21.3.0";
    private static zzp zzc;
    private final zzf zzd;
    private final String zze;
    private String zzi;
    private final Map zzg = DesugarCollections.synchronizedMap(new HashMap());
    private int zzp = 1;
    private long zzj = 1;
    private long zzk = 1;
    private long zzl = -1;
    private int zzm = -1;
    private int zzn = 0;
    private int zzo = 0;
    private final zzn zzf = new zzn(this);
    private final e zzh = h.c();

    private zzp(zzf zzfVar, String str) {
        this.zzd = zzfVar;
        this.zze = str;
    }

    public static zzv zza() {
        zzp zzpVar = zzc;
        if (zzpVar == null) {
            return null;
        }
        return zzpVar.zzf;
    }

    public static void zzg(zzf zzfVar, String str) {
        if (zzc == null) {
            zzc = new zzp(zzfVar, str);
        }
    }

    private final long zzh() {
        return this.zzh.a();
    }

    private final zzo zzi(C2812L.h hVar) {
        String strH;
        String strZzc;
        CastDevice castDeviceK = CastDevice.K(hVar.i());
        if (castDeviceK == null || castDeviceK.H() == null) {
            int i9 = this.zzn;
            this.zzn = i9 + 1;
            strH = "UNKNOWN_DEVICE_ID" + i9;
        } else {
            strH = castDeviceK.H();
        }
        if (castDeviceK == null || castDeviceK.zzc() == null) {
            int i10 = this.zzo;
            this.zzo = i10 + 1;
            strZzc = "UNKNOWN_RECEIVER_METRICS_ID" + i10;
        } else {
            strZzc = castDeviceK.zzc();
        }
        if (!strH.startsWith("UNKNOWN_DEVICE_ID") && this.zzg.containsKey(strH)) {
            return (zzo) this.zzg.get(strH);
        }
        zzo zzoVar = new zzo((String) r.m(strZzc), zzh());
        this.zzg.put(strH, zzoVar);
        return zzoVar;
    }

    private final zzmq zzj(zzmt zzmtVar) {
        zzmf zzmfVarZza = zzmg.zza();
        zzmfVarZza.zzb(zzb);
        zzmfVarZza.zza(this.zze);
        zzmg zzmgVar = (zzmg) zzmfVarZza.zzp();
        zzmp zzmpVarZzc = zzmq.zzc();
        zzmpVarZzc.zzb(zzmgVar);
        if (zzmtVar != null) {
            C2325b c2325bD = C2325b.d();
            boolean z9 = false;
            if (c2325bD != null && c2325bD.a().R()) {
                z9 = true;
            }
            zzmtVar.zzh(z9);
            zzmtVar.zzd(this.zzj);
            zzmpVarZzc.zzg(zzmtVar);
        }
        return (zzmq) zzmpVarZzc.zzp();
    }

    private final void zzk() {
        this.zzg.clear();
        this.zzi = "";
        this.zzj = -1L;
        this.zzk = -1L;
        this.zzl = -1L;
        this.zzm = -1;
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzl(int i9) {
        zzk();
        this.zzi = UUID.randomUUID().toString();
        this.zzj = zzh();
        this.zzm = 1;
        this.zzp = 2;
        zzmt zzmtVarZza = zzmu.zza();
        zzmtVarZza.zzg(this.zzi);
        zzmtVarZza.zzd(this.zzj);
        zzmtVarZza.zzb(1);
        this.zzd.zzd(zzj(zzmtVarZza), 351);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzm(C2812L.h hVar) {
        if (this.zzp == 1) {
            this.zzd.zzd(zzj(null), 353);
            return;
        }
        this.zzp = 4;
        zzmt zzmtVarZza = zzmu.zza();
        zzmtVarZza.zzg(this.zzi);
        zzmtVarZza.zzd(this.zzj);
        zzmtVarZza.zze(this.zzk);
        zzmtVarZza.zzf(this.zzl);
        zzmtVarZza.zzb(this.zzm);
        zzmtVarZza.zzc(zzh());
        ArrayList arrayList = new ArrayList();
        for (zzo zzoVar : this.zzg.values()) {
            zzmr zzmrVarZza = zzms.zza();
            zzmrVarZza.zzb(zzoVar.zza);
            zzmrVarZza.zza(zzoVar.zzb);
            arrayList.add((zzms) zzmrVarZza.zzp());
        }
        zzmtVarZza.zza(arrayList);
        if (hVar != null) {
            zzmtVarZza.zzi(zzi(hVar).zza);
        }
        zzmq zzmqVarZzj = zzj(zzmtVarZza);
        zzk();
        zza.a("logging ClientDiscoverySessionSummary. Device Count: " + this.zzg.size(), new Object[0]);
        this.zzd.zzd(zzmqVarZzj, 353);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzn(List list) {
        try {
            if (this.zzp != 2) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzi((C2812L.h) it.next());
            }
            if (this.zzl < 0) {
                this.zzl = zzh();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzo() {
        if (this.zzp != 2) {
            this.zzd.zzd(zzj(null), 352);
            return;
        }
        this.zzk = zzh();
        this.zzp = 3;
        zzmt zzmtVarZza = zzmu.zza();
        zzmtVarZza.zzg(this.zzi);
        zzmtVarZza.zze(this.zzk);
        this.zzd.zzd(zzj(zzmtVarZza), 352);
    }
}
