package W5;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10308a;

    public c(int i9) {
        this.f10308a = i9;
    }

    public static boolean b(StackTraceElement[] stackTraceElementArr, int i9, int i10) {
        int i11 = i10 - i9;
        if (i10 + i11 > stackTraceElementArr.length) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!stackTraceElementArr[i9 + i12].equals(stackTraceElementArr[i10 + i12])) {
                return false;
            }
        }
        return true;
    }

    public static StackTraceElement[] c(StackTraceElement[] stackTraceElementArr, int i9) {
        int i10;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i11 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i11];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null || !b(stackTraceElementArr, num.intValue(), i11)) {
                stackTraceElementArr2[i12] = stackTraceElementArr[i11];
                i12++;
                i10 = i11;
                i13 = 1;
            } else {
                int iIntValue = i11 - num.intValue();
                if (i13 < i9) {
                    System.arraycopy(stackTraceElementArr, i11, stackTraceElementArr2, i12, iIntValue);
                    i12 += iIntValue;
                    i13++;
                }
                i10 = (iIntValue - 1) + i11;
            }
            map.put(stackTraceElement, Integer.valueOf(i11));
            i11 = i10 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i12];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i12);
        return stackTraceElementArr3;
    }

    @Override // W5.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] stackTraceElementArrC = c(stackTraceElementArr, this.f10308a);
        return stackTraceElementArrC.length < stackTraceElementArr.length ? stackTraceElementArrC : stackTraceElementArr;
    }
}
