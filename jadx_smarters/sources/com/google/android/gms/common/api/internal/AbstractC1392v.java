package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.C1371k;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1392v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1371k.a f26711a;

    public AbstractC1392v(C1371k.a aVar) {
        this.f26711a = aVar;
    }

    public C1371k.a a() {
        return this.f26711a;
    }

    public abstract void b(a.b bVar, TaskCompletionSource taskCompletionSource);
}
