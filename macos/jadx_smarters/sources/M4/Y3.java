package M4;

/* JADX INFO: loaded from: classes3.dex */
public final class Y3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f5 f4560a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0725d f4562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0725d f4563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0760i4 f4564f;

    public Y3(C0760i4 c0760i4, boolean z9, f5 f5Var, boolean z10, C0725d c0725d, C0725d c0725d2) {
        this.f4564f = c0760i4;
        this.f4560a = f5Var;
        this.f4561c = z10;
        this.f4562d = c0725d;
        this.f4563e = c0725d2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0760i4 c0760i4 = this.f4564f;
        InterfaceC0799p1 interfaceC0799p1 = c0760i4.f4743d;
        if (interfaceC0799p1 == null) {
            c0760i4.f4245a.d().r().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        com.google.android.gms.common.internal.r.m(this.f4560a);
        this.f4564f.r(interfaceC0799p1, this.f4561c ? null : this.f4562d, this.f4560a);
        this.f4564f.E();
    }
}
