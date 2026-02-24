package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1593v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1590u0 f38903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1590u0 f38904b;

    public C1593v0(C1590u0 c1590u0, C1590u0 c1590u02) {
        this.f38903a = c1590u0;
        this.f38904b = c1590u02;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f38903a.g());
            jSONObject.put("to", this.f38904b.g());
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return a().toString();
    }
}
