package b0;

import b0.d;
import java.util.Arrays;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final d a() {
        return new C1194a(null, true, 1, null);
    }

    public static final C1194a b(d.b... pairs) {
        l.e(pairs, "pairs");
        C1194a c1194a = new C1194a(null, false, 1, null);
        c1194a.g((d.b[]) Arrays.copyOf(pairs, pairs.length));
        return c1194a;
    }
}
