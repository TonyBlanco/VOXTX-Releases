package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.pool.PoolEntry;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
class HttpPoolEntry extends PoolEntry<HttpRoute, OperatedClientConnection> {
    private final Log log;
    private final RouteTracker tracker;

    public HttpPoolEntry(Log log, String str, HttpRoute httpRoute, OperatedClientConnection operatedClientConnection, long j9, TimeUnit timeUnit) {
        super(str, httpRoute, operatedClientConnection, j9, timeUnit);
        this.log = log;
        this.tracker = new RouteTracker(httpRoute);
    }

    @Override // org.apache.http.pool.PoolEntry
    public void close() {
        try {
            getConnection().close();
        } catch (IOException e9) {
            this.log.debug("I/O error closing connection", e9);
        }
    }

    public HttpRoute getEffectiveRoute() {
        return this.tracker.toRoute();
    }

    public HttpRoute getPlannedRoute() {
        return getRoute();
    }

    public RouteTracker getTracker() {
        return this.tracker;
    }

    @Override // org.apache.http.pool.PoolEntry
    public boolean isClosed() {
        return !getConnection().isOpen();
    }

    @Override // org.apache.http.pool.PoolEntry
    public boolean isExpired(long j9) {
        boolean zIsExpired = super.isExpired(j9);
        if (zIsExpired && this.log.isDebugEnabled()) {
            this.log.debug("Connection " + this + " expired @ " + new Date(getExpiry()));
        }
        return zIsExpired;
    }
}
