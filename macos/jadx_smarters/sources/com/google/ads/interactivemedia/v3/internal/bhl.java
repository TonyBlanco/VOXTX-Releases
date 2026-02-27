package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;

/* JADX INFO: loaded from: classes3.dex */
public final class bhl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21374a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f21375b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f21376c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21377d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f21378e = 6;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f21379f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ int[] f21380g = {f21374a, f21375b, f21376c, f21377d, f21378e, f21379f};

    public static /* synthetic */ String a(int i9) {
        switch (i9) {
            case 1:
                return "UNRECOGNIZED";
            case 2:
                return "KEM_UNKNOWN";
            case 3:
                return "DHKEM_X25519_HKDF_SHA256";
            case 4:
                return "DHKEM_P256_HKDF_SHA256";
            case 5:
                return "DHKEM_P384_HKDF_SHA384";
            case 6:
                return "DHKEM_P521_HKDF_SHA512";
            default:
                return Constants.NULL_VERSION_ID;
        }
    }

    public static int b(int i9) {
        if (i9 != f21379f) {
            return i9 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int c(int i9) {
        if (i9 == 0) {
            return f21374a;
        }
        if (i9 == 1) {
            return f21375b;
        }
        if (i9 == 2) {
            return f21376c;
        }
        if (i9 == 3) {
            return f21377d;
        }
        if (i9 != 4) {
            return 0;
        }
        return f21378e;
    }

    public static int[] values$ar$edu$969b5a7a_0() {
        return new int[]{f21374a, f21375b, f21376c, f21377d, f21378e, f21379f};
    }
}
