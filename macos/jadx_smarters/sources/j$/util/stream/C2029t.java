package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: renamed from: j$.util.stream.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2029t extends AbstractC1983j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC1940b f42750c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2029t(AbstractC1940b abstractC1940b, InterfaceC2018q2 interfaceC2018q2, int i9) {
        super(interfaceC2018q2);
        this.f42749b = i9;
        this.f42750c = abstractC1940b;
    }

    @Override // j$.util.stream.InterfaceC2003n2, j$.util.stream.InterfaceC2018q2
    public final void accept(double d9) {
        switch (this.f42749b) {
            case 0:
                this.f42686a.accept(((DoubleFunction) ((C2034u) this.f42750c).f42756n).apply(d9));
                return;
            case 1:
                ((C2039v) this.f42750c).getClass();
                DoubleUnaryOperator doubleUnaryOperator = null;
                doubleUnaryOperator.applyAsDouble(d9);
                throw null;
            case 2:
                ((C2044w) this.f42750c).getClass();
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d9);
                throw null;
            case 3:
                ((C2049x) this.f42750c).getClass();
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d9);
                throw null;
            case 4:
                ((C2039v) this.f42750c).getClass();
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d9);
                throw null;
            default:
                ((DoubleConsumer) ((C2059z) this.f42750c).f42800n).accept(d9);
                this.f42686a.accept(d9);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC1983j2, j$.util.stream.InterfaceC2018q2
    public void m(long j9) {
        switch (this.f42749b) {
            case 4:
                this.f42686a.m(-1L);
                break;
            default:
                super.m(j9);
                break;
        }
    }
}
