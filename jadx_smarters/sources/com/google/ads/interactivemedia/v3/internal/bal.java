package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
public final class bal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f21002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final baj f21003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f21004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bfx f21005d;

    public /* synthetic */ bal(ConcurrentMap concurrentMap, baj bajVar, bfx bfxVar, Class cls) {
        this.f21002a = concurrentMap;
        this.f21003b = bajVar;
        this.f21004c = cls;
        this.f21005d = bfxVar;
    }

    public final baj a() {
        return this.f21003b;
    }

    public final bfx b() {
        return this.f21005d;
    }

    public final Class c() {
        return this.f21004c;
    }

    public final Collection d() {
        return this.f21002a.values();
    }

    public final boolean e() {
        return !this.f21005d.a().isEmpty();
    }
}
