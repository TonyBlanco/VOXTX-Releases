package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* JADX INFO: renamed from: j$.util.stream.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2030t0 extends AbstractC2035u0 implements InterfaceC2003n2 {
    @Override // j$.util.stream.AbstractC2035u0, j$.util.stream.InterfaceC2018q2
    public final void accept(double d9) {
        if (this.f42757a) {
            return;
        }
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d9);
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        q((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC2003n2
    public final /* synthetic */ void q(Double d9) {
        AbstractC2055y0.e(this, d9);
    }
}
