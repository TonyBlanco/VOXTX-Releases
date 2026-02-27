package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class bfx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bfx f21226a = new bfw().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f21227b;

    public final Map a() {
        return this.f21227b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bfx) {
            return this.f21227b.equals(((bfx) obj).f21227b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21227b.hashCode();
    }

    public final String toString() {
        return this.f21227b.toString();
    }
}
