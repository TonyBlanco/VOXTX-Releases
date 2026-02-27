package j$.util.concurrent;

import com.amazonaws.services.s3.internal.Constants;

/* JADX INFO: loaded from: classes2.dex */
abstract class u {
    static String a(Object obj, Object obj2) {
        String string;
        String string2;
        String str = Constants.NULL_VERSION_ID;
        if (obj == null || (string = obj.toString()) == null) {
            string = Constants.NULL_VERSION_ID;
        }
        int length = string.length();
        if (obj2 != null && (string2 = obj2.toString()) != null) {
            str = string2;
        }
        int length2 = str.length();
        char[] cArr = new char[length + length2 + 1];
        string.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        str.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }
}
