package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class baw extends beb {
    public baw() {
        super(bgh.class, new bau(azo.class));
    }

    public static /* bridge */ /* synthetic */ bdz g(int i9, int i10, int i11, int i12) {
        bif bifVarH = bgk.h();
        bif bifVarE = bgl.e();
        bifVarE.ap();
        bifVarH.ar((bgl) bifVarE.aY());
        bifVarH.aq(i9);
        bgk bgkVar = (bgk) bifVarH.aY();
        bif bifVarH2 = bhh.h();
        bif bifVarG = bhi.g();
        bifVarG.D(i11);
        bifVarG.C(i10);
        bifVarH2.F((bhi) bifVarG.aY());
        bifVarH2.E(32);
        bhh bhhVar = (bhh) bifVarH2.aY();
        bif bifVarG2 = bgi.g();
        bifVarG2.av(bgkVar);
        bifVarG2.aw(bhhVar);
        return new bdz((bgi) bifVarG2.aY(), i12);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final bea a() {
        return new bav(this, bgi.class);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final bhq b() {
        return bhq.SYMMETRIC;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final /* bridge */ /* synthetic */ brs c(bpb bpbVar) throws bqw {
        return bgh.c(bpbVar, bqb.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final /* bridge */ /* synthetic */ void e(brs brsVar) throws GeneralSecurityException {
        bgh bghVar = (bgh) brsVar;
        bjg.b(bghVar.a());
        new baz().e(bghVar.d());
        new bfi();
        bfi.h(bghVar.e());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final int f() {
        return bch.f21050b;
    }
}
