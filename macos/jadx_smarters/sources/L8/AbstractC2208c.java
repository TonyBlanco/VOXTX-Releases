package l8;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2208c extends AbstractC2206a implements List, x8.a {

    @NotNull
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: l8.c$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a(int i9, int i10) {
            if (i9 < 0 || i9 >= i10) {
                throw new IndexOutOfBoundsException("index: " + i9 + ", size: " + i10);
            }
        }

        public final void b(int i9, int i10) {
            if (i9 < 0 || i9 > i10) {
                throw new IndexOutOfBoundsException("index: " + i9 + ", size: " + i10);
            }
        }

        public final void c(int i9, int i10, int i11) {
            if (i9 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("fromIndex: " + i9 + ", toIndex: " + i10 + ", size: " + i11);
            }
            if (i9 <= i10) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i9 + " > toIndex: " + i10);
        }

        public final boolean d(Collection c9, Collection other) {
            kotlin.jvm.internal.l.e(c9, "c");
            kotlin.jvm.internal.l.e(other, "other");
            if (c9.size() != other.size()) {
                return false;
            }
            Iterator it = other.iterator();
            Iterator it2 = c9.iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.l.a(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int e(Collection c9) {
            kotlin.jvm.internal.l.e(c9, "c");
            Iterator it = c9.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }
    }

    /* JADX INFO: renamed from: l8.c$b */
    public class b implements Iterator, x8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44250a;

        public b() {
        }

        public final int b() {
            return this.f44250a;
        }

        public final void c(int i9) {
            this.f44250a = i9;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f44250a < AbstractC2208c.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC2208c abstractC2208c = AbstractC2208c.this;
            int i9 = this.f44250a;
            this.f44250a = i9 + 1;
            return abstractC2208c.get(i9);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: l8.c$c, reason: collision with other inner class name */
    public class C0377c extends b implements ListIterator, x8.a {
        public C0377c(int i9) {
            super();
            AbstractC2208c.Companion.b(i9, AbstractC2208c.this.size());
            c(i9);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return b() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return b();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC2208c abstractC2208c = AbstractC2208c.this;
            c(b() - 1);
            return abstractC2208c.get(b());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return b() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: l8.c$d */
    public static final class d extends AbstractC2208c implements RandomAccess {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC2208c f44253a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f44254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f44255d;

        public d(AbstractC2208c list, int i9, int i10) {
            kotlin.jvm.internal.l.e(list, "list");
            this.f44253a = list;
            this.f44254c = i9;
            AbstractC2208c.Companion.c(i9, i10, list.size());
            this.f44255d = i10 - i9;
        }

        @Override // l8.AbstractC2208c, java.util.List
        public Object get(int i9) {
            AbstractC2208c.Companion.a(i9, this.f44255d);
            return this.f44253a.get(this.f44254c + i9);
        }

        @Override // l8.AbstractC2206a
        public int getSize() {
            return this.f44255d;
        }
    }

    @Override // java.util.List
    public void add(int i9, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i9, Collection<Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return Companion.d(this, (Collection) obj);
        }
        return false;
    }

    public abstract Object get(int i9);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.e(this);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i9 = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.l.a(it.next(), obj)) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<Object> iterator() {
        return new b();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.l.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<Object> listIterator() {
        return new C0377c(0);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<Object> listIterator(int i9) {
        return new C0377c(i9);
    }

    @Override // java.util.List
    public Object remove(int i9) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i9, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public List<Object> subList(int i9, int i10) {
        return new d(this, i9, i10);
    }
}
