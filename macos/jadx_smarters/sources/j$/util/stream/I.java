package j$.util.stream;

import j$.util.C1928l;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class I extends L implements InterfaceC2008o2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final G f42446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final G f42447d;

    static {
        EnumC1964f3 enumC1964f3 = EnumC1964f3.INT_VALUE;
        f42446c = new G(true, enumC1964f3, C1928l.a(), new C2024s(2), new C2015q(5));
        f42447d = new G(false, enumC1964f3, C1928l.a(), new C2024s(2), new C2015q(5));
    }

    @Override // j$.util.stream.L, j$.util.stream.InterfaceC2018q2
    public final void accept(int i9) {
        q(Integer.valueOf(i9));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f42464a) {
            return C1928l.d(((Integer) this.f42465b).intValue());
        }
        return null;
    }
}
