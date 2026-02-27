package s5;

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import s5.AbstractC2717A;

/* JADX INFO: loaded from: classes3.dex */
public final class U extends AbstractC2717A {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AbstractC2717A f50015i = new U(null, new Object[0], 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object f50016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient Object[] f50017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f50018h;

    public static class a extends AbstractC2719C {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient AbstractC2717A f50019d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final transient Object[] f50020e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final transient int f50021f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final transient int f50022g;

        /* JADX INFO: renamed from: s5.U$a$a, reason: collision with other inner class name */
        public class C0442a extends AbstractC2743y {
            public C0442a() {
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i9) {
                r5.m.i(i9, a.this.f50022g);
                int i10 = i9 * 2;
                Object obj = a.this.f50020e[a.this.f50021f + i10];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f50020e[i10 + (a.this.f50021f ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // s5.AbstractC2741w
            public boolean j() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f50022g;
            }
        }

        public a(AbstractC2717A abstractC2717A, Object[] objArr, int i9, int i10) {
            this.f50019d = abstractC2717A;
            this.f50020e = objArr;
            this.f50021f = i9;
            this.f50022g = i10;
        }

        @Override // s5.AbstractC2741w, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f50019d.get(key));
        }

        @Override // s5.AbstractC2741w
        public int e(Object[] objArr, int i9) {
            return d().e(objArr, i9);
        }

        @Override // s5.AbstractC2741w
        public boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: l */
        public c0 iterator() {
            return d().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f50022g;
        }

        @Override // s5.AbstractC2719C
        public AbstractC2743y u() {
            return new C0442a();
        }
    }

    public static final class b extends AbstractC2719C {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient AbstractC2717A f50024d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final transient AbstractC2743y f50025e;

        public b(AbstractC2717A abstractC2717A, AbstractC2743y abstractC2743y) {
            this.f50024d = abstractC2717A;
            this.f50025e = abstractC2743y;
        }

        @Override // s5.AbstractC2741w, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f50024d.get(obj) != null;
        }

        @Override // s5.AbstractC2719C, s5.AbstractC2741w
        public AbstractC2743y d() {
            return this.f50025e;
        }

        @Override // s5.AbstractC2741w
        public int e(Object[] objArr, int i9) {
            return d().e(objArr, i9);
        }

        @Override // s5.AbstractC2741w
        public boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: l */
        public c0 iterator() {
            return d().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f50024d.size();
        }
    }

    public static final class c extends AbstractC2743y {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient Object[] f50026d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final transient int f50027e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final transient int f50028f;

        public c(Object[] objArr, int i9, int i10) {
            this.f50026d = objArr;
            this.f50027e = i9;
            this.f50028f = i10;
        }

        @Override // java.util.List
        public Object get(int i9) {
            r5.m.i(i9, this.f50028f);
            Object obj = this.f50026d[(i9 * 2) + this.f50027e];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // s5.AbstractC2741w
        public boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f50028f;
        }
    }

    public U(Object obj, Object[] objArr, int i9) {
        this.f50016f = obj;
        this.f50017g = objArr;
        this.f50018h = i9;
    }

    public static U o(int i9, Object[] objArr) {
        return p(i9, objArr, null);
    }

    public static U p(int i9, Object[] objArr, AbstractC2717A.a aVar) {
        if (i9 == 0) {
            return (U) f50015i;
        }
        if (i9 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            AbstractC2731l.a(obj, obj2);
            return new U(null, objArr, 1);
        }
        r5.m.m(i9, objArr.length >> 1);
        Object objQ = q(objArr, i9, AbstractC2719C.p(i9), 0);
        if (objQ instanceof Object[]) {
            Object[] objArr2 = (Object[]) objQ;
            AbstractC2717A.a.C0440a c0440a = (AbstractC2717A.a.C0440a) objArr2[2];
            if (aVar == null) {
                throw c0440a.a();
            }
            aVar.f49973e = c0440a;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objQ = obj3;
            i9 = iIntValue;
        }
        return new U(objQ, objArr, i9);
    }

    public static Object q(Object[] objArr, int i9, int i10, int i11) {
        AbstractC2717A.a.C0440a c0440a = null;
        if (i9 == 1) {
            Object obj = objArr[i11];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj2);
            AbstractC2731l.a(obj, obj2);
            return null;
        }
        int i12 = i10 - 1;
        int i13 = -1;
        if (i10 <= 128) {
            byte[] bArr = new byte[i10];
            Arrays.fill(bArr, (byte) -1);
            int i14 = 0;
            for (int i15 = 0; i15 < i9; i15++) {
                int i16 = (i15 * 2) + i11;
                int i17 = (i14 * 2) + i11;
                Object obj3 = objArr[i16];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i16 ^ 1];
                Objects.requireNonNull(obj4);
                AbstractC2731l.a(obj3, obj4);
                int iB = AbstractC2740v.b(obj3.hashCode());
                while (true) {
                    int i18 = iB & i12;
                    int i19 = bArr[i18] & 255;
                    if (i19 == 255) {
                        bArr[i18] = (byte) i17;
                        if (i14 < i15) {
                            objArr[i17] = obj3;
                            objArr[i17 ^ 1] = obj4;
                        }
                        i14++;
                    } else {
                        if (obj3.equals(objArr[i19])) {
                            int i20 = i19 ^ 1;
                            Object obj5 = objArr[i20];
                            Objects.requireNonNull(obj5);
                            c0440a = new AbstractC2717A.a.C0440a(obj3, obj4, obj5);
                            objArr[i20] = obj4;
                            break;
                        }
                        iB = i18 + 1;
                    }
                }
            }
            return i14 == i9 ? bArr : new Object[]{bArr, Integer.valueOf(i14), c0440a};
        }
        if (i10 <= 32768) {
            short[] sArr = new short[i10];
            Arrays.fill(sArr, (short) -1);
            int i21 = 0;
            for (int i22 = 0; i22 < i9; i22++) {
                int i23 = (i22 * 2) + i11;
                int i24 = (i21 * 2) + i11;
                Object obj6 = objArr[i23];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i23 ^ 1];
                Objects.requireNonNull(obj7);
                AbstractC2731l.a(obj6, obj7);
                int iB2 = AbstractC2740v.b(obj6.hashCode());
                while (true) {
                    int i25 = iB2 & i12;
                    int i26 = sArr[i25] & 65535;
                    if (i26 == 65535) {
                        sArr[i25] = (short) i24;
                        if (i21 < i22) {
                            objArr[i24] = obj6;
                            objArr[i24 ^ 1] = obj7;
                        }
                        i21++;
                    } else {
                        if (obj6.equals(objArr[i26])) {
                            int i27 = i26 ^ 1;
                            Object obj8 = objArr[i27];
                            Objects.requireNonNull(obj8);
                            c0440a = new AbstractC2717A.a.C0440a(obj6, obj7, obj8);
                            objArr[i27] = obj7;
                            break;
                        }
                        iB2 = i25 + 1;
                    }
                }
            }
            return i21 == i9 ? sArr : new Object[]{sArr, Integer.valueOf(i21), c0440a};
        }
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        int i28 = 0;
        int i29 = 0;
        while (i28 < i9) {
            int i30 = (i28 * 2) + i11;
            int i31 = (i29 * 2) + i11;
            Object obj9 = objArr[i30];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i30 ^ 1];
            Objects.requireNonNull(obj10);
            AbstractC2731l.a(obj9, obj10);
            int iB3 = AbstractC2740v.b(obj9.hashCode());
            while (true) {
                int i32 = iB3 & i12;
                int i33 = iArr[i32];
                if (i33 == i13) {
                    iArr[i32] = i31;
                    if (i29 < i28) {
                        objArr[i31] = obj9;
                        objArr[i31 ^ 1] = obj10;
                    }
                    i29++;
                } else {
                    if (obj9.equals(objArr[i33])) {
                        int i34 = i33 ^ 1;
                        Object obj11 = objArr[i34];
                        Objects.requireNonNull(obj11);
                        c0440a = new AbstractC2717A.a.C0440a(obj9, obj10, obj11);
                        objArr[i34] = obj10;
                        break;
                    }
                    iB3 = i32 + 1;
                    i13 = -1;
                }
            }
            i28++;
            i13 = -1;
        }
        return i29 == i9 ? iArr : new Object[]{iArr, Integer.valueOf(i29), c0440a};
    }

    public static Object r(Object obj, Object[] objArr, int i9, int i10, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i9 == 1) {
            Object obj3 = objArr[i10];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i10 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iB = AbstractC2740v.b(obj2.hashCode());
            while (true) {
                int i11 = iB & length;
                int i12 = bArr[i11] & 255;
                if (i12 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i12])) {
                    return objArr[i12 ^ 1];
                }
                iB = i11 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iB2 = AbstractC2740v.b(obj2.hashCode());
            while (true) {
                int i13 = iB2 & length2;
                int i14 = sArr[i13] & 65535;
                if (i14 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i14])) {
                    return objArr[i14 ^ 1];
                }
                iB2 = i13 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iB3 = AbstractC2740v.b(obj2.hashCode());
            while (true) {
                int i15 = iB3 & length3;
                int i16 = iArr[i15];
                if (i16 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i16])) {
                    return objArr[i16 ^ 1];
                }
                iB3 = i15 + 1;
            }
        }
    }

    @Override // s5.AbstractC2717A
    public AbstractC2719C e() {
        return new a(this, this.f50017g, 0, this.f50018h);
    }

    @Override // s5.AbstractC2717A
    public AbstractC2719C f() {
        return new b(this, new c(this.f50017g, 0, this.f50018h));
    }

    @Override // s5.AbstractC2717A
    public AbstractC2741w g() {
        return new c(this.f50017g, 1, this.f50018h);
    }

    @Override // s5.AbstractC2717A, java.util.Map
    public Object get(Object obj) {
        Object objR = r(this.f50016f, this.f50017g, this.f50018h, 0, obj);
        if (objR == null) {
            return null;
        }
        return objR;
    }

    @Override // s5.AbstractC2717A
    public boolean i() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f50018h;
    }
}
