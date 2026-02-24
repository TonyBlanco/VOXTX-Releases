package s5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class P {
    public static Object a(Object obj, int i9) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i9);
        throw new NullPointerException(sb.toString());
    }

    public static Object[] b(Object... objArr) {
        c(objArr, objArr.length);
        return objArr;
    }

    public static Object[] c(Object[] objArr, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            a(objArr[i10], i10);
        }
        return objArr;
    }

    public static Object[] d(Object[] objArr, int i9) {
        return S.b(objArr, i9);
    }
}
