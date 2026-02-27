package N7;

import O7.b;
import O7.d;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5377a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f5378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f5379c;

    static {
        String canonicalName = b.class.getCanonicalName();
        if (canonicalName == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        f5378b = canonicalName;
        String canonicalName2 = d.class.getCanonicalName();
        if (canonicalName2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        f5379c = canonicalName2;
    }

    public final String a() {
        return f5378b;
    }

    public final String b() {
        return f5379c;
    }
}
