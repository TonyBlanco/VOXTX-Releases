package com.google.android.recaptcha.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzjh extends zzjf {
    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* synthetic */ int zza(Object obj) {
        return ((zzjg) obj).zza();
    }

    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* synthetic */ int zzb(Object obj) {
        return ((zzjg) obj).zzb();
    }

    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzgo zzgoVar = (zzgo) obj;
        zzjg zzjgVar = zzgoVar.zzc;
        if (zzjgVar != zzjg.zzc()) {
            return zzjgVar;
        }
        zzjg zzjgVarZzf = zzjg.zzf();
        zzgoVar.zzc = zzjgVarZzf;
        return zzjgVarZzf;
    }

    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* synthetic */ Object zzd(Object obj) {
        return ((zzgo) obj).zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (zzjg.zzc().equals(obj2)) {
            return obj;
        }
        zzjg zzjgVar = (zzjg) obj2;
        if (zzjg.zzc().equals(obj)) {
            return zzjg.zze((zzjg) obj, zzjgVar);
        }
        ((zzjg) obj).zzd(zzjgVar);
        return obj;
    }

    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* synthetic */ Object zzf() {
        return zzjg.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* synthetic */ Object zzg(Object obj) {
        ((zzjg) obj).zzh();
        return obj;
    }

    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i9, int i10) {
        ((zzjg) obj).zzj((i9 << 3) | 5, Integer.valueOf(i10));
    }

    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* bridge */ /* synthetic */ void zzi(Object obj, int i9, long j9) {
        ((zzjg) obj).zzj((i9 << 3) | 1, Long.valueOf(j9));
    }

    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* bridge */ /* synthetic */ void zzj(Object obj, int i9, Object obj2) {
        ((zzjg) obj).zzj((i9 << 3) | 3, obj2);
    }

    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* bridge */ /* synthetic */ void zzk(Object obj, int i9, zzez zzezVar) {
        ((zzjg) obj).zzj((i9 << 3) | 2, zzezVar);
    }

    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* bridge */ /* synthetic */ void zzl(Object obj, int i9, long j9) {
        ((zzjg) obj).zzj(i9 << 3, Long.valueOf(j9));
    }

    @Override // com.google.android.recaptcha.internal.zzjf
    public final void zzm(Object obj) {
        ((zzgo) obj).zzc.zzh();
    }

    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* synthetic */ void zzn(Object obj, Object obj2) {
        ((zzgo) obj).zzc = (zzjg) obj2;
    }

    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* synthetic */ void zzo(Object obj, Object obj2) {
        ((zzgo) obj).zzc = (zzjg) obj2;
    }

    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* synthetic */ void zzp(Object obj, zzjx zzjxVar) throws IOException {
        ((zzjg) obj).zzk(zzjxVar);
    }

    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* synthetic */ void zzq(Object obj, zzjx zzjxVar) throws IOException {
        ((zzjg) obj).zzl(zzjxVar);
    }

    @Override // com.google.android.recaptcha.internal.zzjf
    public final boolean zzs(zzik zzikVar) {
        return false;
    }
}
