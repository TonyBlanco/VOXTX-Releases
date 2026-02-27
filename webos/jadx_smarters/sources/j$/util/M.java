package j$.util;

import j$.util.Spliterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class M implements Spliterator.OfPrimitive {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f42219a;

    private /* synthetic */ M(N n9) {
        this.f42219a = n9;
    }

    public static /* synthetic */ Spliterator.OfPrimitive a(N n9) {
        if (n9 == null) {
            return null;
        }
        return n9 instanceof L ? ((L) n9).f42218a : n9 instanceof E ? D.a((E) n9) : n9 instanceof H ? G.a((H) n9) : n9 instanceof K ? J.a((K) n9) : new M(n9);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f42219a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        N n9 = this.f42219a;
        if (obj instanceof M) {
            obj = ((M) obj).f42219a;
        }
        return n9.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f42219a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f42219a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f42219a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f42219a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f42219a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i9) {
        return this.f42219a.hasCharacteristics(i9);
    }

    public final /* synthetic */ int hashCode() {
        return this.f42219a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f42219a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f42219a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return a(this.f42219a.trySplit());
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f42219a.trySplit());
    }
}
