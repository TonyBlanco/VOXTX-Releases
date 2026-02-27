package com.google.ads.interactivemedia.v3.internal;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class baq {
    static {
        Charset.forName("UTF-8");
    }

    public static bhy a(bhw bhwVar) {
        bif bifVarD = bhy.d();
        bifVarD.l(bhwVar.b());
        for (bhv bhvVar : bhwVar.e()) {
            bif bifVarF = bhx.f();
            bifVarF.i(bhvVar.b().e());
            bifVarF.j(bhvVar.f());
            bifVarF.h(bhvVar.d());
            bifVarF.g(bhvVar.a());
            bifVarD.k((bhx) bifVarF.aY());
        }
        return (bhy) bifVarD.aY();
    }

    public static void b(bhw bhwVar) throws GeneralSecurityException {
        int iB = bhwVar.b();
        int i9 = 0;
        boolean z9 = false;
        boolean z10 = true;
        for (bhv bhvVar : bhwVar.e()) {
            if (bhvVar.f() == bhs.f21408b) {
                if (!bhvVar.e()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(bhvVar.a())));
                }
                if (bhvVar.d() == bid.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(bhvVar.a())));
                }
                if (bhvVar.f() == bhs.f21407a) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(bhvVar.a())));
                }
                if (bhvVar.a() == iB) {
                    if (z9) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z9 = true;
                }
                z10 &= bhvVar.b().a() == bhq.ASYMMETRIC_PUBLIC;
                i9++;
            }
        }
        if (i9 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z9 && !z10) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
