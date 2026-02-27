package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2068x implements PrimitiveIterator.OfLong {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2069y f42814a;

    private /* synthetic */ C2068x(InterfaceC2069y interfaceC2069y) {
        this.f42814a = interfaceC2069y;
    }

    public static /* synthetic */ PrimitiveIterator.OfLong a(InterfaceC2069y interfaceC2069y) {
        if (interfaceC2069y == null) {
            return null;
        }
        return interfaceC2069y instanceof C2067w ? ((C2067w) interfaceC2069y).f42813a : new C2068x(interfaceC2069y);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC2069y interfaceC2069y = this.f42814a;
        if (obj instanceof C2068x) {
            obj = ((C2068x) obj).f42814a;
        }
        return interfaceC2069y.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f42814a.forEachRemaining((Object) longConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f42814a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        this.f42814a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f42814a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f42814a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f42814a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f42814a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong
    public final /* synthetic */ long nextLong() {
        return this.f42814a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f42814a.remove();
    }
}
