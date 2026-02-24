package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;

/* JADX INFO: loaded from: classes.dex */
public interface HeaderHandler<T> {
    void handle(T t9, HttpResponse httpResponse);
}
