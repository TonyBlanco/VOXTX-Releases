package d4;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: d4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1689f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f39759a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f39760b = {"", "A", "B", "C"};

    public static String a(int i9, int i10, int i11) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static List b(boolean z9) {
        return Collections.singletonList(z9 ? new byte[]{1} : new byte[]{0});
    }

    public static String c(int i9, boolean z9, int i10, int i11, int[] iArr, int i12) {
        StringBuilder sb = new StringBuilder(k0.D("hvc1.%s%d.%X.%c%d", f39760b[i9], Integer.valueOf(i10), Integer.valueOf(i11), Character.valueOf(z9 ? 'H' : 'L'), Integer.valueOf(i12)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i13 = 0; i13 < length; i13++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i13])));
        }
        return sb.toString();
    }

    public static byte[] d(byte[] bArr, int i9, int i10) {
        byte[] bArr2 = f39759a;
        byte[] bArr3 = new byte[bArr2.length + i10];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i9, bArr3, bArr2.length, i10);
        return bArr3;
    }

    public static int e(byte[] bArr, int i9) {
        int length = bArr.length - f39759a.length;
        while (i9 <= length) {
            if (g(bArr, i9)) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public static Pair f(byte[] bArr) {
        boolean z9;
        M m9 = new M(bArr);
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int i11 = i10 + 3;
            if (i11 >= bArr.length) {
                z9 = false;
                break;
            }
            if (m9.K() == 1 && (bArr[i11] & 240) == 32) {
                z9 = true;
                break;
            }
            m9.U(m9.f() - 2);
            i10++;
        }
        AbstractC1684a.b(z9, "Invalid input: VOL not found.");
        L l9 = new L(bArr);
        l9.r((i10 + 4) * 8);
        l9.r(1);
        l9.r(8);
        if (l9.g()) {
            l9.r(4);
            l9.r(3);
        }
        if (l9.h(4) == 15) {
            l9.r(8);
            l9.r(8);
        }
        if (l9.g()) {
            l9.r(2);
            l9.r(1);
            if (l9.g()) {
                l9.r(79);
            }
        }
        AbstractC1684a.b(l9.h(2) == 0, "Only supports rectangular video object layer shape.");
        AbstractC1684a.a(l9.g());
        int iH = l9.h(16);
        AbstractC1684a.a(l9.g());
        if (l9.g()) {
            AbstractC1684a.a(iH > 0);
            for (int i12 = iH - 1; i12 > 0; i12 >>= 1) {
                i9++;
            }
            l9.r(i9);
        }
        AbstractC1684a.a(l9.g());
        int iH2 = l9.h(13);
        AbstractC1684a.a(l9.g());
        int iH3 = l9.h(13);
        AbstractC1684a.a(l9.g());
        l9.r(1);
        return Pair.create(Integer.valueOf(iH2), Integer.valueOf(iH3));
    }

    public static boolean g(byte[] bArr, int i9) {
        if (bArr.length - i9 <= f39759a.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f39759a;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i9 + i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    public static Pair h(byte[] bArr) {
        M m9 = new M(bArr);
        m9.U(9);
        int iH = m9.H();
        m9.U(20);
        return Pair.create(Integer.valueOf(m9.L()), Integer.valueOf(iH));
    }

    public static boolean i(List list) {
        return list.size() == 1 && ((byte[]) list.get(0)).length == 1 && ((byte[]) list.get(0))[0] == 1;
    }

    public static byte[][] j(byte[] bArr) {
        if (!g(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iE = 0;
        do {
            arrayList.add(Integer.valueOf(iE));
            iE = e(bArr, iE + f39759a.length);
        } while (iE != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i9 = 0;
        while (i9 < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i9)).intValue();
            int iIntValue2 = (i9 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i9 + 1)).intValue() : bArr.length) - iIntValue;
            byte[] bArr3 = new byte[iIntValue2];
            System.arraycopy(bArr, iIntValue, bArr3, 0, iIntValue2);
            bArr2[i9] = bArr3;
            i9++;
        }
        return bArr2;
    }
}
