package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
final class P3 extends AbstractC1998m2 implements e4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f42505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f42506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f42507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Q3 f42508e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P3(Q3 q32, InterfaceC2018q2 interfaceC2018q2, boolean z9) {
        super(interfaceC2018q2);
        this.f42508e = q32;
        this.f42507d = z9;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z9 = true;
        if (!this.f42506c) {
            boolean z10 = !this.f42508e.f42516m.test(obj);
            this.f42506c = z10;
            if (!z10) {
                z9 = false;
            }
        }
        boolean z11 = this.f42507d;
        if (z11 && !z9) {
            this.f42505b++;
        }
        if (z11 || z9) {
            this.f42708a.accept(obj);
        }
    }

    @Override // j$.util.stream.e4
    public final long g() {
        return this.f42505b;
    }
}
