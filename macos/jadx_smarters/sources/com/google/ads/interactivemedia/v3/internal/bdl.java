package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class bdl {
    public static bdf a(bhn bhnVar) throws GeneralSecurityException {
        if (bhnVar.c() == bhj.f21363b) {
            return new bdc(16);
        }
        if (bhnVar.c() == bhj.f21364c) {
            return new bdc(32);
        }
        if (bhnVar.c() == bhj.f21365d) {
            return new bdd();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    public static bdj b(bhn bhnVar) throws GeneralSecurityException {
        if (bhnVar.e() == bhl.f21375b) {
            return new bdt(new bde("HmacSha256"));
        }
        if (bhnVar.e() == bhl.f21376c) {
            return bds.c(1);
        }
        if (bhnVar.e() == bhl.f21377d) {
            return bds.c(2);
        }
        if (bhnVar.e() == bhl.f21378e) {
            return bds.c(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    public static bde c(bhn bhnVar) {
        if (bhnVar.d() == bhk.f21369b) {
            return new bde("HmacSha256");
        }
        if (bhnVar.d() == bhk.f21370c) {
            return new bde("HmacSha384");
        }
        if (bhnVar.d() == bhk.f21371d) {
            return new bde("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }
}
