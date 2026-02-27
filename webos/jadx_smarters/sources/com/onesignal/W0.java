package com.onesignal;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONArray f38619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONObject f38620b;

    public W0(JSONArray jSONArray, JSONObject jSONObject) {
        this.f38619a = jSONArray;
        this.f38620b = jSONObject;
    }

    public final JSONArray a() {
        return this.f38619a;
    }

    public final JSONObject b() {
        return this.f38620b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W0)) {
            return false;
        }
        W0 w02 = (W0) obj;
        return kotlin.jvm.internal.l.a(this.f38619a, w02.f38619a) && kotlin.jvm.internal.l.a(this.f38620b, w02.f38620b);
    }

    public int hashCode() {
        JSONArray jSONArray = this.f38619a;
        int iHashCode = (jSONArray == null ? 0 : jSONArray.hashCode()) * 31;
        JSONObject jSONObject = this.f38620b;
        return iHashCode + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    public String toString() {
        return "OSNotificationIntentExtras(dataArray=" + this.f38619a + ", jsonData=" + this.f38620b + ')';
    }
}
