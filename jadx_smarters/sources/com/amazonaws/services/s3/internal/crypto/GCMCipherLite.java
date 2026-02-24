package com.amazonaws.services.s3.internal.crypto;

import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
final class GCMCipherLite extends CipherLite {
    private static final int BITS = 8;
    private static final int TAG_LENGTH = ContentCryptoScheme.AES_GCM.getTagLengthInBits() / 8;
    private CipherLite aux;
    private long currentCount;
    private boolean doneFinal;
    private byte[] finalBytes;
    private boolean invisiblyProcessed;
    private long markedCount;
    private long outputByteCount;
    private boolean securityViolated;
    private final int tagLen;

    public GCMCipherLite(Cipher cipher, SecretKey secretKey, int i9) {
        super(cipher, ContentCryptoScheme.AES_GCM, secretKey, i9);
        this.tagLen = i9 == 1 ? TAG_LENGTH : 0;
        if (i9 != 1 && i9 != 2) {
            throw new IllegalArgumentException();
        }
    }

    private int checkMax(int i9) {
        if (this.outputByteCount + ((long) i9) <= 68719476704L) {
            return i9;
        }
        this.securityViolated = true;
        throw new SecurityException("Number of bytes processed has exceeded the maximum allowed by AES/GCM; [outputByteCount=" + this.outputByteCount + ", delta=" + i9 + "]");
    }

    private final byte[] doFinal0(byte[] bArr, int i9, int i10) throws BadPaddingException, IllegalBlockSizeException {
        if (!this.doneFinal) {
            this.doneFinal = true;
            byte[] bArrDoFinal = super.doFinal(bArr, i9, i10);
            this.finalBytes = bArrDoFinal;
            if (bArrDoFinal == null) {
                return null;
            }
            this.outputByteCount += (long) checkMax(bArrDoFinal.length - this.tagLen);
            return (byte[]) this.finalBytes.clone();
        }
        if (this.securityViolated) {
            throw new SecurityException();
        }
        if (2 == getCipherMode()) {
            byte[] bArr2 = this.finalBytes;
            if (bArr2 == null) {
                return null;
            }
            return (byte[]) bArr2.clone();
        }
        byte[] bArr3 = this.finalBytes;
        int length = bArr3.length;
        int i11 = this.tagLen;
        int i12 = length - i11;
        if (i10 == i12) {
            return (byte[]) bArr3.clone();
        }
        if (i10 >= i12 || ((long) i10) + this.currentCount != this.outputByteCount) {
            throw new IllegalStateException("Inconsistent re-rencryption");
        }
        return Arrays.copyOfRange(bArr3, (bArr3.length - i11) - i10, bArr3.length);
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    public byte[] doFinal() throws BadPaddingException, IllegalBlockSizeException {
        if (this.doneFinal) {
            if (this.securityViolated) {
                throw new SecurityException();
            }
            byte[] bArr = this.finalBytes;
            if (bArr == null) {
                return null;
            }
            return (byte[]) bArr.clone();
        }
        this.doneFinal = true;
        byte[] bArrDoFinal = super.doFinal();
        this.finalBytes = bArrDoFinal;
        if (bArrDoFinal == null) {
            return null;
        }
        this.outputByteCount += (long) checkMax(bArrDoFinal.length - this.tagLen);
        return (byte[]) this.finalBytes.clone();
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    public final byte[] doFinal(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException {
        return doFinal0(bArr, 0, bArr.length);
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    public final byte[] doFinal(byte[] bArr, int i9, int i10) throws BadPaddingException, IllegalBlockSizeException {
        return doFinal0(bArr, i9, i10);
    }

    public long getCurrentCount() {
        return this.currentCount;
    }

    public byte[] getFinalBytes() {
        byte[] bArr = this.finalBytes;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public long getMarkedCount() {
        return this.markedCount;
    }

    public long getOutputByteCount() {
        return this.outputByteCount;
    }

    public byte[] getTag() {
        byte[] bArr;
        if (getCipherMode() != 1 || (bArr = this.finalBytes) == null) {
            return null;
        }
        return Arrays.copyOfRange(bArr, bArr.length - this.tagLen, bArr.length);
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    public long mark() {
        long j9 = this.aux == null ? this.outputByteCount : this.currentCount;
        this.markedCount = j9;
        return j9;
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    public boolean markSupported() {
        return true;
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    public void reset() {
        long j9 = this.markedCount;
        if (j9 < this.outputByteCount || this.invisiblyProcessed) {
            try {
                this.aux = createAuxiliary(j9);
                this.currentCount = this.markedCount;
            } catch (Exception e9) {
                if (!(e9 instanceof RuntimeException)) {
                    throw new IllegalStateException(e9);
                }
            }
        }
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    public byte[] update(byte[] bArr, int i9, int i10) {
        byte[] bArrUpdate;
        CipherLite cipherLite = this.aux;
        z = false;
        boolean z9 = false;
        if (cipherLite == null) {
            bArrUpdate = super.update(bArr, i9, i10);
            if (bArrUpdate == null) {
                this.invisiblyProcessed = bArr.length > 0;
                return null;
            }
            this.outputByteCount += (long) checkMax(bArrUpdate.length);
            if (bArrUpdate.length == 0 && i10 > 0) {
                z9 = true;
            }
            this.invisiblyProcessed = z9;
        } else {
            bArrUpdate = cipherLite.update(bArr, i9, i10);
            if (bArrUpdate == null) {
                return null;
            }
            long length = this.currentCount + ((long) bArrUpdate.length);
            this.currentCount = length;
            long j9 = this.outputByteCount;
            if (length == j9) {
                this.aux = null;
            } else if (length > j9) {
                if (1 == getCipherMode()) {
                    throw new IllegalStateException("currentCount=" + this.currentCount + " > outputByteCount=" + this.outputByteCount);
                }
                byte[] bArr2 = this.finalBytes;
                int length2 = bArr2 != null ? bArr2.length : 0;
                long j10 = this.outputByteCount;
                long j11 = length2;
                long length3 = (j10 - (this.currentCount - ((long) bArrUpdate.length))) - j11;
                this.currentCount = j10 - j11;
                this.aux = null;
                return Arrays.copyOf(bArrUpdate, (int) length3);
            }
        }
        return bArrUpdate;
    }
}
