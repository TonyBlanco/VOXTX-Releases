package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class aef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f19331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19335e;

    public aef(int i9) {
        this.f19333c = i9;
        byte[] bArr = new byte[131];
        this.f19331a = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i9, int i10) {
        if (this.f19334d) {
            int i11 = i10 - i9;
            byte[] bArr2 = this.f19331a;
            int length = bArr2.length;
            int i12 = this.f19332b + i11;
            if (length < i12) {
                this.f19331a = Arrays.copyOf(bArr2, i12 + i12);
            }
            System.arraycopy(bArr, i9, this.f19331a, this.f19332b, i11);
            this.f19332b += i11;
        }
    }

    public final void b() {
        this.f19334d = false;
        this.f19335e = false;
    }

    public final void c(int i9) {
        af.w(!this.f19334d);
        boolean z9 = i9 == this.f19333c;
        this.f19334d = z9;
        if (z9) {
            this.f19332b = 3;
            this.f19335e = false;
        }
    }

    public final boolean d(int i9) {
        if (!this.f19334d) {
            return false;
        }
        this.f19332b -= i9;
        this.f19334d = false;
        this.f19335e = true;
        return true;
    }

    public final boolean e() {
        return this.f19335e;
    }
}
