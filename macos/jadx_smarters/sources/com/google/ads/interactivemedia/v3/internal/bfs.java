package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class bfs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final bie f21222a;

    static {
        new bfi();
        f21222a = bie.b();
        try {
            a();
        } catch (GeneralSecurityException e9) {
            throw new ExceptionInInitializerError(e9);
        }
    }

    public static void a() throws GeneralSecurityException {
        bao.l(new bfv());
        bao.o(new bfi());
        bfr.a();
        if (bci.b()) {
            return;
        }
        bao.o(new bfa());
        bfd.a();
    }
}
