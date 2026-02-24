package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aqj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f20511c;

    public /* synthetic */ aqj(int i9, String str, Object obj) {
        this.f20509a = i9;
        this.f20510b = str;
        this.f20511c = obj;
        aqd.c().f(this);
    }

    public static aqj e(int i9, String str, Boolean bool) {
        return new aqe(i9, str, bool);
    }

    public static void i(String str, float f9) {
        new aqh(str, Float.valueOf(f9));
    }

    public static void j(String str, int i9) {
        new aqf(str, Integer.valueOf(i9));
    }

    public static aqj k(String str, long j9) {
        return new aqg(str, Long.valueOf(j9));
    }

    public static aqj l(String str, String str2) {
        return new aqi(str, str2);
    }

    public static void m() {
        aqd.c().e(l("gads:sdk_core_constants:experiment_id", null));
    }

    public abstract Object a(JSONObject jSONObject);

    public abstract Object b(Bundle bundle);

    public abstract Object c(SharedPreferences sharedPreferences);

    public final int d() {
        return this.f20509a;
    }

    public final Object f() {
        return aqd.a().b(this);
    }

    public final Object g() {
        return this.f20511c;
    }

    public final String h() {
        return this.f20510b;
    }
}
