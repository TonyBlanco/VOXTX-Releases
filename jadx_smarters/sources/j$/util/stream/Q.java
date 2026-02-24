package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class Q extends S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Consumer f42509b;

    Q(Consumer consumer, boolean z9) {
        super(z9);
        this.f42509b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f42509b.accept(obj);
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
}
