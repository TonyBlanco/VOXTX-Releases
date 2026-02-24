package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC2063z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long f42806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f42807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Spliterator f42808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f42809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f42810e;

    AbstractC2063z3(Spliterator spliterator, long j9, long j10, long j11, long j12) {
        this.f42808c = spliterator;
        this.f42806a = j9;
        this.f42807b = j10;
        this.f42809d = j11;
        this.f42810e = j12;
    }

    protected abstract Spliterator a(Spliterator spliterator, long j9, long j10, long j11, long j12);

    public final int characteristics() {
        return this.f42808c.characteristics();
    }

    public final long estimateSize() {
        long j9 = this.f42810e;
        long j10 = this.f42806a;
        if (j10 < j9) {
            return j9 - Math.max(j10, this.f42809d);
        }
        return 0L;
    }

    public /* bridge */ /* synthetic */ j$.util.E trySplit() {
        return (j$.util.E) m23trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.H m20trySplit() {
        return (j$.util.H) m23trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.K m21trySplit() {
        return (j$.util.K) m23trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.N m22trySplit() {
        return (j$.util.N) m23trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final Spliterator m23trySplit() {
        long j9 = this.f42810e;
        if (this.f42806a >= j9 || this.f42809d >= j9) {
            return null;
        }
        while (true) {
            Spliterator spliteratorTrySplit = this.f42808c.trySplit();
            if (spliteratorTrySplit == null) {
                return null;
            }
            long jEstimateSize = spliteratorTrySplit.estimateSize() + this.f42809d;
            long jMin = Math.min(jEstimateSize, this.f42807b);
            long j10 = this.f42806a;
            if (j10 >= jMin) {
                this.f42809d = jMin;
            } else {
                long j11 = this.f42807b;
                if (jMin < j11) {
                    long j12 = this.f42809d;
                    if (j12 < j10 || jEstimateSize > j11) {
                        this.f42809d = jMin;
                        return a(spliteratorTrySplit, j10, j11, j12, jMin);
                    }
                    this.f42809d = jMin;
                    return spliteratorTrySplit;
                }
                this.f42808c = spliteratorTrySplit;
                this.f42810e = jMin;
            }
        }
    }
}
