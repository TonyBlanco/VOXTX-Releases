package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* JADX INFO: loaded from: classes2.dex */
final class W extends AbstractC1988k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC1940b f42558c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(AbstractC1940b abstractC1940b, InterfaceC2018q2 interfaceC2018q2, int i9) {
        super(interfaceC2018q2);
        this.f42557b = i9;
        this.f42558c = abstractC1940b;
    }

    @Override // j$.util.stream.InterfaceC2008o2, j$.util.stream.InterfaceC2018q2
    public final void accept(int i9) {
        switch (this.f42557b) {
            case 0:
                this.f42690a.accept(((IntFunction) ((C2034u) this.f42558c).f42756n).apply(i9));
                return;
            case 1:
                ((IntConsumer) ((X) this.f42558c).f42561n).accept(i9);
                this.f42690a.accept(i9);
                return;
            case 2:
                ((C2044w) this.f42558c).getClass();
                IntUnaryOperator intUnaryOperator = null;
                intUnaryOperator.applyAsInt(i9);
                throw null;
            case 3:
                ((C2049x) this.f42558c).getClass();
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i9);
                throw null;
            case 4:
                ((C2039v) this.f42558c).getClass();
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i9);
                throw null;
            default:
                ((C2044w) this.f42558c).getClass();
                IntPredicate intPredicate = null;
                intPredicate.test(i9);
                throw null;
        }
    }

    @Override // j$.util.stream.AbstractC1988k2, j$.util.stream.InterfaceC2018q2
    public void m(long j9) {
        switch (this.f42557b) {
            case 5:
                this.f42690a.m(-1L);
                break;
            default:
                super.m(j9);
                break;
        }
    }
}
