package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.C1371k;
import com.google.android.gms.common.api.internal.C1381p;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public final class D0 extends AbstractC1392v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1381p.a f26468b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(C1381p.a aVar, C1371k.a aVar2) {
        super(aVar2);
        this.f26468b = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1392v
    public final void b(a.b bVar, TaskCompletionSource taskCompletionSource) {
        this.f26468b.f26694b.accept(bVar, taskCompletionSource);
    }
}
