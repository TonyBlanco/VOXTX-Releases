package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class Z extends AbstractC1988k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f42572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    V f42573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ X f42574d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z(X x9, InterfaceC2018q2 interfaceC2018q2) {
        super(interfaceC2018q2);
        this.f42574d = x9;
        InterfaceC2018q2 interfaceC2018q22 = this.f42690a;
        Objects.requireNonNull(interfaceC2018q22);
        this.f42573c = new V(interfaceC2018q22);
    }

    @Override // j$.util.stream.InterfaceC2008o2, j$.util.stream.InterfaceC2018q2
    public final void accept(int i9) throws Exception {
        IntStream intStream = (IntStream) ((IntFunction) this.f42574d.f42561n).apply(i9);
        if (intStream != null) {
            try {
                boolean z9 = this.f42572b;
                V v9 = this.f42573c;
                if (z9) {
                    j$.util.H hSpliterator = intStream.sequential().spliterator();
                    while (!this.f42690a.o() && hSpliterator.tryAdvance((IntConsumer) v9)) {
                    }
                } else {
                    intStream.sequential().forEach(v9);
                }
            } catch (Throwable th) {
                try {
                    intStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.AbstractC1988k2, j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        this.f42690a.m(-1L);
    }

    @Override // j$.util.stream.AbstractC1988k2, j$.util.stream.InterfaceC2018q2
    public final boolean o() {
        this.f42572b = true;
        return this.f42690a.o();
    }
}
