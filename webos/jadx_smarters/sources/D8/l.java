package D8;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f1527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w8.l f1528b;

    public static final class a implements Iterator, x8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator f1529a;

        public a() {
            this.f1529a = l.this.f1527a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1529a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return l.this.f1528b.invoke(this.f1529a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public l(d sequence, w8.l transformer) {
        kotlin.jvm.internal.l.e(sequence, "sequence");
        kotlin.jvm.internal.l.e(transformer, "transformer");
        this.f1527a = sequence;
        this.f1528b = transformer;
    }

    @Override // D8.d
    public Iterator iterator() {
        return new a();
    }
}
