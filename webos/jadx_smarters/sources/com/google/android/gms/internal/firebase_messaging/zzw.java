package com.google.android.gms.internal.firebase_messaging;

import c6.c;
import c6.e;
import c6.g;
import d6.InterfaceC1712b;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzw implements InterfaceC1712b {
    public static final /* synthetic */ int zza = 0;
    private static final e zzb = new e() { // from class: com.google.android.gms.internal.firebase_messaging.zzv
        @Override // c6.b
        public final void encode(Object obj, Object obj2) {
            int i9 = zzw.zza;
            String strValueOf = String.valueOf(obj.getClass().getCanonicalName());
            throw new c(strValueOf.length() != 0 ? "Couldn't find encoder for type ".concat(strValueOf) : new String("Couldn't find encoder for type "));
        }
    };
    private final Map<Class<?>, e> zzc = new HashMap();
    private final Map<Class<?>, g> zzd = new HashMap();
    private final e zze = zzb;

    @Override // d6.InterfaceC1712b
    public final /* bridge */ /* synthetic */ InterfaceC1712b registerEncoder(Class cls, e eVar) {
        this.zzc.put(cls, eVar);
        this.zzd.remove(cls);
        return this;
    }

    public final /* bridge */ /* synthetic */ InterfaceC1712b registerEncoder(Class cls, g gVar) {
        this.zzd.put(cls, gVar);
        this.zzc.remove(cls);
        return this;
    }

    public final zzx zza() {
        return new zzx(new HashMap(this.zzc), new HashMap(this.zzd), this.zze);
    }
}
