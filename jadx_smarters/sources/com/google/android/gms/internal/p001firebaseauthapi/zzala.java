package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class zzala<E> extends zzahj<E> implements RandomAccess {
    private static final zzala<Object> zza = new zzala<>(new Object[0], 0, false);
    private E[] zzb;
    private int zzc;

    public zzala() {
        this(new Object[10], 0, true);
    }

    private zzala(E[] eArr, int i9, boolean z9) {
        super(z9);
        this.zzb = eArr;
        this.zzc = i9;
    }

    private final String zzb(int i9) {
        return "Index:" + i9 + ", Size:" + this.zzc;
    }

    private final void zzc(int i9) {
        if (i9 < 0 || i9 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzb(i9));
        }
    }

    public static <E> zzala<E> zzd() {
        return (zzala<E>) zza;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractList, java.util.List
    public final void add(int i9, E e9) {
        int i10;
        zza();
        if (i9 < 0 || i9 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzb(i9));
        }
        E[] eArr = this.zzb;
        if (i10 < eArr.length) {
            System.arraycopy(eArr, i9, eArr, i9 + 1, i10 - i9);
        } else {
            E[] eArr2 = (E[]) new Object[((i10 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i9);
            System.arraycopy(this.zzb, i9, eArr2, i9 + 1, this.zzc - i9);
            this.zzb = eArr2;
        }
        this.zzb[i9] = e9;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e9) {
        zza();
        int i9 = this.zzc;
        E[] eArr = this.zzb;
        if (i9 == eArr.length) {
            this.zzb = (E[]) Arrays.copyOf(eArr, ((i9 * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        eArr2[i10] = e9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i9) {
        zzc(i9);
        return this.zzb[i9];
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractList, java.util.List
    public final E remove(int i9) {
        zza();
        zzc(i9);
        E[] eArr = this.zzb;
        E e9 = eArr[i9];
        if (i9 < this.zzc - 1) {
            System.arraycopy(eArr, i9 + 1, eArr, i9, (r2 - i9) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return e9;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractList, java.util.List
    public final E set(int i9, E e9) {
        zza();
        zzc(i9);
        E[] eArr = this.zzb;
        E e10 = eArr[i9];
        eArr[i9] = e9;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajj
    public final /* synthetic */ zzajj zza(int i9) {
        if (i9 >= this.zzc) {
            return new zzala(Arrays.copyOf(this.zzb, i9), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }
}
