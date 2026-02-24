package j$.util.concurrent;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class l implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f42309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f42310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile Object f42311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile l f42312d;

    l(int i9, Object obj, Object obj2) {
        this.f42309a = i9;
        this.f42310b = obj;
        this.f42311c = obj2;
    }

    l(int i9, Object obj, Object obj2, l lVar) {
        this(i9, obj, obj2);
        this.f42312d = lVar;
    }

    l a(Object obj, int i9) {
        Object obj2;
        if (obj == null) {
            return null;
        }
        l lVar = this;
        do {
            if (lVar.f42309a == i9 && ((obj2 = lVar.f42310b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return lVar;
            }
            lVar = lVar.f42312d;
        } while (lVar != null);
        return null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f42310b) || key.equals(obj2)) && (value == (obj3 = this.f42311c) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f42310b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f42311c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f42310b.hashCode() ^ this.f42311c.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return u.a(this.f42310b, this.f42311c);
    }
}
