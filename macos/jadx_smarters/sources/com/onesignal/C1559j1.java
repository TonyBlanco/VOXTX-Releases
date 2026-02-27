package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1559j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1556i1 f38739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1556i1 f38740b;

    public C1559j1(C1556i1 c1556i1, C1556i1 c1556i12) {
        this.f38739a = c1556i1;
        this.f38740b = c1556i12;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f38739a.g());
            jSONObject.put("to", this.f38740b.g());
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return a().toString();
    }
}
