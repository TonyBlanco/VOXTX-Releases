package com.google.android.gms.internal.cast;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes3.dex */
final class zzfp extends zzfh {
    final /* synthetic */ zzfq zza;

    public zzfp(zzfq zzfqVar) {
        this.zza = zzfqVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i9) {
        zzeu.zza(i9, this.zza.zzc, "index");
        zzfq zzfqVar = this.zza;
        int i10 = i9 + i9;
        Object obj = zzfqVar.zzb[i10];
        obj.getClass();
        Object obj2 = zzfqVar.zzb[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public final boolean zzf() {
        return true;
    }
}
