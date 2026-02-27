package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1570n0 {
    public static JSONObject a(Intent intent) {
        if (!U0.e(intent)) {
            return null;
        }
        JSONObject jSONObjectA = T.a(intent.getExtras());
        d(jSONObjectA);
        return jSONObjectA;
    }

    public static void b(Activity activity, Intent intent) {
        JSONObject jSONObjectA;
        F1.K0(activity.getApplicationContext());
        if (intent == null || (jSONObjectA = a(intent)) == null) {
            return;
        }
        c(activity, jSONObjectA);
    }

    public static void c(Activity activity, JSONObject jSONObject) {
        if (H0.b(activity, jSONObject)) {
            return;
        }
        F1.D0(activity, new JSONArray().put(jSONObject), U0.b(jSONObject));
    }

    public static void d(JSONObject jSONObject) {
        try {
            String str = (String) T.b(jSONObject).remove("actionId");
            if (str == null) {
                return;
            }
            jSONObject.put("actionId", str);
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
    }
}
