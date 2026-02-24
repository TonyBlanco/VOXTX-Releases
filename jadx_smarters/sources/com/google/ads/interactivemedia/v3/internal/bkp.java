package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes3.dex */
final class bkp implements GenericArrayType, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Type f21607a;

    public bkp(Type type) {
        type.getClass();
        this.f21607a = bks.d(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && bks.h(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f21607a;
    }

    public final int hashCode() {
        return this.f21607a.hashCode();
    }

    public final String toString() {
        return String.valueOf(bks.b(this.f21607a)).concat(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
    }
}
