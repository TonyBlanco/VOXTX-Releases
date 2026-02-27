package E8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q extends p {
    public static final String E0(String str, int i9) {
        kotlin.jvm.internal.l.e(str, "<this>");
        if (i9 >= 0) {
            String strSubstring = str.substring(B8.h.e(i9, str.length()));
            kotlin.jvm.internal.l.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i9 + " is less than zero.").toString());
    }

    public static String F0(String str, int i9) {
        kotlin.jvm.internal.l.e(str, "<this>");
        if (i9 >= 0) {
            String strSubstring = str.substring(0, B8.h.e(i9, str.length()));
            kotlin.jvm.internal.l.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i9 + " is less than zero.").toString());
    }
}
