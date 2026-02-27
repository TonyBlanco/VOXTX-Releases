package com.onesignal;

import com.onesignal.S1;

/* JADX INFO: renamed from: com.onesignal.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1553h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S1.f f38731a = null;

    public void a() {
        this.f38731a = null;
    }

    public boolean b() {
        return R1.b(R1.f38511a, "OS_CLEAR_GROUP_SUMMARY_CLICK", true);
    }

    public boolean c() {
        return R1.b(R1.f38511a, "GT_FIREBASE_TRACKING_ENABLED", false);
    }

    public S1.f d() {
        return this.f38731a;
    }

    public boolean e() {
        return R1.b(R1.f38511a, "ONESIGNAL_USER_PROVIDED_CONSENT", false);
    }

    public boolean f() {
        S1.f fVar = this.f38731a;
        return (fVar == null || fVar.f38551m == null) ? false : true;
    }

    public boolean g() {
        return R1.b(R1.f38511a, "PREFS_OS_DISABLE_GMS_MISSING_PROMPT", false);
    }

    public boolean h() {
        return R1.b(R1.f38511a, "PREFS_OS_LOCATION_SHARED", true);
    }

    public boolean i() {
        return R1.b(R1.f38511a, "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT", false);
    }

    public boolean j() {
        return R1.b(R1.f38511a, "PREFS_OS_RECEIVE_RECEIPTS_ENABLED", false);
    }

    public boolean k() {
        return this.f38731a != null;
    }

    public boolean l() {
        return R1.b(R1.f38511a, "OS_RESTORE_TTL_FILTER", true);
    }

    public void m(boolean z9) {
        R1.j(R1.f38511a, "PREFS_OS_DISABLE_GMS_MISSING_PROMPT", z9);
    }

    public void n(boolean z9) {
        R1.j(R1.f38511a, "PREFS_OS_LOCATION_SHARED", z9);
    }

    public void o(boolean z9) {
        R1.j(R1.f38511a, "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT", z9);
    }

    public final void p(boolean z9) {
        R1.j(R1.f38511a, "PREFS_OS_RECEIVE_RECEIPTS_ENABLED", z9);
    }

    public void q(S1.f fVar, O7.e eVar, InterfaceC1565l1 interfaceC1565l1, P0 p02) {
        this.f38731a = fVar;
        String str = R1.f38511a;
        R1.j(str, "GT_FIREBASE_TRACKING_ENABLED", fVar.f38544f);
        r(fVar.f38545g);
        R1.j(str, "OS_CLEAR_GROUP_SUMMARY_CLICK", fVar.f38546h);
        R1.j(str, interfaceC1565l1.j(), fVar.f38552n.f38538h);
        p(fVar.f38547i);
        p02.debug("OneSignal saveInfluenceParams: " + fVar.f38552n.toString());
        eVar.j(fVar.f38552n);
        Boolean bool = fVar.f38548j;
        if (bool != null) {
            m(bool.booleanValue());
        }
        Boolean bool2 = fVar.f38549k;
        if (bool2 != null) {
            s(bool2.booleanValue());
        }
        Boolean bool3 = fVar.f38550l;
        if (bool3 != null) {
            F1.K1(bool3.booleanValue());
        }
        Boolean bool4 = fVar.f38551m;
        if (bool4 != null) {
            o(bool4.booleanValue());
        }
    }

    public final void r(boolean z9) {
        R1.j(R1.f38511a, "OS_RESTORE_TTL_FILTER", this.f38731a.f38545g);
    }

    public void s(boolean z9) {
        R1.j(R1.f38511a, "PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED", z9);
    }

    public boolean t() {
        return R1.b(R1.f38511a, "PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED", true);
    }
}
