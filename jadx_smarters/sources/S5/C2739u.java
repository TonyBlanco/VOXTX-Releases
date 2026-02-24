package s5;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import s5.AbstractC2741w;

/* JADX INFO: renamed from: s5.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2739u extends AbstractMap implements InterfaceC2729j, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object[] f50121a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Object[] f50122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient int f50123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f50124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int[] f50125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient int[] f50126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient int[] f50127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient int[] f50128i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public transient int f50129j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public transient int f50130k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public transient int[] f50131l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public transient int[] f50132m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public transient Set f50133n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public transient Set f50134o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public transient Set f50135p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public transient InterfaceC2729j f50136q;

    /* JADX INFO: renamed from: s5.u$a */
    public final class a extends AbstractC2724e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f50137a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f50138c;

        public a(int i9) {
            this.f50137a = O.a(C2739u.this.f50121a[i9]);
            this.f50138c = i9;
        }

        public void a() {
            int i9 = this.f50138c;
            if (i9 != -1) {
                C2739u c2739u = C2739u.this;
                if (i9 <= c2739u.f50123d && r5.j.a(c2739u.f50121a[i9], this.f50137a)) {
                    return;
                }
            }
            this.f50138c = C2739u.this.p(this.f50137a);
        }

        @Override // s5.AbstractC2724e, java.util.Map.Entry
        public Object getKey() {
            return this.f50137a;
        }

        @Override // s5.AbstractC2724e, java.util.Map.Entry
        public Object getValue() {
            a();
            int i9 = this.f50138c;
            return i9 == -1 ? O.b() : O.a(C2739u.this.f50122c[i9]);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            a();
            int i9 = this.f50138c;
            if (i9 == -1) {
                C2739u.this.put(this.f50137a, obj);
                return O.b();
            }
            Object objA = O.a(C2739u.this.f50122c[i9]);
            if (r5.j.a(objA, obj)) {
                return obj;
            }
            C2739u.this.G(this.f50138c, obj, false);
            return objA;
        }
    }

    /* JADX INFO: renamed from: s5.u$b */
    public static final class b extends AbstractC2724e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2739u f50140a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f50141c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f50142d;

        public b(C2739u c2739u, int i9) {
            this.f50140a = c2739u;
            this.f50141c = O.a(c2739u.f50122c[i9]);
            this.f50142d = i9;
        }

        private void a() {
            int i9 = this.f50142d;
            if (i9 != -1) {
                C2739u c2739u = this.f50140a;
                if (i9 <= c2739u.f50123d && r5.j.a(this.f50141c, c2739u.f50122c[i9])) {
                    return;
                }
            }
            this.f50142d = this.f50140a.r(this.f50141c);
        }

        @Override // s5.AbstractC2724e, java.util.Map.Entry
        public Object getKey() {
            return this.f50141c;
        }

        @Override // s5.AbstractC2724e, java.util.Map.Entry
        public Object getValue() {
            a();
            int i9 = this.f50142d;
            return i9 == -1 ? O.b() : O.a(this.f50140a.f50121a[i9]);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            a();
            int i9 = this.f50142d;
            if (i9 == -1) {
                this.f50140a.z(this.f50141c, obj, false);
                return O.b();
            }
            Object objA = O.a(this.f50140a.f50121a[i9]);
            if (r5.j.a(objA, obj)) {
                return obj;
            }
            this.f50140a.F(this.f50142d, obj, false);
            return objA;
        }
    }

    /* JADX INFO: renamed from: s5.u$c */
    public final class c extends h {
        public c() {
            super(C2739u.this);
        }

        @Override // s5.C2739u.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry a(int i9) {
            return C2739u.this.new a(i9);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iP = C2739u.this.p(key);
            return iP != -1 && r5.j.a(value, C2739u.this.f50122c[iP]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iC = AbstractC2740v.c(key);
            int iQ = C2739u.this.q(key, iC);
            if (iQ == -1 || !r5.j.a(value, C2739u.this.f50122c[iQ])) {
                return false;
            }
            C2739u.this.C(iQ, iC);
            return true;
        }
    }

    /* JADX INFO: renamed from: s5.u$d */
    public static class d extends AbstractMap implements InterfaceC2729j, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2739u f50144a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public transient Set f50145c;

        public d(C2739u c2739u) {
            this.f50144a = c2739u;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set values() {
            return this.f50144a.keySet();
        }

        @Override // s5.InterfaceC2729j
        public Object b(Object obj, Object obj2) {
            return this.f50144a.z(obj, obj2, true);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f50144a.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f50144a.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(Object obj) {
            return this.f50144a.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            Set set = this.f50145c;
            if (set != null) {
                return set;
            }
            e eVar = new e(this.f50144a);
            this.f50145c = eVar;
            return eVar;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            return this.f50144a.t(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return this.f50144a.values();
        }

        @Override // s5.InterfaceC2729j
        public InterfaceC2729j l() {
            return this.f50144a;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            return this.f50144a.z(obj, obj2, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            return this.f50144a.E(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f50144a.f50123d;
        }
    }

    /* JADX INFO: renamed from: s5.u$e */
    public static class e extends h {
        public e(C2739u c2739u) {
            super(c2739u);
        }

        @Override // s5.C2739u.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry a(int i9) {
            return new b(this.f50148a, i9);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iR = this.f50148a.r(key);
            return iR != -1 && r5.j.a(this.f50148a.f50121a[iR], value);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iC = AbstractC2740v.c(key);
            int iS = this.f50148a.s(key, iC);
            if (iS == -1 || !r5.j.a(this.f50148a.f50121a[iS], value)) {
                return false;
            }
            this.f50148a.D(iS, iC);
            return true;
        }
    }

    /* JADX INFO: renamed from: s5.u$f */
    public final class f extends h {
        public f() {
            super(C2739u.this);
        }

        @Override // s5.C2739u.h
        public Object a(int i9) {
            return O.a(C2739u.this.f50121a[i9]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C2739u.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iC = AbstractC2740v.c(obj);
            int iQ = C2739u.this.q(obj, iC);
            if (iQ == -1) {
                return false;
            }
            C2739u.this.C(iQ, iC);
            return true;
        }
    }

    /* JADX INFO: renamed from: s5.u$g */
    public final class g extends h {
        public g() {
            super(C2739u.this);
        }

        @Override // s5.C2739u.h
        public Object a(int i9) {
            return O.a(C2739u.this.f50122c[i9]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C2739u.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iC = AbstractC2740v.c(obj);
            int iS = C2739u.this.s(obj, iC);
            if (iS == -1) {
                return false;
            }
            C2739u.this.D(iS, iC);
            return true;
        }
    }

    /* JADX INFO: renamed from: s5.u$h */
    public static abstract class h extends AbstractSet {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2739u f50148a;

        /* JADX INFO: renamed from: s5.u$h$a */
        public class a implements Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f50149a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f50150c = -1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f50151d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f50152e;

            public a() {
                this.f50149a = h.this.f50148a.f50129j;
                C2739u c2739u = h.this.f50148a;
                this.f50151d = c2739u.f50124e;
                this.f50152e = c2739u.f50123d;
            }

            public final void b() {
                if (h.this.f50148a.f50124e != this.f50151d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f50149a != -2 && this.f50152e > 0;
            }

            @Override // java.util.Iterator
            public Object next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object objA = h.this.a(this.f50149a);
                this.f50150c = this.f50149a;
                this.f50149a = h.this.f50148a.f50132m[this.f50149a];
                this.f50152e--;
                return objA;
            }

            @Override // java.util.Iterator
            public void remove() {
                b();
                AbstractC2731l.c(this.f50150c != -1);
                h.this.f50148a.A(this.f50150c);
                int i9 = this.f50149a;
                C2739u c2739u = h.this.f50148a;
                if (i9 == c2739u.f50123d) {
                    this.f50149a = this.f50150c;
                }
                this.f50150c = -1;
                this.f50151d = c2739u.f50124e;
            }
        }

        public h(C2739u c2739u) {
            this.f50148a = c2739u;
        }

        public abstract Object a(int i9);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f50148a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f50148a.f50123d;
        }
    }

    public C2739u(int i9) {
        u(i9);
    }

    public static C2739u g() {
        return h(16);
    }

    public static C2739u h(int i9) {
        return new C2739u(i9);
    }

    public static int[] i(int i9) {
        int[] iArr = new int[i9];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public static int[] n(int[] iArr, int i9) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, i9);
        Arrays.fill(iArrCopyOf, length, i9, -1);
        return iArrCopyOf;
    }

    public void A(int i9) {
        C(i9, AbstractC2740v.c(this.f50121a[i9]));
    }

    public final void B(int i9, int i10, int i11) {
        r5.m.d(i9 != -1);
        j(i9, i10);
        k(i9, i11);
        H(this.f50131l[i9], this.f50132m[i9]);
        x(this.f50123d - 1, i9);
        Object[] objArr = this.f50121a;
        int i12 = this.f50123d;
        objArr[i12 - 1] = null;
        this.f50122c[i12 - 1] = null;
        this.f50123d = i12 - 1;
        this.f50124e++;
    }

    public void C(int i9, int i10) {
        B(i9, i10, AbstractC2740v.c(this.f50122c[i9]));
    }

    public void D(int i9, int i10) {
        B(i9, AbstractC2740v.c(this.f50121a[i9]), i10);
    }

    public Object E(Object obj) {
        int iC = AbstractC2740v.c(obj);
        int iS = s(obj, iC);
        if (iS == -1) {
            return null;
        }
        Object obj2 = this.f50121a[iS];
        D(iS, iC);
        return obj2;
    }

    public final void F(int i9, Object obj, boolean z9) {
        int i10;
        r5.m.d(i9 != -1);
        int iC = AbstractC2740v.c(obj);
        int iQ = q(obj, iC);
        int i11 = this.f50130k;
        if (iQ == -1) {
            i10 = -2;
        } else {
            if (!z9) {
                String strValueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 28);
                sb.append("Key already present in map: ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            i11 = this.f50131l[iQ];
            i10 = this.f50132m[iQ];
            C(iQ, iC);
            if (i9 == this.f50123d) {
                i9 = iQ;
            }
        }
        if (i11 == i9) {
            i11 = this.f50131l[i9];
        } else if (i11 == this.f50123d) {
            i11 = iQ;
        }
        if (i10 == i9) {
            iQ = this.f50132m[i9];
        } else if (i10 != this.f50123d) {
            iQ = i10;
        }
        H(this.f50131l[i9], this.f50132m[i9]);
        j(i9, AbstractC2740v.c(this.f50121a[i9]));
        this.f50121a[i9] = obj;
        v(i9, AbstractC2740v.c(obj));
        H(i11, i9);
        H(i9, iQ);
    }

    public final void G(int i9, Object obj, boolean z9) {
        r5.m.d(i9 != -1);
        int iC = AbstractC2740v.c(obj);
        int iS = s(obj, iC);
        if (iS != -1) {
            if (!z9) {
                String strValueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 30);
                sb.append("Value already present in map: ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            D(iS, iC);
            if (i9 == this.f50123d) {
                i9 = iS;
            }
        }
        k(i9, AbstractC2740v.c(this.f50122c[i9]));
        this.f50122c[i9] = obj;
        w(i9, iC);
    }

    public final void H(int i9, int i10) {
        if (i9 == -2) {
            this.f50129j = i10;
        } else {
            this.f50132m[i9] = i10;
        }
        if (i10 == -2) {
            this.f50130k = i9;
        } else {
            this.f50131l[i10] = i9;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public Set values() {
        Set set = this.f50134o;
        if (set != null) {
            return set;
        }
        g gVar = new g();
        this.f50134o = gVar;
        return gVar;
    }

    @Override // s5.InterfaceC2729j
    public Object b(Object obj, Object obj2) {
        return y(obj, obj2, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f50121a, 0, this.f50123d, (Object) null);
        Arrays.fill(this.f50122c, 0, this.f50123d, (Object) null);
        Arrays.fill(this.f50125f, -1);
        Arrays.fill(this.f50126g, -1);
        Arrays.fill(this.f50127h, 0, this.f50123d, -1);
        Arrays.fill(this.f50128i, 0, this.f50123d, -1);
        Arrays.fill(this.f50131l, 0, this.f50123d, -1);
        Arrays.fill(this.f50132m, 0, this.f50123d, -1);
        this.f50123d = 0;
        this.f50129j = -2;
        this.f50130k = -2;
        this.f50124e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return p(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        return r(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f50135p;
        if (set != null) {
            return set;
        }
        c cVar = new c();
        this.f50135p = cVar;
        return cVar;
    }

    public final int f(int i9) {
        return i9 & (this.f50125f.length - 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int iP = p(obj);
        if (iP == -1) {
            return null;
        }
        return this.f50122c[iP];
    }

    public final void j(int i9, int i10) {
        r5.m.d(i9 != -1);
        int iF = f(i10);
        int[] iArr = this.f50125f;
        int i11 = iArr[iF];
        if (i11 == i9) {
            int[] iArr2 = this.f50127h;
            iArr[iF] = iArr2[i9];
            iArr2[i9] = -1;
            return;
        }
        int i12 = this.f50127h[i11];
        while (true) {
            int i13 = i11;
            i11 = i12;
            if (i11 == -1) {
                String strValueOf = String.valueOf(this.f50121a[i9]);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 32);
                sb.append("Expected to find entry with key ");
                sb.append(strValueOf);
                throw new AssertionError(sb.toString());
            }
            if (i11 == i9) {
                int[] iArr3 = this.f50127h;
                iArr3[i13] = iArr3[i9];
                iArr3[i9] = -1;
                return;
            }
            i12 = this.f50127h[i11];
        }
    }

    public final void k(int i9, int i10) {
        r5.m.d(i9 != -1);
        int iF = f(i10);
        int[] iArr = this.f50126g;
        int i11 = iArr[iF];
        if (i11 == i9) {
            int[] iArr2 = this.f50128i;
            iArr[iF] = iArr2[i9];
            iArr2[i9] = -1;
            return;
        }
        int i12 = this.f50128i[i11];
        while (true) {
            int i13 = i11;
            i11 = i12;
            if (i11 == -1) {
                String strValueOf = String.valueOf(this.f50122c[i9]);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 34);
                sb.append("Expected to find entry with value ");
                sb.append(strValueOf);
                throw new AssertionError(sb.toString());
            }
            if (i11 == i9) {
                int[] iArr3 = this.f50128i;
                iArr3[i13] = iArr3[i9];
                iArr3[i9] = -1;
                return;
            }
            i12 = this.f50128i[i11];
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f50133n;
        if (set != null) {
            return set;
        }
        f fVar = new f();
        this.f50133n = fVar;
        return fVar;
    }

    @Override // s5.InterfaceC2729j
    public InterfaceC2729j l() {
        InterfaceC2729j interfaceC2729j = this.f50136q;
        if (interfaceC2729j != null) {
            return interfaceC2729j;
        }
        d dVar = new d(this);
        this.f50136q = dVar;
        return dVar;
    }

    public final void m(int i9) {
        int[] iArr = this.f50127h;
        if (iArr.length < i9) {
            int iC = AbstractC2741w.b.c(iArr.length, i9);
            this.f50121a = Arrays.copyOf(this.f50121a, iC);
            this.f50122c = Arrays.copyOf(this.f50122c, iC);
            this.f50127h = n(this.f50127h, iC);
            this.f50128i = n(this.f50128i, iC);
            this.f50131l = n(this.f50131l, iC);
            this.f50132m = n(this.f50132m, iC);
        }
        if (this.f50125f.length < i9) {
            int iA = AbstractC2740v.a(i9, 1.0d);
            this.f50125f = i(iA);
            this.f50126g = i(iA);
            for (int i10 = 0; i10 < this.f50123d; i10++) {
                int iF = f(AbstractC2740v.c(this.f50121a[i10]));
                int[] iArr2 = this.f50127h;
                int[] iArr3 = this.f50125f;
                iArr2[i10] = iArr3[iF];
                iArr3[iF] = i10;
                int iF2 = f(AbstractC2740v.c(this.f50122c[i10]));
                int[] iArr4 = this.f50128i;
                int[] iArr5 = this.f50126g;
                iArr4[i10] = iArr5[iF2];
                iArr5[iF2] = i10;
            }
        }
    }

    public int o(Object obj, int i9, int[] iArr, int[] iArr2, Object[] objArr) {
        int i10 = iArr[f(i9)];
        while (i10 != -1) {
            if (r5.j.a(objArr[i10], obj)) {
                return i10;
            }
            i10 = iArr2[i10];
        }
        return -1;
    }

    public int p(Object obj) {
        return q(obj, AbstractC2740v.c(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        return y(obj, obj2, false);
    }

    public int q(Object obj, int i9) {
        return o(obj, i9, this.f50125f, this.f50127h, this.f50121a);
    }

    public int r(Object obj) {
        return s(obj, AbstractC2740v.c(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        int iC = AbstractC2740v.c(obj);
        int iQ = q(obj, iC);
        if (iQ == -1) {
            return null;
        }
        Object obj2 = this.f50122c[iQ];
        C(iQ, iC);
        return obj2;
    }

    public int s(Object obj, int i9) {
        return o(obj, i9, this.f50126g, this.f50128i, this.f50122c);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f50123d;
    }

    public Object t(Object obj) {
        int iR = r(obj);
        if (iR == -1) {
            return null;
        }
        return this.f50121a[iR];
    }

    public void u(int i9) {
        AbstractC2731l.b(i9, "expectedSize");
        int iA = AbstractC2740v.a(i9, 1.0d);
        this.f50123d = 0;
        this.f50121a = new Object[i9];
        this.f50122c = new Object[i9];
        this.f50125f = i(iA);
        this.f50126g = i(iA);
        this.f50127h = i(i9);
        this.f50128i = i(i9);
        this.f50129j = -2;
        this.f50130k = -2;
        this.f50131l = i(i9);
        this.f50132m = i(i9);
    }

    public final void v(int i9, int i10) {
        r5.m.d(i9 != -1);
        int iF = f(i10);
        int[] iArr = this.f50127h;
        int[] iArr2 = this.f50125f;
        iArr[i9] = iArr2[iF];
        iArr2[iF] = i9;
    }

    public final void w(int i9, int i10) {
        r5.m.d(i9 != -1);
        int iF = f(i10);
        int[] iArr = this.f50128i;
        int[] iArr2 = this.f50126g;
        iArr[i9] = iArr2[iF];
        iArr2[iF] = i9;
    }

    public final void x(int i9, int i10) {
        int i11;
        int i12;
        if (i9 == i10) {
            return;
        }
        int i13 = this.f50131l[i9];
        int i14 = this.f50132m[i9];
        H(i13, i10);
        H(i10, i14);
        Object[] objArr = this.f50121a;
        Object obj = objArr[i9];
        Object[] objArr2 = this.f50122c;
        Object obj2 = objArr2[i9];
        objArr[i10] = obj;
        objArr2[i10] = obj2;
        int iF = f(AbstractC2740v.c(obj));
        int[] iArr = this.f50125f;
        int i15 = iArr[iF];
        if (i15 == i9) {
            iArr[iF] = i10;
        } else {
            int i16 = this.f50127h[i15];
            while (true) {
                i11 = i15;
                i15 = i16;
                if (i15 == i9) {
                    break;
                } else {
                    i16 = this.f50127h[i15];
                }
            }
            this.f50127h[i11] = i10;
        }
        int[] iArr2 = this.f50127h;
        iArr2[i10] = iArr2[i9];
        iArr2[i9] = -1;
        int iF2 = f(AbstractC2740v.c(obj2));
        int[] iArr3 = this.f50126g;
        int i17 = iArr3[iF2];
        if (i17 == i9) {
            iArr3[iF2] = i10;
        } else {
            int i18 = this.f50128i[i17];
            while (true) {
                i12 = i17;
                i17 = i18;
                if (i17 == i9) {
                    break;
                } else {
                    i18 = this.f50128i[i17];
                }
            }
            this.f50128i[i12] = i10;
        }
        int[] iArr4 = this.f50128i;
        iArr4[i10] = iArr4[i9];
        iArr4[i9] = -1;
    }

    public Object y(Object obj, Object obj2, boolean z9) {
        int iC = AbstractC2740v.c(obj);
        int iQ = q(obj, iC);
        if (iQ != -1) {
            Object obj3 = this.f50122c[iQ];
            if (r5.j.a(obj3, obj2)) {
                return obj2;
            }
            G(iQ, obj2, z9);
            return obj3;
        }
        int iC2 = AbstractC2740v.c(obj2);
        int iS = s(obj2, iC2);
        if (!z9) {
            r5.m.h(iS == -1, "Value already present: %s", obj2);
        } else if (iS != -1) {
            D(iS, iC2);
        }
        m(this.f50123d + 1);
        Object[] objArr = this.f50121a;
        int i9 = this.f50123d;
        objArr[i9] = obj;
        this.f50122c[i9] = obj2;
        v(i9, iC);
        w(this.f50123d, iC2);
        H(this.f50130k, this.f50123d);
        H(this.f50123d, -2);
        this.f50123d++;
        this.f50124e++;
        return null;
    }

    public Object z(Object obj, Object obj2, boolean z9) {
        int iC = AbstractC2740v.c(obj);
        int iS = s(obj, iC);
        if (iS != -1) {
            Object obj3 = this.f50121a[iS];
            if (r5.j.a(obj3, obj2)) {
                return obj2;
            }
            F(iS, obj2, z9);
            return obj3;
        }
        int i9 = this.f50130k;
        int iC2 = AbstractC2740v.c(obj2);
        int iQ = q(obj2, iC2);
        if (!z9) {
            r5.m.h(iQ == -1, "Key already present: %s", obj2);
        } else if (iQ != -1) {
            i9 = this.f50131l[iQ];
            C(iQ, iC2);
        }
        m(this.f50123d + 1);
        Object[] objArr = this.f50121a;
        int i10 = this.f50123d;
        objArr[i10] = obj2;
        this.f50122c[i10] = obj;
        v(i10, iC2);
        w(this.f50123d, iC);
        int i11 = i9 == -2 ? this.f50129j : this.f50132m[i9];
        H(i9, this.f50123d);
        H(this.f50123d, i11);
        this.f50123d++;
        this.f50124e++;
        return null;
    }
}
