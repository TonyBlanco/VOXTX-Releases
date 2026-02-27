package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
final class U extends CountedCompleter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Spliterator f42548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2018q2 f42549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC1940b f42550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f42551d;

    U(U u9, Spliterator spliterator) {
        super(u9);
        this.f42548a = spliterator;
        this.f42549b = u9.f42549b;
        this.f42551d = u9.f42551d;
        this.f42550c = u9.f42550c;
    }

    U(AbstractC1940b abstractC1940b, Spliterator spliterator, InterfaceC2018q2 interfaceC2018q2) {
        super(null);
        this.f42549b = interfaceC2018q2;
        this.f42550c = abstractC1940b;
        this.f42548a = spliterator;
        this.f42551d = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f42548a;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.f42551d;
        if (jG == 0) {
            jG = AbstractC1955e.g(jEstimateSize);
            this.f42551d = jG;
        }
        boolean zQ = EnumC1959e3.SHORT_CIRCUIT.q(this.f42550c.K());
        InterfaceC2018q2 interfaceC2018q2 = this.f42549b;
        boolean z9 = false;
        U u9 = this;
        while (true) {
            if (zQ && interfaceC2018q2.o()) {
                break;
            }
            if (jEstimateSize <= jG || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            U u10 = new U(u9, spliteratorTrySplit);
            u9.addToPendingCount(1);
            if (z9) {
                spliterator = spliteratorTrySplit;
            } else {
                U u11 = u9;
                u9 = u10;
                u10 = u11;
            }
            z9 = !z9;
            u9.fork();
            u9 = u10;
            jEstimateSize = spliterator.estimateSize();
        }
        u9.f42550c.A(spliterator, interfaceC2018q2);
        u9.f42548a = null;
        u9.propagateCompletion();
    }
}
