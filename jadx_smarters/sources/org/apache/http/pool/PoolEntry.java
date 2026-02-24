package org.apache.http.pool;

import java.util.concurrent.TimeUnit;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

/* JADX INFO: loaded from: classes4.dex */
@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
public abstract class PoolEntry<T, C> {
    private final C conn;
    private final long created;
    private long expiry;
    private final String id;
    private final T route;
    private volatile Object state;
    private long updated;
    private final long validityDeadline;

    public PoolEntry(String str, T t9, C c9) {
        this(str, t9, c9, 0L, TimeUnit.MILLISECONDS);
    }

    public PoolEntry(String str, T t9, C c9, long j9, TimeUnit timeUnit) {
        Args.notNull(t9, "Route");
        Args.notNull(c9, "Connection");
        Args.notNull(timeUnit, "Time unit");
        this.id = str;
        this.route = t9;
        this.conn = c9;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.created = jCurrentTimeMillis;
        this.updated = jCurrentTimeMillis;
        long j10 = Long.MAX_VALUE;
        if (j9 > 0) {
            long millis = jCurrentTimeMillis + timeUnit.toMillis(j9);
            if (millis > 0) {
                j10 = millis;
            }
        }
        this.validityDeadline = j10;
        this.expiry = this.validityDeadline;
    }

    public abstract void close();

    public C getConnection() {
        return this.conn;
    }

    public long getCreated() {
        return this.created;
    }

    public synchronized long getExpiry() {
        return this.expiry;
    }

    public String getId() {
        return this.id;
    }

    public T getRoute() {
        return this.route;
    }

    public Object getState() {
        return this.state;
    }

    public synchronized long getUpdated() {
        return this.updated;
    }

    @Deprecated
    public long getValidUnit() {
        return this.validityDeadline;
    }

    public long getValidityDeadline() {
        return this.validityDeadline;
    }

    public abstract boolean isClosed();

    public synchronized boolean isExpired(long j9) {
        return j9 >= this.expiry;
    }

    public void setState(Object obj) {
        this.state = obj;
    }

    public String toString() {
        return "[id:" + this.id + "][route:" + this.route + "][state:" + this.state + "]";
    }

    public synchronized void updateExpiry(long j9, TimeUnit timeUnit) {
        try {
            Args.notNull(timeUnit, "Time unit");
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.updated = jCurrentTimeMillis;
            this.expiry = Math.min(j9 > 0 ? jCurrentTimeMillis + timeUnit.toMillis(j9) : Long.MAX_VALUE, this.validityDeadline);
        } catch (Throwable th) {
            throw th;
        }
    }
}
