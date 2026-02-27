package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC1365h;

/* JADX INFO: loaded from: classes3.dex */
public class r extends InterfaceC1365h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1359e f26701a;

    public r(InterfaceC1359e interfaceC1359e) {
        this.f26701a = interfaceC1359e;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1365h
    public void onResult(Status status) {
        this.f26701a.setResult(status);
    }
}
