package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2045w0 implements K3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final EnumC2040v0 f42771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Supplier f42772b;

    C2045w0(EnumC1964f3 enumC1964f3, EnumC2040v0 enumC2040v0, Supplier supplier) {
        this.f42771a = enumC2040v0;
        this.f42772b = supplier;
    }

    @Override // j$.util.stream.K3
    public final Object b(AbstractC1940b abstractC1940b, Spliterator spliterator) {
        AbstractC2035u0 abstractC2035u0 = (AbstractC2035u0) this.f42772b.get();
        abstractC1940b.V(spliterator, abstractC2035u0);
        return Boolean.valueOf(abstractC2035u0.f42758b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.K3
    public final Object c(AbstractC1940b abstractC1940b, Spliterator spliterator) {
        return (Boolean) new C2050x0(this, abstractC1940b, spliterator).invoke();
    }

    @Override // j$.util.stream.K3
    public final int d() {
        return EnumC1959e3.f42637u | EnumC1959e3.f42634r;
    }
}
