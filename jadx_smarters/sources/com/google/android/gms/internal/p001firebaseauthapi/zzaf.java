package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes3.dex */
final class zzaf extends zzae {
    private final /* synthetic */ zzp zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaf(zzac zzacVar, zzab zzabVar, CharSequence charSequence, zzp zzpVar) {
        super(zzabVar, charSequence);
        this.zzb = zzpVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzae
    public final int zza(int i9) {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzae
    public final int zzb(int i9) {
        if (this.zzb.zza(i9)) {
            return this.zzb.zzb();
        }
        return -1;
    }
}
