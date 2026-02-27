package j$.util.stream;

import java.util.function.DoublePredicate;

/* JADX INFO: loaded from: classes2.dex */
final class Z3 extends AbstractC1983j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f42577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ a4 f42578c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z3(a4 a4Var, InterfaceC2018q2 interfaceC2018q2) {
        super(interfaceC2018q2);
        this.f42578c = a4Var;
        this.f42577b = true;
    }

    @Override // j$.util.stream.InterfaceC2003n2, j$.util.stream.InterfaceC2018q2
    public final void accept(double d9) {
        if (this.f42577b) {
            this.f42578c.getClass();
            DoublePredicate doublePredicate = null;
            doublePredicate.test(d9);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC1983j2, j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        this.f42686a.m(-1L);
    }

    @Override // j$.util.stream.AbstractC1983j2, j$.util.stream.InterfaceC2018q2
    public final boolean o() {
        return !this.f42577b || this.f42686a.o();
    }
}
