package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class bdn extends bea {
    public bdn(Class cls) {
        super(cls);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ brs a(brs brsVar) throws GeneralSecurityException {
        byte[] bArrB;
        byte[] bArrC;
        bhm bhmVar = (bhm) brsVar;
        int i9 = bhl.f21374a;
        int iE = bhmVar.c().e();
        int i10 = iE - 2;
        if (iE == 0) {
            throw null;
        }
        if (i10 == 1) {
            bArrB = bjh.b();
            bArrC = bjh.c(bArrB);
        } else {
            if (i10 != 2 && i10 != 3 && i10 != 4) {
                throw new GeneralSecurityException("Invalid KEM");
            }
            int iG = bdr.g(bhmVar.c().e());
            KeyPair keyPairP = bjh.p(iG);
            bArrC = bjh.u(iG, 1, ((ECPublicKey) keyPairP.getPublic()).getW());
            bArrB = ((ECPrivateKey) keyPairP.getPrivate()).getS().toByteArray();
        }
        bif bifVarL = bhp.l();
        bifVarL.u();
        bifVarL.s(bhmVar.c());
        bifVarL.t(bpb.t(bArrC));
        bhp bhpVar = (bhp) bifVarL.aY();
        bif bifVarK = bho.k();
        bifVarK.x();
        bifVarK.w(bhpVar);
        bifVarK.v(bpb.t(bArrB));
        return (bho) bifVarK.aY();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ brs b(bpb bpbVar) throws bqw {
        return bhm.b(bpbVar, bqb.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final Map c() {
        HashMap map = new HashMap();
        int i9 = bhl.f21375b;
        int i10 = bhk.f21369b;
        int i11 = bhj.f21363b;
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", bdo.g(i9, i10, i11, 1));
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", bdo.g(i9, i10, i11, 3));
        int i12 = bhj.f21364c;
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", bdo.g(i9, i10, i12, 1));
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", bdo.g(i9, i10, i12, 3));
        int i13 = bhj.f21365d;
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", bdo.g(i9, i10, i13, 1));
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", bdo.g(i9, i10, i13, 3));
        int i14 = bhl.f21376c;
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", bdo.g(i14, i10, i11, 1));
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", bdo.g(i14, i10, i11, 3));
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", bdo.g(i14, i10, i12, 1));
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", bdo.g(i14, i10, i12, 3));
        int i15 = bhl.f21377d;
        int i16 = bhk.f21370c;
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", bdo.g(i15, i16, i11, 1));
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", bdo.g(i15, i16, i11, 3));
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", bdo.g(i15, i16, i12, 1));
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", bdo.g(i15, i16, i12, 3));
        int i17 = bhl.f21378e;
        int i18 = bhk.f21371d;
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", bdo.g(i17, i18, i11, 1));
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", bdo.g(i17, i18, i11, 3));
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", bdo.g(i17, i18, i12, 1));
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", bdo.g(i17, i18, i12, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ void d(brs brsVar) throws GeneralSecurityException {
        bdr.a(((bhm) brsVar).c());
    }
}
