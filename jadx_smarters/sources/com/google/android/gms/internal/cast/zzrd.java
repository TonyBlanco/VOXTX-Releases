package com.google.android.gms.internal.cast;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class zzrd extends zzrf {
    final /* synthetic */ zzrm zza;
    private int zzb = 0;
    private final int zzc;

    public zzrd(zzrm zzrmVar) {
        this.zza = zzrmVar;
        this.zzc = zzrmVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.cast.zzrh
    public final byte zza() {
        int i9 = this.zzb;
        if (i9 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i9 + 1;
        return this.zza.zzb(i9);
    }
}
