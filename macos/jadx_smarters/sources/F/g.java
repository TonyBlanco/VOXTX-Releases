package F;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static int[] a(int[] iArr, int i9, int i10) {
        if (i9 + 1 > iArr.length) {
            int[] iArr2 = new int[c(i9)];
            System.arraycopy(iArr, 0, iArr2, 0, i9);
            iArr = iArr2;
        }
        iArr[i9] = i10;
        return iArr;
    }

    public static Object[] b(Object[] objArr, int i9, Object obj) {
        if (i9 + 1 > objArr.length) {
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), c(i9));
            System.arraycopy(objArr, 0, objArr2, 0, i9);
            objArr = objArr2;
        }
        objArr[i9] = obj;
        return objArr;
    }

    public static int c(int i9) {
        if (i9 <= 4) {
            return 8;
        }
        return i9 * 2;
    }
}
