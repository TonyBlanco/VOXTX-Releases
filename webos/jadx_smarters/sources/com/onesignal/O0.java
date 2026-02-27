package com.onesignal;

import com.onesignal.F1;

/* JADX INFO: loaded from: classes4.dex */
public class O0 implements P0 {
    @Override // com.onesignal.P0
    public void a(String str) {
        F1.a(F1.v.WARN, str);
    }

    @Override // com.onesignal.P0
    public void debug(String str) {
        F1.a(F1.v.DEBUG, str);
    }

    @Override // com.onesignal.P0
    public void error(String str) {
        F1.a(F1.v.ERROR, str);
    }

    @Override // com.onesignal.P0
    public void error(String str, Throwable th) {
        F1.b(F1.v.ERROR, str, th);
    }

    @Override // com.onesignal.P0
    public void info(String str) {
        F1.a(F1.v.INFO, str);
    }

    @Override // com.onesignal.P0
    public void verbose(String str) {
        F1.a(F1.v.VERBOSE, str);
    }
}
