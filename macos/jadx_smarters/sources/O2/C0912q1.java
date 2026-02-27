package O2;

import B3.C;
import android.os.SystemClock;
import java.util.List;
import s5.AbstractC2743y;

/* JADX INFO: renamed from: O2.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0912q1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C.b f6190t = new C.b(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q1 f6191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C.b f6192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0927w f6196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final B3.i0 f6198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Z3.D f6199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f6200j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C.b f6201k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f6202l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6203m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0917s1 f6204n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f6205o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile long f6206p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f6207q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f6208r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f6209s;

    public C0912q1(Q1 q12, C.b bVar, long j9, long j10, int i9, C0927w c0927w, boolean z9, B3.i0 i0Var, Z3.D d9, List list, C.b bVar2, boolean z10, int i10, C0917s1 c0917s1, long j11, long j12, long j13, long j14, boolean z11) {
        this.f6191a = q12;
        this.f6192b = bVar;
        this.f6193c = j9;
        this.f6194d = j10;
        this.f6195e = i9;
        this.f6196f = c0927w;
        this.f6197g = z9;
        this.f6198h = i0Var;
        this.f6199i = d9;
        this.f6200j = list;
        this.f6201k = bVar2;
        this.f6202l = z10;
        this.f6203m = i10;
        this.f6204n = c0917s1;
        this.f6206p = j11;
        this.f6207q = j12;
        this.f6208r = j13;
        this.f6209s = j14;
        this.f6205o = z11;
    }

    public static C0912q1 k(Z3.D d9) {
        Q1 q12 = Q1.f5705a;
        C.b bVar = f6190t;
        return new C0912q1(q12, bVar, -9223372036854775807L, 0L, 1, null, false, B3.i0.f587e, d9, AbstractC2743y.z(), bVar, false, 0, C0917s1.f6227e, 0L, 0L, 0L, 0L, false);
    }

    public static C.b l() {
        return f6190t;
    }

    public C0912q1 a() {
        return new C0912q1(this.f6191a, this.f6192b, this.f6193c, this.f6194d, this.f6195e, this.f6196f, this.f6197g, this.f6198h, this.f6199i, this.f6200j, this.f6201k, this.f6202l, this.f6203m, this.f6204n, this.f6206p, this.f6207q, m(), SystemClock.elapsedRealtime(), this.f6205o);
    }

    public C0912q1 b(boolean z9) {
        return new C0912q1(this.f6191a, this.f6192b, this.f6193c, this.f6194d, this.f6195e, this.f6196f, z9, this.f6198h, this.f6199i, this.f6200j, this.f6201k, this.f6202l, this.f6203m, this.f6204n, this.f6206p, this.f6207q, this.f6208r, this.f6209s, this.f6205o);
    }

    public C0912q1 c(C.b bVar) {
        return new C0912q1(this.f6191a, this.f6192b, this.f6193c, this.f6194d, this.f6195e, this.f6196f, this.f6197g, this.f6198h, this.f6199i, this.f6200j, bVar, this.f6202l, this.f6203m, this.f6204n, this.f6206p, this.f6207q, this.f6208r, this.f6209s, this.f6205o);
    }

    public C0912q1 d(C.b bVar, long j9, long j10, long j11, long j12, B3.i0 i0Var, Z3.D d9, List list) {
        return new C0912q1(this.f6191a, bVar, j10, j11, this.f6195e, this.f6196f, this.f6197g, i0Var, d9, list, this.f6201k, this.f6202l, this.f6203m, this.f6204n, this.f6206p, j12, j9, SystemClock.elapsedRealtime(), this.f6205o);
    }

    public C0912q1 e(boolean z9, int i9) {
        return new C0912q1(this.f6191a, this.f6192b, this.f6193c, this.f6194d, this.f6195e, this.f6196f, this.f6197g, this.f6198h, this.f6199i, this.f6200j, this.f6201k, z9, i9, this.f6204n, this.f6206p, this.f6207q, this.f6208r, this.f6209s, this.f6205o);
    }

    public C0912q1 f(C0927w c0927w) {
        return new C0912q1(this.f6191a, this.f6192b, this.f6193c, this.f6194d, this.f6195e, c0927w, this.f6197g, this.f6198h, this.f6199i, this.f6200j, this.f6201k, this.f6202l, this.f6203m, this.f6204n, this.f6206p, this.f6207q, this.f6208r, this.f6209s, this.f6205o);
    }

    public C0912q1 g(C0917s1 c0917s1) {
        return new C0912q1(this.f6191a, this.f6192b, this.f6193c, this.f6194d, this.f6195e, this.f6196f, this.f6197g, this.f6198h, this.f6199i, this.f6200j, this.f6201k, this.f6202l, this.f6203m, c0917s1, this.f6206p, this.f6207q, this.f6208r, this.f6209s, this.f6205o);
    }

    public C0912q1 h(int i9) {
        return new C0912q1(this.f6191a, this.f6192b, this.f6193c, this.f6194d, i9, this.f6196f, this.f6197g, this.f6198h, this.f6199i, this.f6200j, this.f6201k, this.f6202l, this.f6203m, this.f6204n, this.f6206p, this.f6207q, this.f6208r, this.f6209s, this.f6205o);
    }

    public C0912q1 i(boolean z9) {
        return new C0912q1(this.f6191a, this.f6192b, this.f6193c, this.f6194d, this.f6195e, this.f6196f, this.f6197g, this.f6198h, this.f6199i, this.f6200j, this.f6201k, this.f6202l, this.f6203m, this.f6204n, this.f6206p, this.f6207q, this.f6208r, this.f6209s, z9);
    }

    public C0912q1 j(Q1 q12) {
        return new C0912q1(q12, this.f6192b, this.f6193c, this.f6194d, this.f6195e, this.f6196f, this.f6197g, this.f6198h, this.f6199i, this.f6200j, this.f6201k, this.f6202l, this.f6203m, this.f6204n, this.f6206p, this.f6207q, this.f6208r, this.f6209s, this.f6205o);
    }

    public long m() {
        long j9;
        long j10;
        if (!n()) {
            return this.f6208r;
        }
        do {
            j9 = this.f6209s;
            j10 = this.f6208r;
        } while (j9 != this.f6209s);
        return d4.k0.P0(d4.k0.x1(j10) + ((long) ((SystemClock.elapsedRealtime() - j9) * this.f6204n.f6231a)));
    }

    public boolean n() {
        return this.f6195e == 3 && this.f6202l && this.f6203m == 0;
    }

    public void o(long j9) {
        this.f6208r = j9;
        this.f6209s = SystemClock.elapsedRealtime();
    }
}
