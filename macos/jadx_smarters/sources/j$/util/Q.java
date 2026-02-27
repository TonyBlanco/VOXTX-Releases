package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class Q implements InterfaceC2065u, IntConsumer, InterfaceC1925i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f42226a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f42227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ H f42228c;

    Q(H h9) {
        this.f42228c = h9;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i9) {
        this.f42226a = true;
        this.f42227b = i9;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    @Override // j$.util.InterfaceC2065u, java.util.Iterator, j$.util.InterfaceC1925i
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            forEachRemaining((IntConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (e0.f42351a) {
            e0.a(Q.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((IntConsumer) new r(consumer));
    }

    @Override // j$.util.InterfaceC2070z
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        while (hasNext()) {
            intConsumer.accept(nextInt());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f42226a) {
            this.f42228c.tryAdvance((IntConsumer) this);
        }
        return this.f42226a;
    }

    @Override // java.util.Iterator
    public final Integer next() {
        if (!e0.f42351a) {
            return Integer.valueOf(nextInt());
        }
        e0.a(Q.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
        throw null;
    }

    @Override // j$.util.InterfaceC2065u
    public final int nextInt() {
        if (!this.f42226a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f42226a = false;
        return this.f42227b;
    }
}
