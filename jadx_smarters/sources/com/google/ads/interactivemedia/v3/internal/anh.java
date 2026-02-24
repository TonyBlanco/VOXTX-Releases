package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final class anh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NetworkCapabilities f20329a;

    public anh(ConnectivityManager connectivityManager) {
        if (connectivityManager == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(new ang(this));
        } catch (RuntimeException unused) {
            synchronized (anh.class) {
                this.f20329a = null;
            }
        }
    }

    public static anh c(Context context) {
        if (context != null) {
            return new anh((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final long a() {
        synchronized (anh.class) {
            try {
                NetworkCapabilities networkCapabilities = this.f20329a;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(4)) {
                        return 2L;
                    }
                    if (this.f20329a.hasTransport(1)) {
                        return 1L;
                    }
                    if (this.f20329a.hasTransport(0)) {
                        return 0L;
                    }
                }
                return -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final NetworkCapabilities b() {
        return this.f20329a;
    }
}
