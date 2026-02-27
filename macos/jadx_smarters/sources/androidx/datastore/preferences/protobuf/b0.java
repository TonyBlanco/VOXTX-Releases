package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends AbstractC1118c implements RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b0 f14618e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f14619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14620d;

    static {
        b0 b0Var = new b0(new Object[0], 0);
        f14618e = b0Var;
        b0Var.k();
    }

    public b0(Object[] objArr, int i9) {
        this.f14619c = objArr;
        this.f14620d = i9;
    }

    public static Object[] e(int i9) {
        return new Object[i9];
    }

    public static b0 f() {
        return f14618e;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i9, Object obj) {
        int i10;
        d();
        if (i9 < 0 || i9 > (i10 = this.f14620d)) {
            throw new IndexOutOfBoundsException(h(i9));
        }
        Object[] objArr = this.f14619c;
        if (i10 < objArr.length) {
            System.arraycopy(objArr, i9, objArr, i9 + 1, i10 - i9);
        } else {
            Object[] objArrE = e(((i10 * 3) / 2) + 1);
            System.arraycopy(this.f14619c, 0, objArrE, 0, i9);
            System.arraycopy(this.f14619c, i9, objArrE, i9 + 1, this.f14620d - i9);
            this.f14619c = objArrE;
        }
        this.f14619c[i9] = obj;
        this.f14620d++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1118c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        d();
        int i9 = this.f14620d;
        Object[] objArr = this.f14619c;
        if (i9 == objArr.length) {
            this.f14619c = Arrays.copyOf(objArr, ((i9 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f14619c;
        int i10 = this.f14620d;
        this.f14620d = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void g(int i9) {
        if (i9 < 0 || i9 >= this.f14620d) {
            throw new IndexOutOfBoundsException(h(i9));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i9) {
        g(i9);
        return this.f14619c[i9];
    }

    public final String h(int i9) {
        return "Index:" + i9 + ", Size:" + this.f14620d;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1139y.b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public b0 w(int i9) {
        if (i9 >= this.f14620d) {
            return new b0(Arrays.copyOf(this.f14619c, i9), this.f14620d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i9) {
        d();
        g(i9);
        Object[] objArr = this.f14619c;
        Object obj = objArr[i9];
        if (i9 < this.f14620d - 1) {
            System.arraycopy(objArr, i9 + 1, objArr, i9, (r2 - i9) - 1);
        }
        this.f14620d--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i9, Object obj) {
        d();
        g(i9);
        Object[] objArr = this.f14619c;
        Object obj2 = objArr[i9];
        objArr[i9] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f14620d;
    }
}
