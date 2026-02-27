package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes3.dex */
final class zzar<E> extends zzaj<E> {
    private final zzap<E> zza;

    public zzar(zzap<E> zzapVar, int i9) {
        super(zzapVar.size(), i9);
        this.zza = zzapVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaj
    public final E zza(int i9) {
        return this.zza.get(i9);
    }
}
