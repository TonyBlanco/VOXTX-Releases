package com.google.ads.interactivemedia.v3.impl.data;

import android.os.Build;
import com.google.ads.interactivemedia.v3.internal.bew;
import com.google.ads.interactivemedia.v3.internal.bjj;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p {
    public static final bjj a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i9 = 0; i9 < str.length(); i9++) {
            char cCharAt = str.charAt(i9);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new bew("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i9] = (byte) cCharAt;
        }
        return bjj.b(bArr);
    }

    public static Integer b() {
        return Integer.valueOf(Build.VERSION.SDK_INT);
    }
}
