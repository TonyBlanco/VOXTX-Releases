package H3;

import B3.C0494b;
import B3.g0;
import J3.f;
import O2.C0936z0;
import O2.H1;
import P2.v0;
import Z3.AbstractC1069c;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import b4.AbstractC1217h;
import b4.C1227s;
import b4.InterfaceC1224o;
import b4.S;
import d4.AbstractC1684a;
import d4.b0;
import d4.k0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http2.Http2;
import s5.AbstractC2743y;
import s5.D;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f2427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1224o f2428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1224o f2429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f2430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri[] f2431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0936z0[] f2432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final J3.k f2433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g0 f2434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f2435i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v0 f2437k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f2438l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2439m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public IOException f2441o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Uri f2442p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2443q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Z3.s f2444r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2446t;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final H3.e f2436j = new H3.e(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f2440n = k0.f39782f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f2445s = -9223372036854775807L;

    public static final class a extends D3.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public byte[] f2447m;

        public a(InterfaceC1224o interfaceC1224o, C1227s c1227s, C0936z0 c0936z0, int i9, Object obj, byte[] bArr) {
            super(interfaceC1224o, c1227s, 3, c0936z0, i9, obj, bArr);
        }

        @Override // D3.l
        public void g(byte[] bArr, int i9) {
            this.f2447m = Arrays.copyOf(bArr, i9);
        }

        public byte[] j() {
            return this.f2447m;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public D3.f f2448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Uri f2450c;

        public b() {
            a();
        }

        public void a() {
            this.f2448a = null;
            this.f2449b = false;
            this.f2450c = null;
        }
    }

    public static final class c extends D3.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f2451e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f2452f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f2453g;

        public c(String str, long j9, List list) {
            super(0L, list.size() - 1);
            this.f2453g = str;
            this.f2452f = j9;
            this.f2451e = list;
        }

        @Override // D3.o
        public long a() {
            c();
            return this.f2452f + ((f.e) this.f2451e.get((int) d())).f3158f;
        }

        @Override // D3.o
        public long b() {
            c();
            f.e eVar = (f.e) this.f2451e.get((int) d());
            return this.f2452f + eVar.f3158f + eVar.f3156d;
        }
    }

    public static final class d extends AbstractC1069c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f2454h;

        public d(g0 g0Var, int[] iArr) {
            super(g0Var, iArr);
            this.f2454h = l(g0Var.c(iArr[0]));
        }

        @Override // Z3.s
        public int b() {
            return this.f2454h;
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
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (a(this.f2454h, jElapsedRealtime)) {
                for (int i9 = this.f11112b - 1; i9 >= 0; i9--) {
                    if (!a(i9, jElapsedRealtime)) {
                        this.f2454h = i9;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f.e f2455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f2456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f2457c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f2458d;

        public e(f.e eVar, long j9, int i9) {
            this.f2455a = eVar;
            this.f2456b = j9;
            this.f2457c = i9;
            this.f2458d = (eVar instanceof f.b) && ((f.b) eVar).f3148n;
        }
    }

    public f(h hVar, J3.k kVar, Uri[] uriArr, C0936z0[] c0936z0Arr, g gVar, S s9, t tVar, long j9, List list, v0 v0Var, AbstractC1217h abstractC1217h) {
        this.f2427a = hVar;
        this.f2433g = kVar;
        this.f2431e = uriArr;
        this.f2432f = c0936z0Arr;
        this.f2430d = tVar;
        this.f2438l = j9;
        this.f2435i = list;
        this.f2437k = v0Var;
        InterfaceC1224o interfaceC1224oA = gVar.a(1);
        this.f2428b = interfaceC1224oA;
        if (s9 != null) {
            interfaceC1224oA.g(s9);
        }
        this.f2429c = gVar.a(3);
        this.f2434h = new g0(c0936z0Arr);
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < uriArr.length; i9++) {
            if ((c0936z0Arr[i9].f6460f & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                arrayList.add(Integer.valueOf(i9));
            }
        }
        this.f2444r = new d(this.f2434h, w5.f.l(arrayList));
    }

    public static Uri d(J3.f fVar, f.e eVar) {
        String str;
        if (eVar == null || (str = eVar.f3160h) == null) {
            return null;
        }
        return b0.e(fVar.f3191a, str);
    }

    public static e g(J3.f fVar, long j9, int i9) {
        int i10 = (int) (j9 - fVar.f3135k);
        if (i10 == fVar.f3142r.size()) {
            if (i9 == -1) {
                i9 = 0;
            }
            if (i9 < fVar.f3143s.size()) {
                return new e((f.e) fVar.f3143s.get(i9), j9, i9);
            }
            return null;
        }
        f.d dVar = (f.d) fVar.f3142r.get(i10);
        if (i9 == -1) {
            return new e(dVar, j9, -1);
        }
        if (i9 < dVar.f3153n.size()) {
            return new e((f.e) dVar.f3153n.get(i9), j9, i9);
        }
        int i11 = i10 + 1;
        if (i11 < fVar.f3142r.size()) {
            return new e((f.e) fVar.f3142r.get(i11), j9 + 1, -1);
        }
        if (fVar.f3143s.isEmpty()) {
            return null;
        }
        return new e((f.e) fVar.f3143s.get(0), j9 + 1, 0);
    }

    public static List i(J3.f fVar, long j9, int i9) {
        int i10 = (int) (j9 - fVar.f3135k);
        if (i10 < 0 || fVar.f3142r.size() < i10) {
            return AbstractC2743y.z();
        }
        ArrayList arrayList = new ArrayList();
        if (i10 < fVar.f3142r.size()) {
            if (i9 != -1) {
                f.d dVar = (f.d) fVar.f3142r.get(i10);
                if (i9 == 0) {
                    arrayList.add(dVar);
                } else if (i9 < dVar.f3153n.size()) {
                    List list = dVar.f3153n;
                    arrayList.addAll(list.subList(i9, list.size()));
                }
                i10++;
            }
            List list2 = fVar.f3142r;
            arrayList.addAll(list2.subList(i10, list2.size()));
            i9 = 0;
        }
        if (fVar.f3138n != -9223372036854775807L) {
            int i11 = i9 != -1 ? i9 : 0;
            if (i11 < fVar.f3143s.size()) {
                List list3 = fVar.f3143s;
                arrayList.addAll(list3.subList(i11, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public D3.o[] a(j jVar, long j9) {
        int i9;
        int iD = jVar == null ? -1 : this.f2434h.d(jVar.f1379e);
        int length = this.f2444r.length();
        D3.o[] oVarArr = new D3.o[length];
        boolean z9 = false;
        int i10 = 0;
        while (i10 < length) {
            int iD2 = this.f2444r.d(i10);
            Uri uri = this.f2431e[iD2];
            if (this.f2433g.h(uri)) {
                J3.f fVarM = this.f2433g.m(uri, z9);
                AbstractC1684a.e(fVarM);
                long jD = fVarM.f3132h - this.f2433g.d();
                i9 = i10;
                Pair pairF = f(jVar, iD2 != iD, fVarM, jD, j9);
                oVarArr[i9] = new c(fVarM.f3191a, jD, i(fVarM, ((Long) pairF.first).longValue(), ((Integer) pairF.second).intValue()));
            } else {
                oVarArr[i10] = D3.o.f1428a;
                i9 = i10;
            }
            i10 = i9 + 1;
            z9 = false;
        }
        return oVarArr;
    }

    public long b(long j9, H1 h12) {
        int iB = this.f2444r.b();
        Uri[] uriArr = this.f2431e;
        J3.f fVarM = (iB >= uriArr.length || iB == -1) ? null : this.f2433g.m(uriArr[this.f2444r.o()], true);
        if (fVarM == null || fVarM.f3142r.isEmpty() || !fVarM.f3193c) {
            return j9;
        }
        long jD = fVarM.f3132h - this.f2433g.d();
        long j10 = j9 - jD;
        int iG = k0.g(fVarM.f3142r, Long.valueOf(j10), true, true);
        long j11 = ((f.d) fVarM.f3142r.get(iG)).f3158f;
        return h12.a(j10, j11, iG != fVarM.f3142r.size() - 1 ? ((f.d) fVarM.f3142r.get(iG + 1)).f3158f : j11) + jD;
    }

    public int c(j jVar) {
        if (jVar.f2481p == -1) {
            return 1;
        }
        J3.f fVar = (J3.f) AbstractC1684a.e(this.f2433g.m(this.f2431e[this.f2434h.d(jVar.f1379e)], false));
        int i9 = (int) (jVar.f1427k - fVar.f3135k);
        if (i9 < 0) {
            return 1;
        }
        List list = i9 < fVar.f3142r.size() ? ((f.d) fVar.f3142r.get(i9)).f3153n : fVar.f3143s;
        if (jVar.f2481p >= list.size()) {
            return 2;
        }
        f.b bVar = (f.b) list.get(jVar.f2481p);
        if (bVar.f3148n) {
            return 0;
        }
        return k0.c(Uri.parse(b0.d(fVar.f3191a, bVar.f3154a)), jVar.f1377c.f17598a) ? 1 : 2;
    }

    public void e(long j9, long j10, List list, boolean z9, b bVar) {
        J3.f fVar;
        long jD;
        Uri uri;
        int i9;
        j jVar = list.isEmpty() ? null : (j) D.d(list);
        int iD = jVar == null ? -1 : this.f2434h.d(jVar.f1379e);
        long jMax = j10 - j9;
        long jS = s(j9);
        if (jVar != null && !this.f2443q) {
            long jD2 = jVar.d();
            jMax = Math.max(0L, jMax - jD2);
            if (jS != -9223372036854775807L) {
                jS = Math.max(0L, jS - jD2);
            }
        }
        this.f2444r.r(j9, jMax, jS, list, a(jVar, j10));
        int iO = this.f2444r.o();
        boolean z10 = iD != iO;
        Uri uri2 = this.f2431e[iO];
        if (!this.f2433g.h(uri2)) {
            bVar.f2450c = uri2;
            this.f2446t &= uri2.equals(this.f2442p);
            this.f2442p = uri2;
            return;
        }
        J3.f fVarM = this.f2433g.m(uri2, true);
        AbstractC1684a.e(fVarM);
        this.f2443q = fVarM.f3193c;
        w(fVarM);
        long jD3 = fVarM.f3132h - this.f2433g.d();
        Pair pairF = f(jVar, z10, fVarM, jD3, j10);
        long jLongValue = ((Long) pairF.first).longValue();
        int iIntValue = ((Integer) pairF.second).intValue();
        if (jLongValue >= fVarM.f3135k || jVar == null || !z10) {
            fVar = fVarM;
            jD = jD3;
            uri = uri2;
            i9 = iO;
        } else {
            Uri uri3 = this.f2431e[iD];
            J3.f fVarM2 = this.f2433g.m(uri3, true);
            AbstractC1684a.e(fVarM2);
            jD = fVarM2.f3132h - this.f2433g.d();
            Pair pairF2 = f(jVar, false, fVarM2, jD, j10);
            jLongValue = ((Long) pairF2.first).longValue();
            iIntValue = ((Integer) pairF2.second).intValue();
            i9 = iD;
            uri = uri3;
            fVar = fVarM2;
        }
        if (jLongValue < fVar.f3135k) {
            this.f2441o = new C0494b();
            return;
        }
        e eVarG = g(fVar, jLongValue, iIntValue);
        if (eVarG == null) {
            if (!fVar.f3139o) {
                bVar.f2450c = uri;
                this.f2446t &= uri.equals(this.f2442p);
                this.f2442p = uri;
                return;
            } else {
                if (z9 || fVar.f3142r.isEmpty()) {
                    bVar.f2449b = true;
                    return;
                }
                eVarG = new e((f.e) D.d(fVar.f3142r), (fVar.f3135k + ((long) fVar.f3142r.size())) - 1, -1);
            }
        }
        this.f2446t = false;
        this.f2442p = null;
        Uri uriD = d(fVar, eVarG.f2455a.f3155c);
        D3.f fVarL = l(uriD, i9);
        bVar.f2448a = fVarL;
        if (fVarL != null) {
            return;
        }
        Uri uriD2 = d(fVar, eVarG.f2455a);
        D3.f fVarL2 = l(uriD2, i9);
        bVar.f2448a = fVarL2;
        if (fVarL2 != null) {
            return;
        }
        boolean zW = j.w(jVar, uri, fVar, eVarG, jD);
        if (zW && eVarG.f2458d) {
            return;
        }
        bVar.f2448a = j.j(this.f2427a, this.f2428b, this.f2432f[i9], jD, fVar, eVarG, uri, this.f2435i, this.f2444r.q(), this.f2444r.g(), this.f2439m, this.f2430d, this.f2438l, jVar, this.f2436j.a(uriD2), this.f2436j.a(uriD), zW, this.f2437k, null);
    }

    public final Pair f(j jVar, boolean z9, J3.f fVar, long j9, long j10) {
        if (jVar != null && !z9) {
            if (!jVar.h()) {
                return new Pair(Long.valueOf(jVar.f1427k), Integer.valueOf(jVar.f2481p));
            }
            Long lValueOf = Long.valueOf(jVar.f2481p == -1 ? jVar.g() : jVar.f1427k);
            int i9 = jVar.f2481p;
            return new Pair(lValueOf, Integer.valueOf(i9 != -1 ? i9 + 1 : -1));
        }
        long j11 = fVar.f3145u + j9;
        if (jVar != null && !this.f2443q) {
            j10 = jVar.f1382h;
        }
        if (!fVar.f3139o && j10 >= j11) {
            return new Pair(Long.valueOf(fVar.f3135k + ((long) fVar.f3142r.size())), -1);
        }
        long j12 = j10 - j9;
        int i10 = 0;
        int iG = k0.g(fVar.f3142r, Long.valueOf(j12), true, !this.f2433g.i() || jVar == null);
        long j13 = ((long) iG) + fVar.f3135k;
        if (iG >= 0) {
            f.d dVar = (f.d) fVar.f3142r.get(iG);
            List list = j12 < dVar.f3158f + dVar.f3156d ? dVar.f3153n : fVar.f3143s;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                f.b bVar = (f.b) list.get(i10);
                if (j12 >= bVar.f3158f + bVar.f3156d) {
                    i10++;
                } else if (bVar.f3147m) {
                    j13 += list == fVar.f3143s ? 1L : 0L;
                    i = i10;
                }
            }
        }
        return new Pair(Long.valueOf(j13), Integer.valueOf(i));
    }

    public int h(long j9, List list) {
        return (this.f2441o != null || this.f2444r.length() < 2) ? list.size() : this.f2444r.n(j9, list);
    }

    public g0 j() {
        return this.f2434h;
    }

    public Z3.s k() {
        return this.f2444r;
    }

    public final D3.f l(Uri uri, int i9) {
        if (uri == null) {
            return null;
        }
        byte[] bArrC = this.f2436j.c(uri);
        if (bArrC != null) {
            this.f2436j.b(uri, bArrC);
            return null;
        }
        return new a(this.f2429c, new C1227s.b().i(uri).b(1).a(), this.f2432f[i9], this.f2444r.q(), this.f2444r.g(), this.f2440n);
    }

    public boolean m(D3.f fVar, long j9) {
        Z3.s sVar = this.f2444r;
        return sVar.e(sVar.i(this.f2434h.d(fVar.f1379e)), j9);
    }

    public void n() throws IOException {
        IOException iOException = this.f2441o;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f2442p;
        if (uri == null || !this.f2446t) {
            return;
        }
        this.f2433g.c(uri);
    }

    public boolean o(Uri uri) {
        return k0.t(this.f2431e, uri);
    }

    public void p(D3.f fVar) {
        if (fVar instanceof a) {
            a aVar = (a) fVar;
            this.f2440n = aVar.h();
            this.f2436j.b(aVar.f1377c.f17598a, (byte[]) AbstractC1684a.e(aVar.j()));
        }
    }

    public boolean q(Uri uri, long j9) {
        int i9;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.f2431e;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            }
            if (uriArr[i10].equals(uri)) {
                break;
            }
            i10++;
        }
        if (i10 == -1 || (i9 = this.f2444r.i(i10)) == -1) {
            return true;
        }
        this.f2446t |= uri.equals(this.f2442p);
        return j9 == -9223372036854775807L || (this.f2444r.e(i9, j9) && this.f2433g.k(uri, j9));
    }

    public void r() {
        this.f2441o = null;
    }

    public final long s(long j9) {
        long j10 = this.f2445s;
        if (j10 != -9223372036854775807L) {
            return j10 - j9;
        }
        return -9223372036854775807L;
    }

    public void t(boolean z9) {
        this.f2439m = z9;
    }

    public void u(Z3.s sVar) {
        this.f2444r = sVar;
    }

    public boolean v(long j9, D3.f fVar, List list) {
        if (this.f2441o != null) {
            return false;
        }
        return this.f2444r.j(j9, fVar, list);
    }

    public final void w(J3.f fVar) {
        this.f2445s = fVar.f3139o ? -9223372036854775807L : fVar.e() - this.f2433g.d();
    }
}
