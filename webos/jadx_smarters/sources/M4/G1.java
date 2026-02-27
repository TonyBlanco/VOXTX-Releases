package M4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class G1 extends AbstractC0739f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4257b;

    public G1(C0776l2 c0776l2) {
        super(c0776l2);
        this.f4245a.i();
    }

    public final void i() {
        if (!m()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (this.f4257b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (n()) {
            return;
        }
        this.f4245a.g();
        this.f4257b = true;
    }

    public final void k() {
        if (this.f4257b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        l();
        this.f4245a.g();
        this.f4257b = true;
    }

    public void l() {
    }

    public final boolean m() {
        return this.f4257b;
    }

    public abstract boolean n();
}
