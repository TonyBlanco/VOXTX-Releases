package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2042v2 extends AbstractC1993l2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f42767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f42768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2047w2 f42769d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2042v2(C2047w2 c2047w2, InterfaceC2018q2 interfaceC2018q2) {
        super(interfaceC2018q2);
        this.f42769d = c2047w2;
        this.f42767b = c2047w2.f42780m;
        long j9 = c2047w2.f42781n;
        this.f42768c = j9 < 0 ? Long.MAX_VALUE : j9;
    }

    @Override // j$.util.stream.InterfaceC2013p2, java.util.function.LongConsumer
    public final void accept(long j9) {
        long j10 = this.f42767b;
        if (j10 != 0) {
            this.f42767b = j10 - 1;
            return;
        }
        long j11 = this.f42768c;
        if (j11 > 0) {
            this.f42768c = j11 - 1;
            this.f42697a.accept(j9);
        }
    }

    @Override // j$.util.stream.AbstractC1993l2, j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        this.f42697a.m(AbstractC2055y0.A(j9, this.f42769d.f42780m, this.f42768c));
    }

    @Override // j$.util.stream.AbstractC1993l2, j$.util.stream.InterfaceC2018q2
    public final boolean o() {
        return this.f42768c == 0 || this.f42697a.o();
    }
}
