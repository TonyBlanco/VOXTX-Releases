package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
final class bda {
    public static void a(bha bhaVar) throws GeneralSecurityException {
        bjh.t(c(bhaVar.d().e()));
        b(bhaVar.d().f());
        if (bhaVar.g() == bgx.f21293a) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        bao.m(bhaVar.a().c());
    }

    public static String b(int i9) throws NoSuchAlgorithmException {
        int i10 = bgx.f21293a;
        int i11 = bhe.f21336a;
        int i12 = i9 - 2;
        int i13 = bhf.f21343a;
        if (i9 == 0) {
            throw null;
        }
        if (i12 == 1) {
            return "HmacSha1";
        }
        if (i12 == 2) {
            return "HmacSha384";
        }
        if (i12 == 3) {
            return "HmacSha256";
        }
        if (i12 == 4) {
            return "HmacSha512";
        }
        if (i12 != 5) {
            throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(String.valueOf(i9 != 0 ? Integer.toString(bhf.a(i9)) : Constants.NULL_VERSION_ID)));
        }
        return "HmacSha224";
    }

    public static int c(int i9) throws GeneralSecurityException {
        int i10 = bgx.f21293a;
        int i11 = bhe.f21336a;
        int i12 = i9 - 2;
        int i13 = bhf.f21343a;
        if (i9 == 0) {
            throw null;
        }
        if (i12 == 2) {
            return 1;
        }
        if (i12 == 3) {
            return 2;
        }
        if (i12 != 4) {
            throw new GeneralSecurityException("unknown curve type: ".concat(String.valueOf(i9 != 0 ? Integer.toString(bhe.a(i9)) : Constants.NULL_VERSION_ID)));
        }
        return 3;
    }

    public static int d(int i9) throws GeneralSecurityException {
        int i10 = bgx.f21293a;
        int i11 = bhe.f21336a;
        int i12 = i9 - 2;
        int i13 = bhf.f21343a;
        if (i9 == 0) {
            throw null;
        }
        int i14 = 1;
        if (i12 != 1) {
            i14 = 2;
            if (i12 != 2) {
                i14 = 3;
                if (i12 != 3) {
                    throw new GeneralSecurityException("unknown point format: ".concat(String.valueOf(i9 != 0 ? Integer.toString(bgx.a(i9)) : Constants.NULL_VERSION_ID)));
                }
            }
        }
        return i14;
    }
}
