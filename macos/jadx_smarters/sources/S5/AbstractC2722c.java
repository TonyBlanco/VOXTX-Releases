package s5;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: s5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2722c extends AbstractC2723d implements F {
    public AbstractC2722c(Map map) {
        super(map);
    }

    @Override // s5.AbstractC2725f, s5.J
    public Map b() {
        return super.b();
    }

    @Override // s5.AbstractC2725f
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // s5.AbstractC2723d, s5.J
    public List get(Object obj) {
        return (List) super.get(obj);
    }

    @Override // s5.AbstractC2723d, s5.J
    public boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // s5.AbstractC2723d
    public Collection x(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // s5.AbstractC2723d
    public Collection y(Object obj, Collection collection) {
        return z(obj, (List) collection, null);
    }
}
