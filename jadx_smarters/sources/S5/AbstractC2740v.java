package s5;

/* JADX INFO: renamed from: s5.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2740v {
    public static int a(int i9, double d9) {
        int iMax = Math.max(i9, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d9 * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i10 = iHighestOneBit << 1;
        if (i10 > 0) {
            return i10;
        }
        return 1073741824;
    }

    public static int b(int i9) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i9) * (-862048943)), 15)) * 461845907);
    }

    public static int c(Object obj) {
        return b(obj == null ? 0 : obj.hashCode());
    }
}
