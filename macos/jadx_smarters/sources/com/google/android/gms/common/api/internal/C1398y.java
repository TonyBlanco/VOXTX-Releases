package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1398y implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f26735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1400z f26736b;

    public C1398y(C1400z c1400z, TaskCompletionSource taskCompletionSource) {
        this.f26736b = c1400z;
        this.f26735a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.f26736b.f26742b.remove(this.f26735a);
    }
}
