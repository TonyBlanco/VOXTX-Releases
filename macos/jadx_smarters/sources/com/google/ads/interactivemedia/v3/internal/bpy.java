package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class bpy extends bop implements RandomAccess, bqt, brz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bpy f22016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double[] f22017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22018c;

    static {
        bpy bpyVar = new bpy(new double[0], 0);
        f22016a = bpyVar;
        bpyVar.b();
    }

    public bpy() {
        this(new double[10], 0);
    }

    private bpy(double[] dArr, int i9) {
        this.f22017b = dArr;
        this.f22018c = i9;
    }

    private final String f(int i9) {
        return "Index:" + i9 + ", Size:" + this.f22018c;
    }

    private final void g(int i9) {
        if (i9 < 0 || i9 >= this.f22018c) {
            throw new IndexOutOfBoundsException(f(i9));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i9, Object obj) {
        int i10;
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        if (i9 < 0 || i9 > (i10 = this.f22018c)) {
            throw new IndexOutOfBoundsException(f(i9));
        }
        double[] dArr = this.f22017b;
        if (i10 < dArr.length) {
            System.arraycopy(dArr, i9, dArr, i9 + 1, i10 - i9);
        } else {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i9);
            System.arraycopy(this.f22017b, i9, dArr2, i9 + 1, this.f22018c - i9);
            this.f22017b = dArr2;
        }
        this.f22017b[i9] = dDoubleValue;
        this.f22018c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Double) obj).doubleValue());
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        bqu.i(collection);
        if (!(collection instanceof bpy)) {
            return super.addAll(collection);
        }
        bpy bpyVar = (bpy) collection;
        int i9 = bpyVar.f22018c;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.f22018c;
        if (a.e.API_PRIORITY_OTHER - i10 < i9) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i9;
        double[] dArr = this.f22017b;
        if (i11 > dArr.length) {
            this.f22017b = Arrays.copyOf(dArr, i11);
        }
        System.arraycopy(bpyVar.f22017b, 0, this.f22017b, this.f22018c, bpyVar.f22018c);
        this.f22018c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqt
    public final /* bridge */ /* synthetic */ bqt d(int i9) {
        if (i9 >= this.f22018c) {
            return new bpy(Arrays.copyOf(this.f22017b, i9), this.f22018c);
        }
        throw new IllegalArgumentException();
    }

    public final void e(double d9) {
        a();
        int i9 = this.f22018c;
        double[] dArr = this.f22017b;
        if (i9 == dArr.length) {
            double[] dArr2 = new double[((i9 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i9);
            this.f22017b = dArr2;
        }
        double[] dArr3 = this.f22017b;
        int i10 = this.f22018c;
        this.f22018c = i10 + 1;
        dArr3[i10] = d9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpy)) {
            return super.equals(obj);
        }
        bpy bpyVar = (bpy) obj;
        if (this.f22018c != bpyVar.f22018c) {
            return false;
        }
        double[] dArr = bpyVar.f22017b;
        for (int i9 = 0; i9 < this.f22018c; i9++) {
            if (Double.doubleToLongBits(this.f22017b[i9]) != Double.doubleToLongBits(dArr[i9])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i9) {
        g(i9);
        return Double.valueOf(this.f22017b[i9]);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iC = 1;
        for (int i9 = 0; i9 < this.f22018c; i9++) {
            iC = (iC * 31) + bqu.c(Double.doubleToLongBits(this.f22017b[i9]));
        }
        return iC;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i9 = this.f22018c;
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.f22017b[i10] == dDoubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        a();
        g(i9);
        double[] dArr = this.f22017b;
        double d9 = dArr[i9];
        if (i9 < this.f22018c - 1) {
            System.arraycopy(dArr, i9 + 1, dArr, i9, (r3 - i9) - 1);
        }
        this.f22018c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d9);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        a();
        if (i10 < i9) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f22017b;
        System.arraycopy(dArr, i10, dArr, i9, this.f22018c - i10);
        this.f22018c -= i10 - i9;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        g(i9);
        double[] dArr = this.f22017b;
        double d9 = dArr[i9];
        dArr[i9] = dDoubleValue;
        return Double.valueOf(d9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22018c;
    }
}
