package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2043v3 extends AbstractC2053x3 implements j$.util.H {
    @Override // j$.util.stream.AbstractC2063z3
    protected final Spliterator a(Spliterator spliterator, long j9, long j10, long j11, long j12) {
        return new C2043v3((j$.util.H) spliterator, j9, j10, j11, j12);
    }

    @Override // j$.util.stream.AbstractC2053x3
    protected final Object b() {
        return new F0(1);
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
