package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes3.dex */
final class zzbq<E> extends zzbo<E> {
    private final zzbs<E> zza;

    public zzbq(zzbs<E> zzbsVar, int i9) {
        super(zzbsVar.size(), i9);
        this.zza = zzbsVar;
    }

    @Override // com.google.android.gms.internal.location.zzbo
    public final E zza(int i9) {
        return this.zza.get(i9);
    }
}
