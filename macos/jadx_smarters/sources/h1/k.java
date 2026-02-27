package h1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f41541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f41542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f41543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f41544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f41545f;

    public k(int i9, byte[] bArr, Map map, List list, boolean z9, long j9) {
        this.f41540a = i9;
        this.f41541b = bArr;
        this.f41542c = map;
        this.f41543d = list == null ? null : Collections.unmodifiableList(list);
        this.f41544e = z9;
        this.f41545f = j9;
    }

    public k(int i9, byte[] bArr, Map map, boolean z9, long j9) {
        this(i9, bArr, map, a(map), z9, j9);
    }

    public k(int i9, byte[] bArr, boolean z9, long j9, List list) {
        this(i9, bArr, b(list), list, z9, j9);
    }

    public k(byte[] bArr, Map map) {
        this(200, bArr, map, false, 0L);
    }

    public static List a(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new g((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    public static Map b(List list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            treeMap.put(gVar.a(), gVar.b());
        }
        return treeMap;
    }
}
