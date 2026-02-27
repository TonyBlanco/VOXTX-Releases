package y1;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: y1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2982a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2982a f52130b = new C2982a(Collections.emptyMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f52131a;

    public C2982a(Map map) {
        this.f52131a = map;
    }

    public boolean a(String str) {
        return this.f52131a.containsKey(str);
    }
}
