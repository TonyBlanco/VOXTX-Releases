package G5;

import java.util.Map;

/* JADX INFO: renamed from: G5.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0555w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f2248b;

    public C0555w(String str, Map map) {
        this.f2247a = str;
        this.f2248b = map;
    }

    public Map a() {
        return this.f2248b;
    }

    public String b() {
        Map map = (Map) this.f2248b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }
}
