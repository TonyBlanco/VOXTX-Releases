package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1385r0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f26702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1384q0 f26703b;

    public C1385r0(AbstractC1384q0 abstractC1384q0) {
        this.f26703b = abstractC1384q0;
    }

    public final void a(Context context) {
        this.f26702a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f26702a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f26702a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f26703b.a();
            b();
        }
    }
}
