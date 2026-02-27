package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class bfa extends beb {
    public bfa() {
        super(bge.class, new bey(bag.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(bgg bggVar) throws GeneralSecurityException {
        if (bggVar.a() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (bggVar.a() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(int i9) throws GeneralSecurityException {
        if (i9 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final bea a() {
        return new bez(bgf.class);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final bhq b() {
        return bhq.SYMMETRIC;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final /* bridge */ /* synthetic */ brs c(bpb bpbVar) throws bqw {
        return bge.c(bpbVar, bqb.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final /* bridge */ /* synthetic */ void e(brs brsVar) throws GeneralSecurityException {
        bge bgeVar = (bge) brsVar;
        bjg.b(bgeVar.a());
        n(bgeVar.e().d());
        m(bgeVar.d());
    }
}
