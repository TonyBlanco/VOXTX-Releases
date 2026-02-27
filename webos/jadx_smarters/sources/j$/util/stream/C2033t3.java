package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2033t3 extends AbstractC1969g3 implements j$.util.K {
    @Override // j$.util.stream.AbstractC1969g3
    final void d() {
        X2 x22 = new X2();
        this.f42666h = x22;
        Objects.requireNonNull(x22);
        this.f42663e = this.f42660b.W(new C2028s3(x22, 0));
        this.f42664f = new C1935a(this, 4);
    }

    @Override // j$.util.stream.AbstractC1969g3
    final AbstractC1969g3 e(Spliterator spliterator) {
        return new C2033t3(this.f42660b, spliterator, this.f42659a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.A.c(this, consumer);
    }

    @Override // j$.util.N
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.f42666h != null || this.f42667i) {
            while (tryAdvance(longConsumer)) {
            }
            return;
        }
        Objects.requireNonNull(longConsumer);
        c();
        Objects.requireNonNull(longConsumer);
        C2028s3 c2028s3 = new C2028s3(longConsumer, 1);
        this.f42660b.V(this.f42662d, c2028s3);
        this.f42667i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.A.i(this, consumer);
    }

    @Override // j$.util.N
    public final boolean tryAdvance(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        boolean zA = a();
        if (zA) {
            X2 x22 = (X2) this.f42666h;
            long j9 = this.f42665g;
            int iU = x22.u(j9);
            longConsumer.accept((x22.f42605c == 0 && iU == 0) ? ((long[]) x22.f42575e)[(int) j9] : ((long[][]) x22.f42576f)[iU][(int) (j9 - x22.f42606d[iU])]);
        }
        return zA;
    }

    @Override // j$.util.stream.AbstractC1969g3, j$.util.Spliterator
    public final j$.util.K trySplit() {
        return (j$.util.K) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC1969g3, j$.util.Spliterator
    public final j$.util.N trySplit() {
        return (j$.util.K) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC1969g3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.K) super.trySplit();
    }
}
