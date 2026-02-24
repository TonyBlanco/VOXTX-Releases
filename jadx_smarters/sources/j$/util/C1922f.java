package j$.util;

import j$.util.Map;
import j$.util.concurrent.ConcurrentMap;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: j$.util.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1922f implements java.util.Map, Serializable, Map {
    private static final long serialVersionUID = 1978198479659022715L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f42352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f42353b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient java.util.Set f42354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient java.util.Set f42355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient java.util.Collection f42356e;

    C1922f(java.util.Map map) {
        this.f42352a = (java.util.Map) Objects.requireNonNull(map);
    }

    private static java.util.Set a(java.util.Set set, Object obj) {
        if (DesugarCollections.f42213e == null) {
            return Collections.synchronizedSet(set);
        }
        try {
            return (java.util.Set) DesugarCollections.f42213e.newInstance(set, obj);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e9) {
            throw new Error("Unable to instantiate a synchronized list.", e9);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f42353b) {
            objectOutputStream.defaultWriteObject();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.f42353b) {
            this.f42352a.clear();
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        Object objCompute;
        synchronized (this.f42353b) {
            java.util.Map map = this.f42352a;
            objCompute = map instanceof Map ? ((Map) map).compute(obj, biFunction) : map instanceof ConcurrentMap ? ConcurrentMap.CC.$default$compute((java.util.concurrent.ConcurrentMap) map, obj, biFunction) : Map.CC.$default$compute(map, obj, biFunction);
        }
        return objCompute;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        Object objComputeIfAbsent;
        synchronized (this.f42353b) {
            java.util.Map map = this.f42352a;
            objComputeIfAbsent = map instanceof Map ? ((Map) map).computeIfAbsent(obj, function) : map instanceof java.util.concurrent.ConcurrentMap ? ConcurrentMap.CC.$default$computeIfAbsent((java.util.concurrent.ConcurrentMap) map, obj, function) : Map.CC.$default$computeIfAbsent(map, obj, function);
        }
        return objComputeIfAbsent;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object objComputeIfPresent;
        synchronized (this.f42353b) {
            java.util.Map map = this.f42352a;
            objComputeIfPresent = map instanceof Map ? ((Map) map).computeIfPresent(obj, biFunction) : map instanceof java.util.concurrent.ConcurrentMap ? ConcurrentMap.CC.$default$computeIfPresent((java.util.concurrent.ConcurrentMap) map, obj, biFunction) : Map.CC.$default$computeIfPresent(map, obj, biFunction);
        }
        return objComputeIfPresent;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.f42353b) {
            zContainsKey = this.f42352a.containsKey(obj);
        }
        return zContainsKey;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.f42353b) {
            zContainsValue = this.f42352a.containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        java.util.Set set;
        synchronized (this.f42353b) {
            try {
                if (this.f42355d == null) {
                    this.f42355d = a(this.f42352a.entrySet(), this.f42353b);
                }
                set = this.f42355d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return set;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f42353b) {
            zEquals = this.f42352a.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Map, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.f42353b) {
            java.util.Map map = this.f42352a;
            if (map instanceof Map) {
                ((Map) map).forEach(biConsumer);
            } else if (map instanceof java.util.concurrent.ConcurrentMap) {
                ConcurrentMap.CC.$default$forEach((java.util.concurrent.ConcurrentMap) map, biConsumer);
            } else {
                Map.CC.$default$forEach(map, biConsumer);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.f42353b) {
            obj2 = this.f42352a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj$default$getOrDefault;
        synchronized (this.f42353b) {
            java.util.Map map = this.f42352a;
            if (map instanceof Map) {
                obj$default$getOrDefault = ((Map) map).getOrDefault(obj, obj2);
            } else if (map instanceof java.util.concurrent.ConcurrentMap) {
                obj$default$getOrDefault = ConcurrentMap.CC.$default$getOrDefault((java.util.concurrent.ConcurrentMap) map, obj, obj2);
            } else {
                Object obj3 = map.get(obj);
                if (obj3 != null || map.containsKey(obj)) {
                    obj2 = obj3;
                }
                obj$default$getOrDefault = obj2;
            }
        }
        return obj$default$getOrDefault;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f42353b) {
            iHashCode = this.f42352a.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f42353b) {
            zIsEmpty = this.f42352a.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        java.util.Set set;
        synchronized (this.f42353b) {
            try {
                if (this.f42354c == null) {
                    this.f42354c = a(this.f42352a.keySet(), this.f42353b);
                }
                set = this.f42354c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return set;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object objMerge;
        synchronized (this.f42353b) {
            java.util.Map map = this.f42352a;
            objMerge = map instanceof Map ? ((Map) map).merge(obj, obj2, biFunction) : map instanceof java.util.concurrent.ConcurrentMap ? ConcurrentMap.CC.$default$merge((java.util.concurrent.ConcurrentMap) map, obj, obj2, biFunction) : Map.CC.$default$merge(map, obj, obj2, biFunction);
        }
        return objMerge;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object objPut;
        synchronized (this.f42353b) {
            objPut = this.f42352a.put(obj, obj2);
        }
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        synchronized (this.f42353b) {
            this.f42352a.putAll(map);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object objR;
        synchronized (this.f42353b) {
            objR = A.r(this.f42352a, obj, obj2);
        }
        return objR;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Object objRemove;
        synchronized (this.f42353b) {
            objRemove = this.f42352a.remove(obj);
        }
        return objRemove;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        boolean zRemove;
        synchronized (this.f42353b) {
            java.util.Map map = this.f42352a;
            zRemove = map instanceof Map ? ((Map) map).remove(obj, obj2) : Map.CC.$default$remove(map, obj, obj2);
        }
        return zRemove;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        Object objReplace;
        synchronized (this.f42353b) {
            java.util.Map map = this.f42352a;
            objReplace = map instanceof Map ? ((Map) map).replace(obj, obj2) : Map.CC.$default$replace(map, obj, obj2);
        }
        return objReplace;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean zReplace;
        synchronized (this.f42353b) {
            java.util.Map map = this.f42352a;
            zReplace = map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
        }
        return zReplace;
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f42353b) {
            java.util.Map map = this.f42352a;
            if (map instanceof Map) {
                ((Map) map).replaceAll(biFunction);
            } else if (map instanceof java.util.concurrent.ConcurrentMap) {
                ConcurrentMap.CC.$default$replaceAll((java.util.concurrent.ConcurrentMap) map, biFunction);
            } else {
                Map.CC.$default$replaceAll(map, biFunction);
            }
        }
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        synchronized (this.f42353b) {
            size = this.f42352a.size();
        }
        return size;
    }

    public final String toString() {
        String string;
        synchronized (this.f42353b) {
            string = this.f42352a.toString();
        }
        return string;
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        java.util.Collection collection;
        java.util.Collection collectionSynchronizedCollection;
        synchronized (this.f42353b) {
            try {
                if (this.f42356e == null) {
                    java.util.Collection collectionValues = this.f42352a.values();
                    Object obj = this.f42353b;
                    if (DesugarCollections.f42212d == null) {
                        collectionSynchronizedCollection = Collections.synchronizedCollection(collectionValues);
                    } else {
                        try {
                            collectionSynchronizedCollection = (java.util.Collection) DesugarCollections.f42212d.newInstance(collectionValues, obj);
                        } catch (IllegalAccessException e9) {
                            e = e9;
                            throw new Error("Unable to instantiate a synchronized list.", e);
                        } catch (InstantiationException e10) {
                            e = e10;
                            throw new Error("Unable to instantiate a synchronized list.", e);
                        } catch (InvocationTargetException e11) {
                            e = e11;
                            throw new Error("Unable to instantiate a synchronized list.", e);
                        }
                    }
                    this.f42356e = collectionSynchronizedCollection;
                }
                collection = this.f42356e;
            } finally {
            }
        }
        return collection;
    }
}
