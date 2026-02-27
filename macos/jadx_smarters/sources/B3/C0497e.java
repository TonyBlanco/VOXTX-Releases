package B3;

import B3.C;
import O2.Q1;
import b4.InterfaceC1211b;
import d4.AbstractC1684a;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: B3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0497e extends k0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f547n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f548o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f549p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f550q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f551r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f552s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Q1.d f553t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a f554u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b f555v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f556w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f557x;

    /* JADX INFO: renamed from: B3.e$a */
    public static final class a extends AbstractC0510s {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f558h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f559i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f560j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f561k;

        public a(Q1 q12, long j9, long j10) throws b {
            super(q12);
            boolean z9 = false;
            if (q12.n() != 1) {
                throw new b(0);
            }
            Q1.d dVarS = q12.s(0, new Q1.d());
            long jMax = Math.max(0L, j9);
            if (!dVarS.f5755m && jMax != 0 && !dVarS.f5751i) {
                throw new b(1);
            }
            long jMax2 = j10 == Long.MIN_VALUE ? dVarS.f5757o : Math.max(0L, j10);
            long j11 = dVarS.f5757o;
            if (j11 != -9223372036854775807L) {
                jMax2 = jMax2 > j11 ? j11 : jMax2;
                if (jMax > jMax2) {
                    throw new b(2);
                }
            }
            this.f558h = jMax;
            this.f559i = jMax2;
            this.f560j = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (dVarS.f5752j && (jMax2 == -9223372036854775807L || (j11 != -9223372036854775807L && jMax2 == j11))) {
                z9 = true;
            }
            this.f561k = z9;
        }

        @Override // B3.AbstractC0510s, O2.Q1
        public Q1.b l(int i9, Q1.b bVar, boolean z9) {
            this.f626g.l(0, bVar, z9);
            long jT = bVar.t() - this.f558h;
            long j9 = this.f560j;
            return bVar.y(bVar.f5716a, bVar.f5717c, 0, j9 == -9223372036854775807L ? -9223372036854775807L : j9 - jT, jT);
        }

        @Override // B3.AbstractC0510s, O2.Q1
        public Q1.d t(int i9, Q1.d dVar, long j9) {
            this.f626g.t(0, dVar, 0L);
            long j10 = dVar.f5760r;
            long j11 = this.f558h;
            dVar.f5760r = j10 + j11;
            dVar.f5757o = this.f560j;
            dVar.f5752j = this.f561k;
            long j12 = dVar.f5756n;
            if (j12 != -9223372036854775807L) {
                long jMax = Math.max(j12, j11);
                dVar.f5756n = jMax;
                long j13 = this.f559i;
                if (j13 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j13);
                }
                dVar.f5756n = jMax - this.f558h;
            }
            long jX1 = d4.k0.x1(this.f558h);
            long j14 = dVar.f5748f;
            if (j14 != -9223372036854775807L) {
                dVar.f5748f = j14 + jX1;
            }
            long j15 = dVar.f5749g;
            if (j15 != -9223372036854775807L) {
                dVar.f5749g = j15 + jX1;
            }
            return dVar;
        }
    }

    /* JADX INFO: renamed from: B3.e$b */
    public static final class b extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f562a;

        public b(int i9) {
            super("Illegal clipping: " + a(i9));
            this.f562a = i9;
        }

        public static String a(int i9) {
            return i9 != 0 ? i9 != 1 ? i9 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    public C0497e(C c9, long j9, long j10, boolean z9, boolean z10, boolean z11) {
        super((C) AbstractC1684a.e(c9));
        AbstractC1684a.a(j9 >= 0);
        this.f547n = j9;
        this.f548o = j10;
        this.f549p = z9;
        this.f550q = z10;
        this.f551r = z11;
        this.f552s = new ArrayList();
        this.f553t = new Q1.d();
    }

    @Override // B3.k0
    public void C0(Q1 q12) {
        if (this.f555v != null) {
            return;
        }
        G0(q12);
    }

    @Override // B3.C
    public InterfaceC0517z E(C.b bVar, InterfaceC1211b interfaceC1211b, long j9) {
        C0496d c0496d = new C0496d(this.f596l.E(bVar, interfaceC1211b, j9), this.f549p, this.f556w, this.f557x);
        this.f552s.add(c0496d);
        return c0496d;
    }

    public final void G0(Q1 q12) {
        long j9;
        long j10;
        q12.s(0, this.f553t);
        long jG = this.f553t.g();
        if (this.f554u == null || this.f552s.isEmpty() || this.f550q) {
            long j11 = this.f547n;
            long j12 = this.f548o;
            if (this.f551r) {
                long jE = this.f553t.e();
                j11 += jE;
                j12 += jE;
            }
            this.f556w = jG + j11;
            this.f557x = this.f548o != Long.MIN_VALUE ? jG + j12 : Long.MIN_VALUE;
            int size = this.f552s.size();
            for (int i9 = 0; i9 < size; i9++) {
                ((C0496d) this.f552s.get(i9)).w(this.f556w, this.f557x);
            }
            j9 = j11;
            j10 = j12;
        } else {
            long j13 = this.f556w - jG;
            j10 = this.f548o != Long.MIN_VALUE ? this.f557x - jG : Long.MIN_VALUE;
            j9 = j13;
        }
        try {
            a aVar = new a(q12, j9, j10);
            this.f554u = aVar;
            m0(aVar);
        } catch (b e9) {
            this.f555v = e9;
            for (int i10 = 0; i10 < this.f552s.size(); i10++) {
                ((C0496d) this.f552s.get(i10)).r(this.f555v);
            }
        }
    }

    @Override // B3.AbstractC0499g, B3.C
    public void P() throws b {
        b bVar = this.f555v;
        if (bVar != null) {
            throw bVar;
        }
        super.P();
    }

    @Override // B3.C
    public void Y(InterfaceC0517z interfaceC0517z) {
        AbstractC1684a.g(this.f552s.remove(interfaceC0517z));
        this.f596l.Y(((C0496d) interfaceC0517z).f523a);
        if (!this.f552s.isEmpty() || this.f550q) {
            return;
        }
        G0(((a) AbstractC1684a.e(this.f554u)).f626g);
    }

    @Override // B3.AbstractC0499g, B3.AbstractC0493a
    public void n0() {
        super.n0();
        this.f555v = null;
        this.f554u = null;
    }
}
