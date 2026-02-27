package v5;

import r5.m;

/* JADX INFO: renamed from: v5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2883c {
    public static long a(double d9) {
        m.e(b(d9), "not a normal value");
        int exponent = Math.getExponent(d9);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d9) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static boolean b(double d9) {
        return Math.getExponent(d9) <= 1023;
    }
}
