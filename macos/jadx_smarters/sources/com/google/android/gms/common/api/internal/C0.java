package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.C1381p;
import com.google.android.gms.tasks.TaskCompletionSource;
import w4.C2916d;

/* JADX INFO: loaded from: classes3.dex */
public final class C0 extends AbstractC1379o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1381p.a f26466e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(C1381p.a aVar, C1371k c1371k, C2916d[] c2916dArr, boolean z9, int i9) {
        super(c1371k, c2916dArr, z9, i9);
        this.f26466e = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1379o
    public final void d(a.b bVar, TaskCompletionSource taskCompletionSource) {
        this.f26466e.f26693a.accept(bVar, taskCompletionSource);
    }
}
