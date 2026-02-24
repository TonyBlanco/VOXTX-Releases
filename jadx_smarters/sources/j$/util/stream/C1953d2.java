package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1953d2 extends AbstractC1998m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42608b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f42609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f42610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC1940b f42611e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1953d2(X x9, InterfaceC2018q2 interfaceC2018q2) {
        super(interfaceC2018q2);
        this.f42611e = x9;
        InterfaceC2018q2 interfaceC2018q22 = this.f42708a;
        Objects.requireNonNull(interfaceC2018q22);
        this.f42610d = new V(interfaceC2018q22);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1953d2(C1971h0 c1971h0, InterfaceC2018q2 interfaceC2018q2) {
        super(interfaceC2018q2);
        this.f42611e = c1971h0;
        InterfaceC2018q2 interfaceC2018q22 = this.f42708a;
        Objects.requireNonNull(interfaceC2018q22);
        this.f42610d = new C1951d0(interfaceC2018q22);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1953d2(C2059z c2059z, InterfaceC2018q2 interfaceC2018q2) {
        super(interfaceC2018q2);
        this.f42611e = c2059z;
        InterfaceC2018q2 interfaceC2018q22 = this.f42708a;
        Objects.requireNonNull(interfaceC2018q22);
        this.f42610d = new C2010p(interfaceC2018q22);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void q(Object obj) throws Exception {
        switch (this.f42608b) {
            case 0:
                InterfaceC2001n0 interfaceC2001n0 = (InterfaceC2001n0) ((Function) ((C1971h0) this.f42611e).f42675n).apply(obj);
                if (interfaceC2001n0 != null) {
                    try {
                        boolean z9 = this.f42609c;
                        C1951d0 c1951d0 = (C1951d0) this.f42610d;
                        if (z9) {
                            j$.util.K kSpliterator = interfaceC2001n0.sequential().spliterator();
                            while (!this.f42708a.o() && kSpliterator.tryAdvance((LongConsumer) c1951d0)) {
                            }
                        } else {
                            interfaceC2001n0.sequential().forEach(c1951d0);
                        }
                    } catch (Throwable th) {
                        try {
                            interfaceC2001n0.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (interfaceC2001n0 != null) {
                    interfaceC2001n0.close();
                    return;
                }
                return;
            case 1:
                IntStream intStream = (IntStream) ((Function) ((X) this.f42611e).f42561n).apply(obj);
                if (intStream != null) {
                    try {
                        boolean z10 = this.f42609c;
                        V v9 = (V) this.f42610d;
                        if (z10) {
                            j$.util.H hSpliterator = intStream.sequential().spliterator();
                            while (!this.f42708a.o() && hSpliterator.tryAdvance((IntConsumer) v9)) {
                            }
                        } else {
                            intStream.sequential().forEach(v9);
                        }
                    } catch (Throwable th3) {
                        try {
                            intStream.close();
                            break;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                    break;
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                F f9 = (F) ((Function) ((C2059z) this.f42611e).f42800n).apply(obj);
                if (f9 != null) {
                    try {
                        boolean z11 = this.f42609c;
                        C2010p c2010p = (C2010p) this.f42610d;
                        if (z11) {
                            j$.util.E eSpliterator = f9.sequential().spliterator();
                            while (!this.f42708a.o() && eSpliterator.tryAdvance((DoubleConsumer) c2010p)) {
                            }
                        } else {
                            f9.sequential().forEach(c2010p);
                        }
                    } catch (Throwable th5) {
                        try {
                            f9.close();
                            break;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                    break;
                }
                if (f9 != null) {
                    f9.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC1998m2, j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        switch (this.f42608b) {
            case 0:
                this.f42708a.m(-1L);
                break;
            case 1:
                this.f42708a.m(-1L);
                break;
            default:
                this.f42708a.m(-1L);
                break;
        }
    }

    @Override // j$.util.stream.AbstractC1998m2, j$.util.stream.InterfaceC2018q2
    public final boolean o() {
        switch (this.f42608b) {
            case 0:
                this.f42609c = true;
                break;
            case 1:
                this.f42609c = true;
                break;
            default:
                this.f42609c = true;
                break;
        }
        return this.f42708a.o();
    }
}
