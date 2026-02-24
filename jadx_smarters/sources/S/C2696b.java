package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: s.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2696b implements Collection, Set {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f49804f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object[] f49805g = new Object[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Object[] f49806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f49807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Object[] f49808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f49809k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f49810a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f49811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f49812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f49813e;

    /* JADX INFO: renamed from: s.b$a */
    public class a extends h {
        public a() {
        }

        @Override // s.h
        public void a() {
            C2696b.this.clear();
        }

        @Override // s.h
        public Object b(int i9, int i10) {
            return C2696b.this.f49811c[i9];
        }

        @Override // s.h
        public Map c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // s.h
        public int d() {
            return C2696b.this.f49812d;
        }

        @Override // s.h
        public int e(Object obj) {
            return C2696b.this.indexOf(obj);
        }

        @Override // s.h
        public int f(Object obj) {
            return C2696b.this.indexOf(obj);
        }

        @Override // s.h
        public void g(Object obj, Object obj2) {
            C2696b.this.add(obj);
        }

        @Override // s.h
        public void h(int i9) {
            C2696b.this.g(i9);
        }

        @Override // s.h
        public Object i(int i9, Object obj) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C2696b() {
        this(0);
    }

    public C2696b(int i9) {
        if (i9 == 0) {
            this.f49810a = f49804f;
            this.f49811c = f49805g;
        } else {
            a(i9);
        }
        this.f49812d = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i9) {
        if (iArr.length == 8) {
            synchronized (C2696b.class) {
                try {
                    if (f49809k < 10) {
                        objArr[0] = f49808j;
                        objArr[1] = iArr;
                        for (int i10 = i9 - 1; i10 >= 2; i10--) {
                            objArr[i10] = null;
                        }
                        f49808j = objArr;
                        f49809k++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C2696b.class) {
                try {
                    if (f49807i < 10) {
                        objArr[0] = f49806h;
                        objArr[1] = iArr;
                        for (int i11 = i9 - 1; i11 >= 2; i11--) {
                            objArr[i11] = null;
                        }
                        f49806h = objArr;
                        f49807i++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i9) {
        if (i9 == 8) {
            synchronized (C2696b.class) {
                try {
                    Object[] objArr = f49808j;
                    if (objArr != null) {
                        this.f49811c = objArr;
                        f49808j = (Object[]) objArr[0];
                        this.f49810a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f49809k--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i9 == 4) {
            synchronized (C2696b.class) {
                try {
                    Object[] objArr2 = f49806h;
                    if (objArr2 != null) {
                        this.f49811c = objArr2;
                        f49806h = (Object[]) objArr2[0];
                        this.f49810a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f49807i--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f49810a = new int[i9];
        this.f49811c = new Object[i9];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i9;
        int iE;
        if (obj == null) {
            iE = f();
            i9 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i9 = iHashCode;
            iE = e(obj, iHashCode);
        }
        if (iE >= 0) {
            return false;
        }
        int i10 = ~iE;
        int i11 = this.f49812d;
        int[] iArr = this.f49810a;
        if (i11 >= iArr.length) {
            int i12 = 8;
            if (i11 >= 8) {
                i12 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.f49811c;
            a(i12);
            int[] iArr2 = this.f49810a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f49811c, 0, objArr.length);
            }
            c(iArr, objArr, this.f49812d);
        }
        int i13 = this.f49812d;
        if (i10 < i13) {
            int[] iArr3 = this.f49810a;
            int i14 = i10 + 1;
            System.arraycopy(iArr3, i10, iArr3, i14, i13 - i10);
            Object[] objArr2 = this.f49811c;
            System.arraycopy(objArr2, i10, objArr2, i14, this.f49812d - i10);
        }
        this.f49810a[i10] = i9;
        this.f49811c[i10] = obj;
        this.f49812d++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        b(this.f49812d + collection.size());
        Iterator it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public void b(int i9) {
        int[] iArr = this.f49810a;
        if (iArr.length < i9) {
            Object[] objArr = this.f49811c;
            a(i9);
            int i10 = this.f49812d;
            if (i10 > 0) {
                System.arraycopy(iArr, 0, this.f49810a, 0, i10);
                System.arraycopy(objArr, 0, this.f49811c, 0, this.f49812d);
            }
            c(iArr, objArr, this.f49812d);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i9 = this.f49812d;
        if (i9 != 0) {
            c(this.f49810a, this.f49811c, i9);
            this.f49810a = f49804f;
            this.f49811c = f49805g;
            this.f49812d = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final h d() {
        if (this.f49813e == null) {
            this.f49813e = new a();
        }
        return this.f49813e;
    }

    public final int e(Object obj, int i9) {
        int i10 = this.f49812d;
        if (i10 == 0) {
            return -1;
        }
        int iA = AbstractC2699e.a(this.f49810a, i10, i9);
        if (iA < 0 || obj.equals(this.f49811c[iA])) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f49810a[i11] == i9) {
            if (obj.equals(this.f49811c[i11])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f49810a[i12] == i9; i12--) {
            if (obj.equals(this.f49811c[i12])) {
                return i12;
            }
        }
        return ~i11;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i9 = 0; i9 < this.f49812d; i9++) {
                try {
                    if (!set.contains(h(i9))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i9 = this.f49812d;
        if (i9 == 0) {
            return -1;
        }
        int iA = AbstractC2699e.a(this.f49810a, i9, 0);
        if (iA < 0 || this.f49811c[iA] == null) {
            return iA;
        }
        int i10 = iA + 1;
        while (i10 < i9 && this.f49810a[i10] == 0) {
            if (this.f49811c[i10] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = iA - 1; i11 >= 0 && this.f49810a[i11] == 0; i11--) {
            if (this.f49811c[i11] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public Object g(int i9) {
        Object[] objArr = this.f49811c;
        Object obj = objArr[i9];
        int i10 = this.f49812d;
        if (i10 <= 1) {
            c(this.f49810a, objArr, i10);
            this.f49810a = f49804f;
            this.f49811c = f49805g;
            this.f49812d = 0;
        } else {
            int[] iArr = this.f49810a;
            if (iArr.length <= 8 || i10 >= iArr.length / 3) {
                int i11 = i10 - 1;
                this.f49812d = i11;
                if (i9 < i11) {
                    int i12 = i9 + 1;
                    System.arraycopy(iArr, i12, iArr, i9, i11 - i9);
                    Object[] objArr2 = this.f49811c;
                    System.arraycopy(objArr2, i12, objArr2, i9, this.f49812d - i9);
                }
                this.f49811c[this.f49812d] = null;
            } else {
                a(i10 > 8 ? i10 + (i10 >> 1) : 8);
                this.f49812d--;
                if (i9 > 0) {
                    System.arraycopy(iArr, 0, this.f49810a, 0, i9);
                    System.arraycopy(objArr, 0, this.f49811c, 0, i9);
                }
                int i13 = this.f49812d;
                if (i9 < i13) {
                    int i14 = i9 + 1;
                    System.arraycopy(iArr, i14, this.f49810a, i9, i13 - i9);
                    System.arraycopy(objArr, i14, this.f49811c, i9, this.f49812d - i9);
                }
            }
        }
        return obj;
    }

    public Object h(int i9) {
        return this.f49811c[i9];
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f49810a;
        int i9 = this.f49812d;
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    public int indexOf(Object obj) {
        return obj == null ? f() : e(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f49812d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return d().m().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        g(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        boolean z9 = false;
        for (int i9 = this.f49812d - 1; i9 >= 0; i9--) {
            if (!collection.contains(this.f49811c[i9])) {
                g(i9);
                z9 = true;
            }
        }
        return z9;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f49812d;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i9 = this.f49812d;
        Object[] objArr = new Object[i9];
        System.arraycopy(this.f49811c, 0, objArr, 0, i9);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f49812d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f49812d);
        }
        System.arraycopy(this.f49811c, 0, objArr, 0, this.f49812d);
        int length = objArr.length;
        int i9 = this.f49812d;
        if (length > i9) {
            objArr[i9] = null;
        }
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f49812d * 14);
        sb.append('{');
        for (int i9 = 0; i9 < this.f49812d; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            Object objH = h(i9);
            if (objH != this) {
                sb.append(objH);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
