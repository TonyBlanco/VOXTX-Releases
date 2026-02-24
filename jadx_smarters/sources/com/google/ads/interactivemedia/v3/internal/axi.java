package com.google.ads.interactivemedia.v3.internal;

import j$.util.Objects;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
final class axi extends awy implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final awy f20887a;

    public axi(awy awyVar) {
        this.f20887a = awyVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awy
    public final awy a() {
        return this.f20887a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awy, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f20887a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof axi) {
            return this.f20887a.equals(((axi) obj).f20887a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f20887a.hashCode();
    }

    public final String toString() {
        awy awyVar = this.f20887a;
        Objects.toString(awyVar);
        return String.valueOf(awyVar).concat(".reverse()");
    }
}
