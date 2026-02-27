package F1;

import java.io.IOException;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import okio.Buffer;
import v1.InterfaceC2868f;
import v1.k;

/* JADX INFO: loaded from: classes.dex */
public class f implements F1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f1880a = new a();

    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    @Override // F1.a
    public String a(k kVar, InterfaceC2868f.b bVar) {
        x1.g.c(kVar, "field == null");
        x1.g.c(bVar, "variables == null");
        if (kVar.a().isEmpty()) {
            return kVar.c();
        }
        Map mapB = b(kVar.a(), bVar);
        try {
            Buffer buffer = new Buffer();
            J1.h hVarI = J1.h.i(buffer);
            hVarI.m(true);
            J1.j.a(mapB, hVarI);
            hVarI.close();
            return String.format("%s(%s)", kVar.c(), buffer.readUtf8());
        } catch (IOException e9) {
            throw new RuntimeException(e9);
        }
    }

    public final Map b(Map map, InterfaceC2868f.b bVar) {
        TreeMap treeMap = new TreeMap(this.f1880a);
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() instanceof Map) {
                Map map2 = (Map) entry.getValue();
                treeMap.put(entry.getKey(), k.h(map2) ? c(map2, bVar) : b(map2, bVar));
            } else {
                treeMap.put(entry.getKey(), entry.getValue());
            }
        }
        return treeMap;
    }

    public final Object c(Map map, InterfaceC2868f.b bVar) {
        Object obj = bVar.valueMap().get(map.get("variableName"));
        if (obj == null) {
            return null;
        }
        return obj instanceof Map ? b((Map) obj, bVar) : obj;
    }
}
