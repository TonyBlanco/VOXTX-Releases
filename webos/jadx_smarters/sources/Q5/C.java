package Q5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class C implements List, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8043a;

    public C(List list) {
        this.f8043a = Collections.unmodifiableList(list);
    }

    public static C a(List list) {
        return new C(list);
    }

    public static C b(Object... objArr) {
        return new C(Arrays.asList(objArr));
    }

    @Override // java.util.List
    public void add(int i9, Object obj) {
        this.f8043a.add(i9, obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        return this.f8043a.add(obj);
    }

    @Override // java.util.List
    public boolean addAll(int i9, Collection collection) {
        return this.f8043a.addAll(i9, collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        return this.f8043a.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f8043a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f8043a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f8043a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.f8043a.equals(obj);
    }

    @Override // java.util.List
    public Object get(int i9) {
        return this.f8043a.get(i9);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f8043a.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f8043a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f8043a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f8043a.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f8043a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return this.f8043a.listIterator();
    }

    @Override // java.util.List
    public ListIterator listIterator(int i9) {
        return this.f8043a.listIterator(i9);
    }

    @Override // java.util.List
    public Object remove(int i9) {
        return this.f8043a.remove(i9);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.f8043a.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        return this.f8043a.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        return this.f8043a.retainAll(collection);
    }

    @Override // java.util.List
    public Object set(int i9, Object obj) {
        return this.f8043a.set(i9, obj);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f8043a.size();
    }

    @Override // java.util.List
    public List subList(int i9, int i10) {
        return this.f8043a.subList(i9, i10);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f8043a.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.f8043a.toArray(objArr);
    }
}
