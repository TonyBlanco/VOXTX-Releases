package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class C3 extends D3 implements j$.util.K, LongConsumer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f42405f;

    @Override // java.util.function.LongConsumer
    public final void accept(long j9) {
        this.f42405f = j9;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }

    @Override // j$.util.stream.G3
    protected final Spliterator c(Spliterator spliterator) {
        return new C3((j$.util.K) spliterator, this);
    }

    @Override // j$.util.stream.D3
    protected final void e(Object obj) {
        ((LongConsumer) obj).accept(this.f42405f);
    }

    @Override // j$.util.stream.D3
    protected final AbstractC1989k3 f(int i9) {
        return new C1984j3(i9);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.A.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.A.i(this, consumer);
    }
}
