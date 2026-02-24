package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class bez extends bea {
    public bez(Class cls) {
        super(cls);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ brs a(brs brsVar) throws GeneralSecurityException {
        bgf bgfVar = (bgf) brsVar;
        bif bifVarJ = bge.j();
        bifVarJ.aF();
        bifVarJ.aD(bpb.t(bjf.b(bgfVar.a())));
        bifVarJ.aE(bgfVar.d());
        return (bge) bifVarJ.aY();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ brs b(bpb bpbVar) throws bqw {
        return bgf.c(bpbVar, bqb.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        bif bifVarG = bgf.g();
        bifVarG.aB();
        bif bifVarE = bgg.e();
        bifVarE.aA();
        bifVarG.aC((bgg) bifVarE.aY());
        map.put("AES_CMAC", new bdz((bgf) bifVarG.aY(), 1));
        bif bifVarG2 = bgf.g();
        bifVarG2.aB();
        bif bifVarE2 = bgg.e();
        bifVarE2.aA();
        bifVarG2.aC((bgg) bifVarE2.aY());
        map.put("AES256_CMAC", new bdz((bgf) bifVarG2.aY(), 1));
        bif bifVarG3 = bgf.g();
        bifVarG3.aB();
        bif bifVarE3 = bgg.e();
        bifVarE3.aA();
        bifVarG3.aC((bgg) bifVarE3.aY());
        map.put("AES256_CMAC_RAW", new bdz((bgf) bifVarG3.aY(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ void d(brs brsVar) throws GeneralSecurityException {
        bgf bgfVar = (bgf) brsVar;
        bfa.m(bgfVar.d());
        bfa.n(bgfVar.a());
    }
}
