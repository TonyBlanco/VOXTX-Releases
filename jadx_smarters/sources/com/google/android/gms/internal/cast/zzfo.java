package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
final class zzfo extends zzfh {
    static final zzfh zza = new zzfo(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzfo(Object[] objArr, int i9) {
        this.zzb = objArr;
        this.zzc = i9;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        zzeu.zza(i9, this.zzc, "index");
        Object obj = this.zzb[i9];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.cast.zzfh, com.google.android.gms.internal.cast.zzfd
    public final int zza(Object[] objArr, int i9) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public final Object[] zzg() {
        return this.zzb;
    }
}
