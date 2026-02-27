package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class buv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22590b;

    public buv(Object obj) {
        this.f22590b = System.identityHashCode(obj);
        this.f22589a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof buv)) {
            return false;
        }
        buv buvVar = (buv) obj;
        return this.f22590b == buvVar.f22590b && this.f22589a == buvVar.f22589a;
    }

    public final int hashCode() {
        return this.f22590b;
    }
}
