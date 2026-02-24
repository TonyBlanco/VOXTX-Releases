package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1968g2 extends AbstractC1978i2 {
    @Override // j$.util.stream.AbstractC1940b
    final boolean Q() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC1940b
    final InterfaceC2018q2 R(int i9, InterfaceC2018q2 interfaceC2018q2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC1978i2, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (isParallel()) {
            super.forEach(consumer);
        } else {
            T().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC1978i2, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (isParallel()) {
            super.forEachOrdered(consumer);
        } else {
            T().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.InterfaceC1970h
    public final InterfaceC1970h unordered() {
        return !L() ? this : new C1958e2(this, EnumC1959e3.f42634r, 1);
    }
}
