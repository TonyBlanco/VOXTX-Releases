package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class auz extends AbstractMap implements Serializable, aun {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final avf f20779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Set f20780b;

    public auz(avf avfVar) {
        this.f20779a = avfVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f20779a.f20805p = this;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f20779a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f20779a.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f20779a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f20780b;
        if (set != null) {
            return set;
        }
        ava avaVar = new ava(this.f20779a);
        this.f20780b = avaVar;
        return avaVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        avf avfVar = this.f20779a;
        int iE = avfVar.e(obj);
        if (iE == -1) {
            return null;
        }
        return avfVar.f20790a[iE];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f20779a.values();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f20779a.q(obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        avf avfVar = this.f20779a;
        int iF = axo.F(obj);
        int iF2 = avfVar.f(obj, iF);
        if (iF2 == -1) {
            return null;
        }
        Object obj2 = avfVar.f20790a[iF2];
        avfVar.k(iF2, iF);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f20779a.f20792c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return this.f20779a.keySet();
    }
}
