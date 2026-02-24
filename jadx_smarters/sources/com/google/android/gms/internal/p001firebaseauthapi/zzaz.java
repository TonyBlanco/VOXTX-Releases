package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzaz<K, V> extends zzau<Map.Entry<K, V>> {
    private final transient zzat<K, V> zza;
    private final transient Object[] zzb;
    private final transient int zzc = 0;
    private final transient int zzd;

    public zzaz(zzat<K, V> zzatVar, Object[] objArr, int i9, int i10) {
        this.zza = zzatVar;
        this.zzb = objArr;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzak, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzau, com.google.android.gms.internal.p001firebaseauthapi.zzak, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzak
    public final int zza(Object[] objArr, int i9) {
        return zzc().zza(objArr, i9);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzak
    /* JADX INFO: renamed from: zzd */
    public final zzbc<Map.Entry<K, V>> iterator() {
        return (zzbc) zzc().iterator();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzak
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzau
    public final zzap<Map.Entry<K, V>> zzg() {
        return new zzay(this);
    }
}
