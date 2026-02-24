package org.apache.http;

/* JADX INFO: loaded from: classes4.dex */
public class HttpException extends Exception {
    private static final int FIRST_VALID_CHAR = 32;
    private static final long serialVersionUID = -5437299376222011036L;

    public HttpException() {
    }

    public HttpException(String str) {
        super(clean(str));
    }

    public HttpException(String str, Throwable th) {
        super(clean(str));
        initCause(th);
    }

    public static String clean(String str) {
        char[] charArray = str.toCharArray();
        int i9 = 0;
        while (i9 < charArray.length && charArray[i9] >= ' ') {
            i9++;
        }
        if (i9 == charArray.length) {
            return str;
        }
        StringBuilder sb = new StringBuilder(charArray.length * 2);
        for (int i10 = 0; i10 < charArray.length; i10++) {
            char c9 = charArray[i10];
            if (c9 < ' ') {
                sb.append("[0x");
                String hexString = Integer.toHexString(i10);
                if (hexString.length() == 1) {
                    sb.append("0");
                }
                sb.append(hexString);
                sb.append("]");
            } else {
                sb.append(c9);
            }
        }
        return sb.toString();
    }
}
