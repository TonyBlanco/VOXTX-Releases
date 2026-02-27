package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
final class zzlp extends zzne<zzuq, zzuu> {
    private final /* synthetic */ zzln zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlp(zzln zzlnVar, Class cls) {
        super(cls);
        this.zza = zzlnVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzne
    public final /* synthetic */ zzakn zza(zzahp zzahpVar) throws zzaji {
        return zzuq.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzne
    public final /* synthetic */ zzakn zza(zzakn zzaknVar) throws GeneralSecurityException {
        byte[] bArrZza;
        byte[] bArrZza2;
        zzuq zzuqVar = (zzuq) zzaknVar;
        zzuo zzuoVarZzc = zzuqVar.zzc().zzc();
        int i9 = zzlo.zza[zzuoVarZzc.ordinal()];
        if (i9 != 1) {
            if (i9 != 2 && i9 != 3 && i9 != 4) {
                throw new GeneralSecurityException("Invalid KEM");
            }
            zzwo zzwoVarZzc = zzlt.zzc(zzuqVar.zzc().zzc());
            ECParameterSpec eCParameterSpecZza = zzwp.zza(zzwoVarZzc);
            KeyPairGenerator keyPairGeneratorZza = zzwt.zzd.zza("EC");
            keyPairGeneratorZza.initialize(eCParameterSpecZza);
            KeyPair keyPairGenerateKeyPair = keyPairGeneratorZza.generateKeyPair();
            zzwr zzwrVar = zzwr.UNCOMPRESSED;
            ECPoint w9 = ((ECPublicKey) keyPairGenerateKeyPair.getPublic()).getW();
            EllipticCurve curve = zzwp.zza(zzwoVarZzc).getCurve();
            zzmg.zza(w9, curve);
            int iZza = zzwp.zza(curve);
            int iOrdinal = zzwrVar.ordinal();
            if (iOrdinal == 0) {
                int i10 = (iZza * 2) + 1;
                byte[] bArr = new byte[i10];
                byte[] bArrZza3 = zzme.zza(w9.getAffineX());
                byte[] bArrZza4 = zzme.zza(w9.getAffineY());
                System.arraycopy(bArrZza4, 0, bArr, i10 - bArrZza4.length, bArrZza4.length);
                System.arraycopy(bArrZza3, 0, bArr, (iZza + 1) - bArrZza3.length, bArrZza3.length);
                bArr[0] = 4;
                bArrZza2 = bArr;
            } else if (iOrdinal == 1) {
                int i11 = iZza + 1;
                bArrZza2 = new byte[i11];
                byte[] bArrZza5 = zzme.zza(w9.getAffineX());
                System.arraycopy(bArrZza5, 0, bArrZza2, i11 - bArrZza5.length, bArrZza5.length);
                bArrZza2[0] = (byte) (w9.getAffineY().testBit(0) ? 3 : 2);
            } else {
                if (iOrdinal != 2) {
                    throw new GeneralSecurityException("invalid format:" + String.valueOf(zzwrVar));
                }
                int i12 = iZza * 2;
                bArrZza2 = new byte[i12];
                byte[] bArrZza6 = zzme.zza(w9.getAffineX());
                if (bArrZza6.length > iZza) {
                    bArrZza6 = Arrays.copyOfRange(bArrZza6, bArrZza6.length - iZza, bArrZza6.length);
                }
                byte[] bArrZza7 = zzme.zza(w9.getAffineY());
                if (bArrZza7.length > iZza) {
                    bArrZza7 = Arrays.copyOfRange(bArrZza7, bArrZza7.length - iZza, bArrZza7.length);
                }
                System.arraycopy(bArrZza7, 0, bArrZza2, i12 - bArrZza7.length, bArrZza7.length);
                System.arraycopy(bArrZza6, 0, bArrZza2, iZza - bArrZza6.length, bArrZza6.length);
            }
            bArrZza = zzme.zza(((ECPrivateKey) keyPairGenerateKeyPair.getPrivate()).getS(), zzlt.zza(zzuoVarZzc));
        } else {
            bArrZza = zzou.zza(32);
            bArrZza[0] = (byte) (bArrZza[0] | 7);
            byte b9 = (byte) (bArrZza[31] & Utf8.REPLACEMENT_BYTE);
            bArrZza[31] = b9;
            bArrZza[31] = (byte) (b9 | 128);
            bArrZza2 = zzxr.zza(bArrZza);
        }
        return (zzuu) ((zzajc) zzuu.zzb().zza(0).zza((zzuv) ((zzajc) zzuv.zzc().zza(0).zza(zzuqVar.zzc()).zza(zzahp.zza(bArrZza2)).zzf())).zza(zzahp.zza(bArrZza)).zzf());
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzne
    public final /* synthetic */ void zzb(zzakn zzaknVar) throws GeneralSecurityException {
        zzlt.zza(((zzuq) zzaknVar).zzc());
    }
}
