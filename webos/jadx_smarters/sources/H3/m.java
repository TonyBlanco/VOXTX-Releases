package H3;

import B3.Y;
import O2.A0;
import d4.AbstractC1684a;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2519a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f2520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2521d = -1;

    public m(q qVar, int i9) {
        this.f2520c = qVar;
        this.f2519a = i9;
    }

    @Override // B3.Y
    public void a() throws s {
        int i9 = this.f2521d;
        if (i9 == -2) {
            throw new s(this.f2520c.u().b(this.f2519a).c(0).f6467m);
        }
        if (i9 == -1) {
            this.f2520c.V();
        } else if (i9 != -3) {
            this.f2520c.X(i9);
        }
    }

    public void b() {
        AbstractC1684a.a(this.f2521d == -1);
        this.f2521d = this.f2520c.y(this.f2519a);
    }

    public final boolean c() {
        int i9 = this.f2521d;
        return (i9 == -1 || i9 == -3 || i9 == -2) ? false : true;
    }

    public void d() {
        if (this.f2521d != -1) {
            this.f2520c.r0(this.f2519a);
            this.f2521d = -1;
        }
    }

    @Override // B3.Y
    public boolean e() {
        return this.f2521d == -3 || (c() && this.f2520c.R(this.f2521d));
    }

    @Override // B3.Y
    public int n(long j9) {
        if (c()) {
            return this.f2520c.q0(this.f2521d, j9);
        }
        return 0;
    }

    @Override // B3.Y
    public int q(A0 a02, U2.g gVar, int i9) {
        if (this.f2521d == -3) {
            gVar.addFlag(4);
            return -4;
        }
        if (c()) {
            return this.f2520c.g0(this.f2521d, a02, gVar, i9);
        }
        return -3;
    }
}
