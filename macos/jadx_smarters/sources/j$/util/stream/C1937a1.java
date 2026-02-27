package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1937a1 extends AbstractC1957e1 implements E0 {
    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void j(Double[] dArr, int i9) {
        AbstractC2055y0.n(this, dArr, i9);
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
        return AbstractC2055y0.f42796g;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC2055y0.q(this, consumer);
    }

    @Override // j$.util.stream.AbstractC1957e1, j$.util.stream.K0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ E0 i(long j9, long j10, IntFunction intFunction) {
        return AbstractC2055y0.t(this, j9, j10);
    }

    @Override // j$.util.stream.K0
    public final j$.util.N spliterator() {
        return Spliterators.b();
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return Spliterators.b();
    }
}
