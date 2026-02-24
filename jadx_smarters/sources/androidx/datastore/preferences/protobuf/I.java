package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class I extends LinkedHashMap {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final I f14585c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14586a;

    static {
        I i9 = new I();
        f14585c = i9;
        i9.k();
    }

    public I() {
        this.f14586a = true;
    }

    public I(Map map) {
        super(map);
        this.f14586a = true;
    }

    public static int c(Map map) {
        int iD = 0;
        for (Map.Entry entry : map.entrySet()) {
            iD += d(entry.getValue()) ^ d(entry.getKey());
        }
        return iD;
    }

    public static int d(Object obj) {
        return obj instanceof byte[] ? AbstractC1139y.d((byte[]) obj) : obj.hashCode();
    }

    public static void e(Map map) {
        for (Object obj : map.keySet()) {
            AbstractC1139y.a(obj);
            AbstractC1139y.a(map.get(obj));
        }
    }

    public static I f() {
        return f14585c;
    }

    public static boolean h(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    public static boolean i(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !h(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && i(this, (Map) obj);
    }

    public final void g() {
        if (!j()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return c(this);
    }

    public boolean j() {
        return this.f14586a;
    }

    public void k() {
        this.f14586a = false;
    }

    public void m(I i9) {
        g();
        if (i9.isEmpty()) {
            return;
        }
        putAll(i9);
    }

    public I n() {
        return isEmpty() ? new I() : new I(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        g();
        AbstractC1139y.a(obj);
        AbstractC1139y.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        g();
        e(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        g();
        return super.remove(obj);
    }
}
