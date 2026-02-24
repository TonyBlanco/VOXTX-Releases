package org.apache.http.impl.client;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.util.Args;

/* JADX INFO: loaded from: classes4.dex */
public final class IdleConnectionEvictor {
    private final HttpClientConnectionManager connectionManager;
    private volatile Exception exception;
    private final long maxIdleTimeMs;
    private final long sleepTimeMs;
    private final Thread thread;
    private final ThreadFactory threadFactory;

    public static class DefaultThreadFactory implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Connection evictor");
            thread.setDaemon(true);
            return thread;
        }
    }

    public IdleConnectionEvictor(HttpClientConnectionManager httpClientConnectionManager, long j9, TimeUnit timeUnit) {
        this(httpClientConnectionManager, null, j9 > 0 ? j9 : 5L, timeUnit != null ? timeUnit : TimeUnit.SECONDS, j9, timeUnit);
    }

    public IdleConnectionEvictor(HttpClientConnectionManager httpClientConnectionManager, long j9, TimeUnit timeUnit, long j10, TimeUnit timeUnit2) {
        this(httpClientConnectionManager, null, j9, timeUnit, j10, timeUnit2);
    }

    public IdleConnectionEvictor(final HttpClientConnectionManager httpClientConnectionManager, ThreadFactory threadFactory, long j9, TimeUnit timeUnit, long j10, TimeUnit timeUnit2) {
        this.connectionManager = (HttpClientConnectionManager) Args.notNull(httpClientConnectionManager, "Connection manager");
        threadFactory = threadFactory == null ? new DefaultThreadFactory() : threadFactory;
        this.threadFactory = threadFactory;
        this.sleepTimeMs = timeUnit != null ? timeUnit.toMillis(j9) : j9;
        this.maxIdleTimeMs = timeUnit2 != null ? timeUnit2.toMillis(j10) : j10;
        this.thread = threadFactory.newThread(new Runnable() { // from class: org.apache.http.impl.client.IdleConnectionEvictor.1
            @Override // java.lang.Runnable
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        Thread.sleep(IdleConnectionEvictor.this.sleepTimeMs);
                        httpClientConnectionManager.closeExpiredConnections();
                        if (IdleConnectionEvictor.this.maxIdleTimeMs > 0) {
                            httpClientConnectionManager.closeIdleConnections(IdleConnectionEvictor.this.maxIdleTimeMs, TimeUnit.MILLISECONDS);
                        }
                    } catch (Exception e9) {
                        IdleConnectionEvictor.this.exception = e9;
                        return;
                    }
                }
            }
        });
    }

    public void awaitTermination(long j9, TimeUnit timeUnit) throws InterruptedException {
        Thread thread = this.thread;
        if (timeUnit == null) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        thread.join(timeUnit.toMillis(j9));
    }

    public boolean isRunning() {
        return this.thread.isAlive();
    }

    public void shutdown() {
        this.thread.interrupt();
    }

    public void start() {
        this.thread.start();
    }
}
