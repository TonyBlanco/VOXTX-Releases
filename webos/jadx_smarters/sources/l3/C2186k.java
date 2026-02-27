package l3;

import O2.C0897l1;
import O2.C0936z0;
import Q2.AbstractC1017c;
import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.extractor.g;
import d3.AbstractC1677n;
import d3.InterfaceC1672i;
import d3.InterfaceC1673j;
import d3.InterfaceC1674k;
import d3.InterfaceC1678o;
import d3.t;
import d3.w;
import d3.x;
import d4.AbstractC1684a;
import d4.G;
import d4.M;
import d4.k0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l3.AbstractC2176a;
import l3.AbstractC2177b;
import q3.C2540a;
import r5.InterfaceC2677f;
import w3.C2908b;

/* JADX INFO: renamed from: l3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2186k implements InterfaceC1672i, com.google.android.exoplayer2.extractor.g {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final InterfaceC1678o f43989y = new InterfaceC1678o() { // from class: l3.j
        @Override // d3.InterfaceC1678o
        public /* synthetic */ InterfaceC1672i[] a(Uri uri, Map map) {
            return AbstractC1677n.a(this, uri, map);
        }

        @Override // d3.InterfaceC1678o
        public final InterfaceC1672i[] b() {
            return C2186k.s();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f43991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f43992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M f43993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M f43994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f43995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2188m f43996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f43997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f43998i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f43999j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f44000k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f44001l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public M f44002m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f44003n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f44004o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f44005p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f44006q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InterfaceC1674k f44007r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a[] f44008s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long[][] f44009t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f44010u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f44011v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f44012w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C2908b f44013x;

    /* JADX INFO: renamed from: l3.k$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2190o f44014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r f44015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final w f44016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final x f44017d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f44018e;

        public a(C2190o c2190o, r rVar, w wVar) {
            this.f44014a = c2190o;
            this.f44015b = rVar;
            this.f44016c = wVar;
            this.f44017d = "audio/true-hd".equals(c2190o.f44036f.f6467m) ? new x() : null;
        }
    }

    public C2186k() {
        this(0);
    }

    public C2186k(int i9) {
        this.f43990a = i9;
        this.f43998i = (i9 & 4) != 0 ? 3 : 0;
        this.f43996g = new C2188m();
        this.f43997h = new ArrayList();
        this.f43994e = new M(16);
        this.f43995f = new ArrayDeque();
        this.f43991b = new M(G.f39651a);
        this.f43992c = new M(4);
        this.f43993d = new M();
        this.f44003n = -1;
        this.f44007r = InterfaceC1674k.f39600c0;
        this.f44008s = new a[0];
    }

    public static boolean E(int i9) {
        return i9 == 1836019574 || i9 == 1953653099 || i9 == 1835297121 || i9 == 1835626086 || i9 == 1937007212 || i9 == 1701082227 || i9 == 1835365473;
    }

    public static boolean F(int i9) {
        return i9 == 1835296868 || i9 == 1836476516 || i9 == 1751411826 || i9 == 1937011556 || i9 == 1937011827 || i9 == 1937011571 || i9 == 1668576371 || i9 == 1701606260 || i9 == 1937011555 || i9 == 1937011578 || i9 == 1937013298 || i9 == 1937007471 || i9 == 1668232756 || i9 == 1953196132 || i9 == 1718909296 || i9 == 1969517665 || i9 == 1801812339 || i9 == 1768715124;
    }

    public static int l(int i9) {
        if (i9 != 1751476579) {
            return i9 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    public static long[][] m(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i9 = 0; i9 < aVarArr.length; i9++) {
            jArr[i9] = new long[aVarArr[i9].f44015b.f44066b];
            jArr2[i9] = aVarArr[i9].f44015b.f44070f[0];
        }
        long j9 = 0;
        int i10 = 0;
        while (i10 < aVarArr.length) {
            long j10 = Long.MAX_VALUE;
            int i11 = -1;
            for (int i12 = 0; i12 < aVarArr.length; i12++) {
                if (!zArr[i12]) {
                    long j11 = jArr2[i12];
                    if (j11 <= j10) {
                        i11 = i12;
                        j10 = j11;
                    }
                }
            }
            int i13 = iArr[i11];
            long[] jArr3 = jArr[i11];
            jArr3[i13] = j9;
            r rVar = aVarArr[i11].f44015b;
            j9 += (long) rVar.f44068d[i13];
            int i14 = i13 + 1;
            iArr[i11] = i14;
            if (i14 < jArr3.length) {
                jArr2[i11] = rVar.f44070f[i14];
            } else {
                zArr[i11] = true;
                i10++;
            }
        }
        return jArr;
    }

    public static int p(r rVar, long j9) {
        int iA = rVar.a(j9);
        return iA == -1 ? rVar.b(j9) : iA;
    }

    public static /* synthetic */ C2190o r(C2190o c2190o) {
        return c2190o;
    }

    public static /* synthetic */ InterfaceC1672i[] s() {
        return new InterfaceC1672i[]{new C2186k()};
    }

    public static long t(r rVar, long j9, long j10) {
        int iP = p(rVar, j9);
        return iP == -1 ? j10 : Math.min(rVar.f44067c[iP], j10);
    }

    public static int x(M m9) {
        m9.U(8);
        int iL = l(m9.q());
        if (iL != 0) {
            return iL;
        }
        m9.V(4);
        while (m9.a() > 0) {
            int iL2 = l(m9.q());
            if (iL2 != 0) {
                return iL2;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A(d3.InterfaceC1673j r9) throws O2.C0897l1 {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.C2186k.A(d3.j):boolean");
    }

    public final boolean B(InterfaceC1673j interfaceC1673j, t tVar) {
        boolean z9;
        long j9 = this.f44000k - ((long) this.f44001l);
        long position = interfaceC1673j.getPosition() + j9;
        M m9 = this.f44002m;
        if (m9 != null) {
            interfaceC1673j.m(m9.e(), this.f44001l, (int) j9);
            if (this.f43999j == 1718909296) {
                this.f44012w = x(m9);
            } else if (!this.f43995f.isEmpty()) {
                ((AbstractC2176a.C0372a) this.f43995f.peek()).e(new AbstractC2176a.b(this.f43999j, m9));
            }
        } else {
            if (j9 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                tVar.f39608a = interfaceC1673j.getPosition() + j9;
                z9 = true;
                v(position);
                return (z9 || this.f43998i == 2) ? false : true;
            }
            interfaceC1673j.q((int) j9);
        }
        z9 = false;
        v(position);
        if (z9) {
        }
    }

    public final int C(InterfaceC1673j interfaceC1673j, t tVar) throws C0897l1 {
        int i9;
        t tVar2;
        long position = interfaceC1673j.getPosition();
        if (this.f44003n == -1) {
            int iQ = q(position);
            this.f44003n = iQ;
            if (iQ == -1) {
                return -1;
            }
        }
        a aVar = this.f44008s[this.f44003n];
        w wVar = aVar.f44016c;
        int i10 = aVar.f44018e;
        r rVar = aVar.f44015b;
        long j9 = rVar.f44067c[i10];
        int i11 = rVar.f44068d[i10];
        x xVar = aVar.f44017d;
        long j10 = (j9 - position) + ((long) this.f44004o);
        if (j10 < 0) {
            i9 = 1;
            tVar2 = tVar;
        } else {
            if (j10 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                if (aVar.f44014a.f44037g == 1) {
                    j10 += 8;
                    i11 -= 8;
                }
                interfaceC1673j.q((int) j10);
                C2190o c2190o = aVar.f44014a;
                if (c2190o.f44040j == 0) {
                    if ("audio/ac4".equals(c2190o.f44036f.f6467m)) {
                        if (this.f44005p == 0) {
                            AbstractC1017c.a(i11, this.f43993d);
                            wVar.b(this.f43993d, 7);
                            this.f44005p += 7;
                        }
                        i11 += 7;
                    } else if (xVar != null) {
                        xVar.d(interfaceC1673j);
                    }
                    while (true) {
                        int i12 = this.f44005p;
                        if (i12 >= i11) {
                            break;
                        }
                        int iA = wVar.a(interfaceC1673j, i11 - i12, false);
                        this.f44004o += iA;
                        this.f44005p += iA;
                        this.f44006q -= iA;
                    }
                } else {
                    byte[] bArrE = this.f43992c.e();
                    bArrE[0] = 0;
                    bArrE[1] = 0;
                    bArrE[2] = 0;
                    int i13 = aVar.f44014a.f44040j;
                    int i14 = 4 - i13;
                    while (this.f44005p < i11) {
                        int i15 = this.f44006q;
                        if (i15 == 0) {
                            interfaceC1673j.m(bArrE, i14, i13);
                            this.f44004o += i13;
                            this.f43992c.U(0);
                            int iQ2 = this.f43992c.q();
                            if (iQ2 < 0) {
                                throw C0897l1.a("Invalid NAL length", null);
                            }
                            this.f44006q = iQ2;
                            this.f43991b.U(0);
                            wVar.b(this.f43991b, 4);
                            this.f44005p += 4;
                            i11 += i14;
                        } else {
                            int iA2 = wVar.a(interfaceC1673j, i15, false);
                            this.f44004o += iA2;
                            this.f44005p += iA2;
                            this.f44006q -= iA2;
                        }
                    }
                }
                int i16 = i11;
                r rVar2 = aVar.f44015b;
                long j11 = rVar2.f44070f[i10];
                int i17 = rVar2.f44071g[i10];
                if (xVar != null) {
                    xVar.c(wVar, j11, i17, i16, 0, null);
                    if (i10 + 1 == aVar.f44015b.f44066b) {
                        xVar.a(wVar, null);
                    }
                } else {
                    wVar.f(j11, i17, i16, 0, null);
                }
                aVar.f44018e++;
                this.f44003n = -1;
                this.f44004o = 0;
                this.f44005p = 0;
                this.f44006q = 0;
                return 0;
            }
            tVar2 = tVar;
            i9 = 1;
        }
        tVar2.f39608a = j9;
        return i9;
    }

    public final int D(InterfaceC1673j interfaceC1673j, t tVar) throws C0897l1 {
        int iC = this.f43996g.c(interfaceC1673j, tVar, this.f43997h);
        if (iC == 1 && tVar.f39608a == 0) {
            n();
        }
        return iC;
    }

    public final void G(a aVar, long j9) {
        r rVar = aVar.f44015b;
        int iA = rVar.a(j9);
        if (iA == -1) {
            iA = rVar.b(j9);
        }
        aVar.f44018e = iA;
    }

    @Override // d3.InterfaceC1672i
    public void a(long j9, long j10) {
        this.f43995f.clear();
        this.f44001l = 0;
        this.f44003n = -1;
        this.f44004o = 0;
        this.f44005p = 0;
        this.f44006q = 0;
        if (j9 == 0) {
            if (this.f43998i != 3) {
                n();
                return;
            } else {
                this.f43996g.g();
                this.f43997h.clear();
                return;
            }
        }
        for (a aVar : this.f44008s) {
            G(aVar, j10);
            x xVar = aVar.f44017d;
            if (xVar != null) {
                xVar.b();
            }
        }
    }

    @Override // d3.InterfaceC1672i
    public void b(InterfaceC1674k interfaceC1674k) {
        this.f44007r = interfaceC1674k;
    }

    @Override // d3.InterfaceC1672i
    public int d(InterfaceC1673j interfaceC1673j, t tVar) {
        while (true) {
            int i9 = this.f43998i;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2) {
                        return C(interfaceC1673j, tVar);
                    }
                    if (i9 == 3) {
                        return D(interfaceC1673j, tVar);
                    }
                    throw new IllegalStateException();
                }
                if (B(interfaceC1673j, tVar)) {
                    return 1;
                }
            } else if (!A(interfaceC1673j)) {
                return -1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public g.a e(long j9) {
        return o(j9, -1);
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public boolean g() {
        return true;
    }

    @Override // d3.InterfaceC1672i
    public boolean h(InterfaceC1673j interfaceC1673j) {
        return AbstractC2189n.d(interfaceC1673j, (this.f43990a & 2) != 0);
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public long i() {
        return this.f44011v;
    }

    public final void n() {
        this.f43998i = 0;
        this.f44001l = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.exoplayer2.extractor.g.a o(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            l3.k$a[] r4 = r0.f44008s
            int r5 = r4.length
            if (r5 != 0) goto L13
            com.google.android.exoplayer2.extractor.g$a r1 = new com.google.android.exoplayer2.extractor.g$a
            d3.u r2 = d3.u.f39609c
            r1.<init>(r2)
            return r1
        L13:
            r5 = -1
            if (r3 == r5) goto L18
            r6 = r3
            goto L1a
        L18:
            int r6 = r0.f44010u
        L1a:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -1
            if (r6 == r5) goto L58
            r4 = r4[r6]
            l3.r r4 = r4.f44015b
            int r6 = p(r4, r1)
            if (r6 != r5) goto L35
            com.google.android.exoplayer2.extractor.g$a r1 = new com.google.android.exoplayer2.extractor.g$a
            d3.u r2 = d3.u.f39609c
            r1.<init>(r2)
            return r1
        L35:
            long[] r11 = r4.f44070f
            r12 = r11[r6]
            long[] r11 = r4.f44067c
            r14 = r11[r6]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L5e
            int r11 = r4.f44066b
            int r11 = r11 + (-1)
            if (r6 >= r11) goto L5e
            int r1 = r4.b(r1)
            if (r1 == r5) goto L5e
            if (r1 == r6) goto L5e
            long[] r2 = r4.f44070f
            r9 = r2[r1]
            long[] r2 = r4.f44067c
            r1 = r2[r1]
            goto L60
        L58:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r1
        L5e:
            r1 = r9
            r9 = r7
        L60:
            if (r3 != r5) goto L80
            r3 = 0
        L63:
            l3.k$a[] r4 = r0.f44008s
            int r5 = r4.length
            if (r3 >= r5) goto L80
            int r5 = r0.f44010u
            if (r3 == r5) goto L7d
            r4 = r4[r3]
            l3.r r4 = r4.f44015b
            long r5 = t(r4, r12, r14)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L7c
            long r1 = t(r4, r9, r1)
        L7c:
            r14 = r5
        L7d:
            int r3 = r3 + 1
            goto L63
        L80:
            d3.u r3 = new d3.u
            r3.<init>(r12, r14)
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 != 0) goto L8f
            com.google.android.exoplayer2.extractor.g$a r1 = new com.google.android.exoplayer2.extractor.g$a
            r1.<init>(r3)
            return r1
        L8f:
            d3.u r4 = new d3.u
            r4.<init>(r9, r1)
            com.google.android.exoplayer2.extractor.g$a r1 = new com.google.android.exoplayer2.extractor.g$a
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.C2186k.o(long, int):com.google.android.exoplayer2.extractor.g$a");
    }

    public final int q(long j9) {
        int i9 = -1;
        int i10 = -1;
        int i11 = 0;
        long j10 = Long.MAX_VALUE;
        boolean z9 = true;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.f44008s;
            if (i11 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i11];
            int i12 = aVar.f44018e;
            r rVar = aVar.f44015b;
            if (i12 != rVar.f44066b) {
                long j13 = rVar.f44067c[i12];
                long j14 = ((long[][]) k0.j(this.f44009t))[i11][i12];
                long j15 = j13 - j9;
                boolean z11 = j15 < 0 || j15 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                if ((!z11 && z10) || (z11 == z10 && j15 < j12)) {
                    z10 = z11;
                    j12 = j15;
                    i10 = i11;
                    j11 = j14;
                }
                if (j14 < j10) {
                    z9 = z11;
                    i9 = i11;
                    j10 = j14;
                }
            }
            i11++;
        }
        return (j10 == Long.MAX_VALUE || !z9 || j11 < j10 + 10485760) ? i10 : i9;
    }

    @Override // d3.InterfaceC1672i
    public void release() {
    }

    public final void u(InterfaceC1673j interfaceC1673j) {
        this.f43993d.Q(8);
        interfaceC1673j.s(this.f43993d.e(), 0, 8);
        AbstractC2177b.e(this.f43993d);
        interfaceC1673j.q(this.f43993d.f());
        interfaceC1673j.f();
    }

    public final void v(long j9) {
        while (!this.f43995f.isEmpty() && ((AbstractC2176a.C0372a) this.f43995f.peek()).f43887b == j9) {
            AbstractC2176a.C0372a c0372a = (AbstractC2176a.C0372a) this.f43995f.pop();
            if (c0372a.f43886a == 1836019574) {
                y(c0372a);
                this.f43995f.clear();
                this.f43998i = 2;
            } else if (!this.f43995f.isEmpty()) {
                ((AbstractC2176a.C0372a) this.f43995f.peek()).d(c0372a);
            }
        }
        if (this.f43998i != 2) {
            n();
        }
    }

    public final void w() {
        if (this.f44012w != 2 || (this.f43990a & 2) == 0) {
            return;
        }
        this.f44007r.e(0, 4).d(new C0936z0.b().Z(this.f44013x == null ? null : new C2540a(this.f44013x)).G());
        this.f44007r.q();
        this.f44007r.n(new g.b(-9223372036854775807L));
    }

    public final void y(AbstractC2176a.C0372a c0372a) {
        C2540a c2540a;
        C2540a c2540a2;
        C2540a c2540a3;
        List list;
        int i9;
        C2540a c2540a4;
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2 = new ArrayList();
        boolean z9 = this.f44012w == 1;
        d3.r rVar = new d3.r();
        AbstractC2176a.b bVarG = c0372a.g(1969517665);
        if (bVarG != null) {
            AbstractC2177b.i iVarB = AbstractC2177b.B(bVarG);
            C2540a c2540a5 = iVarB.f43922a;
            C2540a c2540a6 = iVarB.f43923b;
            C2540a c2540a7 = iVarB.f43924c;
            if (c2540a5 != null) {
                rVar.c(c2540a5);
            }
            c2540a2 = c2540a7;
            c2540a = c2540a5;
            c2540a3 = c2540a6;
        } else {
            c2540a = null;
            c2540a2 = null;
            c2540a3 = null;
        }
        AbstractC2176a.C0372a c0372aF = c0372a.f(1835365473);
        C2540a c2540aN = c0372aF != null ? AbstractC2177b.n(c0372aF) : null;
        C2540a c2540a8 = AbstractC2177b.p(((AbstractC2176a.b) AbstractC1684a.e(c0372a.g(1836476516))).f43890b).f43905a;
        C2540a c2540a9 = c2540aN;
        C2540a c2540a10 = c2540a;
        List listA = AbstractC2177b.A(c0372a, rVar, -9223372036854775807L, null, (this.f43990a & 1) != 0, z9, new InterfaceC2677f() { // from class: l3.i
            @Override // r5.InterfaceC2677f
            public final Object apply(Object obj) {
                return C2186k.r((C2190o) obj);
            }
        });
        int size = listA.size();
        long j9 = -9223372036854775807L;
        long jMax = -9223372036854775807L;
        int i11 = 0;
        int size2 = -1;
        while (i11 < size) {
            r rVar2 = (r) listA.get(i11);
            if (rVar2.f44066b == 0) {
                list = listA;
                i9 = size;
                arrayList = arrayList2;
                c2540a4 = c2540a10;
            } else {
                C2190o c2190o = rVar2.f44065a;
                ArrayList arrayList3 = arrayList2;
                long j10 = c2190o.f44035e;
                if (j10 == j9) {
                    j10 = rVar2.f44072h;
                }
                jMax = Math.max(jMax, j10);
                list = listA;
                a aVar = new a(c2190o, rVar2, this.f44007r.e(i11, c2190o.f44032b));
                int i12 = "audio/true-hd".equals(c2190o.f44036f.f6467m) ? rVar2.f44069e * 16 : rVar2.f44069e + 30;
                C0936z0.b bVarB = c2190o.f44036f.b();
                bVarB.Y(i12);
                i9 = size;
                if (c2190o.f44032b == 2 && j10 > 0 && (i10 = rVar2.f44066b) > 1) {
                    bVarB.R(i10 / (j10 / 1000000.0f));
                }
                AbstractC2183h.k(c2190o.f44032b, rVar, bVarB);
                c2540a4 = c2540a10;
                AbstractC2183h.l(c2190o.f44032b, c2540a4, c2540a9, bVarB, c2540a3, this.f43997h.isEmpty() ? null : new C2540a(this.f43997h), c2540a2, c2540a8);
                aVar.f44016c.d(bVarB.G());
                if (c2190o.f44032b == 2 && size2 == -1) {
                    size2 = arrayList3.size();
                }
                arrayList = arrayList3;
                arrayList.add(aVar);
            }
            i11++;
            c2540a10 = c2540a4;
            listA = list;
            size = i9;
            j9 = -9223372036854775807L;
            arrayList2 = arrayList;
        }
        this.f44010u = size2;
        this.f44011v = jMax;
        a[] aVarArr = (a[]) arrayList2.toArray(new a[0]);
        this.f44008s = aVarArr;
        this.f44009t = m(aVarArr);
        this.f44007r.q();
        this.f44007r.n(this);
    }

    public final void z(long j9) {
        if (this.f43999j == 1836086884) {
            int i9 = this.f44001l;
            this.f44013x = new C2908b(0L, j9, -9223372036854775807L, j9 + ((long) i9), this.f44000k - ((long) i9));
        }
    }
}
