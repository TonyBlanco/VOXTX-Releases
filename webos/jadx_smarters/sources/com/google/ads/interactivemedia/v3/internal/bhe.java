package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bhe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21336a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f21337b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f21338c = 5;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21339d = 6;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f21340e = 7;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f21341f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ int[] f21342g = {f21336a, f21337b, f21338c, f21339d, f21340e, f21341f};

    public static int a(int i9) {
        if (i9 != f21341f) {
            return i9 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(int i9) {
        if (i9 == 0) {
            return f21336a;
        }
        if (i9 == 2) {
            return f21337b;
        }
        if (i9 == 3) {
            return f21338c;
        }
        if (i9 == 4) {
            return f21339d;
        }
        if (i9 != 5) {
            return 0;
        }
        return f21340e;
    }

    public static int[] values$ar$edu$1f5331ac_0() {
        return new int[]{f21336a, f21337b, f21338c, f21339d, f21340e, f21341f};
    }
}
