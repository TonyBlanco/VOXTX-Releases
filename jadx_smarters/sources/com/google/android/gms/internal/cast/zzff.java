package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
final class zzff extends zzex {
    private final zzfh zza;

    public zzff(zzfh zzfhVar, int i9) {
        super(zzfhVar.size(), i9);
        this.zza = zzfhVar;
    }

    @Override // com.google.android.gms.internal.cast.zzex
    public final Object zza(int i9) {
        return this.zza.get(i9);
    }
}
