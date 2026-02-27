package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zzfu extends zzfl {
    static final zzfu zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzfu(objArr, 0, objArr, 0, 0);
    }

    public zzfu(Object[] objArr, int i9, Object[] objArr2, int i10, int i11) {
        this.zzb = objArr;
        this.zze = i9;
        this.zzc = objArr2;
        this.zzf = i10;
        this.zzg = i11;
    }

    @Override // com.google.android.gms.internal.cast.zzfd, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Object[] objArr = this.zzc;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iZza = zzfa.zza(obj.hashCode());
        while (true) {
            int i9 = iZza & this.zzf;
            Object obj2 = objArr[i9];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iZza = i9 + 1;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzfl, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.cast.zzfl, com.google.android.gms.internal.cast.zzfd, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public final int zza(Object[] objArr, int i9) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzg);
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public final int zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public final int zzc() {
        return 0;
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

    @Override // com.google.android.gms.internal.cast.zzfd
    public final Object[] zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.cast.zzfl
    public final zzfh zzi() {
        return zzfh.zzi(this.zzb, this.zzg);
    }

    @Override // com.google.android.gms.internal.cast.zzfl
    public final boolean zzl() {
        return true;
    }
}
