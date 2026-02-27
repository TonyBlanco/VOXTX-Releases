package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class bar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f21014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f21015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final bie f21016c;

    static {
        new baw();
        f21014a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new bbf();
        f21015b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new bbi();
        new bbc();
        new bbo();
        new bbs();
        new bbl();
        new bbv();
        f21016c = bie.b();
        try {
            a();
        } catch (GeneralSecurityException e9) {
            throw new ExceptionInInitializerError(e9);
        }
    }

    public static void a() throws GeneralSecurityException {
        bao.l(new bat());
        bfs.a();
        bao.o(new baw());
        bao.o(new bbf());
        if (bci.b()) {
            return;
        }
        bao.o(new bbc());
        bbi.h();
        bao.o(new bbl());
        bao.o(new bbo());
        bao.o(new bbs());
        bao.o(new bbv());
    }
}
