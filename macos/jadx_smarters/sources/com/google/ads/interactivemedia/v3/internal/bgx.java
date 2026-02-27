package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bgx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21293a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f21294b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f21295c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21296d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f21297e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ int[] f21298f = {f21293a, f21294b, f21295c, f21296d, f21297e};

    public static int a(int i9) {
        if (i9 != f21297e) {
            return i9 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(int i9) {
        if (i9 == 0) {
            return f21293a;
        }
        if (i9 == 1) {
            return f21294b;
        }
        if (i9 == 2) {
            return f21295c;
        }
        if (i9 != 3) {
            return 0;
        }
        return f21296d;
    }

    public static int[] values$ar$edu$34ac0a47_0() {
        return new int[]{f21293a, f21294b, f21295c, f21296d, f21297e};
    }
}
