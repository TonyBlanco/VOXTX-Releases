package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.InterfaceC1369j;

/* JADX INFO: loaded from: classes3.dex */
public final class F extends G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f26754a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1369j f26755c;

    public F(Intent intent, InterfaceC1369j interfaceC1369j, int i9) {
        this.f26754a = intent;
        this.f26755c = interfaceC1369j;
    }

    @Override // com.google.android.gms.common.internal.G
    public final void a() {
        Intent intent = this.f26754a;
        if (intent != null) {
            this.f26755c.startActivityForResult(intent, 2);
        }
    }
}
