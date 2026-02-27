package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1410i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f26837a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static t0 f26838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static HandlerThread f26839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Executor f26840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f26841e;

    public static AbstractC1410i a(Context context) {
        synchronized (f26837a) {
            try {
                if (f26838b == null) {
                    f26838b = new t0(context.getApplicationContext(), f26841e ? b().getLooper() : context.getMainLooper(), f26840d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f26838b;
    }

    public static HandlerThread b() {
        synchronized (f26837a) {
            try {
                HandlerThread handlerThread = f26839c;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f26839c = handlerThread2;
                handlerThread2.start();
                return f26839c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void c(o0 o0Var, ServiceConnection serviceConnection, String str);

    public final void d(String str, String str2, int i9, ServiceConnection serviceConnection, String str3, boolean z9) {
        c(new o0(str, str2, 4225, z9), serviceConnection, str3);
    }

    public abstract boolean e(o0 o0Var, ServiceConnection serviceConnection, String str, Executor executor);
}
