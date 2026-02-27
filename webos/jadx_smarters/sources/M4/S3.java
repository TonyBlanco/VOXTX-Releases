package M4;

/* JADX INFO: loaded from: classes3.dex */
public final class S3 extends AbstractC0791o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0760i4 f4463e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S3(C0760i4 c0760i4, G2 g22) {
        super(g22);
        this.f4463e = c0760i4;
    }

    @Override // M4.AbstractC0791o
    public final void c() {
        C0760i4 c0760i4 = this.f4463e;
        c0760i4.h();
        if (c0760i4.z()) {
            c0760i4.f4245a.d().v().a("Inactivity, disconnecting from the service");
            c0760i4.Q();
        }
    }
}
