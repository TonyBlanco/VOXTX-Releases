package com.onesignal;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f38394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONArray f38395b;

    public N0(JSONObject jSONObject) {
        this.f38394a = jSONObject.has("adds") ? jSONObject.getJSONObject("adds") : null;
        this.f38395b = jSONObject.has("removes") ? jSONObject.getJSONArray("removes") : null;
    }

    public JSONObject a() {
        return this.f38394a;
    }

    public JSONArray b() {
        return this.f38395b;
    }

    public String toString() {
        return "OSInAppMessageTag{adds=" + this.f38394a + ", removes=" + this.f38395b + '}';
    }
}
