package r5;

import org.apache.http.message.TokenParser;

/* JADX INFO: renamed from: r5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2674c implements n {

    /* JADX INFO: renamed from: r5.c$a */
    public static abstract class a extends AbstractC2674c {
        @Override // r5.n
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.b((Character) obj);
        }
    }

    /* JADX INFO: renamed from: r5.c$b */
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final char f49719a;

        public b(char c9) {
            this.f49719a = c9;
        }

        @Override // r5.AbstractC2674c
        public boolean e(char c9) {
            return c9 == this.f49719a;
        }

        public String toString() {
            String strG = AbstractC2674c.g(this.f49719a);
            StringBuilder sb = new StringBuilder(String.valueOf(strG).length() + 18);
            sb.append("CharMatcher.is('");
            sb.append(strG);
            sb.append("')");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: r5.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0433c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f49720a;

        public AbstractC0433c(String str) {
            this.f49720a = (String) m.k(str);
        }

        public final String toString() {
            return this.f49720a;
        }
    }

    /* JADX INFO: renamed from: r5.c$d */
    public static final class d extends AbstractC0433c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f49721c = new d();

        public d() {
            super("CharMatcher.none()");
        }

        @Override // r5.AbstractC2674c
        public int c(CharSequence charSequence, int i9) {
            m.m(i9, charSequence.length());
            return -1;
        }

        @Override // r5.AbstractC2674c
        public boolean e(char c9) {
            return false;
        }
    }

    public static AbstractC2674c d(char c9) {
        return new b(c9);
    }

    public static AbstractC2674c f() {
        return d.f49721c;
    }

    public static String g(char c9) {
        char[] cArr = new char[6];
        cArr[0] = TokenParser.ESCAPE;
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i9 = 0; i9 < 4; i9++) {
            cArr[5 - i9] = "0123456789ABCDEF".charAt(c9 & 15);
            c9 = (char) (c9 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public boolean b(Character ch) {
        return e(ch.charValue());
    }

    public int c(CharSequence charSequence, int i9) {
        int length = charSequence.length();
        m.m(i9, length);
        while (i9 < length) {
            if (e(charSequence.charAt(i9))) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public abstract boolean e(char c9);
}
