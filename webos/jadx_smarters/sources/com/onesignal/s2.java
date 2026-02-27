package com.onesignal;

import com.onesignal.W1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class s2 extends t2 {
    public s2() {
        super(W1.c.SMS);
    }

    @Override // com.onesignal.t2, com.onesignal.u2
    public String A() {
        return F1.l0();
    }

    @Override // com.onesignal.u2
    public m2 N(String str, boolean z9) {
        return new r2(str, z9);
    }

    @Override // com.onesignal.u2
    public void c0(String str) {
        F1.O1(str);
    }

    @Override // com.onesignal.t2
    public void e0() {
        F1.J();
    }

    @Override // com.onesignal.t2
    public void f0(JSONObject jSONObject) {
        F1.K(jSONObject);
    }

    @Override // com.onesignal.t2
    public String g0() {
        return "sms_auth_hash";
    }

    @Override // com.onesignal.t2
    public String h0() {
        return "sms_number";
    }

    @Override // com.onesignal.t2
    public int i0() {
        return 14;
    }

    public void k0(String str) {
        F1.t1(str);
    }
}
