package org.apache.http.impl.client;

/* JADX INFO: loaded from: classes4.dex */
class SystemClock implements Clock {
    @Override // org.apache.http.impl.client.Clock
    public long getCurrentTime() {
        return System.currentTimeMillis();
    }
}
