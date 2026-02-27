package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class ahb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static final ahb f19755a = new ahb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f19756b;

    private ahb() {
    }

    public static ahb b() {
        return f19755a;
    }

    public final Context a() {
        return this.f19756b;
    }

    public final void c(Context context) {
        this.f19756b = context != null ? context.getApplicationContext() : null;
    }
}
