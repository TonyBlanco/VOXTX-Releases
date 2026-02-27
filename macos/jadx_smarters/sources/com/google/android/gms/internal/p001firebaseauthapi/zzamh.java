package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zzamh implements Iterator<String> {
    private Iterator<String> zza;
    private final /* synthetic */ zzamf zzb;

    public zzamh(zzamf zzamfVar) {
        this.zzb = zzamfVar;
        this.zza = zzamfVar.zza.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
