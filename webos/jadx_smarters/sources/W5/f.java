package w5;

import com.google.android.gms.common.api.a;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import r5.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f extends g {

    public static class a extends AbstractList implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f51684a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f51685c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f51686d;

        public a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        public a(int[] iArr, int i9, int i10) {
            this.f51684a = iArr;
            this.f51685c = i9;
            this.f51686d = i10;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(int i9) {
            m.i(i9, size());
            return Integer.valueOf(this.f51684a[this.f51685c + i9]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer set(int i9, Integer num) {
            m.i(i9, size());
            int[] iArr = this.f51684a;
            int i10 = this.f51685c;
            int i11 = iArr[i10 + i9];
            iArr[i10 + i9] = ((Integer) m.k(num)).intValue();
            return Integer.valueOf(i11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && f.i(this.f51684a, ((Integer) obj).intValue(), this.f51685c, this.f51686d) != -1;
        }

        public int[] d() {
            return Arrays.copyOfRange(this.f51684a, this.f51685c, this.f51686d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i9 = 0; i9 < size; i9++) {
                if (this.f51684a[this.f51685c + i9] != aVar.f51684a[aVar.f51685c + i9]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iG = 1;
            for (int i9 = this.f51685c; i9 < this.f51686d; i9++) {
                iG = (iG * 31) + f.g(this.f51684a[i9]);
            }
            return iG;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int i9;
            if (!(obj instanceof Integer) || (i9 = f.i(this.f51684a, ((Integer) obj).intValue(), this.f51685c, this.f51686d)) < 0) {
                return -1;
            }
            return i9 - this.f51685c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iJ;
            if (!(obj instanceof Integer) || (iJ = f.j(this.f51684a, ((Integer) obj).intValue(), this.f51685c, this.f51686d)) < 0) {
                return -1;
            }
            return iJ - this.f51685c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f51686d - this.f51685c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i9, int i10) {
            m.o(i9, i10, size());
            if (i9 == i10) {
                return Collections.emptyList();
            }
            int[] iArr = this.f51684a;
            int i11 = this.f51685c;
            return new a(iArr, i9 + i11, i11 + i10);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f51684a[this.f51685c]);
            int i9 = this.f51685c;
            while (true) {
                i9++;
                if (i9 >= this.f51686d) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f51684a[i9]);
            }
        }
    }

    public static List c(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new a(iArr);
    }

    public static int d(long j9) {
        int i9 = (int) j9;
        m.g(((long) i9) == j9, "Out of range: %s", j9);
        return i9;
    }

    public static int e(int i9, int i10) {
        if (i9 < i10) {
            return -1;
        }
        return i9 > i10 ? 1 : 0;
    }

    public static int f(int i9, int i10, int i11) {
        m.f(i10 <= i11, "min (%s) must be less than or equal to max (%s)", i10, i11);
        return Math.min(Math.max(i9, i10), i11);
    }

    public static int g(int i9) {
        return i9;
    }

    public static int h(int[] iArr, int i9) {
        return i(iArr, i9, 0, iArr.length);
    }

    public static int i(int[] iArr, int i9, int i10, int i11) {
        while (i10 < i11) {
            if (iArr[i10] == i9) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int j(int[] iArr, int i9, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            if (iArr[i12] == i9) {
                return i12;
            }
        }
        return -1;
    }

    public static int k(long j9) {
        if (j9 > 2147483647L) {
            return a.e.API_PRIORITY_OTHER;
        }
        if (j9 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j9;
    }

    public static int[] l(Collection collection) {
        if (collection instanceof a) {
            return ((a) collection).d();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i9 = 0; i9 < length; i9++) {
            iArr[i9] = ((Number) m.k(array[i9])).intValue();
        }
        return iArr;
    }
}
