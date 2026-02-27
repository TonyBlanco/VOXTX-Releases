package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class zzem extends zzba implements RandomAccess {
    private static final zzem zza = new zzem(new Object[0], 0, false);
    private Object[] zzb;
    private int zzc;

    public zzem() {
        this(new Object[10], 0, true);
    }

    private zzem(Object[] objArr, int i9, boolean z9) {
        super(z9);
        this.zzb = objArr;
        this.zzc = i9;
    }

    public static zzem zze() {
        return zza;
    }

    private final String zzf(int i9) {
        return "Index:" + i9 + ", Size:" + this.zzc;
    }

    private final void zzg(int i9) {
        if (i9 < 0 || i9 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i9));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        int i10;
        zza();
        if (i9 < 0 || i9 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i9));
        }
        int i11 = i9 + 1;
        Object[] objArr = this.zzb;
        if (i10 < objArr.length) {
            System.arraycopy(objArr, i9, objArr, i11, i10 - i9);
        } else {
            Object[] objArr2 = new Object[((i10 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i9);
            System.arraycopy(this.zzb, i9, objArr2, i11, this.zzc - i9);
            this.zzb = objArr2;
        }
        this.zzb[i9] = obj;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i9 = this.zzc;
        Object[] objArr = this.zzb;
        if (i9 == objArr.length) {
            this.zzb = Arrays.copyOf(objArr, ((i9 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        zzg(i9);
        return this.zzb[i9];
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.List
    public final Object remove(int i9) {
        zza();
        zzg(i9);
        Object[] objArr = this.zzb;
        Object obj = objArr[i9];
        if (i9 < this.zzc - 1) {
            System.arraycopy(objArr, i9 + 1, objArr, i9, (r2 - i9) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        zza();
        zzg(i9);
        Object[] objArr = this.zzb;
        Object obj2 = objArr[i9];
        objArr[i9] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcz
    public final /* bridge */ /* synthetic */ zzcz zzd(int i9) {
        if (i9 >= this.zzc) {
            return new zzem(Arrays.copyOf(this.zzb, i9), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }
}
