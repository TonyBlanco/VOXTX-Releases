package j$.util.concurrent;

import j$.util.A;
import j$.util.H;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class y implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f42342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f42343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f42344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f42345d;

    y(long j9, long j10, int i9, int i10) {
        this.f42342a = j9;
        this.f42343b = j10;
        this.f42344c = i9;
        this.f42345d = i10;
    }

    @Override // j$.util.Spliterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y trySplit() {
        long j9 = this.f42342a;
        long j10 = (this.f42343b + j9) >>> 1;
        if (j10 <= j9) {
            return null;
        }
        this.f42342a = j10;
        return new y(j9, j10, this.f42344c, this.f42345d);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f42343b - this.f42342a;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        A.b(this, consumer);
    }

    @Override // j$.util.N
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j9 = this.f42342a;
        long j10 = this.f42343b;
        if (j9 < j10) {
            this.f42342a = j10;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                intConsumer.accept(threadLocalRandomCurrent.d(this.f42344c, this.f42345d));
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
        return A.h(this, consumer);
    }

    @Override // j$.util.N
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j9 = this.f42342a;
        if (j9 >= this.f42343b) {
            return false;
        }
        intConsumer.accept(ThreadLocalRandom.current().d(this.f42344c, this.f42345d));
        this.f42342a = j9 + 1;
        return true;
    }
}
