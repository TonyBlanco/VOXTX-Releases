package s5;

import com.google.android.gms.common.api.a;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import r5.InterfaceC2677f;
import s5.Z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class I {

    public class a extends b0 {
        public a(Iterator it) {
            super(it);
        }

        @Override // s5.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Object a(Map.Entry entry) {
            return entry.getValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class b implements InterfaceC2677f {
        public static final b KEY = new a("KEY", 0);
        public static final b VALUE = new C0441b("VALUE", 1);
        private static final /* synthetic */ b[] $VALUES = $values();

        public enum a extends b {
            public a(String str, int i9) {
                super(str, i9, null);
            }

            @Override // s5.I.b, r5.InterfaceC2677f
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* JADX INFO: renamed from: s5.I$b$b, reason: collision with other inner class name */
        public enum C0441b extends b {
            public C0441b(String str, int i9) {
                super(str, i9, null);
            }

            @Override // s5.I.b, r5.InterfaceC2677f
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private static /* synthetic */ b[] $values() {
            return new b[]{KEY, VALUE};
        }

        private b(String str, int i9) {
        }

        public /* synthetic */ b(String str, int i9, H h9) {
            this(str, i9);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        @Override // r5.InterfaceC2677f
        public abstract /* synthetic */ Object apply(Object obj);
    }

    public static abstract class c extends Z.d {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            d().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        public abstract Map d();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return d().isEmpty();
        }

        @Override // s5.Z.d, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) r5.m.k(collection));
            } catch (UnsupportedOperationException unused) {
                return Z.j(this, collection.iterator());
            }
        }

        @Override // s5.Z.d, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) r5.m.k(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetG = Z.g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetG.add(((Map.Entry) obj).getKey());
                    }
                }
                return d().keySet().retainAll(hashSetG);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d().size();
        }
    }

    public static class d extends Z.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f50001a;

        public d(Map map) {
            this.f50001a = (Map) r5.m.k(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return d().containsKey(obj);
        }

        public Map d() {
            return this.f50001a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return d().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d().size();
        }
    }

    public static class e extends AbstractCollection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f50002a;

        public e(Map map) {
            this.f50002a = (Map) r5.m.k(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            d().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return d().containsValue(obj);
        }

        public final Map d() {
            return this.f50002a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return d().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return I.n(d().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : d().entrySet()) {
                    if (r5.j.a(obj, entry.getValue())) {
                        d().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) r5.m.k(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetF = Z.f();
                for (Map.Entry entry : d().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetF.add(entry.getKey());
                    }
                }
                return d().keySet().removeAll(hashSetF);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) r5.m.k(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetF = Z.f();
                for (Map.Entry entry : d().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetF.add(entry.getKey());
                    }
                }
                return d().keySet().retainAll(hashSetF);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return d().size();
        }
    }

    public static abstract class f extends AbstractMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public transient Set f50003a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public transient Collection f50004c;

        public abstract Set a();

        public Collection c() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            Set set = this.f50003a;
            if (set != null) {
                return set;
            }
            Set setA = a();
            this.f50003a = setA;
            return setA;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection values() {
            Collection collection = this.f50004c;
            if (collection != null) {
                return collection;
            }
            Collection collectionC = c();
            this.f50004c = collectionC;
            return collectionC;
        }
    }

    public static int a(int i9) {
        if (i9 >= 3) {
            return i9 < 1073741824 ? (int) ((i9 / 0.75f) + 1.0f) : a.e.API_PRIORITY_OTHER;
        }
        AbstractC2731l.b(i9, "expectedSize");
        return i9 + 1;
    }

    public static boolean b(Map map, Object obj) {
        return E.d(n(map.entrySet().iterator()), obj);
    }

    public static boolean c(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static Map.Entry d(Object obj, Object obj2) {
        return new C2742x(obj, obj2);
    }

    public static InterfaceC2677f e() {
        return b.KEY;
    }

    public static HashMap f() {
        return new HashMap();
    }

    public static IdentityHashMap g() {
        return new IdentityHashMap();
    }

    public static LinkedHashMap h() {
        return new LinkedHashMap();
    }

    public static boolean i(Map map, Object obj) {
        r5.m.k(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static Object j(Map map, Object obj) {
        r5.m.k(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static Object k(Map map, Object obj) {
        r5.m.k(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String l(Map map) {
        StringBuilder sbB = AbstractC2732m.b(map.size());
        sbB.append('{');
        boolean z9 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z9) {
                sbB.append(", ");
            }
            sbB.append(entry.getKey());
            sbB.append('=');
            sbB.append(entry.getValue());
            z9 = false;
        }
        sbB.append('}');
        return sbB.toString();
    }

    public static InterfaceC2677f m() {
        return b.VALUE;
    }

    public static Iterator n(Iterator it) {
        return new a(it);
    }
}
