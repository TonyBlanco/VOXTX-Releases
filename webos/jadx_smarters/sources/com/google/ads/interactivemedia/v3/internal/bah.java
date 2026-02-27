package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class bah {
    @Deprecated
    public static final bad a(byte[] bArr) throws GeneralSecurityException {
        try {
            bhw bhwVarD = bhw.d(bArr, bqb.a());
            for (bhv bhvVar : bhwVarD.e()) {
                if (bhvVar.b().a() == bhq.UNKNOWN_KEYMATERIAL || bhvVar.b().a() == bhq.SYMMETRIC || bhvVar.b().a() == bhq.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return bad.a(bhwVarD);
        } catch (bqw unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
