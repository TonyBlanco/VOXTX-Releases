package D3;

import D3.g;
import O2.C0936z0;
import P2.v0;
import android.util.SparseArray;
import b4.InterfaceC1220k;
import d3.C1671h;
import d3.InterfaceC1672i;
import d3.InterfaceC1673j;
import d3.InterfaceC1674k;
import d3.t;
import d3.v;
import d3.w;
import d4.AbstractC1684a;
import d4.F;
import d4.M;
import d4.k0;
import j3.C2093e;
import java.util.List;
import l3.C2182g;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements InterfaceC1674k, g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g.a f1358k = new g.a() { // from class: D3.d
        @Override // D3.g.a
        public final g a(int i9, C0936z0 c0936z0, boolean z9, List list, w wVar, v0 v0Var) {
            return e.g(i9, c0936z0, z9, list, wVar, v0Var);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final t f1359l = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1672i f1360a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0936z0 f1362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f1363e = new SparseArray();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g.b f1365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f1366h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.g f1367i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0936z0[] f1368j;

    public static final class a implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f1370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0936z0 f1371c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C1671h f1372d = new C1671h();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C0936z0 f1373e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public w f1374f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f1375g;

        public a(int i9, int i10, C0936z0 c0936z0) {
            this.f1369a = i9;
            this.f1370b = i10;
            this.f1371c = c0936z0;
        }

        @Override // d3.w
        public /* synthetic */ int a(InterfaceC1220k interfaceC1220k, int i9, boolean z9) {
            return v.a(this, interfaceC1220k, i9, z9);
        }

        @Override // d3.w
        public /* synthetic */ void b(M m9, int i9) {
            v.b(this, m9, i9);
        }

        @Override // d3.w
        public void c(M m9, int i9, int i10) {
            ((w) k0.j(this.f1374f)).b(m9, i9);
        }

        @Override // d3.w
        public void d(C0936z0 c0936z0) {
            C0936z0 c0936z02 = this.f1371c;
            if (c0936z02 != null) {
                c0936z0 = c0936z0.l(c0936z02);
            }
            this.f1373e = c0936z0;
            ((w) k0.j(this.f1374f)).d(this.f1373e);
        }

        @Override // d3.w
        public int e(InterfaceC1220k interfaceC1220k, int i9, boolean z9, int i10) {
            return ((w) k0.j(this.f1374f)).a(interfaceC1220k, i9, z9);
        }

        @Override // d3.w
        public void f(long j9, int i9, int i10, int i11, w.a aVar) {
            long j10 = this.f1375g;
            if (j10 != -9223372036854775807L && j9 >= j10) {
                this.f1374f = this.f1372d;
            }
            ((w) k0.j(this.f1374f)).f(j9, i9, i10, i11, aVar);
        }

        public void g(g.b bVar, long j9) {
            if (bVar == null) {
                this.f1374f = this.f1372d;
                return;
            }
            this.f1375g = j9;
            w wVarE = bVar.e(this.f1369a, this.f1370b);
            this.f1374f = wVarE;
            C0936z0 c0936z0 = this.f1373e;
            if (c0936z0 != null) {
                wVarE.d(c0936z0);
            }
        }
    }

    public e(InterfaceC1672i interfaceC1672i, int i9, C0936z0 c0936z0) {
        this.f1360a = interfaceC1672i;
        this.f1361c = i9;
        this.f1362d = c0936z0;
    }

    public static /* synthetic */ g g(int i9, C0936z0 c0936z0, boolean z9, List list, w wVar, v0 v0Var) {
        InterfaceC1672i c2182g;
        String str = c0936z0.f6466l;
        if (F.r(str)) {
            return null;
        }
        if (F.q(str)) {
            c2182g = new C2093e(1);
        } else {
            c2182g = new C2182g(z9 ? 4 : 0, null, null, list, wVar);
        }
        return new e(c2182g, i9, c0936z0);
    }

    @Override // D3.g
    public boolean a(InterfaceC1673j interfaceC1673j) {
        int iD = this.f1360a.d(interfaceC1673j, f1359l);
        AbstractC1684a.g(iD != 1);
        return iD == 0;
    }

    @Override // D3.g
    public com.google.android.exoplayer2.extractor.b b() {
        com.google.android.exoplayer2.extractor.g gVar = this.f1367i;
        if (gVar instanceof com.google.android.exoplayer2.extractor.b) {
            return (com.google.android.exoplayer2.extractor.b) gVar;
        }
        return null;
    }

    @Override // D3.g
    public C0936z0[] c() {
        return this.f1368j;
    }

    @Override // D3.g
    public void d(g.b bVar, long j9, long j10) {
        this.f1365g = bVar;
        this.f1366h = j10;
        if (!this.f1364f) {
            this.f1360a.b(this);
            if (j9 != -9223372036854775807L) {
                this.f1360a.a(0L, j9);
            }
            this.f1364f = true;
            return;
        }
        InterfaceC1672i interfaceC1672i = this.f1360a;
        if (j9 == -9223372036854775807L) {
            j9 = 0;
        }
        interfaceC1672i.a(0L, j9);
        for (int i9 = 0; i9 < this.f1363e.size(); i9++) {
            ((a) this.f1363e.valueAt(i9)).g(bVar, j10);
        }
    }

    @Override // d3.InterfaceC1674k
    public w e(int i9, int i10) {
        a aVar = (a) this.f1363e.get(i9);
        if (aVar == null) {
            AbstractC1684a.g(this.f1368j == null);
            aVar = new a(i9, i10, i10 == this.f1361c ? this.f1362d : null);
            aVar.g(this.f1365g, this.f1366h);
            this.f1363e.put(i9, aVar);
        }
        return aVar;
    }

    @Override // d3.InterfaceC1674k
    public void n(com.google.android.exoplayer2.extractor.g gVar) {
        this.f1367i = gVar;
    }

    @Override // d3.InterfaceC1674k
    public void q() {
        C0936z0[] c0936z0Arr = new C0936z0[this.f1363e.size()];
        for (int i9 = 0; i9 < this.f1363e.size(); i9++) {
            c0936z0Arr[i9] = (C0936z0) AbstractC1684a.i(((a) this.f1363e.valueAt(i9)).f1373e);
        }
        this.f1368j = c0936z0Arr;
    }

    @Override // D3.g
    public void release() {
        this.f1360a.release();
    }
}
