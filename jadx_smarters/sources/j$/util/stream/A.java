package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class A extends C {
    @Override // j$.util.stream.AbstractC1940b
    final boolean Q() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC1940b
    final InterfaceC2018q2 R(int i9, InterfaceC2018q2 interfaceC2018q2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.C, j$.util.stream.F
    public final void forEach(DoubleConsumer doubleConsumer) {
        if (isParallel()) {
            super.forEach(doubleConsumer);
        } else {
            C.Z(T()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.C, j$.util.stream.F
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        if (isParallel()) {
            super.forEachOrdered(doubleConsumer);
        } else {
            C.Z(T()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC1940b, j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ F parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC1940b, j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ F sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC1940b, j$.util.stream.InterfaceC1970h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.InterfaceC1970h
    public final InterfaceC1970h unordered() {
        return !L() ? this : new C2039v(this, EnumC1959e3.f42634r, 1);
    }
}
