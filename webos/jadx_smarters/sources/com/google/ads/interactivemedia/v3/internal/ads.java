package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class ads {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f19168d = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f19171c = new byte[128];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19172e;

    public final void a(byte[] bArr, int i9, int i10) {
        if (this.f19172e) {
            int i11 = i10 - i9;
            byte[] bArr2 = this.f19171c;
            int length = bArr2.length;
            int i12 = this.f19169a + i11;
            if (length < i12) {
                this.f19171c = Arrays.copyOf(bArr2, i12 + i12);
            }
            System.arraycopy(bArr, i9, this.f19171c, this.f19169a, i11);
            this.f19169a += i11;
        }
    }

    public final void b() {
        this.f19172e = false;
        this.f19169a = 0;
        this.f19170b = 0;
    }

    public final boolean c(int i9, int i10) {
        if (this.f19172e) {
            int i11 = this.f19169a - i10;
            this.f19169a = i11;
            if (this.f19170b != 0 || i9 != 181) {
                this.f19172e = false;
                return true;
            }
            this.f19170b = i11;
        } else if (i9 == 179) {
            this.f19172e = true;
        }
        a(f19168d, 0, 3);
        return false;
    }
}
