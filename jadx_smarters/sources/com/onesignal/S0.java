package com.onesignal;

import android.content.Context;
import com.onesignal.F1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V0 f38519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f38520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f38521c;

    public S0(Context context, Q0 q02, JSONObject jSONObject, boolean z9, boolean z10, Long l9) {
        this.f38520b = z9;
        this.f38521c = z10;
        this.f38519a = a(context, q02, jSONObject, l9);
    }

    public S0(V0 v02, boolean z9, boolean z10) {
        this.f38520b = z9;
        this.f38521c = z10;
        this.f38519a = v02;
    }

    public static void h(Context context) {
        String strF = OSUtils.f(context, "com.onesignal.NotificationServiceExtension");
        if (strF == null) {
            F1.c1(F1.v.VERBOSE, "No class found, not setting up OSRemoteNotificationReceivedHandler");
            return;
        }
        F1.c1(F1.v.VERBOSE, "Found class: " + strF + ", attempting to call constructor");
        try {
            Class.forName(strF).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e9) {
            e9.printStackTrace();
        }
    }

    public final V0 a(Context context, Q0 q02, JSONObject jSONObject, Long l9) {
        V0 v02 = new V0(context);
        v02.q(jSONObject);
        v02.z(l9);
        v02.y(this.f38520b);
        v02.r(q02);
        return v02;
    }

    public V0 b() {
        return this.f38519a;
    }

    public C1532a1 c() {
        return new C1532a1(this, this.f38519a.f());
    }

    public boolean d() {
        if (F1.j0().l()) {
            return this.f38519a.f().h() + ((long) this.f38519a.f().l()) > F1.v0().a() / 1000;
        }
        return true;
    }

    public final void e(Q0 q02) {
        this.f38519a.r(q02);
        if (this.f38520b) {
            T.e(this.f38519a);
            return;
        }
        this.f38519a.p(false);
        T.n(this.f38519a, true, false);
        F1.E0(this.f38519a);
    }

    public void f(Q0 q02, Q0 q03) {
        if (q03 == null) {
            e(q02);
            return;
        }
        boolean zI = OSUtils.I(q03.e());
        boolean zD = d();
        if (zI && zD) {
            this.f38519a.r(q03);
            T.k(this, this.f38521c);
        } else {
            e(q02);
        }
        if (this.f38520b) {
            OSUtils.V(100);
        }
    }

    public void g(boolean z9) {
        this.f38521c = z9;
    }

    public String toString() {
        return "OSNotificationController{notificationJob=" + this.f38519a + ", isRestoring=" + this.f38520b + ", isBackgroundLogic=" + this.f38521c + '}';
    }
}
