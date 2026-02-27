package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zzbb<K> extends zzau<K> {
    private final transient zzat<K, ?> zza;
    private final transient zzap<K> zzb;

    public zzbb(zzat<K, ?> zzatVar, zzap<K> zzapVar) {
        this.zza = zzatVar;
        this.zzb = zzapVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzak, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzau, com.google.android.gms.internal.p001firebaseauthapi.zzak, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzak
    public final int zza(Object[] objArr, int i9) {
        return zzc().zza(objArr, i9);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzau, com.google.android.gms.internal.p001firebaseauthapi.zzak
    public final zzap<K> zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzak
    /* JADX INFO: renamed from: zzd */
    public final zzbc<K> iterator() {
        return (zzbc) zzc().iterator();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzak
    public final boolean zze() {
        return true;
    }
}
