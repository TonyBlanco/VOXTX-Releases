package org.apache.http.impl.client;

import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.BackoffManager;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.pool.ConnPoolControl;
import org.apache.http.util.Args;

/* JADX INFO: loaded from: classes4.dex */
public class AIMDBackoffManager implements BackoffManager {
    private double backoffFactor;
    private int cap;
    private final Clock clock;
    private final ConnPoolControl<HttpRoute> connPerRoute;
    private long coolDown;
    private final Map<HttpRoute, Long> lastRouteBackoffs;
    private final Map<HttpRoute, Long> lastRouteProbes;

    public AIMDBackoffManager(ConnPoolControl<HttpRoute> connPoolControl) {
        this(connPoolControl, new SystemClock());
    }

    public AIMDBackoffManager(ConnPoolControl<HttpRoute> connPoolControl, Clock clock) {
        this.coolDown = 5000L;
        this.backoffFactor = 0.5d;
        this.cap = 2;
        this.clock = clock;
        this.connPerRoute = connPoolControl;
        this.lastRouteProbes = new HashMap();
        this.lastRouteBackoffs = new HashMap();
    }

    private int getBackedOffPoolSize(int i9) {
        if (i9 <= 1) {
            return 1;
        }
        return (int) Math.floor(this.backoffFactor * ((double) i9));
    }

    private Long getLastUpdate(Map<HttpRoute, Long> map, HttpRoute httpRoute) {
        Long l9 = map.get(httpRoute);
        if (l9 == null) {
            return 0L;
        }
        return l9;
    }

    @Override // org.apache.http.client.BackoffManager
    public void backOff(HttpRoute httpRoute) {
        synchronized (this.connPerRoute) {
            try {
                int maxPerRoute = this.connPerRoute.getMaxPerRoute(httpRoute);
                Long lastUpdate = getLastUpdate(this.lastRouteBackoffs, httpRoute);
                long currentTime = this.clock.getCurrentTime();
                if (currentTime - lastUpdate.longValue() < this.coolDown) {
                    return;
                }
                this.connPerRoute.setMaxPerRoute(httpRoute, getBackedOffPoolSize(maxPerRoute));
                this.lastRouteBackoffs.put(httpRoute, Long.valueOf(currentTime));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.apache.http.client.BackoffManager
    public void probe(HttpRoute httpRoute) {
        synchronized (this.connPerRoute) {
            try {
                int maxPerRoute = this.connPerRoute.getMaxPerRoute(httpRoute);
                int i9 = this.cap;
                if (maxPerRoute < i9) {
                    i9 = maxPerRoute + 1;
                }
                Long lastUpdate = getLastUpdate(this.lastRouteProbes, httpRoute);
                Long lastUpdate2 = getLastUpdate(this.lastRouteBackoffs, httpRoute);
                long currentTime = this.clock.getCurrentTime();
                if (currentTime - lastUpdate.longValue() >= this.coolDown && currentTime - lastUpdate2.longValue() >= this.coolDown) {
                    this.connPerRoute.setMaxPerRoute(httpRoute, i9);
                    this.lastRouteProbes.put(httpRoute, Long.valueOf(currentTime));
                }
            } finally {
            }
        }
    }

    public void setBackoffFactor(double d9) {
        Args.check(d9 > 0.0d && d9 < 1.0d, "Backoff factor must be 0.0 < f < 1.0");
        this.backoffFactor = d9;
    }

    public void setCooldownMillis(long j9) {
        Args.positive(this.coolDown, "Cool down");
        this.coolDown = j9;
    }

    public void setPerHostConnectionCap(int i9) {
        Args.positive(i9, "Per host connection cap");
        this.cap = i9;
    }
}
