package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
final class azj extends azc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ azk f20963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Callable f20964b;

    public azj(azk azkVar, Callable callable) {
        this.f20963a = azkVar;
        atp.k(callable);
        this.f20964b = callable;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azc
    public final Object a() throws Exception {
        return this.f20964b.call();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azc
    public final String b() {
        return this.f20964b.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azc
    public final void d(Throwable th) {
        this.f20963a.o(th);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azc
    public final void e(Object obj) {
        this.f20963a.j(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azc
    public final boolean g() {
        return this.f20963a.isDone();
    }
}
