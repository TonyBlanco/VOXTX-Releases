package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class bsp implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ bst f22225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Comparable f22226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f22227c;

    public bsp(bst bstVar, Comparable comparable, Object obj) {
        this.f22225a = bstVar;
        this.f22226b = comparable;
        this.f22227c = obj;
    }

    private static final boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final Comparable a() {
        return this.f22226b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f22226b.compareTo(((bsp) obj).f22226b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return b(this.f22226b, entry.getKey()) && b(this.f22227c, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f22226b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f22227c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f22226b;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f22227c;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f22225a.o();
        Object obj2 = this.f22227c;
        this.f22227c = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f22226b) + "=" + String.valueOf(this.f22227c);
    }
}
