package com.onesignal;

import com.onesignal.W1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class o2 extends t2 {
    public o2() {
        super(W1.c.EMAIL);
    }

    @Override // com.onesignal.t2, com.onesignal.u2
    public String A() {
        return F1.X();
    }

    @Override // com.onesignal.u2
    public m2 N(String str, boolean z9) {
        return new n2(str, z9);
    }

    @Override // com.onesignal.u2
    public void c0(String str) {
        F1.N1(str);
    }

    @Override // com.onesignal.t2
    public void e0() {
        F1.G();
    }

    @Override // com.onesignal.t2
    public void f0(JSONObject jSONObject) {
        F1.H();
    }

    @Override // com.onesignal.t2
    public String g0() {
        return "email_auth_hash";
    }

    @Override // com.onesignal.t2
    public String h0() {
        return "email";
    }

    @Override // com.onesignal.t2
    public int i0() {
        return 11;
    }

    public void k0(String str) {
        F1.s1(str);
    }
}
