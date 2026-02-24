package com.google.ads.interactivemedia.v3.internal;

import j$.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes3.dex */
public final class awb extends awc implements NavigableMap, Map {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final awb f20838a = new awb(awf.w(awx.f20860a), avo.o());
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient axg f20839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient avo f20840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient awb f20841d;

    public awb(axg axgVar, avo avoVar) {
        this(axgVar, avoVar, null);
    }

    public awb(axg axgVar, avo avoVar, awb awbVar) {
        this.f20839b = axgVar;
        this.f20840c = avoVar;
        this.f20841d = awbVar;
    }

    public static awb l(Comparator comparator) {
        return awx.f20860a.equals(comparator) ? f20838a : new awb(awf.w(comparator), avo.o());
    }

    public static awb n() {
        return f20838a;
    }

    private final awb r(int i9, int i10) {
        if (i9 == 0) {
            if (i10 == size()) {
                return this;
            }
            i9 = 0;
        }
        return i9 == i10 ? l(comparator()) : new awb(this.f20839b.A(i9, i10), this.f20840c.subList(i9, i10));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avs
    public final avi a() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avs
    /* JADX INFO: renamed from: b */
    public final avi values() {
        return this.f20840c;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return axo.n(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return ((awf) this.f20839b).f20845a;
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableSet descendingKeySet() {
        return this.f20839b.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        awb awbVar = this.f20841d;
        return awbVar == null ? isEmpty() ? l(awy.b(comparator()).a()) : new awb((axg) this.f20839b.descendingSet(), this.f20840c.h(), this) : awbVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avs
    public final avx e() {
        return isEmpty() ? axf.f20877a : new avu(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avs, java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avs
    public final avx f() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().d().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f20839b.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return axo.n(floorEntry(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005  */
    @Override // com.google.ads.interactivemedia.v3.internal.avs, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            com.google.ads.interactivemedia.v3.internal.axg r0 = r3.f20839b
            r1 = -1
            if (r4 != 0) goto L7
        L5:
            r4 = -1
            goto L14
        L7:
            com.google.ads.interactivemedia.v3.internal.avo r2 = r0.f20885d     // Catch: java.lang.ClassCastException -> L12
            java.util.Comparator r0 = r0.f20845a     // Catch: java.lang.ClassCastException -> L12
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L12
            if (r4 >= 0) goto L14
            goto L5
        L12:
            goto L5
        L14:
            if (r4 != r1) goto L18
            r4 = 0
            return r4
        L18:
            com.google.ads.interactivemedia.v3.internal.avo r0 = r3.f20840c
            java.lang.Object r4 = r0.get(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.awb.get(java.lang.Object):java.lang.Object");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avs
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ avx keySet() {
        return this.f20839b;
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return axo.n(higherEntry(obj));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avs
    public final boolean i() {
        return this.f20839b.f() || this.f20840c.f();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avs, java.util.Map
    public final /* synthetic */ Set keySet() {
        return this.f20839b;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().d().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f20839b.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return axo.n(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final awb headMap(Object obj, boolean z9) {
        axg axgVar = this.f20839b;
        atp.k(obj);
        return r(0, axgVar.y(obj, z9));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.f20839b;
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final awb subMap(Object obj, boolean z9, Object obj2, boolean z10) {
        atp.k(obj);
        atp.k(obj2);
        if (comparator().compare(obj, obj2) <= 0) {
            return headMap(obj2, z10).tailMap(obj, z9);
        }
        throw new IllegalArgumentException(atp.b("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final awb tailMap(Object obj, boolean z9) {
        axg axgVar = this.f20839b;
        atp.k(obj);
        return r(axgVar.z(obj, z9), size());
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f20840c.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avs, java.util.Map
    public final /* synthetic */ Collection values() {
        return this.f20840c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avs
    public Object writeReplace() {
        return new awa(this);
    }
}
