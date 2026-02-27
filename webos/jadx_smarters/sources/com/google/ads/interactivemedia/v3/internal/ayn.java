package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
final class ayn implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ayn f20945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ ayn[] f20946b;

    static {
        ayn aynVar = new ayn();
        f20945a = aynVar;
        f20946b = new ayn[]{aynVar};
    }

    private ayn() {
    }

    public static ayn[] values() {
        return (ayn[]) f20946b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
