package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* JADX INFO: loaded from: classes3.dex */
public final class Z0 extends AbstractC1384q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dialog f26576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f26577b;

    public Z0(a1 a1Var, Dialog dialog) {
        this.f26577b = a1Var;
        this.f26576a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1384q0
    public final void a() {
        this.f26577b.f26580c.d();
        if (this.f26576a.isShowing()) {
            this.f26576a.dismiss();
        }
    }
}
