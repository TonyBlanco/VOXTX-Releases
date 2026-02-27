package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes3.dex */
final class xy implements xx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WindowManager f25128a;

    private xy(WindowManager windowManager) {
        this.f25128a = windowManager;
    }

    public static xx c(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new xy(windowManager);
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xx
    public final void a() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xx
    public final void b(xv xvVar) {
        xvVar.a(this.f25128a.getDefaultDisplay());
    }
}
