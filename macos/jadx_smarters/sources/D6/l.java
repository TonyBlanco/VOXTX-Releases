package D6;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f1491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f1492b;

    static {
        String strName = Charset.defaultCharset().name();
        f1491a = strName;
        f1492b = "SJIS".equalsIgnoreCase(strName) || "EUC_JP".equalsIgnoreCase(strName);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(byte[] r21, java.util.Map r22) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D6.l.a(byte[], java.util.Map):java.lang.String");
    }
}
