package com.onesignal;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1571n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OSSubscriptionState f38784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OSSubscriptionState f38785b;

    public C1571n1(OSSubscriptionState oSSubscriptionState, OSSubscriptionState oSSubscriptionState2) {
        this.f38784a = oSSubscriptionState;
        this.f38785b = oSSubscriptionState2;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f38784a.j());
            jSONObject.put("to", this.f38785b.j());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return a().toString();
    }
}
