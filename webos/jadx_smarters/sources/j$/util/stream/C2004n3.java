package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2004n3 implements Spliterator, Consumer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f42714d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Spliterator f42715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f42716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f42717c;

    C2004n3(Spliterator spliterator) {
        this(spliterator, new ConcurrentHashMap());
    }

    private C2004n3(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f42715a = spliterator;
        this.f42716b = concurrentHashMap;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void q(Object obj) {
        this.f42717c = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    final void b(Consumer consumer, Object obj) {
        if (this.f42716b.putIfAbsent(obj != null ? obj : f42714d, Boolean.TRUE) == null) {
            consumer.q(obj);
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return (this.f42715a.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f42715a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.f42715a.forEachRemaining(new C2011p0(1, this, consumer));
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f42715a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.A.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i9) {
        return j$.util.A.e(this, i9);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        while (this.f42715a.tryAdvance(this)) {
            Object obj = this.f42717c;
            if (obj == null) {
                obj = f42714d;
            }
            if (this.f42716b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.q(this.f42717c);
                this.f42717c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f42715a.trySplit();
        if (spliteratorTrySplit != null) {
            return new C2004n3(spliteratorTrySplit, this.f42716b);
        }
        return null;
    }
}
