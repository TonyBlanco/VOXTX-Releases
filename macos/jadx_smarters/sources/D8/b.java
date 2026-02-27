package D8;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f1516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1517b;

    public static final class a implements Iterator, x8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator f1518a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1519c;

        public a(b bVar) {
            this.f1518a = bVar.f1516a.iterator();
            this.f1519c = bVar.f1517b;
        }

        public final void b() {
            while (this.f1519c > 0 && this.f1518a.hasNext()) {
                this.f1518a.next();
                this.f1519c--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            b();
            return this.f1518a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            b();
            return this.f1518a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(d sequence, int i9) {
        kotlin.jvm.internal.l.e(sequence, "sequence");
        this.f1516a = sequence;
        this.f1517b = i9;
        if (i9 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i9 + '.').toString());
    }

    @Override // D8.c
    public d a(int i9) {
        int i10 = this.f1517b + i9;
        return i10 < 0 ? new b(this, i9) : new b(this.f1516a, i10);
    }

    @Override // D8.d
    public Iterator iterator() {
        return new a(this);
    }
}
