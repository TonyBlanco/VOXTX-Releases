package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: j$.util.stream.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1945c extends AbstractC1955e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final AtomicReference f42599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected volatile boolean f42600i;

    protected AbstractC1945c(AbstractC1940b abstractC1940b, Spliterator spliterator) {
        super(abstractC1940b, spliterator);
        this.f42599h = new AtomicReference(null);
    }

    protected AbstractC1945c(AbstractC1945c abstractC1945c, Spliterator spliterator) {
        super(abstractC1945c, spliterator);
        this.f42599h = abstractC1945c.f42599h;
    }

    @Override // j$.util.stream.AbstractC1955e
    public final Object c() {
        if (!d()) {
            return super.c();
        }
        Object obj = this.f42599h.get();
        return obj == null ? j() : obj;
    }

    @Override // j$.util.stream.AbstractC1955e, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object objJ;
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f42615b;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.f42616c;
        if (jG == 0) {
            jG = AbstractC1955e.g(jEstimateSize);
            this.f42616c = jG;
        }
        AtomicReference atomicReference = this.f42599h;
        boolean z9 = false;
        AbstractC1945c abstractC1945c = this;
        while (true) {
            objJ = atomicReference.get();
            if (objJ != null) {
                break;
            }
            boolean z10 = abstractC1945c.f42600i;
            if (!z10) {
                CountedCompleter<?> completer = abstractC1945c.getCompleter();
                while (true) {
                    AbstractC1945c abstractC1945c2 = (AbstractC1945c) ((AbstractC1955e) completer);
                    if (z10 || abstractC1945c2 == null) {
                        break;
                    }
                    z10 = abstractC1945c2.f42600i;
                    completer = abstractC1945c2.getCompleter();
                }
            }
            if (z10) {
                objJ = abstractC1945c.j();
                break;
            }
            if (jEstimateSize <= jG || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            AbstractC1945c abstractC1945c3 = (AbstractC1945c) abstractC1945c.e(spliteratorTrySplit);
            abstractC1945c.f42617d = abstractC1945c3;
            AbstractC1945c abstractC1945c4 = (AbstractC1945c) abstractC1945c.e(spliterator);
            abstractC1945c.f42618e = abstractC1945c4;
            abstractC1945c.setPendingCount(1);
            if (z9) {
                spliterator = spliteratorTrySplit;
                abstractC1945c = abstractC1945c3;
                abstractC1945c3 = abstractC1945c4;
            } else {
                abstractC1945c = abstractC1945c4;
            }
            z9 = !z9;
            abstractC1945c3.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        objJ = abstractC1945c.a();
        abstractC1945c.f(objJ);
        abstractC1945c.tryComplete();
    }

    @Override // j$.util.stream.AbstractC1955e
    protected final void f(Object obj) {
        if (!d()) {
            super.f(obj);
        } else if (obj != null) {
            AtomicReference atomicReference = this.f42599h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.AbstractC1955e, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return c();
    }

    protected void h() {
        this.f42600i = true;
    }

    protected final void i() {
        AbstractC1945c abstractC1945c = this;
        for (AbstractC1945c abstractC1945c2 = (AbstractC1945c) ((AbstractC1955e) getCompleter()); abstractC1945c2 != null; abstractC1945c2 = (AbstractC1945c) ((AbstractC1955e) abstractC1945c2.getCompleter())) {
            if (abstractC1945c2.f42617d == abstractC1945c) {
                AbstractC1945c abstractC1945c3 = (AbstractC1945c) abstractC1945c2.f42618e;
                if (!abstractC1945c3.f42600i) {
                    abstractC1945c3.h();
                }
            }
            abstractC1945c = abstractC1945c2;
        }
    }

    protected abstract Object j();
}
