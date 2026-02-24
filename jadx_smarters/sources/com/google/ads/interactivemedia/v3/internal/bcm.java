package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class bcm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f21055a;

    static {
        new bcl();
        f21055a = "type.googleapis.com/google.crypto.tink.AesSivKey";
        int i9 = bie.f21485a;
        try {
            bao.l(new bco());
            if (bci.b()) {
                return;
            }
            bao.o(new bcl());
        } catch (GeneralSecurityException e9) {
            throw new ExceptionInInitializerError(e9);
        }
    }
}
