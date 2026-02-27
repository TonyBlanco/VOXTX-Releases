package s;

import j$.util.Map;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: s.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2695a extends i implements Map, j$.util.Map {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h f49802i;

    /* JADX INFO: renamed from: s.a$a, reason: collision with other inner class name */
    public class C0438a extends h {
        public C0438a() {
        }

        @Override // s.h
        public void a() {
            C2695a.this.clear();
        }

        @Override // s.h
        public Object b(int i9, int i10) {
            return C2695a.this.f49851c[(i9 << 1) + i10];
        }

        @Override // s.h
        public Map c() {
            return C2695a.this;
        }

        @Override // s.h
        public int d() {
            return C2695a.this.f49852d;
        }

        @Override // s.h
        public int e(Object obj) {
            return C2695a.this.g(obj);
        }

        @Override // s.h
        public int f(Object obj) {
            return C2695a.this.i(obj);
        }

        @Override // s.h
        public void g(Object obj, Object obj2) {
            C2695a.this.put(obj, obj2);
        }

        @Override // s.h
        public void h(int i9) {
            C2695a.this.m(i9);
        }

        @Override // s.h
        public Object i(int i9, Object obj) {
            return C2695a.this.n(i9, obj);
        }
    }

    public C2695a() {
    }

    public C2695a(int i9) {
        super(i9);
    }

    public C2695a(i iVar) {
        super(iVar);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public Set entrySet() {
        return p().l();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public Set keySet() {
        return p().m();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    public final h p() {
        if (this.f49802i == null) {
            this.f49802i = new C0438a();
        }
        return this.f49802i;
    }

    @Override // java.util.Map
    public void putAll(java.util.Map map) {
        d(this.f49852d + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean q(Collection collection) {
        return h.p(this, collection);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public Collection values() {
        return p().n();
    }
}
