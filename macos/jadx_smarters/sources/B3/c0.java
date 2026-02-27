package B3;

import B3.InterfaceC0517z;
import B3.J;
import O2.A0;
import O2.C0936z0;
import O2.H1;
import b4.C1227s;
import b4.F;
import b4.G;
import b4.InterfaceC1224o;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements InterfaceC0517z, G.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1227s f502a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1224o.a f503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b4.S f504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b4.F f505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final J.a f506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0 f507g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f509i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0936z0 f511k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f512l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f513m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f514n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f515o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f508h = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b4.G f510j = new b4.G("SingleSampleMediaPeriod");

    public final class b implements Y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f516a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f517c;

        public b() {
        }

        @Override // B3.Y
        public void a() throws IOException {
            c0 c0Var = c0.this;
            if (c0Var.f512l) {
                return;
            }
            c0Var.f510j.a();
        }

        public final void b() {
            if (this.f517c) {
                return;
            }
            c0.this.f506f.h(d4.F.k(c0.this.f511k.f6467m), c0.this.f511k, 0, null, 0L);
            this.f517c = true;
        }

        public void c() {
            if (this.f516a == 2) {
                this.f516a = 1;
            }
        }

        @Override // B3.Y
        public boolean e() {
            return c0.this.f513m;
        }

        @Override // B3.Y
        public int n(long j9) {
            b();
            if (j9 <= 0 || this.f516a == 2) {
                return 0;
            }
            this.f516a = 2;
            return 1;
        }

        @Override // B3.Y
        public int q(A0 a02, U2.g gVar, int i9) {
            b();
            c0 c0Var = c0.this;
            boolean z9 = c0Var.f513m;
            if (z9 && c0Var.f514n == null) {
                this.f516a = 2;
            }
            int i10 = this.f516a;
            if (i10 == 2) {
                gVar.addFlag(4);
                return -4;
            }
            if ((i9 & 2) != 0 || i10 == 0) {
                a02.f5499b = c0Var.f511k;
                this.f516a = 1;
                return -5;
            }
            if (!z9) {
                return -3;
            }
            AbstractC1684a.e(c0Var.f514n);
            gVar.addFlag(1);
            gVar.f9701f = 0L;
            if ((i9 & 4) == 0) {
                gVar.e(c0.this.f515o);
                ByteBuffer byteBuffer = gVar.f9699d;
                c0 c0Var2 = c0.this;
                byteBuffer.put(c0Var2.f514n, 0, c0Var2.f515o);
            }
            if ((i9 & 1) == 0) {
                this.f516a = 2;
            }
            return -4;
        }
    }

    public static final class c implements G.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f519a = C0512u.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C1227s f520c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b4.P f521d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f522e;

        public c(C1227s c1227s, InterfaceC1224o interfaceC1224o) {
            this.f520c = c1227s;
            this.f521d = new b4.P(interfaceC1224o);
        }

        @Override // b4.G.e
        public void a() {
            this.f521d.v();
            try {
                this.f521d.a(this.f520c);
                int i9 = 0;
                while (i9 != -1) {
                    int iJ = (int) this.f521d.j();
                    byte[] bArr = this.f522e;
                    if (bArr == null) {
                        this.f522e = new byte[1024];
                    } else if (iJ == bArr.length) {
                        this.f522e = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    b4.P p9 = this.f521d;
                    byte[] bArr2 = this.f522e;
                    i9 = p9.read(bArr2, iJ, bArr2.length - iJ);
                }
                b4.r.a(this.f521d);
            } catch (Throwable th) {
                b4.r.a(this.f521d);
                throw th;
            }
        }

        @Override // b4.G.e
        public void c() {
        }
    }

    public c0(C1227s c1227s, InterfaceC1224o.a aVar, b4.S s9, C0936z0 c0936z0, long j9, b4.F f9, J.a aVar2, boolean z9) {
        this.f502a = c1227s;
        this.f503c = aVar;
        this.f504d = s9;
        this.f511k = c0936z0;
        this.f509i = j9;
        this.f505e = f9;
        this.f506f = aVar2;
        this.f512l = z9;
        this.f507g = new i0(new g0(c0936z0));
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public boolean b() {
        return this.f510j.j();
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public long c() {
        return (this.f513m || this.f510j.j()) ? Long.MIN_VALUE : 0L;
    }

    @Override // B3.InterfaceC0517z
    public long d(long j9, H1 h12) {
        return j9;
    }

    @Override // b4.G.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void t(c cVar, long j9, long j10, boolean z9) {
        b4.P p9 = cVar.f521d;
        C0512u c0512u = new C0512u(cVar.f519a, cVar.f520c, p9.t(), p9.u(), j9, j10, p9.j());
        this.f505e.d(cVar.f519a);
        this.f506f.q(c0512u, 1, -1, null, 0, null, 0L, this.f509i);
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public boolean f(long j9) {
        if (this.f513m || this.f510j.j() || this.f510j.i()) {
            return false;
        }
        InterfaceC1224o interfaceC1224oA = this.f503c.a();
        b4.S s9 = this.f504d;
        if (s9 != null) {
            interfaceC1224oA.g(s9);
        }
        c cVar = new c(this.f502a, interfaceC1224oA);
        this.f506f.z(new C0512u(cVar.f519a, this.f502a, this.f510j.n(cVar, this, this.f505e.b(1))), 1, -1, this.f511k, 0, null, 0L, this.f509i);
        return true;
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public long g() {
        return this.f513m ? Long.MIN_VALUE : 0L;
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public void h(long j9) {
    }

    @Override // B3.InterfaceC0517z
    public long i(Z3.s[] sVarArr, boolean[] zArr, Y[] yArr, boolean[] zArr2, long j9) {
        for (int i9 = 0; i9 < sVarArr.length; i9++) {
            Y y9 = yArr[i9];
            if (y9 != null && (sVarArr[i9] == null || !zArr[i9])) {
                this.f508h.remove(y9);
                yArr[i9] = null;
            }
            if (yArr[i9] == null && sVarArr[i9] != null) {
                b bVar = new b();
                this.f508h.add(bVar);
                yArr[i9] = bVar;
                zArr2[i9] = true;
            }
        }
        return j9;
    }

    @Override // B3.InterfaceC0517z
    public /* synthetic */ List k(List list) {
        return AbstractC0516y.a(this, list);
    }

    @Override // B3.InterfaceC0517z
    public long l(long j9) {
        for (int i9 = 0; i9 < this.f508h.size(); i9++) {
            ((b) this.f508h.get(i9)).c();
        }
        return j9;
    }

    @Override // B3.InterfaceC0517z
    public long m() {
        return -9223372036854775807L;
    }

    @Override // b4.G.b
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void W(c cVar, long j9, long j10) {
        this.f515o = (int) cVar.f521d.j();
        this.f514n = (byte[]) AbstractC1684a.e(cVar.f522e);
        this.f513m = true;
        b4.P p9 = cVar.f521d;
        C0512u c0512u = new C0512u(cVar.f519a, cVar.f520c, p9.t(), p9.u(), j9, j10, this.f515o);
        this.f505e.d(cVar.f519a);
        this.f506f.t(c0512u, 1, -1, this.f511k, 0, null, 0L, this.f509i);
    }

    @Override // b4.G.b
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public G.c j(c cVar, long j9, long j10, IOException iOException, int i9) {
        G.c cVarH;
        b4.P p9 = cVar.f521d;
        C0512u c0512u = new C0512u(cVar.f519a, cVar.f520c, p9.t(), p9.u(), j9, j10, p9.j());
        long jC = this.f505e.c(new F.c(c0512u, new C0515x(1, -1, this.f511k, 0, null, 0L, d4.k0.x1(this.f509i)), iOException, i9));
        boolean z9 = jC == -9223372036854775807L || i9 >= this.f505e.b(1);
        if (this.f512l && z9) {
            AbstractC1681B.k("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f513m = true;
            cVarH = b4.G.f17500f;
        } else {
            cVarH = jC != -9223372036854775807L ? b4.G.h(false, jC) : b4.G.f17501g;
        }
        G.c cVar2 = cVarH;
        boolean z10 = !cVar2.c();
        this.f506f.v(c0512u, 1, -1, this.f511k, 0, null, 0L, this.f509i, iOException, z10);
        if (z10) {
            this.f505e.d(cVar.f519a);
        }
        return cVar2;
    }

    @Override // B3.InterfaceC0517z
    public void p() {
    }

    public void q() {
        this.f510j.l();
    }

    @Override // B3.InterfaceC0517z
    public void s(InterfaceC0517z.a aVar, long j9) {
        aVar.e(this);
    }

    @Override // B3.InterfaceC0517z
    public i0 u() {
        return this.f507g;
    }

    @Override // B3.InterfaceC0517z
    public void v(long j9, boolean z9) {
    }
}
