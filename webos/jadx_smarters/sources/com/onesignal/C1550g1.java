package com.onesignal;

import com.onesignal.F1;
import com.onesignal.T1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1550g1 {
    public void a(String str, String str2, Integer num, String str3, T1.g gVar) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("app_id", str).put("player_id", str2);
            if (num != null) {
                jSONObjectPut.put("device_type", num);
            }
            T1.l("notifications/" + str3 + "/report_received", jSONObjectPut, gVar);
        } catch (JSONException e9) {
            F1.b(F1.v.ERROR, "Generating direct receive receipt:JSON Failed.", e9);
        }
    }
}
