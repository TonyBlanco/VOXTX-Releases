package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zzno implements Iterator {
    final Iterator zza;
    final /* synthetic */ zznp zzb;

    public zzno(zznp zznpVar) {
        this.zzb = zznpVar;
        this.zza = zznpVar.zza.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
