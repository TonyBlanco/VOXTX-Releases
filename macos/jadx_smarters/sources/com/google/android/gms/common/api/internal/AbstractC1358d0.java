package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.base.zat;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1358d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExecutorService f26610a = zat.zaa().zac(2, new D4.c("GAC_Executor"), 2);

    public static ExecutorService a() {
        return f26610a;
    }
}
