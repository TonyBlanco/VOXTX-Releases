package l8;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y implements Iterator, x8.a {
    public abstract long b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
