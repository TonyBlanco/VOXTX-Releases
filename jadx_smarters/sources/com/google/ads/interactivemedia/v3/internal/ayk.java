package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class ayk extends ayl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ aym f20940a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Callable f20941c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayk(aym aymVar, Callable callable, Executor executor) {
        super(aymVar, executor);
        this.f20940a = aymVar;
        atp.k(callable);
        this.f20941c = callable;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azc
    public final Object a() throws Exception {
        return this.f20941c.call();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azc
    public final String b() {
        return this.f20941c.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayl
    public final void c(Object obj) {
        this.f20940a.j(obj);
    }
}
