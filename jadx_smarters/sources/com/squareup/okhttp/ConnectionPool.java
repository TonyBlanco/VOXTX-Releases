package com.squareup.okhttp;

import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.RouteDatabase;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.StreamAllocation;
import com.squareup.okhttp.internal.io.RealConnection;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class ConnectionPool {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long DEFAULT_KEEP_ALIVE_DURATION_MS = 300000;
    private static final ConnectionPool systemDefault;
    private Runnable cleanupRunnable;
    private final Deque<RealConnection> connections;
    private final Executor executor;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;
    final RouteDatabase routeDatabase;

    static {
        ConnectionPool connectionPool;
        String property = System.getProperty("http.keepAlive");
        String property2 = System.getProperty("http.keepAliveDuration");
        String property3 = System.getProperty("http.maxConnections");
        long j9 = property2 != null ? Long.parseLong(property2) : DEFAULT_KEEP_ALIVE_DURATION_MS;
        if (property == null || Boolean.parseBoolean(property)) {
            connectionPool = property3 != null ? new ConnectionPool(Integer.parseInt(property3), j9) : new ConnectionPool(5, j9);
        } else {
            connectionPool = new ConnectionPool(0, j9);
        }
        systemDefault = connectionPool;
    }

    public ConnectionPool(int i9, long j9) {
        this(i9, j9, TimeUnit.MILLISECONDS);
    }

    public ConnectionPool(int i9, long j9, TimeUnit timeUnit) {
        this.executor = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory("OkHttp ConnectionPool", true));
        this.cleanupRunnable = new Runnable() { // from class: com.squareup.okhttp.ConnectionPool.1
            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    long jCleanup = ConnectionPool.this.cleanup(System.nanoTime());
                    if (jCleanup == -1) {
                        return;
                    }
                    if (jCleanup > 0) {
                        long j10 = jCleanup / 1000000;
                        long j11 = jCleanup - (1000000 * j10);
                        synchronized (ConnectionPool.this) {
                            try {
                                ConnectionPool.this.wait(j10, (int) j11);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }
            }
        };
        this.connections = new ArrayDeque();
        this.routeDatabase = new RouteDatabase();
        this.maxIdleConnections = i9;
        this.keepAliveDurationNs = timeUnit.toNanos(j9);
        if (j9 > 0) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + j9);
    }

    public static ConnectionPool getDefault() {
        return systemDefault;
    }

    private int pruneAndGetAllocationCount(RealConnection realConnection, long j9) {
        List<Reference<StreamAllocation>> list = realConnection.allocations;
        int i9 = 0;
        while (i9 < list.size()) {
            if (list.get(i9).get() != null) {
                i9++;
            } else {
                Internal.logger.warning("A connection to " + realConnection.getRoute().getAddress().url() + " was leaked. Did you forget to close a response body?");
                list.remove(i9);
                realConnection.noNewStreams = true;
                if (list.isEmpty()) {
                    realConnection.idleAtNanos = j9 - this.keepAliveDurationNs;
                    return 0;
                }
            }
        }
        return list.size();
    }

    public long cleanup(long j9) {
        synchronized (this) {
            try {
                int i9 = 0;
                long j10 = Long.MIN_VALUE;
                RealConnection realConnection = null;
                int i10 = 0;
                for (RealConnection realConnection2 : this.connections) {
                    if (pruneAndGetAllocationCount(realConnection2, j9) > 0) {
                        i10++;
                    } else {
                        i9++;
                        long j11 = j9 - realConnection2.idleAtNanos;
                        if (j11 > j10) {
                            realConnection = realConnection2;
                            j10 = j11;
                        }
                    }
                }
                long j12 = this.keepAliveDurationNs;
                if (j10 < j12 && i9 <= this.maxIdleConnections) {
                    if (i9 > 0) {
                        return j12 - j10;
                    }
                    if (i10 > 0) {
                        return j12;
                    }
                    return -1L;
                }
                this.connections.remove(realConnection);
                Util.closeQuietly(realConnection.getSocket());
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean connectionBecameIdle(RealConnection realConnection) {
        if (realConnection.noNewStreams || this.maxIdleConnections == 0) {
            this.connections.remove(realConnection);
            return true;
        }
        notifyAll();
        return false;
    }

    public void evictAll() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<RealConnection> it = this.connections.iterator();
                while (it.hasNext()) {
                    RealConnection next = it.next();
                    if (next.allocations.isEmpty()) {
                        next.noNewStreams = true;
                        arrayList.add(next);
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Util.closeQuietly(((RealConnection) it2.next()).getSocket());
        }
    }

    public RealConnection get(Address address, StreamAllocation streamAllocation) {
        for (RealConnection realConnection : this.connections) {
            if (realConnection.allocations.size() < realConnection.allocationLimit() && address.equals(realConnection.getRoute().address) && !realConnection.noNewStreams) {
                streamAllocation.acquire(realConnection);
                return realConnection;
            }
        }
        return null;
    }

    public synchronized int getConnectionCount() {
        return this.connections.size();
    }

    public synchronized int getHttpConnectionCount() {
        return this.connections.size() - getMultiplexedConnectionCount();
    }

    public synchronized int getIdleConnectionCount() {
        int i9;
        Iterator<RealConnection> it = this.connections.iterator();
        i9 = 0;
        while (it.hasNext()) {
            if (it.next().allocations.isEmpty()) {
                i9++;
            }
        }
        return i9;
    }

    public synchronized int getMultiplexedConnectionCount() {
        int i9;
        Iterator<RealConnection> it = this.connections.iterator();
        i9 = 0;
        while (it.hasNext()) {
            if (it.next().isMultiplexed()) {
                i9++;
            }
        }
        return i9;
    }

    @Deprecated
    public synchronized int getSpdyConnectionCount() {
        return getMultiplexedConnectionCount();
    }

    public void put(RealConnection realConnection) {
        if (this.connections.isEmpty()) {
            this.executor.execute(this.cleanupRunnable);
        }
        this.connections.add(realConnection);
    }

    public void setCleanupRunnableForTest(Runnable runnable) {
        this.cleanupRunnable = runnable;
    }
}
