package E8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static int a(int i9) {
        if (new B8.c(2, 36).l(i9)) {
            return i9;
        }
        throw new IllegalArgumentException("radix " + i9 + " was not in valid range " + new B8.c(2, 36));
    }

    public static final int b(char c9, int i9) {
        return Character.digit((int) c9, i9);
    }

    public static final boolean c(char c9) {
        return Character.isWhitespace(c9) || Character.isSpaceChar(c9);
    }
}
