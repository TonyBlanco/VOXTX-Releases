package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2022r2 extends AbstractC1998m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f42740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f42741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2027s2 f42742d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2022r2(C2027s2 c2027s2, InterfaceC2018q2 interfaceC2018q2) {
        super(interfaceC2018q2);
        this.f42742d = c2027s2;
        this.f42740b = c2027s2.f42745m;
        long j9 = c2027s2.f42746n;
        this.f42741c = j9 < 0 ? Long.MAX_VALUE : j9;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void q(Object obj) {
        long j9 = this.f42740b;
        if (j9 != 0) {
            this.f42740b = j9 - 1;
            return;
        }
        long j10 = this.f42741c;
        if (j10 > 0) {
            this.f42741c = j10 - 1;
            this.f42708a.q(obj);
        }
    }

    @Override // j$.util.stream.AbstractC1998m2, j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        this.f42708a.m(AbstractC2055y0.A(j9, this.f42742d.f42745m, this.f42741c));
    }

    @Override // j$.util.stream.AbstractC1998m2, j$.util.stream.InterfaceC2018q2
    public final boolean o() {
        return this.f42741c == 0 || this.f42708a.o();
    }
}
