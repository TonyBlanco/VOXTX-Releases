package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class P extends S implements InterfaceC2013p2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final LongConsumer f42499b;

    P(LongConsumer longConsumer, boolean z9) {
        super(z9);
        this.f42499b = longConsumer;
    }

    @Override // j$.util.stream.S, j$.util.stream.InterfaceC2018q2, j$.util.stream.InterfaceC2013p2, java.util.function.LongConsumer
    public final void accept(long j9) {
        this.f42499b.accept(j9);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        k((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
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

    @Override // j$.util.stream.InterfaceC2013p2
    public final /* synthetic */ void k(Long l9) {
        AbstractC2055y0.i(this, l9);
    }
}
