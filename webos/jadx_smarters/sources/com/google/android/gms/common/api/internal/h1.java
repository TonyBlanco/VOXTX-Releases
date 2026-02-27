package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import w4.C2914b;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 implements InterfaceC1389t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1394w f26638a;

    public /* synthetic */ h1(C1394w c1394w, g1 g1Var) {
        this.f26638a = c1394w;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1389t0
    public final void a(Bundle bundle) {
        this.f26638a.f26724n.lock();
        try {
            C1394w.u(this.f26638a, bundle);
            this.f26638a.f26721k = C2914b.f51646j;
            C1394w.v(this.f26638a);
        } finally {
            this.f26638a.f26724n.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1389t0
    public final void b(C2914b c2914b) {
        this.f26638a.f26724n.lock();
        try {
            this.f26638a.f26721k = c2914b;
            C1394w.v(this.f26638a);
        } finally {
            this.f26638a.f26724n.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1389t0
    public final void c(int i9, boolean z9) {
        this.f26638a.f26724n.lock();
        try {
            C1394w c1394w = this.f26638a;
            if (c1394w.f26723m || c1394w.f26722l == null || !c1394w.f26722l.L()) {
                this.f26638a.f26723m = false;
                C1394w.t(this.f26638a, i9, z9);
            } else {
                this.f26638a.f26723m = true;
                this.f26638a.f26716f.onConnectionSuspended(i9);
            }
            this.f26638a.f26724n.unlock();
        } catch (Throwable th) {
            this.f26638a.f26724n.unlock();
            throw th;
        }
    }
}
