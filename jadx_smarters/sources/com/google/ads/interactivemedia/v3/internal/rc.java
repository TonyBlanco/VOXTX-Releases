package com.google.ads.interactivemedia.v3.internal;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24353a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24354b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24355c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f24356d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f24357e;

    public rc() {
        this.f24357e = r0.length - 1;
    }

    public final int a() {
        int i9 = this.f24355c;
        if (i9 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f24356d;
        int i10 = this.f24353a;
        int i11 = iArr[i10];
        this.f24353a = (i10 + 1) & this.f24357e;
        this.f24355c = i9 - 1;
        return i11;
    }

    public final void b(int i9) {
        int i10 = this.f24355c;
        int[] iArr = this.f24356d;
        int length = iArr.length;
        if (i10 == length) {
            int i11 = length + length;
            if (i11 < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[i11];
            int i12 = this.f24353a;
            int i13 = length - i12;
            System.arraycopy(iArr, i12, iArr2, 0, i13);
            System.arraycopy(this.f24356d, 0, iArr2, i13, i12);
            this.f24353a = 0;
            this.f24354b = this.f24355c - 1;
            this.f24356d = iArr2;
            this.f24357e = iArr2.length - 1;
            iArr = iArr2;
        }
        int i14 = (this.f24354b + 1) & this.f24357e;
        this.f24354b = i14;
        iArr[i14] = i9;
        this.f24355c++;
    }

    public final void c() {
        this.f24353a = 0;
        this.f24354b = -1;
        this.f24355c = 0;
    }

    public final boolean d() {
        return this.f24355c == 0;
    }
}
