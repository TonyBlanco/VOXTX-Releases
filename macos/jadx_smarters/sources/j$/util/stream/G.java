package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
final class G implements K3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f42426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f42427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Predicate f42428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Supplier f42429d;

    G(boolean z9, EnumC1964f3 enumC1964f3, Object obj, Predicate predicate, Supplier supplier) {
        this.f42426a = (z9 ? 0 : EnumC1959e3.f42634r) | EnumC1959e3.f42637u;
        this.f42427b = obj;
        this.f42428c = predicate;
        this.f42429d = supplier;
    }

    @Override // j$.util.stream.K3
    public final Object b(AbstractC1940b abstractC1940b, Spliterator spliterator) {
        L3 l32 = (L3) this.f42429d.get();
        abstractC1940b.V(spliterator, l32);
        Object obj = l32.get();
        return obj != null ? obj : this.f42427b;
    }

    @Override // j$.util.stream.K3
    public final Object c(AbstractC1940b abstractC1940b, Spliterator spliterator) {
        return new M(this, EnumC1959e3.ORDERED.q(abstractC1940b.K()), abstractC1940b, spliterator).invoke();
    }

    @Override // j$.util.stream.K3
    public final int d() {
        return this.f42426a;
    }
}
