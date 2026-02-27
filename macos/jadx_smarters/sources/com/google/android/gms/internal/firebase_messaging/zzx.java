package com.google.android.gms.internal.firebase_messaging;

import c6.e;
import c6.g;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzx {
    private final Map<Class<?>, e> zza;
    private final Map<Class<?>, g> zzb;
    private final e zzc;

    public zzx(Map<Class<?>, e> map, Map<Class<?>, g> map2, e eVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = eVar;
    }

    public final void zza(Object obj, OutputStream outputStream) throws IOException {
        new zzu(outputStream, this.zza, this.zzb, this.zzc).zzf(obj);
    }
}
