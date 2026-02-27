package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class bdh implements azs {
    private bdh() {
    }

    public static bdh a(bho bhoVar) throws GeneralSecurityException {
        if (!bhoVar.h()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        }
        if (!bhoVar.d().j()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        if (bhoVar.e().A()) {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
        bhn bhnVarB = bhoVar.d().b();
        bdl.b(bhnVarB);
        bdl.c(bhnVarB);
        bdl.a(bhnVarB);
        int iE = bhnVarB.e();
        int i9 = iE - 2;
        int i10 = bhl.f21374a;
        if (iE == 0) {
            throw null;
        }
        if (i9 != 1 && i9 != 2 && i9 != 3 && i9 != 4) {
            String strA = bhl.a(iE);
            if (iE != 0) {
                throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(String.valueOf(strA)));
            }
            throw null;
        }
        int iE2 = bhoVar.d().b().e();
        int i11 = iE2 - 2;
        if (iE2 == 0) {
            throw null;
        }
        if (i11 == 1) {
            bdu.a(bhoVar.e().B());
        } else {
            if (i11 != 2 && i11 != 3 && i11 != 4) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            bdu.b(bhoVar.e().B(), bhoVar.d().f().B(), bdr.g(bhoVar.d().b().e()));
        }
        return new bdh();
    }
}
