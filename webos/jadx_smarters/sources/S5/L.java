package s5;

import java.util.AbstractCollection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class L {

    public static class a extends AbstractC2722c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public transient r5.r f50010h;

        public a(Map map, r5.r rVar) {
            super(map);
            this.f50010h = (r5.r) r5.m.k(rVar);
        }

        @Override // s5.AbstractC2723d
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public List r() {
            return (List) this.f50010h.get();
        }

        @Override // s5.AbstractC2723d, s5.AbstractC2725f
        public Map e() {
            return t();
        }

        @Override // s5.AbstractC2723d, s5.AbstractC2725f
        public Set g() {
            return u();
        }
    }

    public static abstract class b extends AbstractCollection {
        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            d().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return d().c(entry.getKey(), entry.getValue());
        }

        public abstract J d();

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return d().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return d().size();
        }
    }

    public static boolean a(J j9, Object obj) {
        if (obj == j9) {
            return true;
        }
        if (obj instanceof J) {
            return j9.b().equals(((J) obj).b());
        }
        return false;
    }

    public static F b(Map map, r5.r rVar) {
        return new a(map, rVar);
    }
}
