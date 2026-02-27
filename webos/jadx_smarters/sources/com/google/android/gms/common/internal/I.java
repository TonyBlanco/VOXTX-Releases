package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.internal.InterfaceC1377n;
import com.google.android.gms.common.internal.AbstractC1404c;
import w4.C2914b;

/* JADX INFO: loaded from: classes3.dex */
public final class I implements AbstractC1404c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1377n f26757a;

    public I(InterfaceC1377n interfaceC1377n) {
        this.f26757a = interfaceC1377n;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c.b
    public final void onConnectionFailed(C2914b c2914b) {
        this.f26757a.onConnectionFailed(c2914b);
    }
}
