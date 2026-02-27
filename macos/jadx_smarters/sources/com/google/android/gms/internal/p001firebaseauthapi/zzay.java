package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes3.dex */
final class zzay extends zzap {
    private final /* synthetic */ zzaz zza;

    public zzay(zzaz zzazVar) {
        this.zza = zzazVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i9) {
        zzy.zza(i9, this.zza.zzd);
        int i10 = i9 * 2;
        Object obj = this.zza.zzb[i10];
        obj.getClass();
        Object obj2 = this.zza.zzb[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzd;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzak
    public final boolean zze() {
        return true;
    }
}
