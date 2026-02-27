package v1;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import v1.InterfaceC2868f;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f51269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f51271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f51272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f51273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f51274f;

    public static final class a extends k {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final s f51275g;

        public a(String str, String str2, Map map, boolean z9, s sVar, List list) {
            super(b.CUSTOM, str, str2, map, z9, list, null);
            this.f51275g = sVar;
        }

        public s m() {
            return this.f51275g;
        }
    }

    public enum b {
        STRING,
        INT,
        LONG,
        DOUBLE,
        BOOLEAN,
        ENUM,
        OBJECT,
        LIST,
        CUSTOM,
        FRAGMENT,
        INLINE_FRAGMENT
    }

    public k(b bVar, String str, String str2, Map map, boolean z9, List list) {
        this.f51269a = bVar;
        this.f51270b = str;
        this.f51271c = str2;
        this.f51272d = map == null ? Collections.emptyMap() : Collections.unmodifiableMap(map);
        this.f51273e = z9;
        this.f51274f = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }

    public /* synthetic */ k(b bVar, String str, String str2, Map map, boolean z9, List list, j jVar) {
        this(bVar, str, str2, map, z9, list);
    }

    public static a d(String str, String str2, Map map, boolean z9, s sVar, List list) {
        return new a(str, str2, map, z9, sVar, list);
    }

    public static k e(String str, String str2, Map map, boolean z9, List list) {
        return new k(b.LIST, str, str2, map, z9, list);
    }

    public static k f(String str, String str2, Map map, boolean z9, List list) {
        return new k(b.OBJECT, str, str2, map, z9, list);
    }

    public static k g(String str, String str2, Map map, boolean z9, List list) {
        return new k(b.STRING, str, str2, map, z9, list);
    }

    public static boolean h(Map map) {
        return map.containsKey("kind") && map.get("kind").equals("Variable") && map.containsKey("variableName");
    }

    public Map a() {
        return this.f51272d;
    }

    public List b() {
        return this.f51274f;
    }

    public String c() {
        return this.f51271c;
    }

    public boolean i() {
        return this.f51273e;
    }

    public Object j(String str, InterfaceC2868f.b bVar) {
        x1.g.c(str, "name == null");
        x1.g.c(bVar, "variables == null");
        Map mapValueMap = bVar.valueMap();
        Object obj = this.f51272d.get(str);
        if (!(obj instanceof Map)) {
            return obj;
        }
        Map map = (Map) obj;
        if (h(map)) {
            return mapValueMap.get(map.get("variableName").toString());
        }
        return null;
    }

    public String k() {
        return this.f51270b;
    }

    public b l() {
        return this.f51269a;
    }
}
