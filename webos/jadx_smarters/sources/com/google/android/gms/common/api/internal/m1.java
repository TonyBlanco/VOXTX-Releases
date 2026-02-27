package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f26671a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1 f26673d;

    public m1(n1 n1Var, LifecycleCallback lifecycleCallback, String str) {
        this.f26673d = n1Var;
        this.f26671a = lifecycleCallback;
        this.f26672c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        n1 n1Var = this.f26673d;
        if (n1Var.f26678c > 0) {
            LifecycleCallback lifecycleCallback = this.f26671a;
            if (n1Var.f26679d != null) {
                bundle = n1Var.f26679d.getBundle(this.f26672c);
            } else {
                bundle = null;
            }
            lifecycleCallback.onCreate(bundle);
        }
        if (this.f26673d.f26678c >= 2) {
            this.f26671a.onStart();
        }
        if (this.f26673d.f26678c >= 3) {
            this.f26671a.onResume();
        }
        if (this.f26673d.f26678c >= 4) {
            this.f26671a.onStop();
        }
        if (this.f26673d.f26678c >= 5) {
            this.f26671a.onDestroy();
        }
    }
}
