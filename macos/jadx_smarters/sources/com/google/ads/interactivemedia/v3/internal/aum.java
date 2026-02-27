package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
abstract class aum implements awq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Set f20760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Collection f20761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Map f20762c;

    public abstract Collection e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awq) {
            return w().equals(((awq) obj).w());
        }
        return false;
    }

    public Iterator f() {
        throw null;
    }

    public final int hashCode() {
        return w().hashCode();
    }

    public abstract Map j();

    public abstract Set l();

    public final String toString() {
        return w().toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awq
    public void u(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awq
    public final Collection v() {
        Collection collection = this.f20761b;
        if (collection != null) {
            return collection;
        }
        Collection collectionE = e();
        this.f20761b = collectionE;
        return collectionE;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awq
    public final Map w() {
        Map map = this.f20762c;
        if (map != null) {
            return map;
        }
        Map mapJ = j();
        this.f20762c = mapJ;
        return mapJ;
    }

    public final Set x() {
        Set set = this.f20760a;
        if (set != null) {
            return set;
        }
        Set setL = l();
        this.f20760a = setL;
        return setL;
    }
}
