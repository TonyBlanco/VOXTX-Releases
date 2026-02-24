package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class bol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f21851a = new byte[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21853c;

    public bol(byte[] bArr) {
        for (int i9 = 0; i9 < 256; i9++) {
            this.f21851a[i9] = (byte) i9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            byte[] bArr2 = this.f21851a;
            byte b9 = bArr2[i11];
            i10 = (i10 + b9 + bArr[i11 % bArr.length]) & 255;
            bArr2[i11] = bArr2[i10];
            bArr2[i10] = b9;
        }
        this.f21852b = 0;
        this.f21853c = 0;
    }

    public final void a(byte[] bArr) {
        int i9 = this.f21852b;
        int i10 = this.f21853c;
        for (int i11 = 0; i11 < 256; i11++) {
            i9 = (i9 + 1) & 255;
            byte[] bArr2 = this.f21851a;
            byte b9 = bArr2[i9];
            i10 = (i10 + b9) & 255;
            bArr2[i9] = bArr2[i10];
            bArr2[i10] = b9;
            bArr[i11] = (byte) (bArr2[(bArr2[i9] + b9) & 255] ^ bArr[i11]);
        }
        this.f21852b = i9;
        this.f21853c = i10;
    }
}
