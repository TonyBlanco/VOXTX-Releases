package com.google.ads.interactivemedia.v3.internal;

import android.annotation.TargetApi;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(19)
final class akl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final akj f20028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final akc f20029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aze f20030c;

    public akl(akc akcVar, ExecutorService executorService, akj akjVar) {
        this.f20030c = azh.a(executorService);
        this.f20028a = akjVar;
        this.f20029b = akcVar;
    }

    public final /* synthetic */ com.google.ads.interactivemedia.v3.impl.data.br b(com.google.ads.interactivemedia.v3.impl.data.bq bqVar) throws Exception {
        return this.f20028a.a(bqVar);
    }

    public final void c(ajq ajqVar, String str, final com.google.ads.interactivemedia.v3.impl.data.bq bqVar) {
        ajq ajqVar2 = ajq.activate;
        if (ajqVar.ordinal() != 35) {
            com.google.ads.interactivemedia.v3.impl.data.m.c("Unexpected network request of type".concat(String.valueOf(ajqVar)));
        } else {
            azh.d(this.f20030c.submit(new Callable() { // from class: com.google.ads.interactivemedia.v3.internal.akg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f20022a.b(bqVar);
                }
            }), new akh(this, str), this.f20030c);
        }
    }
}
