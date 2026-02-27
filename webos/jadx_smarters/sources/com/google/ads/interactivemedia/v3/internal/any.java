package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class any {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static azt f20386a;

    public static void a(anw anwVar) throws IllegalAccessException, GeneralSecurityException, InvocationTargetException {
        Method methodI;
        if (f20386a != null) {
            return;
        }
        String str = (String) aqo.f20545t.f();
        if (str == null || str.length() == 0) {
            str = null;
            if (anwVar != null && (methodI = anwVar.i("JUzcgAa7QiZMDmYjeHwtF22qOBbojTFP/5L28xsdeCx9uYvsAo6FDNhapuA6bStH", "U55JZyt+fru+djXeCzNGPL143KELIHwp5RNEO07WiP4=")) != null) {
                str = (String) methodI.invoke(null, null);
            }
            if (str == null) {
                return;
            }
        }
        try {
            bad badVarA = bah.a(com.google.ads.interactivemedia.v3.impl.data.aq.b(str, true));
            for (bhu bhuVar : bcu.f21059a.c()) {
                if (bhuVar.e().isEmpty()) {
                    throw new GeneralSecurityException("Missing type_url.");
                }
                if (bhuVar.d().isEmpty()) {
                    throw new GeneralSecurityException("Missing primitive_name.");
                }
                if (bhuVar.c().isEmpty()) {
                    throw new GeneralSecurityException("Missing catalogue_name.");
                }
                if (!bhuVar.c().equals("TinkAead") && !bhuVar.c().equals("TinkMac") && !bhuVar.c().equals("TinkHybridDecrypt") && !bhuVar.c().equals("TinkHybridEncrypt") && !bhuVar.c().equals("TinkPublicKeySign") && !bhuVar.c().equals("TinkPublicKeyVerify") && !bhuVar.c().equals("TinkStreamingAead") && !bhuVar.c().equals("TinkDeterministicAead")) {
                    azp azpVarA = bao.a(bhuVar.c());
                    bao.l(azpVarA.a());
                    bhuVar.e();
                    bhuVar.d();
                    bhuVar.a();
                    bao.k(azpVarA.b(), bhuVar.f());
                }
            }
            f20386a = bcx.a(badVarA);
        } catch (IllegalArgumentException | GeneralSecurityException unused) {
        }
    }
}
