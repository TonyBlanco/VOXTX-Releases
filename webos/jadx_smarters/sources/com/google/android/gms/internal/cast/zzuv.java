package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zzuv implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzuw zzb;

    public zzuv(zzuw zzuwVar) {
        this.zzb = zzuwVar;
        this.zza = zzuwVar.zza.iterator();
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
