package Z0;

import d.AbstractC1617D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n.InterfaceC2241a;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f10809s = Q0.k.f("WorkSpec");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final InterfaceC2241a f10810t = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Q0.t f10812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f10814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.work.b f10815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.work.b f10816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f10818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f10819i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Q0.b f10820j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10821k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Q0.a f10822l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f10823m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f10824n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f10825o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f10826p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10827q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Q0.o f10828r;

    public class a implements InterfaceC2241a {
        @Override // n.InterfaceC2241a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List apply(List list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                return arrayList;
            }
            AbstractC1617D.a(it.next());
            throw null;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Q0.t f10830b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f10830b != bVar.f10830b) {
                return false;
            }
            return this.f10829a.equals(bVar.f10829a);
        }

        public int hashCode() {
            return (this.f10829a.hashCode() * 31) + this.f10830b.hashCode();
        }
    }

    public p(p pVar) {
        this.f10812b = Q0.t.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.f17302c;
        this.f10815e = bVar;
        this.f10816f = bVar;
        this.f10820j = Q0.b.f7434i;
        this.f10822l = Q0.a.EXPONENTIAL;
        this.f10823m = 30000L;
        this.f10826p = -1L;
        this.f10828r = Q0.o.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f10811a = pVar.f10811a;
        this.f10813c = pVar.f10813c;
        this.f10812b = pVar.f10812b;
        this.f10814d = pVar.f10814d;
        this.f10815e = new androidx.work.b(pVar.f10815e);
        this.f10816f = new androidx.work.b(pVar.f10816f);
        this.f10817g = pVar.f10817g;
        this.f10818h = pVar.f10818h;
        this.f10819i = pVar.f10819i;
        this.f10820j = new Q0.b(pVar.f10820j);
        this.f10821k = pVar.f10821k;
        this.f10822l = pVar.f10822l;
        this.f10823m = pVar.f10823m;
        this.f10824n = pVar.f10824n;
        this.f10825o = pVar.f10825o;
        this.f10826p = pVar.f10826p;
        this.f10827q = pVar.f10827q;
        this.f10828r = pVar.f10828r;
    }

    public p(String str, String str2) {
        this.f10812b = Q0.t.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.f17302c;
        this.f10815e = bVar;
        this.f10816f = bVar;
        this.f10820j = Q0.b.f7434i;
        this.f10822l = Q0.a.EXPONENTIAL;
        this.f10823m = 30000L;
        this.f10826p = -1L;
        this.f10828r = Q0.o.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f10811a = str;
        this.f10813c = str2;
    }

    public long a() {
        if (c()) {
            return this.f10824n + Math.min(18000000L, this.f10822l == Q0.a.LINEAR ? this.f10823m * ((long) this.f10821k) : (long) Math.scalb(this.f10823m, this.f10821k - 1));
        }
        if (!d()) {
            long jCurrentTimeMillis = this.f10824n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f10817g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j9 = this.f10824n;
        long j10 = j9 == 0 ? jCurrentTimeMillis2 + this.f10817g : j9;
        long j11 = this.f10819i;
        long j12 = this.f10818h;
        if (j11 != j12) {
            return j10 + j12 + (j9 == 0 ? j11 * (-1) : 0L);
        }
        return j10 + (j9 != 0 ? j12 : 0L);
    }

    public boolean b() {
        return !Q0.b.f7434i.equals(this.f10820j);
    }

    public boolean c() {
        return this.f10812b == Q0.t.ENQUEUED && this.f10821k > 0;
    }

    public boolean d() {
        return this.f10818h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f10817g != pVar.f10817g || this.f10818h != pVar.f10818h || this.f10819i != pVar.f10819i || this.f10821k != pVar.f10821k || this.f10823m != pVar.f10823m || this.f10824n != pVar.f10824n || this.f10825o != pVar.f10825o || this.f10826p != pVar.f10826p || this.f10827q != pVar.f10827q || !this.f10811a.equals(pVar.f10811a) || this.f10812b != pVar.f10812b || !this.f10813c.equals(pVar.f10813c)) {
            return false;
        }
        String str = this.f10814d;
        if (str == null ? pVar.f10814d == null : str.equals(pVar.f10814d)) {
            return this.f10815e.equals(pVar.f10815e) && this.f10816f.equals(pVar.f10816f) && this.f10820j.equals(pVar.f10820j) && this.f10822l == pVar.f10822l && this.f10828r == pVar.f10828r;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((this.f10811a.hashCode() * 31) + this.f10812b.hashCode()) * 31) + this.f10813c.hashCode()) * 31;
        String str = this.f10814d;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f10815e.hashCode()) * 31) + this.f10816f.hashCode()) * 31;
        long j9 = this.f10817g;
        int i9 = (iHashCode2 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f10818h;
        int i10 = (i9 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f10819i;
        int iHashCode3 = (((((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f10820j.hashCode()) * 31) + this.f10821k) * 31) + this.f10822l.hashCode()) * 31;
        long j12 = this.f10823m;
        int i11 = (iHashCode3 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f10824n;
        int i12 = (i11 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f10825o;
        int i13 = (i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f10826p;
        return ((((i13 + ((int) (j15 ^ (j15 >>> 32)))) * 31) + (this.f10827q ? 1 : 0)) * 31) + this.f10828r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f10811a + "}";
    }
}
