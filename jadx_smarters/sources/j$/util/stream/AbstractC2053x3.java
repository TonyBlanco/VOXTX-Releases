package j$.util.stream;

import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC2053x3 extends AbstractC2063z3 implements j$.util.N {
    AbstractC2053x3(j$.util.N n9, long j9, long j10) {
        super(n9, j9, j10, 0L, Math.min(n9.estimateSize(), j10));
    }

    protected abstract Object b();

    @Override // j$.util.N
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        long j9 = this.f42810e;
        long j10 = this.f42806a;
        if (j10 >= j9) {
            return;
        }
        long j11 = this.f42809d;
        if (j11 >= j9) {
            return;
        }
        if (j11 >= j10 && ((j$.util.N) this.f42808c).estimateSize() + j11 <= this.f42807b) {
            ((j$.util.N) this.f42808c).forEachRemaining(obj);
            this.f42809d = this.f42810e;
            return;
        }
        while (j10 > this.f42809d) {
            ((j$.util.N) this.f42808c).tryAdvance(b());
            this.f42809d++;
        }
        while (this.f42809d < this.f42810e) {
            ((j$.util.N) this.f42808c).tryAdvance(obj);
            this.f42809d++;
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.A.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i9) {
        return j$.util.A.e(this, i9);
    }

    @Override // j$.util.N
    public final boolean tryAdvance(Object obj) {
        long j9;
        Objects.requireNonNull(obj);
        long j10 = this.f42810e;
        long j11 = this.f42806a;
        if (j11 >= j10) {
            return false;
        }
        while (true) {
            j9 = this.f42809d;
            if (j11 <= j9) {
                break;
            }
            ((j$.util.N) this.f42808c).tryAdvance(b());
            this.f42809d++;
        }
        if (j9 >= this.f42810e) {
            return false;
        }
        this.f42809d = j9 + 1;
        return ((j$.util.N) this.f42808c).tryAdvance(obj);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }
}
