package j$.util.stream;

import j$.util.C1921e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes2.dex */
final class L1 extends AbstractC2055y0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ BinaryOperator f42467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ BiConsumer f42468i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ Supplier f42469j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ C1980j f42470k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L1(EnumC1964f3 enumC1964f3, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, C1980j c1980j) {
        super(enumC1964f3);
        this.f42467h = binaryOperator;
        this.f42468i = biConsumer;
        this.f42469j = supplier;
        this.f42470k = c1980j;
    }

    @Override // j$.util.stream.AbstractC2055y0, j$.util.stream.K3
    public final int d() {
        Set<Collector.Characteristics> setCharacteristics = this.f42470k.f42684a.characteristics();
        if (setCharacteristics != null && !setCharacteristics.isEmpty()) {
            HashSet hashSet = new HashSet();
            Collector.Characteristics next = setCharacteristics.iterator().next();
            if (next instanceof EnumC1975i) {
                Iterator<Collector.Characteristics> it = setCharacteristics.iterator();
                while (it.hasNext()) {
                    try {
                        EnumC1975i enumC1975i = (EnumC1975i) it.next();
                        hashSet.add(enumC1975i == null ? null : enumC1975i == EnumC1975i.CONCURRENT ? Collector.Characteristics.CONCURRENT : enumC1975i == EnumC1975i.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH);
                    } catch (ClassCastException e9) {
                        C1921e.a("java.util.stream.Collector.Characteristics", e9);
                        throw null;
                    }
                }
            } else {
                if (!(next instanceof Collector.Characteristics)) {
                    C1921e.a("java.util.stream.Collector.Characteristics", next.getClass());
                    throw null;
                }
                Iterator<Collector.Characteristics> it2 = setCharacteristics.iterator();
                while (it2.hasNext()) {
                    try {
                        Collector.Characteristics next2 = it2.next();
                        hashSet.add(next2 == null ? null : next2 == Collector.Characteristics.CONCURRENT ? EnumC1975i.CONCURRENT : next2 == Collector.Characteristics.UNORDERED ? EnumC1975i.UNORDERED : EnumC1975i.IDENTITY_FINISH);
                    } catch (ClassCastException e10) {
                        C1921e.a("java.util.stream.Collector.Characteristics", e10);
                        throw null;
                    }
                }
            }
            setCharacteristics = hashSet;
        }
        if (setCharacteristics.contains(EnumC1975i.UNORDERED)) {
            return EnumC1959e3.f42634r;
        }
        return 0;
    }

    @Override // j$.util.stream.AbstractC2055y0
    public final U1 e0() {
        return new M1(this.f42469j, this.f42468i, this.f42467h);
    }
}
