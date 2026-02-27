package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class bdw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ bdv f21119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bjj f21120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f21121c;

    public /* synthetic */ bdw(bjj bjjVar, Class cls) {
        this.f21120b = bjjVar;
        this.f21121c = cls;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bdw(bjj bjjVar, Class cls, bdv bdvVar) {
        this(bjjVar, cls);
        this.f21119a = bdvVar;
    }

    public static bdw a(bdv bdvVar, bjj bjjVar, Class cls) {
        return new bdw(bjjVar, cls, bdvVar);
    }

    public final bjj b() {
        return this.f21120b;
    }

    public final Class c() {
        return this.f21121c;
    }

    public final azu d(bes besVar, bap bapVar) throws GeneralSecurityException {
        return this.f21119a.a(besVar, bapVar);
    }
}
