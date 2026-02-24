package com.google.ads.interactivemedia.v3.internal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class avo<E> extends avi<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final axr f20816a = new axr(awz.f20861a, 0);

    public static avk j() {
        return new avk();
    }

    public static avo k(Object[] objArr) {
        return l(objArr, objArr.length);
    }

    public static avo l(Object[] objArr, int i9) {
        return i9 == 0 ? awz.f20861a : new awz(objArr, i9);
    }

    public static avo m(Collection collection) {
        if (!(collection instanceof avi)) {
            return u(collection.toArray());
        }
        avo avoVarD = ((avi) collection).d();
        return avoVarD.f() ? k(avoVarD.toArray()) : avoVarD;
    }

    public static avo n(Object[] objArr) {
        return objArr.length == 0 ? awz.f20861a : u((Object[]) objArr.clone());
    }

    public static avo o() {
        return awz.f20861a;
    }

    public static avo p(Object obj) {
        return u(obj);
    }

    public static avo q(Object obj, Object obj2) {
        return u(obj, obj2);
    }

    public static avo r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return u(obj, obj2, obj3, obj4, obj5);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private static avo u(Object... objArr) {
        axo.l(objArr, objArr.length);
        return k(objArr);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public int a(Object[] objArr, int i9) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i9 + i10] = get(i10);
        }
        return i9 + size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i9, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i9, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    @Deprecated
    public final avo d() {
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    /* JADX INFO: renamed from: e */
    public final axq listIterator() {
        return iterator();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i9 = 0; i9 < size; i9++) {
                        if (com.google.ads.interactivemedia.v3.impl.data.k.c(get(i9), list.get(i9))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !com.google.ads.interactivemedia.v3.impl.data.k.c(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public avo h() {
        return size() <= 1 ? this : new avl(this);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i9 = 0; i9 < size; i9++) {
            iHashCode = (iHashCode * 31) + get(i9).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public avo subList(int i9, int i10) {
        atp.h(i9, i10, size());
        int i11 = i10 - i9;
        return i11 == size() ? this : i11 == 0 ? awz.f20861a : new avn(this, i9, i11);
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (obj.equals(get(i9))) {
                return i9;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i9) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final axr listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i9, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final axr listIterator(int i9) {
        atp.m(i9, size());
        return isEmpty() ? f20816a : new axr(this, i9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public Object writeReplace() {
        return new avm(toArray());
    }
}
