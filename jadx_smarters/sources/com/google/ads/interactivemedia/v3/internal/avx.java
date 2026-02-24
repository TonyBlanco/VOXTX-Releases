package com.google.ads.interactivemedia.v3.internal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class avx<E> extends avi<E> implements Set<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient avo f20831a;

    private static avx j(int i9, Object... objArr) {
        if (i9 == 0) {
            return axf.f20877a;
        }
        if (i9 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return n(obj);
        }
        int iK = k(i9);
        Object[] objArr2 = new Object[iK];
        int i10 = iK - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i9; i13++) {
            Object obj2 = objArr[i13];
            axo.k(obj2, i13);
            int iHashCode = obj2.hashCode();
            int iE = axo.E(iHashCode);
            while (true) {
                int i14 = iE & i10;
                Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += iHashCode;
                    i12++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iE++;
            }
        }
        Arrays.fill(objArr, i12, i9, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new axm(obj4);
        }
        if (k(i12) < iK / 2) {
            return j(i12, objArr);
        }
        int length = objArr.length;
        if (i12 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new axf(objArr, i11, objArr2, i10, i12);
    }

    public static int k(int i9) {
        int iMax = Math.max(i9, 2);
        if (iMax >= 751619276) {
            atp.f(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static avx l(Collection collection) {
        if ((collection instanceof avx) && !(collection instanceof SortedSet)) {
            avx avxVar = (avx) collection;
            if (!avxVar.f()) {
                return avxVar;
            }
        }
        Object[] array = collection.toArray();
        return j(array.length, array);
    }

    public static avx m(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? j(length, (Object[]) objArr.clone()) : n(objArr[0]) : axf.f20877a;
    }

    public static avx n(Object obj) {
        return new axm(obj);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public avo d() {
        avo avoVar = this.f20831a;
        if (avoVar != null) {
            return avoVar;
        }
        avo avoVarI = i();
        this.f20831a = avoVarI;
        return avoVarI;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e */
    public abstract axq listIterator();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof avx) && h() && ((avx) obj).h() && hashCode() != obj.hashCode()) {
            return false;
        }
        return axo.g(this, obj);
    }

    public boolean h() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return axo.b(this);
    }

    public avo i() {
        return avo.k(toArray());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public Object writeReplace() {
        return new avw(toArray());
    }
}
