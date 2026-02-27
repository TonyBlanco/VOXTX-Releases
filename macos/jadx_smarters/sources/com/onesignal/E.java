package com.onesignal;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f38195a;

    public E() {
        this.f38195a = new JSONObject();
    }

    public E(JSONObject jSONObject) {
        this.f38195a = jSONObject;
    }

    public boolean a(String str) {
        return this.f38195a.has(str);
    }

    public boolean b(String str) {
        return this.f38195a.optBoolean(str);
    }

    public boolean c(String str, boolean z9) {
        return this.f38195a.optBoolean(str, z9);
    }

    public int d(String str, int i9) {
        return this.f38195a.optInt(str, i9);
    }

    public JSONObject e(String str) {
        return this.f38195a.optJSONObject(str);
    }

    public String f(String str) {
        return this.f38195a.optString(str);
    }

    public String g(String str, String str2) {
        return this.f38195a.optString(str, str2);
    }

    public String toString() {
        return "ImmutableJSONObject{jsonObject=" + this.f38195a + '}';
    }
}
