package M4;

import java.util.Iterator;

/* JADX INFO: renamed from: M4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0814s implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f5049a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0820t f5050c;

    public C0814s(C0820t c0820t) {
        this.f5050c = c0820t;
        this.f5049a = c0820t.f5061f.keySet().iterator();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.f5049a.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5049a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
