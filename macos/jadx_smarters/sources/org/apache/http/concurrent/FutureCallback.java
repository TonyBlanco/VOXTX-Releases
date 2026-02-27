package org.apache.http.concurrent;

/* JADX INFO: loaded from: classes4.dex */
public interface FutureCallback<T> {
    void cancelled();

    void completed(T t9);

    void failed(Exception exc);
}
