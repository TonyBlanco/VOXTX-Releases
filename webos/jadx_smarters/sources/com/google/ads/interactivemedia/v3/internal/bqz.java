package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class bqz implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map.Entry f22139a;

    public final brb a() {
        return (brb) this.f22139a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f22139a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((brb) this.f22139a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof brs) {
            return ((brb) this.f22139a.getValue()).d((brs) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
