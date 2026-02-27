package j$.util.concurrent;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class k implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f42306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f42307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ConcurrentHashMap f42308c;

    k(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f42306a = obj;
        this.f42307b = obj2;
        this.f42308c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f42306a) || key.equals(obj2)) && (value == (obj3 = this.f42307b) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f42306a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f42307b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f42306a.hashCode() ^ this.f42307b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f42307b;
        this.f42307b = obj;
        this.f42308c.put(this.f42306a, obj);
        return obj2;
    }

    public final String toString() {
        return u.a(this.f42306a, this.f42307b);
    }
}
