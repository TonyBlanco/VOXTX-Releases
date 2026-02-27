package z1;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: z1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3012k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f52656a = new LinkedHashMap();

    public Collection a() {
        return this.f52656a.values();
    }

    public Set b(C3010i c3010i) {
        C3010i c3010i2 = (C3010i) this.f52656a.get(c3010i.g());
        if (c3010i2 != null) {
            return c3010i2.h(c3010i);
        }
        this.f52656a.put(c3010i.g(), c3010i);
        return Collections.emptySet();
    }
}
