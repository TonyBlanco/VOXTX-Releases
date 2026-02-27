package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class bbh extends bea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ bbi f21022a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbh(bbi bbiVar, Class cls) {
        super(cls);
        this.f21022a = bbiVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ brs a(brs brsVar) throws GeneralSecurityException {
        bif bifVarG = bgr.g();
        bifVarG.ae(bpb.t(bjf.b(((bgs) brsVar).a())));
        bifVarG.af();
        return (bgr) bifVarG.aY();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ brs b(bpb bpbVar) throws bqw {
        return bgs.c(bpbVar, bqb.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_GCM_SIV", bbi.g(16, 1));
        map.put("AES128_GCM_SIV_RAW", bbi.g(16, 3));
        map.put("AES256_GCM_SIV", bbi.g(32, 1));
        map.put("AES256_GCM_SIV_RAW", bbi.g(32, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ void d(brs brsVar) throws GeneralSecurityException {
        bjg.a(((bgs) brsVar).a());
    }
}
