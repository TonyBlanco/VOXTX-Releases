package com.google.ads.interactivemedia.v3.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
public final class bjf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f21555a = new bje();

    public static /* bridge */ /* synthetic */ SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] b(int i9) {
        byte[] bArr = new byte[i9];
        ((SecureRandom) f21555a.get()).nextBytes(bArr);
        return bArr;
    }
}
