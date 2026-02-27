package com.google.android.gms.internal.p001firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* JADX INFO: loaded from: classes3.dex */
public final class zzwp {
    public static int zza(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return (zzmg.zza(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    private static BigInteger zza(BigInteger bigInteger, boolean z9, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigIntegerZza = zzmg.zza(ellipticCurve);
        BigInteger bigIntegerMod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(bigIntegerZza);
        if (bigIntegerZza.signum() != 1) {
            throw new InvalidAlgorithmParameterException("p must be positive");
        }
        BigInteger bigIntegerMod2 = bigIntegerMod.mod(bigIntegerZza);
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        if (!bigIntegerMod2.equals(bigIntegerAdd)) {
            if (bigIntegerZza.testBit(0) && bigIntegerZza.testBit(1)) {
                bigIntegerAdd = bigIntegerMod2.modPow(bigIntegerZza.add(BigInteger.ONE).shiftRight(2), bigIntegerZza);
            } else if (!bigIntegerZza.testBit(0) || bigIntegerZza.testBit(1)) {
                bigIntegerAdd = null;
            } else {
                bigIntegerAdd = BigInteger.ONE;
                BigInteger bigIntegerShiftRight = bigIntegerZza.subtract(bigIntegerAdd).shiftRight(1);
                int i9 = 0;
                while (true) {
                    BigInteger bigIntegerMod3 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod2).mod(bigIntegerZza);
                    if (bigIntegerMod3.equals(BigInteger.ZERO)) {
                        break;
                    }
                    BigInteger bigIntegerModPow = bigIntegerMod3.modPow(bigIntegerShiftRight, bigIntegerZza);
                    BigInteger bigIntegerMod4 = BigInteger.ONE;
                    if (bigIntegerModPow.add(bigIntegerMod4).equals(bigIntegerZza)) {
                        BigInteger bigIntegerShiftRight2 = bigIntegerZza.add(bigIntegerMod4).shiftRight(1);
                        BigInteger bigIntegerMod5 = bigIntegerAdd;
                        for (int iBitLength = bigIntegerShiftRight2.bitLength() - 2; iBitLength >= 0; iBitLength--) {
                            BigInteger bigIntegerMultiply = bigIntegerMod5.multiply(bigIntegerMod4);
                            bigIntegerMod5 = bigIntegerMod5.multiply(bigIntegerMod5).add(bigIntegerMod4.multiply(bigIntegerMod4).mod(bigIntegerZza).multiply(bigIntegerMod3)).mod(bigIntegerZza);
                            BigInteger bigIntegerMod6 = bigIntegerMultiply.add(bigIntegerMultiply).mod(bigIntegerZza);
                            if (bigIntegerShiftRight2.testBit(iBitLength)) {
                                BigInteger bigIntegerMod7 = bigIntegerMod5.multiply(bigIntegerAdd).add(bigIntegerMod6.multiply(bigIntegerMod3)).mod(bigIntegerZza);
                                bigIntegerMod4 = bigIntegerAdd.multiply(bigIntegerMod6).add(bigIntegerMod5).mod(bigIntegerZza);
                                bigIntegerMod5 = bigIntegerMod7;
                            } else {
                                bigIntegerMod4 = bigIntegerMod6;
                            }
                        }
                        bigIntegerAdd = bigIntegerMod5;
                    } else {
                        if (!bigIntegerModPow.equals(bigIntegerMod4)) {
                            throw new InvalidAlgorithmParameterException("p is not prime");
                        }
                        bigIntegerAdd = bigIntegerAdd.add(bigIntegerMod4);
                        i9++;
                        if (i9 == 128 && !bigIntegerZza.isProbablePrime(80)) {
                            throw new InvalidAlgorithmParameterException("p is not prime");
                        }
                    }
                }
            }
            if (bigIntegerAdd != null && bigIntegerAdd.multiply(bigIntegerAdd).mod(bigIntegerZza).compareTo(bigIntegerMod2) != 0) {
                throw new GeneralSecurityException("Could not find a modular square root");
            }
        }
        return z9 != bigIntegerAdd.testBit(0) ? bigIntegerZza.subtract(bigIntegerAdd).mod(bigIntegerZza) : bigIntegerAdd;
    }

    public static ECPrivateKey zza(zzwo zzwoVar, byte[] bArr) throws GeneralSecurityException {
        return (ECPrivateKey) zzwt.zze.zza("EC").generatePrivate(new ECPrivateKeySpec(zzme.zza(bArr), zza(zzwoVar)));
    }

    public static ECPublicKey zza(zzwo zzwoVar, zzwr zzwrVar, byte[] bArr) throws GeneralSecurityException {
        return zza(zza(zzwoVar), zzwrVar, bArr);
    }

    public static ECPublicKey zza(ECParameterSpec eCParameterSpec, zzwr zzwrVar, byte[] bArr) throws GeneralSecurityException {
        return (ECPublicKey) zzwt.zze.zza("EC").generatePublic(new ECPublicKeySpec(zza(eCParameterSpec.getCurve(), zzwrVar, bArr), eCParameterSpec));
    }

    public static ECParameterSpec zza(zzwo zzwoVar) throws NoSuchAlgorithmException {
        int iOrdinal = zzwoVar.ordinal();
        if (iOrdinal == 0) {
            return zzmg.zza;
        }
        if (iOrdinal == 1) {
            return zzmg.zzb;
        }
        if (iOrdinal == 2) {
            return zzmg.zzc;
        }
        throw new NoSuchAlgorithmException("curve not implemented:" + String.valueOf(zzwoVar));
    }

    public static ECPoint zza(EllipticCurve ellipticCurve, zzwr zzwrVar, byte[] bArr) throws GeneralSecurityException {
        ECPoint eCPoint;
        int iZza = zza(ellipticCurve);
        int iOrdinal = zzwrVar.ordinal();
        boolean z9 = false;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                BigInteger bigIntegerZza = zzmg.zza(ellipticCurve);
                if (bArr.length != iZza + 1) {
                    throw new GeneralSecurityException("compressed point has wrong length");
                }
                byte b9 = bArr[0];
                if (b9 != 2) {
                    if (b9 != 3) {
                        throw new GeneralSecurityException("invalid format");
                    }
                    z9 = true;
                }
                BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, bArr.length));
                if (bigInteger.signum() == -1 || bigInteger.compareTo(bigIntegerZza) >= 0) {
                    throw new GeneralSecurityException("x is out of range");
                }
                return new ECPoint(bigInteger, zza(bigInteger, z9, ellipticCurve));
            }
            if (iOrdinal != 2) {
                throw new GeneralSecurityException("invalid format:" + String.valueOf(zzwrVar));
            }
            if (bArr.length != iZza * 2) {
                throw new GeneralSecurityException("invalid point size");
            }
            eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, iZza)), new BigInteger(1, Arrays.copyOfRange(bArr, iZza, bArr.length)));
        } else {
            if (bArr.length != (iZza * 2) + 1) {
                throw new GeneralSecurityException("invalid point size");
            }
            if (bArr[0] != 4) {
                throw new GeneralSecurityException("invalid point format");
            }
            int i9 = iZza + 1;
            eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i9)), new BigInteger(1, Arrays.copyOfRange(bArr, i9, bArr.length)));
        }
        zzmg.zza(eCPoint, ellipticCurve);
        return eCPoint;
    }

    public static void zza(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        zzb(eCPublicKey, eCPrivateKey);
        zzmg.zza(eCPublicKey.getW(), eCPrivateKey.getParams().getCurve());
    }

    public static byte[] zza(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) throws GeneralSecurityException {
        zzb(eCPublicKey, eCPrivateKey);
        return zza(eCPrivateKey, eCPublicKey.getW());
    }

    private static byte[] zza(ECPrivateKey eCPrivateKey, ECPoint eCPoint) throws GeneralSecurityException {
        zzmg.zza(eCPoint, eCPrivateKey.getParams().getCurve());
        PublicKey publicKeyGeneratePublic = zzwt.zze.zza("EC").generatePublic(new ECPublicKeySpec(eCPoint, eCPrivateKey.getParams()));
        KeyAgreement keyAgreementZza = zzwt.zzc.zza("ECDH");
        keyAgreementZza.init(eCPrivateKey);
        try {
            keyAgreementZza.doPhase(publicKeyGeneratePublic, true);
            byte[] bArrGenerateSecret = keyAgreementZza.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, bArrGenerateSecret);
            if (bigInteger.signum() == -1 || bigInteger.compareTo(zzmg.zza(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            zza(bigInteger, true, curve);
            return bArrGenerateSecret;
        } catch (IllegalStateException e9) {
            throw new GeneralSecurityException(e9);
        }
    }

    private static void zzb(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        try {
            if (zzmg.zza(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
            } else {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e9) {
            throw new GeneralSecurityException(e9);
        }
    }
}
