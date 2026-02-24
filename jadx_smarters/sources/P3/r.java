package P3;

import O2.A0;
import O2.AbstractC0892k;
import O2.C0936z0;
import O2.D1;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.F;
import d4.k0;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends AbstractC0892k implements Handler.Callback {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public n f7257A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public o f7258B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public o f7259C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f7260D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f7261E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f7262F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f7263G;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Handler f7264q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q f7265r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f7266s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final A0 f7267t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7268u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7269v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f7270w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7271x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C0936z0 f7272y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public j f7273z;

    public r(q qVar, Looper looper) {
        this(qVar, looper, l.f7242a);
    }

    public r(q qVar, Looper looper, l lVar) {
        super(3);
        this.f7265r = (q) AbstractC1684a.e(qVar);
        this.f7264q = looper == null ? null : k0.w(looper, this);
        this.f7266s = lVar;
        this.f7267t = new A0();
        this.f7261E = -9223372036854775807L;
        this.f7262F = -9223372036854775807L;
        this.f7263G = -9223372036854775807L;
    }

    private long V(long j9) {
        AbstractC1684a.g(j9 != -9223372036854775807L);
        AbstractC1684a.g(this.f7262F != -9223372036854775807L);
        return j9 - this.f7262F;
    }

    private void a0() {
        Z();
        ((j) AbstractC1684a.e(this.f7273z)).release();
        this.f7273z = null;
        this.f7271x = 0;
    }

    @Override // O2.AbstractC0892k
    public void G() {
        this.f7272y = null;
        this.f7261E = -9223372036854775807L;
        S();
        this.f7262F = -9223372036854775807L;
        this.f7263G = -9223372036854775807L;
        a0();
    }

    @Override // O2.AbstractC0892k
    public void I(long j9, boolean z9) {
        this.f7263G = j9;
        S();
        this.f7268u = false;
        this.f7269v = false;
        this.f7261E = -9223372036854775807L;
        if (this.f7271x != 0) {
            b0();
        } else {
            Z();
            ((j) AbstractC1684a.e(this.f7273z)).flush();
        }
    }

    @Override // O2.AbstractC0892k
    public void O(C0936z0[] c0936z0Arr, long j9, long j10) {
        this.f7262F = j10;
        this.f7272y = c0936z0Arr[0];
        if (this.f7273z != null) {
            this.f7271x = 1;
        } else {
            X();
        }
    }

    public final void S() {
        d0(new f(AbstractC2743y.z(), V(this.f7263G)));
    }

    public final long T(long j9) {
        int iA = this.f7258B.a(j9);
        if (iA == 0 || this.f7258B.h() == 0) {
            return this.f7258B.timeUs;
        }
        if (iA != -1) {
            return this.f7258B.c(iA - 1);
        }
        return this.f7258B.c(r2.h() - 1);
    }

    public final long U() {
        if (this.f7260D == -1) {
            return Long.MAX_VALUE;
        }
        AbstractC1684a.e(this.f7258B);
        if (this.f7260D >= this.f7258B.h()) {
            return Long.MAX_VALUE;
        }
        return this.f7258B.c(this.f7260D);
    }

    public final void W(k kVar) {
        AbstractC1681B.e("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f7272y, kVar);
        S();
        b0();
    }

    public final void X() {
        this.f7270w = true;
        this.f7273z = this.f7266s.b((C0936z0) AbstractC1684a.e(this.f7272y));
    }

    public final void Y(f fVar) {
        this.f7265r.k(fVar.f7230a);
        this.f7265r.u(fVar);
    }

    public final void Z() {
        this.f7257A = null;
        this.f7260D = -1;
        o oVar = this.f7258B;
        if (oVar != null) {
            oVar.release();
            this.f7258B = null;
        }
        o oVar2 = this.f7259C;
        if (oVar2 != null) {
            oVar2.release();
            this.f7259C = null;
        }
    }

    @Override // O2.E1
    public int a(C0936z0 c0936z0) {
        if (this.f7266s.a(c0936z0)) {
            return D1.a(c0936z0.f6454H == 0 ? 4 : 2);
        }
        return D1.a(F.r(c0936z0.f6467m) ? 1 : 0);
    }

    public final void b0() {
        a0();
        X();
    }

    public void c0(long j9) {
        AbstractC1684a.g(p());
        this.f7261E = j9;
    }

    @Override // O2.C1
    public boolean d() {
        return this.f7269v;
    }

    public final void d0(f fVar) {
        Handler handler = this.f7264q;
        if (handler != null) {
            handler.obtainMessage(0, fVar).sendToTarget();
        } else {
            Y(fVar);
        }
    }

    @Override // O2.C1
    public boolean e() {
        return true;
    }

    @Override // O2.C1, O2.E1
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        Y((f) message.obj);
        return true;
    }

    @Override // O2.C1
    public void u(long j9, long j10) {
        boolean z9;
        this.f7263G = j9;
        if (p()) {
            long j11 = this.f7261E;
            if (j11 != -9223372036854775807L && j9 >= j11) {
                Z();
                this.f7269v = true;
            }
        }
        if (this.f7269v) {
            return;
        }
        if (this.f7259C == null) {
            ((j) AbstractC1684a.e(this.f7273z)).a(j9);
            try {
                this.f7259C = (o) ((j) AbstractC1684a.e(this.f7273z)).b();
            } catch (k e9) {
                W(e9);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f7258B != null) {
            long jU = U();
            z9 = false;
            while (jU <= j9) {
                this.f7260D++;
                jU = U();
                z9 = true;
            }
        } else {
            z9 = false;
        }
        o oVar = this.f7259C;
        if (oVar != null) {
            if (oVar.isEndOfStream()) {
                if (!z9 && U() == Long.MAX_VALUE) {
                    if (this.f7271x == 2) {
                        b0();
                    } else {
                        Z();
                        this.f7269v = true;
                    }
                }
            } else if (oVar.timeUs <= j9) {
                o oVar2 = this.f7258B;
                if (oVar2 != null) {
                    oVar2.release();
                }
                this.f7260D = oVar.a(j9);
                this.f7258B = oVar;
                this.f7259C = null;
                z9 = true;
            }
        }
        if (z9) {
            AbstractC1684a.e(this.f7258B);
            d0(new f(this.f7258B.b(j9), V(T(j9))));
        }
        if (this.f7271x == 2) {
            return;
        }
        while (!this.f7268u) {
            try {
                n nVar = this.f7257A;
                if (nVar == null) {
                    nVar = (n) ((j) AbstractC1684a.e(this.f7273z)).d();
                    if (nVar == null) {
                        return;
                    } else {
                        this.f7257A = nVar;
                    }
                }
                if (this.f7271x == 1) {
                    nVar.setFlags(4);
                    ((j) AbstractC1684a.e(this.f7273z)).c(nVar);
                    this.f7257A = null;
                    this.f7271x = 2;
                    return;
                }
                int iP = P(this.f7267t, nVar, 0);
                if (iP == -4) {
                    if (nVar.isEndOfStream()) {
                        this.f7268u = true;
                        this.f7270w = false;
                    } else {
                        C0936z0 c0936z0 = this.f7267t.f5499b;
                        if (c0936z0 == null) {
                            return;
                        }
                        nVar.f7254j = c0936z0.f6471q;
                        nVar.i();
                        this.f7270w &= !nVar.isKeyFrame();
                    }
                    if (!this.f7270w) {
                        ((j) AbstractC1684a.e(this.f7273z)).c(nVar);
                        this.f7257A = null;
                    }
                } else if (iP == -3) {
                    return;
                }
            } catch (k e10) {
                W(e10);
                return;
            }
        }
    }
}
