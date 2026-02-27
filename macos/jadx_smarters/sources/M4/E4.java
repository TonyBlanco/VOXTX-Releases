package M4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class E4 extends D4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4247c;

    public E4(S4 s42) {
        super(s42);
        this.f4234b.r();
    }

    public final void i() {
        if (!k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (this.f4247c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        l();
        this.f4234b.m();
        this.f4247c = true;
    }

    public final boolean k() {
        return this.f4247c;
    }

    public abstract boolean l();
}
