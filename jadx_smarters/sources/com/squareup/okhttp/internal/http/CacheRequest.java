package com.squareup.okhttp.internal.http;

import java.io.IOException;
import okio.Sink;

/* JADX INFO: loaded from: classes4.dex */
public interface CacheRequest {
    void abort();

    Sink body() throws IOException;
}
