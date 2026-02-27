package l8;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p extends o {
    public static boolean q(Collection collection, Iterable elements) {
        kotlin.jvm.internal.l.e(collection, "<this>");
        kotlin.jvm.internal.l.e(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator it = elements.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z9 = true;
            }
        }
        return z9;
    }

    public static boolean r(Collection collection, Object[] elements) {
        kotlin.jvm.internal.l.e(collection, "<this>");
        kotlin.jvm.internal.l.e(elements, "elements");
        return collection.addAll(AbstractC2212g.b(elements));
    }
}
