package com.google.ads.interactivemedia.v3.internal;

import java.util.Locale;
import org.achartengine.chart.TimeChart;

/* JADX INFO: loaded from: classes3.dex */
public final class mn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f23804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f23805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f23806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23807d;

    private mn(String[] strArr, int[] iArr, String[] strArr2, int i9) {
        this.f23804a = strArr;
        this.f23805b = iArr;
        this.f23806c = strArr2;
        this.f23807d = i9;
    }

    public static mn a(String str) {
        String strSubstring;
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = "";
        int length = 0;
        int i9 = 0;
        while (length < str.length()) {
            int iIndexOf = str.indexOf("$", length);
            byte b9 = -1;
            if (iIndexOf == -1) {
                strArr[i9] = String.valueOf(strArr[i9]).concat(String.valueOf(str.substring(length)));
                length = str.length();
            } else if (iIndexOf != length) {
                strArr[i9] = String.valueOf(strArr[i9]).concat(String.valueOf(str.substring(length, iIndexOf)));
                length = iIndexOf;
            } else if (str.startsWith("$$", length)) {
                strArr[i9] = String.valueOf(strArr[i9]).concat("$");
                length += 2;
            } else {
                int i10 = length + 1;
                int iIndexOf2 = str.indexOf("$", i10);
                String strSubstring2 = str.substring(i10, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    iArr[i9] = 1;
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring.concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    int iHashCode = strSubstring2.hashCode();
                    if (iHashCode != -1950496919) {
                        if (iHashCode != 2606829) {
                            if (iHashCode == 38199441 && strSubstring2.equals("Bandwidth")) {
                                b9 = 1;
                            }
                        } else if (strSubstring2.equals(TimeChart.TYPE)) {
                            b9 = 2;
                        }
                    } else if (strSubstring2.equals("Number")) {
                        b9 = 0;
                    }
                    if (b9 == 0) {
                        iArr[i9] = 2;
                    } else if (b9 == 1) {
                        iArr[i9] = 3;
                    } else {
                        if (b9 != 2) {
                            throw new IllegalArgumentException("Invalid template: ".concat(str));
                        }
                        iArr[i9] = 4;
                    }
                    strArr2[i9] = strSubstring;
                }
                i9++;
                strArr[i9] = "";
                length = iIndexOf2 + 1;
            }
        }
        return new mn(strArr, iArr, strArr2, i9);
    }

    public final String b(String str, long j9, int i9, long j10) {
        String str2;
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        while (true) {
            int i11 = this.f23807d;
            if (i10 >= i11) {
                sb.append(this.f23804a[i11]);
                return sb.toString();
            }
            sb.append(this.f23804a[i10]);
            int i12 = this.f23805b[i10];
            if (i12 == 1) {
                sb.append(str);
            } else {
                if (i12 == 2) {
                    str2 = String.format(Locale.US, this.f23806c[i10], Long.valueOf(j9));
                } else if (i12 == 3) {
                    str2 = String.format(Locale.US, this.f23806c[i10], Integer.valueOf(i9));
                } else if (i12 == 4) {
                    str2 = String.format(Locale.US, this.f23806c[i10], Long.valueOf(j10));
                }
                sb.append(str2);
            }
            i10++;
        }
    }
}
