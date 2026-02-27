package s5;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import s5.AbstractC2741w;

/* JADX INFO: renamed from: s5.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2719C extends AbstractC2741w implements Set {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient AbstractC2743y f49991c;

    /* JADX INFO: renamed from: s5.C$a */
    public static class a extends AbstractC2741w.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object[] f49992d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f49993e;

        public a() {
            super(4);
        }

        @Override // s5.AbstractC2741w.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            r5.m.k(obj);
            if (this.f49992d != null && AbstractC2719C.p(this.f50156b) <= this.f49992d.length) {
                k(obj);
                return this;
            }
            this.f49992d = null;
            super.d(obj);
            return this;
        }

        public a i(Object... objArr) {
            if (this.f49992d != null) {
                for (Object obj : objArr) {
                    a(obj);
                }
            } else {
                super.e(objArr);
            }
            return this;
        }

        public a j(Iterable iterable) {
            r5.m.k(iterable);
            if (this.f49992d != null) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            } else {
                super.b(iterable);
            }
            return this;
        }

        public final void k(Object obj) {
            Objects.requireNonNull(this.f49992d);
            int length = this.f49992d.length - 1;
            int iHashCode = obj.hashCode();
            int iB = AbstractC2740v.b(iHashCode);
            while (true) {
                int i9 = iB & length;
                Object[] objArr = this.f49992d;
                Object obj2 = objArr[i9];
                if (obj2 == null) {
                    objArr[i9] = obj;
                    this.f49993e += iHashCode;
                    super.d(obj);
                    return;
                } else if (obj2.equals(obj)) {
                    return;
                } else {
                    iB = i9 + 1;
                }
            }
        }

        public AbstractC2719C l() {
            AbstractC2719C abstractC2719CQ;
            int i9 = this.f50156b;
            if (i9 == 0) {
                return AbstractC2719C.z();
            }
            if (i9 == 1) {
                Object obj = this.f50155a[0];
                Objects.requireNonNull(obj);
                return AbstractC2719C.A(obj);
            }
            if (this.f49992d == null || AbstractC2719C.p(i9) != this.f49992d.length) {
                abstractC2719CQ = AbstractC2719C.q(this.f50156b, this.f50155a);
                this.f50156b = abstractC2719CQ.size();
            } else {
                Object[] objArrCopyOf = AbstractC2719C.F(this.f50156b, this.f50155a.length) ? Arrays.copyOf(this.f50155a, this.f50156b) : this.f50155a;
                abstractC2719CQ = new V(objArrCopyOf, this.f49993e, this.f49992d, r5.length - 1, this.f50156b);
            }
            this.f50157c = true;
            this.f49992d = null;
            return abstractC2719CQ;
        }
    }

    public static AbstractC2719C A(Object obj) {
        return new a0(obj);
    }

    public static AbstractC2719C B(Object obj, Object obj2) {
        return q(2, obj, obj2);
    }

    public static AbstractC2719C D(Object obj, Object obj2, Object obj3) {
        return q(3, obj, obj2, obj3);
    }

    public static AbstractC2719C E(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return q(5, obj, obj2, obj3, obj4, obj5);
    }

    public static boolean F(int i9, int i10) {
        return i9 < (i10 >> 1) + (i10 >> 2);
    }

    public static int p(int i9) {
        int iMax = Math.max(i9, 2);
        if (iMax >= 751619276) {
            r5.m.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static AbstractC2719C q(int i9, Object... objArr) {
        if (i9 == 0) {
            return z();
        }
        if (i9 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return A(obj);
        }
        int iP = p(i9);
        Object[] objArr2 = new Object[iP];
        int i10 = iP - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i9; i13++) {
            Object objA = P.a(objArr[i13], i13);
            int iHashCode = objA.hashCode();
            int iB = AbstractC2740v.b(iHashCode);
            while (true) {
                int i14 = iB & i10;
                Object obj2 = objArr2[i14];
                if (obj2 == null) {
                    objArr[i12] = objA;
                    objArr2[i14] = objA;
                    i11 += iHashCode;
                    i12++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iB++;
            }
        }
        Arrays.fill(objArr, i12, i9, (Object) null);
        if (i12 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new a0(obj3);
        }
        if (p(i12) < iP / 2) {
            return q(i12, objArr);
        }
        if (F(i12, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new V(objArr, i11, objArr2, i10, i12);
    }

    public static AbstractC2719C r(Collection collection) {
        if ((collection instanceof AbstractC2719C) && !(collection instanceof SortedSet)) {
            AbstractC2719C abstractC2719C = (AbstractC2719C) collection;
            if (!abstractC2719C.j()) {
                return abstractC2719C;
            }
        }
        Object[] array = collection.toArray();
        return q(array.length, array);
    }

    public static AbstractC2719C s(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? q(objArr.length, (Object[]) objArr.clone()) : A(objArr[0]) : z();
    }

    public static AbstractC2719C z() {
        return V.f50030j;
    }

    @Override // s5.AbstractC2741w
    public AbstractC2743y d() {
        AbstractC2743y abstractC2743y = this.f49991c;
        if (abstractC2743y != null) {
            return abstractC2743y;
        }
        AbstractC2743y abstractC2743yU = u();
        this.f49991c = abstractC2743yU;
        return abstractC2743yU;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC2719C) && y() && ((AbstractC2719C) obj).y() && hashCode() != obj.hashCode()) {
            return false;
        }
        return Z.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Z.d(this);
    }

    @Override // s5.AbstractC2741w
    /* JADX INFO: renamed from: l */
    public abstract c0 iterator();

    public AbstractC2743y u() {
        return AbstractC2743y.n(toArray());
    }

    public boolean y() {
        return false;
    }
}
