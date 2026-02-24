package com.google.android.gms.internal.play_billing;

import j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzao extends zzai {
    static final zzai zza = new zzao(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzao(Object[] objArr, int i9) {
        this.zzb = objArr;
        this.zzc = i9;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        zzaa.zza(i9, this.zzc, "index");
        Object obj = this.zzb[i9];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzai, com.google.android.gms.internal.play_billing.zzaf
    public final int zza(Object[] objArr, int i9) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf
    public final Object[] zzg() {
        return this.zzb;
    }
}
