package l8;

import com.google.android.gms.common.api.a;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l8.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2204A extends z {
    public static int a(int i9) {
        return i9 < 0 ? i9 : i9 < 3 ? i9 + 1 : i9 < 1073741824 ? (int) ((i9 / 0.75f) + 1.0f) : a.e.API_PRIORITY_OTHER;
    }

    public static final Map b(k8.i pair) {
        kotlin.jvm.internal.l.e(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.c(), pair.d());
        kotlin.jvm.internal.l.d(mapSingletonMap, "singletonMap(pair.first, pair.second)");
        return mapSingletonMap;
    }

    public static final Map c(Map map) {
        kotlin.jvm.internal.l.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.l.d(mapSingletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return mapSingletonMap;
    }
}
