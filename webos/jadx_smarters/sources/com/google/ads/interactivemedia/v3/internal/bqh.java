package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class bqh extends bop implements RandomAccess, bqt, brz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bqh f22096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f22097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22098c;

    static {
        bqh bqhVar = new bqh(new float[0], 0);
        f22096a = bqhVar;
        bqhVar.b();
    }

    public bqh() {
        this(new float[10], 0);
    }

    private bqh(float[] fArr, int i9) {
        this.f22097b = fArr;
        this.f22098c = i9;
    }

    private final String f(int i9) {
        return "Index:" + i9 + ", Size:" + this.f22098c;
    }

    private final void g(int i9) {
        if (i9 < 0 || i9 >= this.f22098c) {
            throw new IndexOutOfBoundsException(f(i9));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i9, Object obj) {
        int i10;
        float fFloatValue = ((Float) obj).floatValue();
        a();
        if (i9 < 0 || i9 > (i10 = this.f22098c)) {
            throw new IndexOutOfBoundsException(f(i9));
        }
        float[] fArr = this.f22097b;
        if (i10 < fArr.length) {
            System.arraycopy(fArr, i9, fArr, i9 + 1, i10 - i9);
        } else {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i9);
            System.arraycopy(this.f22097b, i9, fArr2, i9 + 1, this.f22098c - i9);
            this.f22097b = fArr2;
        }
        this.f22097b[i9] = fFloatValue;
        this.f22098c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Float) obj).floatValue());
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        bqu.i(collection);
        if (!(collection instanceof bqh)) {
            return super.addAll(collection);
        }
        bqh bqhVar = (bqh) collection;
        int i9 = bqhVar.f22098c;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.f22098c;
        if (a.e.API_PRIORITY_OTHER - i10 < i9) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i9;
        float[] fArr = this.f22097b;
        if (i11 > fArr.length) {
            this.f22097b = Arrays.copyOf(fArr, i11);
        }
        System.arraycopy(bqhVar.f22097b, 0, this.f22097b, this.f22098c, bqhVar.f22098c);
        this.f22098c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqt
    public final /* bridge */ /* synthetic */ bqt d(int i9) {
        if (i9 >= this.f22098c) {
            return new bqh(Arrays.copyOf(this.f22097b, i9), this.f22098c);
        }
        throw new IllegalArgumentException();
    }

    public final void e(float f9) {
        a();
        int i9 = this.f22098c;
        float[] fArr = this.f22097b;
        if (i9 == fArr.length) {
            float[] fArr2 = new float[((i9 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i9);
            this.f22097b = fArr2;
        }
        float[] fArr3 = this.f22097b;
        int i10 = this.f22098c;
        this.f22098c = i10 + 1;
        fArr3[i10] = f9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqh)) {
            return super.equals(obj);
        }
        bqh bqhVar = (bqh) obj;
        if (this.f22098c != bqhVar.f22098c) {
            return false;
        }
        float[] fArr = bqhVar.f22097b;
        for (int i9 = 0; i9 < this.f22098c; i9++) {
            if (Float.floatToIntBits(this.f22097b[i9]) != Float.floatToIntBits(fArr[i9])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i9) {
        g(i9);
        return Float.valueOf(this.f22097b[i9]);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i9 = 0; i9 < this.f22098c; i9++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f22097b[i9]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i9 = this.f22098c;
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.f22097b[i10] == fFloatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        a();
        g(i9);
        float[] fArr = this.f22097b;
        float f9 = fArr[i9];
        if (i9 < this.f22098c - 1) {
            System.arraycopy(fArr, i9 + 1, fArr, i9, (r2 - i9) - 1);
        }
        this.f22098c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f9);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        a();
        if (i10 < i9) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f22097b;
        System.arraycopy(fArr, i10, fArr, i9, this.f22098c - i10);
        this.f22098c -= i10 - i9;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bop, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        a();
        g(i9);
        float[] fArr = this.f22097b;
        float f9 = fArr[i9];
        fArr[i9] = fFloatValue;
        return Float.valueOf(f9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22098c;
    }
}
