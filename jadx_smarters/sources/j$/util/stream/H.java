package j$.util.stream;

import j$.util.C1927k;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class H extends L implements InterfaceC2003n2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final G f42437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final G f42438d;

    static {
        EnumC1964f3 enumC1964f3 = EnumC1964f3.DOUBLE_VALUE;
        f42437c = new G(true, enumC1964f3, C1927k.a(), new C2024s(1), new C2015q(4));
        f42438d = new G(false, enumC1964f3, C1927k.a(), new C2024s(1), new C2015q(4));
    }

    @Override // j$.util.stream.L, j$.util.stream.InterfaceC2018q2
    public final void accept(double d9) {
        q(Double.valueOf(d9));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f42464a) {
            return C1927k.d(((Double) this.f42465b).doubleValue());
        }
        return null;
    }
}
