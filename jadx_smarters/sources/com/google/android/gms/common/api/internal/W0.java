package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import w4.C2914b;

/* JADX INFO: loaded from: classes3.dex */
public final class W0 implements GoogleApiClient.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26544a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GoogleApiClient f26545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GoogleApiClient.c f26546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ X0 f26547e;

    public W0(X0 x02, int i9, GoogleApiClient googleApiClient, GoogleApiClient.c cVar) {
        this.f26547e = x02;
        this.f26544a = i9;
        this.f26545c = googleApiClient;
        this.f26546d = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1377n
    public final void onConnectionFailed(C2914b c2914b) {
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(c2914b)));
        this.f26547e.h(c2914b, this.f26544a);
    }
}
