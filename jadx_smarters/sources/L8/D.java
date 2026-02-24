package l8;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class D {
    public static final Set a(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        kotlin.jvm.internal.l.d(setSingleton, "singleton(element)");
        return setSingleton;
    }
}
