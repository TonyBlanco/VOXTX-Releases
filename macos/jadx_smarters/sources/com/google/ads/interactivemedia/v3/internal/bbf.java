package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class bbf extends beb {
    public bbf() {
        super(bgp.class, new bbd(azo.class));
    }

    public static /* bridge */ /* synthetic */ bdz g(int i9, int i10) {
        bif bifVarE = bgq.e();
        bifVarE.ag(i9);
        return new bdz((bgq) bifVarE.aY(), i10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final bea a() {
        return new bbe(this, bgq.class);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final bhq b() {
        return bhq.SYMMETRIC;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final /* bridge */ /* synthetic */ brs c(bpb bpbVar) throws bqw {
        return bgp.c(bpbVar, bqb.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final /* bridge */ /* synthetic */ void e(brs brsVar) throws GeneralSecurityException {
        bgp bgpVar = (bgp) brsVar;
        bjg.b(bgpVar.a());
        bjg.a(bgpVar.d().d());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final int f() {
        return bch.f21050b;
    }
}
