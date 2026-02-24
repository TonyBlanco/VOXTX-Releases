package s;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Object[] f49846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f49847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Object[] f49848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f49849h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f49850a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f49851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f49852d;

    public i() {
        this.f49850a = AbstractC2699e.f49823a;
        this.f49851c = AbstractC2699e.f49825c;
        this.f49852d = 0;
    }

    public i(int i9) {
        if (i9 == 0) {
            this.f49850a = AbstractC2699e.f49823a;
            this.f49851c = AbstractC2699e.f49825c;
        } else {
            a(i9);
        }
        this.f49852d = 0;
    }

    public i(i iVar) {
        this();
        if (iVar != null) {
            k(iVar);
        }
    }

    public static int c(int[] iArr, int i9, int i10) {
        try {
            return AbstractC2699e.a(iArr, i9, i10);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static void e(int[] iArr, Object[] objArr, int i9) {
        if (iArr.length == 8) {
            synchronized (i.class) {
                try {
                    if (f49849h < 10) {
                        objArr[0] = f49848g;
                        objArr[1] = iArr;
                        for (int i10 = (i9 << 1) - 1; i10 >= 2; i10--) {
                            objArr[i10] = null;
                        }
                        f49848g = objArr;
                        f49849h++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (i.class) {
                try {
                    if (f49847f < 10) {
                        objArr[0] = f49846e;
                        objArr[1] = iArr;
                        for (int i11 = (i9 << 1) - 1; i11 >= 2; i11--) {
                            objArr[i11] = null;
                        }
                        f49846e = objArr;
                        f49847f++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i9) {
        if (i9 == 8) {
            synchronized (i.class) {
                try {
                    Object[] objArr = f49848g;
                    if (objArr != null) {
                        this.f49851c = objArr;
                        f49848g = (Object[]) objArr[0];
                        this.f49850a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f49849h--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i9 == 4) {
            synchronized (i.class) {
                try {
                    Object[] objArr2 = f49846e;
                    if (objArr2 != null) {
                        this.f49851c = objArr2;
                        f49846e = (Object[]) objArr2[0];
                        this.f49850a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f49847f--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f49850a = new int[i9];
        this.f49851c = new Object[i9 << 1];
    }

    public void clear() {
        int i9 = this.f49852d;
        if (i9 > 0) {
            int[] iArr = this.f49850a;
            Object[] objArr = this.f49851c;
            this.f49850a = AbstractC2699e.f49823a;
            this.f49851c = AbstractC2699e.f49825c;
            this.f49852d = 0;
            e(iArr, objArr, i9);
        }
        if (this.f49852d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public void d(int i9) {
        int i10 = this.f49852d;
        int[] iArr = this.f49850a;
        if (iArr.length < i9) {
            Object[] objArr = this.f49851c;
            a(i9);
            if (this.f49852d > 0) {
                System.arraycopy(iArr, 0, this.f49850a, 0, i10);
                System.arraycopy(objArr, 0, this.f49851c, 0, i10 << 1);
            }
            e(iArr, objArr, i10);
        }
        if (this.f49852d != i10) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (size() != iVar.size()) {
                return false;
            }
            for (int i9 = 0; i9 < this.f49852d; i9++) {
                try {
                    Object objJ = j(i9);
                    Object objO = o(i9);
                    Object obj2 = iVar.get(objJ);
                    if (objO == null) {
                        if (obj2 != null || !iVar.containsKey(objJ)) {
                            return false;
                        }
                    } else if (!objO.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f49852d; i10++) {
                try {
                    Object objJ2 = j(i10);
                    Object objO2 = o(i10);
                    Object obj3 = map.get(objJ2);
                    if (objO2 == null) {
                        if (obj3 != null || !map.containsKey(objJ2)) {
                            return false;
                        }
                    } else if (!objO2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj, int i9) {
        int i10 = this.f49852d;
        if (i10 == 0) {
            return -1;
        }
        int iC = c(this.f49850a, i10, i9);
        if (iC < 0 || obj.equals(this.f49851c[iC << 1])) {
            return iC;
        }
        int i11 = iC + 1;
        while (i11 < i10 && this.f49850a[i11] == i9) {
            if (obj.equals(this.f49851c[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iC - 1; i12 >= 0 && this.f49850a[i12] == i9; i12--) {
            if (obj.equals(this.f49851c[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public int g(Object obj) {
        return obj == null ? h() : f(obj, obj.hashCode());
    }

    public Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int iG = g(obj);
        return iG >= 0 ? this.f49851c[(iG << 1) + 1] : obj2;
    }

    public int h() {
        int i9 = this.f49852d;
        if (i9 == 0) {
            return -1;
        }
        int iC = c(this.f49850a, i9, 0);
        if (iC < 0 || this.f49851c[iC << 1] == null) {
            return iC;
        }
        int i10 = iC + 1;
        while (i10 < i9 && this.f49850a[i10] == 0) {
            if (this.f49851c[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = iC - 1; i11 >= 0 && this.f49850a[i11] == 0; i11--) {
            if (this.f49851c[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public int hashCode() {
        int[] iArr = this.f49850a;
        Object[] objArr = this.f49851c;
        int i9 = this.f49852d;
        int i10 = 1;
        int i11 = 0;
        int iHashCode = 0;
        while (i11 < i9) {
            Object obj = objArr[i10];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i11];
            i11++;
            i10 += 2;
        }
        return iHashCode;
    }

    public int i(Object obj) {
        int i9 = this.f49852d * 2;
        Object[] objArr = this.f49851c;
        if (obj == null) {
            for (int i10 = 1; i10 < i9; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i9; i11 += 2) {
            if (obj.equals(objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f49852d <= 0;
    }

    public Object j(int i9) {
        return this.f49851c[i9 << 1];
    }

    public void k(i iVar) {
        int i9 = iVar.f49852d;
        d(this.f49852d + i9);
        if (this.f49852d != 0) {
            for (int i10 = 0; i10 < i9; i10++) {
                put(iVar.j(i10), iVar.o(i10));
            }
        } else if (i9 > 0) {
            System.arraycopy(iVar.f49850a, 0, this.f49850a, 0, i9);
            System.arraycopy(iVar.f49851c, 0, this.f49851c, 0, i9 << 1);
            this.f49852d = i9;
        }
    }

    public Object m(int i9) {
        Object[] objArr = this.f49851c;
        int i10 = i9 << 1;
        Object obj = objArr[i10 + 1];
        int i11 = this.f49852d;
        int i12 = 0;
        if (i11 <= 1) {
            e(this.f49850a, objArr, i11);
            this.f49850a = AbstractC2699e.f49823a;
            this.f49851c = AbstractC2699e.f49825c;
        } else {
            int i13 = i11 - 1;
            int[] iArr = this.f49850a;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                if (i9 < i13) {
                    int i14 = i9 + 1;
                    int i15 = i13 - i9;
                    System.arraycopy(iArr, i14, iArr, i9, i15);
                    Object[] objArr2 = this.f49851c;
                    System.arraycopy(objArr2, i14 << 1, objArr2, i10, i15 << 1);
                }
                Object[] objArr3 = this.f49851c;
                int i16 = i13 << 1;
                objArr3[i16] = null;
                objArr3[i16 + 1] = null;
            } else {
                a(i11 > 8 ? i11 + (i11 >> 1) : 8);
                if (i11 != this.f49852d) {
                    throw new ConcurrentModificationException();
                }
                if (i9 > 0) {
                    System.arraycopy(iArr, 0, this.f49850a, 0, i9);
                    System.arraycopy(objArr, 0, this.f49851c, 0, i10);
                }
                if (i9 < i13) {
                    int i17 = i9 + 1;
                    int i18 = i13 - i9;
                    System.arraycopy(iArr, i17, this.f49850a, i9, i18);
                    System.arraycopy(objArr, i17 << 1, this.f49851c, i10, i18 << 1);
                }
            }
            i12 = i13;
        }
        if (i11 != this.f49852d) {
            throw new ConcurrentModificationException();
        }
        this.f49852d = i12;
        return obj;
    }

    public Object n(int i9, Object obj) {
        int i10 = (i9 << 1) + 1;
        Object[] objArr = this.f49851c;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public Object o(int i9) {
        return this.f49851c[(i9 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i9;
        int iF;
        int i10 = this.f49852d;
        if (obj == null) {
            iF = h();
            i9 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i9 = iHashCode;
            iF = f(obj, iHashCode);
        }
        if (iF >= 0) {
            int i11 = (iF << 1) + 1;
            Object[] objArr = this.f49851c;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iF;
        int[] iArr = this.f49850a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            Object[] objArr2 = this.f49851c;
            a(i13);
            if (i10 != this.f49852d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f49850a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f49851c, 0, objArr2.length);
            }
            e(iArr, objArr2, i10);
        }
        if (i12 < i10) {
            int[] iArr3 = this.f49850a;
            int i14 = i12 + 1;
            System.arraycopy(iArr3, i12, iArr3, i14, i10 - i12);
            Object[] objArr3 = this.f49851c;
            System.arraycopy(objArr3, i12 << 1, objArr3, i14 << 1, (this.f49852d - i12) << 1);
        }
        int i15 = this.f49852d;
        if (i10 == i15) {
            int[] iArr4 = this.f49850a;
            if (i12 < iArr4.length) {
                iArr4[i12] = i9;
                Object[] objArr4 = this.f49851c;
                int i16 = i12 << 1;
                objArr4[i16] = obj;
                objArr4[i16 + 1] = obj2;
                this.f49852d = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iG = g(obj);
        if (iG >= 0) {
            return m(iG);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int iG = g(obj);
        if (iG < 0) {
            return false;
        }
        Object objO = o(iG);
        if (obj2 != objO && (obj2 == null || !obj2.equals(objO))) {
            return false;
        }
        m(iG);
        return true;
    }

    public Object replace(Object obj, Object obj2) {
        int iG = g(obj);
        if (iG >= 0) {
            return n(iG, obj2);
        }
        return null;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int iG = g(obj);
        if (iG < 0) {
            return false;
        }
        Object objO = o(iG);
        if (objO != obj2 && (obj2 == null || !obj2.equals(objO))) {
            return false;
        }
        n(iG, obj3);
        return true;
    }

    public int size() {
        return this.f49852d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f49852d * 28);
        sb.append('{');
        for (int i9 = 0; i9 < this.f49852d; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            Object objJ = j(i9);
            if (objJ != this) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objO = o(i9);
            if (objO != this) {
                sb.append(objO);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
