package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class aqv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReference f20557a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReference f20558b = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    public static aqt a() {
        return (aqt) f20557a.get();
    }

    public static aqu b() {
        return (aqu) f20558b.get();
    }

    public static void c(aqt aqtVar) {
        f20557a.set(aqtVar);
    }
}
