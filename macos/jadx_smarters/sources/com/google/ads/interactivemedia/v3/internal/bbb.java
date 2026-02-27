package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class bbb extends bea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ bbc f21020a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbb(bbc bbcVar, Class cls) {
        super(cls);
        this.f21020a = bbcVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ brs a(brs brsVar) throws GeneralSecurityException {
        bgn bgnVar = (bgn) brsVar;
        bif bifVarJ = bgm.j();
        bifVarJ.am(bpb.t(bjf.b(bgnVar.a())));
        bifVarJ.an(bgnVar.d());
        bifVarJ.ao();
        return (bgm) bifVarJ.aY();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ brs b(bpb bpbVar) throws bqw {
        return bgn.c(bpbVar, bqb.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_EAX", bbc.g(16, 1));
        map.put("AES128_EAX_RAW", bbc.g(16, 3));
        map.put("AES256_EAX", bbc.g(32, 1));
        map.put("AES256_EAX_RAW", bbc.g(32, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ void d(brs brsVar) throws GeneralSecurityException {
        bgn bgnVar = (bgn) brsVar;
        bjg.a(bgnVar.a());
        if (bgnVar.d().a() != 12 && bgnVar.d().a() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
