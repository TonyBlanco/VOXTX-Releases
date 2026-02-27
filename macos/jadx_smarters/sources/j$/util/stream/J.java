package j$.util.stream;

import j$.util.C1929m;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class J extends L implements InterfaceC2013p2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final G f42452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final G f42453d;

    static {
        EnumC1964f3 enumC1964f3 = EnumC1964f3.LONG_VALUE;
        f42452c = new G(true, enumC1964f3, C1929m.a(), new C2024s(3), new C2015q(6));
        f42453d = new G(false, enumC1964f3, C1929m.a(), new C2024s(3), new C2015q(6));
    }

    @Override // j$.util.stream.L, j$.util.stream.InterfaceC2018q2, j$.util.stream.InterfaceC2013p2, java.util.function.LongConsumer
    public final void accept(long j9) {
        q(Long.valueOf(j9));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f42464a) {
            return C1929m.d(((Long) this.f42465b).longValue());
        }
        return null;
    }
}
