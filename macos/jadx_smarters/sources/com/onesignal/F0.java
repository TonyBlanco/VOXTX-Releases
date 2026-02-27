package com.onesignal;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f38240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f38241c;

    public F0(JSONObject jSONObject) {
        this.f38239a = jSONObject.getString("name");
        this.f38240b = jSONObject.has("weight") ? (float) jSONObject.getDouble("weight") : 0.0f;
        this.f38241c = jSONObject.has("unique") && jSONObject.getBoolean("unique");
    }

    public String a() {
        return this.f38239a;
    }

    public float b() {
        return this.f38240b;
    }

    public boolean c() {
        return this.f38241c;
    }

    public String toString() {
        return "OSInAppMessageOutcome{name='" + this.f38239a + "', weight=" + this.f38240b + ", unique=" + this.f38241c + '}';
    }
}
