package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: j$.util.stream.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1943b2 extends AbstractC1955e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC2055y0 f42596h;

    C1943b2(C1943b2 c1943b2, Spliterator spliterator) {
        super(c1943b2, spliterator);
        this.f42596h = c1943b2.f42596h;
    }

    C1943b2(AbstractC2055y0 abstractC2055y0, AbstractC1940b abstractC1940b, Spliterator spliterator) {
        super(abstractC1940b, spliterator);
        this.f42596h = abstractC2055y0;
    }

    @Override // j$.util.stream.AbstractC1955e
    protected final Object a() {
        AbstractC1940b abstractC1940b = this.f42614a;
        U1 u1E0 = this.f42596h.e0();
        abstractC1940b.V(this.f42615b, u1E0);
        return u1E0;
    }

    @Override // j$.util.stream.AbstractC1955e
    protected final AbstractC1955e e(Spliterator spliterator) {
        return new C1943b2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC1955e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC1955e abstractC1955e = this.f42617d;
        if (abstractC1955e != null) {
            U1 u12 = (U1) ((C1943b2) abstractC1955e).c();
            u12.h((U1) ((C1943b2) this.f42618e).c());
            f(u12);
        }
        super.onCompletion(countedCompleter);
    }
}
