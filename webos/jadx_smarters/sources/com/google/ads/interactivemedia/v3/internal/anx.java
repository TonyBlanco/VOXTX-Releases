package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes3.dex */
public final class anx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f20378a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f20379b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f20380c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f20381d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f20382e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f20383f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f20384g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f20385h = -1;

    private static DisplayMetrics l(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
        } catch (NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    private static boolean m(View view) {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object objInvoke = view.getClass().getMethod("getAdConfiguration", null).invoke(view, null);
            Integer num = (Integer) objInvoke.getClass().getField("adType").get(objInvoke);
            num.intValue();
            String str = (String) objInvoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
            if (!str.contains("INTERSTITIAL") && !str.contains("APP_OPEN")) {
                if (!str.contains("REWARDED")) {
                    return false;
                }
            }
            return true;
        } catch (ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    public final long a() {
        return this.f20384g;
    }

    public final long b() {
        return this.f20382e;
    }

    public final long c() {
        return this.f20378a;
    }

    public final long d() {
        return this.f20380c;
    }

    public final long e() {
        return this.f20385h;
    }

    public final long f() {
        return this.f20383f;
    }

    public final long g() {
        return this.f20379b;
    }

    public final long h() {
        return this.f20381d;
    }

    public final void i() {
        this.f20385h = this.f20384g;
        this.f20384g = SystemClock.uptimeMillis();
    }

    public final void j() {
        this.f20379b = this.f20378a;
        this.f20378a = SystemClock.uptimeMillis();
    }

    public final void k(Context context, View view) {
        this.f20381d = this.f20380c;
        this.f20380c = SystemClock.uptimeMillis();
        long j9 = this.f20382e;
        if (j9 != -1) {
            this.f20383f = j9;
        }
        DisplayMetrics displayMetricsL = l(context);
        int i9 = displayMetricsL.widthPixels;
        int i10 = displayMetricsL.heightPixels;
        int iMin = Math.min(view.getWidth(), displayMetricsL.widthPixels) * Math.min(view.getHeight(), displayMetricsL.heightPixels);
        if (iMin + iMin < i9 * i10 && !(iMin == 0 && m(view))) {
            this.f20382e = -1L;
        } else {
            this.f20382e = this.f20380c;
        }
    }
}
