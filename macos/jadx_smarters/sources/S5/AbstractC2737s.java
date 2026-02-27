package s5;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: s5.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2737s extends AbstractC2738t implements Map {
    public abstract Map c();

    @Override // java.util.Map
    public void clear() {
        c().clear();
    }

    public boolean containsKey(Object obj) {
        return c().containsKey(obj);
    }

    public boolean d(Object obj) {
        return I.b(this, obj);
    }

    public boolean e(Object obj) {
        return I.c(this, obj);
    }

    public Set entrySet() {
        return c().entrySet();
    }

    public int f() {
        return Z.d(entrySet());
    }

    public Object get(Object obj) {
        return c().get(obj);
    }

    public boolean isEmpty() {
        return c().isEmpty();
    }

    public Set keySet() {
        return c().keySet();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return c().put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        c().putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return c().remove(obj);
    }

    public int size() {
        return c().size();
    }

    @Override // java.util.Map
    public Collection values() {
        return c().values();
    }
}
