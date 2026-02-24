package l3;

import O2.C0897l1;
import O2.C0936z0;
import Q2.AbstractC1017c;
import V2.C1056m;
import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.gms.common.api.a;
import d3.AbstractC1665b;
import d3.AbstractC1677n;
import d3.InterfaceC1672i;
import d3.InterfaceC1673j;
import d3.InterfaceC1674k;
import d3.InterfaceC1678o;
import d3.t;
import d3.w;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.G;
import d4.M;
import d4.Z;
import d4.k0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import l3.AbstractC2176a;
import r5.InterfaceC2677f;
import s3.C2707a;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: l3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2182g implements InterfaceC1672i {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final InterfaceC1678o f43936I = new InterfaceC1678o() { // from class: l3.e
        @Override // d3.InterfaceC1678o
        public /* synthetic */ InterfaceC1672i[] a(Uri uri, Map map) {
            return AbstractC1677n.a(this, uri, map);
        }

        @Override // d3.InterfaceC1678o
        public final InterfaceC1672i[] b() {
            return C2182g.m();
        }
    };

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final byte[] f43937J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final C0936z0 f43938K = new C0936z0.b().g0("application/x-emsg").G();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f43939A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f43940B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f43941C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f43942D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public InterfaceC1674k f43943E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public w[] f43944F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public w[] f43945G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f43946H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2190o f43948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f43949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f43950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M f43951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M f43952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final M f43953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f43954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final M f43955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Z f43956j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s3.c f43957k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final M f43958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayDeque f43959m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayDeque f43960n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w f43961o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f43962p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f43963q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f43964r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f43965s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public M f43966t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f43967u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f43968v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f43969w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f43970x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f43971y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b f43972z;

    /* JADX INFO: renamed from: l3.g$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f43973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f43974b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f43975c;

        public a(long j9, boolean z9, int i9) {
            this.f43973a = j9;
            this.f43974b = z9;
            this.f43975c = i9;
        }
    }

    /* JADX INFO: renamed from: l3.g$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w f43976a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public r f43979d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C2178c f43980e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f43981f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f43982g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f43983h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f43984i;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f43987l;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q f43977b = new q();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final M f43978c = new M();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final M f43985j = new M(1);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final M f43986k = new M();

        public b(w wVar, r rVar, C2178c c2178c) {
            this.f43976a = wVar;
            this.f43979d = rVar;
            this.f43980e = c2178c;
            j(rVar, c2178c);
        }

        public int c() {
            int i9 = !this.f43987l ? this.f43979d.f44071g[this.f43981f] : this.f43977b.f44057k[this.f43981f] ? 1 : 0;
            return g() != null ? i9 | 1073741824 : i9;
        }

        public long d() {
            return !this.f43987l ? this.f43979d.f44067c[this.f43981f] : this.f43977b.f44053g[this.f43983h];
        }

        public long e() {
            return !this.f43987l ? this.f43979d.f44070f[this.f43981f] : this.f43977b.c(this.f43981f);
        }

        public int f() {
            return !this.f43987l ? this.f43979d.f44068d[this.f43981f] : this.f43977b.f44055i[this.f43981f];
        }

        public p g() {
            if (!this.f43987l) {
                return null;
            }
            int i9 = ((C2178c) k0.j(this.f43977b.f44047a)).f43925a;
            p pVarA = this.f43977b.f44060n;
            if (pVarA == null) {
                pVarA = this.f43979d.f44065a.a(i9);
            }
            if (pVarA == null || !pVarA.f44042a) {
                return null;
            }
            return pVarA;
        }

        public boolean h() {
            this.f43981f++;
            if (!this.f43987l) {
                return false;
            }
            int i9 = this.f43982g + 1;
            this.f43982g = i9;
            int[] iArr = this.f43977b.f44054h;
            int i10 = this.f43983h;
            if (i9 != iArr[i10]) {
                return true;
            }
            this.f43983h = i10 + 1;
            this.f43982g = 0;
            return false;
        }

        public int i(int i9, int i10) {
            M m9;
            p pVarG = g();
            if (pVarG == null) {
                return 0;
            }
            int length = pVarG.f44045d;
            if (length != 0) {
                m9 = this.f43977b.f44061o;
            } else {
                byte[] bArr = (byte[]) k0.j(pVarG.f44046e);
                this.f43986k.S(bArr, bArr.length);
                M m10 = this.f43986k;
                length = bArr.length;
                m9 = m10;
            }
            boolean zG = this.f43977b.g(this.f43981f);
            boolean z9 = zG || i10 != 0;
            this.f43985j.e()[0] = (byte) ((z9 ? 128 : 0) | length);
            this.f43985j.U(0);
            this.f43976a.c(this.f43985j, 1, 1);
            this.f43976a.c(m9, length, 1);
            if (!z9) {
                return length + 1;
            }
            if (!zG) {
                this.f43978c.Q(8);
                byte[] bArrE = this.f43978c.e();
                bArrE[0] = 0;
                bArrE[1] = 1;
                bArrE[2] = (byte) ((i10 >> 8) & 255);
                bArrE[3] = (byte) (i10 & 255);
                bArrE[4] = (byte) ((i9 >> 24) & 255);
                bArrE[5] = (byte) ((i9 >> 16) & 255);
                bArrE[6] = (byte) ((i9 >> 8) & 255);
                bArrE[7] = (byte) (i9 & 255);
                this.f43976a.c(this.f43978c, 8, 1);
                return length + 9;
            }
            M m11 = this.f43977b.f44061o;
            int iN = m11.N();
            m11.V(-2);
            int i11 = (iN * 6) + 2;
            if (i10 != 0) {
                this.f43978c.Q(i11);
                byte[] bArrE2 = this.f43978c.e();
                m11.l(bArrE2, 0, i11);
                int i12 = (((bArrE2[2] & 255) << 8) | (bArrE2[3] & 255)) + i10;
                bArrE2[2] = (byte) ((i12 >> 8) & 255);
                bArrE2[3] = (byte) (i12 & 255);
                m11 = this.f43978c;
            }
            this.f43976a.c(m11, i11, 1);
            return length + 1 + i11;
        }

        public void j(r rVar, C2178c c2178c) {
            this.f43979d = rVar;
            this.f43980e = c2178c;
            this.f43976a.d(rVar.f44065a.f44036f);
            k();
        }

        public void k() {
            this.f43977b.f();
            this.f43981f = 0;
            this.f43983h = 0;
            this.f43982g = 0;
            this.f43984i = 0;
            this.f43987l = false;
        }

        public void l(long j9) {
            int i9 = this.f43981f;
            while (true) {
                q qVar = this.f43977b;
                if (i9 >= qVar.f44052f || qVar.c(i9) > j9) {
                    return;
                }
                if (this.f43977b.f44057k[i9]) {
                    this.f43984i = i9;
                }
                i9++;
            }
        }

        public void m() {
            p pVarG = g();
            if (pVarG == null) {
                return;
            }
            M m9 = this.f43977b.f44061o;
            int i9 = pVarG.f44045d;
            if (i9 != 0) {
                m9.V(i9);
            }
            if (this.f43977b.g(this.f43981f)) {
                m9.V(m9.N() * 6);
            }
        }

        public void n(C1056m c1056m) {
            p pVarA = this.f43979d.f44065a.a(((C2178c) k0.j(this.f43977b.f44047a)).f43925a);
            this.f43976a.d(this.f43979d.f44065a.f44036f.b().O(c1056m.d(pVarA != null ? pVarA.f44043b : null)).G());
        }
    }

    public C2182g() {
        this(0);
    }

    public C2182g(int i9) {
        this(i9, null);
    }

    public C2182g(int i9, Z z9) {
        this(i9, z9, null, Collections.emptyList());
    }

    public C2182g(int i9, Z z9, C2190o c2190o) {
        this(i9, z9, c2190o, Collections.emptyList());
    }

    public C2182g(int i9, Z z9, C2190o c2190o, List list) {
        this(i9, z9, c2190o, list, null);
    }

    public C2182g(int i9, Z z9, C2190o c2190o, List list, w wVar) {
        this.f43947a = i9;
        this.f43956j = z9;
        this.f43948b = c2190o;
        this.f43949c = Collections.unmodifiableList(list);
        this.f43961o = wVar;
        this.f43957k = new s3.c();
        this.f43958l = new M(16);
        this.f43951e = new M(G.f39651a);
        this.f43952f = new M(5);
        this.f43953g = new M();
        byte[] bArr = new byte[16];
        this.f43954h = bArr;
        this.f43955i = new M(bArr);
        this.f43959m = new ArrayDeque();
        this.f43960n = new ArrayDeque();
        this.f43950d = new SparseArray();
        this.f43970x = -9223372036854775807L;
        this.f43969w = -9223372036854775807L;
        this.f43971y = -9223372036854775807L;
        this.f43943E = InterfaceC1674k.f39600c0;
        this.f43944F = new w[0];
        this.f43945G = new w[0];
    }

    public static void A(M m9, q qVar) throws C0897l1 {
        z(m9, 0, qVar);
    }

    public static Pair B(M m9, long j9) throws C0897l1 {
        long jM;
        long jM2;
        m9.U(8);
        int iC = AbstractC2176a.c(m9.q());
        m9.V(4);
        long J9 = m9.J();
        if (iC == 0) {
            jM = m9.J();
            jM2 = m9.J();
        } else {
            jM = m9.M();
            jM2 = m9.M();
        }
        long j10 = jM;
        long j11 = j9 + jM2;
        long jC1 = k0.c1(j10, 1000000L, J9);
        m9.V(2);
        int iN = m9.N();
        int[] iArr = new int[iN];
        long[] jArr = new long[iN];
        long[] jArr2 = new long[iN];
        long[] jArr3 = new long[iN];
        long j12 = j10;
        long j13 = jC1;
        int i9 = 0;
        while (i9 < iN) {
            int iQ = m9.q();
            if ((iQ & Integer.MIN_VALUE) != 0) {
                throw C0897l1.a("Unhandled indirect reference", null);
            }
            long J10 = m9.J();
            iArr[i9] = iQ & a.e.API_PRIORITY_OTHER;
            jArr[i9] = j11;
            jArr3[i9] = j13;
            long j14 = j12 + J10;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i10 = iN;
            int[] iArr2 = iArr;
            long jC12 = k0.c1(j14, 1000000L, J9);
            jArr4[i9] = jC12 - jArr5[i9];
            m9.V(4);
            j11 += (long) iArr2[i9];
            i9++;
            iArr = iArr2;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            iN = i10;
            j12 = j14;
            j13 = jC12;
        }
        return Pair.create(Long.valueOf(jC1), new com.google.android.exoplayer2.extractor.b(iArr, jArr, jArr2, jArr3));
    }

    public static long C(M m9) {
        m9.U(8);
        return AbstractC2176a.c(m9.q()) == 1 ? m9.M() : m9.J();
    }

    public static b D(M m9, SparseArray sparseArray, boolean z9) {
        m9.U(8);
        int iB = AbstractC2176a.b(m9.q());
        b bVar = (b) (z9 ? sparseArray.valueAt(0) : sparseArray.get(m9.q()));
        if (bVar == null) {
            return null;
        }
        if ((iB & 1) != 0) {
            long jM = m9.M();
            q qVar = bVar.f43977b;
            qVar.f44049c = jM;
            qVar.f44050d = jM;
        }
        C2178c c2178c = bVar.f43980e;
        bVar.f43977b.f44047a = new C2178c((iB & 2) != 0 ? m9.q() - 1 : c2178c.f43925a, (iB & 8) != 0 ? m9.q() : c2178c.f43926b, (iB & 16) != 0 ? m9.q() : c2178c.f43927c, (iB & 32) != 0 ? m9.q() : c2178c.f43928d);
        return bVar;
    }

    public static void E(AbstractC2176a.C0372a c0372a, SparseArray sparseArray, boolean z9, int i9, byte[] bArr) throws C0897l1 {
        b bVarD = D(((AbstractC2176a.b) AbstractC1684a.e(c0372a.g(1952868452))).f43890b, sparseArray, z9);
        if (bVarD == null) {
            return;
        }
        q qVar = bVarD.f43977b;
        long j9 = qVar.f44063q;
        boolean z10 = qVar.f44064r;
        bVarD.k();
        bVarD.f43987l = true;
        AbstractC2176a.b bVarG = c0372a.g(1952867444);
        if (bVarG == null || (i9 & 2) != 0) {
            qVar.f44063q = j9;
            qVar.f44064r = z10;
        } else {
            qVar.f44063q = C(bVarG.f43890b);
            qVar.f44064r = true;
        }
        H(c0372a, bVarD, i9);
        p pVarA = bVarD.f43979d.f44065a.a(((C2178c) AbstractC1684a.e(qVar.f44047a)).f43925a);
        AbstractC2176a.b bVarG2 = c0372a.g(1935763834);
        if (bVarG2 != null) {
            x((p) AbstractC1684a.e(pVarA), bVarG2.f43890b, qVar);
        }
        AbstractC2176a.b bVarG3 = c0372a.g(1935763823);
        if (bVarG3 != null) {
            w(bVarG3.f43890b, qVar);
        }
        AbstractC2176a.b bVarG4 = c0372a.g(1936027235);
        if (bVarG4 != null) {
            A(bVarG4.f43890b, qVar);
        }
        y(c0372a, pVarA != null ? pVarA.f44043b : null, qVar);
        int size = c0372a.f43888c.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC2176a.b bVar = (AbstractC2176a.b) c0372a.f43888c.get(i10);
            if (bVar.f43886a == 1970628964) {
                I(bVar.f43890b, qVar, bArr);
            }
        }
    }

    public static Pair F(M m9) {
        m9.U(12);
        return Pair.create(Integer.valueOf(m9.q()), new C2178c(m9.q() - 1, m9.q(), m9.q(), m9.q()));
    }

    public static int G(b bVar, int i9, int i10, M m9, int i11) throws C0897l1 {
        boolean z9;
        int iQ;
        boolean z10;
        int iQ2;
        boolean z11;
        boolean z12;
        boolean z13;
        int iQ3;
        b bVar2 = bVar;
        m9.U(8);
        int iB = AbstractC2176a.b(m9.q());
        C2190o c2190o = bVar2.f43979d.f44065a;
        q qVar = bVar2.f43977b;
        C2178c c2178c = (C2178c) k0.j(qVar.f44047a);
        qVar.f44054h[i9] = m9.L();
        long[] jArr = qVar.f44053g;
        long j9 = qVar.f44049c;
        jArr[i9] = j9;
        if ((iB & 1) != 0) {
            jArr[i9] = j9 + ((long) m9.q());
        }
        boolean z14 = (iB & 4) != 0;
        int iQ4 = c2178c.f43928d;
        if (z14) {
            iQ4 = m9.q();
        }
        boolean z15 = (iB & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0;
        boolean z16 = (iB & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0;
        boolean z17 = (iB & 1024) != 0;
        boolean z18 = (iB & 2048) != 0;
        long j10 = l(c2190o) ? ((long[]) k0.j(c2190o.f44039i))[0] : 0L;
        int[] iArr = qVar.f44055i;
        long[] jArr2 = qVar.f44056j;
        boolean[] zArr = qVar.f44057k;
        int i12 = iQ4;
        boolean z19 = c2190o.f44032b == 2 && (i10 & 1) != 0;
        int i13 = i11 + qVar.f44054h[i9];
        boolean z20 = z19;
        long j11 = c2190o.f44033c;
        long j12 = qVar.f44063q;
        int i14 = i11;
        while (i14 < i13) {
            int iE = e(z15 ? m9.q() : c2178c.f43926b);
            if (z16) {
                iQ = m9.q();
                z9 = z15;
            } else {
                z9 = z15;
                iQ = c2178c.f43927c;
            }
            int iE2 = e(iQ);
            if (z17) {
                z10 = z14;
                iQ2 = m9.q();
            } else if (i14 == 0 && z14) {
                z10 = z14;
                iQ2 = i12;
            } else {
                z10 = z14;
                iQ2 = c2178c.f43928d;
            }
            if (z18) {
                z11 = z18;
                z12 = z16;
                z13 = z17;
                iQ3 = m9.q();
            } else {
                z11 = z18;
                z12 = z16;
                z13 = z17;
                iQ3 = 0;
            }
            long jC1 = k0.c1((((long) iQ3) + j12) - j10, 1000000L, j11);
            jArr2[i14] = jC1;
            if (!qVar.f44064r) {
                jArr2[i14] = jC1 + bVar2.f43979d.f44072h;
            }
            iArr[i14] = iE2;
            zArr[i14] = ((iQ2 >> 16) & 1) == 0 && (!z20 || i14 == 0);
            j12 += (long) iE;
            i14++;
            bVar2 = bVar;
            z15 = z9;
            z14 = z10;
            z18 = z11;
            z16 = z12;
            z17 = z13;
        }
        qVar.f44063q = j12;
        return i13;
    }

    public static void H(AbstractC2176a.C0372a c0372a, b bVar, int i9) throws C0897l1 {
        List list = c0372a.f43888c;
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC2176a.b bVar2 = (AbstractC2176a.b) list.get(i12);
            if (bVar2.f43886a == 1953658222) {
                M m9 = bVar2.f43890b;
                m9.U(12);
                int iL = m9.L();
                if (iL > 0) {
                    i11 += iL;
                    i10++;
                }
            }
        }
        bVar.f43983h = 0;
        bVar.f43982g = 0;
        bVar.f43981f = 0;
        bVar.f43977b.e(i10, i11);
        int i13 = 0;
        int iG = 0;
        for (int i14 = 0; i14 < size; i14++) {
            AbstractC2176a.b bVar3 = (AbstractC2176a.b) list.get(i14);
            if (bVar3.f43886a == 1953658222) {
                iG = G(bVar, i13, i9, bVar3.f43890b, iG);
                i13++;
            }
        }
    }

    public static void I(M m9, q qVar, byte[] bArr) throws C0897l1 {
        m9.U(8);
        m9.l(bArr, 0, 16);
        if (Arrays.equals(bArr, f43937J)) {
            z(m9, 16, qVar);
        }
    }

    private void J(long j9) throws C0897l1 {
        while (!this.f43959m.isEmpty() && ((AbstractC2176a.C0372a) this.f43959m.peek()).f43887b == j9) {
            o((AbstractC2176a.C0372a) this.f43959m.pop());
        }
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean K(d3.InterfaceC1673j r12) throws O2.C0897l1 {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.C2182g.K(d3.j):boolean");
    }

    private static boolean O(int i9) {
        return i9 == 1836019574 || i9 == 1953653099 || i9 == 1835297121 || i9 == 1835626086 || i9 == 1937007212 || i9 == 1836019558 || i9 == 1953653094 || i9 == 1836475768 || i9 == 1701082227;
    }

    private static boolean P(int i9) {
        return i9 == 1751411826 || i9 == 1835296868 || i9 == 1836476516 || i9 == 1936286840 || i9 == 1937011556 || i9 == 1937011827 || i9 == 1668576371 || i9 == 1937011555 || i9 == 1937011578 || i9 == 1937013298 || i9 == 1937007471 || i9 == 1668232756 || i9 == 1937011571 || i9 == 1952867444 || i9 == 1952868452 || i9 == 1953196132 || i9 == 1953654136 || i9 == 1953658222 || i9 == 1886614376 || i9 == 1935763834 || i9 == 1935763823 || i9 == 1936027235 || i9 == 1970628964 || i9 == 1935828848 || i9 == 1936158820 || i9 == 1701606260 || i9 == 1835362404 || i9 == 1701671783;
    }

    public static int e(int i9) throws C0897l1 {
        if (i9 >= 0) {
            return i9;
        }
        throw C0897l1.a("Unexpected negative value: " + i9, null);
    }

    private void f() {
        this.f43962p = 0;
        this.f43965s = 0;
    }

    public static C1056m i(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC2176a.b bVar = (AbstractC2176a.b) list.get(i9);
            if (bVar.f43886a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrE = bVar.f43890b.e();
                UUID uuidF = AbstractC2187l.f(bArrE);
                if (uuidF == null) {
                    AbstractC1681B.j("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C1056m.b(uuidF, "video/mp4", bArrE));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C1056m(arrayList);
    }

    public static b j(SparseArray sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j9 = Long.MAX_VALUE;
        for (int i9 = 0; i9 < size; i9++) {
            b bVar2 = (b) sparseArray.valueAt(i9);
            if ((bVar2.f43987l || bVar2.f43981f != bVar2.f43979d.f44066b) && (!bVar2.f43987l || bVar2.f43983h != bVar2.f43977b.f44051e)) {
                long jD = bVar2.d();
                if (jD < j9) {
                    bVar = bVar2;
                    j9 = jD;
                }
            }
        }
        return bVar;
    }

    public static boolean l(C2190o c2190o) {
        long[] jArr;
        long[] jArr2 = c2190o.f44038h;
        if (jArr2 == null || jArr2.length != 1 || (jArr = c2190o.f44039i) == null) {
            return false;
        }
        long j9 = jArr2[0];
        return j9 == 0 || k0.c1(j9 + jArr[0], 1000000L, c2190o.f44034d) >= c2190o.f44035e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC1672i[] m() {
        return new InterfaceC1672i[]{new C2182g()};
    }

    public static long u(M m9) {
        m9.U(8);
        return AbstractC2176a.c(m9.q()) == 0 ? m9.J() : m9.M();
    }

    public static void v(AbstractC2176a.C0372a c0372a, SparseArray sparseArray, boolean z9, int i9, byte[] bArr) throws C0897l1 {
        int size = c0372a.f43889d.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC2176a.C0372a c0372a2 = (AbstractC2176a.C0372a) c0372a.f43889d.get(i10);
            if (c0372a2.f43886a == 1953653094) {
                E(c0372a2, sparseArray, z9, i9, bArr);
            }
        }
    }

    public static void w(M m9, q qVar) throws C0897l1 {
        m9.U(8);
        int iQ = m9.q();
        if ((AbstractC2176a.b(iQ) & 1) == 1) {
            m9.V(8);
        }
        int iL = m9.L();
        if (iL == 1) {
            qVar.f44050d += AbstractC2176a.c(iQ) == 0 ? m9.J() : m9.M();
        } else {
            throw C0897l1.a("Unexpected saio entry count: " + iL, null);
        }
    }

    public static void x(p pVar, M m9, q qVar) throws C0897l1 {
        int i9;
        int i10 = pVar.f44045d;
        m9.U(8);
        if ((AbstractC2176a.b(m9.q()) & 1) == 1) {
            m9.V(8);
        }
        int iH = m9.H();
        int iL = m9.L();
        if (iL > qVar.f44052f) {
            throw C0897l1.a("Saiz sample count " + iL + " is greater than fragment sample count" + qVar.f44052f, null);
        }
        if (iH == 0) {
            boolean[] zArr = qVar.f44059m;
            i9 = 0;
            for (int i11 = 0; i11 < iL; i11++) {
                int iH2 = m9.H();
                i9 += iH2;
                zArr[i11] = iH2 > i10;
            }
        } else {
            i9 = iH * iL;
            Arrays.fill(qVar.f44059m, 0, iL, iH > i10);
        }
        Arrays.fill(qVar.f44059m, iL, qVar.f44052f, false);
        if (i9 > 0) {
            qVar.d(i9);
        }
    }

    public static void y(AbstractC2176a.C0372a c0372a, String str, q qVar) throws C0897l1 {
        byte[] bArr = null;
        M m9 = null;
        M m10 = null;
        for (int i9 = 0; i9 < c0372a.f43888c.size(); i9++) {
            AbstractC2176a.b bVar = (AbstractC2176a.b) c0372a.f43888c.get(i9);
            M m11 = bVar.f43890b;
            int i10 = bVar.f43886a;
            if (i10 == 1935828848) {
                m11.U(12);
                if (m11.q() == 1936025959) {
                    m9 = m11;
                }
            } else if (i10 == 1936158820) {
                m11.U(12);
                if (m11.q() == 1936025959) {
                    m10 = m11;
                }
            }
        }
        if (m9 == null || m10 == null) {
            return;
        }
        m9.U(8);
        int iC = AbstractC2176a.c(m9.q());
        m9.V(4);
        if (iC == 1) {
            m9.V(4);
        }
        if (m9.q() != 1) {
            throw C0897l1.e("Entry count in sbgp != 1 (unsupported).");
        }
        m10.U(8);
        int iC2 = AbstractC2176a.c(m10.q());
        m10.V(4);
        if (iC2 == 1) {
            if (m10.J() == 0) {
                throw C0897l1.e("Variable length description in sgpd found (unsupported)");
            }
        } else if (iC2 >= 2) {
            m10.V(4);
        }
        if (m10.J() != 1) {
            throw C0897l1.e("Entry count in sgpd != 1 (unsupported).");
        }
        m10.V(1);
        int iH = m10.H();
        int i11 = (iH & 240) >> 4;
        int i12 = iH & 15;
        boolean z9 = m10.H() == 1;
        if (z9) {
            int iH2 = m10.H();
            byte[] bArr2 = new byte[16];
            m10.l(bArr2, 0, 16);
            if (iH2 == 0) {
                int iH3 = m10.H();
                bArr = new byte[iH3];
                m10.l(bArr, 0, iH3);
            }
            qVar.f44058l = true;
            qVar.f44060n = new p(z9, str, iH2, bArr2, i11, i12, bArr);
        }
    }

    public static void z(M m9, int i9, q qVar) throws C0897l1 {
        m9.U(i9 + 8);
        int iB = AbstractC2176a.b(m9.q());
        if ((iB & 1) != 0) {
            throw C0897l1.e("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z9 = (iB & 2) != 0;
        int iL = m9.L();
        if (iL == 0) {
            Arrays.fill(qVar.f44059m, 0, qVar.f44052f, false);
            return;
        }
        if (iL == qVar.f44052f) {
            Arrays.fill(qVar.f44059m, 0, iL, z9);
            qVar.d(m9.a());
            qVar.b(m9);
        } else {
            throw C0897l1.a("Senc sample count " + iL + " is different from fragment sample count" + qVar.f44052f, null);
        }
    }

    public final void L(InterfaceC1673j interfaceC1673j) throws C0897l1 {
        int i9 = ((int) this.f43964r) - this.f43965s;
        M m9 = this.f43966t;
        if (m9 != null) {
            interfaceC1673j.m(m9.e(), 8, i9);
            q(new AbstractC2176a.b(this.f43963q, m9), interfaceC1673j.getPosition());
        } else {
            interfaceC1673j.q(i9);
        }
        J(interfaceC1673j.getPosition());
    }

    public final void M(InterfaceC1673j interfaceC1673j) throws C0897l1 {
        int size = this.f43950d.size();
        long j9 = Long.MAX_VALUE;
        b bVar = null;
        for (int i9 = 0; i9 < size; i9++) {
            q qVar = ((b) this.f43950d.valueAt(i9)).f43977b;
            if (qVar.f44062p) {
                long j10 = qVar.f44050d;
                if (j10 < j9) {
                    bVar = (b) this.f43950d.valueAt(i9);
                    j9 = j10;
                }
            }
        }
        if (bVar == null) {
            this.f43962p = 3;
            return;
        }
        int position = (int) (j9 - interfaceC1673j.getPosition());
        if (position < 0) {
            throw C0897l1.a("Offset to encryption data was negative.", null);
        }
        interfaceC1673j.q(position);
        bVar.f43977b.a(interfaceC1673j);
    }

    public final boolean N(InterfaceC1673j interfaceC1673j) throws C0897l1 {
        int iA;
        int i9;
        b bVarJ = this.f43972z;
        Throwable th = null;
        if (bVarJ == null) {
            bVarJ = j(this.f43950d);
            if (bVarJ == null) {
                int position = (int) (this.f43967u - interfaceC1673j.getPosition());
                if (position < 0) {
                    throw C0897l1.a("Offset to end of mdat was negative.", null);
                }
                interfaceC1673j.q(position);
                f();
                return false;
            }
            int iD = (int) (bVarJ.d() - interfaceC1673j.getPosition());
            if (iD < 0) {
                AbstractC1681B.j("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                iD = 0;
            }
            interfaceC1673j.q(iD);
            this.f43972z = bVarJ;
        }
        int i10 = 4;
        int i11 = 1;
        if (this.f43962p == 3) {
            int iF = bVarJ.f();
            this.f43939A = iF;
            if (bVarJ.f43981f < bVarJ.f43984i) {
                interfaceC1673j.q(iF);
                bVarJ.m();
                if (!bVarJ.h()) {
                    this.f43972z = null;
                }
                this.f43962p = 3;
                return true;
            }
            if (bVarJ.f43979d.f44065a.f44037g == 1) {
                this.f43939A = iF - 8;
                interfaceC1673j.q(8);
            }
            if ("audio/ac4".equals(bVarJ.f43979d.f44065a.f44036f.f6467m)) {
                this.f43940B = bVarJ.i(this.f43939A, 7);
                AbstractC1017c.a(this.f43939A, this.f43955i);
                bVarJ.f43976a.b(this.f43955i, 7);
                i9 = this.f43940B + 7;
            } else {
                i9 = bVarJ.i(this.f43939A, 0);
            }
            this.f43940B = i9;
            this.f43939A += this.f43940B;
            this.f43962p = 4;
            this.f43941C = 0;
        }
        C2190o c2190o = bVarJ.f43979d.f44065a;
        w wVar = bVarJ.f43976a;
        long jE = bVarJ.e();
        Z z9 = this.f43956j;
        if (z9 != null) {
            jE = z9.a(jE);
        }
        long j9 = jE;
        if (c2190o.f44040j == 0) {
            while (true) {
                int i12 = this.f43940B;
                int i13 = this.f43939A;
                if (i12 >= i13) {
                    break;
                }
                this.f43940B += wVar.a(interfaceC1673j, i13 - i12, false);
            }
        } else {
            byte[] bArrE = this.f43952f.e();
            bArrE[0] = 0;
            bArrE[1] = 0;
            bArrE[2] = 0;
            int i14 = c2190o.f44040j;
            int i15 = i14 + 1;
            int i16 = 4 - i14;
            while (this.f43940B < this.f43939A) {
                int i17 = this.f43941C;
                if (i17 == 0) {
                    interfaceC1673j.m(bArrE, i16, i15);
                    this.f43952f.U(0);
                    int iQ = this.f43952f.q();
                    if (iQ < i11) {
                        throw C0897l1.a("Invalid NAL length", th);
                    }
                    this.f43941C = iQ - 1;
                    this.f43951e.U(0);
                    wVar.b(this.f43951e, i10);
                    wVar.b(this.f43952f, i11);
                    this.f43942D = this.f43945G.length > 0 && G.g(c2190o.f44036f.f6467m, bArrE[i10]);
                    this.f43940B += 5;
                    this.f43939A += i16;
                } else {
                    if (this.f43942D) {
                        this.f43953g.Q(i17);
                        interfaceC1673j.m(this.f43953g.e(), 0, this.f43941C);
                        wVar.b(this.f43953g, this.f43941C);
                        iA = this.f43941C;
                        int iQ2 = G.q(this.f43953g.e(), this.f43953g.g());
                        this.f43953g.U("video/hevc".equals(c2190o.f44036f.f6467m) ? 1 : 0);
                        this.f43953g.T(iQ2);
                        AbstractC1665b.a(j9, this.f43953g, this.f43945G);
                    } else {
                        iA = wVar.a(interfaceC1673j, i17, false);
                    }
                    this.f43940B += iA;
                    this.f43941C -= iA;
                    th = null;
                    i10 = 4;
                    i11 = 1;
                }
            }
        }
        int iC = bVarJ.c();
        p pVarG = bVarJ.g();
        wVar.f(j9, iC, this.f43939A, 0, pVarG != null ? pVarG.f44044c : null);
        t(j9);
        if (!bVarJ.h()) {
            this.f43972z = null;
        }
        this.f43962p = 3;
        return true;
    }

    @Override // d3.InterfaceC1672i
    public void a(long j9, long j10) {
        int size = this.f43950d.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((b) this.f43950d.valueAt(i9)).k();
        }
        this.f43960n.clear();
        this.f43968v = 0;
        this.f43969w = j10;
        this.f43959m.clear();
        f();
    }

    @Override // d3.InterfaceC1672i
    public void b(InterfaceC1674k interfaceC1674k) {
        this.f43943E = interfaceC1674k;
        f();
        k();
        C2190o c2190o = this.f43948b;
        if (c2190o != null) {
            this.f43950d.put(0, new b(interfaceC1674k.e(0, c2190o.f44032b), new r(this.f43948b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new C2178c(0, 0, 0, 0)));
            this.f43943E.q();
        }
    }

    @Override // d3.InterfaceC1672i
    public int d(InterfaceC1673j interfaceC1673j, t tVar) throws C0897l1 {
        while (true) {
            int i9 = this.f43962p;
            if (i9 != 0) {
                if (i9 == 1) {
                    L(interfaceC1673j);
                } else if (i9 == 2) {
                    M(interfaceC1673j);
                } else if (N(interfaceC1673j)) {
                    return 0;
                }
            } else if (!K(interfaceC1673j)) {
                return -1;
            }
        }
    }

    public final C2178c g(SparseArray sparseArray, int i9) {
        return (C2178c) (sparseArray.size() == 1 ? sparseArray.valueAt(0) : AbstractC1684a.e((C2178c) sparseArray.get(i9)));
    }

    @Override // d3.InterfaceC1672i
    public boolean h(InterfaceC1673j interfaceC1673j) {
        return AbstractC2189n.b(interfaceC1673j);
    }

    public final void k() {
        int i9;
        w[] wVarArr = new w[2];
        this.f43944F = wVarArr;
        w wVar = this.f43961o;
        int i10 = 0;
        if (wVar != null) {
            wVarArr[0] = wVar;
            i9 = 1;
        } else {
            i9 = 0;
        }
        int i11 = 100;
        if ((this.f43947a & 4) != 0) {
            wVarArr[i9] = this.f43943E.e(100, 5);
            i11 = 101;
            i9++;
        }
        w[] wVarArr2 = (w[]) k0.U0(this.f43944F, i9);
        this.f43944F = wVarArr2;
        for (w wVar2 : wVarArr2) {
            wVar2.d(f43938K);
        }
        this.f43945G = new w[this.f43949c.size()];
        while (i10 < this.f43945G.length) {
            w wVarE = this.f43943E.e(i11, 3);
            wVarE.d((C0936z0) this.f43949c.get(i10));
            this.f43945G[i10] = wVarE;
            i10++;
            i11++;
        }
    }

    public C2190o n(C2190o c2190o) {
        return c2190o;
    }

    public final void o(AbstractC2176a.C0372a c0372a) throws C0897l1 {
        int i9 = c0372a.f43886a;
        if (i9 == 1836019574) {
            s(c0372a);
        } else if (i9 == 1836019558) {
            r(c0372a);
        } else {
            if (this.f43959m.isEmpty()) {
                return;
            }
            ((AbstractC2176a.C0372a) this.f43959m.peek()).d(c0372a);
        }
    }

    public final void p(M m9) {
        long jC1;
        String str;
        long jC12;
        String str2;
        long J9;
        long jA;
        ArrayDeque arrayDeque;
        a aVar;
        if (this.f43944F.length == 0) {
            return;
        }
        m9.U(8);
        int iC = AbstractC2176a.c(m9.q());
        if (iC == 0) {
            String str3 = (String) AbstractC1684a.e(m9.B());
            String str4 = (String) AbstractC1684a.e(m9.B());
            long J10 = m9.J();
            jC1 = k0.c1(m9.J(), 1000000L, J10);
            long j9 = this.f43971y;
            long j10 = j9 != -9223372036854775807L ? j9 + jC1 : -9223372036854775807L;
            str = str3;
            jC12 = k0.c1(m9.J(), 1000L, J10);
            str2 = str4;
            J9 = m9.J();
            jA = j10;
        } else {
            if (iC != 1) {
                AbstractC1681B.j("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iC);
                return;
            }
            long J11 = m9.J();
            jA = k0.c1(m9.M(), 1000000L, J11);
            long jC13 = k0.c1(m9.J(), 1000L, J11);
            long J12 = m9.J();
            str = (String) AbstractC1684a.e(m9.B());
            jC12 = jC13;
            J9 = J12;
            str2 = (String) AbstractC1684a.e(m9.B());
            jC1 = -9223372036854775807L;
        }
        byte[] bArr = new byte[m9.a()];
        m9.l(bArr, 0, m9.a());
        M m10 = new M(this.f43957k.a(new C2707a(str, str2, jC12, J9, bArr)));
        int iA = m10.a();
        for (w wVar : this.f43944F) {
            m10.U(0);
            wVar.b(m10, iA);
        }
        if (jA == -9223372036854775807L) {
            this.f43960n.addLast(new a(jC1, true, iA));
        } else {
            if (this.f43960n.isEmpty()) {
                Z z9 = this.f43956j;
                if (z9 == null || z9.f()) {
                    Z z10 = this.f43956j;
                    if (z10 != null) {
                        jA = z10.a(jA);
                    }
                    for (w wVar2 : this.f43944F) {
                        wVar2.f(jA, 1, iA, 0, null);
                    }
                    return;
                }
                arrayDeque = this.f43960n;
                aVar = new a(jA, false, iA);
            } else {
                arrayDeque = this.f43960n;
                aVar = new a(jA, false, iA);
            }
            arrayDeque.addLast(aVar);
        }
        this.f43968v += iA;
    }

    public final void q(AbstractC2176a.b bVar, long j9) throws C0897l1 {
        if (!this.f43959m.isEmpty()) {
            ((AbstractC2176a.C0372a) this.f43959m.peek()).e(bVar);
            return;
        }
        int i9 = bVar.f43886a;
        if (i9 != 1936286840) {
            if (i9 == 1701671783) {
                p(bVar.f43890b);
            }
        } else {
            Pair pairB = B(bVar.f43890b, j9);
            this.f43971y = ((Long) pairB.first).longValue();
            this.f43943E.n((com.google.android.exoplayer2.extractor.g) pairB.second);
            this.f43946H = true;
        }
    }

    public final void r(AbstractC2176a.C0372a c0372a) throws C0897l1 {
        v(c0372a, this.f43950d, this.f43948b != null, this.f43947a, this.f43954h);
        C1056m c1056mI = i(c0372a.f43888c);
        if (c1056mI != null) {
            int size = this.f43950d.size();
            for (int i9 = 0; i9 < size; i9++) {
                ((b) this.f43950d.valueAt(i9)).n(c1056mI);
            }
        }
        if (this.f43969w != -9223372036854775807L) {
            int size2 = this.f43950d.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((b) this.f43950d.valueAt(i10)).l(this.f43969w);
            }
            this.f43969w = -9223372036854775807L;
        }
    }

    @Override // d3.InterfaceC1672i
    public void release() {
    }

    public final void s(AbstractC2176a.C0372a c0372a) {
        int i9 = 0;
        AbstractC1684a.h(this.f43948b == null, "Unexpected moov box.");
        C1056m c1056mI = i(c0372a.f43888c);
        AbstractC2176a.C0372a c0372a2 = (AbstractC2176a.C0372a) AbstractC1684a.e(c0372a.f(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = c0372a2.f43888c.size();
        long jU = -9223372036854775807L;
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC2176a.b bVar = (AbstractC2176a.b) c0372a2.f43888c.get(i10);
            int i11 = bVar.f43886a;
            if (i11 == 1953654136) {
                Pair pairF = F(bVar.f43890b);
                sparseArray.put(((Integer) pairF.first).intValue(), (C2178c) pairF.second);
            } else if (i11 == 1835362404) {
                jU = u(bVar.f43890b);
            }
        }
        List listA = AbstractC2177b.A(c0372a, new d3.r(), jU, c1056mI, (this.f43947a & 16) != 0, false, new InterfaceC2677f() { // from class: l3.f
            @Override // r5.InterfaceC2677f
            public final Object apply(Object obj) {
                return this.f43935a.n((C2190o) obj);
            }
        });
        int size2 = listA.size();
        if (this.f43950d.size() != 0) {
            AbstractC1684a.g(this.f43950d.size() == size2);
            while (i9 < size2) {
                r rVar = (r) listA.get(i9);
                C2190o c2190o = rVar.f44065a;
                ((b) this.f43950d.get(c2190o.f44031a)).j(rVar, g(sparseArray, c2190o.f44031a));
                i9++;
            }
            return;
        }
        while (i9 < size2) {
            r rVar2 = (r) listA.get(i9);
            C2190o c2190o2 = rVar2.f44065a;
            this.f43950d.put(c2190o2.f44031a, new b(this.f43943E.e(i9, c2190o2.f44032b), rVar2, g(sparseArray, c2190o2.f44031a)));
            this.f43970x = Math.max(this.f43970x, c2190o2.f44035e);
            i9++;
        }
        this.f43943E.q();
    }

    public final void t(long j9) {
        while (!this.f43960n.isEmpty()) {
            a aVar = (a) this.f43960n.removeFirst();
            this.f43968v -= aVar.f43975c;
            long jA = aVar.f43973a;
            if (aVar.f43974b) {
                jA += j9;
            }
            Z z9 = this.f43956j;
            if (z9 != null) {
                jA = z9.a(jA);
            }
            for (w wVar : this.f43944F) {
                wVar.f(jA, 1, aVar.f43975c, this.f43968v, null);
            }
        }
    }
}
