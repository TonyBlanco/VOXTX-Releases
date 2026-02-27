package j$.util.stream;

import java.util.function.DoublePredicate;

/* JADX INFO: loaded from: classes2.dex */
final class b4 extends AbstractC1983j2 implements e4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ c4 f42598b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b4(c4 c4Var, InterfaceC2018q2 interfaceC2018q2, boolean z9) {
        super(interfaceC2018q2);
        this.f42598b = c4Var;
    }

    @Override // j$.util.stream.InterfaceC2003n2, j$.util.stream.InterfaceC2018q2
    public final void accept(double d9) {
        this.f42598b.getClass();
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d9);
        throw null;
    }

    @Override // j$.util.stream.e4
    public final long g() {
        return 0L;
    }
}
