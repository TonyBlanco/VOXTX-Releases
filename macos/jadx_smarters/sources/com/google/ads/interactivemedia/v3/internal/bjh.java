package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.a;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyAgreement;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
public final class bjh {
    public static final byte[] A(byte[] bArr, int i9, byte[] bArr2, int i10, int i11) {
        if (bArr.length - i11 < i9 || bArr2.length - i11 < i10) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr3[i12] = (byte) (bArr[i12 + i9] ^ bArr2[i12 + i10]);
        }
        return bArr3;
    }

    private static ECParameterSpec B(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 32);
        int i9 = 0;
        bArrCopyOf[0] = (byte) (bArrCopyOf[0] & 248);
        int i10 = bArrCopyOf[31] & 127;
        bArrCopyOf[31] = (byte) i10;
        bArrCopyOf[31] = (byte) (i10 | 64);
        int i11 = biq.f21515b;
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr2, 32);
        bArrCopyOf2[31] = (byte) (bArrCopyOf2[31] & 127);
        for (int i12 = 0; i12 < 7; i12++) {
            byte[][] bArr3 = biq.f21514a;
            if (x(bArr3[i12], bArrCopyOf2)) {
                throw new InvalidKeyException("Banned public key: ".concat(String.valueOf(g(bArr3[i12]))));
            }
        }
        long[] jArrK = biy.k(bArrCopyOf2);
        long[] jArr2 = new long[19];
        long[] jArr3 = new long[19];
        jArr3[0] = 1;
        long[] jArr4 = new long[19];
        jArr4[0] = 1;
        long[] jArr5 = new long[19];
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        jArr7[0] = 1;
        long[] jArr8 = new long[19];
        long[] jArr9 = new long[19];
        jArr9[0] = 1;
        System.arraycopy(jArrK, 0, jArr2, 0, 10);
        while (i9 < 32) {
            int i13 = bArrCopyOf[31 - i9] & 255;
            int i14 = 0;
            while (i14 < 8) {
                int i15 = (i13 >> (7 - i14)) & 1;
                biq.a(jArr4, jArr2, i15);
                biq.a(jArr5, jArr3, i15);
                byte[] bArr4 = bArrCopyOf;
                long[] jArrCopyOf = Arrays.copyOf(jArr4, 10);
                int i16 = i13;
                long[] jArr10 = new long[19];
                long[] jArr11 = jArr;
                long[] jArr12 = new long[19];
                int i17 = i9;
                long[] jArr13 = new long[19];
                int i18 = i14;
                long[] jArr14 = new long[19];
                long[] jArr15 = new long[19];
                long[] jArr16 = jArr9;
                long[] jArr17 = new long[19];
                long[] jArr18 = new long[19];
                biy.i(jArr4, jArr4, jArr5);
                biy.h(jArr5, jArrCopyOf, jArr5);
                long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
                biy.i(jArr2, jArr2, jArr3);
                biy.h(jArr3, jArrCopyOf2, jArr3);
                biy.b(jArr14, jArr2, jArr5);
                biy.b(jArr15, jArr4, jArr3);
                biy.e(jArr14);
                biy.d(jArr14);
                biy.e(jArr15);
                biy.d(jArr15);
                long[] jArr19 = jArr2;
                System.arraycopy(jArr14, 0, jArrCopyOf2, 0, 10);
                biy.i(jArr14, jArr14, jArr15);
                biy.h(jArr15, jArrCopyOf2, jArr15);
                biy.g(jArr18, jArr14);
                biy.g(jArr17, jArr15);
                biy.b(jArr15, jArr17, jArrK);
                biy.e(jArr15);
                biy.d(jArr15);
                System.arraycopy(jArr18, 0, jArr6, 0, 10);
                System.arraycopy(jArr15, 0, jArr7, 0, 10);
                biy.g(jArr12, jArr4);
                biy.g(jArr13, jArr5);
                biy.b(jArr8, jArr12, jArr13);
                biy.e(jArr8);
                biy.d(jArr8);
                biy.h(jArr13, jArr12, jArr13);
                Arrays.fill(jArr10, 10, 18, 0L);
                biy.f(jArr10, jArr13, 121665L);
                biy.d(jArr10);
                biy.i(jArr10, jArr10, jArr12);
                biy.b(jArr16, jArr13, jArr10);
                biy.e(jArr16);
                biy.d(jArr16);
                biq.a(jArr8, jArr6, i15);
                biq.a(jArr16, jArr7, i15);
                i14 = i18 + 1;
                jArr2 = jArr6;
                jArr9 = jArr5;
                i13 = i16;
                jArr = jArr11;
                i9 = i17;
                jArr6 = jArr19;
                jArr5 = jArr16;
                bArrCopyOf = bArr4;
                long[] jArr20 = jArr3;
                jArr3 = jArr7;
                jArr7 = jArr20;
                long[] jArr21 = jArr4;
                jArr4 = jArr8;
                jArr8 = jArr21;
            }
            i9++;
            bArrCopyOf = bArrCopyOf;
        }
        long[] jArr22 = jArr;
        long[] jArr23 = new long[10];
        long[] jArr24 = new long[10];
        long[] jArr25 = new long[10];
        long[] jArr26 = new long[10];
        long[] jArr27 = new long[10];
        long[] jArr28 = new long[10];
        long[] jArr29 = new long[10];
        long[] jArr30 = new long[10];
        long[] jArr31 = new long[10];
        long[] jArr32 = new long[10];
        long[] jArr33 = jArr2;
        long[] jArr34 = new long[10];
        biy.g(jArr24, jArr5);
        biy.g(jArr34, jArr24);
        biy.g(jArr32, jArr34);
        biy.a(jArr25, jArr32, jArr5);
        biy.a(jArr26, jArr25, jArr24);
        biy.g(jArr32, jArr26);
        biy.a(jArr27, jArr32, jArr25);
        biy.g(jArr32, jArr27);
        biy.g(jArr34, jArr32);
        biy.g(jArr32, jArr34);
        biy.g(jArr34, jArr32);
        biy.g(jArr32, jArr34);
        biy.a(jArr28, jArr32, jArr27);
        biy.g(jArr32, jArr28);
        biy.g(jArr34, jArr32);
        int i19 = 2;
        for (int i20 = 10; i19 < i20; i20 = 10) {
            biy.g(jArr32, jArr34);
            biy.g(jArr34, jArr32);
            i19 += 2;
        }
        biy.a(jArr29, jArr34, jArr28);
        biy.g(jArr32, jArr29);
        biy.g(jArr34, jArr32);
        for (int i21 = 2; i21 < 20; i21 += 2) {
            biy.g(jArr32, jArr34);
            biy.g(jArr34, jArr32);
        }
        biy.a(jArr32, jArr34, jArr29);
        biy.g(jArr34, jArr32);
        biy.g(jArr32, jArr34);
        int i22 = 2;
        for (int i23 = 10; i22 < i23; i23 = 10) {
            biy.g(jArr34, jArr32);
            biy.g(jArr32, jArr34);
            i22 += 2;
        }
        biy.a(jArr30, jArr32, jArr28);
        biy.g(jArr32, jArr30);
        biy.g(jArr34, jArr32);
        for (int i24 = 2; i24 < 50; i24 += 2) {
            biy.g(jArr32, jArr34);
            biy.g(jArr34, jArr32);
        }
        biy.a(jArr31, jArr34, jArr30);
        biy.g(jArr34, jArr31);
        biy.g(jArr32, jArr34);
        for (int i25 = 2; i25 < 100; i25 += 2) {
            biy.g(jArr34, jArr32);
            biy.g(jArr32, jArr34);
        }
        biy.a(jArr34, jArr32, jArr31);
        biy.g(jArr32, jArr34);
        biy.g(jArr34, jArr32);
        for (int i26 = 2; i26 < 50; i26 += 2) {
            biy.g(jArr32, jArr34);
            biy.g(jArr34, jArr32);
        }
        biy.a(jArr32, jArr34, jArr30);
        biy.g(jArr34, jArr32);
        biy.g(jArr32, jArr34);
        biy.g(jArr34, jArr32);
        biy.g(jArr32, jArr34);
        biy.g(jArr34, jArr32);
        biy.a(jArr23, jArr34, jArr26);
        biy.a(jArr22, jArr4, jArr23);
        long[] jArr35 = new long[10];
        long[] jArr36 = new long[10];
        long[] jArr37 = new long[11];
        long[] jArr38 = new long[11];
        long[] jArr39 = new long[11];
        biy.a(jArr35, jArrK, jArr22);
        biy.i(jArr36, jArrK, jArr22);
        long[] jArr40 = new long[10];
        jArr40[0] = 486662;
        biy.i(jArr38, jArr36, jArr40);
        biy.a(jArr38, jArr38, jArr3);
        biy.i(jArr38, jArr38, jArr33);
        biy.a(jArr38, jArr38, jArr35);
        biy.a(jArr38, jArr38, jArr33);
        biy.f(jArr37, jArr38, 4L);
        biy.d(jArr37);
        biy.a(jArr38, jArr35, jArr3);
        biy.h(jArr38, jArr38, jArr3);
        biy.a(jArr39, jArr36, jArr33);
        biy.i(jArr38, jArr38, jArr39);
        biy.g(jArr38, jArr38);
        if (x(biy.j(jArr37), biy.j(jArr38))) {
            return biy.j(jArr22);
        }
        throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(String.valueOf(g(bArr2))));
    }

    public static byte[] b() {
        byte[] bArrB = bjf.b(32);
        bArrB[0] = (byte) (bArrB[0] | 7);
        int i9 = bArrB[31] & Utf8.REPLACEMENT_BYTE;
        bArrB[31] = (byte) i9;
        bArrB[31] = (byte) (i9 | 128);
        return bArrB;
    }

    public static byte[] c(byte[] bArr) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return a(bArr, bArr2);
    }

    public static void d(boolean z9) {
        if (!z9) {
            throw new IllegalArgumentException();
        }
    }

    public static DateFormat e(int i9, int i10) {
        return new SimpleDateFormat("MMM d, yyyy h:mm:ss a", Locale.US);
    }

    public static boolean f() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }

    public static String g(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b9 : bArr) {
            sb.append("0123456789abcdef".charAt((b9 & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b9 & 15));
        }
        return sb.toString();
    }

    public static int h(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return (i(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static BigInteger i(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    public static BigInteger j(BigInteger bigInteger, boolean z9, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigIntegerI = i(ellipticCurve);
        BigInteger bigIntegerMod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(bigIntegerI);
        if (bigIntegerI.signum() != 1) {
            throw new InvalidAlgorithmParameterException("p must be positive");
        }
        BigInteger bigIntegerMod2 = bigIntegerMod.mod(bigIntegerI);
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        if (!bigIntegerMod2.equals(bigIntegerAdd)) {
            if (bigIntegerI.testBit(0) && bigIntegerI.testBit(1)) {
                bigIntegerAdd = bigIntegerMod2.modPow(bigIntegerI.add(BigInteger.ONE).shiftRight(2), bigIntegerI);
            } else if (bigIntegerI.testBit(0) && !bigIntegerI.testBit(1)) {
                bigIntegerAdd = BigInteger.ONE;
                BigInteger bigIntegerShiftRight = bigIntegerI.subtract(bigIntegerAdd).shiftRight(1);
                int i9 = 0;
                while (true) {
                    BigInteger bigIntegerMod3 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod2).mod(bigIntegerI);
                    if (bigIntegerMod3.equals(BigInteger.ZERO)) {
                        break;
                    }
                    BigInteger bigIntegerModPow = bigIntegerMod3.modPow(bigIntegerShiftRight, bigIntegerI);
                    BigInteger bigIntegerMod4 = BigInteger.ONE;
                    if (bigIntegerModPow.add(bigIntegerMod4).equals(bigIntegerI)) {
                        BigInteger bigIntegerShiftRight2 = bigIntegerI.add(bigIntegerMod4).shiftRight(1);
                        BigInteger bigIntegerMod5 = bigIntegerAdd;
                        for (int iBitLength = bigIntegerShiftRight2.bitLength() - 2; iBitLength >= 0; iBitLength--) {
                            BigInteger bigIntegerMultiply = bigIntegerMod5.multiply(bigIntegerMod4);
                            bigIntegerMod5 = bigIntegerMod5.multiply(bigIntegerMod5).add(bigIntegerMod4.multiply(bigIntegerMod4).mod(bigIntegerI).multiply(bigIntegerMod3)).mod(bigIntegerI);
                            BigInteger bigIntegerMod6 = bigIntegerMultiply.add(bigIntegerMultiply).mod(bigIntegerI);
                            if (bigIntegerShiftRight2.testBit(iBitLength)) {
                                BigInteger bigIntegerMod7 = bigIntegerMod5.multiply(bigIntegerAdd).add(bigIntegerMod6.multiply(bigIntegerMod3)).mod(bigIntegerI);
                                bigIntegerMod4 = bigIntegerAdd.multiply(bigIntegerMod6).add(bigIntegerMod5).mod(bigIntegerI);
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
                        if (i9 == 128 && !bigIntegerI.isProbablePrime(80)) {
                            throw new InvalidAlgorithmParameterException("p is not prime");
                        }
                    }
                }
            } else {
                bigIntegerAdd = null;
            }
            if (bigIntegerAdd != null && bigIntegerAdd.multiply(bigIntegerAdd).mod(bigIntegerI).compareTo(bigIntegerMod2) != 0) {
                throw new GeneralSecurityException("Could not find a modular square root");
            }
        }
        return z9 != bigIntegerAdd.testBit(0) ? bigIntegerI.subtract(bigIntegerAdd).mod(bigIntegerI) : bigIntegerAdd;
    }

    public static KeyPair k(ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) biv.f21527d.a("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static void l(ECPoint eCPoint, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigIntegerI = i(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        }
        if (affineX.signum() == -1 || affineX.compareTo(bigIntegerI) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        }
        if (affineY.signum() == -1 || affineY.compareTo(bigIntegerI) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        }
        if (!affineY.multiply(affineY).mod(bigIntegerI).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(bigIntegerI))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    public static void m(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        n(eCPublicKey, eCPrivateKey);
        l(eCPublicKey.getW(), eCPrivateKey.getParams().getCurve());
    }

    public static void n(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        try {
            ECParameterSpec params = eCPublicKey.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            if (params.getCurve().equals(params2.getCurve()) && params.getGenerator().equals(params2.getGenerator()) && params.getOrder().equals(params2.getOrder()) && params.getCofactor() == params2.getCofactor()) {
            } else {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException e9) {
            e = e9;
            throw new GeneralSecurityException(e);
        } catch (NullPointerException e10) {
            e = e10;
            throw new GeneralSecurityException(e);
        }
    }

    public static byte[] o(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) throws GeneralSecurityException {
        n(eCPublicKey, eCPrivateKey);
        ECPoint w9 = eCPublicKey.getW();
        l(w9, eCPrivateKey.getParams().getCurve());
        PublicKey publicKeyGeneratePublic = ((KeyFactory) biv.f21528e.a("EC")).generatePublic(new ECPublicKeySpec(w9, eCPrivateKey.getParams()));
        KeyAgreement keyAgreement = (KeyAgreement) biv.f21526c.a("ECDH");
        keyAgreement.init(eCPrivateKey);
        try {
            keyAgreement.doPhase(publicKeyGeneratePublic, true);
            byte[] bArrGenerateSecret = keyAgreement.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, bArrGenerateSecret);
            if (bigInteger.signum() == -1 || bigInteger.compareTo(i(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            j(bigInteger, true, curve);
            return bArrGenerateSecret;
        } catch (IllegalStateException e9) {
            throw new GeneralSecurityException(e9);
        }
    }

    public static KeyPair p(int i9) throws GeneralSecurityException {
        return k(t(i9));
    }

    public static ECPrivateKey q(int i9, byte[] bArr) throws GeneralSecurityException {
        return (ECPrivateKey) ((KeyFactory) biv.f21528e.a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), t(i9)));
    }

    public static ECPublicKey r(int i9, int i10, byte[] bArr) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpecT = t(i9);
        EllipticCurve curve = eCParameterSpecT.getCurve();
        int iH = h(curve);
        int length = bArr.length;
        if (length != iH + iH + 1) {
            throw new GeneralSecurityException("invalid point size");
        }
        if (bArr[0] != 4) {
            throw new GeneralSecurityException("invalid point format");
        }
        int i11 = iH + 1;
        ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i11)), new BigInteger(1, Arrays.copyOfRange(bArr, i11, length)));
        l(eCPoint, curve);
        return (ECPublicKey) ((KeyFactory) biv.f21528e.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpecT));
    }

    public static ECPublicKey s(int i9, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpecT = t(i9);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        l(eCPoint, eCParameterSpecT.getCurve());
        return (ECPublicKey) ((KeyFactory) biv.f21528e.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpecT));
    }

    public static ECParameterSpec t(int i9) throws NoSuchAlgorithmException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i10 = i9 - 1;
        if (i10 == 0) {
            str = "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296";
            str2 = "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5";
            str3 = "115792089210356248762697446949407573530086143415290314195533631308867097853951";
            str4 = "115792089210356248762697446949407573529996955224135760342422259061068512044369";
            str5 = "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b";
        } else if (i10 != 1) {
            str = "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66";
            str2 = "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650";
            str3 = "6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151";
            str4 = "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449";
            str5 = "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00";
        } else {
            str = "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7";
            str2 = "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f";
            str3 = "39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319";
            str4 = "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643";
            str5 = "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef";
        }
        return B(str3, str4, str5, str, str2);
    }

    public static byte[] u(int i9, int i10, ECPoint eCPoint) throws GeneralSecurityException {
        return v(t(i9).getCurve(), 1, eCPoint);
    }

    public static byte[] v(EllipticCurve ellipticCurve, int i9, ECPoint eCPoint) throws GeneralSecurityException {
        l(eCPoint, ellipticCurve);
        int iH = h(ellipticCurve);
        int i10 = i9 - 1;
        if (i10 == 0) {
            int i11 = iH + iH + 1;
            byte[] bArr = new byte[i11];
            byte[] byteArray = eCPoint.getAffineX().toByteArray();
            byte[] byteArray2 = eCPoint.getAffineY().toByteArray();
            int length = byteArray2.length;
            System.arraycopy(byteArray2, 0, bArr, i11 - length, length);
            int length2 = byteArray.length;
            System.arraycopy(byteArray, 0, bArr, (iH + 1) - length2, length2);
            bArr[0] = 4;
            return bArr;
        }
        if (i10 != 2) {
            int i12 = iH + 1;
            byte[] bArr2 = new byte[i12];
            byte[] byteArray3 = eCPoint.getAffineX().toByteArray();
            int length3 = byteArray3.length;
            System.arraycopy(byteArray3, 0, bArr2, i12 - length3, length3);
            bArr2[0] = true == eCPoint.getAffineY().testBit(0) ? (byte) 3 : (byte) 2;
            return bArr2;
        }
        int i13 = iH + iH;
        byte[] bArr3 = new byte[i13];
        byte[] byteArray4 = eCPoint.getAffineX().toByteArray();
        int length4 = byteArray4.length;
        if (length4 > iH) {
            byteArray4 = Arrays.copyOfRange(byteArray4, length4 - iH, length4);
        }
        byte[] byteArray5 = eCPoint.getAffineY().toByteArray();
        int length5 = byteArray5.length;
        if (length5 > iH) {
            byteArray5 = Arrays.copyOfRange(byteArray5, length5 - iH, length5);
        }
        int length6 = byteArray5.length;
        System.arraycopy(byteArray5, 0, bArr3, i13 - length6, length6);
        int length7 = byteArray4.length;
        System.arraycopy(byteArray4, 0, bArr3, iH - length7, length7);
        return bArr3;
    }

    public static final void w(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i9) {
        if (i9 < 0 || byteBuffer2.remaining() < i9 || byteBuffer3.remaining() < i9 || byteBuffer.remaining() < i9) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i10 = 0; i10 < i9; i10++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final boolean x(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null && bArr.length == bArr2.length) {
            int i9 = 0;
            for (int i10 = 0; i10 < bArr.length; i10++) {
                i9 |= bArr[i10] ^ bArr2[i10];
            }
            if (i9 == 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[] y(byte[]... bArr) throws GeneralSecurityException {
        int i9 = 0;
        for (byte[] bArr2 : bArr) {
            int length = bArr2.length;
            if (i9 > a.e.API_PRIORITY_OTHER - length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i9 += length;
        }
        byte[] bArr3 = new byte[i9];
        int i10 = 0;
        for (byte[] bArr4 : bArr) {
            int length2 = bArr4.length;
            System.arraycopy(bArr4, 0, bArr3, i10, length2);
            i10 += length2;
        }
        return bArr3;
    }

    public static final byte[] z(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return A(bArr, 0, bArr2, 0, length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }
}
