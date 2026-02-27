package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;

/* JADX INFO: loaded from: classes3.dex */
public final class bhj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21362a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f21363b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f21364c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21365d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f21366e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ int[] f21367f = {f21362a, f21363b, f21364c, f21365d, f21366e};

    public static /* synthetic */ String a(int i9) {
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? i9 != 5 ? Constants.NULL_VERSION_ID : "CHACHA20_POLY1305" : "AES_256_GCM" : "AES_128_GCM" : "AEAD_UNKNOWN" : "UNRECOGNIZED";
    }

    public static int b(int i9) {
        if (i9 != f21366e) {
            return i9 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int c(int i9) {
        if (i9 == 0) {
            return f21362a;
        }
        if (i9 == 1) {
            return f21363b;
        }
        if (i9 == 2) {
            return f21364c;
        }
        if (i9 != 3) {
            return 0;
        }
        return f21365d;
    }

    public static int[] values$ar$edu$5566fcf9_0() {
        return new int[]{f21362a, f21363b, f21364c, f21365d, f21366e};
    }
}
