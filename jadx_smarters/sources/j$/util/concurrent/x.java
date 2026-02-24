package j$.util.concurrent;

import j$.util.A;
import j$.util.E;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class x implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f42338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f42339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final double f42340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final double f42341d;

    x(long j9, long j10, double d9, double d10) {
        this.f42338a = j9;
        this.f42339b = j10;
        this.f42340c = d9;
        this.f42341d = d10;
    }

    @Override // j$.util.Spliterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final x trySplit() {
        long j9 = this.f42338a;
        long j10 = (this.f42339b + j9) >>> 1;
        if (j10 <= j9) {
            return null;
        }
        this.f42338a = j10;
        return new x(j9, j10, this.f42340c, this.f42341d);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f42339b - this.f42338a;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        A.a(this, consumer);
    }

    @Override // j$.util.N
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j9 = this.f42338a;
        long j10 = this.f42339b;
        if (j9 < j10) {
            this.f42338a = j10;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                doubleConsumer.accept(threadLocalRandomCurrent.c(this.f42340c, this.f42341d));
                j9++;
            } while (j9 < j10);
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
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return A.g(this, consumer);
    }

    @Override // j$.util.N
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j9 = this.f42338a;
        if (j9 >= this.f42339b) {
            return false;
        }
        doubleConsumer.accept(ThreadLocalRandom.current().c(this.f42340c, this.f42341d));
        this.f42338a = j9 + 1;
        return true;
    }
}
