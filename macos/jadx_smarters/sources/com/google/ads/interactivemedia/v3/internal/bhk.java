package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;

/* JADX INFO: loaded from: classes3.dex */
public final class bhk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21368a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f21369b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f21370c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21371d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f21372e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ int[] f21373f = {f21368a, f21369b, f21370c, f21371d, f21372e};

    public static /* synthetic */ String a(int i9) {
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? i9 != 5 ? Constants.NULL_VERSION_ID : "HKDF_SHA512" : "HKDF_SHA384" : "HKDF_SHA256" : "KDF_UNKNOWN" : "UNRECOGNIZED";
    }

    public static int b(int i9) {
        if (i9 != f21372e) {
            return i9 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int c(int i9) {
        if (i9 == 0) {
            return f21368a;
        }
        if (i9 == 1) {
            return f21369b;
        }
        if (i9 == 2) {
            return f21370c;
        }
        if (i9 != 3) {
            return 0;
        }
        return f21371d;
    }

    public static int[] values$ar$edu$2d9d4195_0() {
        return new int[]{f21368a, f21369b, f21370c, f21371d, f21372e};
    }
}
