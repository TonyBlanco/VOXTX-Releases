package org.apache.http.client.utils;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.util.StringTokenizer;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

/* JADX INFO: loaded from: classes4.dex */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
public class Rfc3492Idn implements Idn {
    private static final String ACE_PREFIX = "xn--";
    private static final int base = 36;
    private static final int damp = 700;
    private static final char delimiter = '-';
    private static final int initial_bias = 72;
    private static final int initial_n = 128;
    private static final int skew = 38;
    private static final int tmax = 26;
    private static final int tmin = 1;

    private int adapt(int i9, int i10, boolean z9) {
        int i11 = z9 ? i9 / 700 : i9 / 2;
        int i12 = i11 + (i11 / i10);
        int i13 = 0;
        while (i12 > 455) {
            i12 /= 35;
            i13 += base;
        }
        return i13 + ((i12 * base) / (i12 + skew));
    }

    private int digit(char c9) {
        if (c9 >= 'A' && c9 <= 'Z') {
            return c9 - 'A';
        }
        if (c9 >= 'a' && c9 <= 'z') {
            return c9 - 'a';
        }
        if (c9 >= '0' && c9 <= '9') {
            return c9 - 22;
        }
        throw new IllegalArgumentException("illegal digit: " + c9);
    }

    public String decode(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int iLastIndexOf = str.lastIndexOf(45);
        int length = 128;
        int iAdapt = initial_bias;
        if (iLastIndexOf != -1) {
            sb.append(str.subSequence(0, iLastIndexOf));
            str = str.substring(iLastIndexOf + 1);
        }
        int i9 = 0;
        while (!str.isEmpty()) {
            int i10 = base;
            int i11 = i9;
            int i12 = 1;
            while (!str.isEmpty()) {
                char cCharAt = str.charAt(0);
                str = str.substring(1);
                int iDigit = digit(cCharAt);
                i11 += iDigit * i12;
                int i13 = i10 <= iAdapt + 1 ? 1 : i10 >= iAdapt + tmax ? tmax : i10 - iAdapt;
                if (iDigit < i13) {
                    break;
                }
                i12 *= 36 - i13;
                i10 += base;
            }
            iAdapt = adapt(i11 - i9, sb.length() + 1, i9 == 0);
            length += i11 / (sb.length() + 1);
            int length2 = i11 % (sb.length() + 1);
            sb.insert(length2, (char) length);
            i9 = length2 + 1;
        }
        return sb.toString();
    }

    @Override // org.apache.http.client.utils.Idn
    public String toUnicode(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        StringTokenizer stringTokenizer = new StringTokenizer(str, InstructionFileId.DOT);
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (sb.length() > 0) {
                sb.append('.');
            }
            if (strNextToken.startsWith(ACE_PREFIX)) {
                strNextToken = decode(strNextToken.substring(4));
            }
            sb.append(strNextToken);
        }
        return sb.toString();
    }
}
