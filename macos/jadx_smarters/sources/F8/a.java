package F8;

import B8.f;
import B8.h;
import E8.o;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import okhttp3.internal.http2.Http2Connection;
import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0031a f2095c = new C0031a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f2096d = f(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f2097e = c.i(4611686018427387903L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f2098f = c.i(-4611686018427387903L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2099a;

    /* JADX INFO: renamed from: F8.a$a, reason: collision with other inner class name */
    public static final class C0031a {
        public C0031a() {
        }

        public /* synthetic */ C0031a(g gVar) {
            this();
        }
    }

    public /* synthetic */ a(long j9) {
        this.f2099a = j9;
    }

    public static final boolean A(long j9) {
        return j9 > 0;
    }

    public static final long B(long j9, long j10) {
        return C(j9, F(j10));
    }

    public static final long C(long j9, long j10) {
        if (y(j9)) {
            if (v(j10) || (j10 ^ j9) >= 0) {
                return j9;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (y(j10)) {
            return j10;
        }
        if ((((int) j9) & 1) != (((int) j10) & 1)) {
            return w(j9) ? a(j9, t(j9), t(j10)) : a(j9, t(j10), t(j9));
        }
        long jT = t(j9) + t(j10);
        return x(j9) ? c.l(jT) : c.j(jT);
    }

    public static final long D(long j9, d unit) {
        l.e(unit, "unit");
        if (j9 == f2097e) {
            return Long.MAX_VALUE;
        }
        if (j9 == f2098f) {
            return Long.MIN_VALUE;
        }
        return e.a(t(j9), s(j9), unit);
    }

    public static String E(long j9) {
        int i9;
        long j10;
        StringBuilder sb;
        int i10;
        int i11;
        String str;
        boolean z9;
        if (j9 == 0) {
            return "0s";
        }
        if (j9 == f2097e) {
            return "Infinity";
        }
        if (j9 == f2098f) {
            return "-Infinity";
        }
        boolean z10 = z(j9);
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append('-');
        }
        long jH = h(j9);
        long j11 = j(jH);
        int i12 = i(jH);
        int iP = p(jH);
        int iR = r(jH);
        int iQ = q(jH);
        int i13 = 0;
        boolean z11 = j11 != 0;
        boolean z12 = i12 != 0;
        boolean z13 = iP != 0;
        boolean z14 = (iR == 0 && iQ == 0) ? false : true;
        if (z11) {
            sb2.append(j11);
            sb2.append('d');
            i13 = 1;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i14 = i13 + 1;
            if (i13 > 0) {
                sb2.append(TokenParser.SP);
            }
            sb2.append(i12);
            sb2.append('h');
            i13 = i14;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i15 = i13 + 1;
            if (i13 > 0) {
                sb2.append(TokenParser.SP);
            }
            sb2.append(iP);
            sb2.append('m');
            i13 = i15;
        }
        if (z14) {
            int i16 = i13 + 1;
            if (i13 > 0) {
                sb2.append(TokenParser.SP);
            }
            if (iR != 0 || z11 || z12 || z13) {
                i9 = 9;
                j10 = j9;
                sb = sb2;
                i10 = iR;
                i11 = iQ;
                str = "s";
                z9 = false;
            } else {
                if (iQ >= 1000000) {
                    i10 = iQ / 1000000;
                    i11 = iQ % 1000000;
                    str = "ms";
                    z9 = false;
                    i9 = 6;
                } else if (iQ >= 1000) {
                    i10 = iQ / 1000;
                    i11 = iQ % 1000;
                    str = "us";
                    z9 = false;
                    i9 = 3;
                } else {
                    sb2.append(iQ);
                    sb2.append("ns");
                    i13 = i16;
                }
                j10 = j9;
                sb = sb2;
            }
            b(j10, sb, i10, i11, i9, str, z9);
            i13 = i16;
        }
        if (z10 && i13 > 1) {
            sb2.insert(1, '(').append(')');
        }
        String string = sb2.toString();
        l.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final long F(long j9) {
        return c.h(-t(j9), ((int) j9) & 1);
    }

    public static final long a(long j9, long j10, long j11) {
        long jN = c.n(j11);
        long j12 = j10 + jN;
        if (!new f(-4611686018426L, 4611686018426L).h(j12)) {
            return c.i(h.i(j12, -4611686018427387903L, 4611686018427387903L));
        }
        return c.k(c.m(j12) + (j11 - c.m(jN)));
    }

    public static final void b(long j9, StringBuilder sb, int i9, int i10, int i11, String str, boolean z9) {
        sb.append(i9);
        if (i10 != 0) {
            sb.append('.');
            String strE0 = o.e0(String.valueOf(i10), i11, '0');
            int i12 = -1;
            int length = strE0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i13 = length - 1;
                    if (strE0.charAt(length) != '0') {
                        i12 = length;
                        break;
                    } else if (i13 < 0) {
                        break;
                    } else {
                        length = i13;
                    }
                }
            }
            int i14 = i12 + 1;
            if (z9 || i14 >= 3) {
                sb.append((CharSequence) strE0, 0, ((i12 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strE0, 0, i14);
            }
            l.d(sb, "this.append(value, startIndex, endIndex)");
        }
        sb.append(str);
    }

    public static final /* synthetic */ a c(long j9) {
        return new a(j9);
    }

    public static int e(long j9, long j10) {
        long j11 = j9 ^ j10;
        if (j11 < 0 || (((int) j11) & 1) == 0) {
            return l.g(j9, j10);
        }
        int i9 = (((int) j9) & 1) - (((int) j10) & 1);
        return z(j9) ? -i9 : i9;
    }

    public static long f(long j9) {
        if (b.a()) {
            if (x(j9)) {
                if (!new f(-4611686018426999999L, 4611686018426999999L).h(t(j9))) {
                    throw new AssertionError(t(j9) + " ns is out of nanoseconds range");
                }
            } else {
                if (!new f(-4611686018427387903L, 4611686018427387903L).h(t(j9))) {
                    throw new AssertionError(t(j9) + " ms is out of milliseconds range");
                }
                if (new f(-4611686018426L, 4611686018426L).h(t(j9))) {
                    throw new AssertionError(t(j9) + " ms is denormalized");
                }
            }
        }
        return j9;
    }

    public static boolean g(long j9, Object obj) {
        return (obj instanceof a) && j9 == ((a) obj).G();
    }

    public static final long h(long j9) {
        return z(j9) ? F(j9) : j9;
    }

    public static final int i(long j9) {
        if (y(j9)) {
            return 0;
        }
        return (int) (l(j9) % ((long) 24));
    }

    public static final long j(long j9) {
        return D(j9, d.DAYS);
    }

    public static final long l(long j9) {
        return D(j9, d.HOURS);
    }

    public static final long n(long j9) {
        return D(j9, d.MINUTES);
    }

    public static final long o(long j9) {
        return D(j9, d.SECONDS);
    }

    public static final int p(long j9) {
        if (y(j9)) {
            return 0;
        }
        return (int) (n(j9) % ((long) 60));
    }

    public static final int q(long j9) {
        if (y(j9)) {
            return 0;
        }
        boolean zW = w(j9);
        long jT = t(j9);
        return (int) (zW ? c.m(jT % ((long) 1000)) : jT % ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
    }

    public static final int r(long j9) {
        if (y(j9)) {
            return 0;
        }
        return (int) (o(j9) % ((long) 60));
    }

    public static final d s(long j9) {
        return x(j9) ? d.NANOSECONDS : d.MILLISECONDS;
    }

    public static final long t(long j9) {
        return j9 >> 1;
    }

    public static int u(long j9) {
        return (int) (j9 ^ (j9 >>> 32));
    }

    public static final boolean v(long j9) {
        return !y(j9);
    }

    public static final boolean w(long j9) {
        return (((int) j9) & 1) == 1;
    }

    public static final boolean x(long j9) {
        return (((int) j9) & 1) == 0;
    }

    public static final boolean y(long j9) {
        return j9 == f2097e || j9 == f2098f;
    }

    public static final boolean z(long j9) {
        return j9 < 0;
    }

    public final /* synthetic */ long G() {
        return this.f2099a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return d(((a) obj).G());
    }

    public int d(long j9) {
        return e(this.f2099a, j9);
    }

    public boolean equals(Object obj) {
        return g(this.f2099a, obj);
    }

    public int hashCode() {
        return u(this.f2099a);
    }

    public String toString() {
        return E(this.f2099a);
    }
}
