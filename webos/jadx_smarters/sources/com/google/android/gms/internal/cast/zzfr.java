package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zzfr extends zzfl {
    private final transient zzfk zza;
    private final transient zzfh zzb;

    public zzfr(zzfk zzfkVar, zzfh zzfhVar) {
        this.zza = zzfkVar;
        this.zzb = zzfhVar;
    }

    @Override // com.google.android.gms.internal.cast.zzfd, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.cast.zzfl, com.google.android.gms.internal.cast.zzfd, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public final int zza(Object[] objArr, int i9) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.cast.zzfl, com.google.android.gms.internal.cast.zzfd
    public final zzfh zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.cast.zzfl, com.google.android.gms.internal.cast.zzfd
    /* JADX INFO: renamed from: zze */
    public final zzfx iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public final boolean zzf() {
        throw null;
    }
}
