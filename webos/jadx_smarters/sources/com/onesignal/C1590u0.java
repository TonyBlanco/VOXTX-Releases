package com.onesignal;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1590u0 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1535b1 f38869a = new C1535b1("changed", false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f38870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f38871d;

    public C1590u0(boolean z9) {
        String strD;
        if (z9) {
            String str = R1.f38511a;
            this.f38870c = R1.f(str, "PREFS_ONESIGNAL_EMAIL_ID_LAST", null);
            strD = R1.f(str, "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST", null);
        } else {
            this.f38870c = F1.X();
            strD = W1.b().D();
        }
        this.f38871d = strD;
    }

    public C1535b1 b() {
        return this.f38869a;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean d() {
        return (this.f38870c == null || this.f38871d == null) ? false : true;
    }

    public void e() {
        String str = R1.f38511a;
        R1.m(str, "PREFS_ONESIGNAL_EMAIL_ID_LAST", this.f38870c);
        R1.m(str, "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST", this.f38871d);
    }

    public void f(String str) {
        boolean z9 = true;
        String str2 = this.f38870c;
        if (str != null ? str.equals(str2) : str2 == null) {
            z9 = false;
        }
        this.f38870c = str;
        if (z9) {
            this.f38869a.c(this);
        }
    }

    public JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        try {
            Object obj = this.f38870c;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("emailUserId", obj);
            Object obj2 = this.f38871d;
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("emailAddress", obj2);
            jSONObject.put("isSubscribed", d());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return g().toString();
    }
}
