package com.google.android.gms.internal.play_billing;

import j$.util.Objects;
import java.util.AbstractMap;

/* JADX INFO: loaded from: classes3.dex */
final class zzap extends zzai {
    final /* synthetic */ zzaq zza;

    public zzap(zzaq zzaqVar) {
        this.zza = zzaqVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i9) {
        zzaa.zza(i9, this.zza.zzc, "index");
        int i10 = i9 + i9;
        Object obj = this.zza.zzb[i10];
        Objects.requireNonNull(obj);
        Object obj2 = this.zza.zzb[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf
    public final boolean zzf() {
        return true;
    }
}
