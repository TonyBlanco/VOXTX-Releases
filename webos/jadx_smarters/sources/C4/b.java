package C4;

import com.google.android.gms.common.internal.AbstractC1418q;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static boolean a(int[] iArr, int i9) {
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == i9) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(Object[] objArr, Object obj) {
        int length = objArr != null ? objArr.length : 0;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                break;
            }
            if (!AbstractC1418q.b(objArr[i9], obj)) {
                i9++;
            } else if (i9 >= 0) {
                return true;
            }
        }
        return false;
    }
}
