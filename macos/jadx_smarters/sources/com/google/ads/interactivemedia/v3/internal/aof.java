package com.google.ads.interactivemedia.v3.internal;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class aof {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f20421a = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f20422b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f20423c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f20424d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f20425e = false;

    public aof(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new aoe(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }

    public static aof d(Context context, Executor executor) {
        return new aof(context, executor, f20421a);
    }

    public final long b() {
        long j9 = this.f20424d;
        this.f20424d = -1L;
        return j9;
    }

    public final long c() {
        if (this.f20425e) {
            return this.f20423c - this.f20422b;
        }
        return -1L;
    }

    public final void h() {
        if (this.f20425e) {
            this.f20423c = System.currentTimeMillis();
        }
    }
}
