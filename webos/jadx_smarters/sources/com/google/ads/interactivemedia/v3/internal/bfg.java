package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
final class bfg extends beo {
    public bfg(Class cls) {
        super(cls);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.beo
    public final /* bridge */ /* synthetic */ Object a(brs brsVar) throws GeneralSecurityException {
        bhg bhgVar = (bhg) brsVar;
        int iE = bhgVar.e().e();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bhgVar.f().B(), "HMAC");
        int iA = bhgVar.e().a();
        int i9 = iE - 2;
        int i10 = bhf.f21343a;
        if (iE == 0) {
            throw null;
        }
        if (i9 == 1) {
            return new bjd(new bjc("HMACSHA1", secretKeySpec), iA);
        }
        if (i9 == 2) {
            return new bjd(new bjc("HMACSHA384", secretKeySpec), iA);
        }
        if (i9 == 3) {
            return new bjd(new bjc("HMACSHA256", secretKeySpec), iA);
        }
        if (i9 == 4) {
            return new bjd(new bjc("HMACSHA512", secretKeySpec), iA);
        }
        if (i9 == 5) {
            return new bjd(new bjc("HMACSHA224", secretKeySpec), iA);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
