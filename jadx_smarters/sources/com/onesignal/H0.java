package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H0 f38332a = new H0();

    public static final String a(JSONObject payload) {
        JSONObject jSONObjectOptJSONObject;
        kotlin.jvm.internal.l.e(payload, "payload");
        try {
            JSONObject jSONObjectB = T.b(payload);
            kotlin.jvm.internal.l.d(jSONObjectB, "{\n            Notificati…Object(payload)\n        }");
            if (jSONObjectB.has("a") && (jSONObjectOptJSONObject = jSONObjectB.optJSONObject("a")) != null && jSONObjectOptJSONObject.has("os_in_app_message_preview_id")) {
                return jSONObjectOptJSONObject.optString("os_in_app_message_preview_id");
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final boolean b(Activity activity, JSONObject jsonData) {
        kotlin.jvm.internal.l.e(activity, "activity");
        kotlin.jvm.internal.l.e(jsonData, "jsonData");
        String strA = a(jsonData);
        if (strA == null) {
            return false;
        }
        F1.d1(activity, new JSONArray().put(jsonData));
        F1.b0().G(strA);
        return true;
    }

    public static final boolean c(Context context, Bundle bundle) {
        JSONObject jSONObjectA = T.a(bundle);
        kotlin.jvm.internal.l.d(jSONObjectA, "bundleAsJSONObject(bundle)");
        String strA = a(jSONObjectA);
        if (strA == null) {
            return false;
        }
        if (F1.M0()) {
            F1.b0().G(strA);
            return true;
        }
        if (!f38332a.d()) {
            return true;
        }
        AbstractC1598x.m(new V0(context, jSONObjectA));
        return true;
    }

    public final boolean d() {
        return true;
    }
}
