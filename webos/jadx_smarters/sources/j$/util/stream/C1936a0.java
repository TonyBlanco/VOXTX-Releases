package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1936a0 extends AbstractC1946c0 {
    @Override // j$.util.stream.AbstractC1940b
    final boolean Q() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC1940b
    final InterfaceC2018q2 R(int i9, InterfaceC2018q2 interfaceC2018q2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC1946c0, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        if (isParallel()) {
            super.forEach(intConsumer);
        } else {
            AbstractC1946c0.Z(T()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC1946c0, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        if (isParallel()) {
            super.forEachOrdered(intConsumer);
        } else {
            AbstractC1946c0.Z(T()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC1940b, j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC1940b, j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC1940b, j$.util.stream.InterfaceC1970h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.InterfaceC1970h
    public final InterfaceC1970h unordered() {
        return !L() ? this : new C2044w(this, EnumC1959e3.f42634r, 2);
    }
}
