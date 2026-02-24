package com.google.ads.interactivemedia.v3.internal;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class bkb extends bjy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final blj f21596a = new blj(null);

    public final Set a() {
        return this.f21596a.entrySet();
    }

    public final void b(String str, bjy bjyVar) {
        this.f21596a.put(str, bjyVar);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof bkb) && ((bkb) obj).f21596a.equals(this.f21596a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f21596a.hashCode();
    }
}
