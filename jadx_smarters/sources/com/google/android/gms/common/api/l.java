package com.google.android.gms.common.api;

import w4.C2916d;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends UnsupportedOperationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2916d f26746a;

    public l(C2916d c2916d) {
        this.f26746a = c2916d;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f26746a));
    }
}
