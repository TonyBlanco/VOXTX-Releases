package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zzdt implements Iterator {
    boolean zza = true;
    final /* synthetic */ Iterator zzb;

    public zzdt(zzdu zzduVar, Iterator it) {
        this.zzb = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.zzb.next();
        this.zza = false;
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzdi.zze(!this.zza, "no calls to next() since the last call to remove()");
        this.zzb.remove();
    }
}
