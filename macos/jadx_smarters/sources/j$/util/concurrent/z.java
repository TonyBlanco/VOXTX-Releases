package j$.util.concurrent;

import j$.util.A;
import j$.util.K;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class z implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f42346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f42347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f42348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f42349d;

    z(long j9, long j10, long j11, long j12) {
        this.f42346a = j9;
        this.f42347b = j10;
        this.f42348c = j11;
        this.f42349d = j12;
    }

    @Override // j$.util.Spliterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final z trySplit() {
        long j9 = this.f42346a;
        long j10 = (this.f42347b + j9) >>> 1;
        if (j10 <= j9) {
            return null;
        }
        this.f42346a = j10;
        return new z(j9, j10, this.f42348c, this.f42349d);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f42347b - this.f42346a;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        A.c(this, consumer);
    }

    @Override // j$.util.N
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j9 = this.f42346a;
        long j10 = this.f42347b;
        if (j9 < j10) {
            this.f42346a = j10;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                longConsumer.accept(threadLocalRandomCurrent.e(this.f42348c, this.f42349d));
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
        return A.i(this, consumer);
    }

    @Override // j$.util.N
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j9 = this.f42346a;
        if (j9 >= this.f42347b) {
            return false;
        }
        longConsumer.accept(ThreadLocalRandom.current().e(this.f42348c, this.f42349d));
        this.f42346a = j9 + 1;
        return true;
    }
}
