package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class A3 extends D3 implements j$.util.E, DoubleConsumer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    double f42395f;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d9) {
        this.f42395f = d9;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.G3
    protected final Spliterator c(Spliterator spliterator) {
        return new A3((j$.util.E) spliterator, this);
    }

    @Override // j$.util.stream.D3
    protected final void e(Object obj) {
        ((DoubleConsumer) obj).accept(this.f42395f);
    }

    @Override // j$.util.stream.D3
    protected final AbstractC1989k3 f(int i9) {
        return new C1974h3(i9);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.A.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.A.g(this, consumer);
    }
}
