package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2023r3 extends AbstractC1969g3 implements j$.util.H {
    @Override // j$.util.stream.AbstractC1969g3
    final void d() {
        V2 v22 = new V2();
        this.f42666h = v22;
        Objects.requireNonNull(v22);
        this.f42663e = this.f42660b.W(new C2019q3(v22, 0));
        this.f42664f = new C1935a(this, 3);
    }

    @Override // j$.util.stream.AbstractC1969g3
    final AbstractC1969g3 e(Spliterator spliterator) {
        return new C2023r3(this.f42660b, spliterator, this.f42659a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.A.b(this, consumer);
    }

    @Override // j$.util.N
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.f42666h != null || this.f42667i) {
            while (tryAdvance(intConsumer)) {
            }
            return;
        }
        Objects.requireNonNull(intConsumer);
        c();
        Objects.requireNonNull(intConsumer);
        C2019q3 c2019q3 = new C2019q3(intConsumer, 1);
        this.f42660b.V(this.f42662d, c2019q3);
        this.f42667i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.A.h(this, consumer);
    }

    @Override // j$.util.N
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        boolean zA = a();
        if (zA) {
            V2 v22 = (V2) this.f42666h;
            long j9 = this.f42665g;
            int iU = v22.u(j9);
            intConsumer.accept((v22.f42605c == 0 && iU == 0) ? ((int[]) v22.f42575e)[(int) j9] : ((int[][]) v22.f42576f)[iU][(int) (j9 - v22.f42606d[iU])]);
        }
        return zA;
    }

    @Override // j$.util.stream.AbstractC1969g3, j$.util.Spliterator
    public final j$.util.H trySplit() {
        return (j$.util.H) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC1969g3, j$.util.Spliterator
    public final j$.util.N trySplit() {
        return (j$.util.H) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC1969g3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.H) super.trySplit();
    }
}
