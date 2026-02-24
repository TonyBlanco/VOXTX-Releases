package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class bbe extends bea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ bbf f21021a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbe(bbf bbfVar, Class cls) {
        super(cls);
        this.f21021a = bbfVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ brs a(brs brsVar) throws GeneralSecurityException {
        bif bifVarG = bgp.g();
        bifVarG.ah(bpb.t(bjf.b(((bgq) brsVar).a())));
        bifVarG.ai();
        return (bgp) bifVarG.aY();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ brs b(bpb bpbVar) throws bqw {
        return bgq.c(bpbVar, bqb.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_GCM", bbf.g(16, 1));
        map.put("AES128_GCM_RAW", bbf.g(16, 3));
        map.put("AES256_GCM", bbf.g(32, 1));
        map.put("AES256_GCM_RAW", bbf.g(32, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ void d(brs brsVar) throws GeneralSecurityException {
        bjg.a(((bgq) brsVar).a());
    }
}
