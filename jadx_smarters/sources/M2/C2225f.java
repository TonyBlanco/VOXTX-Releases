package m2;

/* JADX INFO: renamed from: m2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2225f implements InterfaceC2222c, InterfaceC2221b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC2221b f44318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC2221b f44319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC2222c f44320c;

    public C2225f(InterfaceC2222c interfaceC2222c) {
        this.f44320c = interfaceC2222c;
    }

    @Override // m2.InterfaceC2222c
    public boolean a() {
        return j() || d();
    }

    @Override // m2.InterfaceC2221b
    public void b() {
        this.f44318a.b();
        this.f44319b.b();
    }

    @Override // m2.InterfaceC2222c
    public boolean c(InterfaceC2221b interfaceC2221b) {
        return i() && (interfaceC2221b.equals(this.f44318a) || !this.f44318a.d());
    }

    @Override // m2.InterfaceC2221b
    public void clear() {
        this.f44319b.clear();
        this.f44318a.clear();
    }

    @Override // m2.InterfaceC2221b
    public boolean d() {
        return this.f44318a.d() || this.f44319b.d();
    }

    @Override // m2.InterfaceC2222c
    public void e(InterfaceC2221b interfaceC2221b) {
        if (interfaceC2221b.equals(this.f44319b)) {
            return;
        }
        InterfaceC2222c interfaceC2222c = this.f44320c;
        if (interfaceC2222c != null) {
            interfaceC2222c.e(this);
        }
        if (this.f44319b.isComplete()) {
            return;
        }
        this.f44319b.clear();
    }

    @Override // m2.InterfaceC2222c
    public boolean f(InterfaceC2221b interfaceC2221b) {
        return h() && interfaceC2221b.equals(this.f44318a) && !a();
    }

    @Override // m2.InterfaceC2221b
    public void g() {
        if (!this.f44319b.isRunning()) {
            this.f44319b.g();
        }
        if (this.f44318a.isRunning()) {
            return;
        }
        this.f44318a.g();
    }

    public final boolean h() {
        InterfaceC2222c interfaceC2222c = this.f44320c;
        return interfaceC2222c == null || interfaceC2222c.f(this);
    }

    public final boolean i() {
        InterfaceC2222c interfaceC2222c = this.f44320c;
        return interfaceC2222c == null || interfaceC2222c.c(this);
    }

    @Override // m2.InterfaceC2221b
    public boolean isCancelled() {
        return this.f44318a.isCancelled();
    }

    @Override // m2.InterfaceC2221b
    public boolean isComplete() {
        return this.f44318a.isComplete() || this.f44319b.isComplete();
    }

    @Override // m2.InterfaceC2221b
    public boolean isRunning() {
        return this.f44318a.isRunning();
    }

    public final boolean j() {
        InterfaceC2222c interfaceC2222c = this.f44320c;
        return interfaceC2222c != null && interfaceC2222c.a();
    }

    public void k(InterfaceC2221b interfaceC2221b, InterfaceC2221b interfaceC2221b2) {
        this.f44318a = interfaceC2221b;
        this.f44319b = interfaceC2221b2;
    }

    @Override // m2.InterfaceC2221b
    public void pause() {
        this.f44318a.pause();
        this.f44319b.pause();
    }
}
