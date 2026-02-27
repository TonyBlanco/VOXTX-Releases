package com.onesignal;

import com.onesignal.F1;

/* JADX INFO: loaded from: classes4.dex */
public class K0 extends I0 {
    public static /* synthetic */ void f(F1.x xVar, boolean z9) {
        xVar.a(z9 ? F1.z.PERMISSION_GRANTED : F1.z.PERMISSION_DENIED);
    }

    @Override // com.onesignal.I0
    public String a() {
        return "push";
    }

    @Override // com.onesignal.I0
    public void b(final F1.x xVar) {
        F1.e1(true, new F1.A() { // from class: com.onesignal.J0
            @Override // com.onesignal.F1.A
            public final void a(boolean z9) {
                K0.f(xVar, z9);
            }
        });
    }
}
