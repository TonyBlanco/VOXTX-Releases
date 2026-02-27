package s5;

import j$.util.Map;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import s5.AbstractC2741w;

/* JADX INFO: renamed from: s5.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2717A implements Map, Serializable, j$.util.Map {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map.Entry[] f49965e = new Map.Entry[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient AbstractC2719C f49966a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient AbstractC2719C f49967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient AbstractC2741w f49968d;

    /* JADX INFO: renamed from: s5.A$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Comparator f49969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object[] f49970b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f49971c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f49972d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C0440a f49973e;

        /* JADX INFO: renamed from: s5.A$a$a, reason: collision with other inner class name */
        public static final class C0440a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f49974a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f49975b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f49976c;

            public C0440a(Object obj, Object obj2, Object obj3) {
                this.f49974a = obj;
                this.f49975b = obj2;
                this.f49976c = obj3;
            }

            public IllegalArgumentException a() {
                String strValueOf = String.valueOf(this.f49974a);
                String strValueOf2 = String.valueOf(this.f49975b);
                String strValueOf3 = String.valueOf(this.f49974a);
                String strValueOf4 = String.valueOf(this.f49976c);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 39 + strValueOf2.length() + strValueOf3.length() + strValueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(strValueOf);
                sb.append("=");
                sb.append(strValueOf2);
                sb.append(" and ");
                sb.append(strValueOf3);
                sb.append("=");
                sb.append(strValueOf4);
                return new IllegalArgumentException(sb.toString());
            }
        }

        public a() {
            this(4);
        }

        public a(int i9) {
            this.f49970b = new Object[i9 * 2];
            this.f49971c = 0;
            this.f49972d = false;
        }

        public static void i(Object[] objArr, int i9, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                int i11 = i10 * 2;
                Object obj = objArr[i11];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i11 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i10] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i9, Q.a(comparator).e(I.m()));
            for (int i12 = 0; i12 < i9; i12++) {
                int i13 = i12 * 2;
                objArr[i13] = entryArr[i12].getKey();
                objArr[i13 + 1] = entryArr[i12].getValue();
            }
        }

        public AbstractC2717A a() {
            return c();
        }

        public final AbstractC2717A b(boolean z9) {
            Object[] objArrE;
            C0440a c0440a;
            C0440a c0440a2;
            if (z9 && (c0440a2 = this.f49973e) != null) {
                throw c0440a2.a();
            }
            int length = this.f49971c;
            if (this.f49969a == null) {
                objArrE = this.f49970b;
            } else {
                if (this.f49972d) {
                    this.f49970b = Arrays.copyOf(this.f49970b, length * 2);
                }
                objArrE = this.f49970b;
                if (!z9) {
                    objArrE = e(objArrE, this.f49971c);
                    if (objArrE.length < this.f49970b.length) {
                        length = objArrE.length >>> 1;
                    }
                }
                i(objArrE, length, this.f49969a);
            }
            this.f49972d = true;
            U uP = U.p(length, objArrE, this);
            if (!z9 || (c0440a = this.f49973e) == null) {
                return uP;
            }
            throw c0440a.a();
        }

        public AbstractC2717A c() {
            return b(true);
        }

        public final void d(int i9) {
            int i10 = i9 * 2;
            Object[] objArr = this.f49970b;
            if (i10 > objArr.length) {
                this.f49970b = Arrays.copyOf(objArr, AbstractC2741w.b.c(objArr.length, i10));
                this.f49972d = false;
            }
        }

        public final Object[] e(Object[] objArr, int i9) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i10 = i9 - 1; i10 >= 0; i10--) {
                Object obj = objArr[i10 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i10);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i9 - bitSet.cardinality()) * 2];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i9 * 2) {
                if (bitSet.get(i11 >>> 1)) {
                    i11 += 2;
                } else {
                    int i13 = i12 + 1;
                    int i14 = i11 + 1;
                    Object obj2 = objArr[i11];
                    Objects.requireNonNull(obj2);
                    objArr2[i12] = obj2;
                    i12 += 2;
                    i11 += 2;
                    Object obj3 = objArr[i14];
                    Objects.requireNonNull(obj3);
                    objArr2[i13] = obj3;
                }
            }
            return objArr2;
        }

        public a f(Object obj, Object obj2) {
            d(this.f49971c + 1);
            AbstractC2731l.a(obj, obj2);
            Object[] objArr = this.f49970b;
            int i9 = this.f49971c;
            objArr[i9 * 2] = obj;
            objArr[(i9 * 2) + 1] = obj2;
            this.f49971c = i9 + 1;
            return this;
        }

        public a g(Map.Entry entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a h(Iterable iterable) {
            if (iterable instanceof Collection) {
                d(this.f49971c + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                g((Map.Entry) it.next());
            }
            return this;
        }
    }

    public static a a() {
        return new a();
    }

    public static AbstractC2717A c(Iterable iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static AbstractC2717A d(Map map) {
        if ((map instanceof AbstractC2717A) && !(map instanceof SortedMap)) {
            AbstractC2717A abstractC2717A = (AbstractC2717A) map;
            if (!abstractC2717A.i()) {
                return abstractC2717A;
            }
        }
        return c(map.entrySet());
    }

    public static AbstractC2717A k() {
        return U.f50015i;
    }

    public static AbstractC2717A m(Object obj, Object obj2) {
        AbstractC2731l.a(obj, obj2);
        return U.o(1, new Object[]{obj, obj2});
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
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
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract AbstractC2719C e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return I.c(this, obj);
    }

    public abstract AbstractC2719C f();

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public abstract AbstractC2741w g();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public AbstractC2719C entrySet() {
        AbstractC2719C abstractC2719C = this.f49966a;
        if (abstractC2719C != null) {
            return abstractC2719C;
        }
        AbstractC2719C abstractC2719CE = e();
        this.f49966a = abstractC2719CE;
        return abstractC2719CE;
    }

    @Override // java.util.Map
    public int hashCode() {
        return Z.d(entrySet());
    }

    public abstract boolean i();

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC2719C keySet() {
        AbstractC2719C abstractC2719C = this.f49967c;
        if (abstractC2719C != null) {
            return abstractC2719C;
        }
        AbstractC2719C abstractC2719CF = f();
        this.f49967c = abstractC2719CF;
        return abstractC2719CF;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public AbstractC2741w values() {
        AbstractC2741w abstractC2741w = this.f49968d;
        if (abstractC2741w != null) {
            return abstractC2741w;
        }
        AbstractC2741w abstractC2741wG = g();
        this.f49968d = abstractC2741wG;
        return abstractC2741wG;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public String toString() {
        return I.l(this);
    }
}
