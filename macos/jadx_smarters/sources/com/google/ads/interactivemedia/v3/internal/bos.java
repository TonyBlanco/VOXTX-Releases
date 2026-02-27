package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class bos extends bop implements RandomAccess, bqt, brz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bos f21860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean[] f21861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21862c;

    static {
        bos bosVar = new bos(new boolean[0], 0);
        f21860a = bosVar;
        bosVar.b();
    }

    public bos() {
        this(new boolean[10], 0);
    }

    private bos(boolean[] zArr, int i9) {
        this.f21861b = zArr;
        this.f21862c = i9;
    }

    private final String f(int i9) {
        return "Index:" + i9 + ", Size:" + this.f21862c;
    }

    private final void g(int i9) {
        if (i9 < 0 || i9 >= this.f21862c) {
            throw new IndexOutOfBoundsException(f(i9));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i9, Object obj) {
        int i10;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i9 < 0 || i9 > (i10 = this.f21862c)) {
            throw new IndexOutOfBoundsException(f(i9));
        }
        boolean[] zArr = this.f21861b;
        if (i10 < zArr.length) {
            System.arraycopy(zArr, i9, zArr, i9 + 1, i10 - i9);
        } else {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i9);
            System.arraycopy(this.f21861b, i9, zArr2, i9 + 1, this.f21862c - i9);
            this.f21861b = zArr2;
        }
        this.f21861b[i9] = zBooleanValue;
        this.f21862c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        bqu.i(collection);
        if (!(collection instanceof bos)) {
            return super.addAll(collection);
        }
        bos bosVar = (bos) collection;
        int i9 = bosVar.f21862c;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.f21862c;
        if (a.e.API_PRIORITY_OTHER - i10 < i9) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i9;
        boolean[] zArr = this.f21861b;
        if (i11 > zArr.length) {
            this.f21861b = Arrays.copyOf(zArr, i11);
        }
        System.arraycopy(bosVar.f21861b, 0, this.f21861b, this.f21862c, bosVar.f21862c);
        this.f21862c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqt
    public final /* bridge */ /* synthetic */ bqt d(int i9) {
        if (i9 >= this.f21862c) {
            return new bos(Arrays.copyOf(this.f21861b, i9), this.f21862c);
        }
        throw new IllegalArgumentException();
    }

    public final void e(boolean z9) {
        a();
        int i9 = this.f21862c;
        boolean[] zArr = this.f21861b;
        if (i9 == zArr.length) {
            boolean[] zArr2 = new boolean[((i9 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i9);
            this.f21861b = zArr2;
        }
        boolean[] zArr3 = this.f21861b;
        int i10 = this.f21862c;
        this.f21862c = i10 + 1;
        zArr3[i10] = z9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bos)) {
            return super.equals(obj);
        }
        bos bosVar = (bos) obj;
        if (this.f21862c != bosVar.f21862c) {
            return false;
        }
        boolean[] zArr = bosVar.f21861b;
        for (int i9 = 0; i9 < this.f21862c; i9++) {
            if (this.f21861b[i9] != zArr[i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i9) {
        g(i9);
        return Boolean.valueOf(this.f21861b[i9]);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iA = 1;
        for (int i9 = 0; i9 < this.f21862c; i9++) {
            iA = (iA * 31) + bqu.a(this.f21861b[i9]);
        }
        return iA;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i9 = this.f21862c;
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.f21861b[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        a();
        g(i9);
        boolean[] zArr = this.f21861b;
        boolean z9 = zArr[i9];
        if (i9 < this.f21862c - 1) {
            System.arraycopy(zArr, i9 + 1, zArr, i9, (r2 - i9) - 1);
        }
        this.f21862c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z9);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        a();
        if (i10 < i9) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f21861b;
        System.arraycopy(zArr, i10, zArr, i9, this.f21862c - i10);
        this.f21862c -= i10 - i9;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        g(i9);
        boolean[] zArr = this.f21861b;
        boolean z9 = zArr[i9];
        zArr[i9] = zBooleanValue;
        return Boolean.valueOf(z9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21862c;
    }
}
