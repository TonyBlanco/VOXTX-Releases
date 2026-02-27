package j$.util.concurrent;

import j$.util.A;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class f extends p implements Spliterator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final ConcurrentHashMap f42300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    long f42301j;

    f(l[] lVarArr, int i9, int i10, int i11, long j9, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i9, i10, i11);
        this.f42300i = concurrentHashMap;
        this.f42301j = j9;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4353;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f42301j;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            l lVarA = a();
            if (lVarA == null) {
                return;
            } else {
                consumer.accept(new k(lVarA.f42310b, lVarA.f42311c, this.f42300i));
            }
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return A.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i9) {
        return A.e(this, i9);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        l lVarA = a();
        if (lVarA == null) {
            return false;
        }
        consumer.accept(new k(lVarA.f42310b, lVarA.f42311c, this.f42300i));
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i9 = this.f42322f;
        int i10 = this.f42323g;
        int i11 = (i9 + i10) >>> 1;
        if (i11 <= i9) {
            return null;
        }
        l[] lVarArr = this.f42317a;
        this.f42323g = i11;
        long j9 = this.f42301j >>> 1;
        this.f42301j = j9;
        return new f(lVarArr, this.f42324h, i11, i10, j9, this.f42300i);
    }
}
