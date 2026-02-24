package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1947c1 extends AbstractC1957e1 implements I0 {
    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void j(Long[] lArr, int i9) {
        AbstractC2055y0.p(this, lArr, i9);
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
        return AbstractC2055y0.f42795f;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC2055y0.s(this, consumer);
    }

    @Override // j$.util.stream.AbstractC1957e1, j$.util.stream.K0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ I0 i(long j9, long j10, IntFunction intFunction) {
        return AbstractC2055y0.v(this, j9, j10);
    }

    @Override // j$.util.stream.K0
    public final j$.util.N spliterator() {
        return Spliterators.d();
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return Spliterators.d();
    }
}
