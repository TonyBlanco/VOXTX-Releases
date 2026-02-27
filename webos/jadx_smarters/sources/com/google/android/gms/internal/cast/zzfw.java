package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zzfw extends zzfl {
    final transient Object zza;

    public zzfw(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.cast.zzfd, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.cast.zzfl, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.cast.zzfl, com.google.android.gms.internal.cast.zzfd, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzfm(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.zza.toString() + "]";
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public final int zza(Object[] objArr, int i9) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.cast.zzfl, com.google.android.gms.internal.cast.zzfd
    public final zzfh zzd() {
        Object obj = this.zza;
        int i9 = zzfh.zzd;
        Object[] objArr = {obj};
        zzfn.zzb(objArr, 1);
        return zzfh.zzi(objArr, 1);
    }

    @Override // com.google.android.gms.internal.cast.zzfl, com.google.android.gms.internal.cast.zzfd
    /* JADX INFO: renamed from: zze */
    public final zzfx iterator() {
        return new zzfm(this.zza);
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public final boolean zzf() {
        throw null;
    }
}
