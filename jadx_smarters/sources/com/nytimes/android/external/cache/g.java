package com.nytimes.android.external.cache;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public enum g implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
