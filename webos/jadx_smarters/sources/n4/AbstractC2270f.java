package n4;

import java.util.Collection;

/* JADX INFO: renamed from: n4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2270f {
    public static String a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        }
        G0 g02 = new G0(null);
        G0.a(g02, str);
        return I0.a(G0.c(g02));
    }

    public static String b(String str, Collection collection) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        }
        if (collection == null) {
            throw new IllegalArgumentException("namespaces cannot be null");
        }
        G0 g02 = new G0(null);
        G0.a(g02, str);
        G0.b(g02, collection);
        return I0.a(G0.c(g02));
    }
}
