package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class bet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f21153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bjj f21154b;

    public /* synthetic */ bet(Class cls, bjj bjjVar) {
        this.f21153a = cls;
        this.f21154b = bjjVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bet)) {
            return false;
        }
        bet betVar = (bet) obj;
        return betVar.f21153a.equals(this.f21153a) && betVar.f21154b.equals(this.f21154b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21153a, this.f21154b});
    }

    public final String toString() {
        return this.f21153a.getSimpleName() + ", object identifier: " + String.valueOf(this.f21154b);
    }
}
