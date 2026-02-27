package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;

/* JADX INFO: renamed from: j$.util.stream.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1966g0 extends AbstractC1993l2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f42654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    C1951d0 f42655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C1971h0 f42656d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1966g0(C1971h0 c1971h0, InterfaceC2018q2 interfaceC2018q2) {
        super(interfaceC2018q2);
        this.f42656d = c1971h0;
        InterfaceC2018q2 interfaceC2018q22 = this.f42697a;
        Objects.requireNonNull(interfaceC2018q22);
        this.f42655c = new C1951d0(interfaceC2018q22);
    }

    @Override // j$.util.stream.InterfaceC2013p2, java.util.function.LongConsumer
    public final void accept(long j9) throws Exception {
        InterfaceC2001n0 interfaceC2001n0 = (InterfaceC2001n0) ((LongFunction) this.f42656d.f42675n).apply(j9);
        if (interfaceC2001n0 != null) {
            try {
                boolean z9 = this.f42654b;
                C1951d0 c1951d0 = this.f42655c;
                if (z9) {
                    j$.util.K kSpliterator = interfaceC2001n0.sequential().spliterator();
                    while (!this.f42697a.o() && kSpliterator.tryAdvance((LongConsumer) c1951d0)) {
                    }
                } else {
                    interfaceC2001n0.sequential().forEach(c1951d0);
                }
            } catch (Throwable th) {
                try {
                    interfaceC2001n0.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC2001n0 != null) {
            interfaceC2001n0.close();
        }
    }

    @Override // j$.util.stream.AbstractC1993l2, j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        this.f42697a.m(-1L);
    }

    @Override // j$.util.stream.AbstractC1993l2, j$.util.stream.InterfaceC2018q2
    public final boolean o() {
        this.f42654b = true;
        return this.f42697a.o();
    }
}
