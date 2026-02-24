package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class bdo extends bep {
    public bdo() {
        super(bho.class, new bdm(azs.class));
    }

    public static /* bridge */ /* synthetic */ bdz g(int i9, int i10, int i11, int i12) {
        bif bifVarJ = bhn.j();
        bifVarJ.A(i9);
        bifVarJ.z(i10);
        bifVarJ.y(i11);
        bhn bhnVar = (bhn) bifVarJ.aY();
        bif bifVarE = bhm.e();
        bifVarE.B(bhnVar);
        return new bdz((bhm) bifVarE.aY(), i12);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final bea a() {
        return new bdn(bhm.class);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final bhq b() {
        return bhq.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final /* bridge */ /* synthetic */ brs c(bpb bpbVar) throws bqw {
        return bho.c(bpbVar, bqb.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final /* bridge */ /* synthetic */ void e(brs brsVar) throws GeneralSecurityException {
        bho bhoVar = (bho) brsVar;
        if (bhoVar.e().A()) {
            throw new GeneralSecurityException("Private key is empty.");
        }
        if (!bhoVar.h()) {
            throw new GeneralSecurityException("Missing public key.");
        }
        bjg.b(bhoVar.a());
        bdr.a(bhoVar.d().b());
    }
}
