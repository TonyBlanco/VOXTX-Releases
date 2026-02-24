package com.onesignal;

/* JADX INFO: loaded from: classes4.dex */
class OSSubscriptionChangedInternalObserver {
    public static void a(OSSubscriptionState oSSubscriptionState) {
        if (F1.t0().c(new C1571n1(F1.f38267Z, (OSSubscriptionState) oSSubscriptionState.clone()))) {
            OSSubscriptionState oSSubscriptionState2 = (OSSubscriptionState) oSSubscriptionState.clone();
            F1.f38267Z = oSSubscriptionState2;
            oSSubscriptionState2.f();
        }
    }

    public void changed(OSSubscriptionState oSSubscriptionState) {
        a(oSSubscriptionState);
    }
}
