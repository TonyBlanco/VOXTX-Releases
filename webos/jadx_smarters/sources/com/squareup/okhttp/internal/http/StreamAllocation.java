package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Address;
import com.squareup.okhttp.ConnectionPool;
import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.RouteDatabase;
import com.squareup.okhttp.internal.io.RealConnection;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import okio.Sink;
import okio.Timeout;

/* JADX INFO: loaded from: classes4.dex */
public final class StreamAllocation {
    public final Address address;
    private boolean canceled;
    private RealConnection connection;
    private final ConnectionPool connectionPool;
    private boolean released;
    private RouteSelector routeSelector;
    private HttpStream stream;

    public StreamAllocation(ConnectionPool connectionPool, Address address) {
        this.connectionPool = connectionPool;
        this.address = address;
    }

    private void connectionFailed(IOException iOException) {
        synchronized (this.connectionPool) {
            try {
                if (this.routeSelector != null) {
                    RealConnection realConnection = this.connection;
                    if (realConnection.streamCount == 0) {
                        this.routeSelector.connectFailed(realConnection.getRoute(), iOException);
                    } else {
                        this.routeSelector = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        connectionFailed();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void deallocate(boolean r3, boolean r4, boolean r5) {
        /*
            r2 = this;
            com.squareup.okhttp.ConnectionPool r0 = r2.connectionPool
            monitor-enter(r0)
            r1 = 0
            if (r5 == 0) goto Lb
            r2.stream = r1     // Catch: java.lang.Throwable -> L9
            goto Lb
        L9:
            r3 = move-exception
            goto L5d
        Lb:
            r5 = 1
            if (r4 == 0) goto L10
            r2.released = r5     // Catch: java.lang.Throwable -> L9
        L10:
            com.squareup.okhttp.internal.io.RealConnection r4 = r2.connection     // Catch: java.lang.Throwable -> L9
            if (r4 == 0) goto L52
            if (r3 == 0) goto L18
            r4.noNewStreams = r5     // Catch: java.lang.Throwable -> L9
        L18:
            com.squareup.okhttp.internal.http.HttpStream r3 = r2.stream     // Catch: java.lang.Throwable -> L9
            if (r3 != 0) goto L52
            boolean r3 = r2.released     // Catch: java.lang.Throwable -> L9
            if (r3 != 0) goto L24
            boolean r3 = r4.noNewStreams     // Catch: java.lang.Throwable -> L9
            if (r3 == 0) goto L52
        L24:
            r2.release(r4)     // Catch: java.lang.Throwable -> L9
            com.squareup.okhttp.internal.io.RealConnection r3 = r2.connection     // Catch: java.lang.Throwable -> L9
            int r4 = r3.streamCount     // Catch: java.lang.Throwable -> L9
            if (r4 <= 0) goto L2f
            r2.routeSelector = r1     // Catch: java.lang.Throwable -> L9
        L2f:
            java.util.List<java.lang.ref.Reference<com.squareup.okhttp.internal.http.StreamAllocation>> r3 = r3.allocations     // Catch: java.lang.Throwable -> L9
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L9
            if (r3 == 0) goto L4e
            com.squareup.okhttp.internal.io.RealConnection r3 = r2.connection     // Catch: java.lang.Throwable -> L9
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L9
            r3.idleAtNanos = r4     // Catch: java.lang.Throwable -> L9
            com.squareup.okhttp.internal.Internal r3 = com.squareup.okhttp.internal.Internal.instance     // Catch: java.lang.Throwable -> L9
            com.squareup.okhttp.ConnectionPool r4 = r2.connectionPool     // Catch: java.lang.Throwable -> L9
            com.squareup.okhttp.internal.io.RealConnection r5 = r2.connection     // Catch: java.lang.Throwable -> L9
            boolean r3 = r3.connectionBecameIdle(r4, r5)     // Catch: java.lang.Throwable -> L9
            if (r3 == 0) goto L4e
            com.squareup.okhttp.internal.io.RealConnection r3 = r2.connection     // Catch: java.lang.Throwable -> L9
            goto L4f
        L4e:
            r3 = r1
        L4f:
            r2.connection = r1     // Catch: java.lang.Throwable -> L9
            r1 = r3
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L5c
            java.net.Socket r3 = r1.getSocket()
            com.squareup.okhttp.internal.Util.closeQuietly(r3)
        L5c:
            return
        L5d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.http.StreamAllocation.deallocate(boolean, boolean, boolean):void");
    }

    private RealConnection findConnection(int i9, int i10, int i11, boolean z9) throws RouteException, IOException {
        synchronized (this.connectionPool) {
            try {
                if (this.released) {
                    throw new IllegalStateException("released");
                }
                if (this.stream != null) {
                    throw new IllegalStateException("stream != null");
                }
                if (this.canceled) {
                    throw new IOException("Canceled");
                }
                RealConnection realConnection = this.connection;
                if (realConnection != null && !realConnection.noNewStreams) {
                    return realConnection;
                }
                RealConnection realConnection2 = Internal.instance.get(this.connectionPool, this.address, this);
                if (realConnection2 != null) {
                    this.connection = realConnection2;
                    return realConnection2;
                }
                if (this.routeSelector == null) {
                    this.routeSelector = new RouteSelector(this.address, routeDatabase());
                }
                RealConnection realConnection3 = new RealConnection(this.routeSelector.next());
                acquire(realConnection3);
                synchronized (this.connectionPool) {
                    Internal.instance.put(this.connectionPool, realConnection3);
                    this.connection = realConnection3;
                    if (this.canceled) {
                        throw new IOException("Canceled");
                    }
                }
                realConnection3.connect(i9, i10, i11, this.address.getConnectionSpecs(), z9);
                routeDatabase().connected(realConnection3.getRoute());
                return realConnection3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private RealConnection findHealthyConnection(int i9, int i10, int i11, boolean z9, boolean z10) throws RouteException, IOException {
        while (true) {
            RealConnection realConnectionFindConnection = findConnection(i9, i10, i11, z9);
            synchronized (this.connectionPool) {
                try {
                    if (realConnectionFindConnection.streamCount == 0) {
                        return realConnectionFindConnection;
                    }
                    if (realConnectionFindConnection.isHealthy(z10)) {
                        return realConnectionFindConnection;
                    }
                    connectionFailed();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private boolean isRecoverable(RouteException routeException) {
        IOException lastConnectException = routeException.getLastConnectException();
        if (lastConnectException instanceof ProtocolException) {
            return false;
        }
        return lastConnectException instanceof InterruptedIOException ? lastConnectException instanceof SocketTimeoutException : (((lastConnectException instanceof SSLHandshakeException) && (lastConnectException.getCause() instanceof CertificateException)) || (lastConnectException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private boolean isRecoverable(IOException iOException) {
        return ((iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) ? false : true;
    }

    private void release(RealConnection realConnection) {
        int size = realConnection.allocations.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (realConnection.allocations.get(i9).get() == this) {
                realConnection.allocations.remove(i9);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private RouteDatabase routeDatabase() {
        return Internal.instance.routeDatabase(this.connectionPool);
    }

    public void acquire(RealConnection realConnection) {
        realConnection.allocations.add(new WeakReference(this));
    }

    public void cancel() {
        HttpStream httpStream;
        RealConnection realConnection;
        synchronized (this.connectionPool) {
            this.canceled = true;
            httpStream = this.stream;
            realConnection = this.connection;
        }
        if (httpStream != null) {
            httpStream.cancel();
        } else if (realConnection != null) {
            realConnection.cancel();
        }
    }

    public synchronized RealConnection connection() {
        return this.connection;
    }

    public void connectionFailed() {
        deallocate(true, false, true);
    }

    public HttpStream newStream(int i9, int i10, int i11, boolean z9, boolean z10) throws RouteException, IOException {
        HttpStream http1xStream;
        try {
            RealConnection realConnectionFindHealthyConnection = findHealthyConnection(i9, i10, i11, z9, z10);
            if (realConnectionFindHealthyConnection.framedConnection != null) {
                http1xStream = new Http2xStream(this, realConnectionFindHealthyConnection.framedConnection);
            } else {
                realConnectionFindHealthyConnection.getSocket().setSoTimeout(i10);
                Timeout timeout = realConnectionFindHealthyConnection.source.timeout();
                long j9 = i10;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                timeout.timeout(j9, timeUnit);
                realConnectionFindHealthyConnection.sink.timeout().timeout(i11, timeUnit);
                http1xStream = new Http1xStream(this, realConnectionFindHealthyConnection.source, realConnectionFindHealthyConnection.sink);
            }
            synchronized (this.connectionPool) {
                realConnectionFindHealthyConnection.streamCount++;
                this.stream = http1xStream;
            }
            return http1xStream;
        } catch (IOException e9) {
            throw new RouteException(e9);
        }
    }

    public void noNewStreams() {
        deallocate(true, false, false);
    }

    public boolean recover(RouteException routeException) {
        if (this.connection != null) {
            connectionFailed(routeException.getLastConnectException());
        }
        RouteSelector routeSelector = this.routeSelector;
        return (routeSelector == null || routeSelector.hasNext()) && isRecoverable(routeException);
    }

    public boolean recover(IOException iOException, Sink sink) {
        RealConnection realConnection = this.connection;
        if (realConnection != null) {
            int i9 = realConnection.streamCount;
            connectionFailed(iOException);
            if (i9 == 1) {
                return false;
            }
        }
        boolean z9 = sink == null || (sink instanceof RetryableSink);
        RouteSelector routeSelector = this.routeSelector;
        return (routeSelector == null || routeSelector.hasNext()) && isRecoverable(iOException) && z9;
    }

    public void release() {
        deallocate(false, true, false);
    }

    public HttpStream stream() {
        HttpStream httpStream;
        synchronized (this.connectionPool) {
            httpStream = this.stream;
        }
        return httpStream;
    }

    public void streamFinished(HttpStream httpStream) {
        synchronized (this.connectionPool) {
            if (httpStream != null) {
                if (httpStream == this.stream) {
                }
            }
            throw new IllegalStateException("expected " + this.stream + " but was " + httpStream);
        }
        deallocate(false, false, true);
    }

    public String toString() {
        return this.address.toString();
    }
}
