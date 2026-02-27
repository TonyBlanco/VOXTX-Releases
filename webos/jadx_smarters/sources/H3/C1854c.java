package h3;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.g;
import d3.AbstractC1677n;
import d3.InterfaceC1672i;
import d3.InterfaceC1673j;
import d3.InterfaceC1674k;
import d3.InterfaceC1678o;
import d3.t;
import d4.AbstractC1684a;
import d4.M;
import java.util.Map;

/* JADX INFO: renamed from: h3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1854c implements InterfaceC1672i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final InterfaceC1678o f41621q = new InterfaceC1678o() { // from class: h3.b
        @Override // d3.InterfaceC1678o
        public /* synthetic */ InterfaceC1672i[] a(Uri uri, Map map) {
            return AbstractC1677n.a(this, uri, map);
        }

        @Override // d3.InterfaceC1678o
        public final InterfaceC1672i[] b() {
            return C1854c.g();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC1674k f41627f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f41630i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f41631j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41632k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f41633l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f41634m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f41635n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C1852a f41636o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C1857f f41637p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f41622a = new M(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f41623b = new M(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f41624c = new M(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M f41625d = new M();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1855d f41626e = new C1855d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41628g = 1;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC1672i[] g() {
        return new InterfaceC1672i[]{new C1854c()};
    }

    @Override // d3.InterfaceC1672i
    public void a(long j9, long j10) {
        if (j9 == 0) {
            this.f41628g = 1;
            this.f41629h = false;
        } else {
            this.f41628g = 3;
        }
        this.f41631j = 0;
    }

    @Override // d3.InterfaceC1672i
    public void b(InterfaceC1674k interfaceC1674k) {
        this.f41627f = interfaceC1674k;
    }

    @Override // d3.InterfaceC1672i
    public int d(InterfaceC1673j interfaceC1673j, t tVar) {
        AbstractC1684a.i(this.f41627f);
        while (true) {
            int i9 = this.f41628g;
            if (i9 != 1) {
                if (i9 == 2) {
                    m(interfaceC1673j);
                } else if (i9 != 3) {
                    if (i9 != 4) {
                        throw new IllegalStateException();
                    }
                    if (k(interfaceC1673j)) {
                        return 0;
                    }
                } else if (!l(interfaceC1673j)) {
                    return -1;
                }
            } else if (!j(interfaceC1673j)) {
                return -1;
            }
        }
    }

    public final void e() {
        if (this.f41635n) {
            return;
        }
        this.f41627f.n(new g.b(-9223372036854775807L));
        this.f41635n = true;
    }

    public final long f() {
        if (this.f41629h) {
            return this.f41630i + this.f41634m;
        }
        if (this.f41626e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f41634m;
    }

    @Override // d3.InterfaceC1672i
    public boolean h(InterfaceC1673j interfaceC1673j) {
        interfaceC1673j.s(this.f41622a.e(), 0, 3);
        this.f41622a.U(0);
        if (this.f41622a.K() != 4607062) {
            return false;
        }
        interfaceC1673j.s(this.f41622a.e(), 0, 2);
        this.f41622a.U(0);
        if ((this.f41622a.N() & 250) != 0) {
            return false;
        }
        interfaceC1673j.s(this.f41622a.e(), 0, 4);
        this.f41622a.U(0);
        int iQ = this.f41622a.q();
        interfaceC1673j.f();
        interfaceC1673j.n(iQ);
        interfaceC1673j.s(this.f41622a.e(), 0, 4);
        this.f41622a.U(0);
        return this.f41622a.q() == 0;
    }

    public final M i(InterfaceC1673j interfaceC1673j) {
        if (this.f41633l > this.f41625d.b()) {
            M m9 = this.f41625d;
            m9.S(new byte[Math.max(m9.b() * 2, this.f41633l)], 0);
        } else {
            this.f41625d.U(0);
        }
        this.f41625d.T(this.f41633l);
        interfaceC1673j.m(this.f41625d.e(), 0, this.f41633l);
        return this.f41625d;
    }

    public final boolean j(InterfaceC1673j interfaceC1673j) {
        if (!interfaceC1673j.h(this.f41623b.e(), 0, 9, true)) {
            return false;
        }
        this.f41623b.U(0);
        this.f41623b.V(4);
        int iH = this.f41623b.H();
        boolean z9 = (iH & 4) != 0;
        boolean z10 = (iH & 1) != 0;
        if (z9 && this.f41636o == null) {
            this.f41636o = new C1852a(this.f41627f.e(8, 1));
        }
        if (z10 && this.f41637p == null) {
            this.f41637p = new C1857f(this.f41627f.e(9, 2));
        }
        this.f41627f.q();
        this.f41631j = this.f41623b.q() - 5;
        this.f41628g = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(d3.InterfaceC1673j r10) {
        /*
            r9 = this;
            long r0 = r9.f()
            int r2 = r9.f41632k
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L23
            h3.a r3 = r9.f41636o
            if (r3 == 0) goto L23
            r9.e()
            h3.a r2 = r9.f41636o
        L19:
            d4.M r10 = r9.i(r10)
            boolean r10 = r2.a(r10, r0)
        L21:
            r0 = 1
            goto L6d
        L23:
            r3 = 9
            if (r2 != r3) goto L31
            h3.f r3 = r9.f41637p
            if (r3 == 0) goto L31
            r9.e()
            h3.f r2 = r9.f41637p
            goto L19
        L31:
            r3 = 18
            if (r2 != r3) goto L66
            boolean r2 = r9.f41635n
            if (r2 != 0) goto L66
            h3.d r2 = r9.f41626e
            d4.M r10 = r9.i(r10)
            boolean r10 = r2.a(r10, r0)
            h3.d r0 = r9.f41626e
            long r0 = r0.d()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            d3.k r2 = r9.f41627f
            com.google.android.exoplayer2.extractor.f r3 = new com.google.android.exoplayer2.extractor.f
            h3.d r7 = r9.f41626e
            long[] r7 = r7.e()
            h3.d r8 = r9.f41626e
            long[] r8 = r8.f()
            r3.<init>(r7, r8, r0)
            r2.n(r3)
            r9.f41635n = r6
            goto L21
        L66:
            int r0 = r9.f41633l
            r10.q(r0)
            r10 = 0
            r0 = 0
        L6d:
            boolean r1 = r9.f41629h
            if (r1 != 0) goto L87
            if (r10 == 0) goto L87
            r9.f41629h = r6
            h3.d r10 = r9.f41626e
            long r1 = r10.d()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L83
            long r1 = r9.f41634m
            long r1 = -r1
            goto L85
        L83:
            r1 = 0
        L85:
            r9.f41630i = r1
        L87:
            r10 = 4
            r9.f41631j = r10
            r10 = 2
            r9.f41628g = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.C1854c.k(d3.j):boolean");
    }

    public final boolean l(InterfaceC1673j interfaceC1673j) {
        if (!interfaceC1673j.h(this.f41624c.e(), 0, 11, true)) {
            return false;
        }
        this.f41624c.U(0);
        this.f41632k = this.f41624c.H();
        this.f41633l = this.f41624c.K();
        this.f41634m = this.f41624c.K();
        this.f41634m = (((long) (this.f41624c.H() << 24)) | this.f41634m) * 1000;
        this.f41624c.V(3);
        this.f41628g = 4;
        return true;
    }

    public final void m(InterfaceC1673j interfaceC1673j) {
        interfaceC1673j.q(this.f41631j);
        this.f41631j = 0;
        this.f41628g = 3;
    }

    @Override // d3.InterfaceC1672i
    public void release() {
    }
}
