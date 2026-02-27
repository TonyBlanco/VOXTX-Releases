package E0;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f1537a = new String[0];

    public static void a(StringBuilder sb, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            sb.append("?");
            if (i10 < i9 - 1) {
                sb.append(",");
            }
        }
    }

    public static StringBuilder b() {
        return new StringBuilder();
    }
}
