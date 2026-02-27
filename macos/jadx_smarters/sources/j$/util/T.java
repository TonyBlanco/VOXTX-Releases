package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class T implements InterfaceC1933q, DoubleConsumer, InterfaceC1925i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f42243a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    double f42244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ E f42245c;

    T(E e9) {
        this.f42245c = e9;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d9) {
        this.f42243a = true;
        this.f42244b = d9;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.InterfaceC1933q, java.util.Iterator, j$.util.InterfaceC1925i
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            forEachRemaining((DoubleConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (e0.f42351a) {
            e0.a(T.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((DoubleConsumer) new C1930n(consumer));
    }

    @Override // j$.util.InterfaceC2070z
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f42243a) {
            this.f42245c.tryAdvance((DoubleConsumer) this);
        }
        return this.f42243a;
    }

    @Override // java.util.Iterator
    public final Double next() {
        if (!e0.f42351a) {
            return Double.valueOf(nextDouble());
        }
        e0.a(T.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
        throw null;
    }

    @Override // j$.util.InterfaceC1933q
    public final double nextDouble() {
        if (!this.f42243a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f42243a = false;
        return this.f42244b;
    }
}
