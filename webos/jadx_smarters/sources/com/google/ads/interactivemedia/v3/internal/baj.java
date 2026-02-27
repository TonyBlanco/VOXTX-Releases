package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class baj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f20995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f20996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bid f20997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final azu f20999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f21000f;

    public baj(Object obj, byte[] bArr, int i9, bid bidVar, int i10, azu azuVar) {
        this.f20995a = obj;
        this.f20996b = Arrays.copyOf(bArr, bArr.length);
        this.f21000f = i9;
        this.f20997c = bidVar;
        this.f20998d = i10;
        this.f20999e = azuVar;
    }

    public final int a() {
        return this.f20998d;
    }

    public final azu b() {
        return this.f20999e;
    }

    public final bid c() {
        return this.f20997c;
    }

    public final Object d() {
        return this.f20995a;
    }

    public final byte[] e() {
        byte[] bArr = this.f20996b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int f() {
        return this.f21000f;
    }

    public final azh g() {
        return this.f20999e.a();
    }
}
