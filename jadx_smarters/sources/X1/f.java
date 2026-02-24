package x1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f51878a;

    public f(int i9) {
        this.f51878a = new HashMap(i9);
    }

    public Map a() {
        return Collections.unmodifiableMap(this.f51878a);
    }

    public f b(Object obj, Object obj2) {
        this.f51878a.put(obj, obj2);
        return this;
    }
}
