package com.amazonaws.services.s3.internal.crypto;

import com.amazonaws.AmazonClientException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
abstract class ContentCryptoScheme {
    private static final int BYTE_SIZE = 4;
    private static final int CBC_SHIFT_VALUE = 48;
    private static final int DEFAULT_BIT_COUNTER = 16;
    private static final int DEFAULT_RIGHTMOST_BIT_START = 12;
    private static final int GCM_SHIFT_VALUE = 32;
    private static final int LONG_BYTE_SIZE = 8;
    private static final long LONG_VALUE = 1;
    static final long MAX_CBC_BYTES = 4503599627370496L;
    static final long MAX_CTR_BYTES = -1;
    static final long MAX_GCM_BLOCKS = 4294967294L;
    static final long MAX_GCM_BYTES = 68719476704L;
    static final ContentCryptoScheme AES_CBC = new AesCbc();
    static final ContentCryptoScheme AES_GCM = new AesGcm();
    static final ContentCryptoScheme AES_CTR = new AesCtr();

    public static ContentCryptoScheme fromCEKAlgo(String str) {
        return fromCEKAlgo(str, false);
    }

    public static ContentCryptoScheme fromCEKAlgo(String str, boolean z9) {
        ContentCryptoScheme contentCryptoScheme = AES_GCM;
        if (contentCryptoScheme.getCipherAlgorithm().equals(str)) {
            return z9 ? AES_CTR : contentCryptoScheme;
        }
        if (str == null || AES_CBC.getCipherAlgorithm().equals(str)) {
            return AES_CBC;
        }
        throw new UnsupportedOperationException("Unsupported content encryption scheme: " + str);
    }

    public static byte[] incrementBlocks(byte[] bArr, long j9) {
        if (j9 == 0) {
            return bArr;
        }
        if (bArr == null || bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (j9 > MAX_GCM_BLOCKS) {
            throw new IllegalStateException();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        for (int i9 = 12; i9 <= 15; i9++) {
            byteBufferAllocate.put(i9 - 8, bArr[i9]);
        }
        long j10 = byteBufferAllocate.getLong() + j9;
        if (j10 > MAX_GCM_BLOCKS) {
            throw new IllegalStateException();
        }
        byteBufferAllocate.rewind();
        byte[] bArrArray = byteBufferAllocate.putLong(j10).array();
        for (int i10 = 12; i10 <= 15; i10++) {
            bArr[i10] = bArrArray[i10 - 8];
        }
        return bArr;
    }

    public byte[] adjustIV(byte[] bArr, long j9) {
        return bArr;
    }

    public CipherLite createAuxillaryCipher(SecretKey secretKey, byte[] bArr, int i9, Provider provider, long j9) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        return null;
    }

    public CipherLite createCipherLite(SecretKey secretKey, byte[] bArr, int i9) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        return createCipherLite(secretKey, bArr, i9, null);
    }

    public CipherLite createCipherLite(SecretKey secretKey, byte[] bArr, int i9, Provider provider) {
        String specificCipherProvider = getSpecificCipherProvider();
        try {
            Cipher cipher = provider != null ? Cipher.getInstance(getCipherAlgorithm(), provider) : specificCipherProvider != null ? Cipher.getInstance(getCipherAlgorithm(), specificCipherProvider) : Cipher.getInstance(getCipherAlgorithm());
            cipher.init(i9, secretKey, new IvParameterSpec(bArr));
            return newCipherLite(cipher, secretKey, i9);
        } catch (Exception e9) {
            if (e9 instanceof RuntimeException) {
                throw ((RuntimeException) e9);
            }
            throw new AmazonClientException("Unable to build cipher: " + e9.getMessage() + "\nMake sure you have the JCE unlimited strength policy files installed and configured for your JVM", e9);
        }
    }

    public abstract int getBlockSizeInBytes();

    public abstract String getCipherAlgorithm();

    public abstract int getIVLengthInBytes();

    public abstract String getKeyGeneratorAlgorithm();

    public abstract int getKeyLengthInBits();

    public final String getKeySpec() {
        return getKeyGeneratorAlgorithm() + "_" + getKeyLengthInBits();
    }

    public abstract long getMaxPlaintextSize();

    public String getSpecificCipherProvider() {
        return null;
    }

    public int getTagLengthInBits() {
        return 0;
    }

    public CipherLite newCipherLite(Cipher cipher, SecretKey secretKey, int i9) {
        return new CipherLite(cipher, this, secretKey, i9);
    }

    public String toString() {
        return "cipherAlgo=" + getCipherAlgorithm() + ", blockSizeInBytes=" + getBlockSizeInBytes() + ", ivLengthInBytes=" + getIVLengthInBytes() + ", keyGenAlgo=" + getKeyGeneratorAlgorithm() + ", keyLengthInBits=" + getKeyLengthInBits() + ", specificProvider=" + getSpecificCipherProvider() + ", tagLengthInBits=" + getTagLengthInBits();
    }
}
