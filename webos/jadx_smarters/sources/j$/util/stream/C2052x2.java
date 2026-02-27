package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2052x2 extends AbstractC1983j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f42784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f42785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2057y2 f42786d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2052x2(C2057y2 c2057y2, InterfaceC2018q2 interfaceC2018q2) {
        super(interfaceC2018q2);
        this.f42786d = c2057y2;
        this.f42784b = c2057y2.f42797m;
        long j9 = c2057y2.f42798n;
        this.f42785c = j9 < 0 ? Long.MAX_VALUE : j9;
    }

    @Override // j$.util.stream.InterfaceC2003n2, j$.util.stream.InterfaceC2018q2
    public final void accept(double d9) {
        long j9 = this.f42784b;
        if (j9 != 0) {
            this.f42784b = j9 - 1;
            return;
        }
        long j10 = this.f42785c;
        if (j10 > 0) {
            this.f42785c = j10 - 1;
            this.f42686a.accept(d9);
        }
    }

    @Override // j$.util.stream.AbstractC1983j2, j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        this.f42686a.m(AbstractC2055y0.A(j9, this.f42786d.f42797m, this.f42785c));
    }

    @Override // j$.util.stream.AbstractC1983j2, j$.util.stream.InterfaceC2018q2
    public final boolean o() {
        return this.f42785c == 0 || this.f42686a.o();
    }
}
