package M4;

/* JADX INFO: renamed from: M4.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0807q3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f5022a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0824t3 f5023c;

    public RunnableC0807q3(C0824t3 c0824t3, boolean z9) {
        this.f5023c = c0824t3;
        this.f5022a = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zO = this.f5023c.f4245a.o();
        boolean zN = this.f5023c.f4245a.n();
        this.f5023c.f4245a.k(this.f5022a);
        if (zN == this.f5022a) {
            this.f5023c.f4245a.d().v().b("Default data collection state already set to", Boolean.valueOf(this.f5022a));
        }
        if (this.f5023c.f4245a.o() == zO || this.f5023c.f4245a.o() != this.f5023c.f4245a.n()) {
            this.f5023c.f4245a.d().x().c("Default data collection is different than actual status", Boolean.valueOf(this.f5022a), Boolean.valueOf(zO));
        }
        this.f5023c.P();
    }
}
