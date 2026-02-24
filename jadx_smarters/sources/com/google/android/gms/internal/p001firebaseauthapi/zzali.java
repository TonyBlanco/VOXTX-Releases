package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzali implements Iterator {
    private int zza;
    private Iterator zzb;
    private final /* synthetic */ zzalg zzc;

    private zzali(zzalg zzalgVar) {
        this.zzc = zzalgVar;
        this.zza = zzalgVar.zzb.size();
    }

    private final Iterator zza() {
        if (this.zzb == null) {
            this.zzb = this.zzc.zzf.entrySet().iterator();
        }
        return this.zzb;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i9 = this.zza;
        return (i9 > 0 && i9 <= this.zzc.zzb.size()) || zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Object next;
        if (zza().hasNext()) {
            next = zza().next();
        } else {
            List list = this.zzc.zzb;
            int i9 = this.zza - 1;
            this.zza = i9;
            next = list.get(i9);
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
