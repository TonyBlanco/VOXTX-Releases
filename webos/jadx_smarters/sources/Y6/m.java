package Y6;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import x6.EnumC2964e;

/* JADX INFO: loaded from: classes.dex */
public class m implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Collection f10710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f10711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10713d;

    public m() {
    }

    public m(Collection collection, Map map, String str, int i9) {
        this.f10710a = collection;
        this.f10711b = map;
        this.f10712c = str;
        this.f10713d = i9;
    }

    @Override // Y6.j
    public i a(Map map) {
        EnumMap enumMap = new EnumMap(EnumC2964e.class);
        enumMap.putAll(map);
        Map map2 = this.f10711b;
        if (map2 != null) {
            enumMap.putAll(map2);
        }
        Collection collection = this.f10710a;
        if (collection != null) {
            enumMap.put(EnumC2964e.POSSIBLE_FORMATS, collection);
        }
        String str = this.f10712c;
        if (str != null) {
            enumMap.put(EnumC2964e.CHARACTER_SET, str);
        }
        x6.j jVar = new x6.j();
        jVar.e(enumMap);
        int i9 = this.f10713d;
        return i9 != 0 ? i9 != 1 ? i9 != 2 ? new i(jVar) : new o(jVar) : new n(jVar) : new i(jVar);
    }
}
