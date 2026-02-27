package O2;

import C3.b;
import O2.H0;
import O2.InterfaceC0901n;
import O2.Q1;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import d4.AbstractC1684a;
import d4.AbstractC1686c;
import java.util.ArrayList;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Q1 implements InterfaceC0901n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q1 f5705a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f5706c = d4.k0.A0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f5707d = d4.k0.A0(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f5708e = d4.k0.A0(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final InterfaceC0901n.a f5709f = new InterfaceC0901n.a() { // from class: O2.P1
        @Override // O2.InterfaceC0901n.a
        public final InterfaceC0901n a(Bundle bundle) {
            return Q1.b(bundle);
        }
    };

    public class a extends Q1 {
        @Override // O2.Q1
        public int f(Object obj) {
            return -1;
        }

        @Override // O2.Q1
        public b l(int i9, b bVar, boolean z9) {
            throw new IndexOutOfBoundsException();
        }

        @Override // O2.Q1
        public int n() {
            return 0;
        }

        @Override // O2.Q1
        public Object r(int i9) {
            throw new IndexOutOfBoundsException();
        }

        @Override // O2.Q1
        public d t(int i9, d dVar, long j9) {
            throw new IndexOutOfBoundsException();
        }

        @Override // O2.Q1
        public int u() {
            return 0;
        }
    }

    public static final class b implements InterfaceC0901n {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f5710i = d4.k0.A0(0);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f5711j = d4.k0.A0(1);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f5712k = d4.k0.A0(2);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f5713l = d4.k0.A0(3);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f5714m = d4.k0.A0(4);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final InterfaceC0901n.a f5715n = new InterfaceC0901n.a() { // from class: O2.R1
            @Override // O2.InterfaceC0901n.a
            public final InterfaceC0901n a(Bundle bundle) {
                return Q1.b.c(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5716a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f5717c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5718d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f5719e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f5720f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f5721g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public C3.b f5722h = C3.b.f1036h;

        public static b c(Bundle bundle) {
            int i9 = bundle.getInt(f5710i, 0);
            long j9 = bundle.getLong(f5711j, -9223372036854775807L);
            long j10 = bundle.getLong(f5712k, 0L);
            boolean z9 = bundle.getBoolean(f5713l, false);
            Bundle bundle2 = bundle.getBundle(f5714m);
            C3.b bVar = bundle2 != null ? (C3.b) C3.b.f1042n.a(bundle2) : C3.b.f1036h;
            b bVar2 = new b();
            bVar2.z(null, null, i9, j9, j10, bVar, z9);
            return bVar2;
        }

        public int d(int i9) {
            return this.f5722h.e(i9).f1059c;
        }

        public long e(int i9, int i10) {
            b.C0010b c0010bE = this.f5722h.e(i9);
            if (c0010bE.f1059c != -1) {
                return c0010bE.f1063g[i10];
            }
            return -9223372036854775807L;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return d4.k0.c(this.f5716a, bVar.f5716a) && d4.k0.c(this.f5717c, bVar.f5717c) && this.f5718d == bVar.f5718d && this.f5719e == bVar.f5719e && this.f5720f == bVar.f5720f && this.f5721g == bVar.f5721g && d4.k0.c(this.f5722h, bVar.f5722h);
        }

        public int f() {
            return this.f5722h.f1044c;
        }

        public int g(long j9) {
            return this.f5722h.f(j9, this.f5719e);
        }

        @Override // O2.InterfaceC0901n
        public Bundle h() {
            Bundle bundle = new Bundle();
            int i9 = this.f5718d;
            if (i9 != 0) {
                bundle.putInt(f5710i, i9);
            }
            long j9 = this.f5719e;
            if (j9 != -9223372036854775807L) {
                bundle.putLong(f5711j, j9);
            }
            long j10 = this.f5720f;
            if (j10 != 0) {
                bundle.putLong(f5712k, j10);
            }
            boolean z9 = this.f5721g;
            if (z9) {
                bundle.putBoolean(f5713l, z9);
            }
            if (!this.f5722h.equals(C3.b.f1036h)) {
                bundle.putBundle(f5714m, this.f5722h.h());
            }
            return bundle;
        }

        public int hashCode() {
            Object obj = this.f5716a;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f5717c;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f5718d) * 31;
            long j9 = this.f5719e;
            int i9 = (iHashCode2 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
            long j10 = this.f5720f;
            return ((((i9 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f5721g ? 1 : 0)) * 31) + this.f5722h.hashCode();
        }

        public int i(long j9) {
            return this.f5722h.g(j9, this.f5719e);
        }

        public long j(int i9) {
            return this.f5722h.e(i9).f1058a;
        }

        public long k() {
            return this.f5722h.f1045d;
        }

        public int l(int i9, int i10) {
            b.C0010b c0010bE = this.f5722h.e(i9);
            if (c0010bE.f1059c != -1) {
                return c0010bE.f1062f[i10];
            }
            return 0;
        }

        public Object m() {
            return this.f5722h.f1043a;
        }

        public long n(int i9) {
            return this.f5722h.e(i9).f1064h;
        }

        public long o() {
            return d4.k0.x1(this.f5719e);
        }

        public long p() {
            return this.f5719e;
        }

        public int q(int i9) {
            return this.f5722h.e(i9).f();
        }

        public int r(int i9, int i10) {
            return this.f5722h.e(i9).g(i10);
        }

        public long s() {
            return d4.k0.x1(this.f5720f);
        }

        public long t() {
            return this.f5720f;
        }

        public int u() {
            return this.f5722h.f1047f;
        }

        public boolean v(int i9) {
            return !this.f5722h.e(i9).i();
        }

        public boolean w(int i9) {
            return i9 == f() - 1 && this.f5722h.j(i9);
        }

        public boolean x(int i9) {
            return this.f5722h.e(i9).f1065i;
        }

        public b y(Object obj, Object obj2, int i9, long j9, long j10) {
            return z(obj, obj2, i9, j9, j10, C3.b.f1036h, false);
        }

        public b z(Object obj, Object obj2, int i9, long j9, long j10, C3.b bVar, boolean z9) {
            this.f5716a = obj;
            this.f5717c = obj2;
            this.f5718d = i9;
            this.f5719e = j9;
            this.f5720f = j10;
            this.f5722h = bVar;
            this.f5721g = z9;
            return this;
        }
    }

    public static final class c extends Q1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AbstractC2743y f5723g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AbstractC2743y f5724h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int[] f5725i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int[] f5726j;

        public c(AbstractC2743y abstractC2743y, AbstractC2743y abstractC2743y2, int[] iArr) {
            AbstractC1684a.a(abstractC2743y.size() == iArr.length);
            this.f5723g = abstractC2743y;
            this.f5724h = abstractC2743y2;
            this.f5725i = iArr;
            this.f5726j = new int[iArr.length];
            for (int i9 = 0; i9 < iArr.length; i9++) {
                this.f5726j[iArr[i9]] = i9;
            }
        }

        @Override // O2.Q1
        public int e(boolean z9) {
            if (v()) {
                return -1;
            }
            if (z9) {
                return this.f5725i[0];
            }
            return 0;
        }

        @Override // O2.Q1
        public int f(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // O2.Q1
        public int g(boolean z9) {
            if (v()) {
                return -1;
            }
            return z9 ? this.f5725i[u() - 1] : u() - 1;
        }

        @Override // O2.Q1
        public int j(int i9, int i10, boolean z9) {
            if (i10 == 1) {
                return i9;
            }
            if (i9 != g(z9)) {
                return z9 ? this.f5725i[this.f5726j[i9] + 1] : i9 + 1;
            }
            if (i10 == 2) {
                return e(z9);
            }
            return -1;
        }

        @Override // O2.Q1
        public b l(int i9, b bVar, boolean z9) {
            b bVar2 = (b) this.f5724h.get(i9);
            bVar.z(bVar2.f5716a, bVar2.f5717c, bVar2.f5718d, bVar2.f5719e, bVar2.f5720f, bVar2.f5722h, bVar2.f5721g);
            return bVar;
        }

        @Override // O2.Q1
        public int n() {
            return this.f5724h.size();
        }

        @Override // O2.Q1
        public int q(int i9, int i10, boolean z9) {
            if (i10 == 1) {
                return i9;
            }
            if (i9 != e(z9)) {
                return z9 ? this.f5725i[this.f5726j[i9] - 1] : i9 - 1;
            }
            if (i10 == 2) {
                return g(z9);
            }
            return -1;
        }

        @Override // O2.Q1
        public Object r(int i9) {
            throw new UnsupportedOperationException();
        }

        @Override // O2.Q1
        public d t(int i9, d dVar, long j9) {
            d dVar2 = (d) this.f5723g.get(i9);
            dVar.j(dVar2.f5744a, dVar2.f5746d, dVar2.f5747e, dVar2.f5748f, dVar2.f5749g, dVar2.f5750h, dVar2.f5751i, dVar2.f5752j, dVar2.f5754l, dVar2.f5756n, dVar2.f5757o, dVar2.f5758p, dVar2.f5759q, dVar2.f5760r);
            dVar.f5755m = dVar2.f5755m;
            return dVar;
        }

        @Override // O2.Q1
        public int u() {
            return this.f5723g.size();
        }
    }

    public static final class d implements InterfaceC0901n {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f5745c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f5747e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f5748f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f5749g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f5750h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f5751i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f5752j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f5753k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public H0.g f5754l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f5755m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f5756n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f5757o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f5758p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f5759q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public long f5760r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final Object f5736s = new Object();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final Object f5737t = new Object();

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final H0 f5738u = new H0.c().g("com.google.android.exoplayer2.Timeline").m(Uri.EMPTY).a();

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final String f5739v = d4.k0.A0(1);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final String f5740w = d4.k0.A0(2);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final String f5741x = d4.k0.A0(3);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final String f5742y = d4.k0.A0(4);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final String f5743z = d4.k0.A0(5);

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final String f5727A = d4.k0.A0(6);

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final String f5728B = d4.k0.A0(7);

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final String f5729C = d4.k0.A0(8);

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final String f5730D = d4.k0.A0(9);

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final String f5731E = d4.k0.A0(10);

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final String f5732F = d4.k0.A0(11);

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public static final String f5733G = d4.k0.A0(12);

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public static final String f5734H = d4.k0.A0(13);

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public static final InterfaceC0901n.a f5735I = new InterfaceC0901n.a() { // from class: O2.S1
            @Override // O2.InterfaceC0901n.a
            public final InterfaceC0901n a(Bundle bundle) {
                return Q1.d.b(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5744a = f5736s;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public H0 f5746d = f5738u;

        public static d b(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f5739v);
            H0 h02 = bundle2 != null ? (H0) H0.f5526q.a(bundle2) : H0.f5519j;
            long j9 = bundle.getLong(f5740w, -9223372036854775807L);
            long j10 = bundle.getLong(f5741x, -9223372036854775807L);
            long j11 = bundle.getLong(f5742y, -9223372036854775807L);
            boolean z9 = bundle.getBoolean(f5743z, false);
            boolean z10 = bundle.getBoolean(f5727A, false);
            Bundle bundle3 = bundle.getBundle(f5728B);
            H0.g gVar = bundle3 != null ? (H0.g) H0.g.f5606m.a(bundle3) : null;
            boolean z11 = bundle.getBoolean(f5729C, false);
            long j12 = bundle.getLong(f5730D, 0L);
            long j13 = bundle.getLong(f5731E, -9223372036854775807L);
            int i9 = bundle.getInt(f5732F, 0);
            int i10 = bundle.getInt(f5733G, 0);
            long j14 = bundle.getLong(f5734H, 0L);
            d dVar = new d();
            dVar.j(f5737t, h02, null, j9, j10, j11, z9, z10, gVar, j12, j13, i9, i10, j14);
            dVar.f5755m = z11;
            return dVar;
        }

        public long c() {
            return d4.k0.g0(this.f5750h);
        }

        public long d() {
            return d4.k0.x1(this.f5756n);
        }

        public long e() {
            return this.f5756n;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            d dVar = (d) obj;
            return d4.k0.c(this.f5744a, dVar.f5744a) && d4.k0.c(this.f5746d, dVar.f5746d) && d4.k0.c(this.f5747e, dVar.f5747e) && d4.k0.c(this.f5754l, dVar.f5754l) && this.f5748f == dVar.f5748f && this.f5749g == dVar.f5749g && this.f5750h == dVar.f5750h && this.f5751i == dVar.f5751i && this.f5752j == dVar.f5752j && this.f5755m == dVar.f5755m && this.f5756n == dVar.f5756n && this.f5757o == dVar.f5757o && this.f5758p == dVar.f5758p && this.f5759q == dVar.f5759q && this.f5760r == dVar.f5760r;
        }

        public long f() {
            return d4.k0.x1(this.f5757o);
        }

        public long g() {
            return this.f5760r;
        }

        @Override // O2.InterfaceC0901n
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (!H0.f5519j.equals(this.f5746d)) {
                bundle.putBundle(f5739v, this.f5746d.h());
            }
            long j9 = this.f5748f;
            if (j9 != -9223372036854775807L) {
                bundle.putLong(f5740w, j9);
            }
            long j10 = this.f5749g;
            if (j10 != -9223372036854775807L) {
                bundle.putLong(f5741x, j10);
            }
            long j11 = this.f5750h;
            if (j11 != -9223372036854775807L) {
                bundle.putLong(f5742y, j11);
            }
            boolean z9 = this.f5751i;
            if (z9) {
                bundle.putBoolean(f5743z, z9);
            }
            boolean z10 = this.f5752j;
            if (z10) {
                bundle.putBoolean(f5727A, z10);
            }
            H0.g gVar = this.f5754l;
            if (gVar != null) {
                bundle.putBundle(f5728B, gVar.h());
            }
            boolean z11 = this.f5755m;
            if (z11) {
                bundle.putBoolean(f5729C, z11);
            }
            long j12 = this.f5756n;
            if (j12 != 0) {
                bundle.putLong(f5730D, j12);
            }
            long j13 = this.f5757o;
            if (j13 != -9223372036854775807L) {
                bundle.putLong(f5731E, j13);
            }
            int i9 = this.f5758p;
            if (i9 != 0) {
                bundle.putInt(f5732F, i9);
            }
            int i10 = this.f5759q;
            if (i10 != 0) {
                bundle.putInt(f5733G, i10);
            }
            long j14 = this.f5760r;
            if (j14 != 0) {
                bundle.putLong(f5734H, j14);
            }
            return bundle;
        }

        public int hashCode() {
            int iHashCode = (((217 + this.f5744a.hashCode()) * 31) + this.f5746d.hashCode()) * 31;
            Object obj = this.f5747e;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            H0.g gVar = this.f5754l;
            int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j9 = this.f5748f;
            int i9 = (iHashCode3 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
            long j10 = this.f5749g;
            int i10 = (i9 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f5750h;
            int i11 = (((((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f5751i ? 1 : 0)) * 31) + (this.f5752j ? 1 : 0)) * 31) + (this.f5755m ? 1 : 0)) * 31;
            long j12 = this.f5756n;
            int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f5757o;
            int i13 = (((((i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f5758p) * 31) + this.f5759q) * 31;
            long j14 = this.f5760r;
            return i13 + ((int) (j14 ^ (j14 >>> 32)));
        }

        public boolean i() {
            AbstractC1684a.g(this.f5753k == (this.f5754l != null));
            return this.f5754l != null;
        }

        public d j(Object obj, H0 h02, Object obj2, long j9, long j10, long j11, boolean z9, boolean z10, H0.g gVar, long j12, long j13, int i9, int i10, long j14) {
            H0.h hVar;
            this.f5744a = obj;
            this.f5746d = h02 != null ? h02 : f5738u;
            this.f5745c = (h02 == null || (hVar = h02.f5528c) == null) ? null : hVar.f5633j;
            this.f5747e = obj2;
            this.f5748f = j9;
            this.f5749g = j10;
            this.f5750h = j11;
            this.f5751i = z9;
            this.f5752j = z10;
            this.f5753k = gVar != null;
            this.f5754l = gVar;
            this.f5756n = j12;
            this.f5757o = j13;
            this.f5758p = i9;
            this.f5759q = i10;
            this.f5760r = j14;
            this.f5755m = false;
            return this;
        }
    }

    public static Q1 b(Bundle bundle) {
        AbstractC2743y abstractC2743yC = c(d.f5735I, AbstractC1686c.a(bundle, f5706c));
        AbstractC2743y abstractC2743yC2 = c(b.f5715n, AbstractC1686c.a(bundle, f5707d));
        int[] intArray = bundle.getIntArray(f5708e);
        if (intArray == null) {
            intArray = d(abstractC2743yC.size());
        }
        return new c(abstractC2743yC, abstractC2743yC2, intArray);
    }

    public static AbstractC2743y c(InterfaceC0901n.a aVar, IBinder iBinder) {
        if (iBinder == null) {
            return AbstractC2743y.z();
        }
        AbstractC2743y.a aVar2 = new AbstractC2743y.a();
        AbstractC2743y abstractC2743yA = BinderC0898m.a(iBinder);
        for (int i9 = 0; i9 < abstractC2743yA.size(); i9++) {
            aVar2.a(aVar.a((Bundle) abstractC2743yA.get(i9)));
        }
        return aVar2.k();
    }

    public static int[] d(int i9) {
        int[] iArr = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            iArr[i10] = i10;
        }
        return iArr;
    }

    public int e(boolean z9) {
        return v() ? -1 : 0;
    }

    public boolean equals(Object obj) {
        int iG;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q1)) {
            return false;
        }
        Q1 q12 = (Q1) obj;
        if (q12.u() != u() || q12.n() != n()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i9 = 0; i9 < u(); i9++) {
            if (!s(i9, dVar).equals(q12.s(i9, dVar2))) {
                return false;
            }
        }
        for (int i10 = 0; i10 < n(); i10++) {
            if (!l(i10, bVar, true).equals(q12.l(i10, bVar2, true))) {
                return false;
            }
        }
        int iE = e(true);
        if (iE != q12.e(true) || (iG = g(true)) != q12.g(true)) {
            return false;
        }
        while (iE != iG) {
            int iJ = j(iE, 0, true);
            if (iJ != q12.j(iE, 0, true)) {
                return false;
            }
            iE = iJ;
        }
        return true;
    }

    public abstract int f(Object obj);

    public int g(boolean z9) {
        if (v()) {
            return -1;
        }
        return u() - 1;
    }

    @Override // O2.InterfaceC0901n
    public final Bundle h() {
        ArrayList arrayList = new ArrayList();
        int iU = u();
        d dVar = new d();
        for (int i9 = 0; i9 < iU; i9++) {
            arrayList.add(t(i9, dVar, 0L).h());
        }
        ArrayList arrayList2 = new ArrayList();
        int iN = n();
        b bVar = new b();
        for (int i10 = 0; i10 < iN; i10++) {
            arrayList2.add(l(i10, bVar, false).h());
        }
        int[] iArr = new int[iU];
        if (iU > 0) {
            iArr[0] = e(true);
        }
        for (int i11 = 1; i11 < iU; i11++) {
            iArr[i11] = j(iArr[i11 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        AbstractC1686c.c(bundle, f5706c, new BinderC0898m(arrayList));
        AbstractC1686c.c(bundle, f5707d, new BinderC0898m(arrayList2));
        bundle.putIntArray(f5708e, iArr);
        return bundle;
    }

    public int hashCode() {
        int i9;
        d dVar = new d();
        b bVar = new b();
        int iU = 217 + u();
        int i10 = 0;
        while (true) {
            i9 = iU * 31;
            if (i10 >= u()) {
                break;
            }
            iU = i9 + s(i10, dVar).hashCode();
            i10++;
        }
        int iN = i9 + n();
        for (int i11 = 0; i11 < n(); i11++) {
            iN = (iN * 31) + l(i11, bVar, true).hashCode();
        }
        int iE = e(true);
        while (iE != -1) {
            iN = (iN * 31) + iE;
            iE = j(iE, 0, true);
        }
        return iN;
    }

    public final int i(int i9, b bVar, d dVar, int i10, boolean z9) {
        int i11 = k(i9, bVar).f5718d;
        if (s(i11, dVar).f5759q != i9) {
            return i9 + 1;
        }
        int iJ = j(i11, i10, z9);
        if (iJ == -1) {
            return -1;
        }
        return s(iJ, dVar).f5758p;
    }

    public int j(int i9, int i10, boolean z9) {
        if (i10 == 0) {
            if (i9 == g(z9)) {
                return -1;
            }
            return i9 + 1;
        }
        if (i10 == 1) {
            return i9;
        }
        if (i10 == 2) {
            return i9 == g(z9) ? e(z9) : i9 + 1;
        }
        throw new IllegalStateException();
    }

    public final b k(int i9, b bVar) {
        return l(i9, bVar, false);
    }

    public abstract b l(int i9, b bVar, boolean z9);

    public b m(Object obj, b bVar) {
        return l(f(obj), bVar, true);
    }

    public abstract int n();

    public final Pair o(d dVar, b bVar, int i9, long j9) {
        return (Pair) AbstractC1684a.e(p(dVar, bVar, i9, j9, 0L));
    }

    public final Pair p(d dVar, b bVar, int i9, long j9, long j10) {
        AbstractC1684a.c(i9, 0, u());
        t(i9, dVar, j10);
        if (j9 == -9223372036854775807L) {
            j9 = dVar.e();
            if (j9 == -9223372036854775807L) {
                return null;
            }
        }
        int i10 = dVar.f5758p;
        k(i10, bVar);
        while (i10 < dVar.f5759q && bVar.f5720f != j9) {
            int i11 = i10 + 1;
            if (k(i11, bVar).f5720f > j9) {
                break;
            }
            i10 = i11;
        }
        l(i10, bVar, true);
        long jMin = j9 - bVar.f5720f;
        long j11 = bVar.f5719e;
        if (j11 != -9223372036854775807L) {
            jMin = Math.min(jMin, j11 - 1);
        }
        return Pair.create(AbstractC1684a.e(bVar.f5717c), Long.valueOf(Math.max(0L, jMin)));
    }

    public int q(int i9, int i10, boolean z9) {
        if (i10 == 0) {
            if (i9 == e(z9)) {
                return -1;
            }
            return i9 - 1;
        }
        if (i10 == 1) {
            return i9;
        }
        if (i10 == 2) {
            return i9 == e(z9) ? g(z9) : i9 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object r(int i9);

    public final d s(int i9, d dVar) {
        return t(i9, dVar, 0L);
    }

    public abstract d t(int i9, d dVar, long j9);

    public abstract int u();

    public final boolean v() {
        return u() == 0;
    }

    public final boolean w(int i9, b bVar, d dVar, int i10, boolean z9) {
        return i(i9, bVar, dVar, i10, z9) == -1;
    }
}
