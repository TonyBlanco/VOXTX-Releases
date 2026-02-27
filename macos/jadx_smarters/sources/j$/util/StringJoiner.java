package j$.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class StringJoiner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f42237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f42238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f42239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String[] f42240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f42242f;

    public StringJoiner(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        Objects.a(charSequence2, "The prefix must not be null");
        Objects.a(charSequence, "The delimiter must not be null");
        Objects.a(charSequence3, "The suffix must not be null");
        this.f42237a = charSequence2.toString();
        this.f42238b = charSequence.toString();
        this.f42239c = charSequence3.toString();
    }

    private static int a(String str, char[] cArr, int i9) {
        int length = str.length();
        str.getChars(0, length, cArr, i9);
        return length;
    }

    public StringJoiner add(CharSequence charSequence) {
        String strValueOf = String.valueOf(charSequence);
        String[] strArr = this.f42240d;
        if (strArr == null) {
            this.f42240d = new String[8];
        } else {
            int i9 = this.f42241e;
            if (i9 == strArr.length) {
                this.f42240d = (String[]) Arrays.copyOf(strArr, i9 * 2);
            }
            this.f42242f = this.f42238b.length() + this.f42242f;
        }
        this.f42242f = strValueOf.length() + this.f42242f;
        String[] strArr2 = this.f42240d;
        int i10 = this.f42241e;
        this.f42241e = i10 + 1;
        strArr2[i10] = strValueOf;
        return this;
    }

    public final String toString() {
        String[] strArr;
        String[] strArr2 = this.f42240d;
        int i9 = this.f42241e;
        String str = this.f42237a;
        int length = str.length();
        String str2 = this.f42239c;
        int length2 = str2.length() + length;
        String str3 = this.f42238b;
        if (length2 != 0) {
            char[] cArr = new char[this.f42242f + length2];
            int iA = a(str, cArr, 0);
            if (i9 > 0) {
                iA += a(strArr2[0], cArr, iA);
                for (int i10 = 1; i10 < i9; i10++) {
                    int iA2 = iA + a(str3, cArr, iA);
                    iA = iA2 + a(strArr2[i10], cArr, iA2);
                }
            }
            a(str2, cArr, iA);
            return new String(cArr);
        }
        if (this.f42241e > 1) {
            char[] cArr2 = new char[this.f42242f];
            int iA3 = a(this.f42240d[0], cArr2, 0);
            int i11 = 1;
            do {
                int iA4 = iA3 + a(str3, cArr2, iA3);
                iA3 = iA4 + a(this.f42240d[i11], cArr2, iA4);
                strArr = this.f42240d;
                strArr[i11] = null;
                i11++;
            } while (i11 < this.f42241e);
            this.f42241e = 1;
            strArr[0] = new String(cArr2);
        }
        return i9 == 0 ? "" : strArr2[0];
    }
}
