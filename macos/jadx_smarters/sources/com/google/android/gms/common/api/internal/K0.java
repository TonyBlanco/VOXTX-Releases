package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.AbstractC1388t;
import com.google.android.gms.tasks.TaskCompletionSource;
import w4.C2916d;

/* JADX INFO: loaded from: classes3.dex */
public final class K0 extends AbstractC1388t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC1388t.a f26492d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(AbstractC1388t.a aVar, C2916d[] c2916dArr, boolean z9, int i9) {
        super(c2916dArr, z9, i9);
        this.f26492d = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1388t
    public final void b(a.b bVar, TaskCompletionSource taskCompletionSource) {
        this.f26492d.f26707a.accept(bVar, taskCompletionSource);
    }
}
