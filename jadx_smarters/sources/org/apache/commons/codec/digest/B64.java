package org.apache.commons.codec.digest;

import java.util.Random;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes4.dex */
class B64 {
    static final String B64T = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public static void b64from24bit(byte b9, byte b10, byte b11, int i9, StringBuilder sb) {
        int i10 = ((b9 << 16) & 16777215) | ((b10 << 8) & Settings.DEFAULT_INITIAL_WINDOW_SIZE) | (b11 & 255);
        while (true) {
            int i11 = i9 - 1;
            if (i9 <= 0) {
                return;
            }
            sb.append(B64T.charAt(i10 & 63));
            i10 >>= 6;
            i9 = i11;
        }
    }

    public static String getRandomSalt(int i9) {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 1; i10 <= i9; i10++) {
            sb.append(B64T.charAt(new Random().nextInt(64)));
        }
        return sb.toString();
    }
}
