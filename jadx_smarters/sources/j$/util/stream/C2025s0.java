package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* JADX INFO: renamed from: j$.util.stream.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2025s0 extends AbstractC2035u0 implements InterfaceC2013p2 {
    @Override // j$.util.stream.AbstractC2035u0, j$.util.stream.InterfaceC2018q2, j$.util.stream.InterfaceC2013p2, java.util.function.LongConsumer
    public final void accept(long j9) {
        if (this.f42757a) {
            return;
        }
        LongPredicate longPredicate = null;
        longPredicate.test(j9);
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        k((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC2013p2
    public final /* synthetic */ void k(Long l9) {
        AbstractC2055y0.i(this, l9);
    }
}
