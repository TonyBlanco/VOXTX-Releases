package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class OSSubscriptionState implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1535b1 f38427a = new C1535b1("changed", false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f38428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f38429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f38430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f38431f;

    public OSSubscriptionState(boolean z9, boolean z10) {
        if (!z9) {
            this.f38431f = !W1.j();
            this.f38428c = F1.y0();
            this.f38429d = W1.e();
            this.f38430e = z10;
            return;
        }
        String str = R1.f38511a;
        this.f38431f = R1.b(str, "ONESIGNAL_SUBSCRIPTION_LAST", true);
        this.f38428c = R1.f(str, "ONESIGNAL_PLAYER_ID_LAST", null);
        this.f38429d = R1.f(str, "ONESIGNAL_PUSH_TOKEN_LAST", null);
        this.f38430e = R1.b(str, "ONESIGNAL_PERMISSION_ACCEPTED_LAST", false);
    }

    public C1535b1 b() {
        return this.f38427a;
    }

    public void changed(C1544e1 c1544e1) {
        g(c1544e1.b());
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public boolean d() {
        return this.f38431f;
    }

    public boolean e() {
        return (this.f38428c == null || this.f38429d == null || this.f38431f || !this.f38430e) ? false : true;
    }

    public void f() {
        String str = R1.f38511a;
        R1.j(str, "ONESIGNAL_SUBSCRIPTION_LAST", this.f38431f);
        R1.m(str, "ONESIGNAL_PLAYER_ID_LAST", this.f38428c);
        R1.m(str, "ONESIGNAL_PUSH_TOKEN_LAST", this.f38429d);
        R1.j(str, "ONESIGNAL_PERMISSION_ACCEPTED_LAST", this.f38430e);
    }

    public final void g(boolean z9) {
        boolean zE = e();
        this.f38430e = z9;
        if (zE != e()) {
            this.f38427a.c(this);
        }
    }

    public void h(String str) {
        if (str == null) {
            return;
        }
        boolean z9 = !str.equals(this.f38429d);
        this.f38429d = str;
        if (z9) {
            this.f38427a.c(this);
        }
    }

    public void i(String str) {
        boolean z9 = true;
        String str2 = this.f38428c;
        if (str != null ? str.equals(str2) : str2 == null) {
            z9 = false;
        }
        this.f38428c = str;
        if (z9) {
            this.f38427a.c(this);
        }
    }

    public JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        try {
            Object obj = this.f38428c;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("userId", obj);
            Object obj2 = this.f38429d;
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("pushToken", obj2);
            jSONObject.put("isPushDisabled", d());
            jSONObject.put("isSubscribed", e());
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return j().toString();
    }
}
