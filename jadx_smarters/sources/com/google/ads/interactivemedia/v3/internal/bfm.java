package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class bfm extends azh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bfl f21205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bfk f21206d;

    public /* synthetic */ bfm(int i9, int i10, bfl bflVar, bfk bfkVar) {
        super(null);
        this.f21203a = i9;
        this.f21204b = i10;
        this.f21205c = bflVar;
        this.f21206d = bfkVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bfm)) {
            return false;
        }
        bfm bfmVar = (bfm) obj;
        return bfmVar.f21203a == this.f21203a && bfmVar.h() == h() && bfmVar.f21205c == this.f21205c && bfmVar.f21206d == this.f21206d;
    }

    public final int g() {
        return this.f21203a;
    }

    public final int h() {
        bfl bflVar = this.f21205c;
        if (bflVar == bfl.f21201d) {
            return this.f21204b;
        }
        if (bflVar == bfl.f21198a || bflVar == bfl.f21199b || bflVar == bfl.f21200c) {
            return this.f21204b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f21204b), this.f21205c, this.f21206d});
    }

    public final bfl i() {
        return this.f21205c;
    }

    public final boolean j() {
        return this.f21205c != bfl.f21201d;
    }

    public final String toString() {
        return "HMAC Parameters (variant: " + String.valueOf(this.f21205c) + ", hashType: " + String.valueOf(this.f21206d) + ", " + this.f21204b + "-byte tags, and " + this.f21203a + "-byte key)";
    }
}
