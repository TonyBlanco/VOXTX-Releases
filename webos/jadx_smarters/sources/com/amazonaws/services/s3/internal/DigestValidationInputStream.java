package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.SdkDigestInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class DigestValidationInputStream extends SdkDigestInputStream {
    private boolean digestValidated;
    private byte[] expectedHash;

    public DigestValidationInputStream(InputStream inputStream, MessageDigest messageDigest, byte[] bArr) {
        super(inputStream, messageDigest);
        this.digestValidated = false;
        this.expectedHash = bArr;
    }

    private void validateMD5Digest() {
        if (this.expectedHash == null || this.digestValidated) {
            return;
        }
        this.digestValidated = true;
        if (!Arrays.equals(((DigestInputStream) this).digest.digest(), this.expectedHash)) {
            throw new AmazonClientException("Unable to verify integrity of data download.  Client calculated content hash didn't match hash calculated by Amazon S3.  The data may be corrupt.");
        }
    }

    public byte[] getMD5Checksum() {
        return ((DigestInputStream) this).digest.digest();
    }

    @Override // java.security.DigestInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i9 = super.read();
        if (i9 == -1) {
            validateMD5Digest();
        }
        return i9;
    }

    @Override // java.security.DigestInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i9, int i10) throws IOException {
        int i11 = super.read(bArr, i9, i10);
        if (i11 == -1) {
            validateMD5Digest();
        }
        return i11;
    }
}
