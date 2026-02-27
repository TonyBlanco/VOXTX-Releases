package com.onesignal;

import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public class p2 extends m2 {
    public p2(String str, boolean z9) {
        super(str, z9);
    }

    public final int A() {
        int iD = i().d("subscribableStatus", 1);
        if (iD < -2) {
            return iD;
        }
        if (i().c("androidPermission", true)) {
            return !i().c("userSubscribePref", true) ? -2 : 1;
        }
        return 0;
    }

    @Override // com.onesignal.m2
    public void a() {
        try {
            t("notification_types", Integer.valueOf(A()));
        } catch (JSONException unused) {
        }
    }

    @Override // com.onesignal.m2
    public m2 p(String str) {
        return new p2(str, false);
    }
}
