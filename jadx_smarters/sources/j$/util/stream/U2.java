package j$.util.stream;

import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class U2 extends Y2 implements j$.util.H {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ V2 f42552g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U2(V2 v22, int i9, int i10, int i11, int i12) {
        super(v22, i9, i10, i11, i12);
        this.f42552g = v22;
    }

    @Override // j$.util.stream.Y2
    final void a(int i9, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i9]);
    }

    @Override // j$.util.stream.Y2
    final j$.util.N b(Object obj, int i9, int i10) {
        return Spliterators.k((int[]) obj, i9, i10 + i9);
    }

    @Override // j$.util.stream.Y2
    final j$.util.N c(int i9, int i10, int i11, int i12) {
        return new U2(this.f42552g, i9, i10, i11, i12);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.A.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.A.h(this, consumer);
    }
}
