package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class bei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bei f21137a = new bei();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final beh f21138b = new beh(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference f21139c = new AtomicReference();

    public static bei a() {
        return f21137a;
    }

    public final bfz b() {
        bfz bfzVar = (bfz) this.f21139c.get();
        return bfzVar == null ? f21138b : bfzVar;
    }
}
