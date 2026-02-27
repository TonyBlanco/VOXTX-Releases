package com.google.android.gms.internal.firebase_messaging;

import d6.InterfaceC1711a;
import d6.InterfaceC1712b;
import r6.C2680a;
import r6.C2681b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzd implements InterfaceC1711a {
    public static final InterfaceC1711a zza = new zzd();

    private zzd() {
    }

    @Override // d6.InterfaceC1711a
    public final void configure(InterfaceC1712b interfaceC1712b) {
        interfaceC1712b.registerEncoder(zze.class, zzc.zza);
        interfaceC1712b.registerEncoder(C2681b.class, zzb.zza);
        interfaceC1712b.registerEncoder(C2680a.class, zza.zza);
    }
}
