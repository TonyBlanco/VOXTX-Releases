package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class brd extends bop implements RandomAccess, bre {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final brd f22150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f22151b;

    static {
        brd brdVar = new brd(10);
        f22150a = brdVar;
        brdVar.b();
    }

    public brd() {
        this(10);
    }

    public brd(int i9) {
        this(new ArrayList(i9));
    }

    private brd(ArrayList arrayList) {
        this.f22151b = arrayList;
    }

    private static String j(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof bpb ? ((bpb) obj).y() : bqu.f((byte[]) obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i9, Object obj) {
        a();
        this.f22151b.add(i9, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.List
    public final boolean addAll(int i9, Collection collection) {
        a();
        if (collection instanceof bre) {
            collection = ((bre) collection).h();
        }
        boolean zAddAll = this.f22151b.addAll(i9, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f22151b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqt
    public final /* bridge */ /* synthetic */ bqt d(int i9) {
        if (i9 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i9);
        arrayList.addAll(this.f22151b);
        return new brd(arrayList);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bre
    public final bre e() {
        return c() ? new bta(this) : this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bre
    public final Object f(int i9) {
        return this.f22151b.get(i9);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final String get(int i9) {
        Object obj = this.f22151b.get(i9);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof bpb) {
            bpb bpbVar = (bpb) obj;
            String strY = bpbVar.y();
            if (bpbVar.o()) {
                this.f22151b.set(i9, strY);
            }
            return strY;
        }
        byte[] bArr = (byte[]) obj;
        String strF = bqu.f(bArr);
        if (bqu.h(bArr)) {
            this.f22151b.set(i9, strF);
        }
        return strF;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bre
    public final List h() {
        return Collections.unmodifiableList(this.f22151b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bre
    public final void i(bpb bpbVar) {
        a();
        this.f22151b.add(bpbVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        a();
        Object objRemove = this.f22151b.remove(i9);
        ((AbstractList) this).modCount++;
        return j(objRemove);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        a();
        return j(this.f22151b.set(i9, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22151b.size();
    }
}
