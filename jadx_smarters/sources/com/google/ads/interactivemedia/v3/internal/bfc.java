package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class bfc extends azh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bfb f21175c;

    public /* synthetic */ bfc(int i9, int i10, bfb bfbVar) {
        super(null);
        this.f21173a = i9;
        this.f21174b = i10;
        this.f21175c = bfbVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bfc)) {
            return false;
        }
        bfc bfcVar = (bfc) obj;
        return bfcVar.f21173a == this.f21173a && bfcVar.h() == h() && bfcVar.f21175c == this.f21175c;
    }

    public final int g() {
        return this.f21173a;
    }

    public final int h() {
        bfb bfbVar = this.f21175c;
        if (bfbVar == bfb.f21171d) {
            return this.f21174b;
        }
        if (bfbVar == bfb.f21168a || bfbVar == bfb.f21169b || bfbVar == bfb.f21170c) {
            return this.f21174b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f21174b), this.f21175c});
    }

    public final bfb i() {
        return this.f21175c;
    }

    public final boolean j() {
        return this.f21175c != bfb.f21171d;
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.f21175c) + ", " + this.f21174b + "-byte tags, and " + this.f21173a + "-byte key)";
    }
}
