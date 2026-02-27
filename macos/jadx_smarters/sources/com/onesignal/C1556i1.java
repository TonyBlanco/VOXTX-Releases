package com.onesignal;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1556i1 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1535b1 f38732a = new C1535b1("changed", false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f38733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f38734d;

    public C1556i1(boolean z9) {
        String strD;
        if (z9) {
            String str = R1.f38511a;
            this.f38733c = R1.f(str, "PREFS_OS_SMS_ID_LAST", null);
            strD = R1.f(str, "PREFS_OS_SMS_NUMBER_LAST", null);
        } else {
            this.f38733c = F1.l0();
            strD = W1.f().D();
        }
        this.f38734d = strD;
    }

    public C1535b1 b() {
        return this.f38732a;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean d() {
        return (this.f38733c == null || this.f38734d == null) ? false : true;
    }

    public void e() {
        String str = R1.f38511a;
        R1.m(str, "PREFS_OS_SMS_ID_LAST", this.f38733c);
        R1.m(str, "PREFS_OS_SMS_NUMBER_LAST", this.f38734d);
    }

    public void f(String str) {
        boolean z9 = true;
        String str2 = this.f38733c;
        if (str != null ? str.equals(str2) : str2 == null) {
            z9 = false;
        }
        this.f38733c = str;
        if (z9) {
            this.f38732a.c(this);
        }
    }

    public JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        try {
            Object obj = this.f38733c;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("smsUserId", obj);
            Object obj2 = this.f38734d;
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("smsNumber", obj2);
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
