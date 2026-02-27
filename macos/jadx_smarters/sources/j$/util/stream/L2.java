package j$.util.stream;

import j$.util.Comparator;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class L2 extends AbstractC1973h2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f42471m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Comparator f42472n;

    L2(AbstractC1940b abstractC1940b) {
        super(abstractC1940b, EnumC1959e3.f42633q | EnumC1959e3.f42631o, 0);
        this.f42471m = true;
        this.f42472n = Comparator.CC.a();
    }

    L2(AbstractC1940b abstractC1940b, java.util.Comparator comparator) {
        super(abstractC1940b, EnumC1959e3.f42633q | EnumC1959e3.f42632p, 0);
        this.f42471m = false;
        this.f42472n = (java.util.Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.AbstractC1940b
    public final K0 O(AbstractC1940b abstractC1940b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC1959e3.SORTED.q(abstractC1940b.K()) && this.f42471m) {
            return abstractC1940b.C(spliterator, false, intFunction);
        }
        Object[] objArrP = abstractC1940b.C(spliterator, true, intFunction).p(intFunction);
        Arrays.sort(objArrP, this.f42472n);
        return new N0(objArrP);
    }

    @Override // j$.util.stream.AbstractC1940b
    public final InterfaceC2018q2 R(int i9, InterfaceC2018q2 interfaceC2018q2) {
        Objects.requireNonNull(interfaceC2018q2);
        if (EnumC1959e3.SORTED.q(i9) && this.f42471m) {
            return interfaceC2018q2;
        }
        boolean zQ = EnumC1959e3.SIZED.q(i9);
        java.util.Comparator comparator = this.f42472n;
        return zQ ? new Q2(interfaceC2018q2, comparator) : new M2(interfaceC2018q2, comparator);
    }
}
