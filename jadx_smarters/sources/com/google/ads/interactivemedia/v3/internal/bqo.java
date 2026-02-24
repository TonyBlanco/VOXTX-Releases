package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class bqo extends bop implements RandomAccess, bqs, brz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bqo f22111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f22112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22113c;

    static {
        bqo bqoVar = new bqo(new int[0], 0);
        f22111a = bqoVar;
        bqoVar.b();
    }

    public bqo() {
        this(new int[10], 0);
    }

    private bqo(int[] iArr, int i9) {
        this.f22112b = iArr;
        this.f22113c = i9;
    }

    public static bqo f() {
        return f22111a;
    }

    private final String h(int i9) {
        return "Index:" + i9 + ", Size:" + this.f22113c;
    }

    private final void i(int i9) {
        if (i9 < 0 || i9 >= this.f22113c) {
            throw new IndexOutOfBoundsException(h(i9));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i9, Object obj) {
        int i10;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i9 < 0 || i9 > (i10 = this.f22113c)) {
            throw new IndexOutOfBoundsException(h(i9));
        }
        int[] iArr = this.f22112b;
        if (i10 < iArr.length) {
            System.arraycopy(iArr, i9, iArr, i9 + 1, i10 - i9);
        } else {
            int[] iArr2 = new int[((i10 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i9);
            System.arraycopy(this.f22112b, i9, iArr2, i9 + 1, this.f22113c - i9);
            this.f22112b = iArr2;
        }
        this.f22112b[i9] = iIntValue;
        this.f22113c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        bqu.i(collection);
        if (!(collection instanceof bqo)) {
            return super.addAll(collection);
        }
        bqo bqoVar = (bqo) collection;
        int i9 = bqoVar.f22113c;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.f22113c;
        if (a.e.API_PRIORITY_OTHER - i10 < i9) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i9;
        int[] iArr = this.f22112b;
        if (i11 > iArr.length) {
            this.f22112b = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(bqoVar.f22112b, 0, this.f22112b, this.f22113c, bqoVar.f22113c);
        this.f22113c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqt
    public final /* bridge */ /* synthetic */ bqt d(int i9) {
        if (i9 >= this.f22113c) {
            return new bqo(Arrays.copyOf(this.f22112b, i9), this.f22113c);
        }
        throw new IllegalArgumentException();
    }

    public final int e(int i9) {
        i(i9);
        return this.f22112b[i9];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqo)) {
            return super.equals(obj);
        }
        bqo bqoVar = (bqo) obj;
        if (this.f22113c != bqoVar.f22113c) {
            return false;
        }
        int[] iArr = bqoVar.f22112b;
        for (int i9 = 0; i9 < this.f22113c; i9++) {
            if (this.f22112b[i9] != iArr[i9]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i9) {
        a();
        int i10 = this.f22113c;
        int[] iArr = this.f22112b;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[((i10 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f22112b = iArr2;
        }
        int[] iArr3 = this.f22112b;
        int i11 = this.f22113c;
        this.f22113c = i11 + 1;
        iArr3[i11] = i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i9) {
        return Integer.valueOf(e(i9));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.f22113c; i10++) {
            i9 = (i9 * 31) + this.f22112b[i10];
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i9 = this.f22113c;
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.f22112b[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        a();
        i(i9);
        int[] iArr = this.f22112b;
        int i10 = iArr[i9];
        if (i9 < this.f22113c - 1) {
            System.arraycopy(iArr, i9 + 1, iArr, i9, (r2 - i9) - 1);
        }
        this.f22113c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        a();
        if (i10 < i9) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f22112b;
        System.arraycopy(iArr, i10, iArr, i9, this.f22113c - i10);
        this.f22113c -= i10 - i9;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        i(i9);
        int[] iArr = this.f22112b;
        int i10 = iArr[i9];
        iArr[i9] = iIntValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22113c;
    }
}
