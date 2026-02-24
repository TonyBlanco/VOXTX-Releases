package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2058y3 extends AbstractC2063z3 implements Spliterator {
    C2058y3(Spliterator spliterator, long j9, long j10) {
        super(spliterator, j9, j10, 0L, Math.min(spliterator.estimateSize(), j10));
    }

    @Override // j$.util.stream.AbstractC2063z3
    protected final Spliterator a(Spliterator spliterator, long j9, long j10, long j11, long j12) {
        return new C2058y3(spliterator, j9, j10, j11, j12);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        long j9 = this.f42810e;
        long j10 = this.f42806a;
        if (j10 >= j9) {
            return;
        }
        long j11 = this.f42809d;
        if (j11 >= j9) {
            return;
        }
        if (j11 >= j10 && this.f42808c.estimateSize() + j11 <= this.f42807b) {
            this.f42808c.forEachRemaining(consumer);
            this.f42809d = this.f42810e;
            return;
        }
        while (j10 > this.f42809d) {
            this.f42808c.tryAdvance(new C1948c2(5));
            this.f42809d++;
        }
        while (this.f42809d < this.f42810e) {
            this.f42808c.tryAdvance(consumer);
            this.f42809d++;
        }
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

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        long j9;
        Objects.requireNonNull(consumer);
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
            this.f42808c.tryAdvance(new C1948c2(4));
            this.f42809d++;
        }
        if (j9 >= this.f42810e) {
            return false;
        }
        this.f42809d = j9 + 1;
        return this.f42808c.tryAdvance(consumer);
    }
}
