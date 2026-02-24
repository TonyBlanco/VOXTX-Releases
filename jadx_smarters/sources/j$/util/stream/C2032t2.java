package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2032t2 extends AbstractC1988k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f42752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f42753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2037u2 f42754d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2032t2(C2037u2 c2037u2, InterfaceC2018q2 interfaceC2018q2) {
        super(interfaceC2018q2);
        this.f42754d = c2037u2;
        this.f42752b = c2037u2.f42760m;
        long j9 = c2037u2.f42761n;
        this.f42753c = j9 < 0 ? Long.MAX_VALUE : j9;
    }

    @Override // j$.util.stream.InterfaceC2008o2, j$.util.stream.InterfaceC2018q2
    public final void accept(int i9) {
        long j9 = this.f42752b;
        if (j9 != 0) {
            this.f42752b = j9 - 1;
            return;
        }
        long j10 = this.f42753c;
        if (j10 > 0) {
            this.f42753c = j10 - 1;
            this.f42690a.accept(i9);
        }
    }

    @Override // j$.util.stream.AbstractC1988k2, j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        this.f42690a.m(AbstractC2055y0.A(j9, this.f42754d.f42760m, this.f42753c));
    }

    @Override // j$.util.stream.AbstractC1988k2, j$.util.stream.InterfaceC2018q2
    public final boolean o() {
        return this.f42753c == 0 || this.f42690a.o();
    }
}
