package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f26782a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f26783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f26784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f26785d;

    public static int a(Context context) {
        b(context);
        return f26785d;
    }

    public static void b(Context context) {
        synchronized (f26782a) {
            try {
                if (f26783b) {
                    return;
                }
                f26783b = true;
                try {
                    Bundle bundle = E4.e.a(context).c(context.getPackageName(), 128).metaData;
                    if (bundle == null) {
                        return;
                    }
                    f26784c = bundle.getString("com.google.app.id");
                    f26785d = bundle.getInt("com.google.android.gms.version");
                } catch (PackageManager.NameNotFoundException e9) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
