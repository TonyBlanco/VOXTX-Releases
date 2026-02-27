package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1931o implements InterfaceC1933q, InterfaceC1925i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfDouble f42383a;

    private /* synthetic */ C1931o(PrimitiveIterator.OfDouble ofDouble) {
        this.f42383a = ofDouble;
    }

    public static /* synthetic */ InterfaceC1933q a(PrimitiveIterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof C1932p ? ((C1932p) ofDouble).f42384a : new C1931o(ofDouble);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfDouble ofDouble = this.f42383a;
        if (obj instanceof C1931o) {
            obj = ((C1931o) obj).f42383a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.InterfaceC2070z
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f42383a.forEachRemaining(obj);
    }

    @Override // j$.util.InterfaceC1933q, java.util.Iterator, j$.util.InterfaceC1925i
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f42383a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.InterfaceC1933q
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f42383a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f42383a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f42383a.hashCode();
    }

    @Override // j$.util.InterfaceC1933q, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f42383a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f42383a.next();
    }

    @Override // j$.util.InterfaceC1933q
    public final /* synthetic */ double nextDouble() {
        return this.f42383a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f42383a.remove();
    }
}
