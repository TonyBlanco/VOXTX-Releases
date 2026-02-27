package com.onesignal;

import com.onesignal.F1;
import com.onesignal.W1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t2 extends u2 {
    public t2(W1.c cVar) {
        super(cVar);
    }

    @Override // com.onesignal.u2
    public abstract String A();

    @Override // com.onesignal.u2
    public F1.v B() {
        return F1.v.INFO;
    }

    @Override // com.onesignal.u2
    public void O(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(h0(), jSONObject.get("identifier"));
                if (jSONObject.has(g0())) {
                    jSONObject2.put(g0(), jSONObject.get(g0()));
                }
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
            f0(jSONObject2);
        }
    }

    @Override // com.onesignal.u2
    public void T() {
        if ((A() == null && D() == null) || F1.y0() == null) {
            return;
        }
        C(0).c();
    }

    public abstract void e0();

    public abstract void f0(JSONObject jSONObject);

    public abstract String g0();

    public abstract String h0();

    public abstract int i0();

    public void j0() {
        T();
    }

    @Override // com.onesignal.u2
    public void n(JSONObject jSONObject) {
        try {
            jSONObject.put("device_type", i0());
            jSONObject.putOpt("device_player_id", F1.y0());
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
    }

    @Override // com.onesignal.u2
    public void w(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            e0();
        }
    }
}
