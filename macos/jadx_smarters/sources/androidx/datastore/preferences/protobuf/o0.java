package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class o0 extends AbstractList implements D, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f14717a;

    public class a implements ListIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ListIterator f14718a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f14719c;

        public a(int i9) {
            this.f14719c = i9;
            this.f14718a = o0.this.f14717a.listIterator(i9);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f14718a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f14718a.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f14718a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f14718a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f14718a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f14718a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator f14721a;

        public b() {
            this.f14721a = o0.this.f14717a.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f14721a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14721a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public o0(D d9) {
        this.f14717a = d9;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public D C() {
        return this;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public Object G(int i9) {
        return this.f14717a.G(i9);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get(int i9) {
        return (String) this.f14717a.get(i9);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i9) {
        return new a(i9);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public List m() {
        return this.f14717a.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f14717a.size();
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public void x(AbstractC1122g abstractC1122g) {
        throw new UnsupportedOperationException();
    }
}
