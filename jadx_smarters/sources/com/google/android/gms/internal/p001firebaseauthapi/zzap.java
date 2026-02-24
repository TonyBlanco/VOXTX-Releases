package com.google.android.gms.internal.p001firebaseauthapi;

import j$.util.List;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzap<E> extends zzak<E> implements List<E>, RandomAccess, j$.util.List {
    private static final zzbf<Object> zza = new zzar(zzax.zza, 0);

    public static <E> zzap<E> zza(E e9, E e10, E e11, E e12, E e13, E e14, E e15, E e16) {
        return zzb(e9, e10, e11, e12, e13, e14, e15, e16);
    }

    public static <E> zzap<E> zza(Collection<? extends E> collection) {
        if (!(collection instanceof zzak)) {
            return zzb(collection.toArray());
        }
        zzap<E> zzapVarZzc = ((zzak) collection).zzc();
        if (!zzapVarZzc.zze()) {
            return zzapVarZzc;
        }
        Object[] array = zzapVarZzc.toArray();
        return zzb(array, array.length);
    }

    public static <E> zzap<E> zza(Object[] objArr) {
        return zzb(objArr, objArr.length);
    }

    private static <E> zzap<E> zzb(Object... objArr) {
        int length = objArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (objArr[i9] == null) {
                throw new NullPointerException("at index " + i9);
            }
        }
        return zzb(objArr, objArr.length);
    }

    public static <E> zzap<E> zzb(Object[] objArr, int i9) {
        return i9 == 0 ? (zzap<E>) zzax.zza : new zzax(objArr, i9);
    }

    public static <E> zzao<E> zzg() {
        return new zzao<>();
    }

    public static <E> zzap<E> zzh() {
        return (zzap<E>) zzax.zza;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i9, E e9) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i9, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzak, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == zzy.zza(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i9 = 0; i9 < size; i9++) {
                        if (zzw.zza(get(i9), list.get(i9))) {
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator<E> it = list.iterator();
                int i10 = 0;
                while (true) {
                    if (i10 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        E e9 = get(i10);
                        i10++;
                        if (!zzw.zza(e9, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i9 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i9 = ~(~((i9 * 31) + get(i10).hashCode()));
        }
        return i9;
    }

    @Override // java.util.List
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

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzak, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.List
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
    public /* synthetic */ ListIterator listIterator() {
        return (zzbf) listIterator(0);
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator(int i9) {
        zzy.zzb(i9, size());
        return isEmpty() ? zza : new zzar(this, i9);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i9) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i9, E e9) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzak
    public int zza(Object[] objArr, int i9) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i9 + i10] = get(i10);
        }
        return i9 + size;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public zzap<E> subList(int i9, int i10) {
        zzy.zza(i9, i10, size());
        int i11 = i10 - i9;
        return i11 == size() ? this : i11 == 0 ? (zzap<E>) zzax.zza : new zzaq(this, i9, i11);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzak
    @Deprecated
    public final zzap<E> zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzak
    /* JADX INFO: renamed from: zzd */
    public final zzbc<E> iterator() {
        return (zzbf) listIterator();
    }
}
