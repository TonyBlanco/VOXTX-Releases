package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1932p implements PrimitiveIterator.OfDouble {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1933q f42384a;

    private /* synthetic */ C1932p(InterfaceC1933q interfaceC1933q) {
        this.f42384a = interfaceC1933q;
    }

    public static /* synthetic */ PrimitiveIterator.OfDouble a(InterfaceC1933q interfaceC1933q) {
        if (interfaceC1933q == null) {
            return null;
        }
        return interfaceC1933q instanceof C1931o ? ((C1931o) interfaceC1933q).f42383a : new C1932p(interfaceC1933q);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1933q interfaceC1933q = this.f42384a;
        if (obj instanceof C1932p) {
            obj = ((C1932p) obj).f42384a;
        }
        return interfaceC1933q.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f42384a.forEachRemaining((Object) doubleConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f42384a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.f42384a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f42384a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f42384a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f42384a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f42384a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    public final /* synthetic */ double nextDouble() {
        return this.f42384a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f42384a.remove();
    }
}
