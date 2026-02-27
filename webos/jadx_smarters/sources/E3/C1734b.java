package e3;

import O2.C0897l1;
import O2.C0936z0;
import android.net.Uri;
import com.google.android.exoplayer2.extractor.c;
import com.google.android.exoplayer2.extractor.g;
import d3.AbstractC1677n;
import d3.InterfaceC1672i;
import d3.InterfaceC1673j;
import d3.InterfaceC1674k;
import d3.InterfaceC1678o;
import d3.t;
import d3.w;
import d4.AbstractC1684a;
import d4.k0;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: e3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1734b implements InterfaceC1672i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f40151r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f40154u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f40155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f40158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f40161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f40162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f40163i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f40165k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InterfaceC1674k f40166l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public w f40167m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g f40168n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f40169o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final InterfaceC1678o f40149p = new InterfaceC1678o() { // from class: e3.a
        @Override // d3.InterfaceC1678o
        public /* synthetic */ InterfaceC1672i[] a(Uri uri, Map map) {
            return AbstractC1677n.a(this, uri, map);
        }

        @Override // d3.InterfaceC1678o
        public final InterfaceC1672i[] b() {
            return C1734b.m();
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f40150q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f40152s = k0.s0("#!AMR\n");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f40153t = k0.s0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f40151r = iArr;
        f40154u = iArr[8];
    }

    public C1734b() {
        this(0);
    }

    public C1734b(int i9) {
        this.f40156b = (i9 & 2) != 0 ? i9 | 1 : i9;
        this.f40155a = new byte[1];
        this.f40163i = -1;
    }

    public static int f(int i9, long j9) {
        return (int) ((((long) i9) * 8000000) / j9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC1672i[] m() {
        return new InterfaceC1672i[]{new C1734b()};
    }

    public static boolean p(InterfaceC1673j interfaceC1673j, byte[] bArr) {
        interfaceC1673j.f();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC1673j.s(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // d3.InterfaceC1672i
    public void a(long j9, long j10) {
        this.f40158d = 0L;
        this.f40159e = 0;
        this.f40160f = 0;
        if (j9 != 0) {
            g gVar = this.f40168n;
            if (gVar instanceof c) {
                this.f40165k = ((c) gVar).b(j9);
                return;
            }
        }
        this.f40165k = 0L;
    }

    @Override // d3.InterfaceC1672i
    public void b(InterfaceC1674k interfaceC1674k) {
        this.f40166l = interfaceC1674k;
        this.f40167m = interfaceC1674k.e(0, 1);
        interfaceC1674k.q();
    }

    @Override // d3.InterfaceC1672i
    public int d(InterfaceC1673j interfaceC1673j, t tVar) throws C0897l1 {
        e();
        if (interfaceC1673j.getPosition() == 0 && !r(interfaceC1673j)) {
            throw C0897l1.a("Could not find AMR header.", null);
        }
        n();
        int iS = s(interfaceC1673j);
        o(interfaceC1673j.getLength(), iS);
        return iS;
    }

    public final void e() {
        AbstractC1684a.i(this.f40167m);
        k0.j(this.f40166l);
    }

    public final g g(long j9, boolean z9) {
        return new c(j9, this.f40162h, f(this.f40163i, 20000L), this.f40163i, z9);
    }

    @Override // d3.InterfaceC1672i
    public boolean h(InterfaceC1673j interfaceC1673j) {
        return r(interfaceC1673j);
    }

    public final int i(int i9) throws C0897l1 {
        if (k(i9)) {
            return this.f40157c ? f40151r[i9] : f40150q[i9];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.f40157c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i9);
        throw C0897l1.a(sb.toString(), null);
    }

    public final boolean j(int i9) {
        return !this.f40157c && (i9 < 12 || i9 > 14);
    }

    public final boolean k(int i9) {
        return i9 >= 0 && i9 <= 15 && (l(i9) || j(i9));
    }

    public final boolean l(int i9) {
        return this.f40157c && (i9 < 10 || i9 > 13);
    }

    public final void n() {
        if (this.f40169o) {
            return;
        }
        this.f40169o = true;
        boolean z9 = this.f40157c;
        this.f40167m.d(new C0936z0.b().g0(z9 ? "audio/amr-wb" : "audio/3gpp").Y(f40154u).J(1).h0(z9 ? 16000 : 8000).G());
    }

    public final void o(long j9, int i9) {
        g bVar;
        int i10;
        if (this.f40161g) {
            return;
        }
        int i11 = this.f40156b;
        if ((i11 & 1) == 0 || j9 == -1 || !((i10 = this.f40163i) == -1 || i10 == this.f40159e)) {
            bVar = new g.b(-9223372036854775807L);
        } else if (this.f40164j < 20 && i9 != -1) {
            return;
        } else {
            bVar = g(j9, (i11 & 2) != 0);
        }
        this.f40168n = bVar;
        this.f40166l.n(bVar);
        this.f40161g = true;
    }

    public final int q(InterfaceC1673j interfaceC1673j) throws C0897l1 {
        interfaceC1673j.f();
        interfaceC1673j.s(this.f40155a, 0, 1);
        byte b9 = this.f40155a[0];
        if ((b9 & 131) <= 0) {
            return i((b9 >> 3) & 15);
        }
        throw C0897l1.a("Invalid padding bits for frame header " + ((int) b9), null);
    }

    public final boolean r(InterfaceC1673j interfaceC1673j) {
        int length;
        byte[] bArr = f40152s;
        if (p(interfaceC1673j, bArr)) {
            this.f40157c = false;
            length = bArr.length;
        } else {
            byte[] bArr2 = f40153t;
            if (!p(interfaceC1673j, bArr2)) {
                return false;
            }
            this.f40157c = true;
            length = bArr2.length;
        }
        interfaceC1673j.q(length);
        return true;
    }

    @Override // d3.InterfaceC1672i
    public void release() {
    }

    public final int s(InterfaceC1673j interfaceC1673j) throws C0897l1 {
        if (this.f40160f == 0) {
            try {
                int iQ = q(interfaceC1673j);
                this.f40159e = iQ;
                this.f40160f = iQ;
                if (this.f40163i == -1) {
                    this.f40162h = interfaceC1673j.getPosition();
                    this.f40163i = this.f40159e;
                }
                if (this.f40163i == this.f40159e) {
                    this.f40164j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iA = this.f40167m.a(interfaceC1673j, this.f40160f, true);
        if (iA == -1) {
            return -1;
        }
        int i9 = this.f40160f - iA;
        this.f40160f = i9;
        if (i9 > 0) {
            return 0;
        }
        this.f40167m.f(this.f40165k + this.f40158d, 1, this.f40159e, 0, null);
        this.f40158d += 20000;
        return 0;
    }
}
