package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class I implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Spliterator.OfLong f42216a;

    private /* synthetic */ I(Spliterator.OfLong ofLong) {
        this.f42216a = ofLong;
    }

    public static /* synthetic */ K a(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof J ? ((J) ofLong).f42217a : new I(ofLong);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f42216a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfLong ofLong = this.f42216a;
        if (obj instanceof I) {
            obj = ((I) obj).f42216a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f42216a.estimateSize();
    }

    @Override // j$.util.N
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f42216a.forEachRemaining(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f42216a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.K
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f42216a.forEachRemaining(longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f42216a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f42216a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i9) {
        return this.f42216a.hasCharacteristics(i9);
    }

    public final /* synthetic */ int hashCode() {
        return this.f42216a.hashCode();
    }

    @Override // j$.util.N
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f42216a.tryAdvance(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f42216a.tryAdvance((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.K
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f42216a.tryAdvance(longConsumer);
    }

    @Override // j$.util.K, j$.util.N, j$.util.Spliterator
    public final /* synthetic */ K trySplit() {
        return a(this.f42216a.trySplit());
    }

    @Override // j$.util.N, j$.util.Spliterator
    public final /* synthetic */ N trySplit() {
        return L.a(this.f42216a.trySplit());
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return O.a(this.f42216a.trySplit());
    }
}
