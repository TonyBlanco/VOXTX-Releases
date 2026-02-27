package d4;

import O2.C0917s1;

/* JADX INFO: loaded from: classes3.dex */
public final class U implements InterfaceC1683D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1688e f39731a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f39732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f39733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f39734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0917s1 f39735f = C0917s1.f6227e;

    public U(InterfaceC1688e interfaceC1688e) {
        this.f39731a = interfaceC1688e;
    }

    public void a(long j9) {
        this.f39733d = j9;
        if (this.f39732c) {
            this.f39734e = this.f39731a.b();
        }
    }

    @Override // d4.InterfaceC1683D
    public void b(C0917s1 c0917s1) {
        if (this.f39732c) {
            a(r());
        }
        this.f39735f = c0917s1;
    }

    @Override // d4.InterfaceC1683D
    public C0917s1 c() {
        return this.f39735f;
    }

    public void d() {
        if (this.f39732c) {
            return;
        }
        this.f39734e = this.f39731a.b();
        this.f39732c = true;
    }

    public void e() {
        if (this.f39732c) {
            a(r());
            this.f39732c = false;
        }
    }

    @Override // d4.InterfaceC1683D
    public long r() {
        long j9 = this.f39733d;
        if (!this.f39732c) {
            return j9;
        }
        long jB = this.f39731a.b() - this.f39734e;
        C0917s1 c0917s1 = this.f39735f;
        return j9 + (c0917s1.f6231a == 1.0f ? k0.P0(jB) : c0917s1.b(jB));
    }
}
