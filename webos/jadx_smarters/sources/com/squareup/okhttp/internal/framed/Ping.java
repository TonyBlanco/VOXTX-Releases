package com.squareup.okhttp.internal.framed;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class Ping {
    private final CountDownLatch latch = new CountDownLatch(1);
    private long sent = -1;
    private long received = -1;

    public void cancel() {
        if (this.received == -1) {
            long j9 = this.sent;
            if (j9 != -1) {
                this.received = j9 - 1;
                this.latch.countDown();
                return;
            }
        }
        throw new IllegalStateException();
    }

    public void receive() {
        if (this.received != -1 || this.sent == -1) {
            throw new IllegalStateException();
        }
        this.received = System.nanoTime();
        this.latch.countDown();
    }

    public long roundTripTime() throws InterruptedException {
        this.latch.await();
        return this.received - this.sent;
    }

    public long roundTripTime(long j9, TimeUnit timeUnit) throws InterruptedException {
        if (this.latch.await(j9, timeUnit)) {
            return this.received - this.sent;
        }
        return -2L;
    }

    public void send() {
        if (this.sent != -1) {
            throw new IllegalStateException();
        }
        this.sent = System.nanoTime();
    }
}
