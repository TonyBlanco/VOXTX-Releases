package q5;

/* JADX INFO: renamed from: q5.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2572s extends AbstractRunnableC2568o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2578y f46926f;

    public C2572s(C2578y c2578y) {
        this.f46926f = c2578y;
    }

    @Override // q5.AbstractRunnableC2568o
    public final void b() {
        C2578y c2578y = this.f46926f;
        if (c2578y.f46944m != null) {
            c2578y.f46933b.d("Unbind from service.", new Object[0]);
            C2578y c2578y2 = this.f46926f;
            c2578y2.f46932a.unbindService(c2578y2.f46943l);
            this.f46926f.f46938g = false;
            this.f46926f.f46944m = null;
            this.f46926f.f46943l = null;
        }
        this.f46926f.t();
    }
}
