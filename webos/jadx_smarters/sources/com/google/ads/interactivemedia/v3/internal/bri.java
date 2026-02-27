package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class bri extends bop implements RandomAccess, bqt, brz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bri f22155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f22156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22157c;

    static {
        bri briVar = new bri(new long[0], 0);
        f22155a = briVar;
        briVar.b();
    }

    public bri() {
        this(new long[10], 0);
    }

    private bri(long[] jArr, int i9) {
        this.f22156b = jArr;
        this.f22157c = i9;
    }

    private final String g(int i9) {
        return "Index:" + i9 + ", Size:" + this.f22157c;
    }

    private final void h(int i9) {
        if (i9 < 0 || i9 >= this.f22157c) {
            throw new IndexOutOfBoundsException(g(i9));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i9, Object obj) {
        int i10;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i9 < 0 || i9 > (i10 = this.f22157c)) {
            throw new IndexOutOfBoundsException(g(i9));
        }
        long[] jArr = this.f22156b;
        if (i10 < jArr.length) {
            System.arraycopy(jArr, i9, jArr, i9 + 1, i10 - i9);
        } else {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i9);
            System.arraycopy(this.f22156b, i9, jArr2, i9 + 1, this.f22157c - i9);
            this.f22156b = jArr2;
        }
        this.f22156b[i9] = jLongValue;
        this.f22157c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Long) obj).longValue());
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        bqu.i(collection);
        if (!(collection instanceof bri)) {
            return super.addAll(collection);
        }
        bri briVar = (bri) collection;
        int i9 = briVar.f22157c;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.f22157c;
        if (a.e.API_PRIORITY_OTHER - i10 < i9) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i9;
        long[] jArr = this.f22156b;
        if (i11 > jArr.length) {
            this.f22156b = Arrays.copyOf(jArr, i11);
        }
        System.arraycopy(briVar.f22156b, 0, this.f22156b, this.f22157c, briVar.f22157c);
        this.f22157c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqt
    public final /* bridge */ /* synthetic */ bqt d(int i9) {
        if (i9 >= this.f22157c) {
            return new bri(Arrays.copyOf(this.f22156b, i9), this.f22157c);
        }
        throw new IllegalArgumentException();
    }

    public final long e(int i9) {
        h(i9);
        return this.f22156b[i9];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bri)) {
            return super.equals(obj);
        }
        bri briVar = (bri) obj;
        if (this.f22157c != briVar.f22157c) {
            return false;
        }
        long[] jArr = briVar.f22156b;
        for (int i9 = 0; i9 < this.f22157c; i9++) {
            if (this.f22156b[i9] != jArr[i9]) {
                return false;
            }
        }
        return true;
    }

    public final void f(long j9) {
        a();
        int i9 = this.f22157c;
        long[] jArr = this.f22156b;
        if (i9 == jArr.length) {
            long[] jArr2 = new long[((i9 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i9);
            this.f22156b = jArr2;
        }
        long[] jArr3 = this.f22156b;
        int i10 = this.f22157c;
        this.f22157c = i10 + 1;
        jArr3[i10] = j9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i9) {
        return Long.valueOf(e(i9));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iC = 1;
        for (int i9 = 0; i9 < this.f22157c; i9++) {
            iC = (iC * 31) + bqu.c(this.f22156b[i9]);
        }
        return iC;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i9 = this.f22157c;
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.f22156b[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        a();
        h(i9);
        long[] jArr = this.f22156b;
        long j9 = jArr[i9];
        if (i9 < this.f22157c - 1) {
            System.arraycopy(jArr, i9 + 1, jArr, i9, (r3 - i9) - 1);
        }
        this.f22157c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j9);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        a();
        if (i10 < i9) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f22156b;
        System.arraycopy(jArr, i10, jArr, i9, this.f22157c - i10);
        this.f22157c -= i10 - i9;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        h(i9);
        long[] jArr = this.f22156b;
        long j9 = jArr[i9];
        jArr[i9] = jLongValue;
        return Long.valueOf(j9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22157c;
    }
}
