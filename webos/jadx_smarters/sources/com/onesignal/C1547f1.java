package com.onesignal;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1547f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1544e1 f38719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1544e1 f38720b;

    public C1547f1(C1544e1 c1544e1, C1544e1 c1544e12) {
        this.f38719a = c1544e1;
        this.f38720b = c1544e12;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f38719a.h());
            jSONObject.put("to", this.f38720b.h());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return a().toString();
    }
}
