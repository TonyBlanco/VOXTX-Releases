package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class bcq extends bea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ bcr f21057a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcq(bcr bcrVar, Class cls) {
        super(cls);
        this.f21057a = bcrVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ brs a(brs brsVar) throws GeneralSecurityException {
        bgz bgzVar = (bgz) brsVar;
        KeyPair keyPairP = bjh.p(bda.c(bgzVar.c().d().e()));
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairP.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairP.getPrivate();
        ECPoint w9 = eCPublicKey.getW();
        bif bifVarM = bhc.m();
        bifVarM.N();
        bifVarM.M(bgzVar.c());
        bifVarM.O(bpb.t(w9.getAffineX().toByteArray()));
        bifVarM.P(bpb.t(w9.getAffineY().toByteArray()));
        bhc bhcVar = (bhc) bifVarM.aY();
        bif bifVarJ = bhb.j();
        bifVarJ.S();
        bifVarJ.R(bhcVar);
        bifVarJ.Q(bpb.t(eCPrivateKey.getS().toByteArray()));
        return (bhb) bifVarJ.aY();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ brs b(bpb bpbVar) throws bqw {
        return bgz.b(bpbVar, bqb.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        int i9 = bhe.f21337b;
        int i10 = bhf.f21346d;
        int i11 = bgx.f21294b;
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", bcr.h(i9, i10, i11, ban.a("AES128_GCM"), bcr.f21058a, 1));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", bcr.h(i9, i10, i11, ban.a("AES128_GCM"), bcr.f21058a, 3));
        int i12 = bgx.f21295c;
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", bcr.h(i9, i10, i12, ban.a("AES128_GCM"), bcr.f21058a, 1));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", bcr.h(i9, i10, i12, ban.a("AES128_GCM"), bcr.f21058a, 3));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", bcr.h(i9, i10, i12, ban.a("AES128_GCM"), bcr.f21058a, 3));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", bcr.h(i9, i10, i11, ban.a("AES128_CTR_HMAC_SHA256"), bcr.f21058a, 1));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", bcr.h(i9, i10, i11, ban.a("AES128_CTR_HMAC_SHA256"), bcr.f21058a, 3));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", bcr.h(i9, i10, i12, ban.a("AES128_CTR_HMAC_SHA256"), bcr.f21058a, 1));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", bcr.h(i9, i10, i12, ban.a("AES128_CTR_HMAC_SHA256"), bcr.f21058a, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ void d(brs brsVar) throws GeneralSecurityException {
        bda.a(((bgz) brsVar).c());
    }
}
