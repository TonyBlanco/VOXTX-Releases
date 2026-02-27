package M4;

/* JADX INFO: loaded from: classes3.dex */
public final class L3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f5 f4359a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ V4 f4361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0760i4 f4362e;

    public L3(C0760i4 c0760i4, f5 f5Var, boolean z9, V4 v42) {
        this.f4362e = c0760i4;
        this.f4359a = f5Var;
        this.f4360c = z9;
        this.f4361d = v42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0760i4 c0760i4 = this.f4362e;
        InterfaceC0799p1 interfaceC0799p1 = c0760i4.f4743d;
        if (interfaceC0799p1 == null) {
            c0760i4.f4245a.d().r().a("Discarding data. Failed to set user property");
            return;
        }
        com.google.android.gms.common.internal.r.m(this.f4359a);
        this.f4362e.r(interfaceC0799p1, this.f4360c ? null : this.f4361d, this.f4359a);
        this.f4362e.E();
    }
}
