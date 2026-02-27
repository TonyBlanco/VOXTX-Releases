package com.google.android.gms.internal.cast;

import android.content.Context;
import u0.C2812L;

/* JADX INFO: loaded from: classes3.dex */
public final class zzax {
    public C2812L zza;
    private final Context zzb;

    public zzax(Context context) {
        this.zzb = context;
    }

    public final C2812L zza() {
        if (this.zza == null) {
            this.zza = C2812L.j(this.zzb);
        }
        return this.zza;
    }

    public final void zzb(C2812L.a aVar) {
        C2812L c2812lZza = zza();
        if (c2812lZza != null) {
            c2812lZza.s(aVar);
        }
    }
}
