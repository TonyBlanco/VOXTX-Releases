package F3;

import O2.C0936z0;
import d4.k0;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import v5.AbstractC2881a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f1996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1998c;

    public static abstract class a extends k {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f1999d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f2000e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List f2001f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f2002g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f2003h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f2004i;

        public a(i iVar, long j9, long j10, long j11, long j12, List list, long j13, long j14, long j15) {
            super(iVar, j9, j10);
            this.f1999d = j11;
            this.f2000e = j12;
            this.f2001f = list;
            this.f2004i = j13;
            this.f2002g = j14;
            this.f2003h = j15;
        }

        public long c(long j9, long j10) {
            long jG = g(j9);
            return jG != -1 ? jG : (int) (i((j10 - this.f2003h) + this.f2004i, j9) - d(j9, j10));
        }

        public long d(long j9, long j10) {
            if (g(j9) == -1) {
                long j11 = this.f2002g;
                if (j11 != -9223372036854775807L) {
                    return Math.max(e(), i((j10 - this.f2003h) - j11, j9));
                }
            }
            return e();
        }

        public long e() {
            return this.f1999d;
        }

        public long f(long j9, long j10) {
            if (this.f2001f != null) {
                return -9223372036854775807L;
            }
            long jD = d(j9, j10) + c(j9, j10);
            return (j(jD) + h(jD, j9)) - this.f2004i;
        }

        public abstract long g(long j9);

        public final long h(long j9, long j10) {
            List list = this.f2001f;
            if (list != null) {
                return (((d) list.get((int) (j9 - this.f1999d))).f2010b * 1000000) / this.f1997b;
            }
            long jG = g(j10);
            return (jG == -1 || j9 != (e() + jG) - 1) ? (this.f2000e * 1000000) / this.f1997b : j10 - j(j9);
        }

        public long i(long j9, long j10) {
            long jE = e();
            long jG = g(j10);
            if (jG == 0) {
                return jE;
            }
            if (this.f2001f == null) {
                long j11 = this.f1999d + (j9 / ((this.f2000e * 1000000) / this.f1997b));
                return j11 < jE ? jE : jG == -1 ? j11 : Math.min(j11, (jE + jG) - 1);
            }
            long j12 = (jG + jE) - 1;
            long j13 = jE;
            while (j13 <= j12) {
                long j14 = ((j12 - j13) / 2) + j13;
                long j15 = j(j14);
                if (j15 < j9) {
                    j13 = j14 + 1;
                } else {
                    if (j15 <= j9) {
                        return j14;
                    }
                    j12 = j14 - 1;
                }
            }
            return j13 == jE ? j13 : j12;
        }

        public final long j(long j9) {
            List list = this.f2001f;
            return k0.c1(list != null ? ((d) list.get((int) (j9 - this.f1999d))).f2009a - this.f1998c : (j9 - this.f1999d) * this.f2000e, 1000000L, this.f1997b);
        }

        public abstract i k(j jVar, long j9);

        public boolean l() {
            return this.f2001f != null;
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final List f2005j;

        public b(i iVar, long j9, long j10, long j11, long j12, List list, long j13, List list2, long j14, long j15) {
            super(iVar, j9, j10, j11, j12, list, j13, j14, j15);
            this.f2005j = list2;
        }

        @Override // F3.k.a
        public long g(long j9) {
            return this.f2005j.size();
        }

        @Override // F3.k.a
        public i k(j jVar, long j9) {
            return (i) this.f2005j.get((int) (j9 - this.f1999d));
        }

        @Override // F3.k.a
        public boolean l() {
            return true;
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final n f2006j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final n f2007k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final long f2008l;

        public c(i iVar, long j9, long j10, long j11, long j12, long j13, List list, long j14, n nVar, n nVar2, long j15, long j16) {
            super(iVar, j9, j10, j11, j13, list, j14, j15, j16);
            this.f2006j = nVar;
            this.f2007k = nVar2;
            this.f2008l = j12;
        }

        @Override // F3.k
        public i a(j jVar) {
            n nVar = this.f2006j;
            if (nVar == null) {
                return super.a(jVar);
            }
            C0936z0 c0936z0 = jVar.f1983b;
            return new i(nVar.a(c0936z0.f6456a, 0L, c0936z0.f6463i, 0L), 0L, -1L);
        }

        @Override // F3.k.a
        public long g(long j9) {
            if (this.f2001f != null) {
                return r0.size();
            }
            long j10 = this.f2008l;
            if (j10 != -1) {
                return (j10 - this.f1999d) + 1;
            }
            if (j9 != -9223372036854775807L) {
                return AbstractC2881a.a(BigInteger.valueOf(j9).multiply(BigInteger.valueOf(this.f1997b)), BigInteger.valueOf(this.f2000e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // F3.k.a
        public i k(j jVar, long j9) {
            List list = this.f2001f;
            long j10 = list != null ? ((d) list.get((int) (j9 - this.f1999d))).f2009a : (j9 - this.f1999d) * this.f2000e;
            n nVar = this.f2007k;
            C0936z0 c0936z0 = jVar.f1983b;
            return new i(nVar.a(c0936z0.f6456a, j9, c0936z0.f6463i, j10), 0L, -1L);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f2009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f2010b;

        public d(long j9, long j10) {
            this.f2009a = j9;
            this.f2010b = j10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f2009a == dVar.f2009a && this.f2010b == dVar.f2010b;
        }

        public int hashCode() {
            return (((int) this.f2009a) * 31) + ((int) this.f2010b);
        }
    }

    public static class e extends k {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f2011d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f2012e;

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }

        public e(i iVar, long j9, long j10, long j11, long j12) {
            super(iVar, j9, j10);
            this.f2011d = j11;
            this.f2012e = j12;
        }

        public i c() {
            long j9 = this.f2012e;
            if (j9 <= 0) {
                return null;
            }
            return new i(null, this.f2011d, j9);
        }
    }

    public k(i iVar, long j9, long j10) {
        this.f1996a = iVar;
        this.f1997b = j9;
        this.f1998c = j10;
    }

    public i a(j jVar) {
        return this.f1996a;
    }

    public long b() {
        return k0.c1(this.f1998c, 1000000L, this.f1997b);
    }
}
