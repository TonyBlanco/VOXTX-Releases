package M4;

/* JADX INFO: loaded from: classes3.dex */
public final class X3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f5 f4538a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0832v f4540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f4541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0760i4 f4542f;

    public X3(C0760i4 c0760i4, boolean z9, f5 f5Var, boolean z10, C0832v c0832v, String str) {
        this.f4542f = c0760i4;
        this.f4538a = f5Var;
        this.f4539c = z10;
        this.f4540d = c0832v;
        this.f4541e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0760i4 c0760i4 = this.f4542f;
        InterfaceC0799p1 interfaceC0799p1 = c0760i4.f4743d;
        if (interfaceC0799p1 == null) {
            c0760i4.f4245a.d().r().a("Discarding data. Failed to send event to service");
            return;
        }
        com.google.android.gms.common.internal.r.m(this.f4538a);
        this.f4542f.r(interfaceC0799p1, this.f4539c ? null : this.f4540d, this.f4538a);
        this.f4542f.E();
    }
}
