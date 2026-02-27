package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpConnection;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class IdleConnectionHandler {
    private final Log log = LogFactory.getLog(getClass());
    private final Map<HttpConnection, TimeValues> connectionToTimes = new HashMap();

    public static class TimeValues {
        private final long timeAdded;
        private final long timeExpires;

        public TimeValues(long j9, long j10, TimeUnit timeUnit) {
            this.timeAdded = j9;
            this.timeExpires = j10 > 0 ? j9 + timeUnit.toMillis(j10) : Long.MAX_VALUE;
        }
    }

    public void add(HttpConnection httpConnection, long j9, TimeUnit timeUnit) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Adding connection at: " + jCurrentTimeMillis);
        }
        this.connectionToTimes.put(httpConnection, new TimeValues(jCurrentTimeMillis, j9, timeUnit));
    }

    public void closeExpiredConnections() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Checking for expired connections, now: " + jCurrentTimeMillis);
        }
        for (Map.Entry<HttpConnection, TimeValues> entry : this.connectionToTimes.entrySet()) {
            HttpConnection key = entry.getKey();
            TimeValues value = entry.getValue();
            if (value.timeExpires <= jCurrentTimeMillis) {
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Closing connection, expired @: " + value.timeExpires);
                }
                try {
                    key.close();
                } catch (IOException e9) {
                    this.log.debug("I/O error closing connection", e9);
                }
            }
        }
    }

    public void closeIdleConnections(long j9) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j9;
        if (this.log.isDebugEnabled()) {
            this.log.debug("Checking for connections, idle timeout: " + jCurrentTimeMillis);
        }
        for (Map.Entry<HttpConnection, TimeValues> entry : this.connectionToTimes.entrySet()) {
            HttpConnection key = entry.getKey();
            long j10 = entry.getValue().timeAdded;
            if (j10 <= jCurrentTimeMillis) {
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Closing idle connection, connection time: " + j10);
                }
                try {
                    key.close();
                } catch (IOException e9) {
                    this.log.debug("I/O error closing connection", e9);
                }
            }
        }
    }

    public boolean remove(HttpConnection httpConnection) {
        TimeValues timeValuesRemove = this.connectionToTimes.remove(httpConnection);
        if (timeValuesRemove != null) {
            return System.currentTimeMillis() <= timeValuesRemove.timeExpires;
        }
        this.log.warn("Removing a connection that never existed!");
        return true;
    }

    public void removeAll() {
        this.connectionToTimes.clear();
    }
}
