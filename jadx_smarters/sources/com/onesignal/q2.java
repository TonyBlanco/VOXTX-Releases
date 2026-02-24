package com.onesignal;

import com.onesignal.F1;
import com.onesignal.T1;
import com.onesignal.W1;
import com.onesignal.u2;
import org.json.JSONException;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes4.dex */
public class q2 extends u2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f38813m;

    public class a extends T1.g {
        public a() {
        }

        @Override // com.onesignal.T1.g
        public void b(String str) {
            boolean unused = q2.f38813m = true;
            if (str == null || str.isEmpty()) {
                str = "{}";
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("tags")) {
                    synchronized (q2.this.f38872a) {
                        q2 q2Var = q2.this;
                        JSONObject jSONObjectY = q2Var.y(q2Var.z().l().e("tags"), q2.this.F().l().e("tags"), null, null);
                        q2.this.z().t("tags", jSONObject.optJSONObject("tags"));
                        q2.this.z().q();
                        q2.this.F().o(jSONObject, jSONObjectY);
                        q2.this.F().q();
                    }
                }
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
        }
    }

    public q2() {
        super(W1.c.PUSH);
    }

    @Override // com.onesignal.u2
    public String A() {
        return F1.y0();
    }

    @Override // com.onesignal.u2
    public F1.v B() {
        return F1.v.ERROR;
    }

    @Override // com.onesignal.u2
    public m2 N(String str, boolean z9) {
        return new p2(str, z9);
    }

    @Override // com.onesignal.u2
    public void O(JSONObject jSONObject) {
    }

    @Override // com.onesignal.u2
    public void T() {
        C(0).c();
    }

    @Override // com.onesignal.u2
    public void c0(String str) {
        F1.P1(str);
    }

    public String f0() {
        return F().i().g(IjkMediaMeta.IJKM_KEY_LANGUAGE, null);
    }

    public u2.e g0(boolean z9) {
        u2.e eVar;
        if (z9) {
            T1.f("players/" + F1.y0() + "?app_id=" + F1.n0(), new a(), "CACHE_KEY_GET_TAGS");
        }
        synchronized (this.f38872a) {
            eVar = new u2.e(f38813m, H.c(F().l(), "tags"));
        }
        return eVar;
    }

    public boolean h0() {
        return F().i().c("userSubscribePref", true);
    }

    public void i0(String str) {
        F1.u1(str);
    }

    public void j0(boolean z9) {
        try {
            G().s("androidPermission", Boolean.valueOf(z9));
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
    }

    public void k0(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("identifier", jSONObject.optString("identifier", null));
            if (jSONObject.has("device_type")) {
                jSONObject2.put("device_type", jSONObject.optInt("device_type"));
            }
            jSONObject2.putOpt("parent_player_id", jSONObject.optString("parent_player_id", null));
            G().h(jSONObject2, null);
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has("subscribableStatus")) {
                jSONObject3.put("subscribableStatus", jSONObject.optInt("subscribableStatus"));
            }
            if (jSONObject.has("androidPermission")) {
                jSONObject3.put("androidPermission", jSONObject.optBoolean("androidPermission"));
            }
            G().g(jSONObject3, null);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.onesignal.u2
    public void n(JSONObject jSONObject) {
    }

    @Override // com.onesignal.u2
    public void w(JSONObject jSONObject) {
        if (jSONObject.has("email")) {
            F1.G();
        }
        if (jSONObject.has("sms_number")) {
            F1.J();
        }
    }
}
