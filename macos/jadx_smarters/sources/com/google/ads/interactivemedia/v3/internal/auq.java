package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
final class auq extends awy implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator f20767a;

    public auq(Comparator comparator) {
        atp.k(comparator);
        this.f20767a = comparator;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awy, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f20767a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof auq) {
            return this.f20767a.equals(((auq) obj).f20767a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20767a.hashCode();
    }

    public final String toString() {
        return this.f20767a.toString();
    }
}
