package com.google.ads.interactivemedia.v3.internal;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class alm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f20137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final akc f20138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.ads.interactivemedia.v3.impl.data.ag f20140d;

    public alm(akc akcVar) {
        com.google.ads.interactivemedia.v3.impl.data.ag agVar = new com.google.ads.interactivemedia.v3.impl.data.ag();
        this.f20137a = new ConcurrentLinkedQueue();
        this.f20139c = 1;
        this.f20140d = agVar;
        this.f20138b = akcVar;
    }

    private final void e(com.google.ads.interactivemedia.v3.impl.data.bk bkVar) {
        ajr ajrVar = new ajr(ajp.adsLoader, ajq.nativeInstrumentation, "*", bkVar);
        int i9 = this.f20139c;
        int i10 = i9 - 1;
        if (i9 == 0) {
            throw null;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            this.f20138b.o(ajrVar);
        } else if (this.f20137a.size() > 2) {
            this.f20139c = 3;
        } else {
            this.f20137a.add(ajrVar);
        }
    }

    public final void a(com.google.ads.interactivemedia.v3.impl.data.bi biVar, com.google.ads.interactivemedia.v3.impl.data.bj bjVar) {
        e(com.google.ads.interactivemedia.v3.impl.data.bk.create(System.currentTimeMillis(), biVar, bjVar));
    }

    public final void b(com.google.ads.interactivemedia.v3.impl.data.bi biVar, com.google.ads.interactivemedia.v3.impl.data.bj bjVar, Exception exc) {
        e(com.google.ads.interactivemedia.v3.impl.data.bk.create(System.currentTimeMillis(), biVar, bjVar, exc));
    }

    public final void c(azd azdVar, aze azeVar, com.google.ads.interactivemedia.v3.impl.data.bi biVar, com.google.ads.interactivemedia.v3.impl.data.bj bjVar) {
        azdVar.g(new ti(this, azdVar, biVar, bjVar, 4), azeVar);
    }

    public final void d(boolean z9) {
        if (!z9) {
            this.f20139c = 3;
            this.f20137a.clear();
        } else {
            this.f20139c = 2;
            while (true) {
                ajr ajrVar = (ajr) this.f20137a.poll();
                if (ajrVar == null) {
                    return;
                } else {
                    this.f20138b.o(ajrVar);
                }
            }
        }
    }
}
