package l8;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class E extends D {
    public static Set b() {
        return w.f44262a;
    }

    public static final Set c(Set set) {
        kotlin.jvm.internal.l.e(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : D.a(set.iterator().next()) : b();
    }
}
