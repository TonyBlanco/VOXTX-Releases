package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class B3 extends D3 implements j$.util.H, IntConsumer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f42401f;

    @Override // java.util.function.IntConsumer
    public final void accept(int i9) {
        this.f42401f = i9;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    @Override // j$.util.stream.G3
    protected final Spliterator c(Spliterator spliterator) {
        return new B3((j$.util.H) spliterator, this);
    }

    @Override // j$.util.stream.D3
    protected final void e(Object obj) {
        ((IntConsumer) obj).accept(this.f42401f);
    }

    @Override // j$.util.stream.D3
    protected final AbstractC1989k3 f(int i9) {
        return new C1979i3(i9);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.A.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.A.h(this, consumer);
    }
}
