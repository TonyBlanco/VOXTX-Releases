package com.nytimes.android.external.cache;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public interface j extends Future {
    void addListener(Runnable runnable, Executor executor);
}
