package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class bck extends bea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ bcl f21054a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bck(bcl bclVar, Class cls) {
        super(cls);
        this.f21054a = bclVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ brs a(brs brsVar) throws GeneralSecurityException {
        bif bifVarG = bgt.g();
        bifVarG.ab(bpb.t(bjf.b(((bgu) brsVar).a())));
        bifVarG.ac();
        return (bgt) bifVarG.aY();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ brs b(bpb bpbVar) throws bqw {
        return bgu.c(bpbVar, bqb.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        bif bifVarE = bgu.e();
        bifVarE.aa();
        map.put("AES256_SIV", new bdz((bgu) bifVarE.aY(), 1));
        bif bifVarE2 = bgu.e();
        bifVarE2.aa();
        map.put("AES256_SIV_RAW", new bdz((bgu) bifVarE2.aY(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bea
    public final /* bridge */ /* synthetic */ void d(brs brsVar) throws GeneralSecurityException {
        bgu bguVar = (bgu) brsVar;
        if (bguVar.a() == 64) {
            return;
        }
        throw new InvalidAlgorithmParameterException("invalid key size: " + bguVar.a() + ". Valid keys must have 64 bytes.");
    }
}
