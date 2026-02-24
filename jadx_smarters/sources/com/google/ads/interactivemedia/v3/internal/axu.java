package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class axu {
    static {
        Math.log(2.0d);
    }

    public static boolean a(double d9) {
        if (Math.copySign(1.0d - d9, 1.0d) <= 0.1d || d9 == 1.0d) {
            return true;
        }
        return Double.isNaN(1.0d) && Double.isNaN(d9);
    }
}
