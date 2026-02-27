package com.amazonaws.mobileconnectors.cognitoidentityprovider.util;

import com.amazonaws.util.StringUtils;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class Hkdf {
    private static final byte[] EMPTY_ARRAY = new byte[0];
    private static final int MAX_KEY_SIZE = 255;
    private final String algorithm;
    private SecretKey prk = null;

    private Hkdf(String str) {
        if (str.startsWith("Hmac")) {
            this.algorithm = str;
            return;
        }
        throw new IllegalArgumentException("Invalid algorithm " + str + ". Hkdf may only be used with Hmac algorithms.");
    }

    private void assertInitialized() {
        if (this.prk == null) {
            throw new IllegalStateException("Hkdf has not been initialized");
        }
    }

    private Mac createMac() {
        try {
            Mac mac = Mac.getInstance(this.algorithm);
            mac.init(this.prk);
            return mac;
        } catch (InvalidKeyException e9) {
            throw new RuntimeException(e9);
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static Hkdf getInstance(String str) throws NoSuchAlgorithmException {
        Mac.getInstance(str);
        return new Hkdf(str);
    }

    public void deriveKey(byte[] bArr, int i9, byte[] bArr2, int i10) throws ShortBufferException {
        assertInitialized();
        if (i9 < 0) {
            throw new IllegalArgumentException("Length must be a non-negative value.");
        }
        if (bArr2.length < i10 + i9) {
            throw new ShortBufferException();
        }
        Mac macCreateMac = createMac();
        if (i9 > macCreateMac.getMacLength() * MAX_KEY_SIZE) {
            throw new IllegalArgumentException("Requested keys may not be longer than 255 times the underlying HMAC length.");
        }
        byte[] bArrDoFinal = EMPTY_ARRAY;
        byte b9 = 1;
        int i11 = 0;
        while (i11 < i9) {
            try {
                macCreateMac.update(bArrDoFinal);
                macCreateMac.update(bArr);
                macCreateMac.update(b9);
                bArrDoFinal = macCreateMac.doFinal();
                int i12 = 0;
                while (i12 < bArrDoFinal.length && i11 < i9) {
                    bArr2[i11] = bArrDoFinal[i12];
                    i12++;
                    i11++;
                }
                b9 = (byte) (b9 + 1);
            } finally {
                Arrays.fill(bArrDoFinal, (byte) 0);
            }
        }
    }

    public byte[] deriveKey(String str, int i9) {
        return deriveKey(str != null ? str.getBytes(StringUtils.UTF8) : null, i9);
    }

    public byte[] deriveKey(byte[] bArr, int i9) {
        byte[] bArr2 = new byte[i9];
        try {
            deriveKey(bArr, i9, bArr2, 0);
            return bArr2;
        } catch (ShortBufferException e9) {
            throw new RuntimeException(e9);
        }
    }

    public void init(byte[] bArr) {
        init(bArr, null);
    }

    public void init(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr2 == null ? EMPTY_ARRAY : (byte[]) bArr2.clone();
        byte[] bArrDoFinal = EMPTY_ARRAY;
        try {
            try {
                Mac mac = Mac.getInstance(this.algorithm);
                if (bArr3.length == 0) {
                    bArr3 = new byte[mac.getMacLength()];
                    Arrays.fill(bArr3, (byte) 0);
                }
                mac.init(new SecretKeySpec(bArr3, this.algorithm));
                bArrDoFinal = mac.doFinal(bArr);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArrDoFinal, this.algorithm);
                Arrays.fill(bArrDoFinal, (byte) 0);
                unsafeInitWithoutKeyExtraction(secretKeySpec);
                Arrays.fill(bArrDoFinal, (byte) 0);
            } catch (GeneralSecurityException e9) {
                throw new RuntimeException("Unexpected exception", e9);
            }
        } catch (Throwable th) {
            Arrays.fill(bArrDoFinal, (byte) 0);
            throw th;
        }
    }

    public void unsafeInitWithoutKeyExtraction(SecretKey secretKey) throws InvalidKeyException {
        if (secretKey.getAlgorithm().equals(this.algorithm)) {
            this.prk = secretKey;
            return;
        }
        throw new InvalidKeyException("Algorithm for the provided key must match the algorithm for this Hkdf. Expected " + this.algorithm + " but found " + secretKey.getAlgorithm());
    }
}
