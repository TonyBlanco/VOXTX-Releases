package w5;

/* JADX INFO: renamed from: w5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2929a {
    public static int a(boolean z9, boolean z10) {
        if (z9 == z10) {
            return 0;
        }
        return z9 ? 1 : -1;
    }

    public static boolean b(boolean[] zArr, boolean z9) {
        for (boolean z10 : zArr) {
            if (z10 == z9) {
                return true;
            }
        }
        return false;
    }
}
