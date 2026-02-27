package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzaj<E> extends zzbf<E> {
    private final int zza;
    private int zzb;

    public zzaj(int i9, int i10) {
        zzy.zzb(i10, i9);
        this.zza = i9;
        this.zzb = i10;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.zzb < this.zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i9 = this.zzb;
        this.zzb = i9 + 1;
        return zza(i9);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzb;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i9 = this.zzb - 1;
        this.zzb = i9;
        return zza(i9);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzb - 1;
    }

    public abstract E zza(int i9);
}
