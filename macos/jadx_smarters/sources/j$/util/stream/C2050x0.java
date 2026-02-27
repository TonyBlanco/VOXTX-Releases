package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: j$.util.stream.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2050x0 extends AbstractC1945c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C2045w0 f42783j;

    C2050x0(C2045w0 c2045w0, AbstractC1940b abstractC1940b, Spliterator spliterator) {
        super(abstractC1940b, spliterator);
        this.f42783j = c2045w0;
    }

    C2050x0(C2050x0 c2050x0, Spliterator spliterator) {
        super(c2050x0, spliterator);
        this.f42783j = c2050x0.f42783j;
    }

    @Override // j$.util.stream.AbstractC1955e
    protected final Object a() {
        AbstractC1940b abstractC1940b = this.f42614a;
        AbstractC2035u0 abstractC2035u0 = (AbstractC2035u0) this.f42783j.f42772b.get();
        abstractC1940b.V(this.f42615b, abstractC2035u0);
        boolean z9 = abstractC2035u0.f42758b;
        if (z9 == this.f42783j.f42771a.f42765b) {
            Boolean boolValueOf = Boolean.valueOf(z9);
            AtomicReference atomicReference = this.f42599h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC1955e
    protected final AbstractC1955e e(Spliterator spliterator) {
        return new C2050x0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC1945c
    protected final Object j() {
        return Boolean.valueOf(!this.f42783j.f42771a.f42765b);
    }
}
