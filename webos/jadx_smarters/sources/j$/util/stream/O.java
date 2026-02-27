package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class O extends S implements InterfaceC2008o2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final IntConsumer f42491b;

    O(IntConsumer intConsumer, boolean z9) {
        super(z9);
        this.f42491b = intConsumer;
    }

    @Override // j$.util.stream.S, j$.util.stream.InterfaceC2018q2
    public final void accept(int i9) {
        this.f42491b.accept(i9);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        n((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
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

    @Override // j$.util.stream.InterfaceC2008o2
    public final /* synthetic */ void n(Integer num) {
        AbstractC2055y0.g(this, num);
    }
}
