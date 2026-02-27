package com.google.android.gms.common.api.internal;

import android.util.Log;
import w4.C2914b;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC1378n0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2914b f26674a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1380o0 f26675c;

    public RunnableC1378n0(C1380o0 c1380o0, C2914b c2914b) {
        this.f26675c = c1380o0;
        this.f26674a = c2914b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1380o0 c1380o0 = this.f26675c;
        C1372k0 c1372k0 = (C1372k0) c1380o0.f26689f.f26629k.get(c1380o0.f26685b);
        if (c1372k0 == null) {
            return;
        }
        if (!this.f26674a.L()) {
            c1372k0.F(this.f26674a, null);
            return;
        }
        this.f26675c.f26688e = true;
        if (this.f26675c.f26684a.requiresSignIn()) {
            this.f26675c.i();
            return;
        }
        try {
            C1380o0 c1380o02 = this.f26675c;
            c1380o02.f26684a.getRemoteService(null, c1380o02.f26684a.getScopesForConnectionlessNonSignIn());
        } catch (SecurityException e9) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e9);
            this.f26675c.f26684a.disconnect("Failed to get service from broker.");
            c1372k0.F(new C2914b(10), null);
        }
    }
}
