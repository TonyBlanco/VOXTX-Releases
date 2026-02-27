package F3;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f2019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f2020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f2021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2022d;

    public n(String[] strArr, int[] iArr, String[] strArr2, int i9) {
        this.f2019a = strArr;
        this.f2020b = iArr;
        this.f2021c = strArr2;
        this.f2022d = i9;
    }

    public static n b(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new n(strArr, iArr, strArr2, c(str, strArr, iArr, strArr2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(java.lang.String r12, java.lang.String[] r13, int[] r14, java.lang.String[] r15) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.n.c(java.lang.String, java.lang.String[], int[], java.lang.String[]):int");
    }

    public String a(String str, long j9, int i9, long j10) {
        String str2;
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        while (true) {
            int i11 = this.f2022d;
            if (i10 >= i11) {
                sb.append(this.f2019a[i11]);
                return sb.toString();
            }
            sb.append(this.f2019a[i10]);
            int i12 = this.f2020b[i10];
            if (i12 == 1) {
                sb.append(str);
            } else {
                if (i12 == 2) {
                    str2 = String.format(Locale.US, this.f2021c[i10], Long.valueOf(j9));
                } else if (i12 == 3) {
                    str2 = String.format(Locale.US, this.f2021c[i10], Integer.valueOf(i9));
                } else if (i12 == 4) {
                    str2 = String.format(Locale.US, this.f2021c[i10], Long.valueOf(j10));
                }
                sb.append(str2);
            }
            i10++;
        }
    }
}
