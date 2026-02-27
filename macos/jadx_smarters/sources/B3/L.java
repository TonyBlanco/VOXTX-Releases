package B3;

import B3.C;
import O2.H0;
import O2.Q1;
import b4.InterfaceC1211b;
import d4.AbstractC1684a;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class L extends AbstractC0499g {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final H0 f322w = new H0.c().g("MergingMediaSource").a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f323l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f324m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C[] f325n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Q1[] f326o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f327p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC0501i f328q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Map f329r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s5.J f330s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f331t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long[][] f332u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b f333v;

    public static final class a extends AbstractC0510s {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long[] f334h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long[] f335i;

        public a(Q1 q12, Map map) {
            super(q12);
            int iU = q12.u();
            this.f335i = new long[q12.u()];
            Q1.d dVar = new Q1.d();
            for (int i9 = 0; i9 < iU; i9++) {
                this.f335i[i9] = q12.s(i9, dVar).f5757o;
            }
            int iN = q12.n();
            this.f334h = new long[iN];
            Q1.b bVar = new Q1.b();
            for (int i10 = 0; i10 < iN; i10++) {
                q12.l(i10, bVar, true);
                long jLongValue = ((Long) AbstractC1684a.e((Long) map.get(bVar.f5717c))).longValue();
                long[] jArr = this.f334h;
                jLongValue = jLongValue == Long.MIN_VALUE ? bVar.f5719e : jLongValue;
                jArr[i10] = jLongValue;
                long j9 = bVar.f5719e;
                if (j9 != -9223372036854775807L) {
                    long[] jArr2 = this.f335i;
                    int i11 = bVar.f5718d;
                    jArr2[i11] = jArr2[i11] - (j9 - jLongValue);
                }
            }
        }

        @Override // B3.AbstractC0510s, O2.Q1
        public Q1.b l(int i9, Q1.b bVar, boolean z9) {
            super.l(i9, bVar, z9);
            bVar.f5719e = this.f334h[i9];
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        @Override // B3.AbstractC0510s, O2.Q1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public O2.Q1.d t(int r5, O2.Q1.d r6, long r7) {
            /*
                r4 = this;
                super.t(r5, r6, r7)
                long[] r7 = r4.f335i
                r0 = r7[r5]
                r6.f5757o = r0
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r5 == 0) goto L1e
                long r2 = r6.f5756n
                int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r5 != 0) goto L19
                goto L1e
            L19:
                long r7 = java.lang.Math.min(r2, r0)
                goto L20
            L1e:
                long r7 = r6.f5756n
            L20:
                r6.f5756n = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: B3.L.a.t(int, O2.Q1$d, long):O2.Q1$d");
        }
    }

    public static final class b extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f336a;

        public b(int i9) {
            this.f336a = i9;
        }
    }

    public L(boolean z9, boolean z10, InterfaceC0501i interfaceC0501i, C... cArr) {
        this.f323l = z9;
        this.f324m = z10;
        this.f325n = cArr;
        this.f328q = interfaceC0501i;
        this.f327p = new ArrayList(Arrays.asList(cArr));
        this.f331t = -1;
        this.f326o = new Q1[cArr.length];
        this.f332u = new long[0][];
        this.f329r = new HashMap();
        this.f330s = s5.K.a().a().e();
    }

    public L(boolean z9, boolean z10, C... cArr) {
        this(z9, z10, new C0502j(), cArr);
    }

    public L(boolean z9, C... cArr) {
        this(z9, false, cArr);
    }

    public L(C... cArr) {
        this(false, cArr);
    }

    @Override // B3.C
    public InterfaceC0517z E(C.b bVar, InterfaceC1211b interfaceC1211b, long j9) {
        int length = this.f325n.length;
        InterfaceC0517z[] interfaceC0517zArr = new InterfaceC0517z[length];
        int iF = this.f326o[0].f(bVar.f271a);
        for (int i9 = 0; i9 < length; i9++) {
            interfaceC0517zArr[i9] = this.f325n[i9].E(bVar.c(this.f326o[i9].r(iF)), interfaceC1211b, j9 - this.f332u[iF][i9]);
        }
        K k9 = new K(this.f328q, this.f332u[iF], interfaceC0517zArr);
        if (!this.f324m) {
            return k9;
        }
        C0496d c0496d = new C0496d(k9, true, 0L, ((Long) AbstractC1684a.e((Long) this.f329r.get(bVar.f271a))).longValue());
        this.f330s.put(bVar.f271a, c0496d);
        return c0496d;
    }

    @Override // B3.AbstractC0499g, B3.C
    public void P() throws b {
        b bVar = this.f333v;
        if (bVar != null) {
            throw bVar;
        }
        super.P();
    }

    @Override // B3.C
    public void Y(InterfaceC0517z interfaceC0517z) {
        if (this.f324m) {
            C0496d c0496d = (C0496d) interfaceC0517z;
            Iterator it = this.f330s.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((C0496d) entry.getValue()).equals(c0496d)) {
                    this.f330s.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            interfaceC0517z = c0496d.f523a;
        }
        K k9 = (K) interfaceC0517z;
        int i9 = 0;
        while (true) {
            C[] cArr = this.f325n;
            if (i9 >= cArr.length) {
                return;
            }
            cArr[i9].Y(k9.a(i9));
            i9++;
        }
    }

    @Override // B3.C
    public H0 e() {
        C[] cArr = this.f325n;
        return cArr.length > 0 ? cArr[0].e() : f322w;
    }

    @Override // B3.AbstractC0499g, B3.AbstractC0493a
    public void l0(b4.S s9) {
        super.l0(s9);
        for (int i9 = 0; i9 < this.f325n.length; i9++) {
            u0(Integer.valueOf(i9), this.f325n[i9]);
        }
    }

    @Override // B3.AbstractC0499g, B3.AbstractC0493a
    public void n0() {
        super.n0();
        Arrays.fill(this.f326o, (Object) null);
        this.f331t = -1;
        this.f333v = null;
        this.f327p.clear();
        Collections.addAll(this.f327p, this.f325n);
    }

    public final void w0() {
        Q1.b bVar = new Q1.b();
        for (int i9 = 0; i9 < this.f331t; i9++) {
            long j9 = -this.f326o[0].k(i9, bVar).t();
            int i10 = 1;
            while (true) {
                Q1[] q1Arr = this.f326o;
                if (i10 < q1Arr.length) {
                    this.f332u[i9][i10] = j9 - (-q1Arr[i10].k(i9, bVar).t());
                    i10++;
                }
            }
        }
    }

    @Override // B3.AbstractC0499g
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public C.b p0(Integer num, C.b bVar) {
        if (num.intValue() == 0) {
            return bVar;
        }
        return null;
    }

    @Override // B3.AbstractC0499g
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public void s0(Integer num, C c9, Q1 q12) {
        if (this.f333v != null) {
            return;
        }
        if (this.f331t == -1) {
            this.f331t = q12.n();
        } else if (q12.n() != this.f331t) {
            this.f333v = new b(0);
            return;
        }
        if (this.f332u.length == 0) {
            this.f332u = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f331t, this.f326o.length);
        }
        this.f327p.remove(c9);
        this.f326o[num.intValue()] = q12;
        if (this.f327p.isEmpty()) {
            if (this.f323l) {
                w0();
            }
            Q1 aVar = this.f326o[0];
            if (this.f324m) {
                z0();
                aVar = new a(aVar, this.f329r);
            }
            m0(aVar);
        }
    }

    public final void z0() {
        Q1[] q1Arr;
        Q1.b bVar = new Q1.b();
        for (int i9 = 0; i9 < this.f331t; i9++) {
            long j9 = Long.MIN_VALUE;
            int i10 = 0;
            while (true) {
                q1Arr = this.f326o;
                if (i10 >= q1Arr.length) {
                    break;
                }
                long jP = q1Arr[i10].k(i9, bVar).p();
                if (jP != -9223372036854775807L) {
                    long j10 = jP + this.f332u[i9][i10];
                    if (j9 == Long.MIN_VALUE || j10 < j9) {
                        j9 = j10;
                    }
                }
                i10++;
            }
            Object objR = q1Arr[0].r(i9);
            this.f329r.put(objR, Long.valueOf(j9));
            Iterator it = this.f330s.get(objR).iterator();
            while (it.hasNext()) {
                ((C0496d) it.next()).w(0L, j9);
            }
        }
    }
}
