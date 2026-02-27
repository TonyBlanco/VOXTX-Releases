package M6;

import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.Map;
import org.apache.http.HttpStatus;
import org.joda.time.DateTimeConstants;
import x6.C2963d;
import x6.EnumC2960a;

/* JADX INFO: loaded from: classes.dex */
public final class c extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f5174e = {52, 289, 97, 352, 49, HttpStatus.SC_NOT_MODIFIED, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, DateTimeConstants.HOURS_PER_WEEK, 162, 138, 42};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f5177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f5178d;

    public c() {
        this(false);
    }

    public c(boolean z9) {
        this(z9, false);
    }

    public c(boolean z9, boolean z10) {
        this.f5175a = z9;
        this.f5176b = z10;
        this.f5177c = new StringBuilder(20);
        this.f5178d = new int[9];
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String h(java.lang.CharSequence r12) throws x6.g {
        /*
            int r0 = r12.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
            r3 = 0
        Lb:
            if (r3 >= r0) goto Lba
            char r4 = r12.charAt(r3)
            r5 = 47
            r6 = 37
            r7 = 36
            r8 = 43
            if (r4 == r8) goto L27
            if (r4 == r7) goto L27
            if (r4 == r6) goto L27
            if (r4 != r5) goto L22
            goto L27
        L22:
            r1.append(r4)
            goto Lb1
        L27:
            int r3 = r3 + 1
            char r9 = r12.charAt(r3)
            r10 = 90
            r11 = 65
            if (r4 == r7) goto Laa
            r7 = 79
            if (r4 == r6) goto L5b
            if (r4 == r8) goto L4f
            if (r4 == r5) goto L3d
        L3b:
            r4 = 0
            goto L22
        L3d:
            if (r9 < r11) goto L45
            if (r9 > r7) goto L45
            int r9 = r9 + (-32)
        L43:
            char r4 = (char) r9
            goto L22
        L45:
            if (r9 != r10) goto L4a
            r4 = 58
            goto L22
        L4a:
            x6.g r12 = x6.g.a()
            throw r12
        L4f:
            if (r9 < r11) goto L56
            if (r9 > r10) goto L56
            int r9 = r9 + 32
            goto L43
        L56:
            x6.g r12 = x6.g.a()
            throw r12
        L5b:
            if (r9 < r11) goto L64
            r4 = 69
            if (r9 > r4) goto L64
            int r9 = r9 + (-38)
            goto L43
        L64:
            r4 = 70
            if (r9 < r4) goto L6f
            r4 = 74
            if (r9 > r4) goto L6f
            int r9 = r9 + (-11)
            goto L43
        L6f:
            r4 = 75
            if (r9 < r4) goto L78
            if (r9 > r7) goto L78
            int r9 = r9 + 16
            goto L43
        L78:
            r4 = 80
            if (r9 < r4) goto L83
            r4 = 84
            if (r9 > r4) goto L83
            int r9 = r9 + 43
            goto L43
        L83:
            r4 = 85
            if (r9 != r4) goto L88
            goto L3b
        L88:
            r4 = 86
            if (r9 != r4) goto L8f
            r4 = 64
            goto L22
        L8f:
            r4 = 87
            if (r9 != r4) goto L96
            r4 = 96
            goto L22
        L96:
            r4 = 88
            if (r9 == r4) goto La6
            r4 = 89
            if (r9 == r4) goto La6
            if (r9 != r10) goto La1
            goto La6
        La1:
            x6.g r12 = x6.g.a()
            throw r12
        La6:
            r4 = 127(0x7f, float:1.78E-43)
            goto L22
        Laa:
            if (r9 < r11) goto Lb5
            if (r9 > r10) goto Lb5
            int r9 = r9 + (-64)
            goto L43
        Lb1:
            int r3 = r3 + 1
            goto Lb
        Lb5:
            x6.g r12 = x6.g.a()
            throw r12
        Lba:
            java.lang.String r12 = r1.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: M6.c.h(java.lang.CharSequence):java.lang.String");
    }

    public static int[] i(D6.a aVar, int[] iArr) throws x6.k {
        int iL = aVar.l();
        int iJ = aVar.j(0);
        int length = iArr.length;
        int i9 = iJ;
        boolean z9 = false;
        int i10 = 0;
        while (iJ < iL) {
            if (aVar.h(iJ) != z9) {
                iArr[i10] = iArr[i10] + 1;
            } else {
                if (i10 != length - 1) {
                    i10++;
                } else {
                    if (k(iArr) == 148 && aVar.n(Math.max(0, i9 - ((iJ - i9) / 2)), i9, false)) {
                        return new int[]{i9, iJ};
                    }
                    i9 += iArr[0] + iArr[1];
                    int i11 = i10 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i11);
                    iArr[i11] = 0;
                    iArr[i10] = 0;
                    i10--;
                }
                iArr[i10] = 1;
                z9 = !z9;
            }
            iJ++;
        }
        throw x6.k.a();
    }

    public static char j(int i9) throws x6.k {
        int i10 = 0;
        while (true) {
            int[] iArr = f5174e;
            if (i10 >= iArr.length) {
                if (i9 == 148) {
                    return '*';
                }
                throw x6.k.a();
            }
            if (iArr[i10] == i9) {
                return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i10);
            }
            i10++;
        }
    }

    public static int k(int[] iArr) {
        int length = iArr.length;
        int i9 = 0;
        while (true) {
            int i10 = a.e.API_PRIORITY_OTHER;
            for (int i11 : iArr) {
                if (i11 < i10 && i11 > i9) {
                    i10 = i11;
                }
            }
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < length; i15++) {
                int i16 = iArr[i15];
                if (i16 > i10) {
                    i13 |= 1 << ((length - 1) - i15);
                    i12++;
                    i14 += i16;
                }
            }
            if (i12 == 3) {
                for (int i17 = 0; i17 < length && i12 > 0; i17++) {
                    int i18 = iArr[i17];
                    if (i18 > i10) {
                        i12--;
                        if ((i18 << 1) >= i14) {
                            return -1;
                        }
                    }
                }
                return i13;
            }
            if (i12 <= 3) {
                return -1;
            }
            i9 = i10;
        }
    }

    @Override // M6.k
    public x6.o c(int i9, D6.a aVar, Map map) throws C2963d, x6.k {
        int[] iArr = this.f5178d;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f5177c;
        sb.setLength(0);
        int iJ = aVar.j(i(aVar, iArr)[1]);
        int iL = aVar.l();
        while (true) {
            k.f(aVar, iJ, iArr);
            int iK = k(iArr);
            if (iK < 0) {
                throw x6.k.a();
            }
            char cJ = j(iK);
            sb.append(cJ);
            int i10 = iJ;
            for (int i11 : iArr) {
                i10 += i11;
            }
            int iJ2 = aVar.j(i10);
            if (cJ == '*') {
                sb.setLength(sb.length() - 1);
                int i12 = 0;
                for (int i13 : iArr) {
                    i12 += i13;
                }
                int i14 = (iJ2 - iJ) - i12;
                if (iJ2 != iL && (i14 << 1) < i12) {
                    throw x6.k.a();
                }
                if (this.f5175a) {
                    int length = sb.length() - 1;
                    int iIndexOf = 0;
                    for (int i15 = 0; i15 < length; i15++) {
                        iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f5177c.charAt(i15));
                    }
                    if (sb.charAt(length) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(iIndexOf % 43)) {
                        throw C2963d.a();
                    }
                    sb.setLength(length);
                }
                if (sb.length() == 0) {
                    throw x6.k.a();
                }
                float f9 = i9;
                return new x6.o(this.f5176b ? h(sb) : sb.toString(), null, new x6.q[]{new x6.q((r2[1] + r2[0]) / 2.0f, f9), new x6.q(iJ + (i12 / 2.0f), f9)}, EnumC2960a.CODE_39);
            }
            iJ = iJ2;
        }
    }
}
