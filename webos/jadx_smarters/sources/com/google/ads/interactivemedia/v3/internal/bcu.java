package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class bcu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final bie f21059a;

    static {
        new bct();
        new bcr();
        f21059a = bie.b();
        try {
            a();
        } catch (GeneralSecurityException e9) {
            throw new ExceptionInInitializerError(e9);
        }
    }

    public static void a() throws GeneralSecurityException {
        bao.l(new bcw());
        bao.l(new bcz());
        bar.a();
        if (bci.b()) {
            return;
        }
        bao.n(new bcr(), new bct());
        bao.n(new bdo(), new bdq());
    }
}
