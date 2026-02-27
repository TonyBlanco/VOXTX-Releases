package com.google.android.gms.internal.cast;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zzuw extends AbstractList implements RandomAccess, zzsx {
    private final zzsx zza;

    public zzuw(zzsx zzsxVar) {
        this.zza = zzsxVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i9) {
        return ((zzsw) this.zza).get(i9);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzuv(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i9) {
        return new zzuu(this, i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.cast.zzsx
    public final zzsx zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.cast.zzsx
    public final Object zze(int i9) {
        return this.zza.zze(i9);
    }

    @Override // com.google.android.gms.internal.cast.zzsx
    public final List zzh() {
        return this.zza.zzh();
    }
}
