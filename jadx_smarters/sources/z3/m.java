package Z3;

import B3.C;
import B3.g0;
import B3.i0;
import O2.C0936z0;
import O2.C1;
import O2.D1;
import O2.E1;
import O2.F1;
import O2.InterfaceC0901n;
import O2.Q1;
import Q2.C1019e;
import Z3.C1067a;
import Z3.m;
import Z3.s;
import Z3.u;
import Z3.z;
import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.ads.AdError;
import com.google.android.gms.common.api.a;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.AbstractC1687d;
import d4.k0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;
import s5.AbstractC2736q;
import s5.AbstractC2743y;
import s5.Q;
import u0.ExecutorC2838w;

/* JADX INFO: loaded from: classes3.dex */
public class m extends u implements E1.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Q f11126k = Q.a(new Comparator() { // from class: Z3.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return m.T((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Q f11127l = Q.a(new Comparator() { // from class: Z3.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return m.U((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f11129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s.b f11130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f11131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f11132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f11133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C1019e f11134j;

    public static final class b extends i implements Comparable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f11135f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f11136g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f11137h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final d f11138i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f11139j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f11140k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f11141l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f11142m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f11143n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f11144o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f11145p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final boolean f11146q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f11147r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f11148s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f11149t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final int f11150u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final boolean f11151v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final boolean f11152w;

        public b(int i9, g0 g0Var, int i10, d dVar, int i11, boolean z9, r5.n nVar) {
            int i12;
            int iH;
            int iH2;
            super(i9, g0Var, i10);
            this.f11138i = dVar;
            this.f11137h = m.Y(this.f11235e.f6458d);
            this.f11139j = m.P(i11, false);
            int i13 = 0;
            while (true) {
                int size = dVar.f11311o.size();
                i12 = a.e.API_PRIORITY_OTHER;
                if (i13 >= size) {
                    i13 = a.e.API_PRIORITY_OTHER;
                    iH = 0;
                    break;
                } else {
                    iH = m.H(this.f11235e, (String) dVar.f11311o.get(i13), false);
                    if (iH > 0) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.f11141l = i13;
            this.f11140k = iH;
            this.f11142m = m.L(this.f11235e.f6460f, dVar.f11312p);
            C0936z0 c0936z0 = this.f11235e;
            int i14 = c0936z0.f6460f;
            this.f11143n = i14 == 0 || (i14 & 1) != 0;
            this.f11146q = (c0936z0.f6459e & 1) != 0;
            int i15 = c0936z0.f6480z;
            this.f11147r = i15;
            this.f11148s = c0936z0.f6447A;
            int i16 = c0936z0.f6463i;
            this.f11149t = i16;
            this.f11136g = (i16 == -1 || i16 <= dVar.f11314r) && (i15 == -1 || i15 <= dVar.f11313q) && nVar.apply(c0936z0);
            String[] strArrN0 = k0.n0();
            int i17 = 0;
            while (true) {
                if (i17 >= strArrN0.length) {
                    i17 = a.e.API_PRIORITY_OTHER;
                    iH2 = 0;
                    break;
                } else {
                    iH2 = m.H(this.f11235e, strArrN0[i17], false);
                    if (iH2 > 0) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            this.f11144o = i17;
            this.f11145p = iH2;
            int i18 = 0;
            while (true) {
                if (i18 < dVar.f11315s.size()) {
                    String str = this.f11235e.f6467m;
                    if (str != null && str.equals(dVar.f11315s.get(i18))) {
                        i12 = i18;
                        break;
                    }
                    i18++;
                } else {
                    break;
                }
            }
            this.f11150u = i12;
            this.f11151v = D1.e(i11) == 128;
            this.f11152w = D1.g(i11) == 64;
            this.f11135f = g(i11, z9);
        }

        public static int d(List list, List list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static AbstractC2743y f(int i9, g0 g0Var, d dVar, int[] iArr, boolean z9, r5.n nVar) {
            AbstractC2743y.a aVarP = AbstractC2743y.p();
            for (int i10 = 0; i10 < g0Var.f581a; i10++) {
                aVarP.a(new b(i9, g0Var, i10, dVar, iArr[i10], z9, nVar));
            }
            return aVarP.k();
        }

        @Override // Z3.m.i
        public int b() {
            return this.f11135f;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            Q qF = (this.f11136g && this.f11139j) ? m.f11126k : m.f11126k.f();
            AbstractC2736q abstractC2736qF = AbstractC2736q.j().g(this.f11139j, bVar.f11139j).f(Integer.valueOf(this.f11141l), Integer.valueOf(bVar.f11141l), Q.c().f()).d(this.f11140k, bVar.f11140k).d(this.f11142m, bVar.f11142m).g(this.f11146q, bVar.f11146q).g(this.f11143n, bVar.f11143n).f(Integer.valueOf(this.f11144o), Integer.valueOf(bVar.f11144o), Q.c().f()).d(this.f11145p, bVar.f11145p).g(this.f11136g, bVar.f11136g).f(Integer.valueOf(this.f11150u), Integer.valueOf(bVar.f11150u), Q.c().f()).f(Integer.valueOf(this.f11149t), Integer.valueOf(bVar.f11149t), this.f11138i.f11320x ? m.f11126k.f() : m.f11127l).g(this.f11151v, bVar.f11151v).g(this.f11152w, bVar.f11152w).f(Integer.valueOf(this.f11147r), Integer.valueOf(bVar.f11147r), qF).f(Integer.valueOf(this.f11148s), Integer.valueOf(bVar.f11148s), qF);
            Integer numValueOf = Integer.valueOf(this.f11149t);
            Integer numValueOf2 = Integer.valueOf(bVar.f11149t);
            if (!k0.c(this.f11137h, bVar.f11137h)) {
                qF = m.f11127l;
            }
            return abstractC2736qF.f(numValueOf, numValueOf2, qF).i();
        }

        public final int g(int i9, boolean z9) {
            if (!m.P(i9, this.f11138i.f11186s0)) {
                return 0;
            }
            if (!this.f11136g && !this.f11138i.f11180m0) {
                return 0;
            }
            if (m.P(i9, false) && this.f11136g && this.f11235e.f6463i != -1) {
                d dVar = this.f11138i;
                if (!dVar.f11321y && !dVar.f11320x && (dVar.f11188u0 || !z9)) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // Z3.m.i
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean c(b bVar) {
            int i9;
            String str;
            int i10;
            d dVar = this.f11138i;
            if ((dVar.f11183p0 || ((i10 = this.f11235e.f6480z) != -1 && i10 == bVar.f11235e.f6480z)) && (dVar.f11181n0 || ((str = this.f11235e.f6467m) != null && TextUtils.equals(str, bVar.f11235e.f6467m)))) {
                d dVar2 = this.f11138i;
                if ((dVar2.f11182o0 || ((i9 = this.f11235e.f6447A) != -1 && i9 == bVar.f11235e.f6447A)) && (dVar2.f11184q0 || (this.f11151v == bVar.f11151v && this.f11152w == bVar.f11152w))) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class c implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f11153a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f11154c;

        public c(C0936z0 c0936z0, int i9) {
            this.f11153a = (c0936z0.f6459e & 1) != 0;
            this.f11154c = m.P(i9, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return AbstractC2736q.j().g(this.f11154c, cVar.f11154c).g(this.f11153a, cVar.f11153a).i();
        }
    }

    public static final class d extends z implements InterfaceC0901n {

        /* JADX INFO: renamed from: A0, reason: collision with root package name */
        public static final String f11155A0;

        /* JADX INFO: renamed from: B0, reason: collision with root package name */
        public static final String f11156B0;

        /* JADX INFO: renamed from: C0, reason: collision with root package name */
        public static final String f11157C0;

        /* JADX INFO: renamed from: D0, reason: collision with root package name */
        public static final String f11158D0;

        /* JADX INFO: renamed from: E0, reason: collision with root package name */
        public static final String f11159E0;

        /* JADX INFO: renamed from: F0, reason: collision with root package name */
        public static final String f11160F0;

        /* JADX INFO: renamed from: G0, reason: collision with root package name */
        public static final String f11161G0;

        /* JADX INFO: renamed from: H0, reason: collision with root package name */
        public static final String f11162H0;

        /* JADX INFO: renamed from: I0, reason: collision with root package name */
        public static final String f11163I0;

        /* JADX INFO: renamed from: J0, reason: collision with root package name */
        public static final String f11164J0;

        /* JADX INFO: renamed from: K0, reason: collision with root package name */
        public static final String f11165K0;

        /* JADX INFO: renamed from: L0, reason: collision with root package name */
        public static final String f11166L0;

        /* JADX INFO: renamed from: M0, reason: collision with root package name */
        public static final String f11167M0;

        /* JADX INFO: renamed from: N0, reason: collision with root package name */
        public static final String f11168N0;

        /* JADX INFO: renamed from: O0, reason: collision with root package name */
        public static final String f11169O0;

        /* JADX INFO: renamed from: P0, reason: collision with root package name */
        public static final String f11170P0;

        /* JADX INFO: renamed from: Q0, reason: collision with root package name */
        public static final String f11171Q0;

        /* JADX INFO: renamed from: R0, reason: collision with root package name */
        public static final String f11172R0;

        /* JADX INFO: renamed from: S0, reason: collision with root package name */
        public static final InterfaceC0901n.a f11173S0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public static final d f11174y0;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public static final d f11175z0;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public final boolean f11176i0;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public final boolean f11177j0;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public final boolean f11178k0;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public final boolean f11179l0;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public final boolean f11180m0;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public final boolean f11181n0;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public final boolean f11182o0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final boolean f11183p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f11184q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f11185r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f11186s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f11187t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f11188u0;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public final boolean f11189v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final SparseArray f11190w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final SparseBooleanArray f11191x0;

        public static final class a extends z.a {

            /* JADX INFO: renamed from: A, reason: collision with root package name */
            public boolean f11192A;

            /* JADX INFO: renamed from: B, reason: collision with root package name */
            public boolean f11193B;

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            public boolean f11194C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public boolean f11195D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            public boolean f11196E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            public boolean f11197F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            public boolean f11198G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            public boolean f11199H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            public boolean f11200I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            public boolean f11201J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            public boolean f11202K;

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            public boolean f11203L;

            /* JADX INFO: renamed from: M, reason: collision with root package name */
            public boolean f11204M;

            /* JADX INFO: renamed from: N, reason: collision with root package name */
            public boolean f11205N;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            public final SparseArray f11206O;

            /* JADX INFO: renamed from: P, reason: collision with root package name */
            public final SparseBooleanArray f11207P;

            public a() {
                this.f11206O = new SparseArray();
                this.f11207P = new SparseBooleanArray();
                i0();
            }

            public a(d dVar) {
                super(dVar);
                this.f11192A = dVar.f11176i0;
                this.f11193B = dVar.f11177j0;
                this.f11194C = dVar.f11178k0;
                this.f11195D = dVar.f11179l0;
                this.f11196E = dVar.f11180m0;
                this.f11197F = dVar.f11181n0;
                this.f11198G = dVar.f11182o0;
                this.f11199H = dVar.f11183p0;
                this.f11200I = dVar.f11184q0;
                this.f11201J = dVar.f11185r0;
                this.f11202K = dVar.f11186s0;
                this.f11203L = dVar.f11187t0;
                this.f11204M = dVar.f11188u0;
                this.f11205N = dVar.f11189v0;
                this.f11206O = h0(dVar.f11190w0);
                this.f11207P = dVar.f11191x0.clone();
            }

            public a(Context context) {
                super(context);
                this.f11206O = new SparseArray();
                this.f11207P = new SparseBooleanArray();
                i0();
            }

            public a(Bundle bundle) {
                super(bundle);
                i0();
                d dVar = d.f11174y0;
                y0(bundle.getBoolean(d.f11155A0, dVar.f11176i0));
                s0(bundle.getBoolean(d.f11156B0, dVar.f11177j0));
                t0(bundle.getBoolean(d.f11157C0, dVar.f11178k0));
                r0(bundle.getBoolean(d.f11169O0, dVar.f11179l0));
                w0(bundle.getBoolean(d.f11158D0, dVar.f11180m0));
                n0(bundle.getBoolean(d.f11159E0, dVar.f11181n0));
                o0(bundle.getBoolean(d.f11160F0, dVar.f11182o0));
                l0(bundle.getBoolean(d.f11161G0, dVar.f11183p0));
                m0(bundle.getBoolean(d.f11170P0, dVar.f11184q0));
                u0(bundle.getBoolean(d.f11171Q0, dVar.f11185r0));
                x0(bundle.getBoolean(d.f11162H0, dVar.f11186s0));
                G0(bundle.getBoolean(d.f11163I0, dVar.f11187t0));
                q0(bundle.getBoolean(d.f11164J0, dVar.f11188u0));
                p0(bundle.getBoolean(d.f11172R0, dVar.f11189v0));
                this.f11206O = new SparseArray();
                E0(bundle);
                this.f11207P = j0(bundle.getIntArray(d.f11168N0));
            }

            public static SparseArray h0(SparseArray sparseArray) {
                SparseArray sparseArray2 = new SparseArray();
                for (int i9 = 0; i9 < sparseArray.size(); i9++) {
                    sparseArray2.put(sparseArray.keyAt(i9), new HashMap((Map) sparseArray.valueAt(i9)));
                }
                return sparseArray2;
            }

            @Override // Z3.z.a
            /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
            public a H(int i9) {
                super.H(i9);
                return this;
            }

            @Override // Z3.z.a
            /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
            public a I(x xVar) {
                super.I(xVar);
                return this;
            }

            @Override // Z3.z.a
            /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
            public a J(Context context) {
                super.J(context);
                return this;
            }

            public a D0(int i9, i0 i0Var, f fVar) {
                Map map = (Map) this.f11206O.get(i9);
                if (map == null) {
                    map = new HashMap();
                    this.f11206O.put(i9, map);
                }
                if (map.containsKey(i0Var) && k0.c(map.get(i0Var), fVar)) {
                    return this;
                }
                map.put(i0Var, fVar);
                return this;
            }

            public final void E0(Bundle bundle) {
                int[] intArray = bundle.getIntArray(d.f11165K0);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(d.f11166L0);
                AbstractC2743y abstractC2743yZ = parcelableArrayList == null ? AbstractC2743y.z() : AbstractC1687d.d(i0.f589g, parcelableArrayList);
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(d.f11167M0);
                SparseArray sparseArray = sparseParcelableArray == null ? new SparseArray() : AbstractC1687d.e(f.f11212i, sparseParcelableArray);
                if (intArray == null || intArray.length != abstractC2743yZ.size()) {
                    return;
                }
                for (int i9 = 0; i9 < intArray.length; i9++) {
                    D0(intArray[i9], (i0) abstractC2743yZ.get(i9), (f) sparseArray.get(i9));
                }
            }

            @Override // Z3.z.a
            /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
            public a L(int i9, boolean z9) {
                super.L(i9, z9);
                return this;
            }

            public a G0(boolean z9) {
                this.f11203L = z9;
                return this;
            }

            @Override // Z3.z.a
            /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
            public a M(int i9, int i10, boolean z9) {
                super.M(i9, i10, z9);
                return this;
            }

            @Override // Z3.z.a
            /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
            public a N(Context context, boolean z9) {
                super.N(context, z9);
                return this;
            }

            @Override // Z3.z.a
            /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
            public a A(x xVar) {
                super.A(xVar);
                return this;
            }

            @Override // Z3.z.a
            /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
            public d B() {
                return new d(this);
            }

            @Override // Z3.z.a
            /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
            public a C(int i9) {
                super.C(i9);
                return this;
            }

            public final void i0() {
                this.f11192A = true;
                this.f11193B = false;
                this.f11194C = true;
                this.f11195D = false;
                this.f11196E = true;
                this.f11197F = false;
                this.f11198G = false;
                this.f11199H = false;
                this.f11200I = false;
                this.f11201J = true;
                this.f11202K = true;
                this.f11203L = false;
                this.f11204M = true;
                this.f11205N = false;
            }

            public final SparseBooleanArray j0(int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i9 : iArr) {
                    sparseBooleanArray.append(i9, true);
                }
                return sparseBooleanArray;
            }

            public a k0(z zVar) {
                super.F(zVar);
                return this;
            }

            public a l0(boolean z9) {
                this.f11199H = z9;
                return this;
            }

            public a m0(boolean z9) {
                this.f11200I = z9;
                return this;
            }

            public a n0(boolean z9) {
                this.f11197F = z9;
                return this;
            }

            public a o0(boolean z9) {
                this.f11198G = z9;
                return this;
            }

            public a p0(boolean z9) {
                this.f11205N = z9;
                return this;
            }

            public a q0(boolean z9) {
                this.f11204M = z9;
                return this;
            }

            public a r0(boolean z9) {
                this.f11195D = z9;
                return this;
            }

            public a s0(boolean z9) {
                this.f11193B = z9;
                return this;
            }

            public a t0(boolean z9) {
                this.f11194C = z9;
                return this;
            }

            public a u0(boolean z9) {
                this.f11201J = z9;
                return this;
            }

            public a v0(int i9) {
                return H(i9);
            }

            public a w0(boolean z9) {
                this.f11196E = z9;
                return this;
            }

            public a x0(boolean z9) {
                this.f11202K = z9;
                return this;
            }

            public a y0(boolean z9) {
                this.f11192A = z9;
                return this;
            }

            public a z0(boolean z9) {
                super.G(z9);
                return this;
            }
        }

        static {
            d dVarB = new a().B();
            f11174y0 = dVarB;
            f11175z0 = dVarB;
            f11155A0 = k0.A0(1000);
            f11156B0 = k0.A0(1001);
            f11157C0 = k0.A0(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE);
            f11158D0 = k0.A0(1003);
            f11159E0 = k0.A0(1004);
            f11160F0 = k0.A0(WebSocketProtocol.CLOSE_NO_STATUS_CODE);
            f11161G0 = k0.A0(1006);
            f11162H0 = k0.A0(1007);
            f11163I0 = k0.A0(1008);
            f11164J0 = k0.A0(1009);
            f11165K0 = k0.A0(1010);
            f11166L0 = k0.A0(1011);
            f11167M0 = k0.A0(1012);
            f11168N0 = k0.A0(1013);
            f11169O0 = k0.A0(1014);
            f11170P0 = k0.A0(1015);
            f11171Q0 = k0.A0(1016);
            f11172R0 = k0.A0(1017);
            f11173S0 = new InterfaceC0901n.a() { // from class: Z3.n
                @Override // O2.InterfaceC0901n.a
                public final InterfaceC0901n a(Bundle bundle) {
                    return m.d.P(bundle);
                }
            };
        }

        public d(a aVar) {
            super(aVar);
            this.f11176i0 = aVar.f11192A;
            this.f11177j0 = aVar.f11193B;
            this.f11178k0 = aVar.f11194C;
            this.f11179l0 = aVar.f11195D;
            this.f11180m0 = aVar.f11196E;
            this.f11181n0 = aVar.f11197F;
            this.f11182o0 = aVar.f11198G;
            this.f11183p0 = aVar.f11199H;
            this.f11184q0 = aVar.f11200I;
            this.f11185r0 = aVar.f11201J;
            this.f11186s0 = aVar.f11202K;
            this.f11187t0 = aVar.f11203L;
            this.f11188u0 = aVar.f11204M;
            this.f11189v0 = aVar.f11205N;
            this.f11190w0 = aVar.f11206O;
            this.f11191x0 = aVar.f11207P;
        }

        public static boolean G(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i9 = 0; i9 < size; i9++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i9)) < 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean H(SparseArray sparseArray, SparseArray sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i9 = 0; i9 < size; i9++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i9));
                if (iIndexOfKey < 0 || !I((Map) sparseArray.valueAt(i9), (Map) sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public static boolean I(Map map, Map map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry entry : map.entrySet()) {
                i0 i0Var = (i0) entry.getKey();
                if (!map2.containsKey(i0Var) || !k0.c(entry.getValue(), map2.get(i0Var))) {
                    return false;
                }
            }
            return true;
        }

        public static d K(Context context) {
            return new a(context).B();
        }

        public static int[] L(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i9 = 0; i9 < sparseBooleanArray.size(); i9++) {
                iArr[i9] = sparseBooleanArray.keyAt(i9);
            }
            return iArr;
        }

        public static /* synthetic */ d P(Bundle bundle) {
            return new a(bundle).B();
        }

        public static void Q(Bundle bundle, SparseArray sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i9 = 0; i9 < sparseArray.size(); i9++) {
                int iKeyAt = sparseArray.keyAt(i9);
                for (Map.Entry entry : ((Map) sparseArray.valueAt(i9)).entrySet()) {
                    f fVar = (f) entry.getValue();
                    if (fVar != null) {
                        sparseArray2.put(arrayList2.size(), fVar);
                    }
                    arrayList2.add((i0) entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(f11165K0, w5.f.l(arrayList));
                bundle.putParcelableArrayList(f11166L0, AbstractC1687d.i(arrayList2));
                bundle.putSparseParcelableArray(f11167M0, AbstractC1687d.j(sparseArray2));
            }
        }

        @Override // Z3.z
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public a B() {
            return new a();
        }

        public boolean M(int i9) {
            return this.f11191x0.get(i9);
        }

        public f N(int i9, i0 i0Var) {
            Map map = (Map) this.f11190w0.get(i9);
            if (map != null) {
                return (f) map.get(i0Var);
            }
            return null;
        }

        public boolean O(int i9, i0 i0Var) {
            Map map = (Map) this.f11190w0.get(i9);
            return map != null && map.containsKey(i0Var);
        }

        @Override // Z3.z
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return super.equals(dVar) && this.f11176i0 == dVar.f11176i0 && this.f11177j0 == dVar.f11177j0 && this.f11178k0 == dVar.f11178k0 && this.f11179l0 == dVar.f11179l0 && this.f11180m0 == dVar.f11180m0 && this.f11181n0 == dVar.f11181n0 && this.f11182o0 == dVar.f11182o0 && this.f11183p0 == dVar.f11183p0 && this.f11184q0 == dVar.f11184q0 && this.f11185r0 == dVar.f11185r0 && this.f11186s0 == dVar.f11186s0 && this.f11187t0 == dVar.f11187t0 && this.f11188u0 == dVar.f11188u0 && this.f11189v0 == dVar.f11189v0 && G(this.f11191x0, dVar.f11191x0) && H(this.f11190w0, dVar.f11190w0);
        }

        @Override // Z3.z, O2.InterfaceC0901n
        public Bundle h() {
            Bundle bundleH = super.h();
            bundleH.putBoolean(f11155A0, this.f11176i0);
            bundleH.putBoolean(f11156B0, this.f11177j0);
            bundleH.putBoolean(f11157C0, this.f11178k0);
            bundleH.putBoolean(f11169O0, this.f11179l0);
            bundleH.putBoolean(f11158D0, this.f11180m0);
            bundleH.putBoolean(f11159E0, this.f11181n0);
            bundleH.putBoolean(f11160F0, this.f11182o0);
            bundleH.putBoolean(f11161G0, this.f11183p0);
            bundleH.putBoolean(f11170P0, this.f11184q0);
            bundleH.putBoolean(f11171Q0, this.f11185r0);
            bundleH.putBoolean(f11162H0, this.f11186s0);
            bundleH.putBoolean(f11163I0, this.f11187t0);
            bundleH.putBoolean(f11164J0, this.f11188u0);
            bundleH.putBoolean(f11172R0, this.f11189v0);
            Q(bundleH, this.f11190w0);
            bundleH.putIntArray(f11168N0, L(this.f11191x0));
            return bundleH;
        }

        @Override // Z3.z
        public int hashCode() {
            return ((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f11176i0 ? 1 : 0)) * 31) + (this.f11177j0 ? 1 : 0)) * 31) + (this.f11178k0 ? 1 : 0)) * 31) + (this.f11179l0 ? 1 : 0)) * 31) + (this.f11180m0 ? 1 : 0)) * 31) + (this.f11181n0 ? 1 : 0)) * 31) + (this.f11182o0 ? 1 : 0)) * 31) + (this.f11183p0 ? 1 : 0)) * 31) + (this.f11184q0 ? 1 : 0)) * 31) + (this.f11185r0 ? 1 : 0)) * 31) + (this.f11186s0 ? 1 : 0)) * 31) + (this.f11187t0 ? 1 : 0)) * 31) + (this.f11188u0 ? 1 : 0)) * 31) + (this.f11189v0 ? 1 : 0);
        }
    }

    public static final class e extends z.a {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public final d.a f11208A;

        public e(Context context) {
            this.f11208A = new d.a(context);
        }

        @Override // Z3.z.a
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public e A(x xVar) {
            this.f11208A.A(xVar);
            return this;
        }

        @Override // Z3.z.a
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public d B() {
            return this.f11208A.B();
        }

        @Override // Z3.z.a
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public e C(int i9) {
            this.f11208A.C(i9);
            return this;
        }

        public e R(int i9) {
            this.f11208A.v0(i9);
            return this;
        }

        @Override // Z3.z.a
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public e H(int i9) {
            this.f11208A.H(i9);
            return this;
        }

        @Override // Z3.z.a
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public e I(x xVar) {
            this.f11208A.I(xVar);
            return this;
        }

        @Override // Z3.z.a
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public e J(Context context) {
            this.f11208A.J(context);
            return this;
        }

        @Override // Z3.z.a
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public e L(int i9, boolean z9) {
            this.f11208A.L(i9, z9);
            return this;
        }

        @Override // Z3.z.a
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public e M(int i9, int i10, boolean z9) {
            this.f11208A.M(i9, i10, z9);
            return this;
        }

        @Override // Z3.z.a
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public e N(Context context, boolean z9) {
            this.f11208A.N(context, z9);
            return this;
        }
    }

    public static final class f implements InterfaceC0901n {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f11209f = k0.A0(0);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f11210g = k0.A0(1);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f11211h = k0.A0(2);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final InterfaceC0901n.a f11212i = new InterfaceC0901n.a() { // from class: Z3.o
            @Override // O2.InterfaceC0901n.a
            public final InterfaceC0901n a(Bundle bundle) {
                return m.f.b(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11213a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f11214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f11215d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f11216e;

        public f(int i9, int[] iArr, int i10) {
            this.f11213a = i9;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f11214c = iArrCopyOf;
            this.f11215d = iArr.length;
            this.f11216e = i10;
            Arrays.sort(iArrCopyOf);
        }

        public static /* synthetic */ f b(Bundle bundle) {
            int i9 = bundle.getInt(f11209f, -1);
            int[] intArray = bundle.getIntArray(f11210g);
            int i10 = bundle.getInt(f11211h, -1);
            AbstractC1684a.a(i9 >= 0 && i10 >= 0);
            AbstractC1684a.e(intArray);
            return new f(i9, intArray, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            return this.f11213a == fVar.f11213a && Arrays.equals(this.f11214c, fVar.f11214c) && this.f11216e == fVar.f11216e;
        }

        @Override // O2.InterfaceC0901n
        public Bundle h() {
            Bundle bundle = new Bundle();
            bundle.putInt(f11209f, this.f11213a);
            bundle.putIntArray(f11210g, this.f11214c);
            bundle.putInt(f11211h, this.f11216e);
            return bundle;
        }

        public int hashCode() {
            return (((this.f11213a * 31) + Arrays.hashCode(this.f11214c)) * 31) + this.f11216e;
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Spatializer f11217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f11218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Handler f11219c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Spatializer.OnSpatializerStateChangedListener f11220d;

        public class a implements Spatializer.OnSpatializerStateChangedListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ m f11221a;

            public a(m mVar) {
                this.f11221a = mVar;
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z9) {
                this.f11221a.W();
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z9) {
                this.f11221a.W();
            }
        }

        public g(Spatializer spatializer) {
            this.f11217a = spatializer;
            this.f11218b = spatializer.getImmersiveAudioLevel() != 0;
        }

        public static g g(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new g(audioManager.getSpatializer());
        }

        public boolean a(C1019e c1019e, C0936z0 c0936z0) {
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(k0.I(("audio/eac3-joc".equals(c0936z0.f6467m) && c0936z0.f6480z == 16) ? 12 : c0936z0.f6480z));
            int i9 = c0936z0.f6447A;
            if (i9 != -1) {
                channelMask.setSampleRate(i9);
            }
            return this.f11217a.canBeSpatialized(c1019e.b().f7797a, channelMask.build());
        }

        public void b(m mVar, Looper looper) {
            if (this.f11220d == null && this.f11219c == null) {
                this.f11220d = new a(mVar);
                Handler handler = new Handler(looper);
                this.f11219c = handler;
                Spatializer spatializer = this.f11217a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new ExecutorC2838w(handler), this.f11220d);
            }
        }

        public boolean c() {
            return this.f11217a.isAvailable();
        }

        public boolean d() {
            return this.f11217a.isEnabled();
        }

        public boolean e() {
            return this.f11218b;
        }

        public void f() {
            Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.f11220d;
            if (onSpatializerStateChangedListener == null || this.f11219c == null) {
                return;
            }
            this.f11217a.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            ((Handler) k0.j(this.f11219c)).removeCallbacksAndMessages(null);
            this.f11219c = null;
            this.f11220d = null;
        }
    }

    public static final class h extends i implements Comparable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f11223f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f11224g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f11225h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f11226i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f11227j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f11228k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f11229l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f11230m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f11231n;

        public h(int i9, g0 g0Var, int i10, d dVar, int i11, String str) {
            int iH;
            super(i9, g0Var, i10);
            int i12 = 0;
            this.f11224g = m.P(i11, false);
            int i13 = this.f11235e.f6459e & (~dVar.f11318v);
            this.f11225h = (i13 & 1) != 0;
            this.f11226i = (i13 & 2) != 0;
            AbstractC2743y abstractC2743yA = dVar.f11316t.isEmpty() ? AbstractC2743y.A("") : dVar.f11316t;
            int i14 = 0;
            while (true) {
                if (i14 >= abstractC2743yA.size()) {
                    i14 = a.e.API_PRIORITY_OTHER;
                    iH = 0;
                    break;
                } else {
                    iH = m.H(this.f11235e, (String) abstractC2743yA.get(i14), dVar.f11319w);
                    if (iH > 0) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.f11227j = i14;
            this.f11228k = iH;
            int iL = m.L(this.f11235e.f6460f, dVar.f11317u);
            this.f11229l = iL;
            this.f11231n = (this.f11235e.f6460f & 1088) != 0;
            int iH2 = m.H(this.f11235e, str, m.Y(str) == null);
            this.f11230m = iH2;
            boolean z9 = iH > 0 || (dVar.f11316t.isEmpty() && iL > 0) || this.f11225h || (this.f11226i && iH2 > 0);
            if (m.P(i11, dVar.f11186s0) && z9) {
                i12 = 1;
            }
            this.f11223f = i12;
        }

        public static int d(List list, List list2) {
            return ((h) list.get(0)).compareTo((h) list2.get(0));
        }

        public static AbstractC2743y f(int i9, g0 g0Var, d dVar, int[] iArr, String str) {
            AbstractC2743y.a aVarP = AbstractC2743y.p();
            for (int i10 = 0; i10 < g0Var.f581a; i10++) {
                aVarP.a(new h(i9, g0Var, i10, dVar, iArr[i10], str));
            }
            return aVarP.k();
        }

        @Override // Z3.m.i
        public int b() {
            return this.f11223f;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(h hVar) {
            AbstractC2736q abstractC2736qD = AbstractC2736q.j().g(this.f11224g, hVar.f11224g).f(Integer.valueOf(this.f11227j), Integer.valueOf(hVar.f11227j), Q.c().f()).d(this.f11228k, hVar.f11228k).d(this.f11229l, hVar.f11229l).g(this.f11225h, hVar.f11225h).f(Boolean.valueOf(this.f11226i), Boolean.valueOf(hVar.f11226i), this.f11228k == 0 ? Q.c() : Q.c().f()).d(this.f11230m, hVar.f11230m);
            if (this.f11229l == 0) {
                abstractC2736qD = abstractC2736qD.h(this.f11231n, hVar.f11231n);
            }
            return abstractC2736qD.i();
        }

        @Override // Z3.m.i
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean c(h hVar) {
            return false;
        }
    }

    public static abstract class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11232a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g0 f11233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f11234d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final C0936z0 f11235e;

        public interface a {
            List a(int i9, g0 g0Var, int[] iArr);
        }

        public i(int i9, g0 g0Var, int i10) {
            this.f11232a = i9;
            this.f11233c = g0Var;
            this.f11234d = i10;
            this.f11235e = g0Var.c(i10);
        }

        public abstract int b();

        public abstract boolean c(i iVar);
    }

    public static final class j extends i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f11236f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final d f11237g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f11238h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f11239i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f11240j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f11241k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f11242l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f11243m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f11244n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f11245o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f11246p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final boolean f11247q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final boolean f11248r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f11249s;

        /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public j(int r5, B3.g0 r6, int r7, Z3.m.d r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instruction units count: 246
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Z3.m.j.<init>(int, B3.g0, int, Z3.m$d, int, int, boolean):void");
        }

        public static int f(j jVar, j jVar2) {
            AbstractC2736q abstractC2736qG = AbstractC2736q.j().g(jVar.f11239i, jVar2.f11239i).d(jVar.f11243m, jVar2.f11243m).g(jVar.f11244n, jVar2.f11244n).g(jVar.f11236f, jVar2.f11236f).g(jVar.f11238h, jVar2.f11238h).f(Integer.valueOf(jVar.f11242l), Integer.valueOf(jVar2.f11242l), Q.c().f()).g(jVar.f11247q, jVar2.f11247q).g(jVar.f11248r, jVar2.f11248r);
            if (jVar.f11247q && jVar.f11248r) {
                abstractC2736qG = abstractC2736qG.d(jVar.f11249s, jVar2.f11249s);
            }
            return abstractC2736qG.i();
        }

        public static int g(j jVar, j jVar2) {
            Q qF = (jVar.f11236f && jVar.f11239i) ? m.f11126k : m.f11126k.f();
            return AbstractC2736q.j().f(Integer.valueOf(jVar.f11240j), Integer.valueOf(jVar2.f11240j), jVar.f11237g.f11320x ? m.f11126k.f() : m.f11127l).f(Integer.valueOf(jVar.f11241k), Integer.valueOf(jVar2.f11241k), qF).f(Integer.valueOf(jVar.f11240j), Integer.valueOf(jVar2.f11240j), qF).i();
        }

        public static int h(List list, List list2) {
            return AbstractC2736q.j().f((j) Collections.max(list, new Comparator() { // from class: Z3.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return m.j.f((m.j) obj, (m.j) obj2);
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: Z3.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return m.j.f((m.j) obj, (m.j) obj2);
                }
            }), new Comparator() { // from class: Z3.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return m.j.f((m.j) obj, (m.j) obj2);
                }
            }).d(list.size(), list2.size()).f((j) Collections.max(list, new Comparator() { // from class: Z3.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return m.j.g((m.j) obj, (m.j) obj2);
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: Z3.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return m.j.g((m.j) obj, (m.j) obj2);
                }
            }), new Comparator() { // from class: Z3.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return m.j.g((m.j) obj, (m.j) obj2);
                }
            }).i();
        }

        public static AbstractC2743y i(int i9, g0 g0Var, d dVar, int[] iArr, int i10) {
            int I9 = m.I(g0Var, dVar.f11306j, dVar.f11307k, dVar.f11308l);
            AbstractC2743y.a aVarP = AbstractC2743y.p();
            for (int i11 = 0; i11 < g0Var.f581a; i11++) {
                int iF = g0Var.c(i11).f();
                aVarP.a(new j(i9, g0Var, i11, dVar, iArr[i11], i10, I9 == Integer.MAX_VALUE || (iF != -1 && iF <= I9)));
            }
            return aVarP.k();
        }

        @Override // Z3.m.i
        public int b() {
            return this.f11246p;
        }

        public final int j(int i9, int i10) {
            if ((this.f11235e.f6460f & Http2.INITIAL_MAX_FRAME_SIZE) != 0 || !m.P(i9, this.f11237g.f11186s0)) {
                return 0;
            }
            if (!this.f11236f && !this.f11237g.f11176i0) {
                return 0;
            }
            if (m.P(i9, false) && this.f11238h && this.f11236f && this.f11235e.f6463i != -1) {
                d dVar = this.f11237g;
                if (!dVar.f11321y && !dVar.f11320x && (i9 & i10) != 0) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // Z3.m.i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public boolean c(j jVar) {
            return (this.f11245o || k0.c(this.f11235e.f6467m, jVar.f11235e.f6467m)) && (this.f11237g.f11179l0 || (this.f11247q == jVar.f11247q && this.f11248r == jVar.f11248r));
        }
    }

    public m(z zVar, s.b bVar) {
        this(zVar, bVar, (Context) null);
    }

    public m(z zVar, s.b bVar, Context context) {
        d dVarB;
        this.f11128d = new Object();
        this.f11129e = context != null ? context.getApplicationContext() : null;
        this.f11130f = bVar;
        if (zVar instanceof d) {
            dVarB = (d) zVar;
        } else {
            dVarB = (context == null ? d.f11174y0 : d.K(context)).B().k0(zVar).B();
        }
        this.f11132h = dVarB;
        this.f11134j = C1019e.f7784h;
        boolean z9 = context != null && k0.I0(context);
        this.f11131g = z9;
        if (!z9 && context != null && k0.f39777a >= 32) {
            this.f11133i = g.g(context);
        }
        if (this.f11132h.f11185r0 && context == null) {
            AbstractC1681B.j("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public m(Context context) {
        this(context, new C1067a.b());
    }

    public m(Context context, s.b bVar) {
        this(context, d.K(context), bVar);
    }

    public m(Context context, z zVar, s.b bVar) {
        this(zVar, bVar, context);
    }

    public static void E(u.a aVar, d dVar, s.a[] aVarArr) {
        int iD = aVar.d();
        for (int i9 = 0; i9 < iD; i9++) {
            i0 i0VarF = aVar.f(i9);
            if (dVar.O(i9, i0VarF)) {
                f fVarN = dVar.N(i9, i0VarF);
                aVarArr[i9] = (fVarN == null || fVarN.f11214c.length == 0) ? null : new s.a(i0VarF.b(fVarN.f11213a), fVarN.f11214c, fVarN.f11216e);
            }
        }
    }

    public static void F(u.a aVar, z zVar, s.a[] aVarArr) {
        int iD = aVar.d();
        HashMap map = new HashMap();
        for (int i9 = 0; i9 < iD; i9++) {
            G(aVar.f(i9), zVar, map);
        }
        G(aVar.h(), zVar, map);
        for (int i10 = 0; i10 < iD; i10++) {
            x xVar = (x) map.get(Integer.valueOf(aVar.e(i10)));
            if (xVar != null) {
                aVarArr[i10] = (xVar.f11267c.isEmpty() || aVar.f(i10).c(xVar.f11266a) == -1) ? null : new s.a(xVar.f11266a, w5.f.l(xVar.f11267c));
            }
        }
    }

    public static void G(i0 i0Var, z zVar, Map map) {
        x xVar;
        for (int i9 = 0; i9 < i0Var.f590a; i9++) {
            x xVar2 = (x) zVar.f11322z.get(i0Var.b(i9));
            if (xVar2 != null && ((xVar = (x) map.get(Integer.valueOf(xVar2.b()))) == null || (xVar.f11267c.isEmpty() && !xVar2.f11267c.isEmpty()))) {
                map.put(Integer.valueOf(xVar2.b()), xVar2);
            }
        }
    }

    public static int H(C0936z0 c0936z0, String str, boolean z9) {
        if (!TextUtils.isEmpty(str) && str.equals(c0936z0.f6458d)) {
            return 4;
        }
        String strY = Y(str);
        String strY2 = Y(c0936z0.f6458d);
        if (strY2 == null || strY == null) {
            return (z9 && strY2 == null) ? 1 : 0;
        }
        if (strY2.startsWith(strY) || strY.startsWith(strY2)) {
            return 3;
        }
        return k0.j1(strY2, "-")[0].equals(k0.j1(strY, "-")[0]) ? 2 : 0;
    }

    public static int I(g0 g0Var, int i9, int i10, boolean z9) {
        int i11;
        int i12 = a.e.API_PRIORITY_OTHER;
        if (i9 != Integer.MAX_VALUE && i10 != Integer.MAX_VALUE) {
            for (int i13 = 0; i13 < g0Var.f581a; i13++) {
                C0936z0 c0936z0C = g0Var.c(i13);
                int i14 = c0936z0C.f6472r;
                if (i14 > 0 && (i11 = c0936z0C.f6473s) > 0) {
                    Point pointJ = J(z9, i9, i10, i14, i11);
                    int i15 = c0936z0C.f6472r;
                    int i16 = c0936z0C.f6473s;
                    int i17 = i15 * i16;
                    if (i15 >= ((int) (pointJ.x * 0.98f)) && i16 >= ((int) (pointJ.y * 0.98f)) && i17 < i12) {
                        i12 = i17;
                    }
                }
            }
        }
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Point J(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            if (r4 <= r5) goto Lc
            r3 = 1
        Lc:
            if (r1 == r3) goto Lf
            goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = d4.k0.l(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = d4.k0.l(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Z3.m.J(boolean, int, int, int, int):android.graphics.Point");
    }

    public static int L(int i9, int i10) {
        return (i9 == 0 || i9 != i10) ? Integer.bitCount(i9 & i10) : a.e.API_PRIORITY_OTHER;
    }

    public static int M(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public static boolean O(C0936z0 c0936z0) {
        String str = c0936z0.f6467m;
        if (str == null) {
            return false;
        }
        str.hashCode();
        switch (str) {
        }
        return false;
    }

    public static boolean P(int i9, boolean z9) {
        int iF = D1.f(i9);
        return iF == 4 || (z9 && iF == 3);
    }

    public static /* synthetic */ List R(d dVar, String str, int i9, g0 g0Var, int[] iArr) {
        return h.f(i9, g0Var, dVar, iArr, str);
    }

    public static /* synthetic */ List S(d dVar, int[] iArr, int i9, g0 g0Var, int[] iArr2) {
        return j.i(i9, g0Var, dVar, iArr2, iArr[i9]);
    }

    public static /* synthetic */ int T(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public static /* synthetic */ int U(Integer num, Integer num2) {
        return 0;
    }

    public static void V(u.a aVar, int[][][] iArr, F1[] f1Arr, s[] sVarArr) {
        boolean z9;
        boolean z10 = false;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < aVar.d(); i11++) {
            int iE = aVar.e(i11);
            s sVar = sVarArr[i11];
            if ((iE == 1 || iE == 2) && sVar != null && Z(iArr[i11], aVar.f(i11), sVar)) {
                if (iE == 1) {
                    if (i10 != -1) {
                        z9 = false;
                        break;
                    }
                    i10 = i11;
                } else {
                    if (i9 != -1) {
                        z9 = false;
                        break;
                    }
                    i9 = i11;
                }
            }
        }
        z9 = true;
        if (i10 != -1 && i9 != -1) {
            z10 = true;
        }
        if (z9 && z10) {
            F1 f12 = new F1(true);
            f1Arr[i10] = f12;
            f1Arr[i9] = f12;
        }
    }

    public static String Y(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean Z(int[][] iArr, i0 i0Var, s sVar) {
        if (sVar == null) {
            return false;
        }
        int iC = i0Var.c(sVar.k());
        for (int i9 = 0; i9 < sVar.length(); i9++) {
            if (D1.h(iArr[iC][sVar.d(i9)]) != 32) {
                return false;
            }
        }
        return true;
    }

    @Override // Z3.C
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public d c() {
        d dVar;
        synchronized (this.f11128d) {
            dVar = this.f11132h;
        }
        return dVar;
    }

    public final boolean N(C0936z0 c0936z0) {
        boolean z9;
        g gVar;
        g gVar2;
        synchronized (this.f11128d) {
            try {
                if (this.f11132h.f11185r0 && !this.f11131g && c0936z0.f6480z > 2 && (!O(c0936z0) || (k0.f39777a >= 32 && (gVar2 = this.f11133i) != null && gVar2.e()))) {
                    z9 = k0.f39777a >= 32 && (gVar = this.f11133i) != null && gVar.e() && this.f11133i.c() && this.f11133i.d() && this.f11133i.a(this.f11134j, c0936z0);
                }
            } finally {
            }
        }
        return z9;
    }

    public final /* synthetic */ List Q(d dVar, boolean z9, int i9, g0 g0Var, int[] iArr) {
        return b.f(i9, g0Var, dVar, iArr, z9, new r5.n() { // from class: Z3.l
            @Override // r5.n
            public final boolean apply(Object obj) {
                return this.f11125a.N((C0936z0) obj);
            }
        });
    }

    public final void W() {
        boolean z9;
        g gVar;
        synchronized (this.f11128d) {
            try {
                z9 = this.f11132h.f11185r0 && !this.f11131g && k0.f39777a >= 32 && (gVar = this.f11133i) != null && gVar.e();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z9) {
            f();
        }
    }

    public final void X(C1 c12) {
        boolean z9;
        synchronized (this.f11128d) {
            z9 = this.f11132h.f11189v0;
        }
        if (z9) {
            g(c12);
        }
    }

    @Override // O2.E1.a
    public void a(C1 c12) {
        X(c12);
    }

    public s.a[] a0(u.a aVar, int[][][] iArr, int[] iArr2, d dVar) {
        String str;
        int iD = aVar.d();
        s.a[] aVarArr = new s.a[iD];
        Pair pairF0 = f0(aVar, iArr, iArr2, dVar);
        if (pairF0 != null) {
            aVarArr[((Integer) pairF0.second).intValue()] = (s.a) pairF0.first;
        }
        Pair pairB0 = b0(aVar, iArr, iArr2, dVar);
        if (pairB0 != null) {
            aVarArr[((Integer) pairB0.second).intValue()] = (s.a) pairB0.first;
        }
        if (pairB0 == null) {
            str = null;
        } else {
            Object obj = pairB0.first;
            str = ((s.a) obj).f11250a.c(((s.a) obj).f11251b[0]).f6458d;
        }
        Pair pairD0 = d0(aVar, iArr, dVar, str);
        if (pairD0 != null) {
            aVarArr[((Integer) pairD0.second).intValue()] = (s.a) pairD0.first;
        }
        for (int i9 = 0; i9 < iD; i9++) {
            int iE = aVar.e(i9);
            if (iE != 2 && iE != 1 && iE != 3) {
                aVarArr[i9] = c0(iE, aVar.f(i9), iArr[i9], dVar);
            }
        }
        return aVarArr;
    }

    public Pair b0(u.a aVar, int[][][] iArr, int[] iArr2, final d dVar) {
        final boolean z9 = false;
        int i9 = 0;
        while (true) {
            if (i9 < aVar.d()) {
                if (2 == aVar.e(i9) && aVar.f(i9).f590a > 0) {
                    z9 = true;
                    break;
                }
                i9++;
            } else {
                break;
            }
        }
        return e0(1, aVar, iArr, new i.a() { // from class: Z3.h
            @Override // Z3.m.i.a
            public final List a(int i10, g0 g0Var, int[] iArr3) {
                return this.f11120a.Q(dVar, z9, i10, g0Var, iArr3);
            }
        }, new Comparator() { // from class: Z3.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.b.d((List) obj, (List) obj2);
            }
        });
    }

    public s.a c0(int i9, i0 i0Var, int[][] iArr, d dVar) {
        g0 g0Var = null;
        c cVar = null;
        int i10 = 0;
        for (int i11 = 0; i11 < i0Var.f590a; i11++) {
            g0 g0VarB = i0Var.b(i11);
            int[] iArr2 = iArr[i11];
            for (int i12 = 0; i12 < g0VarB.f581a; i12++) {
                if (P(iArr2[i12], dVar.f11186s0)) {
                    c cVar2 = new c(g0VarB.c(i12), iArr2[i12]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        g0Var = g0VarB;
                        i10 = i12;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (g0Var == null) {
            return null;
        }
        return new s.a(g0Var, i10);
    }

    @Override // Z3.C
    public E1.a d() {
        return this;
    }

    public Pair d0(u.a aVar, int[][][] iArr, final d dVar, final String str) {
        return e0(3, aVar, iArr, new i.a() { // from class: Z3.j
            @Override // Z3.m.i.a
            public final List a(int i9, g0 g0Var, int[] iArr2) {
                return m.R(dVar, str, i9, g0Var, iArr2);
            }
        }, new Comparator() { // from class: Z3.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.h.d((List) obj, (List) obj2);
            }
        });
    }

    public final Pair e0(int i9, u.a aVar, int[][][] iArr, i.a aVar2, Comparator comparator) {
        int i10;
        RandomAccess randomAccessA;
        u.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int iD = aVar.d();
        int i11 = 0;
        while (i11 < iD) {
            if (i9 == aVar3.e(i11)) {
                i0 i0VarF = aVar3.f(i11);
                for (int i12 = 0; i12 < i0VarF.f590a; i12++) {
                    g0 g0VarB = i0VarF.b(i12);
                    List listA = aVar2.a(i11, g0VarB, iArr[i11][i12]);
                    boolean[] zArr = new boolean[g0VarB.f581a];
                    int i13 = 0;
                    while (i13 < g0VarB.f581a) {
                        i iVar = (i) listA.get(i13);
                        int iB = iVar.b();
                        if (zArr[i13] || iB == 0) {
                            i10 = iD;
                        } else {
                            if (iB == 1) {
                                randomAccessA = AbstractC2743y.A(iVar);
                                i10 = iD;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(iVar);
                                int i14 = i13 + 1;
                                while (i14 < g0VarB.f581a) {
                                    i iVar2 = (i) listA.get(i14);
                                    int i15 = iD;
                                    if (iVar2.b() == 2 && iVar.c(iVar2)) {
                                        arrayList2.add(iVar2);
                                        zArr[i14] = true;
                                    }
                                    i14++;
                                    iD = i15;
                                }
                                i10 = iD;
                                randomAccessA = arrayList2;
                            }
                            arrayList.add(randomAccessA);
                        }
                        i13++;
                        iD = i10;
                    }
                }
            }
            i11++;
            aVar3 = aVar;
            iD = iD;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i16 = 0; i16 < list.size(); i16++) {
            iArr2[i16] = ((i) list.get(i16)).f11234d;
        }
        i iVar3 = (i) list.get(0);
        return Pair.create(new s.a(iVar3.f11233c, iArr2), Integer.valueOf(iVar3.f11232a));
    }

    public Pair f0(u.a aVar, int[][][] iArr, final int[] iArr2, final d dVar) {
        return e0(2, aVar, iArr, new i.a() { // from class: Z3.f
            @Override // Z3.m.i.a
            public final List a(int i9, g0 g0Var, int[] iArr3) {
                return m.S(dVar, iArr2, i9, g0Var, iArr3);
            }
        }, new Comparator() { // from class: Z3.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.j.h((List) obj, (List) obj2);
            }
        });
    }

    public final void g0(d dVar) {
        boolean z9;
        AbstractC1684a.e(dVar);
        synchronized (this.f11128d) {
            z9 = !this.f11132h.equals(dVar);
            this.f11132h = dVar;
        }
        if (z9) {
            if (dVar.f11185r0 && this.f11129e == null) {
                AbstractC1681B.j("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            f();
        }
    }

    @Override // Z3.C
    public boolean h() {
        return true;
    }

    @Override // Z3.C
    public void j() {
        g gVar;
        synchronized (this.f11128d) {
            try {
                if (k0.f39777a >= 32 && (gVar = this.f11133i) != null) {
                    gVar.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.j();
    }

    @Override // Z3.C
    public void l(C1019e c1019e) {
        boolean z9;
        synchronized (this.f11128d) {
            z9 = !this.f11134j.equals(c1019e);
            this.f11134j = c1019e;
        }
        if (z9) {
            W();
        }
    }

    @Override // Z3.C
    public void m(z zVar) {
        if (zVar instanceof d) {
            g0((d) zVar);
        }
        g0(new d.a().k0(zVar).B());
    }

    @Override // Z3.u
    public final Pair r(u.a aVar, int[][][] iArr, int[] iArr2, C.b bVar, Q1 q12) {
        d dVar;
        g gVar;
        synchronized (this.f11128d) {
            try {
                dVar = this.f11132h;
                if (dVar.f11185r0 && k0.f39777a >= 32 && (gVar = this.f11133i) != null) {
                    gVar.b(this, (Looper) AbstractC1684a.i(Looper.myLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int iD = aVar.d();
        s.a[] aVarArrA0 = a0(aVar, iArr, iArr2, dVar);
        F(aVar, dVar, aVarArrA0);
        E(aVar, dVar, aVarArrA0);
        for (int i9 = 0; i9 < iD; i9++) {
            int iE = aVar.e(i9);
            if (dVar.M(i9) || dVar.f11297A.contains(Integer.valueOf(iE))) {
                aVarArrA0[i9] = null;
            }
        }
        s[] sVarArrA = this.f11130f.a(aVarArrA0, b(), bVar, q12);
        F1[] f1Arr = new F1[iD];
        for (int i10 = 0; i10 < iD; i10++) {
            f1Arr[i10] = (dVar.M(i10) || dVar.f11297A.contains(Integer.valueOf(aVar.e(i10))) || (aVar.e(i10) != -2 && sVarArrA[i10] == null)) ? null : F1.f5515b;
        }
        if (dVar.f11187t0) {
            V(aVar, iArr, f1Arr, sVarArrA);
        }
        return Pair.create(f1Arr, sVarArrA);
    }
}
