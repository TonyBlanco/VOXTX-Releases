package j$.util.stream;

import java.util.function.LongPredicate;

/* JADX INFO: loaded from: classes2.dex */
final class V3 extends AbstractC1993l2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f42555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ W3 f42556c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    V3(W3 w32, InterfaceC2018q2 interfaceC2018q2) {
        super(interfaceC2018q2);
        this.f42556c = w32;
        this.f42555b = true;
    }

    @Override // j$.util.stream.InterfaceC2013p2, java.util.function.LongConsumer
    public final void accept(long j9) {
        if (this.f42555b) {
            this.f42556c.getClass();
            LongPredicate longPredicate = null;
            longPredicate.test(j9);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC1993l2, j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        this.f42697a.m(-1L);
    }

    @Override // j$.util.stream.AbstractC1993l2, j$.util.stream.InterfaceC2018q2
    public final boolean o() {
        return !this.f42555b || this.f42697a.o();
    }
}
