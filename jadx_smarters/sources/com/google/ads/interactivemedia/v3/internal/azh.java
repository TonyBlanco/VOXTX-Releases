package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public class azh {
    public azh() {
    }

    public azh(byte[] bArr) {
        this();
    }

    public static aze a(ExecutorService executorService) {
        if (executorService instanceof aze) {
            return (aze) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new azg((ScheduledExecutorService) executorService) : new ayc(executorService);
    }

    @SafeVarargs
    public static ayt b(azd... azdVarArr) {
        return new ayt(avo.n(azdVarArr));
    }

    public static Object c(Future future) throws ExecutionException {
        Object obj;
        boolean z9 = false;
        if (!future.isDone()) {
            throw new IllegalStateException(atp.b("Future was expected to be done: %s", future));
        }
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z9 = true;
            } catch (Throwable th) {
                if (z9) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void d(azd azdVar, ayr ayrVar, Executor executor) {
        atp.k(ayrVar);
        azdVar.g(new ays(azdVar, ayrVar), executor);
    }

    public static void e(Future future, Class cls) throws Exception {
        ayy.b(future, cls);
    }

    public static int f(long j9) {
        return (int) (j9 ^ (j9 >>> 32));
    }
}
