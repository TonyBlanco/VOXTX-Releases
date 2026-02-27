package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class zzjr extends zzjt {
    final /* synthetic */ zzka zza;
    private int zzb = 0;
    private final int zzc;

    public zzjr(zzka zzkaVar) {
        this.zza = zzkaVar;
        this.zzc = zzkaVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    public final byte zza() {
        int i9 = this.zzb;
        if (i9 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i9 + 1;
        return this.zza.zzb(i9);
    }
}
