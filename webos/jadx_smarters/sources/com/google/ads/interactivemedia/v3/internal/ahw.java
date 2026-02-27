package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class ahw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue f19810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f19811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque f19812c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ahv f19813d = null;

    public ahw() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f19810a = linkedBlockingQueue;
        this.f19811b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void c() {
        ahv ahvVar = (ahv) this.f19812c.poll();
        this.f19813d = ahvVar;
        if (ahvVar != null) {
            ahvVar.executeOnExecutor(this.f19811b, new Object[0]);
        }
    }

    public final void a(ahv ahvVar) {
        ahvVar.b(this);
        this.f19812c.add(ahvVar);
        if (this.f19813d == null) {
            c();
        }
    }

    public final void b() {
        this.f19813d = null;
        c();
    }
}
