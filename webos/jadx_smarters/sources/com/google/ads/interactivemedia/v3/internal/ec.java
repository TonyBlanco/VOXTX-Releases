package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes3.dex */
public final class ec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f22763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f22764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f22766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f22767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f22771i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final eb f22772j;

    public ec() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f22771i = cryptoInfo;
        this.f22772j = cq.f22640a >= 24 ? new eb(cryptoInfo) : null;
    }

    public final MediaCodec.CryptoInfo a() {
        return this.f22771i;
    }

    public final void b(int i9) {
        if (i9 == 0) {
            return;
        }
        if (this.f22766d == null) {
            int[] iArr = new int[1];
            this.f22766d = iArr;
            this.f22771i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f22766d;
        iArr2[0] = iArr2[0] + i9;
    }

    public final void c(int i9, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        this.f22768f = i9;
        this.f22766d = iArr;
        this.f22767e = iArr2;
        this.f22764b = bArr;
        this.f22763a = bArr2;
        this.f22765c = i10;
        this.f22769g = i11;
        this.f22770h = i12;
        MediaCodec.CryptoInfo cryptoInfo = this.f22771i;
        cryptoInfo.numSubSamples = i9;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i10;
        if (cq.f22640a >= 24) {
            eb ebVar = this.f22772j;
            af.s(ebVar);
            eb.a(ebVar, i11, i12);
        }
    }
}
