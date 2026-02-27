package com.onesignal;

/* JADX INFO: loaded from: classes4.dex */
class OSPermissionChangedInternalObserver {
    public static void a(C1544e1 c1544e1) {
        if (F1.g0().c(new C1547f1(F1.f38264W, (C1544e1) c1544e1.clone()))) {
            C1544e1 c1544e12 = (C1544e1) c1544e1.clone();
            F1.f38264W = c1544e12;
            c1544e12.e();
        }
    }

    public static void b(C1544e1 c1544e1) {
        if (!c1544e1.b()) {
            AbstractC1563l.d(0, F1.f38270b);
        }
        W1.t(F1.z());
    }

    public void changed(C1544e1 c1544e1) {
        b(c1544e1);
        a(c1544e1);
    }
}
