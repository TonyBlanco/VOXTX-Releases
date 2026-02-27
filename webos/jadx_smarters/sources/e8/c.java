package E8;

import java.nio.charset.Charset;
import org.apache.commons.codec.CharEncoding;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f1713a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f1714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f1715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f1716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f1717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f1718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Charset f1719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Charset f1720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Charset f1721i;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        kotlin.jvm.internal.l.d(charsetForName, "forName(\"UTF-8\")");
        f1714b = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        kotlin.jvm.internal.l.d(charsetForName2, "forName(\"UTF-16\")");
        f1715c = charsetForName2;
        Charset charsetForName3 = Charset.forName(CharEncoding.UTF_16BE);
        kotlin.jvm.internal.l.d(charsetForName3, "forName(\"UTF-16BE\")");
        f1716d = charsetForName3;
        Charset charsetForName4 = Charset.forName(CharEncoding.UTF_16LE);
        kotlin.jvm.internal.l.d(charsetForName4, "forName(\"UTF-16LE\")");
        f1717e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        kotlin.jvm.internal.l.d(charsetForName5, "forName(\"US-ASCII\")");
        f1718f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.l.d(charsetForName6, "forName(\"ISO-8859-1\")");
        f1719g = charsetForName6;
    }

    public final Charset a() {
        Charset charset = f1721i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        kotlin.jvm.internal.l.d(charsetForName, "forName(\"UTF-32BE\")");
        f1721i = charsetForName;
        return charsetForName;
    }

    public final Charset b() {
        Charset charset = f1720h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        kotlin.jvm.internal.l.d(charsetForName, "forName(\"UTF-32LE\")");
        f1720h = charsetForName;
        return charsetForName;
    }
}
