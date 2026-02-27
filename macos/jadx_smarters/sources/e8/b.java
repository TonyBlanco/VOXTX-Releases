package E8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends a {
    public static final boolean d(char c9, char c10, boolean z9) {
        if (c9 == c10) {
            return true;
        }
        if (!z9) {
            return false;
        }
        char upperCase = Character.toUpperCase(c9);
        char upperCase2 = Character.toUpperCase(c10);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
