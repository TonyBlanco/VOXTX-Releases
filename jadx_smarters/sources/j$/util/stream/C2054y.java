package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;

/* JADX INFO: renamed from: j$.util.stream.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2054y extends AbstractC1983j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f42787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    C2010p f42788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2059z f42789d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2054y(C2059z c2059z, InterfaceC2018q2 interfaceC2018q2) {
        super(interfaceC2018q2);
        this.f42789d = c2059z;
        InterfaceC2018q2 interfaceC2018q22 = this.f42686a;
        Objects.requireNonNull(interfaceC2018q22);
        this.f42788c = new C2010p(interfaceC2018q22);
    }

    @Override // j$.util.stream.InterfaceC2003n2, j$.util.stream.InterfaceC2018q2
    public final void accept(double d9) throws Exception {
        F f9 = (F) ((DoubleFunction) this.f42789d.f42800n).apply(d9);
        if (f9 != null) {
            try {
                boolean z9 = this.f42787b;
                C2010p c2010p = this.f42788c;
                if (z9) {
                    j$.util.E eSpliterator = f9.sequential().spliterator();
                    while (!this.f42686a.o() && eSpliterator.tryAdvance((DoubleConsumer) c2010p)) {
                    }
                } else {
                    f9.sequential().forEach(c2010p);
                }
            } catch (Throwable th) {
                try {
                    f9.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (f9 != null) {
            f9.close();
        }
    }

    @Override // j$.util.stream.AbstractC1983j2, j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        this.f42686a.m(-1L);
    }

    @Override // j$.util.stream.AbstractC1983j2, j$.util.stream.InterfaceC2018q2
    public final boolean o() {
        this.f42787b = true;
        return this.f42686a.o();
    }
}
