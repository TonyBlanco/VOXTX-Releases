package com.onesignal;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1544e1 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1535b1 f38712a = new C1535b1("changed", false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f38713c;

    public C1544e1(boolean z9) {
        if (z9) {
            this.f38713c = R1.b(R1.f38511a, "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", false);
        } else {
            f();
        }
    }

    public boolean b() {
        return this.f38713c;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    public C1535b1 d() {
        return this.f38712a;
    }

    public void e() {
        R1.j(R1.f38511a, "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", this.f38713c);
    }

    public void f() {
        g(OSUtils.a(F1.f38270b));
    }

    public final void g(boolean z9) {
        boolean z10 = this.f38713c != z9;
        this.f38713c = z9;
        if (z10) {
            this.f38712a.c(this);
        }
    }

    public JSONObject h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("areNotificationsEnabled", this.f38713c);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return h().toString();
    }
}
