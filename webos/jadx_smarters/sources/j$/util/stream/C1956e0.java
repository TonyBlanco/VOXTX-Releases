package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* JADX INFO: renamed from: j$.util.stream.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1956e0 extends AbstractC1993l2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC1940b f42621c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1956e0(AbstractC1940b abstractC1940b, InterfaceC2018q2 interfaceC2018q2, int i9) {
        super(interfaceC2018q2);
        this.f42620b = i9;
        this.f42621c = abstractC1940b;
    }

    @Override // j$.util.stream.InterfaceC2013p2, java.util.function.LongConsumer
    public final void accept(long j9) {
        switch (this.f42620b) {
            case 0:
                this.f42697a.accept(((LongFunction) ((C2034u) this.f42621c).f42756n).apply(j9));
                return;
            case 1:
                ((C2049x) this.f42621c).getClass();
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j9);
                throw null;
            case 2:
                ((C2044w) this.f42621c).getClass();
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j9);
                throw null;
            case 3:
                ((C2039v) this.f42621c).getClass();
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j9);
                throw null;
            case 4:
                ((C2049x) this.f42621c).getClass();
                LongPredicate longPredicate = null;
                longPredicate.test(j9);
                throw null;
            default:
                ((LongConsumer) ((C1971h0) this.f42621c).f42675n).accept(j9);
                this.f42697a.accept(j9);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC1993l2, j$.util.stream.InterfaceC2018q2
    public void m(long j9) {
        switch (this.f42620b) {
            case 4:
                this.f42697a.m(-1L);
                break;
            default:
                super.m(j9);
                break;
        }
    }
}
