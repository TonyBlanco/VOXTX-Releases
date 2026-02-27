package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class bbk extends bea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ bbl f21023a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbk(bbl bblVar, Class cls) {
        super(cls);
        this.f21023a = bblVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ brs a(brs brsVar) throws GeneralSecurityException {
        bif bifVarG = bgv.g();
        bifVarG.Z();
        bifVarG.Y(bpb.t(bjf.b(32)));
        return (bgv) bifVarG.aY();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ brs b(bpb bpbVar) throws bqw {
        return bgw.c(bpbVar, bqb.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", new bdz(bgw.b(), 1));
        map.put("CHACHA20_POLY1305_RAW", new bdz(bgw.b(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ void d(brs brsVar) throws GeneralSecurityException {
    }
}
