package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1934s implements InterfaceC2065u, InterfaceC1925i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfInt f42386a;

    private /* synthetic */ C1934s(PrimitiveIterator.OfInt ofInt) {
        this.f42386a = ofInt;
    }

    public static /* synthetic */ InterfaceC2065u a(PrimitiveIterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C2064t ? ((C2064t) ofInt).f42811a : new C1934s(ofInt);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfInt ofInt = this.f42386a;
        if (obj instanceof C1934s) {
            obj = ((C1934s) obj).f42386a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.InterfaceC2070z
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f42386a.forEachRemaining(obj);
    }

    @Override // j$.util.InterfaceC2065u, java.util.Iterator, j$.util.InterfaceC1925i
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f42386a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.InterfaceC2065u
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f42386a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f42386a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f42386a.hashCode();
    }

    @Override // j$.util.InterfaceC2065u, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f42386a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f42386a.next();
    }

    @Override // j$.util.InterfaceC2065u
    public final /* synthetic */ int nextInt() {
        return this.f42386a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f42386a.remove();
    }
}
