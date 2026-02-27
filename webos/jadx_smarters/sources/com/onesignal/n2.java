package com.onesignal;

/* JADX INFO: loaded from: classes4.dex */
public class n2 extends m2 {
    public n2(String str, boolean z9) {
        super("email" + str, z9);
    }

    @Override // com.onesignal.m2
    public void a() {
    }

    @Override // com.onesignal.m2
    public m2 p(String str) {
        return new n2(str, false);
    }
}
