package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class N extends S implements InterfaceC2003n2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final DoubleConsumer f42482b;

    N(DoubleConsumer doubleConsumer, boolean z9) {
        super(z9);
        this.f42482b = doubleConsumer;
    }

    @Override // j$.util.stream.S, j$.util.stream.InterfaceC2018q2
    public final void accept(double d9) {
        this.f42482b.accept(d9);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        q((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.K3
    public final Object b(AbstractC1940b abstractC1940b, Spliterator spliterator) {
        abstractC1940b.V(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.K3
    public final /* bridge */ /* synthetic */ Object c(AbstractC1940b abstractC1940b, Spliterator spliterator) {
        e(abstractC1940b, spliterator);
        return null;
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC2003n2
    public final /* synthetic */ void q(Double d9) {
        AbstractC2055y0.e(this, d9);
    }
}
