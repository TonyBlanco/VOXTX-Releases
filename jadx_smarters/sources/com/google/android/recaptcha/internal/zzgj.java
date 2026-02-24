package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
public class zzgj extends zzgi implements zzhz {
    public zzgj(zzgk zzgkVar) {
        super(zzgkVar);
    }

    @Override // com.google.android.recaptcha.internal.zzgi, com.google.android.recaptcha.internal.zzhx
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzgk zzk() {
        zzgo zzgoVarZzk;
        if (((zzgk) this.zza).zzF()) {
            ((zzgk) this.zza).zzb.zzg();
            zzgoVarZzk = super.zzk();
        } else {
            zzgoVarZzk = this.zza;
        }
        return (zzgk) zzgoVarZzk;
    }

    @Override // com.google.android.recaptcha.internal.zzgi
    public final void zzn() {
        super.zzn();
        if (((zzgk) this.zza).zzb != zzge.zzd()) {
            zzgk zzgkVar = (zzgk) this.zza;
            zzgkVar.zzb = zzgkVar.zzb.clone();
        }
    }
}
