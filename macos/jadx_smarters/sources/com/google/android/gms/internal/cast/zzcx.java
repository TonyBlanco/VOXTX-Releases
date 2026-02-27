package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executors;
import t4.C2775b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcx {
    protected final C2775b zza;
    protected final zzcz zzb;

    public zzcx(Context context) {
        zzcz zzdcVar = Build.VERSION.SDK_INT >= 23 ? new zzdc(context, zzqu.zza(Executors.newFixedThreadPool(3))) : new zzdd();
        this.zza = new C2775b("BaseNetUtils");
        this.zzb = zzdcVar;
        zzdcVar.zza();
    }

    public final boolean zza() {
        zzcz zzczVar = this.zzb;
        return zzczVar != null && zzczVar.zzb();
    }
}
