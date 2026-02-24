package com.amazonaws.services.s3.internal.crypto;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.NullCipher;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class CipherLite {
    static final CipherLite NULL = new CipherLite() { // from class: com.amazonaws.services.s3.internal.crypto.CipherLite.1
        @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
        public CipherLite createAuxiliary(long j9) {
            return this;
        }

        @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
        public CipherLite createInverse() {
            return this;
        }
    };
    private final Cipher cipher;
    private final int cipherMode;
    private final ContentCryptoScheme scheme;
    private final SecretKey secreteKey;

    private CipherLite() {
        this.cipher = new NullCipher();
        this.scheme = null;
        this.secreteKey = null;
        this.cipherMode = -1;
    }

    public CipherLite(Cipher cipher, ContentCryptoScheme contentCryptoScheme, SecretKey secretKey, int i9) {
        this.cipher = cipher;
        this.scheme = contentCryptoScheme;
        this.secreteKey = secretKey;
        this.cipherMode = i9;
    }

    public CipherLite createAuxiliary(long j9) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        return this.scheme.createAuxillaryCipher(this.secreteKey, this.cipher.getIV(), this.cipherMode, this.cipher.getProvider(), j9);
    }

    public CipherLite createInverse() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        int i9 = this.cipherMode;
        int i10 = 1;
        if (i9 != 2) {
            if (i9 != 1) {
                throw new UnsupportedOperationException();
            }
            i10 = 2;
        }
        return this.scheme.createCipherLite(this.secreteKey, this.cipher.getIV(), i10, this.cipher.getProvider());
    }

    public CipherLite createUsingIV(byte[] bArr) {
        return this.scheme.createCipherLite(this.secreteKey, bArr, this.cipherMode, this.cipher.getProvider());
    }

    public byte[] doFinal() throws BadPaddingException, IllegalBlockSizeException {
        return this.cipher.doFinal();
    }

    public byte[] doFinal(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException {
        return this.cipher.doFinal(bArr);
    }

    public byte[] doFinal(byte[] bArr, int i9, int i10) throws BadPaddingException, IllegalBlockSizeException {
        return this.cipher.doFinal(bArr, i9, i10);
    }

    public final int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    public final Cipher getCipher() {
        return this.cipher;
    }

    public final String getCipherAlgorithm() {
        return this.cipher.getAlgorithm();
    }

    public final int getCipherMode() {
        return this.cipherMode;
    }

    public final Provider getCipherProvider() {
        return this.cipher.getProvider();
    }

    public final ContentCryptoScheme getContentCryptoScheme() {
        return this.scheme;
    }

    public final byte[] getIV() {
        return this.cipher.getIV();
    }

    public int getOutputSize(int i9) {
        return this.cipher.getOutputSize(i9);
    }

    public final String getSecretKeyAlgorithm() {
        return this.secreteKey.getAlgorithm();
    }

    public long mark() {
        return -1L;
    }

    public boolean markSupported() {
        return false;
    }

    public CipherLite recreate() {
        return this.scheme.createCipherLite(this.secreteKey, this.cipher.getIV(), this.cipherMode, this.cipher.getProvider());
    }

    public void reset() {
        throw new IllegalStateException("mark/reset not supported");
    }

    public byte[] update(byte[] bArr, int i9, int i10) {
        return this.cipher.update(bArr, i9, i10);
    }
}
