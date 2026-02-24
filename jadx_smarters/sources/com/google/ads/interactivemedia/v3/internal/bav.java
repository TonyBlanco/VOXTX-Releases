package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class bav extends bea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ baw f21018a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bav(baw bawVar, Class cls) {
        super(cls);
        this.f21018a = bawVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ brs a(brs brsVar) throws GeneralSecurityException {
        bgi bgiVar = (bgi) brsVar;
        brs brsVarA = new baz().a().a(bgiVar.c());
        brs brsVarA2 = new bfi().a().a(bgiVar.d());
        bif bifVarJ = bgh.j();
        bifVarJ.ax((bgj) brsVarA);
        bifVarJ.ay((bhg) brsVarA2);
        bifVarJ.az(0);
        return (bgh) bifVarJ.aY();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ brs b(bpb bpbVar) throws bqw {
        return bgi.b(bpbVar, bqb.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        int i9 = bhf.f21346d;
        map.put("AES128_CTR_HMAC_SHA256", baw.g(16, 16, i9, 1));
        map.put("AES128_CTR_HMAC_SHA256_RAW", baw.g(16, 16, i9, 3));
        map.put("AES256_CTR_HMAC_SHA256", baw.g(32, 32, i9, 1));
        map.put("AES256_CTR_HMAC_SHA256_RAW", baw.g(32, 32, i9, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ void d(brs brsVar) throws GeneralSecurityException {
        bgi bgiVar = (bgi) brsVar;
        new baz().a().d(bgiVar.c());
        new bfi().a().d(bgiVar.d());
        bjg.a(bgiVar.c().a());
    }
}
