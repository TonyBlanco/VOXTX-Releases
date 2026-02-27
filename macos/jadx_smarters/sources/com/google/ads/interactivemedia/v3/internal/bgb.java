package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class bgb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bac f21231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final azh f21233c;

    public /* synthetic */ bgb(bac bacVar, int i9, azh azhVar, byte[] bArr) {
        this.f21231a = bacVar;
        this.f21232b = i9;
        this.f21233c = azhVar;
    }

    public final int a() {
        return this.f21232b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bgb)) {
            return false;
        }
        bgb bgbVar = (bgb) obj;
        return this.f21231a == bgbVar.f21231a && this.f21232b == bgbVar.f21232b && this.f21233c.equals(bgbVar.f21233c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21231a, Integer.valueOf(this.f21232b), Integer.valueOf(this.f21233c.hashCode())});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, parameters='%s')", this.f21231a, Integer.valueOf(this.f21232b), this.f21233c);
    }
}
