package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2014p3 extends AbstractC1969g3 implements j$.util.E {
    @Override // j$.util.stream.AbstractC1969g3
    final void d() {
        T2 t22 = new T2();
        this.f42666h = t22;
        Objects.requireNonNull(t22);
        this.f42663e = this.f42660b.W(new C2009o3(t22, 0));
        this.f42664f = new C1935a(this, 2);
    }

    @Override // j$.util.stream.AbstractC1969g3
    final AbstractC1969g3 e(Spliterator spliterator) {
        return new C2014p3(this.f42660b, spliterator, this.f42659a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.A.a(this, consumer);
    }

    @Override // j$.util.N
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.f42666h != null || this.f42667i) {
            while (tryAdvance(doubleConsumer)) {
            }
            return;
        }
        Objects.requireNonNull(doubleConsumer);
        c();
        Objects.requireNonNull(doubleConsumer);
        C2009o3 c2009o3 = new C2009o3(doubleConsumer, 1);
        this.f42660b.V(this.f42662d, c2009o3);
        this.f42667i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.A.g(this, consumer);
    }

    @Override // j$.util.N
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        boolean zA = a();
        if (zA) {
            T2 t22 = (T2) this.f42666h;
            long j9 = this.f42665g;
            int iU = t22.u(j9);
            doubleConsumer.accept((t22.f42605c == 0 && iU == 0) ? ((double[]) t22.f42575e)[(int) j9] : ((double[][]) t22.f42576f)[iU][(int) (j9 - t22.f42606d[iU])]);
        }
        return zA;
    }

    @Override // j$.util.stream.AbstractC1969g3, j$.util.Spliterator
    public final j$.util.E trySplit() {
        return (j$.util.E) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC1969g3, j$.util.Spliterator
    public final j$.util.N trySplit() {
        return (j$.util.E) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC1969g3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.E) super.trySplit();
    }
}
