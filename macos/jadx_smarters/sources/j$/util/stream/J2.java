package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class J2 extends AbstractC1941b0 {
    @Override // j$.util.stream.AbstractC1940b
    public final K0 O(AbstractC1940b abstractC1940b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC1959e3.SORTED.q(abstractC1940b.K())) {
            return abstractC1940b.C(spliterator, false, intFunction);
        }
        int[] iArr = (int[]) ((G0) abstractC1940b.C(spliterator, true, intFunction)).e();
        Arrays.sort(iArr);
        return new C1967g1(iArr);
    }

    @Override // j$.util.stream.AbstractC1940b
    public final InterfaceC2018q2 R(int i9, InterfaceC2018q2 interfaceC2018q2) {
        Objects.requireNonNull(interfaceC2018q2);
        return EnumC1959e3.SORTED.q(i9) ? interfaceC2018q2 : EnumC1959e3.SIZED.q(i9) ? new O2(interfaceC2018q2) : new G2(interfaceC2018q2);
    }
}
