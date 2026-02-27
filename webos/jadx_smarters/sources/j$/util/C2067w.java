package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2067w implements InterfaceC2069y, InterfaceC1925i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfLong f42813a;

    private /* synthetic */ C2067w(PrimitiveIterator.OfLong ofLong) {
        this.f42813a = ofLong;
    }

    public static /* synthetic */ InterfaceC2069y a(PrimitiveIterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof C2068x ? ((C2068x) ofLong).f42814a : new C2067w(ofLong);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfLong ofLong = this.f42813a;
        if (obj instanceof C2067w) {
            obj = ((C2067w) obj).f42813a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.InterfaceC2070z
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f42813a.forEachRemaining(obj);
    }

    @Override // j$.util.InterfaceC2069y, java.util.Iterator, j$.util.InterfaceC1925i
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f42813a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.InterfaceC2069y
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f42813a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f42813a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f42813a.hashCode();
    }

    @Override // j$.util.InterfaceC2069y, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f42813a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f42813a.next();
    }

    @Override // j$.util.InterfaceC2069y
    public final /* synthetic */ long nextLong() {
        return this.f42813a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f42813a.remove();
    }
}
