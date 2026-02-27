package j$.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class P implements Iterator, Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f42223a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f42224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Spliterator f42225c;

    P(Spliterator spliterator) {
        this.f42225c = spliterator;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f42223a = true;
        this.f42224b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f42223a) {
            this.f42225c.tryAdvance(this);
        }
        return this.f42223a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f42223a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f42223a = false;
        return this.f42224b;
    }
}
