package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzfq extends zzfl {
    private final transient zzfk zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzfq(zzfk zzfkVar, Object[] objArr, int i9, int i10) {
        this.zza = zzfkVar;
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.cast.zzfd, java.util.AbstractCollection, java.util.Collection
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

    @Override // com.google.android.gms.internal.cast.zzfl, com.google.android.gms.internal.cast.zzfd, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public final int zza(Object[] objArr, int i9) {
        return zzd().zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.cast.zzfl, com.google.android.gms.internal.cast.zzfd
    /* JADX INFO: renamed from: zze */
    public final zzfx iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.zzfl
    public final zzfh zzi() {
        return new zzfp(this);
    }
}
