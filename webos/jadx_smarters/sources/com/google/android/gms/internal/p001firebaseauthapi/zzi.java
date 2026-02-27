package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzi<T> implements Iterator<T> {
    private int zza = zzh.zzb;
    private T zzb;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i9 = this.zza;
        int i10 = zzh.zzd;
        if (i9 == i10) {
            throw new IllegalStateException();
        }
        int i11 = i9 - 1;
        if (i11 == 0) {
            return true;
        }
        if (i11 != 2) {
            this.zza = i10;
            this.zzb = zza();
            if (this.zza != zzh.zzc) {
                this.zza = zzh.zza;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.zza = zzh.zzb;
        T t9 = this.zzb;
        this.zzb = null;
        return t9;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public abstract T zza();

    public final T zzb() {
        this.zza = zzh.zzc;
        return null;
    }
}
