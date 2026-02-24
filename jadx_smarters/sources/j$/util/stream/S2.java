package j$.util.stream;

import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class S2 extends Y2 implements j$.util.E {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ T2 f42535g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S2(T2 t22, int i9, int i10, int i11, int i12) {
        super(t22, i9, i10, i11, i12);
        this.f42535g = t22;
    }

    @Override // j$.util.stream.Y2
    final void a(int i9, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i9]);
    }

    @Override // j$.util.stream.Y2
    final j$.util.N b(Object obj, int i9, int i10) {
        return Spliterators.j((double[]) obj, i9, i10 + i9);
    }

    @Override // j$.util.stream.Y2
    final j$.util.N c(int i9, int i10, int i11, int i12) {
        return new S2(this.f42535g, i9, i10, i11, i12);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.A.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.A.g(this, consumer);
    }
}
