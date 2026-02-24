package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import w4.C2914b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class S extends d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f26779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC1404c f26780f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(AbstractC1404c abstractC1404c, int i9, Bundle bundle) {
        super(abstractC1404c, Boolean.TRUE);
        this.f26780f = abstractC1404c;
        this.f26778d = i9;
        this.f26779e = bundle;
    }

    @Override // com.google.android.gms.common.internal.d0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.f26778d != 0) {
            this.f26780f.a(1, null);
            Bundle bundle = this.f26779e;
            f(new C2914b(this.f26778d, bundle != null ? (PendingIntent) bundle.getParcelable(AbstractC1404c.KEY_PENDING_INTENT) : null));
        } else {
            if (g()) {
                return;
            }
            this.f26780f.a(1, null);
            f(new C2914b(8, null));
        }
    }

    @Override // com.google.android.gms.common.internal.d0
    public final void b() {
    }

    public abstract void f(C2914b c2914b);

    public abstract boolean g();
}
