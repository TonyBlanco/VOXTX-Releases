package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C1355c;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1362f0 implements ComponentCallbacks2C1355c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1363g f26615a;

    public C1362f0(C1363g c1363g) {
        this.f26615a = c1363g;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C1355c.a
    public final void a(boolean z9) {
        C1363g c1363g = this.f26615a;
        c1363g.f26633o.sendMessage(c1363g.f26633o.obtainMessage(1, Boolean.valueOf(z9)));
    }
}
