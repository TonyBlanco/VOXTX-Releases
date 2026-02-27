package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2048w3 extends AbstractC2053x3 implements j$.util.K {
    @Override // j$.util.stream.AbstractC2063z3
    protected final Spliterator a(Spliterator spliterator, long j9, long j10, long j11, long j12) {
        return new C2048w3((j$.util.K) spliterator, j9, j10, j11, j12);
    }

    @Override // j$.util.stream.AbstractC2053x3
    protected final Object b() {
        return new H0(1);
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
