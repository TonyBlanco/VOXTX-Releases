package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
final class blp extends blt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Method f21669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f21670b;

    public blp(Method method, Object obj) {
        this.f21669a = method;
        this.f21670b = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blt
    public final Object a(Class cls) throws Exception {
        blt.b(cls);
        return this.f21669a.invoke(this.f21670b, cls);
    }
}
