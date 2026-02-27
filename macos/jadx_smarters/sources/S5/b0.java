package s5;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f50048a;

    public b0(Iterator it) {
        this.f50048a = (Iterator) r5.m.k(it);
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f50048a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f50048a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f50048a.remove();
    }
}
