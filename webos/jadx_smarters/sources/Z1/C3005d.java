package z1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: z1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3005d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f52624b = Pattern.compile("ApolloCacheReference\\{(.*)\\}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52625a;

    public C3005d(String str) {
        this.f52625a = str;
    }

    public static boolean a(String str) {
        return f52624b.matcher(str).matches();
    }

    public static C3005d b(String str) {
        Matcher matcher = f52624b.matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            return new C3005d(matcher.group(1));
        }
        throw new IllegalArgumentException("Not a cache reference: " + str + " Must be of the form:ApolloCacheReference{%s}");
    }

    public String c() {
        return this.f52625a;
    }

    public String d() {
        return String.format("ApolloCacheReference{%s}", this.f52625a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3005d.class != obj.getClass()) {
            return false;
        }
        String str = this.f52625a;
        String str2 = ((C3005d) obj).f52625a;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.f52625a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return this.f52625a;
    }
}
