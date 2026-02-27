package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class bbc extends beb {
    public bbc() {
        super(bgm.class, new bba(azo.class));
    }

    public static /* bridge */ /* synthetic */ bdz g(int i9, int i10) {
        bif bifVarG = bgn.g();
        bifVarG.ak(i9);
        bif bifVarE = bgo.e();
        bifVarE.aj();
        bifVarG.al((bgo) bifVarE.aY());
        return new bdz((bgn) bifVarG.aY(), i10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final bea a() {
        return new bbb(this, bgn.class);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final bhq b() {
        return bhq.SYMMETRIC;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final /* bridge */ /* synthetic */ brs c(bpb bpbVar) throws bqw {
        return bgm.c(bpbVar, bqb.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final /* bridge */ /* synthetic */ void e(brs brsVar) throws GeneralSecurityException {
        bgm bgmVar = (bgm) brsVar;
        bjg.b(bgmVar.a());
        bjg.a(bgmVar.e().d());
        if (bgmVar.d().a() != 12 && bgmVar.d().a() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
