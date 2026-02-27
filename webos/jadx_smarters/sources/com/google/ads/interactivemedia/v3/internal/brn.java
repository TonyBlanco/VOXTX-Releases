package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class brn extends LinkedHashMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final brn f22167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22168b;

    static {
        brn brnVar = new brn();
        f22167a = brnVar;
        brnVar.c();
    }

    private brn() {
        this.f22168b = true;
    }

    private brn(Map map) {
        super(map);
        this.f22168b = true;
    }

    public static brn a() {
        return f22167a;
    }

    private static int f(Object obj) {
        if (obj instanceof byte[]) {
            return bqu.b((byte[]) obj);
        }
        if (obj instanceof bqp) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private final void g() {
        if (!this.f22168b) {
            throw new UnsupportedOperationException();
        }
    }

    public final brn b() {
        return isEmpty() ? new brn() : new brn(this);
    }

    public final void c() {
        this.f22168b = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        super.clear();
    }

    public final void d(brn brnVar) {
        g();
        if (brnVar.isEmpty()) {
            return;
        }
        putAll(brnVar);
    }

    public final boolean e() {
        return this.f22168b;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int iF = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f(entry.getValue()) ^ f(entry.getKey());
        }
        return iF;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        g();
        bqu.i(obj);
        bqu.i(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        g();
        for (Object obj : map.keySet()) {
            bqu.i(obj);
            bqu.i(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        return super.remove(obj);
    }
}
