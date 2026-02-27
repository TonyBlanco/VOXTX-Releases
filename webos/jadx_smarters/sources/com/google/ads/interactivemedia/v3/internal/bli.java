package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class bli implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    bli f21649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    bli f21650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    bli f21651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    bli f21652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    bli f21653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Object f21654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f21655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Object f21656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f21657i;

    public bli(boolean z9) {
        this.f21654f = null;
        this.f21655g = z9;
        this.f21653e = this;
        this.f21652d = this;
    }

    public bli(boolean z9, bli bliVar, Object obj, bli bliVar2, bli bliVar3) {
        this.f21649a = bliVar;
        this.f21654f = obj;
        this.f21655g = z9;
        this.f21657i = 1;
        this.f21652d = bliVar2;
        this.f21653e = bliVar3;
        bliVar3.f21652d = this;
        bliVar2.f21653e = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f21654f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f21656h;
                Object value = entry.getValue();
                if (obj3 == null) {
                    if (value == null) {
                        return true;
                    }
                } else if (obj3.equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f21654f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f21656h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f21654f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f21656h;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f21655g) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f21656h;
        this.f21656h = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f21654f) + "=" + String.valueOf(this.f21656h);
    }
}
