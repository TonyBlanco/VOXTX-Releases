package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static j f27845a;

    public static synchronized j a(Context context) {
        try {
            if (f27845a == null) {
                h hVar = new h(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                hVar.a(context);
                f27845a = hVar.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f27845a;
    }
}
