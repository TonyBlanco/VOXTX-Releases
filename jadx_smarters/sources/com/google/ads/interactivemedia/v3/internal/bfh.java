package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class bfh extends bea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ bfi f21187a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfh(bfi bfiVar, Class cls) {
        super(cls);
        this.f21187a = bfiVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ brs a(brs brsVar) throws GeneralSecurityException {
        bhh bhhVar = (bhh) brsVar;
        bif bifVarK = bhg.k();
        bifVarK.I();
        bifVarK.H(bhhVar.e());
        bifVarK.G(bpb.t(bjf.b(bhhVar.a())));
        return (bhg) bifVarK.aY();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ brs b(bpb bpbVar) throws bqw {
        return bhh.d(bpbVar, bqb.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        int i9 = bhf.f21346d;
        map.put("HMAC_SHA256_128BITTAG", bfi.m(32, 16, i9, 1));
        map.put("HMAC_SHA256_128BITTAG_RAW", bfi.m(32, 16, i9, 3));
        map.put("HMAC_SHA256_256BITTAG", bfi.m(32, 32, i9, 1));
        map.put("HMAC_SHA256_256BITTAG_RAW", bfi.m(32, 32, i9, 3));
        int i10 = bhf.f21347e;
        map.put("HMAC_SHA512_128BITTAG", bfi.m(64, 16, i10, 1));
        map.put("HMAC_SHA512_128BITTAG_RAW", bfi.m(64, 16, i10, 3));
        map.put("HMAC_SHA512_256BITTAG", bfi.m(64, 32, i10, 1));
        map.put("HMAC_SHA512_256BITTAG_RAW", bfi.m(64, 32, i10, 3));
        map.put("HMAC_SHA512_512BITTAG", bfi.m(64, 64, i10, 1));
        map.put("HMAC_SHA512_512BITTAG_RAW", bfi.m(64, 64, i10, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ void d(brs brsVar) throws GeneralSecurityException {
        bhh bhhVar = (bhh) brsVar;
        if (bhhVar.a() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        bfi.n(bhhVar.e());
    }
}
