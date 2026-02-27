package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class O0 implements K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Collection f42492a;

    O0(Collection collection) {
        this.f42492a = collection;
    }

    @Override // j$.util.stream.K0
    public final K0 b(int i9) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final long count() {
        return this.f42492a.size();
    }

    @Override // j$.util.stream.K0
    public final void forEach(Consumer consumer) {
        Collection collection = this.f42492a;
        if (collection instanceof j$.util.Collection) {
            ((j$.util.Collection) collection).forEach(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            consumer.q(it.next());
        }
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 i(long j9, long j10, IntFunction intFunction) {
        return AbstractC2055y0.w(this, j9, j10, intFunction);
    }

    @Override // j$.util.stream.K0
    public final void j(Object[] objArr, int i9) {
        Iterator it = this.f42492a.iterator();
        while (it.hasNext()) {
            objArr[i9] = it.next();
            i9++;
        }
    }

    @Override // j$.util.stream.K0
    public final Object[] p(IntFunction intFunction) {
        Collection collection = this.f42492a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int r() {
        return 0;
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        Collection collection = this.f42492a;
        return (collection instanceof j$.util.Collection ? ((j$.util.Collection) collection).stream() : AbstractC2055y0.f0(j$.util.A.s(collection), false)).spliterator();
    }

    public final String toString() {
        Collection collection = this.f42492a;
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(collection.size()), collection);
    }
}
