package Q2;

import O2.C0897l1;
import d4.AbstractC1681B;
import org.apache.http.util.LangUtils;

/* JADX INFO: renamed from: Q2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1015a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f7729a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f7730b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: Q2.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f7733c;

        public b(int i9, int i10, String str) {
            this.f7731a = i9;
            this.f7732b = i10;
            this.f7733c = str;
        }
    }

    public static byte[] a(int i9, int i10) {
        int i11 = 0;
        int i12 = 0;
        int i13 = -1;
        while (true) {
            int[] iArr = f7729a;
            if (i12 >= iArr.length) {
                break;
            }
            if (i9 == iArr[i12]) {
                i13 = i12;
            }
            i12++;
        }
        int i14 = -1;
        while (true) {
            int[] iArr2 = f7730b;
            if (i11 >= iArr2.length) {
                break;
            }
            if (i10 == iArr2[i11]) {
                i14 = i11;
            }
            i11++;
        }
        if (i9 != -1 && i14 != -1) {
            return b(2, i13, i14);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i9 + ", " + i10);
    }

    public static byte[] b(int i9, int i10, int i11) {
        return new byte[]{(byte) (((i9 << 3) & 248) | ((i10 >> 1) & 7)), (byte) (((i10 << 7) & 128) | ((i11 << 3) & 120))};
    }

    public static int c(d4.L l9) {
        int iH = l9.h(5);
        return iH == 31 ? l9.h(6) + 32 : iH;
    }

    public static int d(d4.L l9) throws C0897l1 {
        int iH = l9.h(4);
        if (iH == 15) {
            if (l9.b() >= 24) {
                return l9.h(24);
            }
            throw C0897l1.a("AAC header insufficient data", null);
        }
        if (iH < 13) {
            return f7729a[iH];
        }
        throw C0897l1.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static b e(d4.L l9, boolean z9) throws C0897l1 {
        int iC = c(l9);
        int iD = d(l9);
        int iH = l9.h(4);
        String str = "mp4a.40." + iC;
        if (iC == 5 || iC == 29) {
            iD = d(l9);
            iC = c(l9);
            if (iC == 22) {
                iH = l9.h(4);
            }
        }
        if (z9) {
            if (iC != 1 && iC != 2 && iC != 3 && iC != 4 && iC != 6 && iC != 7 && iC != 17) {
                switch (iC) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C0897l1.e("Unsupported audio object type: " + iC);
                }
            }
            g(l9, iC, iH);
            switch (iC) {
                case LangUtils.HASH_SEED /* 17 */:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iH2 = l9.h(2);
                    if (iH2 == 2 || iH2 == 3) {
                        throw C0897l1.e("Unsupported epConfig: " + iH2);
                    }
                    break;
            }
        }
        int i9 = f7730b[iH];
        if (i9 != -1) {
            return new b(iD, i9, str);
        }
        throw C0897l1.a(null, null);
    }

    public static b f(byte[] bArr) {
        return e(new d4.L(bArr), false);
    }

    public static void g(d4.L l9, int i9, int i10) {
        if (l9.g()) {
            AbstractC1681B.j("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (l9.g()) {
            l9.r(14);
        }
        boolean zG = l9.g();
        if (i10 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i9 == 6 || i9 == 20) {
            l9.r(3);
        }
        if (zG) {
            if (i9 == 22) {
                l9.r(16);
            }
            if (i9 == 17 || i9 == 19 || i9 == 20 || i9 == 23) {
                l9.r(3);
            }
            l9.r(1);
        }
    }
}
