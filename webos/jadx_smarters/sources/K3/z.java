package K3;

import K3.a;
import K3.y;
import O2.C0897l1;
import d4.AbstractC1684a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f3802a = Pattern.compile("([a-z])=\\s?(.+)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f3803b = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f3804c = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    public static void a(y.b bVar, a.b bVar2) throws C0897l1 {
        try {
            bVar.n(bVar2.j());
        } catch (IllegalArgumentException | IllegalStateException e9) {
            throw C0897l1.c(null, e9);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x019e, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static K3.y b(java.lang.String r12) throws O2.C0897l1 {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K3.z.b(java.lang.String):K3.y");
    }

    public static a.b c(String str) throws C0897l1 {
        Matcher matcher = f3804c.matcher(str);
        if (!matcher.matches()) {
            throw C0897l1.c("Malformed SDP media description line: " + str, null);
        }
        try {
            return new a.b((String) AbstractC1684a.e(matcher.group(1)), Integer.parseInt((String) AbstractC1684a.e(matcher.group(2))), (String) AbstractC1684a.e(matcher.group(3)), Integer.parseInt((String) AbstractC1684a.e(matcher.group(4))));
        } catch (NumberFormatException e9) {
            throw C0897l1.c("Malformed SDP media description line: " + str, e9);
        }
    }
}
