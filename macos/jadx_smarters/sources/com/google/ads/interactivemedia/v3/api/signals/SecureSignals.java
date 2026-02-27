package com.google.ads.interactivemedia.v3.api.signals;

import com.google.android.gms.common.internal.Hide;

/* JADX INFO: loaded from: classes3.dex */
@Hide
public final class SecureSignals {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18609a;

    private SecureSignals(String str) {
        this.f18609a = str;
    }

    public static SecureSignals create(String str) {
        return new SecureSignals(str);
    }

    public String getSecureSignal() {
        return this.f18609a;
    }
}
