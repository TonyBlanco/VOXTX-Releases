package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* JADX INFO: renamed from: j$.util.stream.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1955e extends CountedCompleter {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f42613g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final AbstractC1940b f42614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Spliterator f42615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f42616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected AbstractC1955e f42617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected AbstractC1955e f42618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f42619f;

    protected AbstractC1955e(AbstractC1940b abstractC1940b, Spliterator spliterator) {
        super(null);
        this.f42614a = abstractC1940b;
        this.f42615b = spliterator;
        this.f42616c = 0L;
    }

    protected AbstractC1955e(AbstractC1955e abstractC1955e, Spliterator spliterator) {
        super(abstractC1955e);
        this.f42615b = spliterator;
        this.f42614a = abstractC1955e.f42614a;
        this.f42616c = abstractC1955e.f42616c;
    }

    public static int b() {
        return f42613g;
    }

    public static long g(long j9) {
        long j10 = j9 / ((long) f42613g);
        if (j10 > 0) {
            return j10;
        }
        return 1L;
    }

    protected abstract Object a();

    protected Object c() {
        return this.f42619f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f42615b;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.f42616c;
        if (jG == 0) {
            jG = g(jEstimateSize);
            this.f42616c = jG;
        }
        boolean z9 = false;
        AbstractC1955e abstractC1955e = this;
        while (jEstimateSize > jG && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            AbstractC1955e abstractC1955eE = abstractC1955e.e(spliteratorTrySplit);
            abstractC1955e.f42617d = abstractC1955eE;
            AbstractC1955e abstractC1955eE2 = abstractC1955e.e(spliterator);
            abstractC1955e.f42618e = abstractC1955eE2;
            abstractC1955e.setPendingCount(1);
            if (z9) {
                spliterator = spliteratorTrySplit;
                abstractC1955e = abstractC1955eE;
                abstractC1955eE = abstractC1955eE2;
            } else {
                abstractC1955e = abstractC1955eE2;
            }
            z9 = !z9;
            abstractC1955eE.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC1955e.f(abstractC1955e.a());
        abstractC1955e.tryComplete();
    }

    protected final boolean d() {
        return ((AbstractC1955e) getCompleter()) == null;
    }

    protected abstract AbstractC1955e e(Spliterator spliterator);

    protected void f(Object obj) {
        this.f42619f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f42619f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f42615b = null;
        this.f42618e = null;
        this.f42617d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }
}
