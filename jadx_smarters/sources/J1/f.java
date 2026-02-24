package J1;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static String a(int i9, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = iArr[i10];
            if (i11 == 1 || i11 == 2) {
                sb.append('[');
                sb.append(iArr2[i10]);
                sb.append(']');
            } else if (i11 == 3 || i11 == 4 || i11 == 5) {
                sb.append('.');
                String str = strArr[i10];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }
}
