package org.apache.http.pool;

/* JADX INFO: loaded from: classes4.dex */
public interface ConnPoolControl<T> {
    int getDefaultMaxPerRoute();

    int getMaxPerRoute(T t9);

    int getMaxTotal();

    PoolStats getStats(T t9);

    PoolStats getTotalStats();

    void setDefaultMaxPerRoute(int i9);

    void setMaxPerRoute(T t9, int i9);

    void setMaxTotal(int i9);
}
