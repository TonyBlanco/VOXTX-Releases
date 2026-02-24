package M4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class F2 extends E2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4250b;

    public F2(C0776l2 c0776l2) {
        super(c0776l2);
        this.f4245a.i();
    }

    public void i() {
    }

    public abstract boolean j();

    public final void k() {
        if (!n()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void l() {
        if (this.f4250b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (j()) {
            return;
        }
        this.f4245a.g();
        this.f4250b = true;
    }

    public final void m() {
        if (this.f4250b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        i();
        this.f4245a.g();
        this.f4250b = true;
    }

    public final boolean n() {
        return this.f4250b;
    }
}
