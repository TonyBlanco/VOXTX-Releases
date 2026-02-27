package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes3.dex */
final class zzjk extends zzne<zztn, zztr> {
    private final /* synthetic */ zzji zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjk(zzji zzjiVar, Class cls) {
        super(cls);
        this.zza = zzjiVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzne
    public final /* synthetic */ zzakn zza(zzahp zzahpVar) throws zzaji {
        return zztn.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzne
    public final /* synthetic */ zzakn zza(zzakn zzaknVar) throws GeneralSecurityException {
        zztn zztnVar = (zztn) zzaknVar;
        ECParameterSpec eCParameterSpecZza = zzwp.zza(zzkx.zza(zztnVar.zzc().zzf().zzd()));
        KeyPairGenerator keyPairGeneratorZza = zzwt.zzd.zza("EC");
        keyPairGeneratorZza.initialize(eCParameterSpecZza);
        KeyPair keyPairGenerateKeyPair = keyPairGeneratorZza.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
        ECPoint w9 = eCPublicKey.getW();
        return (zztr) ((zzajc) zztr.zzb().zza(0).zza((zztu) ((zzajc) zztu.zzc().zza(0).zza(zztnVar.zzc()).zza(zzahp.zza(w9.getAffineX().toByteArray())).zzb(zzahp.zza(w9.getAffineY().toByteArray())).zzf())).zza(zzahp.zza(eCPrivateKey.getS().toByteArray())).zzf());
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzne
    public final /* synthetic */ void zzb(zzakn zzaknVar) throws GeneralSecurityException {
        zzkx.zza(((zztn) zzaknVar).zzc());
    }
}
