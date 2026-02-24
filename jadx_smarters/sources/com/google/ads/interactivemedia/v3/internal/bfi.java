package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class bfi extends beb {
    public bfi() {
        super(bhg.class, new bfg(bag.class));
    }

    public static final void h(bhg bhgVar) throws GeneralSecurityException {
        bjg.b(bhgVar.a());
        if (bhgVar.f().d() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        n(bhgVar.e());
    }

    public static /* bridge */ /* synthetic */ bdz m(int i9, int i10, int i11, int i12) {
        bif bifVarH = bhh.h();
        bif bifVarG = bhi.g();
        bifVarG.D(i11);
        bifVarG.C(i10);
        bifVarH.F((bhi) bifVarG.aY());
        bifVarH.E(i9);
        return new bdz((bhh) bifVarH.aY(), i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(bhi bhiVar) throws GeneralSecurityException {
        if (bhiVar.a() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i9 = bhf.f21343a;
        int iE = bhiVar.e();
        int i10 = iE - 2;
        if (iE == 0) {
            throw null;
        }
        if (i10 == 1) {
            if (bhiVar.a() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i10 == 2) {
            if (bhiVar.a() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i10 == 3) {
            if (bhiVar.a() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i10 == 4) {
            if (bhiVar.a() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i10 != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (bhiVar.a() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final bea a() {
        return new bfh(this, bhh.class);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final bhq b() {
        return bhq.SYMMETRIC;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final /* bridge */ /* synthetic */ brs c(bpb bpbVar) throws bqw {
        return bhg.d(bpbVar, bqb.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final /* bridge */ /* synthetic */ void e(brs brsVar) throws GeneralSecurityException {
        h((bhg) brsVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beb
    public final int f() {
        return bch.f21050b;
    }
}
