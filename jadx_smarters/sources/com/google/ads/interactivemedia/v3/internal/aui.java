package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
class aui extends aug implements List {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ auj f20756f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aui(auj aujVar, Object obj, List list, aug augVar) {
        super(aujVar, obj, list, augVar);
        this.f20756f = aujVar;
    }

    @Override // java.util.List
    public final void add(int i9, Object obj) {
        b();
        boolean zIsEmpty = this.f20751b.isEmpty();
        d().add(i9, obj);
        auj.q(this.f20756f);
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i9, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = d().addAll(i9, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        auj.s(this.f20756f, this.f20751b.size() - size);
        if (size != 0) {
            return zAddAll;
        }
        a();
        return true;
    }

    public final List d() {
        return (List) this.f20751b;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        b();
        return d().get(i9);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return d().indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return d().lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new auh(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i9) {
        b();
        return new auh(this, i9);
    }

    @Override // java.util.List
    public final Object remove(int i9) {
        b();
        Object objRemove = d().remove(i9);
        auj.r(this.f20756f);
        c();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i9, Object obj) {
        b();
        return d().set(i9, obj);
    }

    @Override // java.util.List
    public final List subList(int i9, int i10) {
        b();
        auj aujVar = this.f20756f;
        Object obj = this.f20750a;
        List listSubList = d().subList(i9, i10);
        aug augVar = this.f20752c;
        if (augVar == null) {
            augVar = this;
        }
        return aujVar.g(obj, listSubList, augVar);
    }
}
