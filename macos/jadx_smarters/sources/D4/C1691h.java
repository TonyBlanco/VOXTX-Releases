package d4;

/* JADX INFO: renamed from: d4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1691h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1688e f39765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f39766b;

    public C1691h() {
        this(InterfaceC1688e.f39758a);
    }

    public C1691h(InterfaceC1688e interfaceC1688e) {
        this.f39765a = interfaceC1688e;
    }

    public synchronized void a() {
        while (!this.f39766b) {
            wait();
        }
    }

    public synchronized boolean b(long j9) {
        if (j9 <= 0) {
            return this.f39766b;
        }
        long jB = this.f39765a.b();
        long j10 = j9 + jB;
        if (j10 < jB) {
            a();
        } else {
            while (!this.f39766b && jB < j10) {
                wait(j10 - jB);
                jB = this.f39765a.b();
            }
        }
        return this.f39766b;
    }

    public synchronized void c() {
        boolean z9 = false;
        while (!this.f39766b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z9 = true;
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean d() {
        boolean z9;
        z9 = this.f39766b;
        this.f39766b = false;
        return z9;
    }

    public synchronized boolean e() {
        return this.f39766b;
    }

    public synchronized boolean f() {
        if (this.f39766b) {
            return false;
        }
        this.f39766b = true;
        notifyAll();
        return true;
    }
}
