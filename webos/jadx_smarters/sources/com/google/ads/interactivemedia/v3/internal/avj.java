package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
final class avj extends auk implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f20809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f20810b;

    public avj(Object obj, Object obj2) {
        this.f20809a = obj;
        this.f20810b = obj2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auk, java.util.Map.Entry
    public final Object getKey() {
        return this.f20809a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auk, java.util.Map.Entry
    public final Object getValue() {
        return this.f20810b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auk, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
