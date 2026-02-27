package j$.util.stream;

import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class W2 extends Y2 implements j$.util.K {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ X2 f42559g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    W2(X2 x22, int i9, int i10, int i11, int i12) {
        super(x22, i9, i10, i11, i12);
        this.f42559g = x22;
    }

    @Override // j$.util.stream.Y2
    final void a(int i9, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i9]);
    }

    @Override // j$.util.stream.Y2
    final j$.util.N b(Object obj, int i9, int i10) {
        return Spliterators.l((long[]) obj, i9, i10 + i9);
    }

    @Override // j$.util.stream.Y2
    final j$.util.N c(int i9, int i10, int i11, int i12) {
        return new W2(this.f42559g, i9, i10, i11, i12);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.A.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.A.i(this, consumer);
    }
}
