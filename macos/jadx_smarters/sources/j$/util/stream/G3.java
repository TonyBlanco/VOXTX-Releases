package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
abstract class G3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Spliterator f42432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final boolean f42433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f42434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f42435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicLong f42436e;

    G3(Spliterator spliterator, long j9, long j10) {
        this.f42432a = spliterator;
        this.f42433b = j10 < 0;
        this.f42435d = j10 >= 0 ? j10 : 0L;
        this.f42434c = 128;
        this.f42436e = new AtomicLong(j10 >= 0 ? j9 + j10 : j9);
    }

    G3(Spliterator spliterator, G3 g32) {
        this.f42432a = spliterator;
        this.f42433b = g32.f42433b;
        this.f42436e = g32.f42436e;
        this.f42435d = g32.f42435d;
        this.f42434c = g32.f42434c;
    }

    protected final long b(long j9) {
        AtomicLong atomicLong;
        long j10;
        boolean z9;
        long jMin;
        do {
            atomicLong = this.f42436e;
            j10 = atomicLong.get();
            z9 = this.f42433b;
            if (j10 != 0) {
                jMin = Math.min(j10, j9);
                if (jMin <= 0) {
                    break;
                }
            } else {
                if (z9) {
                    return j9;
                }
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j10, j10 - jMin));
        if (z9) {
            return Math.max(j9 - jMin, 0L);
        }
        long j11 = this.f42435d;
        return j10 > j11 ? Math.max(jMin - (j10 - j11), 0L) : jMin;
    }

    protected abstract Spliterator c(Spliterator spliterator);

    public final int characteristics() {
        return this.f42432a.characteristics() & (-16465);
    }

    protected final F3 d() {
        return this.f42436e.get() > 0 ? F3.MAYBE_MORE : this.f42433b ? F3.UNLIMITED : F3.NO_MORE;
    }

    public final long estimateSize() {
        return this.f42432a.estimateSize();
    }

    public /* bridge */ /* synthetic */ j$.util.E trySplit() {
        return (j$.util.E) m19trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.H m16trySplit() {
        return (j$.util.H) m19trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.K m17trySplit() {
        return (j$.util.K) m19trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.N m18trySplit() {
        return (j$.util.N) m19trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final Spliterator m19trySplit() {
        Spliterator spliteratorTrySplit;
        if (this.f42436e.get() == 0 || (spliteratorTrySplit = this.f42432a.trySplit()) == null) {
            return null;
        }
        return c(spliteratorTrySplit);
    }
}
