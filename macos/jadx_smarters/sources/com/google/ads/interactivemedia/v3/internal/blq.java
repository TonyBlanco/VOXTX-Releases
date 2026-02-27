package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
final class blq extends blt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Method f21671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f21672b;

    public blq(Method method, int i9) {
        this.f21671a = method;
        this.f21672b = i9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blt
    public final Object a(Class cls) throws Exception {
        blt.b(cls);
        return this.f21671a.invoke(null, cls, Integer.valueOf(this.f21672b));
    }
}
