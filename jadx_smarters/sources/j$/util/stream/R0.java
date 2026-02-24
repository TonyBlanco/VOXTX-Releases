package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* JADX INFO: loaded from: classes2.dex */
class R0 extends AbstractC1955e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final AbstractC1940b f42517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final LongFunction f42518i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final BinaryOperator f42519j;

    R0(R0 r02, Spliterator spliterator) {
        super(r02, spliterator);
        this.f42517h = r02.f42517h;
        this.f42518i = r02.f42518i;
        this.f42519j = r02.f42519j;
    }

    R0(AbstractC1940b abstractC1940b, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC1940b, spliterator);
        this.f42517h = abstractC1940b;
        this.f42518i = longFunction;
        this.f42519j = binaryOperator;
    }

    @Override // j$.util.stream.AbstractC1955e
    protected AbstractC1955e e(Spliterator spliterator) {
        return new R0(this, spliterator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC1955e
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final K0 a() {
        C0 c02 = (C0) this.f42518i.apply(this.f42517h.G(this.f42615b));
        this.f42517h.V(this.f42615b, c02);
        return c02.a();
    }

    @Override // j$.util.stream.AbstractC1955e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC1955e abstractC1955e = this.f42617d;
        if (abstractC1955e != null) {
            f((K0) this.f42519j.apply((K0) ((R0) abstractC1955e).c(), (K0) ((R0) this.f42618e).c()));
        }
        super.onCompletion(countedCompleter);
    }
}
