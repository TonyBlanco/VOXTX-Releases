package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
final class zzqk extends zzoh<zzce, zzuc> {
    public zzqk(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzoh
    public final /* synthetic */ zzce zza(zzakn zzaknVar) throws GeneralSecurityException {
        zzuc zzucVar = (zzuc) zzaknVar;
        zzub zzubVarZzb = zzucVar.zze().zzb();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzucVar.zzf().zzg(), "HMAC");
        int iZza = zzucVar.zze().zza();
        int i9 = zzqm.zza[zzubVarZzb.ordinal()];
        if (i9 == 1) {
            return new zzxm(new zzxk("HMACSHA1", secretKeySpec), iZza);
        }
        if (i9 == 2) {
            return new zzxm(new zzxk("HMACSHA224", secretKeySpec), iZza);
        }
        if (i9 == 3) {
            return new zzxm(new zzxk("HMACSHA256", secretKeySpec), iZza);
        }
        if (i9 == 4) {
            return new zzxm(new zzxk("HMACSHA384", secretKeySpec), iZza);
        }
        if (i9 == 5) {
            return new zzxm(new zzxk("HMACSHA512", secretKeySpec), iZza);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
