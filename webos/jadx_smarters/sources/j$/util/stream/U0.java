package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class U0 extends V0 implements I0 {
    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void j(Long[] lArr, int i9) {
        AbstractC2055y0.p(this, lArr, i9);
    }

    @Override // j$.util.stream.J0
    public final Object c(int i9) {
        return new long[i9];
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC2055y0.s(this, consumer);
    }

    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ I0 i(long j9, long j10, IntFunction intFunction) {
        return AbstractC2055y0.v(this, j9, j10);
    }

    @Override // j$.util.stream.K0
    public final j$.util.N spliterator() {
        return new C1992l1(this);
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return new C1992l1(this);
    }
}
