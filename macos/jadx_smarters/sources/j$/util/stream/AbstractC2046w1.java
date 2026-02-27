package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC2046w1 extends CountedCompleter implements InterfaceC2018q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Spliterator f42773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final AbstractC1940b f42774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final long f42775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected long f42776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected long f42777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f42778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f42779g;

    AbstractC2046w1(Spliterator spliterator, AbstractC1940b abstractC1940b, int i9) {
        this.f42773a = spliterator;
        this.f42774b = abstractC1940b;
        this.f42775c = AbstractC1955e.g(spliterator.estimateSize());
        this.f42776d = 0L;
        this.f42777e = i9;
    }

    AbstractC2046w1(AbstractC2046w1 abstractC2046w1, Spliterator spliterator, long j9, long j10, int i9) {
        super(abstractC2046w1);
        this.f42773a = spliterator;
        this.f42774b = abstractC2046w1.f42774b;
        this.f42775c = abstractC2046w1.f42775c;
        this.f42776d = j9;
        this.f42777e = j10;
        if (j9 < 0 || j10 < 0 || (j9 + j10) - 1 >= i9) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j9), Long.valueOf(j9), Long.valueOf(j10), Integer.valueOf(i9)));
        }
    }

    public /* synthetic */ void accept(double d9) {
        AbstractC2055y0.a();
        throw null;
    }

    public /* synthetic */ void accept(int i9) {
        AbstractC2055y0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j9) {
        AbstractC2055y0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    abstract AbstractC2046w1 b(Spliterator spliterator, long j9, long j10);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f42773a;
        AbstractC2046w1 abstractC2046w1B = this;
        while (spliterator.estimateSize() > abstractC2046w1B.f42775c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            abstractC2046w1B.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            abstractC2046w1B.b(spliteratorTrySplit, abstractC2046w1B.f42776d, jEstimateSize).fork();
            abstractC2046w1B = abstractC2046w1B.b(spliterator, abstractC2046w1B.f42776d + jEstimateSize, abstractC2046w1B.f42777e - jEstimateSize);
        }
        abstractC2046w1B.f42774b.V(spliterator, abstractC2046w1B);
        abstractC2046w1B.propagateCompletion();
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void l() {
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        long j10 = this.f42777e;
        if (j9 > j10) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i9 = (int) this.f42776d;
        this.f42778f = i9;
        this.f42779g = i9 + ((int) j10);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ boolean o() {
        return false;
    }
}
