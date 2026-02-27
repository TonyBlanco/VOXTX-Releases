package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: j$.util.stream.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2020r0 extends AbstractC2035u0 implements InterfaceC2008o2 {
    @Override // j$.util.stream.AbstractC2035u0, j$.util.stream.InterfaceC2018q2
    public final void accept(int i9) {
        if (this.f42757a) {
            return;
        }
        IntPredicate intPredicate = null;
        intPredicate.test(i9);
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        n((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC2008o2
    public final /* synthetic */ void n(Integer num) {
        AbstractC2055y0.g(this, num);
    }
}
