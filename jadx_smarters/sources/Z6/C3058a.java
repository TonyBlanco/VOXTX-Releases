package z6;

import F6.c;
import F6.e;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.amplifyframework.core.model.ModelIdentifier;
import java.util.Arrays;
import x6.g;
import y6.C2990a;

/* JADX INFO: renamed from: z6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3058a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f52847b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f52848c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f52849d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f52850e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER, "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", InstructionFileId.DOT, "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f52851f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", InstructionFileId.DOT, "CTRL_UL", "CTRL_US"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2990a f52852a;

    /* JADX INFO: renamed from: z6.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0492a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52853a;

        static {
            int[] iArr = new int[b.values().length];
            f52853a = iArr;
            try {
                iArr[b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52853a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52853a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52853a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f52853a[b.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: z6.a$b */
    public enum b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    public static byte[] a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i9 = 0; i9 < length; i9++) {
            bArr[i9] = h(zArr, i9 << 3);
        }
        return bArr;
    }

    public static String e(b bVar, int i9) {
        int i10 = C0492a.f52853a[bVar.ordinal()];
        if (i10 == 1) {
            return f52847b[i9];
        }
        if (i10 == 2) {
            return f52848c[i9];
        }
        if (i10 == 3) {
            return f52849d[i9];
        }
        if (i10 == 4) {
            return f52850e[i9];
        }
        if (i10 == 5) {
            return f52851f[i9];
        }
        throw new IllegalStateException("Bad table");
    }

    public static String f(boolean[] zArr) {
        int length = zArr.length;
        b bVar = b.UPPER;
        StringBuilder sb = new StringBuilder(20);
        b bVarG = bVar;
        int i9 = 0;
        while (i9 < length) {
            if (bVar != b.BINARY) {
                int i10 = bVar == b.DIGIT ? 4 : 5;
                if (length - i9 < i10) {
                    break;
                }
                int i11 = i(zArr, i9, i10);
                i9 += i10;
                String strE = e(bVar, i11);
                if (strE.startsWith("CTRL_")) {
                    bVarG = g(strE.charAt(5));
                    if (strE.charAt(6) != 'L') {
                        bVarG = bVar;
                        bVar = bVarG;
                    }
                } else {
                    sb.append(strE);
                }
                bVar = bVarG;
            } else {
                if (length - i9 < 5) {
                    break;
                }
                int i12 = i(zArr, i9, 5);
                int i13 = i9 + 5;
                if (i12 == 0) {
                    if (length - i13 < 11) {
                        break;
                    }
                    i12 = i(zArr, i13, 11) + 31;
                    i13 = i9 + 16;
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= i12) {
                        i9 = i13;
                        break;
                    }
                    if (length - i13 < 8) {
                        i9 = length;
                        break;
                    }
                    sb.append((char) i(zArr, i13, 8));
                    i13 += 8;
                    i14++;
                }
                bVar = bVarG;
            }
        }
        return sb.toString();
    }

    public static b g(char c9) {
        return c9 != 'B' ? c9 != 'D' ? c9 != 'P' ? c9 != 'L' ? c9 != 'M' ? b.UPPER : b.MIXED : b.LOWER : b.PUNCT : b.DIGIT : b.BINARY;
    }

    public static byte h(boolean[] zArr, int i9) {
        int length = zArr.length - i9;
        return (byte) (length >= 8 ? i(zArr, i9, 8) : i(zArr, i9, length) << (8 - length));
    }

    public static int i(boolean[] zArr, int i9, int i10) {
        int i11 = 0;
        for (int i12 = i9; i12 < i9 + i10; i12++) {
            i11 <<= 1;
            if (zArr[i12]) {
                i11 |= 1;
            }
        }
        return i11;
    }

    public static int j(int i9, boolean z9) {
        return ((z9 ? 88 : 112) + (i9 << 4)) * i9;
    }

    public final boolean[] b(boolean[] zArr) throws g {
        int i9;
        F6.a aVar;
        if (this.f52852a.d() <= 2) {
            aVar = F6.a.f2028j;
            i9 = 6;
        } else {
            i9 = 8;
            if (this.f52852a.d() <= 8) {
                aVar = F6.a.f2032n;
            } else if (this.f52852a.d() <= 22) {
                aVar = F6.a.f2027i;
                i9 = 10;
            } else {
                aVar = F6.a.f2026h;
                i9 = 12;
            }
        }
        int iC = this.f52852a.c();
        int length = zArr.length / i9;
        if (length < iC) {
            throw g.a();
        }
        int length2 = zArr.length % i9;
        int[] iArr = new int[length];
        int i10 = 0;
        while (i10 < length) {
            iArr[i10] = i(zArr, length2, i9);
            i10++;
            length2 += i9;
        }
        try {
            new c(aVar).a(iArr, length - iC);
            int i11 = 1 << i9;
            int i12 = i11 - 1;
            int i13 = 0;
            for (int i14 = 0; i14 < iC; i14++) {
                int i15 = iArr[i14];
                if (i15 == 0 || i15 == i12) {
                    throw g.a();
                }
                if (i15 == 1 || i15 == i11 - 2) {
                    i13++;
                }
            }
            boolean[] zArr2 = new boolean[(iC * i9) - i13];
            int i16 = 0;
            for (int i17 = 0; i17 < iC; i17++) {
                int i18 = iArr[i17];
                if (i18 == 1 || i18 == i11 - 2) {
                    Arrays.fill(zArr2, i16, (i16 + i9) - 1, i18 > 1);
                    i16 += i9 - 1;
                } else {
                    int i19 = i9 - 1;
                    while (i19 >= 0) {
                        int i20 = i16 + 1;
                        zArr2[i16] = ((1 << i19) & i18) != 0;
                        i19--;
                        i16 = i20;
                    }
                }
            }
            return zArr2;
        } catch (e e9) {
            throw g.b(e9);
        }
    }

    public D6.e c(C2990a c2990a) throws g {
        this.f52852a = c2990a;
        boolean[] zArrB = b(d(c2990a.a()));
        D6.e eVar = new D6.e(a(zArrB), f(zArrB), null, null);
        eVar.l(zArrB.length);
        return eVar;
    }

    public final boolean[] d(D6.b bVar) {
        boolean zE = this.f52852a.e();
        int iD = this.f52852a.d();
        int i9 = (zE ? 11 : 14) + (iD << 2);
        int[] iArr = new int[i9];
        boolean[] zArr = new boolean[j(iD, zE)];
        int i10 = 2;
        if (zE) {
            for (int i11 = 0; i11 < i9; i11++) {
                iArr[i11] = i11;
            }
        } else {
            int i12 = i9 / 2;
            int i13 = ((i9 + 1) + (((i12 - 1) / 15) * 2)) / 2;
            for (int i14 = 0; i14 < i12; i14++) {
                iArr[(i12 - i14) - 1] = (i13 - r12) - 1;
                iArr[i12 + i14] = (i14 / 15) + i14 + i13 + 1;
            }
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < iD) {
            int i17 = ((iD - i15) << i10) + (zE ? 9 : 12);
            int i18 = i15 << 1;
            int i19 = (i9 - 1) - i18;
            int i20 = 0;
            while (i20 < i17) {
                int i21 = i20 << 1;
                int i22 = 0;
                while (i22 < i10) {
                    int i23 = i18 + i22;
                    int i24 = i18 + i20;
                    zArr[i16 + i21 + i22] = bVar.f(iArr[i23], iArr[i24]);
                    int i25 = iArr[i24];
                    int i26 = i19 - i22;
                    zArr[(i17 * 2) + i16 + i21 + i22] = bVar.f(i25, iArr[i26]);
                    int i27 = i19 - i20;
                    zArr[(i17 * 4) + i16 + i21 + i22] = bVar.f(iArr[i26], iArr[i27]);
                    zArr[(i17 * 6) + i16 + i21 + i22] = bVar.f(iArr[i27], iArr[i23]);
                    i22++;
                    iD = iD;
                    zE = zE;
                    i10 = 2;
                }
                i20++;
                i10 = 2;
            }
            i16 += i17 << 3;
            i15++;
            i10 = 2;
        }
        return zArr;
    }
}
