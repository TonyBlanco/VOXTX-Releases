package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
abstract class awp extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Set f20853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Set f20854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Collection f20855c;

    public abstract Set b();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f20853a;
        if (set != null) {
            return set;
        }
        Set setB = b();
        this.f20853a = setB;
        return setB;
    }

    public Set g() {
        return new awn(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f20854b;
        if (set != null) {
            return set;
        }
        Set setG = g();
        this.f20854b = setG;
        return setG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f20855c;
        if (collection != null) {
            return collection;
        }
        awo awoVar = new awo(this);
        this.f20855c = awoVar;
        return awoVar;
    }
}
