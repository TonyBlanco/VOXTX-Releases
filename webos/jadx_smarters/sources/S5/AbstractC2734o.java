package s5;

import java.util.Arrays;

/* JADX INFO: renamed from: s5.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2734o {
    public static Object a(int i9) {
        if (i9 >= 2 && i9 <= 1073741824 && Integer.highestOneBit(i9) == i9) {
            return i9 <= 256 ? new byte[i9] : i9 <= 65536 ? new short[i9] : new int[i9];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i9);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int b(int i9, int i10) {
        return i9 & (~i10);
    }

    public static int c(int i9, int i10) {
        return i9 & i10;
    }

    public static int d(int i9, int i10, int i11) {
        return (i9 & (~i11)) | (i10 & i11);
    }

    public static int e(int i9) {
        return (i9 < 32 ? 4 : 2) * (i9 + 1);
    }

    public static int f(Object obj, Object obj2, int i9, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i10;
        int i11;
        int iC = AbstractC2740v.c(obj);
        int i12 = iC & i9;
        int iH = h(obj3, i12);
        if (iH == 0) {
            return -1;
        }
        int iB = b(iC, i9);
        int i13 = -1;
        while (true) {
            i10 = iH - 1;
            i11 = iArr[i10];
            if (b(i11, i9) == iB && r5.j.a(obj, objArr[i10]) && (objArr2 == null || r5.j.a(obj2, objArr2[i10]))) {
                break;
            }
            int iC2 = c(i11, i9);
            if (iC2 == 0) {
                return -1;
            }
            i13 = i10;
            iH = iC2;
        }
        int iC3 = c(i11, i9);
        if (i13 == -1) {
            i(obj3, i12, iC3);
        } else {
            iArr[i13] = d(iArr[i13], iC3, i9);
        }
        return i10;
    }

    public static void g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    public static int h(Object obj, int i9) {
        return obj instanceof byte[] ? ((byte[]) obj)[i9] & 255 : obj instanceof short[] ? ((short[]) obj)[i9] & 65535 : ((int[]) obj)[i9];
    }

    public static void i(Object obj, int i9, int i10) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i9] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i9] = (short) i10;
        } else {
            ((int[]) obj)[i9] = i10;
        }
    }

    public static int j(int i9) {
        return Math.max(4, AbstractC2740v.a(i9 + 1, 1.0d));
    }
}
