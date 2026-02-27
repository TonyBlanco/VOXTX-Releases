package j$.util.stream;

import java.util.function.LongPredicate;

/* JADX INFO: loaded from: classes2.dex */
final class X3 extends AbstractC1993l2 implements e4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y3 f42564b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    X3(Y3 y32, InterfaceC2018q2 interfaceC2018q2, boolean z9) {
        super(interfaceC2018q2);
        this.f42564b = y32;
    }

    @Override // j$.util.stream.InterfaceC2013p2, java.util.function.LongConsumer
    public final void accept(long j9) {
        this.f42564b.getClass();
        LongPredicate longPredicate = null;
        longPredicate.test(j9);
        throw null;
    }

    @Override // j$.util.stream.e4
    public final long g() {
        return 0L;
    }
}
