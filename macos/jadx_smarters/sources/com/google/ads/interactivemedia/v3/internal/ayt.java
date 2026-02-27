package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ayt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f20951a;

    public ayt() {
        this.f20951a = new HashMap();
    }

    public /* synthetic */ ayt(avo avoVar) {
        this.f20951a = avoVar;
    }

    public final azd a(Callable callable, Executor executor) {
        return new aym((avi) this.f20951a, executor, callable);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final AtomicReference b(String str) {
        synchronized (this) {
            try {
                if (!this.f20951a.containsKey(str)) {
                    this.f20951a.put(str, new AtomicReference());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (AtomicReference) this.f20951a.get(str);
    }
}
