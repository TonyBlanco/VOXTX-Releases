package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes3.dex */
final class zzax<E> extends zzap<E> {
    static final zzap<Object> zza = new zzax(new Object[0], 0);
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzax(Object[] objArr, int i9) {
        this.zzb = objArr;
        this.zzc = i9;
    }

    @Override // java.util.List
    public final E get(int i9) {
        zzy.zza(i9, this.zzc);
        E e9 = (E) this.zzb[i9];
        e9.getClass();
        return e9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzak
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzap, com.google.android.gms.internal.p001firebaseauthapi.zzak
    public final int zza(Object[] objArr, int i9) {
        System.arraycopy(this.zzb, 0, objArr, i9, this.zzc);
        return i9 + this.zzc;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzak
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzak
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzak
    public final Object[] zzf() {
        return this.zzb;
    }
}
