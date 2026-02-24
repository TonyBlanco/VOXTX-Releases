package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class bcr extends bep {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f21058a = new byte[0];

    public bcr() {
        super(bhb.class, new bcp(azs.class));
    }

    public static /* bridge */ /* synthetic */ bdz h(int i9, int i10, int i11, oq oqVar, byte[] bArr, int i12) {
        bif bifVarE = bgz.e();
        bif bifVarJ = bhd.j();
        bifVarJ.K(i9);
        bifVarJ.L(i10);
        bifVarJ.J(bpb.t(bArr));
        bhd bhdVar = (bhd) bifVarJ.aY();
        bif bifVarJ2 = bht.j();
        bifVarJ2.n(oqVar.e());
        bifVarJ2.o(bpb.t(oqVar.f()));
        int iG = oqVar.g() - 1;
        bifVarJ2.m(iG != 0 ? iG != 1 ? iG != 2 ? bid.CRUNCHY : bid.RAW : bid.LEGACY : bid.TINK);
        bht bhtVar = (bht) bifVarJ2.aY();
        bif bifVarE2 = bgy.e();
        bifVarE2.X(bhtVar);
        bgy bgyVar = (bgy) bifVarE2.aY();
        bif bifVarJ3 = bha.j();
        bifVarJ3.U(bhdVar);
        bifVarJ3.T(bgyVar);
        bifVarJ3.V(i11);
        bifVarE.W((bha) bifVarJ3.aY());
        return new bdz((bgz) bifVarE.aY(), i12);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final bea a() {
        return new bcq(this, bgz.class);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final bhq b() {
        return bhq.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final /* bridge */ /* synthetic */ brs c(bpb bpbVar) throws bqw {
        return bhb.c(bpbVar, bqb.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final /* bridge */ /* synthetic */ void e(brs brsVar) throws GeneralSecurityException {
        bhb bhbVar = (bhb) brsVar;
        if (bhbVar.e().A()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        bjg.b(bhbVar.a());
        bda.a(bhbVar.d().b());
    }
}
