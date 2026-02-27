package com.nytimes.android.external.cache;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i {

    public static class b extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Throwable f37976c;

        public b(Throwable th) {
            super();
            this.f37976c = th;
        }

        @Override // com.nytimes.android.external.cache.i.c, java.util.concurrent.Future
        public Object get() throws ExecutionException {
            throw new ExecutionException(this.f37976c);
        }
    }

    public static abstract class c implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Logger f37977a = Logger.getLogger(c.class.getName());

        public c() {
        }

        @Override // com.nytimes.android.external.cache.j
        public void addListener(Runnable runnable, Executor executor) {
            o.b(runnable, "Runnable was null.");
            o.b(executor, "Executor was null.");
            try {
                executor.execute(runnable);
            } catch (RuntimeException e9) {
                f37977a.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e9);
            }
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z9) {
            return false;
        }

        @Override // java.util.concurrent.Future
        public abstract Object get();

        @Override // java.util.concurrent.Future
        public Object get(long j9, TimeUnit timeUnit) {
            o.a(timeUnit);
            return get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return false;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }
    }

    public static j a(Throwable th) {
        o.a(th);
        return new b(th);
    }
}
