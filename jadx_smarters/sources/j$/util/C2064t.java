package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2064t implements PrimitiveIterator.OfInt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2065u f42811a;

    private /* synthetic */ C2064t(InterfaceC2065u interfaceC2065u) {
        this.f42811a = interfaceC2065u;
    }

    public static /* synthetic */ PrimitiveIterator.OfInt a(InterfaceC2065u interfaceC2065u) {
        if (interfaceC2065u == null) {
            return null;
        }
        return interfaceC2065u instanceof C1934s ? ((C1934s) interfaceC2065u).f42386a : new C2064t(interfaceC2065u);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC2065u interfaceC2065u = this.f42811a;
        if (obj instanceof C2064t) {
            obj = ((C2064t) obj).f42811a;
        }
        return interfaceC2065u.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f42811a.forEachRemaining((Object) intConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f42811a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        this.f42811a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f42811a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f42811a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f42811a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f42811a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt
    public final /* synthetic */ int nextInt() {
        return this.f42811a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f42811a.remove();
    }
}
