package l8;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x implements Iterator, x8.a {
    public abstract int b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
