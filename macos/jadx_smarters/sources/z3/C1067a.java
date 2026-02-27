package Z3;

import B3.C;
import B3.g0;
import O2.C0936z0;
import O2.Q1;
import Z3.s;
import b4.InterfaceC1215f;
import com.amazonaws.services.s3.internal.Constants;
import d4.AbstractC1681B;
import d4.InterfaceC1688e;
import d4.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import s5.AbstractC2743y;
import s5.F;
import s5.K;

/* JADX INFO: renamed from: Z3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1067a extends AbstractC1069c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC1215f f11086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f11087i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f11088j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f11089k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f11090l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f11091m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f11092n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f11093o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AbstractC2743y f11094p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC1688e f11095q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f11096r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11097s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11098t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f11099u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public D3.n f11100v;

    /* JADX INFO: renamed from: Z3.a$a, reason: collision with other inner class name */
    public static final class C0151a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f11101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f11102b;

        public C0151a(long j9, long j10) {
            this.f11101a = j9;
            this.f11102b = j10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0151a)) {
                return false;
            }
            C0151a c0151a = (C0151a) obj;
            return this.f11101a == c0151a.f11101a && this.f11102b == c0151a.f11102b;
        }

        public int hashCode() {
            return (((int) this.f11101a) * 31) + ((int) this.f11102b);
        }
    }

    /* JADX INFO: renamed from: Z3.a$b */
    public static class b implements s.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f11104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f11105c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f11106d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f11107e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f11108f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f11109g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final InterfaceC1688e f11110h;

        public b() {
            this(Constants.MAXIMUM_UPLOAD_PARTS, 25000, 25000, 0.7f);
        }

        public b(int i9, int i10, int i11, float f9) {
            this(i9, i10, i11, 1279, 719, f9, 0.75f, InterfaceC1688e.f39758a);
        }

        public b(int i9, int i10, int i11, int i12, int i13, float f9, float f10, InterfaceC1688e interfaceC1688e) {
            this.f11103a = i9;
            this.f11104b = i10;
            this.f11105c = i11;
            this.f11106d = i12;
            this.f11107e = i13;
            this.f11108f = f9;
            this.f11109g = f10;
            this.f11110h = interfaceC1688e;
        }

        @Override // Z3.s.b
        public final s[] a(s.a[] aVarArr, InterfaceC1215f interfaceC1215f, C.b bVar, Q1 q12) {
            AbstractC2743y abstractC2743yZ = C1067a.z(aVarArr);
            s[] sVarArr = new s[aVarArr.length];
            for (int i9 = 0; i9 < aVarArr.length; i9++) {
                s.a aVar = aVarArr[i9];
                if (aVar != null) {
                    int[] iArr = aVar.f11251b;
                    if (iArr.length != 0) {
                        sVarArr[i9] = iArr.length == 1 ? new t(aVar.f11250a, iArr[0], aVar.f11252c) : b(aVar.f11250a, iArr, aVar.f11252c, interfaceC1215f, (AbstractC2743y) abstractC2743yZ.get(i9));
                    }
                }
            }
            return sVarArr;
        }

        public C1067a b(g0 g0Var, int[] iArr, int i9, InterfaceC1215f interfaceC1215f, AbstractC2743y abstractC2743y) {
            return new C1067a(g0Var, iArr, i9, interfaceC1215f, this.f11103a, this.f11104b, this.f11105c, this.f11106d, this.f11107e, this.f11108f, this.f11109g, abstractC2743y, this.f11110h);
        }
    }

    public C1067a(g0 g0Var, int[] iArr, int i9, InterfaceC1215f interfaceC1215f, long j9, long j10, long j11, int i10, int i11, float f9, float f10, List list, InterfaceC1688e interfaceC1688e) {
        InterfaceC1215f interfaceC1215f2;
        long j12;
        super(g0Var, iArr, i9);
        if (j11 < j9) {
            AbstractC1681B.j("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            interfaceC1215f2 = interfaceC1215f;
            j12 = j9;
        } else {
            interfaceC1215f2 = interfaceC1215f;
            j12 = j11;
        }
        this.f11086h = interfaceC1215f2;
        this.f11087i = j9 * 1000;
        this.f11088j = j10 * 1000;
        this.f11089k = j12 * 1000;
        this.f11090l = i10;
        this.f11091m = i11;
        this.f11092n = f9;
        this.f11093o = f10;
        this.f11094p = AbstractC2743y.r(list);
        this.f11095q = interfaceC1688e;
        this.f11096r = 1.0f;
        this.f11098t = 0;
        this.f11099u = -9223372036854775807L;
    }

    public static long[][] E(s.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i9 = 0; i9 < aVarArr.length; i9++) {
            s.a aVar = aVarArr[i9];
            if (aVar == null) {
                jArr[i9] = new long[0];
            } else {
                jArr[i9] = new long[aVar.f11251b.length];
                int i10 = 0;
                while (true) {
                    int[] iArr = aVar.f11251b;
                    if (i10 >= iArr.length) {
                        break;
                    }
                    long j9 = aVar.f11250a.c(iArr[i10]).f6463i;
                    long[] jArr2 = jArr[i9];
                    if (j9 == -1) {
                        j9 = 0;
                    }
                    jArr2[i10] = j9;
                    i10++;
                }
                Arrays.sort(jArr[i9]);
            }
        }
        return jArr;
    }

    public static AbstractC2743y F(long[][] jArr) {
        F fE = K.c().a().e();
        for (int i9 = 0; i9 < jArr.length; i9++) {
            long[] jArr2 = jArr[i9];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i10 = 0;
                while (true) {
                    long[] jArr3 = jArr[i9];
                    double dLog = 0.0d;
                    if (i10 >= jArr3.length) {
                        break;
                    }
                    long j9 = jArr3[i10];
                    if (j9 != -1) {
                        dLog = Math.log(j9);
                    }
                    dArr[i10] = dLog;
                    i10++;
                }
                int i11 = length - 1;
                double d9 = dArr[i11] - dArr[0];
                int i12 = 0;
                while (i12 < i11) {
                    double d10 = dArr[i12];
                    i12++;
                    fE.put(Double.valueOf(d9 == 0.0d ? 1.0d : (((d10 + dArr[i12]) * 0.5d) - dArr[0]) / d9), Integer.valueOf(i9));
                }
            }
        }
        return AbstractC2743y.r(fE.values());
    }

    public static void w(List list, long[] jArr) {
        long j9 = 0;
        for (long j10 : jArr) {
            j9 += j10;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            AbstractC2743y.a aVar = (AbstractC2743y.a) list.get(i9);
            if (aVar != null) {
                aVar.a(new C0151a(j9, jArr[i9]));
            }
        }
    }

    public static AbstractC2743y z(s.a[] aVarArr) {
        AbstractC2743y.a aVarP;
        ArrayList arrayList = new ArrayList();
        for (s.a aVar : aVarArr) {
            if (aVar == null || aVar.f11251b.length <= 1) {
                aVarP = null;
            } else {
                aVarP = AbstractC2743y.p();
                aVarP.a(new C0151a(0L, 0L));
            }
            arrayList.add(aVarP);
        }
        long[][] jArrE = E(aVarArr);
        int[] iArr = new int[jArrE.length];
        long[] jArr = new long[jArrE.length];
        for (int i9 = 0; i9 < jArrE.length; i9++) {
            long[] jArr2 = jArrE[i9];
            jArr[i9] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        w(arrayList, jArr);
        AbstractC2743y abstractC2743yF = F(jArrE);
        for (int i10 = 0; i10 < abstractC2743yF.size(); i10++) {
            int iIntValue = ((Integer) abstractC2743yF.get(i10)).intValue();
            int i11 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i11;
            jArr[iIntValue] = jArrE[iIntValue][i11];
            w(arrayList, jArr);
        }
        for (int i12 = 0; i12 < aVarArr.length; i12++) {
            if (arrayList.get(i12) != null) {
                jArr[i12] = jArr[i12] * 2;
            }
        }
        w(arrayList, jArr);
        AbstractC2743y.a aVarP2 = AbstractC2743y.p();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            AbstractC2743y.a aVar2 = (AbstractC2743y.a) arrayList.get(i13);
            aVarP2.a(aVar2 == null ? AbstractC2743y.z() : aVar2.k());
        }
        return aVarP2.k();
    }

    public final long A(long j9) {
        long jG = G(j9);
        if (this.f11094p.isEmpty()) {
            return jG;
        }
        int i9 = 1;
        while (i9 < this.f11094p.size() - 1 && ((C0151a) this.f11094p.get(i9)).f11101a < jG) {
            i9++;
        }
        C0151a c0151a = (C0151a) this.f11094p.get(i9 - 1);
        C0151a c0151a2 = (C0151a) this.f11094p.get(i9);
        long j10 = c0151a.f11101a;
        float f9 = (jG - j10) / (c0151a2.f11101a - j10);
        return c0151a.f11102b + ((long) (f9 * (c0151a2.f11102b - r2)));
    }

    public final long B(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        D3.n nVar = (D3.n) s5.D.d(list);
        long j9 = nVar.f1382h;
        if (j9 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = nVar.f1383i;
        if (j10 != -9223372036854775807L) {
            return j10 - j9;
        }
        return -9223372036854775807L;
    }

    public long C() {
        return this.f11089k;
    }

    public final long D(D3.o[] oVarArr, List list) {
        int i9 = this.f11097s;
        if (i9 < oVarArr.length && oVarArr[i9].next()) {
            D3.o oVar = oVarArr[this.f11097s];
            return oVar.b() - oVar.a();
        }
        for (D3.o oVar2 : oVarArr) {
            if (oVar2.next()) {
                return oVar2.b() - oVar2.a();
            }
        }
        return B(list);
    }

    public final long G(long j9) {
        long jE = (long) (this.f11086h.e() * this.f11092n);
        long jB = this.f11086h.b();
        if (jB == -9223372036854775807L || j9 == -9223372036854775807L) {
            return (long) (jE / this.f11096r);
        }
        float f9 = j9;
        return (long) ((jE * Math.max((f9 / this.f11096r) - jB, 0.0f)) / f9);
    }

    public final long H(long j9, long j10) {
        if (j9 == -9223372036854775807L) {
            return this.f11087i;
        }
        if (j10 != -9223372036854775807L) {
            j9 -= j10;
        }
        return Math.min((long) (j9 * this.f11093o), this.f11087i);
    }

    public boolean I(long j9, List list) {
        long j10 = this.f11099u;
        return j10 == -9223372036854775807L || j9 - j10 >= 1000 || !(list.isEmpty() || ((D3.n) s5.D.d(list)).equals(this.f11100v));
    }

    @Override // Z3.s
    public int b() {
        return this.f11097s;
    }

    @Override // Z3.AbstractC1069c, Z3.s
    public void disable() {
        this.f11100v = null;
    }

    @Override // Z3.AbstractC1069c, Z3.s
    public void enable() {
        this.f11099u = -9223372036854775807L;
        this.f11100v = null;
    }

    @Override // Z3.AbstractC1069c, Z3.s
    public void f(float f9) {
        this.f11096r = f9;
    }

    @Override // Z3.s
    public Object g() {
        return null;
    }

    @Override // Z3.AbstractC1069c, Z3.s
    public int n(long j9, List list) {
        int i9;
        int i10;
        long jB = this.f11095q.b();
        if (!I(jB, list)) {
            return list.size();
        }
        this.f11099u = jB;
        this.f11100v = list.isEmpty() ? null : (D3.n) s5.D.d(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jK0 = k0.k0(((D3.n) list.get(size - 1)).f1382h - j9, this.f11096r);
        long jC = C();
        if (jK0 < jC) {
            return size;
        }
        C0936z0 c0936z0C = c(y(jB, B(list)));
        for (int i11 = 0; i11 < size; i11++) {
            D3.n nVar = (D3.n) list.get(i11);
            C0936z0 c0936z0 = nVar.f1379e;
            if (k0.k0(nVar.f1382h - j9, this.f11096r) >= jC && c0936z0.f6463i < c0936z0C.f6463i && (i9 = c0936z0.f6473s) != -1 && i9 <= this.f11091m && (i10 = c0936z0.f6472r) != -1 && i10 <= this.f11090l && i9 < c0936z0C.f6473s) {
                return i11;
            }
        }
        return size;
    }

    @Override // Z3.s
    public int q() {
        return this.f11098t;
    }

    @Override // Z3.s
    public void r(long j9, long j10, long j11, List list, D3.o[] oVarArr) {
        long jB = this.f11095q.b();
        long jD = D(oVarArr, list);
        int i9 = this.f11098t;
        if (i9 == 0) {
            this.f11098t = 1;
            this.f11097s = y(jB, jD);
            return;
        }
        int i10 = this.f11097s;
        int iL = list.isEmpty() ? -1 : l(((D3.n) s5.D.d(list)).f1379e);
        if (iL != -1) {
            i9 = ((D3.n) s5.D.d(list)).f1380f;
            i10 = iL;
        }
        int iY = y(jB, jD);
        if (!a(i10, jB)) {
            C0936z0 c0936z0C = c(i10);
            C0936z0 c0936z0C2 = c(iY);
            long jH = H(j11, jD);
            int i11 = c0936z0C2.f6463i;
            int i12 = c0936z0C.f6463i;
            if ((i11 > i12 && j10 < jH) || (i11 < i12 && j10 >= this.f11088j)) {
                iY = i10;
            }
        }
        if (iY != i10) {
            i9 = 3;
        }
        this.f11098t = i9;
        this.f11097s = iY;
    }

    public boolean x(C0936z0 c0936z0, int i9, long j9) {
        return ((long) i9) <= j9;
    }

    public final int y(long j9, long j10) {
        long jA = A(j10);
        int i9 = 0;
        for (int i10 = 0; i10 < this.f11112b; i10++) {
            if (j9 == Long.MIN_VALUE || !a(i10, j9)) {
                C0936z0 c0936z0C = c(i10);
                if (x(c0936z0C, c0936z0C.f6463i, jA)) {
                    return i10;
                }
                i9 = i10;
            }
        }
        return i9;
    }
}
