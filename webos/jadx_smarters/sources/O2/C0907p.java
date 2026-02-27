package O2;

import O2.H0;
import android.os.SystemClock;

/* JADX INFO: renamed from: O2.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0907p implements E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f6145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f6147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f6150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f6151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f6152i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f6153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f6154k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f6155l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f6156m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f6157n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f6158o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f6159p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f6160q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f6161r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f6162s;

    /* JADX INFO: renamed from: O2.p$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f6163a = 0.97f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f6164b = 1.03f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f6165c = 1000;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f6166d = 1.0E-7f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f6167e = d4.k0.P0(20);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f6168f = d4.k0.P0(500);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f6169g = 0.999f;

        public C0907p a() {
            return new C0907p(this.f6163a, this.f6164b, this.f6165c, this.f6166d, this.f6167e, this.f6168f, this.f6169g);
        }
    }

    public C0907p(float f9, float f10, long j9, float f11, long j10, long j11, float f12) {
        this.f6144a = f9;
        this.f6145b = f10;
        this.f6146c = j9;
        this.f6147d = f11;
        this.f6148e = j10;
        this.f6149f = j11;
        this.f6150g = f12;
        this.f6151h = -9223372036854775807L;
        this.f6152i = -9223372036854775807L;
        this.f6154k = -9223372036854775807L;
        this.f6155l = -9223372036854775807L;
        this.f6158o = f9;
        this.f6157n = f10;
        this.f6159p = 1.0f;
        this.f6160q = -9223372036854775807L;
        this.f6153j = -9223372036854775807L;
        this.f6156m = -9223372036854775807L;
        this.f6161r = -9223372036854775807L;
        this.f6162s = -9223372036854775807L;
    }

    public static long h(long j9, long j10, float f9) {
        return (long) ((j9 * f9) + ((1.0f - f9) * j10));
    }

    @Override // O2.E0
    public float a(long j9, long j10) {
        if (this.f6151h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j9, j10);
        if (this.f6160q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f6160q < this.f6146c) {
            return this.f6159p;
        }
        this.f6160q = SystemClock.elapsedRealtime();
        f(j9);
        long j11 = j9 - this.f6156m;
        if (Math.abs(j11) < this.f6148e) {
            this.f6159p = 1.0f;
        } else {
            this.f6159p = d4.k0.q((this.f6147d * j11) + 1.0f, this.f6158o, this.f6157n);
        }
        return this.f6159p;
    }

    @Override // O2.E0
    public long b() {
        return this.f6156m;
    }

    @Override // O2.E0
    public void c() {
        long j9 = this.f6156m;
        if (j9 == -9223372036854775807L) {
            return;
        }
        long j10 = j9 + this.f6149f;
        this.f6156m = j10;
        long j11 = this.f6155l;
        if (j11 != -9223372036854775807L && j10 > j11) {
            this.f6156m = j11;
        }
        this.f6160q = -9223372036854775807L;
    }

    @Override // O2.E0
    public void d(long j9) {
        this.f6152i = j9;
        g();
    }

    @Override // O2.E0
    public void e(H0.g gVar) {
        this.f6151h = d4.k0.P0(gVar.f5607a);
        this.f6154k = d4.k0.P0(gVar.f5608c);
        this.f6155l = d4.k0.P0(gVar.f5609d);
        float f9 = gVar.f5610e;
        if (f9 == -3.4028235E38f) {
            f9 = this.f6144a;
        }
        this.f6158o = f9;
        float f10 = gVar.f5611f;
        if (f10 == -3.4028235E38f) {
            f10 = this.f6145b;
        }
        this.f6157n = f10;
        if (f9 == 1.0f && f10 == 1.0f) {
            this.f6151h = -9223372036854775807L;
        }
        g();
    }

    public final void f(long j9) {
        long j10 = this.f6161r + (this.f6162s * 3);
        if (this.f6156m > j10) {
            float fP0 = d4.k0.P0(this.f6146c);
            this.f6156m = w5.h.c(j10, this.f6153j, this.f6156m - (((long) ((this.f6159p - 1.0f) * fP0)) + ((long) ((this.f6157n - 1.0f) * fP0))));
            return;
        }
        long jS = d4.k0.s(j9 - ((long) (Math.max(0.0f, this.f6159p - 1.0f) / this.f6147d)), this.f6156m, j10);
        this.f6156m = jS;
        long j11 = this.f6155l;
        if (j11 == -9223372036854775807L || jS <= j11) {
            return;
        }
        this.f6156m = j11;
    }

    public final void g() {
        long j9 = this.f6151h;
        if (j9 != -9223372036854775807L) {
            long j10 = this.f6152i;
            if (j10 != -9223372036854775807L) {
                j9 = j10;
            }
            long j11 = this.f6154k;
            if (j11 != -9223372036854775807L && j9 < j11) {
                j9 = j11;
            }
            long j12 = this.f6155l;
            if (j12 != -9223372036854775807L && j9 > j12) {
                j9 = j12;
            }
        } else {
            j9 = -9223372036854775807L;
        }
        if (this.f6153j == j9) {
            return;
        }
        this.f6153j = j9;
        this.f6156m = j9;
        this.f6161r = -9223372036854775807L;
        this.f6162s = -9223372036854775807L;
        this.f6160q = -9223372036854775807L;
    }

    public final void i(long j9, long j10) {
        long jH;
        long j11 = j9 - j10;
        long j12 = this.f6161r;
        if (j12 == -9223372036854775807L) {
            this.f6161r = j11;
            jH = 0;
        } else {
            long jMax = Math.max(j11, h(j12, j11, this.f6150g));
            this.f6161r = jMax;
            jH = h(this.f6162s, Math.abs(j11 - jMax), this.f6150g);
        }
        this.f6162s = jH;
    }
}
