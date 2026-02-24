package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f26661a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1 f26663d;

    public k1(l1 l1Var, LifecycleCallback lifecycleCallback, String str) {
        this.f26663d = l1Var;
        this.f26661a = lifecycleCallback;
        this.f26662c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        l1 l1Var = this.f26663d;
        if (l1Var.f26667c > 0) {
            LifecycleCallback lifecycleCallback = this.f26661a;
            if (l1Var.f26668d != null) {
                bundle = l1Var.f26668d.getBundle(this.f26662c);
            } else {
                bundle = null;
            }
            lifecycleCallback.onCreate(bundle);
        }
        if (this.f26663d.f26667c >= 2) {
            this.f26661a.onStart();
        }
        if (this.f26663d.f26667c >= 3) {
            this.f26661a.onResume();
        }
        if (this.f26663d.f26667c >= 4) {
            this.f26661a.onStop();
        }
        if (this.f26663d.f26667c >= 5) {
            this.f26661a.onDestroy();
        }
    }
}
