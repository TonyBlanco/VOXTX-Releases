package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class T0 extends V0 implements G0 {
    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void j(Integer[] numArr, int i9) {
        AbstractC2055y0.o(this, numArr, i9);
    }

    @Override // j$.util.stream.J0
    public final Object c(int i9) {
        return new int[i9];
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC2055y0.r(this, consumer);
    }

    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ G0 i(long j9, long j10, IntFunction intFunction) {
        return AbstractC2055y0.u(this, j9, j10);
    }

    @Override // j$.util.stream.K0
    public final j$.util.N spliterator() {
        return new C1987k1(this);
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return new C1987k1(this);
    }
}
