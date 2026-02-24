package l8;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l8.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2205B extends AbstractC2204A {
    public static Map d() {
        v vVar = v.f44261a;
        kotlin.jvm.internal.l.c(vVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return vVar;
    }

    public static Map e(k8.i... pairs) {
        kotlin.jvm.internal.l.e(pairs, "pairs");
        return pairs.length > 0 ? m(pairs, new LinkedHashMap(AbstractC2204A.a(pairs.length))) : d();
    }

    public static Map f(k8.i... pairs) {
        kotlin.jvm.internal.l.e(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2204A.a(pairs.length));
        i(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final Map g(Map map) {
        kotlin.jvm.internal.l.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : AbstractC2204A.c(map) : d();
    }

    public static final void h(Map map, Iterable pairs) {
        kotlin.jvm.internal.l.e(map, "<this>");
        kotlin.jvm.internal.l.e(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            k8.i iVar = (k8.i) it.next();
            map.put(iVar.a(), iVar.b());
        }
    }

    public static final void i(Map map, k8.i[] pairs) {
        kotlin.jvm.internal.l.e(map, "<this>");
        kotlin.jvm.internal.l.e(pairs, "pairs");
        for (k8.i iVar : pairs) {
            map.put(iVar.a(), iVar.b());
        }
    }

    public static Map j(Iterable iterable) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return g(k(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return d();
        }
        if (size != 1) {
            return k(iterable, new LinkedHashMap(AbstractC2204A.a(collection.size())));
        }
        return AbstractC2204A.b((k8.i) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    public static final Map k(Iterable iterable, Map destination) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        kotlin.jvm.internal.l.e(destination, "destination");
        h(destination, iterable);
        return destination;
    }

    public static Map l(Map map) {
        kotlin.jvm.internal.l.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? n(map) : AbstractC2204A.c(map) : d();
    }

    public static final Map m(k8.i[] iVarArr, Map destination) {
        kotlin.jvm.internal.l.e(iVarArr, "<this>");
        kotlin.jvm.internal.l.e(destination, "destination");
        i(destination, iVarArr);
        return destination;
    }

    public static Map n(Map map) {
        kotlin.jvm.internal.l.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
