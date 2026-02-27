package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
final class ays implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Future f20949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ayr f20950b;

    public ays(Future future, ayr ayrVar) {
        this.f20949a = future;
        this.f20950b = ayrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thA;
        Object obj = this.f20949a;
        if ((obj instanceof azm) && (thA = azn.a((azm) obj)) != null) {
            this.f20950b.a(thA);
            return;
        }
        try {
            this.f20950b.b(azh.c(this.f20949a));
        } catch (Error e9) {
            e = e9;
            this.f20950b.a(e);
        } catch (RuntimeException e10) {
            e = e10;
            this.f20950b.a(e);
        } catch (ExecutionException e11) {
            this.f20950b.a(e11.getCause());
        }
    }

    public final String toString() {
        return atp.n(this).a(this.f20950b).toString();
    }
}
