package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class M extends AbstractC1945c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final G f42473j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f42474k;

    M(G g9, boolean z9, AbstractC1940b abstractC1940b, Spliterator spliterator) {
        super(abstractC1940b, spliterator);
        this.f42474k = z9;
        this.f42473j = g9;
    }

    M(M m9, Spliterator spliterator) {
        super(m9, spliterator);
        this.f42474k = m9.f42474k;
        this.f42473j = m9.f42473j;
    }

    @Override // j$.util.stream.AbstractC1955e
    protected final Object a() {
        AbstractC1940b abstractC1940b = this.f42614a;
        L3 l32 = (L3) this.f42473j.f42429d.get();
        abstractC1940b.V(this.f42615b, l32);
        Object obj = l32.get();
        if (!this.f42474k) {
            if (obj != null) {
                AtomicReference atomicReference = this.f42599h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
            }
            return null;
        }
        if (obj == null) {
            return null;
        }
        AbstractC1955e abstractC1955e = this;
        while (true) {
            if (abstractC1955e != null) {
                AbstractC1955e abstractC1955e2 = (AbstractC1955e) abstractC1955e.getCompleter();
                if (abstractC1955e2 != null && abstractC1955e2.f42617d != abstractC1955e) {
                    i();
                    break;
                }
                abstractC1955e = abstractC1955e2;
            } else {
                AtomicReference atomicReference2 = this.f42599h;
                while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
                }
            }
        }
        return obj;
    }

    @Override // j$.util.stream.AbstractC1955e
    protected final AbstractC1955e e(Spliterator spliterator) {
        return new M(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC1945c
    protected final Object j() {
        return this.f42473j.f42427b;
    }

    @Override // j$.util.stream.AbstractC1955e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.f42474k) {
            M m9 = (M) this.f42617d;
            M m10 = null;
            while (true) {
                if (m9 != m10) {
                    Object objC = m9.c();
                    if (objC != null && this.f42473j.f42428c.test(objC)) {
                        f(objC);
                        AbstractC1955e abstractC1955e = this;
                        while (true) {
                            if (abstractC1955e != null) {
                                AbstractC1955e abstractC1955e2 = (AbstractC1955e) abstractC1955e.getCompleter();
                                if (abstractC1955e2 != null && abstractC1955e2.f42617d != abstractC1955e) {
                                    i();
                                    break;
                                }
                                abstractC1955e = abstractC1955e2;
                            } else {
                                AtomicReference atomicReference = this.f42599h;
                                while (!atomicReference.compareAndSet(null, objC) && atomicReference.get() == null) {
                                }
                            }
                        }
                    } else {
                        m10 = m9;
                        m9 = (M) this.f42618e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
