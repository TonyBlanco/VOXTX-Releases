package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
abstract class l4 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Spliterator f42699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f42700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicBoolean f42701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f42702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f42703e;

    l4(Spliterator spliterator) {
        this.f42702d = true;
        this.f42699a = spliterator;
        this.f42700b = false;
        this.f42701c = new AtomicBoolean();
    }

    l4(Spliterator spliterator, l4 l4Var) {
        this.f42702d = true;
        this.f42699a = spliterator;
        this.f42700b = l4Var.f42700b;
        this.f42701c = l4Var.f42701c;
    }

    final boolean b() {
        return (this.f42703e == 0 && this.f42701c.get()) ? false : true;
    }

    abstract Spliterator c(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f42699a.characteristics() & (-16449);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f42699a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public void forEachRemaining(Consumer consumer) {
        while (tryAdvance(consumer)) {
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f42699a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i9) {
        return j$.util.A.e(this, i9);
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.E trySplit() {
        return (j$.util.E) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.H trySplit() {
        return (j$.util.H) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.K trySplit() {
        return (j$.util.K) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.N trySplit() {
        return (j$.util.N) trySplit();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f42700b ? null : this.f42699a.trySplit();
        if (spliteratorTrySplit != null) {
            return c(spliteratorTrySplit);
        }
        return null;
    }
}
