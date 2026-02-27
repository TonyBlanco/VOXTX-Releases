package B3;

import B3.InterfaceC0517z;
import O2.A0;
import O2.C0936z0;
import O2.H1;
import d4.AbstractC1684a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class K implements InterfaceC0517z, InterfaceC0517z.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0517z[] f306a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0501i f308d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC0517z.a f311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i0 f312h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Z f314j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f309e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f310f = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f307c = new IdentityHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InterfaceC0517z[] f313i = new InterfaceC0517z[0];

    public static final class a implements Z3.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Z3.s f315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g0 f316b;

        public a(Z3.s sVar, g0 g0Var) {
            this.f315a = sVar;
            this.f316b = g0Var;
        }

        @Override // Z3.s
        public boolean a(int i9, long j9) {
            return this.f315a.a(i9, j9);
        }

        @Override // Z3.s
        public int b() {
            return this.f315a.b();
        }

        @Override // Z3.v
        public C0936z0 c(int i9) {
            return this.f315a.c(i9);
        }

        @Override // Z3.v
        public int d(int i9) {
            return this.f315a.d(i9);
        }

        @Override // Z3.s
        public void disable() {
            this.f315a.disable();
        }

        @Override // Z3.s
        public boolean e(int i9, long j9) {
            return this.f315a.e(i9, j9);
        }

        @Override // Z3.s
        public void enable() {
            this.f315a.enable();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f315a.equals(aVar.f315a) && this.f316b.equals(aVar.f316b);
        }

        @Override // Z3.s
        public void f(float f9) {
            this.f315a.f(f9);
        }

        @Override // Z3.s
        public Object g() {
            return this.f315a.g();
        }

        @Override // Z3.s
        public void h() {
            this.f315a.h();
        }

        public int hashCode() {
            return ((527 + this.f316b.hashCode()) * 31) + this.f315a.hashCode();
        }

        @Override // Z3.v
        public int i(int i9) {
            return this.f315a.i(i9);
        }

        @Override // Z3.s
        public boolean j(long j9, D3.f fVar, List list) {
            return this.f315a.j(j9, fVar, list);
        }

        @Override // Z3.v
        public g0 k() {
            return this.f316b;
        }

        @Override // Z3.v
        public int l(C0936z0 c0936z0) {
            return this.f315a.l(c0936z0);
        }

        @Override // Z3.v
        public int length() {
            return this.f315a.length();
        }

        @Override // Z3.s
        public void m(boolean z9) {
            this.f315a.m(z9);
        }

        @Override // Z3.s
        public int n(long j9, List list) {
            return this.f315a.n(j9, list);
        }

        @Override // Z3.s
        public int o() {
            return this.f315a.o();
        }

        @Override // Z3.s
        public C0936z0 p() {
            return this.f315a.p();
        }

        @Override // Z3.s
        public int q() {
            return this.f315a.q();
        }

        @Override // Z3.s
        public void r(long j9, long j10, long j11, List list, D3.o[] oVarArr) {
            this.f315a.r(j9, j10, j11, list, oVarArr);
        }

        @Override // Z3.s
        public void s() {
            this.f315a.s();
        }
    }

    public static final class b implements InterfaceC0517z, InterfaceC0517z.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC0517z f317a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public InterfaceC0517z.a f319d;

        public b(InterfaceC0517z interfaceC0517z, long j9) {
            this.f317a = interfaceC0517z;
            this.f318c = j9;
        }

        @Override // B3.InterfaceC0517z, B3.Z
        public boolean b() {
            return this.f317a.b();
        }

        @Override // B3.InterfaceC0517z, B3.Z
        public long c() {
            long jC = this.f317a.c();
            if (jC == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f318c + jC;
        }

        @Override // B3.InterfaceC0517z
        public long d(long j9, H1 h12) {
            return this.f317a.d(j9 - this.f318c, h12) + this.f318c;
        }

        @Override // B3.InterfaceC0517z.a
        public void e(InterfaceC0517z interfaceC0517z) {
            ((InterfaceC0517z.a) AbstractC1684a.e(this.f319d)).e(this);
        }

        @Override // B3.InterfaceC0517z, B3.Z
        public boolean f(long j9) {
            return this.f317a.f(j9 - this.f318c);
        }

        @Override // B3.InterfaceC0517z, B3.Z
        public long g() {
            long jG = this.f317a.g();
            if (jG == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f318c + jG;
        }

        @Override // B3.InterfaceC0517z, B3.Z
        public void h(long j9) {
            this.f317a.h(j9 - this.f318c);
        }

        @Override // B3.InterfaceC0517z
        public long i(Z3.s[] sVarArr, boolean[] zArr, Y[] yArr, boolean[] zArr2, long j9) {
            Y[] yArr2 = new Y[yArr.length];
            int i9 = 0;
            while (true) {
                Y yB = null;
                if (i9 >= yArr.length) {
                    break;
                }
                c cVar = (c) yArr[i9];
                if (cVar != null) {
                    yB = cVar.b();
                }
                yArr2[i9] = yB;
                i9++;
            }
            long jI = this.f317a.i(sVarArr, zArr, yArr2, zArr2, j9 - this.f318c);
            for (int i10 = 0; i10 < yArr.length; i10++) {
                Y y9 = yArr2[i10];
                if (y9 == null) {
                    yArr[i10] = null;
                } else {
                    Y y10 = yArr[i10];
                    if (y10 == null || ((c) y10).b() != y9) {
                        yArr[i10] = new c(y9, this.f318c);
                    }
                }
            }
            return jI + this.f318c;
        }

        @Override // B3.InterfaceC0517z
        public List k(List list) {
            return this.f317a.k(list);
        }

        @Override // B3.InterfaceC0517z
        public long l(long j9) {
            return this.f317a.l(j9 - this.f318c) + this.f318c;
        }

        @Override // B3.InterfaceC0517z
        public long m() {
            long jM = this.f317a.m();
            if (jM == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f318c + jM;
        }

        @Override // B3.Z.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public void j(InterfaceC0517z interfaceC0517z) {
            ((InterfaceC0517z.a) AbstractC1684a.e(this.f319d)).j(this);
        }

        @Override // B3.InterfaceC0517z
        public void p() {
            this.f317a.p();
        }

        @Override // B3.InterfaceC0517z
        public void s(InterfaceC0517z.a aVar, long j9) {
            this.f319d = aVar;
            this.f317a.s(this, j9 - this.f318c);
        }

        @Override // B3.InterfaceC0517z
        public i0 u() {
            return this.f317a.u();
        }

        @Override // B3.InterfaceC0517z
        public void v(long j9, boolean z9) {
            this.f317a.v(j9 - this.f318c, z9);
        }
    }

    public static final class c implements Y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Y f320a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f321c;

        public c(Y y9, long j9) {
            this.f320a = y9;
            this.f321c = j9;
        }

        @Override // B3.Y
        public void a() {
            this.f320a.a();
        }

        public Y b() {
            return this.f320a;
        }

        @Override // B3.Y
        public boolean e() {
            return this.f320a.e();
        }

        @Override // B3.Y
        public int n(long j9) {
            return this.f320a.n(j9 - this.f321c);
        }

        @Override // B3.Y
        public int q(A0 a02, U2.g gVar, int i9) {
            int iQ = this.f320a.q(a02, gVar, i9);
            if (iQ == -4) {
                gVar.f9701f = Math.max(0L, gVar.f9701f + this.f321c);
            }
            return iQ;
        }
    }

    public K(InterfaceC0501i interfaceC0501i, long[] jArr, InterfaceC0517z... interfaceC0517zArr) {
        this.f308d = interfaceC0501i;
        this.f306a = interfaceC0517zArr;
        this.f314j = interfaceC0501i.a(new Z[0]);
        for (int i9 = 0; i9 < interfaceC0517zArr.length; i9++) {
            long j9 = jArr[i9];
            if (j9 != 0) {
                this.f306a[i9] = new b(interfaceC0517zArr[i9], j9);
            }
        }
    }

    public InterfaceC0517z a(int i9) {
        InterfaceC0517z interfaceC0517z = this.f306a[i9];
        return interfaceC0517z instanceof b ? ((b) interfaceC0517z).f317a : interfaceC0517z;
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public boolean b() {
        return this.f314j.b();
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public long c() {
        return this.f314j.c();
    }

    @Override // B3.InterfaceC0517z
    public long d(long j9, H1 h12) {
        InterfaceC0517z[] interfaceC0517zArr = this.f313i;
        return (interfaceC0517zArr.length > 0 ? interfaceC0517zArr[0] : this.f306a[0]).d(j9, h12);
    }

    @Override // B3.InterfaceC0517z.a
    public void e(InterfaceC0517z interfaceC0517z) {
        this.f309e.remove(interfaceC0517z);
        if (!this.f309e.isEmpty()) {
            return;
        }
        int i9 = 0;
        for (InterfaceC0517z interfaceC0517z2 : this.f306a) {
            i9 += interfaceC0517z2.u().f590a;
        }
        g0[] g0VarArr = new g0[i9];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            InterfaceC0517z[] interfaceC0517zArr = this.f306a;
            if (i10 >= interfaceC0517zArr.length) {
                this.f312h = new i0(g0VarArr);
                ((InterfaceC0517z.a) AbstractC1684a.e(this.f311g)).e(this);
                return;
            }
            i0 i0VarU = interfaceC0517zArr[i10].u();
            int i12 = i0VarU.f590a;
            int i13 = 0;
            while (i13 < i12) {
                g0 g0VarB = i0VarU.b(i13);
                g0 g0VarB2 = g0VarB.b(i10 + ":" + g0VarB.f582c);
                this.f310f.put(g0VarB2, g0VarB);
                g0VarArr[i11] = g0VarB2;
                i13++;
                i11++;
            }
            i10++;
        }
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public boolean f(long j9) {
        if (this.f309e.isEmpty()) {
            return this.f314j.f(j9);
        }
        int size = this.f309e.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((InterfaceC0517z) this.f309e.get(i9)).f(j9);
        }
        return false;
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public long g() {
        return this.f314j.g();
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public void h(long j9) {
        this.f314j.h(j9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // B3.InterfaceC0517z
    public long i(Z3.s[] sVarArr, boolean[] zArr, Y[] yArr, boolean[] zArr2, long j9) {
        Integer num;
        int[] iArr = new int[sVarArr.length];
        int[] iArr2 = new int[sVarArr.length];
        int i9 = 0;
        while (true) {
            if (i9 >= sVarArr.length) {
                break;
            }
            Y y9 = yArr[i9];
            num = y9 != null ? (Integer) this.f307c.get(y9) : null;
            iArr[i9] = num == null ? -1 : num.intValue();
            Z3.s sVar = sVarArr[i9];
            if (sVar != null) {
                String str = sVar.k().f582c;
                iArr2[i9] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i9] = -1;
            }
            i9++;
        }
        this.f307c.clear();
        int length = sVarArr.length;
        Y[] yArr2 = new Y[length];
        Y[] yArr3 = new Y[sVarArr.length];
        Object[] objArr = new Z3.s[sVarArr.length];
        ArrayList arrayList = new ArrayList(this.f306a.length);
        long j10 = j9;
        int i10 = 0;
        while (i10 < this.f306a.length) {
            for (int i11 = 0; i11 < sVarArr.length; i11++) {
                yArr3[i11] = iArr[i11] == i10 ? yArr[i11] : num;
                if (iArr2[i11] == i10) {
                    Z3.s sVar2 = (Z3.s) AbstractC1684a.e(sVarArr[i11]);
                    objArr[i11] = new a(sVar2, (g0) AbstractC1684a.e((g0) this.f310f.get(sVar2.k())));
                } else {
                    objArr[i11] = num;
                }
            }
            int i12 = i10;
            ArrayList arrayList2 = arrayList;
            Object[] objArr2 = objArr;
            long jI = this.f306a[i10].i(objArr, zArr, yArr3, zArr2, j10);
            if (i12 == 0) {
                j10 = jI;
            } else if (jI != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z9 = false;
            for (int i13 = 0; i13 < sVarArr.length; i13++) {
                if (iArr2[i13] == i12) {
                    Y y10 = (Y) AbstractC1684a.e(yArr3[i13]);
                    yArr2[i13] = yArr3[i13];
                    this.f307c.put(y10, Integer.valueOf(i12));
                    z9 = true;
                } else if (iArr[i13] == i12) {
                    AbstractC1684a.g(yArr3[i13] == 0);
                }
            }
            if (z9) {
                arrayList2.add(this.f306a[i12]);
            }
            i10 = i12 + 1;
            arrayList = arrayList2;
            objArr = objArr2;
            num = null;
        }
        System.arraycopy(yArr2, 0, yArr, 0, length);
        InterfaceC0517z[] interfaceC0517zArr = (InterfaceC0517z[]) arrayList.toArray(new InterfaceC0517z[0]);
        this.f313i = interfaceC0517zArr;
        this.f314j = this.f308d.a(interfaceC0517zArr);
        return j10;
    }

    @Override // B3.InterfaceC0517z
    public /* synthetic */ List k(List list) {
        return AbstractC0516y.a(this, list);
    }

    @Override // B3.InterfaceC0517z
    public long l(long j9) {
        long jL = this.f313i[0].l(j9);
        int i9 = 1;
        while (true) {
            InterfaceC0517z[] interfaceC0517zArr = this.f313i;
            if (i9 >= interfaceC0517zArr.length) {
                return jL;
            }
            if (interfaceC0517zArr[i9].l(jL) != jL) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i9++;
        }
    }

    @Override // B3.InterfaceC0517z
    public long m() {
        long j9 = -9223372036854775807L;
        for (InterfaceC0517z interfaceC0517z : this.f313i) {
            long jM = interfaceC0517z.m();
            if (jM == -9223372036854775807L) {
                if (j9 != -9223372036854775807L && interfaceC0517z.l(j9) != j9) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j9 == -9223372036854775807L) {
                for (InterfaceC0517z interfaceC0517z2 : this.f313i) {
                    if (interfaceC0517z2 == interfaceC0517z) {
                        break;
                    }
                    if (interfaceC0517z2.l(jM) != jM) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j9 = jM;
            } else if (jM != j9) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j9;
    }

    @Override // B3.Z.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(InterfaceC0517z interfaceC0517z) {
        ((InterfaceC0517z.a) AbstractC1684a.e(this.f311g)).j(this);
    }

    @Override // B3.InterfaceC0517z
    public void p() {
        for (InterfaceC0517z interfaceC0517z : this.f306a) {
            interfaceC0517z.p();
        }
    }

    @Override // B3.InterfaceC0517z
    public void s(InterfaceC0517z.a aVar, long j9) {
        this.f311g = aVar;
        Collections.addAll(this.f309e, this.f306a);
        for (InterfaceC0517z interfaceC0517z : this.f306a) {
            interfaceC0517z.s(this, j9);
        }
    }

    @Override // B3.InterfaceC0517z
    public i0 u() {
        return (i0) AbstractC1684a.e(this.f312h);
    }

    @Override // B3.InterfaceC0517z
    public void v(long j9, boolean z9) {
        for (InterfaceC0517z interfaceC0517z : this.f313i) {
            interfaceC0517z.v(j9, z9);
        }
    }
}
