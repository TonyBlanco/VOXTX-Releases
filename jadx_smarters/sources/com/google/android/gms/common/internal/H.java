package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.InterfaceC1361f;
import com.google.android.gms.common.internal.AbstractC1404c;

/* JADX INFO: loaded from: classes3.dex */
public final class H implements AbstractC1404c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1361f f26756a;

    public H(InterfaceC1361f interfaceC1361f) {
        this.f26756a = interfaceC1361f;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c.a
    public final void onConnected(Bundle bundle) {
        this.f26756a.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c.a
    public final void onConnectionSuspended(int i9) {
        this.f26756a.onConnectionSuspended(i9);
    }
}
