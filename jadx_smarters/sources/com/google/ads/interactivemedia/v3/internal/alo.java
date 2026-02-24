package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class alo implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f20142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f20143b;

    public /* synthetic */ alo(alq alqVar, int i9) {
        this.f20143b = i9;
        this.f20142a = alqVar;
    }

    public /* synthetic */ alo(alx alxVar, int i9) {
        this.f20143b = i9;
        this.f20142a = alxVar;
    }

    public /* synthetic */ alo(TaskCompletionSource taskCompletionSource, int i9) {
        this.f20143b = i9;
        this.f20142a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        int i9 = this.f20143b;
        if (i9 == 0) {
            ((TaskCompletionSource) this.f20142a).setException(exc);
        } else if (i9 != 1) {
            ((alx) this.f20142a).c(exc);
        } else {
            ((alq) this.f20142a).b(exc);
        }
    }
}
