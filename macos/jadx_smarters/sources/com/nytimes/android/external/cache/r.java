package com.nytimes.android.external.cache;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38097a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f38098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f38099d;

    public r(Object obj, Object obj2, p pVar) {
        this.f38097a = obj;
        this.f38098c = obj2;
        this.f38099d = (p) o.a(pVar);
    }

    public static r a(Object obj, Object obj2, p pVar) {
        return new r(obj, obj2, pVar);
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m.a(getKey(), entry.getKey()) && m.a(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f38097a;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f38098c;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }
}
