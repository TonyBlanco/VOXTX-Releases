package com.google.ads.interactivemedia.v3.internal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class awf extends awg implements NavigableSet, axn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final transient Comparator f20845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient awf f20846b;

    public awf(Comparator comparator) {
        this.f20845a = comparator;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static axg w(Comparator comparator) {
        return awx.f20860a.equals(comparator) ? axg.f20884c : new axg(avo.o(), comparator);
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        return axo.B(tailSet(obj, true));
    }

    @Override // java.util.SortedSet, com.google.ads.interactivemedia.v3.internal.axn
    public final Comparator comparator() {
        return this.f20845a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avx, com.google.ads.interactivemedia.v3.internal.avi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e */
    public abstract axq listIterator();

    @Override // java.util.SortedSet
    public Object first() {
        return listIterator().next();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        return axo.y(headSet(obj, true).descendingIterator());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        return axo.B(tailSet(obj, false));
    }

    public final int j(Object obj, Object obj2) {
        return this.f20845a.compare(obj, obj2);
    }

    @Override // java.util.SortedSet
    public Object last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        return axo.y(headSet(obj, false).descendingIterator());
    }

    public abstract awf o();

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final awf descendingSet() {
        awf awfVar = this.f20846b;
        if (awfVar != null) {
            return awfVar;
        }
        awf awfVarO = o();
        this.f20846b = awfVarO;
        awfVarO.f20846b = this;
        return awfVarO;
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final awf headSet(Object obj, boolean z9) {
        atp.k(obj);
        return r(obj, z9);
    }

    public abstract awf r(Object obj, boolean z9);

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final awf subSet(Object obj, boolean z9, Object obj2, boolean z10) {
        atp.k(obj);
        atp.k(obj2);
        atp.e(this.f20845a.compare(obj, obj2) <= 0);
        return t(obj, z9, obj2, z10);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public abstract awf t(Object obj, boolean z9, Object obj2, boolean z10);

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final awf tailSet(Object obj, boolean z9) {
        atp.k(obj);
        return v(obj, z9);
    }

    public abstract awf v(Object obj, boolean z9);

    @Override // com.google.ads.interactivemedia.v3.internal.avx, com.google.ads.interactivemedia.v3.internal.avi
    public Object writeReplace() {
        return new awe(this.f20845a, toArray());
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public abstract axq descendingIterator();
}
