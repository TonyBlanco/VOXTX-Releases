package com.google.android.recaptcha.internal;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class zzeq extends zzes {
    final /* synthetic */ zzez zza;
    private int zzb = 0;
    private final int zzc;

    public zzeq(zzez zzezVar) {
        this.zza = zzezVar;
        this.zzc = zzezVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzeu
    public final byte zza() {
        int i9 = this.zzb;
        if (i9 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i9 + 1;
        return this.zza.zzb(i9);
    }
}
