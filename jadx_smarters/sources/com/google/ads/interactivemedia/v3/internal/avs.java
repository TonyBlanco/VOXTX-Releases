package com.google.ads.interactivemedia.v3.internal;

import j$.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public abstract class avs<K, V> implements Map<K, V>, Serializable, j$.util.Map {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient avx f20825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient avx f20826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient avi f20827c;

    public static avs c(Map map) {
        if ((map instanceof avs) && !(map instanceof SortedMap)) {
            avs avsVar = (avs) map;
            if (!avsVar.i()) {
                return avsVar;
            }
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        avq avqVar = new avq(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        avqVar.d(setEntrySet);
        return avqVar.b();
    }

    public static avs d() {
        return axe.f20873a;
    }

    public static avs j(Object obj) {
        axo.I("adBreakTime", obj);
        return axe.k(1, new Object[]{"adBreakTime", obj}, null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public abstract avi a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public avi values() {
        avi aviVar = this.f20827c;
        if (aviVar != null) {
            return aviVar;
        }
        avi aviVarA = a();
        this.f20827c = aviVarA;
        return aviVarA;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract avx e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return axo.s(this, obj);
    }

    public abstract avx f();

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final avx entrySet() {
        avx avxVar = this.f20825a;
        if (avxVar != null) {
            return avxVar;
        }
        avx avxVarE = e();
        this.f20825a = avxVarE;
        return avxVarE;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public avx keySet() {
        avx avxVar = this.f20826b;
        if (avxVar != null) {
            return avxVar;
        }
        avx avxVarF = f();
        this.f20826b = avxVarF;
        return avxVarF;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return axo.b(entrySet());
    }

    public abstract boolean i();

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        int size = size();
        axo.K(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z9 = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z9) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z9 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public Object writeReplace() {
        return new avr(this);
    }
}
