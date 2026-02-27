package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class bof {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f21822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f21823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21824c;

    public bof() {
        Type genericSuperclass = bof.class.getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == bof.class) {
                this.f21823b = bks.d(parameterizedType.getActualTypeArguments()[0]);
                throw null;
            }
        } else if (genericSuperclass == bof.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    private bof(Type type) {
        type.getClass();
        Type typeD = bks.d(type);
        this.f21823b = typeD;
        this.f21822a = bks.a(typeD);
        this.f21824c = typeD.hashCode();
    }

    public static bof a(Class cls) {
        return new bof(cls);
    }

    public static bof b(Type type) {
        return new bof(type);
    }

    public final Class c() {
        return this.f21822a;
    }

    public final Type d() {
        return this.f21823b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bof) && bks.h(this.f21823b, ((bof) obj).f21823b);
    }

    public final int hashCode() {
        return this.f21824c;
    }

    public final String toString() {
        return bks.b(this.f21823b);
    }
}
