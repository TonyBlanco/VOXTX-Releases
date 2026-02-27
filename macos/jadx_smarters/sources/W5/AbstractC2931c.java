package w5;

import r5.m;

/* JADX INFO: renamed from: w5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2931c {
    public static char a(long j9) {
        char c9 = (char) j9;
        m.g(((long) c9) == j9, "Out of range: %s", j9);
        return c9;
    }

    public static boolean b(char[] cArr, char c9) {
        for (char c10 : cArr) {
            if (c10 == c9) {
                return true;
            }
        }
        return false;
    }

    public static char c(byte b9, byte b10) {
        return (char) ((b9 << 8) | (b10 & 255));
    }
}
