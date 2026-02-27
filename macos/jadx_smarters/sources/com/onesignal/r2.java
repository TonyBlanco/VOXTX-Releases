package com.onesignal;

/* JADX INFO: loaded from: classes4.dex */
public class r2 extends m2 {
    public r2(String str, boolean z9) {
        super("sms" + str, z9);
    }

    @Override // com.onesignal.m2
    public void a() {
    }

    @Override // com.onesignal.m2
    public m2 p(String str) {
        return new r2(str, false);
    }
}
