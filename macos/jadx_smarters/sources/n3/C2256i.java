package n3;

import O2.C0936z0;
import Q2.AbstractC1015a;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import d3.C1671h;
import d3.InterfaceC1674k;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.L;
import d4.M;
import d4.k0;
import java.util.Arrays;
import java.util.Collections;
import n3.I;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: n3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2256i implements m {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f45027v = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f45028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f45029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f45030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f45032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d3.w f45033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d3.w f45034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f45035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45036i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45037j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f45038k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f45039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f45040m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f45041n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f45042o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f45043p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f45044q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f45045r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f45046s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d3.w f45047t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f45048u;

    public C2256i(boolean z9) {
        this(z9, null);
    }

    public C2256i(boolean z9, String str) {
        this.f45029b = new L(new byte[7]);
        this.f45030c = new M(Arrays.copyOf(f45027v, 10));
        s();
        this.f45040m = -1;
        this.f45041n = -1;
        this.f45044q = -9223372036854775807L;
        this.f45046s = -9223372036854775807L;
        this.f45028a = z9;
        this.f45031d = str;
    }

    private boolean i(M m9, byte[] bArr, int i9) {
        int iMin = Math.min(m9.a(), i9 - this.f45036i);
        m9.l(bArr, this.f45036i, iMin);
        int i10 = this.f45036i + iMin;
        this.f45036i = i10;
        return i10 == i9;
    }

    public static boolean m(int i9) {
        return (i9 & 65526) == 65520;
    }

    public final void a() {
        AbstractC1684a.e(this.f45033f);
        k0.j(this.f45047t);
        k0.j(this.f45034g);
    }

    @Override // n3.m
    public void b(M m9) {
        a();
        while (m9.a() > 0) {
            int i9 = this.f45035h;
            if (i9 == 0) {
                j(m9);
            } else if (i9 == 1) {
                g(m9);
            } else if (i9 != 2) {
                if (i9 == 3) {
                    if (i(m9, this.f45029b.f39700a, this.f45038k ? 7 : 5)) {
                        n();
                    }
                } else {
                    if (i9 != 4) {
                        throw new IllegalStateException();
                    }
                    p(m9);
                }
            } else if (i(m9, this.f45030c.e(), 10)) {
                o();
            }
        }
    }

    @Override // n3.m
    public void c() {
        this.f45046s = -9223372036854775807L;
        q();
    }

    @Override // n3.m
    public void d() {
    }

    @Override // n3.m
    public void e(long j9, int i9) {
        if (j9 != -9223372036854775807L) {
            this.f45046s = j9;
        }
    }

    @Override // n3.m
    public void f(InterfaceC1674k interfaceC1674k, I.d dVar) {
        dVar.a();
        this.f45032e = dVar.b();
        d3.w wVarE = interfaceC1674k.e(dVar.c(), 1);
        this.f45033f = wVarE;
        this.f45047t = wVarE;
        if (!this.f45028a) {
            this.f45034g = new C1671h();
            return;
        }
        dVar.a();
        d3.w wVarE2 = interfaceC1674k.e(dVar.c(), 5);
        this.f45034g = wVarE2;
        wVarE2.d(new C0936z0.b().U(dVar.b()).g0("application/id3").G());
    }

    public final void g(M m9) {
        if (m9.a() == 0) {
            return;
        }
        this.f45029b.f39700a[0] = m9.e()[m9.f()];
        this.f45029b.p(2);
        int iH = this.f45029b.h(4);
        int i9 = this.f45041n;
        if (i9 != -1 && iH != i9) {
            q();
            return;
        }
        if (!this.f45039l) {
            this.f45039l = true;
            this.f45040m = this.f45042o;
            this.f45041n = iH;
        }
        t();
    }

    public final boolean h(M m9, int i9) {
        m9.U(i9 + 1);
        if (!w(m9, this.f45029b.f39700a, 1)) {
            return false;
        }
        this.f45029b.p(4);
        int iH = this.f45029b.h(1);
        int i10 = this.f45040m;
        if (i10 != -1 && iH != i10) {
            return false;
        }
        if (this.f45041n != -1) {
            if (!w(m9, this.f45029b.f39700a, 1)) {
                return true;
            }
            this.f45029b.p(2);
            if (this.f45029b.h(4) != this.f45041n) {
                return false;
            }
            m9.U(i9 + 2);
        }
        if (!w(m9, this.f45029b.f39700a, 4)) {
            return true;
        }
        this.f45029b.p(14);
        int iH2 = this.f45029b.h(13);
        if (iH2 < 7) {
            return false;
        }
        byte[] bArrE = m9.e();
        int iG = m9.g();
        int i11 = i9 + iH2;
        if (i11 >= iG) {
            return true;
        }
        byte b9 = bArrE[i11];
        if (b9 == -1) {
            int i12 = i11 + 1;
            if (i12 == iG) {
                return true;
            }
            return l((byte) -1, bArrE[i12]) && ((bArrE[i12] & 8) >> 3) == iH;
        }
        if (b9 != 73) {
            return false;
        }
        int i13 = i11 + 1;
        if (i13 == iG) {
            return true;
        }
        if (bArrE[i13] != 68) {
            return false;
        }
        int i14 = i11 + 2;
        return i14 == iG || bArrE[i14] == 51;
    }

    public final void j(M m9) {
        int i9;
        byte[] bArrE = m9.e();
        int iF = m9.f();
        int iG = m9.g();
        while (iF < iG) {
            int i10 = iF + 1;
            byte b9 = bArrE[iF];
            int i11 = b9 & 255;
            if (this.f45037j == 512 && l((byte) -1, (byte) i11) && (this.f45039l || h(m9, iF - 1))) {
                this.f45042o = (b9 & 8) >> 3;
                this.f45038k = (b9 & 1) == 0;
                if (this.f45039l) {
                    t();
                } else {
                    r();
                }
                m9.U(i10);
                return;
            }
            int i12 = this.f45037j;
            int i13 = i11 | i12;
            if (i13 != 329) {
                if (i13 == 511) {
                    this.f45037j = IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
                } else if (i13 == 836) {
                    i9 = 1024;
                } else if (i13 == 1075) {
                    u();
                    m9.U(i10);
                    return;
                } else if (i12 != 256) {
                    this.f45037j = JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                }
                iF = i10;
            } else {
                i9 = 768;
            }
            this.f45037j = i9;
            iF = i10;
        }
        m9.U(iF);
    }

    public long k() {
        return this.f45044q;
    }

    public final boolean l(byte b9, byte b10) {
        return m(((b9 & 255) << 8) | (b10 & 255));
    }

    public final void n() {
        this.f45029b.p(0);
        if (this.f45043p) {
            this.f45029b.r(10);
        } else {
            int i9 = 2;
            int iH = this.f45029b.h(2) + 1;
            if (iH != 2) {
                AbstractC1681B.j("AdtsReader", "Detected audio object type: " + iH + ", but assuming AAC LC.");
            } else {
                i9 = iH;
            }
            this.f45029b.r(5);
            byte[] bArrB = AbstractC1015a.b(i9, this.f45041n, this.f45029b.h(3));
            AbstractC1015a.b bVarF = AbstractC1015a.f(bArrB);
            C0936z0 c0936z0G = new C0936z0.b().U(this.f45032e).g0("audio/mp4a-latm").K(bVarF.f7733c).J(bVarF.f7732b).h0(bVarF.f7731a).V(Collections.singletonList(bArrB)).X(this.f45031d).G();
            this.f45044q = 1024000000 / ((long) c0936z0G.f6447A);
            this.f45033f.d(c0936z0G);
            this.f45043p = true;
        }
        this.f45029b.r(4);
        int iH2 = this.f45029b.h(13);
        int i10 = iH2 - 7;
        if (this.f45038k) {
            i10 = iH2 - 9;
        }
        v(this.f45033f, this.f45044q, 0, i10);
    }

    public final void o() {
        this.f45034g.b(this.f45030c, 10);
        this.f45030c.U(6);
        v(this.f45034g, 0L, 10, this.f45030c.G() + 10);
    }

    public final void p(M m9) {
        int iMin = Math.min(m9.a(), this.f45045r - this.f45036i);
        this.f45047t.b(m9, iMin);
        int i9 = this.f45036i + iMin;
        this.f45036i = i9;
        int i10 = this.f45045r;
        if (i9 == i10) {
            long j9 = this.f45046s;
            if (j9 != -9223372036854775807L) {
                this.f45047t.f(j9, 1, i10, 0, null);
                this.f45046s += this.f45048u;
            }
            s();
        }
    }

    public final void q() {
        this.f45039l = false;
        s();
    }

    public final void r() {
        this.f45035h = 1;
        this.f45036i = 0;
    }

    public final void s() {
        this.f45035h = 0;
        this.f45036i = 0;
        this.f45037j = JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
    }

    public final void t() {
        this.f45035h = 3;
        this.f45036i = 0;
    }

    public final void u() {
        this.f45035h = 2;
        this.f45036i = f45027v.length;
        this.f45045r = 0;
        this.f45030c.U(0);
    }

    public final void v(d3.w wVar, long j9, int i9, int i10) {
        this.f45035h = 4;
        this.f45036i = i9;
        this.f45047t = wVar;
        this.f45048u = j9;
        this.f45045r = i10;
    }

    public final boolean w(M m9, byte[] bArr, int i9) {
        if (m9.a() < i9) {
            return false;
        }
        m9.l(bArr, 0, i9);
        return true;
    }
}
