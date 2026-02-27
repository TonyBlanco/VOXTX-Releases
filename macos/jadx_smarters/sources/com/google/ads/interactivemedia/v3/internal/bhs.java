package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bhs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21407a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f21408b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f21409c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21410d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f21411e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ int[] f21412f = {f21407a, f21408b, f21409c, f21410d, f21411e};

    public static int a(int i9) {
        if (i9 != f21411e) {
            return i9 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(int i9) {
        if (i9 == 0) {
            return f21407a;
        }
        if (i9 == 1) {
            return f21408b;
        }
        if (i9 == 2) {
            return f21409c;
        }
        if (i9 != 3) {
            return 0;
        }
        return f21410d;
    }

    public static int[] values$ar$edu$cd8b2a9_0() {
        return new int[]{f21407a, f21408b, f21409c, f21410d, f21411e};
    }
}
