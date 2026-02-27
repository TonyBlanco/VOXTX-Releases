package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class F implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Spliterator.OfInt f42214a;

    private /* synthetic */ F(Spliterator.OfInt ofInt) {
        this.f42214a = ofInt;
    }

    public static /* synthetic */ H a(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof G ? ((G) ofInt).f42215a : new F(ofInt);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f42214a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfInt ofInt = this.f42214a;
        if (obj instanceof F) {
            obj = ((F) obj).f42214a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f42214a.estimateSize();
    }

    @Override // j$.util.N
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f42214a.forEachRemaining(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f42214a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.H
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f42214a.forEachRemaining(intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f42214a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f42214a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i9) {
        return this.f42214a.hasCharacteristics(i9);
    }

    public final /* synthetic */ int hashCode() {
        return this.f42214a.hashCode();
    }

    @Override // j$.util.N
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f42214a.tryAdvance(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f42214a.tryAdvance((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.H
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f42214a.tryAdvance(intConsumer);
    }

    @Override // j$.util.H, j$.util.N, j$.util.Spliterator
    public final /* synthetic */ H trySplit() {
        return a(this.f42214a.trySplit());
    }

    @Override // j$.util.N, j$.util.Spliterator
    public final /* synthetic */ N trySplit() {
        return L.a(this.f42214a.trySplit());
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return O.a(this.f42214a.trySplit());
    }
}
