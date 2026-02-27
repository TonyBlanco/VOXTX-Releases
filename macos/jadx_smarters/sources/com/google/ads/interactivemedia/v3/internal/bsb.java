package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class bsb extends bop implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bsb f22200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f22201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22202c;

    static {
        bsb bsbVar = new bsb(new Object[0], 0);
        f22200a = bsbVar;
        bsbVar.b();
    }

    public bsb() {
        this(new Object[10], 0);
    }

    private bsb(Object[] objArr, int i9) {
        this.f22201b = objArr;
        this.f22202c = i9;
    }

    public static bsb e() {
        return f22200a;
    }

    private final String f(int i9) {
        return "Index:" + i9 + ", Size:" + this.f22202c;
    }

    private final void g(int i9) {
        if (i9 < 0 || i9 >= this.f22202c) {
            throw new IndexOutOfBoundsException(f(i9));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        int i10;
        a();
        if (i9 < 0 || i9 > (i10 = this.f22202c)) {
            throw new IndexOutOfBoundsException(f(i9));
        }
        Object[] objArr = this.f22201b;
        if (i10 < objArr.length) {
            System.arraycopy(objArr, i9, objArr, i9 + 1, i10 - i9);
        } else {
            Object[] objArr2 = new Object[((i10 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i9);
            System.arraycopy(this.f22201b, i9, objArr2, i9 + 1, this.f22202c - i9);
            this.f22201b = objArr2;
        }
        this.f22201b[i9] = obj;
        this.f22202c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i9 = this.f22202c;
        Object[] objArr = this.f22201b;
        if (i9 == objArr.length) {
            this.f22201b = Arrays.copyOf(objArr, ((i9 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f22201b;
        int i10 = this.f22202c;
        this.f22202c = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqt
    public final /* bridge */ /* synthetic */ bqt d(int i9) {
        if (i9 >= this.f22202c) {
            return new bsb(Arrays.copyOf(this.f22201b, i9), this.f22202c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        g(i9);
        return this.f22201b[i9];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.List
    public final Object remove(int i9) {
        a();
        g(i9);
        Object[] objArr = this.f22201b;
        Object obj = objArr[i9];
        if (i9 < this.f22202c - 1) {
            System.arraycopy(objArr, i9 + 1, objArr, i9, (r2 - i9) - 1);
        }
        this.f22202c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        a();
        g(i9);
        Object[] objArr = this.f22201b;
        Object obj2 = objArr[i9];
        objArr[i9] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22202c;
    }
}
