package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class bad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bhw f20988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bfx f20989b = bfx.f21226a;

    private bad(bhw bhwVar) {
        this.f20988a = bhwVar;
    }

    public static final bad a(bhw bhwVar) throws GeneralSecurityException {
        if (bhwVar == null || bhwVar.a() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new bad(bhwVar);
    }

    public final Object b(Class cls) throws GeneralSecurityException {
        Class clsD = bao.d(cls);
        if (clsD == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        baq.b(this.f20988a);
        bai baiVar = new bai(clsD);
        baiVar.d(this.f20989b);
        for (bhv bhvVar : this.f20988a.e()) {
            if (bhvVar.f() == bhs.f21408b) {
                Object objE = bao.e(bhvVar.b(), clsD);
                if (bhvVar.a() == this.f20988a.b()) {
                    baiVar.b(objE, bhvVar);
                } else {
                    baiVar.c(objE, bhvVar);
                }
            }
        }
        return bao.i(baiVar.a(), cls);
    }

    public final String toString() {
        return baq.a(this.f20988a).toString();
    }
}
