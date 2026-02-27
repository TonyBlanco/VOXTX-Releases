package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1126k implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1125j f14700a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14701a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f14701a = iArr;
            try {
                iArr[r0.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14701a[r0.b.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14701a[r0.b.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14701a[r0.b.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14701a[r0.b.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14701a[r0.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14701a[r0.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14701a[r0.b.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14701a[r0.b.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14701a[r0.b.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14701a[r0.b.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14701a[r0.b.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C1126k(AbstractC1125j abstractC1125j) {
        AbstractC1125j abstractC1125j2 = (AbstractC1125j) AbstractC1139y.b(abstractC1125j, "output");
        this.f14700a = abstractC1125j2;
        abstractC1125j2.f14692a = this;
    }

    public static C1126k P(AbstractC1125j abstractC1125j) {
        C1126k c1126k = abstractC1125j.f14692a;
        return c1126k != null ? c1126k : new C1126k(abstractC1125j);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void A(int i9, long j9) {
        this.f14700a.x0(i9, j9);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void B(int i9, boolean z9) {
        this.f14700a.b0(i9, z9);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void C(int i9, int i10) {
        this.f14700a.D0(i9, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void D(int i9) {
        this.f14700a.N0(i9, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void E(int i9, List list, boolean z9) {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f14700a.n0(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.f14700a.N0(i9, 2);
        int iO = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iO += AbstractC1125j.o(((Long) list.get(i11)).longValue());
        }
        this.f14700a.P0(iO);
        while (i10 < list.size()) {
            this.f14700a.o0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void F(int i9, List list, boolean z9) {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f14700a.D0(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.f14700a.N0(i9, 2);
        int iG = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iG += AbstractC1125j.G(((Integer) list.get(i11)).intValue());
        }
        this.f14700a.P0(iG);
        while (i10 < list.size()) {
            this.f14700a.E0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void G(int i9, List list, boolean z9) {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f14700a.b0(i9, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        this.f14700a.N0(i9, 2);
        int iD = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iD += AbstractC1125j.d(((Boolean) list.get(i11)).booleanValue());
        }
        this.f14700a.P0(iD);
        while (i10 < list.size()) {
            this.f14700a.c0(((Boolean) list.get(i10)).booleanValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void H(int i9, float f9) {
        this.f14700a.p0(i9, f9);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void I(int i9) {
        this.f14700a.N0(i9, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void J(int i9, List list, boolean z9) {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f14700a.H0(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.f14700a.N0(i9, 2);
        int iK = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iK += AbstractC1125j.K(((Integer) list.get(i11)).intValue());
        }
        this.f14700a.P0(iK);
        while (i10 < list.size()) {
            this.f14700a.I0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void K(int i9, int i10) {
        this.f14700a.j0(i9, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void L(int i9, List list, boolean z9) {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f14700a.x0(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.f14700a.N0(i9, 2);
        int iX = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iX += AbstractC1125j.x(((Long) list.get(i11)).longValue());
        }
        this.f14700a.P0(iX);
        while (i10 < list.size()) {
            this.f14700a.y0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void M(int i9, List list, boolean z9) {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f14700a.h0(i9, ((Double) list.get(i10)).doubleValue());
                i10++;
            }
            return;
        }
        this.f14700a.N0(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += AbstractC1125j.i(((Double) list.get(i12)).doubleValue());
        }
        this.f14700a.P0(i11);
        while (i10 < list.size()) {
            this.f14700a.i0(((Double) list.get(i10)).doubleValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void N(int i9, int i10) {
        this.f14700a.H0(i9, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void O(int i9, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f14700a.f0(i9, (AbstractC1122g) list.get(i10));
        }
    }

    public final void Q(int i9, boolean z9, Object obj, H.a aVar) {
        this.f14700a.N0(i9, 2);
        this.f14700a.P0(H.b(aVar, Boolean.valueOf(z9), obj));
        H.e(this.f14700a, aVar, Boolean.valueOf(z9), obj);
    }

    public final void R(int i9, H.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Integer) it.next()).intValue();
            i10++;
        }
        Arrays.sort(iArr);
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = iArr[i11];
            Object obj = map.get(Integer.valueOf(i12));
            this.f14700a.N0(i9, 2);
            this.f14700a.P0(H.b(aVar, Integer.valueOf(i12), obj));
            H.e(this.f14700a, aVar, Integer.valueOf(i12), obj);
        }
    }

    public final void S(int i9, H.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        Arrays.sort(jArr);
        for (int i11 = 0; i11 < size; i11++) {
            long j9 = jArr[i11];
            Object obj = map.get(Long.valueOf(j9));
            this.f14700a.N0(i9, 2);
            this.f14700a.P0(H.b(aVar, Long.valueOf(j9), obj));
            H.e(this.f14700a, aVar, Long.valueOf(j9), obj);
        }
    }

    public final void T(int i9, H.a aVar, Map map) {
        switch (a.f14701a[aVar.f14581a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    Q(i9, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    Q(i9, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i9, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i9, aVar, map);
                return;
            case 12:
                U(i9, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f14581a);
        }
    }

    public final void U(int i9, H.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            strArr[i10] = (String) it.next();
            i10++;
        }
        Arrays.sort(strArr);
        for (int i11 = 0; i11 < size; i11++) {
            String str = strArr[i11];
            Object obj = map.get(str);
            this.f14700a.N0(i9, 2);
            this.f14700a.P0(H.b(aVar, str, obj));
            H.e(this.f14700a, aVar, str, obj);
        }
    }

    public final void V(int i9, Object obj) {
        if (obj instanceof String) {
            this.f14700a.L0(i9, (String) obj);
        } else {
            this.f14700a.f0(i9, (AbstractC1122g) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void a(int i9, List list, boolean z9) {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f14700a.p0(i9, ((Float) list.get(i10)).floatValue());
                i10++;
            }
            return;
        }
        this.f14700a.N0(i9, 2);
        int iQ = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iQ += AbstractC1125j.q(((Float) list.get(i11)).floatValue());
        }
        this.f14700a.P0(iQ);
        while (i10 < list.size()) {
            this.f14700a.q0(((Float) list.get(i10)).floatValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final void b(int i9, Object obj) {
        if (obj instanceof AbstractC1122g) {
            this.f14700a.C0(i9, (AbstractC1122g) obj);
        } else {
            this.f14700a.B0(i9, (O) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void c(int i9, int i10) {
        this.f14700a.l0(i9, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void d(int i9, List list) {
        int i10 = 0;
        if (!(list instanceof D)) {
            while (i10 < list.size()) {
                this.f14700a.L0(i9, (String) list.get(i10));
                i10++;
            }
        } else {
            D d9 = (D) list;
            while (i10 < list.size()) {
                V(i9, d9.G(i10));
                i10++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void e(int i9, List list, e0 e0Var) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            s(i9, list.get(i10), e0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void f(int i9, String str) {
        this.f14700a.L0(i9, str);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void g(int i9, long j9) {
        this.f14700a.Q0(i9, j9);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void h(int i9, List list, boolean z9) {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f14700a.v0(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.f14700a.N0(i9, 2);
        int iV = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iV += AbstractC1125j.v(((Integer) list.get(i11)).intValue());
        }
        this.f14700a.P0(iV);
        while (i10 < list.size()) {
            this.f14700a.w0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void i(int i9, int i10) {
        this.f14700a.v0(i9, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void j(int i9, AbstractC1122g abstractC1122g) {
        this.f14700a.f0(i9, abstractC1122g);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void k(int i9, long j9) {
        this.f14700a.F0(i9, j9);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void l(int i9, List list, boolean z9) {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f14700a.l0(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.f14700a.N0(i9, 2);
        int iM = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iM += AbstractC1125j.m(((Integer) list.get(i11)).intValue());
        }
        this.f14700a.P0(iM);
        while (i10 < list.size()) {
            this.f14700a.m0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void m(int i9, Object obj, e0 e0Var) {
        this.f14700a.z0(i9, (O) obj, e0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void n(int i9, List list, boolean z9) {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f14700a.O0(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.f14700a.N0(i9, 2);
        int iR = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iR += AbstractC1125j.R(((Integer) list.get(i11)).intValue());
        }
        this.f14700a.P0(iR);
        while (i10 < list.size()) {
            this.f14700a.P0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void o(int i9, List list, boolean z9) {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f14700a.J0(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.f14700a.N0(i9, 2);
        int iM = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iM += AbstractC1125j.M(((Long) list.get(i11)).longValue());
        }
        this.f14700a.P0(iM);
        while (i10 < list.size()) {
            this.f14700a.K0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void p(int i9, long j9) {
        this.f14700a.J0(i9, j9);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void q(int i9, List list, boolean z9) {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f14700a.j0(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.f14700a.N0(i9, 2);
        int iK = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iK += AbstractC1125j.k(((Integer) list.get(i11)).intValue());
        }
        this.f14700a.P0(iK);
        while (i10 < list.size()) {
            this.f14700a.k0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void r(int i9, H.a aVar, Map map) {
        if (this.f14700a.Y()) {
            T(i9, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f14700a.N0(i9, 2);
            this.f14700a.P0(H.b(aVar, entry.getKey(), entry.getValue()));
            H.e(this.f14700a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void s(int i9, Object obj, e0 e0Var) {
        this.f14700a.s0(i9, (O) obj, e0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void t(int i9, int i10) {
        this.f14700a.O0(i9, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void u(int i9, double d9) {
        this.f14700a.h0(i9, d9);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void v(int i9, List list, boolean z9) {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f14700a.F0(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.f14700a.N0(i9, 2);
        int I9 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            I9 += AbstractC1125j.I(((Long) list.get(i11)).longValue());
        }
        this.f14700a.P0(I9);
        while (i10 < list.size()) {
            this.f14700a.G0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void w(int i9, List list, boolean z9) {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f14700a.Q0(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.f14700a.N0(i9, 2);
        int iT = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iT += AbstractC1125j.T(((Long) list.get(i11)).longValue());
        }
        this.f14700a.P0(iT);
        while (i10 < list.size()) {
            this.f14700a.R0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void x(int i9, long j9) {
        this.f14700a.n0(i9, j9);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public s0.a y() {
        return s0.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void z(int i9, List list, e0 e0Var) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            m(i9, list.get(i10), e0Var);
        }
    }
}
