package s5;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: s5.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2733n extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f50092k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object f50093a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient int[] f50094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Object[] f50095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient Object[] f50096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int f50097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient int f50098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient Set f50099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient Set f50100i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public transient Collection f50101j;

    /* JADX INFO: renamed from: s5.n$a */
    public class a extends e {
        public a() {
            super(C2733n.this, null);
        }

        @Override // s5.C2733n.e
        public Object c(int i9) {
            return C2733n.this.J(i9);
        }
    }

    /* JADX INFO: renamed from: s5.n$b */
    public class b extends e {
        public b() {
            super(C2733n.this, null);
        }

        @Override // s5.C2733n.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry c(int i9) {
            return C2733n.this.new g(i9);
        }
    }

    /* JADX INFO: renamed from: s5.n$c */
    public class c extends e {
        public c() {
            super(C2733n.this, null);
        }

        @Override // s5.C2733n.e
        public Object c(int i9) {
            return C2733n.this.Z(i9);
        }
    }

    /* JADX INFO: renamed from: s5.n$d */
    public class d extends AbstractSet {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C2733n.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map mapZ = C2733n.this.z();
            if (mapZ != null) {
                return mapZ.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iG = C2733n.this.G(entry.getKey());
            return iG != -1 && r5.j.a(C2733n.this.Z(iG), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C2733n.this.B();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map mapZ = C2733n.this.z();
            if (mapZ != null) {
                return mapZ.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (C2733n.this.M()) {
                return false;
            }
            int iE = C2733n.this.E();
            int iF = AbstractC2734o.f(entry.getKey(), entry.getValue(), iE, C2733n.this.Q(), C2733n.this.O(), C2733n.this.P(), C2733n.this.R());
            if (iF == -1) {
                return false;
            }
            C2733n.this.L(iF, iE);
            C2733n.f(C2733n.this);
            C2733n.this.F();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C2733n.this.size();
        }
    }

    /* JADX INFO: renamed from: s5.n$e */
    public abstract class e implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50106a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f50107c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f50108d;

        public e() {
            this.f50106a = C2733n.this.f50097f;
            this.f50107c = C2733n.this.C();
            this.f50108d = -1;
        }

        public /* synthetic */ e(C2733n c2733n, a aVar) {
            this();
        }

        public final void b() {
            if (C2733n.this.f50097f != this.f50106a) {
                throw new ConcurrentModificationException();
            }
        }

        public abstract Object c(int i9);

        public void d() {
            this.f50106a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f50107c >= 0;
        }

        @Override // java.util.Iterator
        public Object next() {
            b();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i9 = this.f50107c;
            this.f50108d = i9;
            Object objC = c(i9);
            this.f50107c = C2733n.this.D(this.f50107c);
            return objC;
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            AbstractC2731l.c(this.f50108d >= 0);
            d();
            C2733n c2733n = C2733n.this;
            c2733n.remove(c2733n.J(this.f50108d));
            this.f50107c = C2733n.this.q(this.f50107c, this.f50108d);
            this.f50108d = -1;
        }
    }

    /* JADX INFO: renamed from: s5.n$f */
    public class f extends AbstractSet {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C2733n.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C2733n.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C2733n.this.K();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map mapZ = C2733n.this.z();
            return mapZ != null ? mapZ.keySet().remove(obj) : C2733n.this.N(obj) != C2733n.f50092k;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C2733n.this.size();
        }
    }

    /* JADX INFO: renamed from: s5.n$g */
    public final class g extends AbstractC2724e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f50111a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f50112c;

        public g(int i9) {
            this.f50111a = C2733n.this.J(i9);
            this.f50112c = i9;
        }

        public final void a() {
            int i9 = this.f50112c;
            if (i9 == -1 || i9 >= C2733n.this.size() || !r5.j.a(this.f50111a, C2733n.this.J(this.f50112c))) {
                this.f50112c = C2733n.this.G(this.f50111a);
            }
        }

        @Override // s5.AbstractC2724e, java.util.Map.Entry
        public Object getKey() {
            return this.f50111a;
        }

        @Override // s5.AbstractC2724e, java.util.Map.Entry
        public Object getValue() {
            Map mapZ = C2733n.this.z();
            if (mapZ != null) {
                return O.a(mapZ.get(this.f50111a));
            }
            a();
            int i9 = this.f50112c;
            return i9 == -1 ? O.b() : C2733n.this.Z(i9);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Map mapZ = C2733n.this.z();
            if (mapZ != null) {
                return O.a(mapZ.put(this.f50111a, obj));
            }
            a();
            int i9 = this.f50112c;
            if (i9 == -1) {
                C2733n.this.put(this.f50111a, obj);
                return O.b();
            }
            Object objZ = C2733n.this.Z(i9);
            C2733n.this.Y(this.f50112c, obj);
            return objZ;
        }
    }

    /* JADX INFO: renamed from: s5.n$h */
    public class h extends AbstractCollection {
        public h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C2733n.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C2733n.this.a0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C2733n.this.size();
        }
    }

    public C2733n() {
        H(3);
    }

    public C2733n(int i9) {
        H(i9);
    }

    public static /* synthetic */ int f(C2733n c2733n) {
        int i9 = c2733n.f50098g;
        c2733n.f50098g = i9 - 1;
        return i9;
    }

    public static C2733n t() {
        return new C2733n();
    }

    public static C2733n y(int i9) {
        return new C2733n(i9);
    }

    public final int A(int i9) {
        return O()[i9];
    }

    public Iterator B() {
        Map mapZ = z();
        return mapZ != null ? mapZ.entrySet().iterator() : new b();
    }

    public int C() {
        return isEmpty() ? -1 : 0;
    }

    public int D(int i9) {
        int i10 = i9 + 1;
        if (i10 < this.f50098g) {
            return i10;
        }
        return -1;
    }

    public final int E() {
        return (1 << (this.f50097f & 31)) - 1;
    }

    public void F() {
        this.f50097f += 32;
    }

    public final int G(Object obj) {
        if (M()) {
            return -1;
        }
        int iC = AbstractC2740v.c(obj);
        int iE = E();
        int iH = AbstractC2734o.h(Q(), iC & iE);
        if (iH == 0) {
            return -1;
        }
        int iB = AbstractC2734o.b(iC, iE);
        do {
            int i9 = iH - 1;
            int iA = A(i9);
            if (AbstractC2734o.b(iA, iE) == iB && r5.j.a(obj, J(i9))) {
                return i9;
            }
            iH = AbstractC2734o.c(iA, iE);
        } while (iH != 0);
        return -1;
    }

    public void H(int i9) {
        r5.m.e(i9 >= 0, "Expected size must be >= 0");
        this.f50097f = w5.f.f(i9, 1, 1073741823);
    }

    public void I(int i9, Object obj, Object obj2, int i10, int i11) {
        V(i9, AbstractC2734o.d(i10, 0, i11));
        X(i9, obj);
        Y(i9, obj2);
    }

    public final Object J(int i9) {
        return P()[i9];
    }

    public Iterator K() {
        Map mapZ = z();
        return mapZ != null ? mapZ.keySet().iterator() : new a();
    }

    public void L(int i9, int i10) {
        Object objQ = Q();
        int[] iArrO = O();
        Object[] objArrP = P();
        Object[] objArrR = R();
        int size = size();
        int i11 = size - 1;
        if (i9 >= i11) {
            objArrP[i9] = null;
            objArrR[i9] = null;
            iArrO[i9] = 0;
            return;
        }
        Object obj = objArrP[i11];
        objArrP[i9] = obj;
        objArrR[i9] = objArrR[i11];
        objArrP[i11] = null;
        objArrR[i11] = null;
        iArrO[i9] = iArrO[i11];
        iArrO[i11] = 0;
        int iC = AbstractC2740v.c(obj) & i10;
        int iH = AbstractC2734o.h(objQ, iC);
        if (iH == size) {
            AbstractC2734o.i(objQ, iC, i9 + 1);
            return;
        }
        while (true) {
            int i12 = iH - 1;
            int i13 = iArrO[i12];
            int iC2 = AbstractC2734o.c(i13, i10);
            if (iC2 == size) {
                iArrO[i12] = AbstractC2734o.d(i13, i9 + 1, i10);
                return;
            }
            iH = iC2;
        }
    }

    public boolean M() {
        return this.f50093a == null;
    }

    public final Object N(Object obj) {
        if (M()) {
            return f50092k;
        }
        int iE = E();
        int iF = AbstractC2734o.f(obj, null, iE, Q(), O(), P(), null);
        if (iF == -1) {
            return f50092k;
        }
        Object objZ = Z(iF);
        L(iF, iE);
        this.f50098g--;
        F();
        return objZ;
    }

    public final int[] O() {
        int[] iArr = this.f50094c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] P() {
        Object[] objArr = this.f50095d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object Q() {
        Object obj = this.f50093a;
        Objects.requireNonNull(obj);
        return obj;
    }

    public final Object[] R() {
        Object[] objArr = this.f50096e;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public void S(int i9) {
        this.f50094c = Arrays.copyOf(O(), i9);
        this.f50095d = Arrays.copyOf(P(), i9);
        this.f50096e = Arrays.copyOf(R(), i9);
    }

    public final void T(int i9) {
        int iMin;
        int length = O().length;
        if (i9 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        S(iMin);
    }

    public final int U(int i9, int i10, int i11, int i12) {
        Object objA = AbstractC2734o.a(i10);
        int i13 = i10 - 1;
        if (i12 != 0) {
            AbstractC2734o.i(objA, i11 & i13, i12 + 1);
        }
        Object objQ = Q();
        int[] iArrO = O();
        for (int i14 = 0; i14 <= i9; i14++) {
            int iH = AbstractC2734o.h(objQ, i14);
            while (iH != 0) {
                int i15 = iH - 1;
                int i16 = iArrO[i15];
                int iB = AbstractC2734o.b(i16, i9) | i14;
                int i17 = iB & i13;
                int iH2 = AbstractC2734o.h(objA, i17);
                AbstractC2734o.i(objA, i17, iH);
                iArrO[i15] = AbstractC2734o.d(iB, iH2, i13);
                iH = AbstractC2734o.c(i16, i9);
            }
        }
        this.f50093a = objA;
        W(i13);
        return i13;
    }

    public final void V(int i9, int i10) {
        O()[i9] = i10;
    }

    public final void W(int i9) {
        this.f50097f = AbstractC2734o.d(this.f50097f, 32 - Integer.numberOfLeadingZeros(i9), 31);
    }

    public final void X(int i9, Object obj) {
        P()[i9] = obj;
    }

    public final void Y(int i9, Object obj) {
        R()[i9] = obj;
    }

    public final Object Z(int i9) {
        return R()[i9];
    }

    public Iterator a0() {
        Map mapZ = z();
        return mapZ != null ? mapZ.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (M()) {
            return;
        }
        F();
        Map mapZ = z();
        if (mapZ != null) {
            this.f50097f = w5.f.f(size(), 3, 1073741823);
            mapZ.clear();
            this.f50093a = null;
        } else {
            Arrays.fill(P(), 0, this.f50098g, (Object) null);
            Arrays.fill(R(), 0, this.f50098g, (Object) null);
            AbstractC2734o.g(Q());
            Arrays.fill(O(), 0, this.f50098g, 0);
        }
        this.f50098g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map mapZ = z();
        return mapZ != null ? mapZ.containsKey(obj) : G(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map mapZ = z();
        if (mapZ != null) {
            return mapZ.containsValue(obj);
        }
        for (int i9 = 0; i9 < this.f50098g; i9++) {
            if (r5.j.a(obj, Z(i9))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f50100i;
        if (set != null) {
            return set;
        }
        Set setU = u();
        this.f50100i = setU;
        return setU;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Map mapZ = z();
        if (mapZ != null) {
            return mapZ.get(obj);
        }
        int iG = G(obj);
        if (iG == -1) {
            return null;
        }
        p(iG);
        return Z(iG);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f50099h;
        if (set != null) {
            return set;
        }
        Set setW = w();
        this.f50099h = setW;
        return setW;
    }

    public void p(int i9) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        int iU;
        if (M()) {
            r();
        }
        Map mapZ = z();
        if (mapZ != null) {
            return mapZ.put(obj, obj2);
        }
        int[] iArrO = O();
        Object[] objArrP = P();
        Object[] objArrR = R();
        int i9 = this.f50098g;
        int i10 = i9 + 1;
        int iC = AbstractC2740v.c(obj);
        int iE = E();
        int i11 = iC & iE;
        int iH = AbstractC2734o.h(Q(), i11);
        if (iH == 0) {
            if (i10 <= iE) {
                AbstractC2734o.i(Q(), i11, i10);
                iU = iE;
            }
            iU = U(iE, AbstractC2734o.e(iE), iC, i9);
        } else {
            int iB = AbstractC2734o.b(iC, iE);
            int i12 = 0;
            while (true) {
                int i13 = iH - 1;
                int i14 = iArrO[i13];
                if (AbstractC2734o.b(i14, iE) == iB && r5.j.a(obj, objArrP[i13])) {
                    Object obj3 = objArrR[i13];
                    objArrR[i13] = obj2;
                    p(i13);
                    return obj3;
                }
                int iC2 = AbstractC2734o.c(i14, iE);
                i12++;
                if (iC2 != 0) {
                    iH = iC2;
                } else {
                    if (i12 >= 9) {
                        return s().put(obj, obj2);
                    }
                    if (i10 <= iE) {
                        iArrO[i13] = AbstractC2734o.d(i14, i10, iE);
                    }
                }
            }
            iU = iE;
        }
        T(i10);
        I(i9, obj, obj2, iC, iU);
        this.f50098g = i10;
        F();
        return null;
    }

    public int q(int i9, int i10) {
        return i9 - 1;
    }

    public int r() {
        r5.m.q(M(), "Arrays already allocated");
        int i9 = this.f50097f;
        int iJ = AbstractC2734o.j(i9);
        this.f50093a = AbstractC2734o.a(iJ);
        W(iJ - 1);
        this.f50094c = new int[i9];
        this.f50095d = new Object[i9];
        this.f50096e = new Object[i9];
        return i9;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Map mapZ = z();
        if (mapZ != null) {
            return mapZ.remove(obj);
        }
        Object objN = N(obj);
        if (objN == f50092k) {
            return null;
        }
        return objN;
    }

    public Map s() {
        Map mapV = v(E() + 1);
        int iC = C();
        while (iC >= 0) {
            mapV.put(J(iC), Z(iC));
            iC = D(iC);
        }
        this.f50093a = mapV;
        this.f50094c = null;
        this.f50095d = null;
        this.f50096e = null;
        F();
        return mapV;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map mapZ = z();
        return mapZ != null ? mapZ.size() : this.f50098g;
    }

    public Set u() {
        return new d();
    }

    public Map v(int i9) {
        return new LinkedHashMap(i9, 1.0f);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.f50101j;
        if (collection != null) {
            return collection;
        }
        Collection collectionX = x();
        this.f50101j = collectionX;
        return collectionX;
    }

    public Set w() {
        return new f();
    }

    public Collection x() {
        return new h();
    }

    public Map z() {
        Object obj = this.f50093a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }
}
