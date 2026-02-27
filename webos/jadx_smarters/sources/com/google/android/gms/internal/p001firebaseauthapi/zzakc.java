package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes3.dex */
final class zzakc implements zzakk {
    private zzakk[] zza;

    public zzakc(zzakk... zzakkVarArr) {
        this.zza = zzakkVarArr;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakk
    public final zzakl zza(Class<?> cls) {
        for (zzakk zzakkVar : this.zza) {
            if (zzakkVar.zzb(cls)) {
                return zzakkVar.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakk
    public final boolean zzb(Class<?> cls) {
        for (zzakk zzakkVar : this.zza) {
            if (zzakkVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
