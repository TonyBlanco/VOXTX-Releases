package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class df implements cx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cx f22708b;

    public df(Context context, cx cxVar) {
        this.f22707a = context.getApplicationContext();
        this.f22708b = cxVar;
    }

    public final de a() {
        return new de(this.f22707a, ((dg) this.f22708b).a());
    }
}
