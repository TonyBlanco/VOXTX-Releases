package j$.util;

import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
class b0 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Collection f42263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Iterator f42264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f42266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42267e;

    public b0(java.util.Collection collection, int i9) {
        this.f42263a = collection;
        this.f42264b = null;
        this.f42265c = (i9 & 4096) == 0 ? i9 | 16448 : i9;
    }

    public b0(Iterator it, int i9) {
        this.f42263a = null;
        this.f42264b = it;
        this.f42266d = Long.MAX_VALUE;
        this.f42265c = i9 & (-16449);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f42265c;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        if (this.f42264b != null) {
            return this.f42266d;
        }
        java.util.Collection collection = this.f42263a;
        this.f42264b = collection.iterator();
        long size = collection.size();
        this.f42266d = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f42264b;
        if (it == null) {
            Iterator it2 = this.f42263a.iterator();
            this.f42264b = it2;
            this.f42266d = r0.size();
            it = it2;
        }
        if (it instanceof InterfaceC1925i) {
            ((InterfaceC1925i) it).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    @Override // j$.util.Spliterator
    public java.util.Comparator getComparator() {
        if (A.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return A.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i9) {
        return A.e(this, i9);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.f42264b == null) {
            this.f42264b = this.f42263a.iterator();
            this.f42266d = r0.size();
        }
        if (!this.f42264b.hasNext()) {
            return false;
        }
        consumer.accept(this.f42264b.next());
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        long size;
        Iterator it = this.f42264b;
        if (it == null) {
            java.util.Collection collection = this.f42263a;
            Iterator it2 = collection.iterator();
            this.f42264b = it2;
            size = collection.size();
            this.f42266d = size;
            it = it2;
        } else {
            size = this.f42266d;
        }
        if (size <= 1 || !it.hasNext()) {
            return null;
        }
        int i9 = this.f42267e + 1024;
        if (i9 > size) {
            i9 = (int) size;
        }
        if (i9 > 33554432) {
            i9 = 33554432;
        }
        Object[] objArr = new Object[i9];
        int i10 = 0;
        do {
            objArr[i10] = it.next();
            i10++;
            if (i10 >= i9) {
                break;
            }
        } while (it.hasNext());
        this.f42267e = i10;
        long j9 = this.f42266d;
        if (j9 != Long.MAX_VALUE) {
            this.f42266d = j9 - ((long) i10);
        }
        return new U(objArr, 0, i10, this.f42265c);
    }
}
