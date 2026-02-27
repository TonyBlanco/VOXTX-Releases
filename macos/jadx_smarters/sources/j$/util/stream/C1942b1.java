package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1942b1 extends AbstractC1957e1 implements G0 {
    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void j(Integer[] numArr, int i9) {
        AbstractC2055y0.o(this, numArr, i9);
    }

    @Override // j$.util.stream.AbstractC1957e1, j$.util.stream.K0
    public final J0 b(int i9) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.AbstractC1957e1, j$.util.stream.K0
    public final /* bridge */ /* synthetic */ K0 b(int i9) {
        b(i9);
        throw null;
    }

    @Override // j$.util.stream.J0
    public final Object e() {
        return AbstractC2055y0.f42794e;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC2055y0.r(this, consumer);
    }

    @Override // j$.util.stream.AbstractC1957e1, j$.util.stream.K0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ G0 i(long j9, long j10, IntFunction intFunction) {
        return AbstractC2055y0.u(this, j9, j10);
    }

    @Override // j$.util.stream.K0
    public final j$.util.N spliterator() {
        return Spliterators.c();
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return Spliterators.c();
    }
}
