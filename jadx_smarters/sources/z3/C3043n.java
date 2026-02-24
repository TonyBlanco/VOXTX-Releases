package z3;

import B3.C;
import B3.C0509q;
import B3.InterfaceC0517z;
import B3.g0;
import B3.i0;
import O2.C0927w;
import O2.C0936z0;
import O2.C1;
import O2.E1;
import O2.G1;
import O2.H0;
import O2.Q1;
import O2.V1;
import P2.v0;
import Q2.AbstractC1029o;
import Q2.InterfaceC1039z;
import Z3.AbstractC1069c;
import Z3.C;
import Z3.m;
import Z3.s;
import Z3.u;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseIntArray;
import b4.AbstractC1213d;
import b4.C1228t;
import b4.InterfaceC1211b;
import b4.InterfaceC1215f;
import b4.InterfaceC1224o;
import b4.S;
import d3.InterfaceC1678o;
import d4.AbstractC1684a;
import d4.k0;
import e4.C1737C;
import e4.InterfaceC1735A;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q3.C2540a;
import q3.InterfaceC2545f;
import s5.c0;
import z3.C3052w;

/* JADX INFO: renamed from: z3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3043n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final m.d f52728o = m.d.f11174y0.B().z0(true).u0(false).B();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H0.h f52729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B3.C f52730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z3.m f52731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E1[] f52732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseIntArray f52733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f52734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Q1.d f52735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f52736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f52737i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f52738j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i0[] f52739k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public u.a[] f52740l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List[][] f52741m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List[][] f52742n;

    /* JADX INFO: renamed from: z3.n$a */
    public class a implements InterfaceC1735A {
        @Override // e4.InterfaceC1735A
        public /* synthetic */ void H(C0936z0 c0936z0) {
            e4.p.i(this, c0936z0);
        }

        @Override // e4.InterfaceC1735A
        public /* synthetic */ void c(String str) {
            e4.p.e(this, str);
        }

        @Override // e4.InterfaceC1735A
        public /* synthetic */ void d(String str, long j9, long j10) {
            e4.p.d(this, str, j9, j10);
        }

        @Override // e4.InterfaceC1735A
        public /* synthetic */ void h(U2.e eVar) {
            e4.p.f(this, eVar);
        }

        @Override // e4.InterfaceC1735A
        public /* synthetic */ void j(C1737C c1737c) {
            e4.p.k(this, c1737c);
        }

        @Override // e4.InterfaceC1735A
        public /* synthetic */ void m(Exception exc) {
            e4.p.c(this, exc);
        }

        @Override // e4.InterfaceC1735A
        public /* synthetic */ void p(U2.e eVar) {
            e4.p.g(this, eVar);
        }

        @Override // e4.InterfaceC1735A
        public /* synthetic */ void q(C0936z0 c0936z0, U2.h hVar) {
            e4.p.j(this, c0936z0, hVar);
        }

        @Override // e4.InterfaceC1735A
        public /* synthetic */ void s(int i9, long j9) {
            e4.p.a(this, i9, j9);
        }

        @Override // e4.InterfaceC1735A
        public /* synthetic */ void v(Object obj, long j9) {
            e4.p.b(this, obj, j9);
        }

        @Override // e4.InterfaceC1735A
        public /* synthetic */ void y(long j9, int i9) {
            e4.p.h(this, j9, i9);
        }
    }

    /* JADX INFO: renamed from: z3.n$b */
    public class b implements InterfaceC1039z {
        @Override // Q2.InterfaceC1039z
        public /* synthetic */ void C(C0936z0 c0936z0) {
            AbstractC1029o.f(this, c0936z0);
        }

        @Override // Q2.InterfaceC1039z
        public /* synthetic */ void a(boolean z9) {
            AbstractC1029o.k(this, z9);
        }

        @Override // Q2.InterfaceC1039z
        public /* synthetic */ void b(Exception exc) {
            AbstractC1029o.i(this, exc);
        }

        @Override // Q2.InterfaceC1039z
        public /* synthetic */ void f(String str) {
            AbstractC1029o.c(this, str);
        }

        @Override // Q2.InterfaceC1039z
        public /* synthetic */ void g(String str, long j9, long j10) {
            AbstractC1029o.b(this, str, j9, j10);
        }

        @Override // Q2.InterfaceC1039z
        public /* synthetic */ void i(U2.e eVar) {
            AbstractC1029o.e(this, eVar);
        }

        @Override // Q2.InterfaceC1039z
        public /* synthetic */ void l(long j9) {
            AbstractC1029o.h(this, j9);
        }

        @Override // Q2.InterfaceC1039z
        public /* synthetic */ void n(U2.e eVar) {
            AbstractC1029o.d(this, eVar);
        }

        @Override // Q2.InterfaceC1039z
        public /* synthetic */ void r(C0936z0 c0936z0, U2.h hVar) {
            AbstractC1029o.g(this, c0936z0, hVar);
        }

        @Override // Q2.InterfaceC1039z
        public /* synthetic */ void w(Exception exc) {
            AbstractC1029o.a(this, exc);
        }

        @Override // Q2.InterfaceC1039z
        public /* synthetic */ void x(int i9, long j9, long j10) {
            AbstractC1029o.j(this, i9, j9, j10);
        }
    }

    /* JADX INFO: renamed from: z3.n$c */
    public interface c {
        void a(C3043n c3043n, IOException iOException);

        void c(C3043n c3043n);
    }

    /* JADX INFO: renamed from: z3.n$d */
    public static final class d extends AbstractC1069c {

        /* JADX INFO: renamed from: z3.n$d$a */
        public static final class a implements s.b {
            public a() {
            }

            public /* synthetic */ a(a aVar) {
                this();
            }

            @Override // Z3.s.b
            public Z3.s[] a(s.a[] aVarArr, InterfaceC1215f interfaceC1215f, C.b bVar, Q1 q12) {
                Z3.s[] sVarArr = new Z3.s[aVarArr.length];
                for (int i9 = 0; i9 < aVarArr.length; i9++) {
                    s.a aVar = aVarArr[i9];
                    sVarArr[i9] = aVar == null ? null : new d(aVar.f11250a, aVar.f11251b);
                }
                return sVarArr;
            }
        }

        public d(g0 g0Var, int[] iArr) {
            super(g0Var, iArr);
        }

        @Override // Z3.s
        public int b() {
            return 0;
        }

        @Override // Z3.s
        public Object g() {
            return null;
        }

        @Override // Z3.s
        public int q() {
            return 0;
        }

        @Override // Z3.s
        public void r(long j9, long j10, long j11, List list, D3.o[] oVarArr) {
        }
    }

    /* JADX INFO: renamed from: z3.n$e */
    public static final class e implements InterfaceC1215f {
        public e() {
        }

        public /* synthetic */ e(a aVar) {
            this();
        }

        @Override // b4.InterfaceC1215f
        public /* synthetic */ long b() {
            return AbstractC1213d.a(this);
        }

        @Override // b4.InterfaceC1215f
        public S d() {
            return null;
        }

        @Override // b4.InterfaceC1215f
        public long e() {
            return 0L;
        }

        @Override // b4.InterfaceC1215f
        public void g(Handler handler, InterfaceC1215f.a aVar) {
        }

        @Override // b4.InterfaceC1215f
        public void h(InterfaceC1215f.a aVar) {
        }
    }

    /* JADX INFO: renamed from: z3.n$f */
    public static class f extends IOException {
    }

    /* JADX INFO: renamed from: z3.n$g */
    public static final class g implements C.c, InterfaceC0517z.a, Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final B3.C f52743a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C3043n f52744c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final InterfaceC1211b f52745d = new C1228t(true, 65536);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList f52746e = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Handler f52747f = k0.A(new Handler.Callback() { // from class: z3.o
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f52753a.b(message);
            }
        });

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final HandlerThread f52748g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Handler f52749h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Q1 f52750i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public InterfaceC0517z[] f52751j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f52752k;

        public g(B3.C c9, C3043n c3043n) {
            this.f52743a = c9;
            this.f52744c = c3043n;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadHelper");
            this.f52748g = handlerThread;
            handlerThread.start();
            Handler handlerW = k0.w(handlerThread.getLooper(), this);
            this.f52749h = handlerW;
            handlerW.sendEmptyMessage(0);
        }

        @Override // B3.C.c
        public void J(B3.C c9, Q1 q12) {
            InterfaceC0517z[] interfaceC0517zArr;
            if (this.f52750i != null) {
                return;
            }
            if (q12.s(0, new Q1.d()).i()) {
                this.f52747f.obtainMessage(1, new f()).sendToTarget();
                return;
            }
            this.f52750i = q12;
            this.f52751j = new InterfaceC0517z[q12.n()];
            int i9 = 0;
            while (true) {
                interfaceC0517zArr = this.f52751j;
                if (i9 >= interfaceC0517zArr.length) {
                    break;
                }
                InterfaceC0517z interfaceC0517zE = this.f52743a.E(new C.b(q12.r(i9)), this.f52745d, 0L);
                this.f52751j[i9] = interfaceC0517zE;
                this.f52746e.add(interfaceC0517zE);
                i9++;
            }
            for (InterfaceC0517z interfaceC0517z : interfaceC0517zArr) {
                interfaceC0517z.s(this, 0L);
            }
        }

        public final boolean b(Message message) {
            if (this.f52752k) {
                return false;
            }
            int i9 = message.what;
            if (i9 == 0) {
                try {
                    this.f52744c.G();
                } catch (C0927w e9) {
                    this.f52747f.obtainMessage(1, new IOException(e9)).sendToTarget();
                }
                return true;
            }
            if (i9 != 1) {
                return false;
            }
            d();
            this.f52744c.F((IOException) k0.j(message.obj));
            return true;
        }

        @Override // B3.Z.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void j(InterfaceC0517z interfaceC0517z) {
            if (this.f52746e.contains(interfaceC0517z)) {
                this.f52749h.obtainMessage(2, interfaceC0517z).sendToTarget();
            }
        }

        public void d() {
            if (this.f52752k) {
                return;
            }
            this.f52752k = true;
            this.f52749h.sendEmptyMessage(3);
        }

        @Override // B3.InterfaceC0517z.a
        public void e(InterfaceC0517z interfaceC0517z) {
            this.f52746e.remove(interfaceC0517z);
            if (this.f52746e.isEmpty()) {
                this.f52749h.removeMessages(1);
                this.f52747f.sendEmptyMessage(0);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i9 = message.what;
            if (i9 == 0) {
                this.f52743a.a(this, null, v0.f7159b);
                this.f52749h.sendEmptyMessage(1);
                return true;
            }
            int i10 = 0;
            if (i9 == 1) {
                try {
                    if (this.f52751j == null) {
                        this.f52743a.P();
                    } else {
                        while (i10 < this.f52746e.size()) {
                            ((InterfaceC0517z) this.f52746e.get(i10)).p();
                            i10++;
                        }
                    }
                    this.f52749h.sendEmptyMessageDelayed(1, 100L);
                } catch (IOException e9) {
                    this.f52747f.obtainMessage(1, e9).sendToTarget();
                }
                return true;
            }
            if (i9 == 2) {
                InterfaceC0517z interfaceC0517z = (InterfaceC0517z) message.obj;
                if (this.f52746e.contains(interfaceC0517z)) {
                    interfaceC0517z.f(0L);
                }
                return true;
            }
            if (i9 != 3) {
                return false;
            }
            InterfaceC0517z[] interfaceC0517zArr = this.f52751j;
            if (interfaceC0517zArr != null) {
                int length = interfaceC0517zArr.length;
                while (i10 < length) {
                    this.f52743a.Y(interfaceC0517zArr[i10]);
                    i10++;
                }
            }
            this.f52743a.V(this);
            this.f52749h.removeCallbacksAndMessages(null);
            this.f52748g.quit();
            return true;
        }
    }

    public C3043n(H0 h02, B3.C c9, Z3.z zVar, E1[] e1Arr) {
        this.f52729a = (H0.h) AbstractC1684a.e(h02.f5528c);
        this.f52730b = c9;
        a aVar = null;
        Z3.m mVar = new Z3.m(zVar, new d.a(aVar));
        this.f52731c = mVar;
        this.f52732d = e1Arr;
        this.f52733e = new SparseIntArray();
        mVar.e(new C.a() { // from class: z3.h
            @Override // Z3.C.a
            public /* synthetic */ void a(C1 c12) {
                Z3.B.a(this, c12);
            }

            @Override // Z3.C.a
            public final void b() {
                C3043n.B();
            }
        }, new e(aVar));
        this.f52734f = k0.z();
        this.f52735g = new Q1.d();
    }

    public static /* synthetic */ void A(C2540a c2540a) {
    }

    public static /* synthetic */ void B() {
    }

    public static B3.C n(H0 h02, InterfaceC1224o.a aVar, final V2.y yVar) {
        C0509q c0509q = new C0509q(aVar, InterfaceC1678o.f39601a);
        if (yVar != null) {
            c0509q.d(new V2.B() { // from class: z3.g
                @Override // V2.B
                public final V2.y a(H0 h03) {
                    return C3043n.y(yVar, h03);
                }
            });
        }
        return c0509q.b(h02);
    }

    public static C3043n o(H0 h02, Z3.z zVar, G1 g12, InterfaceC1224o.a aVar, V2.y yVar) {
        boolean zX = x((H0.h) AbstractC1684a.e(h02.f5528c));
        AbstractC1684a.a(zX || aVar != null);
        return new C3043n(h02, zX ? null : n(h02, (InterfaceC1224o.a) k0.j(aVar), yVar), zVar, g12 != null ? v(g12) : new E1[0]);
    }

    public static C3043n p(Context context, H0 h02, G1 g12, InterfaceC1224o.a aVar) {
        return o(h02, q(context), g12, aVar, null);
    }

    public static m.d q(Context context) {
        return m.d.K(context).B().z0(true).u0(false).B();
    }

    public static E1[] v(G1 g12) {
        C1[] c1ArrA = g12.a(k0.z(), new a(), new b(), new P3.q() { // from class: z3.j
            @Override // P3.q
            public /* synthetic */ void k(List list) {
                P3.p.a(this, list);
            }

            @Override // P3.q
            public final void u(P3.f fVar) {
                C3043n.z(fVar);
            }
        }, new InterfaceC2545f() { // from class: z3.k
            @Override // q3.InterfaceC2545f
            public final void e(C2540a c2540a) {
                C3043n.A(c2540a);
            }
        });
        E1[] e1Arr = new E1[c1ArrA.length];
        for (int i9 = 0; i9 < c1ArrA.length; i9++) {
            e1Arr[i9] = c1ArrA[i9].q();
        }
        return e1Arr;
    }

    public static boolean x(H0.h hVar) {
        return k0.y0(hVar.f5625a, hVar.f5626c) == 4;
    }

    public static /* synthetic */ V2.y y(V2.y yVar, H0 h02) {
        return yVar;
    }

    public static /* synthetic */ void z(P3.f fVar) {
    }

    public final /* synthetic */ void C(IOException iOException) {
        ((c) AbstractC1684a.e(this.f52737i)).a(this, iOException);
    }

    public final /* synthetic */ void D() {
        ((c) AbstractC1684a.e(this.f52737i)).c(this);
    }

    public final /* synthetic */ void E(c cVar) {
        cVar.c(this);
    }

    public final void F(final IOException iOException) {
        ((Handler) AbstractC1684a.e(this.f52734f)).post(new Runnable() { // from class: z3.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f52725a.C(iOException);
            }
        });
    }

    public final void G() {
        AbstractC1684a.e(this.f52738j);
        AbstractC1684a.e(this.f52738j.f52751j);
        AbstractC1684a.e(this.f52738j.f52750i);
        int length = this.f52738j.f52751j.length;
        int length2 = this.f52732d.length;
        this.f52741m = (List[][]) Array.newInstance((Class<?>) List.class, length, length2);
        this.f52742n = (List[][]) Array.newInstance((Class<?>) List.class, length, length2);
        for (int i9 = 0; i9 < length; i9++) {
            for (int i10 = 0; i10 < length2; i10++) {
                this.f52741m[i9][i10] = new ArrayList();
                this.f52742n[i9][i10] = Collections.unmodifiableList(this.f52741m[i9][i10]);
            }
        }
        this.f52739k = new i0[length];
        this.f52740l = new u.a[length];
        for (int i11 = 0; i11 < length; i11++) {
            this.f52739k[i11] = this.f52738j.f52751j[i11].u();
            this.f52731c.i(J(i11).f11085e);
            this.f52740l[i11] = (u.a) AbstractC1684a.e(this.f52731c.o());
        }
        K();
        ((Handler) AbstractC1684a.e(this.f52734f)).post(new Runnable() { // from class: z3.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f52727a.D();
            }
        });
    }

    public void H(final c cVar) {
        AbstractC1684a.g(this.f52737i == null);
        this.f52737i = cVar;
        B3.C c9 = this.f52730b;
        if (c9 != null) {
            this.f52738j = new g(c9, this);
        } else {
            this.f52734f.post(new Runnable() { // from class: z3.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52723a.E(cVar);
                }
            });
        }
    }

    public void I() {
        g gVar = this.f52738j;
        if (gVar != null) {
            gVar.d();
        }
        this.f52731c.j();
    }

    public final Z3.D J(int i9) {
        Z3.D dK = this.f52731c.k(this.f52732d, this.f52739k[i9], new C.b(this.f52738j.f52750i.r(i9)), this.f52738j.f52750i);
        for (int i10 = 0; i10 < dK.f11081a; i10++) {
            Z3.s sVar = dK.f11083c[i10];
            if (sVar != null) {
                List list = this.f52741m[i9][i10];
                int i11 = 0;
                while (true) {
                    if (i11 >= list.size()) {
                        list.add(sVar);
                        break;
                    }
                    Z3.s sVar2 = (Z3.s) list.get(i11);
                    if (sVar2.k().equals(sVar.k())) {
                        this.f52733e.clear();
                        for (int i12 = 0; i12 < sVar2.length(); i12++) {
                            this.f52733e.put(sVar2.d(i12), 0);
                        }
                        for (int i13 = 0; i13 < sVar.length(); i13++) {
                            this.f52733e.put(sVar.d(i13), 0);
                        }
                        int[] iArr = new int[this.f52733e.size()];
                        for (int i14 = 0; i14 < this.f52733e.size(); i14++) {
                            iArr[i14] = this.f52733e.keyAt(i14);
                        }
                        list.set(i11, new d(sVar2.k(), iArr));
                    } else {
                        i11++;
                    }
                }
            }
        }
        return dK;
    }

    public final void K() {
        this.f52736h = true;
    }

    public void j(int i9, Z3.z zVar) {
        try {
            l();
            k(i9, zVar);
        } catch (C0927w e9) {
            throw new IllegalStateException(e9);
        }
    }

    public final void k(int i9, Z3.z zVar) {
        this.f52731c.m(zVar);
        J(i9);
        c0 it = zVar.f11322z.values().iterator();
        while (it.hasNext()) {
            this.f52731c.m(zVar.B().I((Z3.x) it.next()).B());
            J(i9);
        }
    }

    public final void l() {
        AbstractC1684a.g(this.f52736h);
    }

    public void m(int i9) {
        l();
        for (int i10 = 0; i10 < this.f52732d.length; i10++) {
            this.f52741m[i9][i10].clear();
        }
    }

    public C3052w r(String str, byte[] bArr) {
        C3052w.b bVarE = new C3052w.b(str, this.f52729a.f5625a).e(this.f52729a.f5626c);
        H0.f fVar = this.f52729a.f5627d;
        C3052w.b bVarC = bVarE.d(fVar != null ? fVar.e() : null).b(this.f52729a.f5630g).c(bArr);
        if (this.f52730b == null) {
            return bVarC.a();
        }
        l();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = this.f52741m.length;
        for (int i9 = 0; i9 < length; i9++) {
            arrayList2.clear();
            int length2 = this.f52741m[i9].length;
            for (int i10 = 0; i10 < length2; i10++) {
                arrayList2.addAll(this.f52741m[i9][i10]);
            }
            arrayList.addAll(this.f52738j.f52751j[i9].k(arrayList2));
        }
        return bVarC.f(arrayList).a();
    }

    public C3052w s(byte[] bArr) {
        return r(this.f52729a.f5625a.toString(), bArr);
    }

    public u.a t(int i9) {
        l();
        return this.f52740l[i9];
    }

    public int u() {
        if (this.f52730b == null) {
            return 0;
        }
        l();
        return this.f52739k.length;
    }

    public V1 w(int i9) {
        l();
        return Z3.A.b(this.f52740l[i9], this.f52742n[i9]);
    }
}
