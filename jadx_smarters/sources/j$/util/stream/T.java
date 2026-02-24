package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
final class T extends CountedCompleter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1940b f42537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Spliterator f42538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f42539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap f42540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC2018q2 f42541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final T f42542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private K0 f42543g;

    T(T t9, Spliterator spliterator, T t10) {
        super(t9);
        this.f42537a = t9.f42537a;
        this.f42538b = spliterator;
        this.f42539c = t9.f42539c;
        this.f42540d = t9.f42540d;
        this.f42541e = t9.f42541e;
        this.f42542f = t10;
    }

    protected T(AbstractC1940b abstractC1940b, Spliterator spliterator, InterfaceC2018q2 interfaceC2018q2) {
        super(null);
        this.f42537a = abstractC1940b;
        this.f42538b = spliterator;
        this.f42539c = AbstractC1955e.g(spliterator.estimateSize());
        this.f42540d = new ConcurrentHashMap(Math.max(16, AbstractC1955e.b() << 1));
        this.f42541e = interfaceC2018q2;
        this.f42542f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f42538b;
        long j9 = this.f42539c;
        boolean z9 = false;
        T t9 = this;
        while (spliterator.estimateSize() > j9 && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            T t10 = new T(t9, spliteratorTrySplit, t9.f42542f);
            T t11 = new T(t9, spliterator, t10);
            t9.addToPendingCount(1);
            t11.addToPendingCount(1);
            t9.f42540d.put(t10, t11);
            if (t9.f42542f != null) {
                t10.addToPendingCount(1);
                if (t9.f42540d.replace(t9.f42542f, t9, t10)) {
                    t9.addToPendingCount(-1);
                } else {
                    t10.addToPendingCount(-1);
                }
            }
            if (z9) {
                spliterator = spliteratorTrySplit;
                t9 = t10;
                t10 = t11;
            } else {
                t9 = t11;
            }
            z9 = !z9;
            t10.fork();
        }
        if (t9.getPendingCount() > 0) {
            C2024s c2024s = new C2024s(5);
            AbstractC1940b abstractC1940b = t9.f42537a;
            C0 c0N = abstractC1940b.N(abstractC1940b.G(spliterator), c2024s);
            t9.f42537a.V(spliterator, c0N);
            t9.f42543g = c0N.a();
            t9.f42538b = null;
        }
        t9.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        K0 k02 = this.f42543g;
        if (k02 != null) {
            k02.forEach(this.f42541e);
            this.f42543g = null;
        } else {
            Spliterator spliterator = this.f42538b;
            if (spliterator != null) {
                this.f42537a.V(spliterator, this.f42541e);
                this.f42538b = null;
            }
        }
        T t9 = (T) this.f42540d.remove(this);
        if (t9 != null) {
            t9.tryComplete();
        }
    }
}
