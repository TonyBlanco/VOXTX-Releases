package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bkz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f21635a;

    static {
        int i9;
        String property = System.getProperty("java.version");
        try {
            String[] strArrSplit = property.split("[._]");
            i9 = Integer.parseInt(strArrSplit[0]);
            if (i9 == 1) {
                i9 = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 1;
            }
        } catch (NumberFormatException unused) {
            i9 = -1;
        }
        if (i9 == -1) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i10 = 0; i10 < property.length(); i10++) {
                    char cCharAt = property.charAt(i10);
                    if (!Character.isDigit(cCharAt)) {
                        break;
                    }
                    sb.append(cCharAt);
                }
                i9 = Integer.parseInt(sb.toString());
            } catch (NumberFormatException unused2) {
                i9 = -1;
            }
        }
        if (i9 == -1) {
            i9 = 6;
        }
        f21635a = i9;
    }

    public static boolean a() {
        return f21635a >= 9;
    }
}
