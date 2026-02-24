package j$.util.stream;

import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes2.dex */
final class R3 extends AbstractC1988k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f42529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ S3 f42530c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    R3(S3 s32, InterfaceC2018q2 interfaceC2018q2) {
        super(interfaceC2018q2);
        this.f42530c = s32;
        this.f42529b = true;
    }

    @Override // j$.util.stream.InterfaceC2008o2, j$.util.stream.InterfaceC2018q2
    public final void accept(int i9) {
        if (this.f42529b) {
            this.f42530c.getClass();
            IntPredicate intPredicate = null;
            intPredicate.test(i9);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC1988k2, j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        this.f42690a.m(-1L);
    }

    @Override // j$.util.stream.AbstractC1988k2, j$.util.stream.InterfaceC2018q2
    public final boolean o() {
        return !this.f42529b || this.f42690a.o();
    }
}
