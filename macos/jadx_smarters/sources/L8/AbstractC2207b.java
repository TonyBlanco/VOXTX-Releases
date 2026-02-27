package l8;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2207b implements Iterator, x8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public G f44247a = G.NotReady;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f44248c;

    /* JADX INFO: renamed from: l8.b$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44249a;

        static {
            int[] iArr = new int[G.values().length];
            iArr[G.Done.ordinal()] = 1;
            iArr[G.Ready.ordinal()] = 2;
            f44249a = iArr;
        }
    }

    public abstract void b();

    public final void c() {
        this.f44247a = G.Done;
    }

    public final void d(Object obj) {
        this.f44248c = obj;
        this.f44247a = G.Ready;
    }

    public final boolean e() {
        this.f44247a = G.Failed;
        b();
        return this.f44247a == G.Ready;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        G g9 = this.f44247a;
        if (g9 == G.Failed) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i9 = a.f44249a[g9.ordinal()];
        if (i9 == 1) {
            return false;
        }
        if (i9 != 2) {
            return e();
        }
        return true;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f44247a = G.NotReady;
        return this.f44248c;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
