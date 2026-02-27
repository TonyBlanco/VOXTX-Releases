package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1976i0 extends AbstractC1986k0 {
    @Override // j$.util.stream.AbstractC1940b
    final boolean Q() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC1940b
    final InterfaceC2018q2 R(int i9, InterfaceC2018q2 interfaceC2018q2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC1986k0, j$.util.stream.InterfaceC2001n0
    public final void forEach(LongConsumer longConsumer) {
        if (isParallel()) {
            super.forEach(longConsumer);
        } else {
            AbstractC1986k0.Z(T()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC1986k0, j$.util.stream.InterfaceC2001n0
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (isParallel()) {
            super.forEachOrdered(longConsumer);
        } else {
            AbstractC1986k0.Z(T()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC1940b, j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ InterfaceC2001n0 parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC1940b, j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ InterfaceC2001n0 sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC1940b, j$.util.stream.InterfaceC1970h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.InterfaceC1970h
    public final InterfaceC1970h unordered() {
        return !L() ? this : new C2049x(this, EnumC1959e3.f42634r, 4);
    }
}
