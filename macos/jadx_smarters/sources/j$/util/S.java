package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class S implements InterfaceC2069y, LongConsumer, InterfaceC1925i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f42229a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f42230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ K f42231c;

    S(K k9) {
        this.f42231c = k9;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j9) {
        this.f42229a = true;
        this.f42230b = j9;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }

    @Override // j$.util.InterfaceC2069y, java.util.Iterator, j$.util.InterfaceC1925i
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (e0.f42351a) {
            e0.a(S.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((LongConsumer) new C2066v(consumer));
    }

    @Override // j$.util.InterfaceC2070z
    public final void forEachRemaining(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        while (hasNext()) {
            longConsumer.accept(nextLong());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f42229a) {
            this.f42231c.tryAdvance((LongConsumer) this);
        }
        return this.f42229a;
    }

    @Override // java.util.Iterator
    public final Long next() {
        if (!e0.f42351a) {
            return Long.valueOf(nextLong());
        }
        e0.a(S.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
        throw null;
    }

    @Override // j$.util.InterfaceC2069y
    public final long nextLong() {
        if (!this.f42229a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f42229a = false;
        return this.f42230b;
    }
}
