package E8;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1732c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f1733a;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(String pattern) {
        kotlin.jvm.internal.l.e(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        kotlin.jvm.internal.l.d(patternCompile, "compile(pattern)");
        this(patternCompile);
    }

    public e(Pattern nativePattern) {
        kotlin.jvm.internal.l.e(nativePattern, "nativePattern");
        this.f1733a = nativePattern;
    }

    public final boolean a(CharSequence input) {
        kotlin.jvm.internal.l.e(input, "input");
        return this.f1733a.matcher(input).matches();
    }

    public final String b(CharSequence input, String replacement) {
        kotlin.jvm.internal.l.e(input, "input");
        kotlin.jvm.internal.l.e(replacement, "replacement");
        String strReplaceAll = this.f1733a.matcher(input).replaceAll(replacement);
        kotlin.jvm.internal.l.d(strReplaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return strReplaceAll;
    }

    public String toString() {
        String string = this.f1733a.toString();
        kotlin.jvm.internal.l.d(string, "nativePattern.toString()");
        return string;
    }
}
