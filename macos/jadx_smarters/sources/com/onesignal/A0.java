package com.onesignal;

import com.onesignal.v2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f38109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f38110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f38111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v2.m f38112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Double f38113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38114g;

    public A0(JSONObject jsonObject) {
        kotlin.jvm.internal.l.e(jsonObject, "jsonObject");
        this.f38109b = true;
        this.f38110c = true;
        this.f38108a = jsonObject.optString("html");
        this.f38113f = Double.valueOf(jsonObject.optDouble("display_duration"));
        JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("styles");
        this.f38109b = !(jSONObjectOptJSONObject == null ? false : jSONObjectOptJSONObject.optBoolean("remove_height_margin", false));
        this.f38110c = !(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optBoolean("remove_width_margin", false) : false);
        this.f38111d = !this.f38109b;
    }

    public final String a() {
        return this.f38108a;
    }

    public final Double b() {
        return this.f38113f;
    }

    public final v2.m c() {
        return this.f38112e;
    }

    public final int d() {
        return this.f38114g;
    }

    public final boolean e() {
        return this.f38109b;
    }

    public final boolean f() {
        return this.f38110c;
    }

    public final boolean g() {
        return this.f38111d;
    }

    public final void h(String str) {
        this.f38108a = str;
    }

    public final void i(v2.m mVar) {
        this.f38112e = mVar;
    }

    public final void j(int i9) {
        this.f38114g = i9;
    }
}
