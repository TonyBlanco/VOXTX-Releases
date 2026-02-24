package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Spliterator.OfDouble f42207a;

    private /* synthetic */ C(Spliterator.OfDouble ofDouble) {
        this.f42207a = ofDouble;
    }

    public static /* synthetic */ E a(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof D ? ((D) ofDouble).f42208a : new C(ofDouble);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f42207a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfDouble ofDouble = this.f42207a;
        if (obj instanceof C) {
            obj = ((C) obj).f42207a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f42207a.estimateSize();
    }

    @Override // j$.util.N
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f42207a.forEachRemaining(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f42207a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.E
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f42207a.forEachRemaining(doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f42207a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f42207a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i9) {
        return this.f42207a.hasCharacteristics(i9);
    }

    public final /* synthetic */ int hashCode() {
        return this.f42207a.hashCode();
    }

    @Override // j$.util.N
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f42207a.tryAdvance(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f42207a.tryAdvance((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.E
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f42207a.tryAdvance(doubleConsumer);
    }

    @Override // j$.util.E, j$.util.N, j$.util.Spliterator
    public final /* synthetic */ E trySplit() {
        return a(this.f42207a.trySplit());
    }

    @Override // j$.util.N, j$.util.Spliterator
    public final /* synthetic */ N trySplit() {
        return L.a(this.f42207a.trySplit());
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return O.a(this.f42207a.trySplit());
    }
}
