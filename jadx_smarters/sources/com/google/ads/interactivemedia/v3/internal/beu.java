package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class beu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f21155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f21156b;

    public /* synthetic */ beu(Class cls, Class cls2) {
        this.f21155a = cls;
        this.f21156b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof beu)) {
            return false;
        }
        beu beuVar = (beu) obj;
        return beuVar.f21155a.equals(this.f21155a) && beuVar.f21156b.equals(this.f21156b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21155a, this.f21156b});
    }

    public final String toString() {
        return this.f21155a.getSimpleName() + " with serialization type: " + this.f21156b.getSimpleName();
    }
}
