package e4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40248d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40250f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f40245a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f40246b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f40249e = -9223372036854775807L;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f40251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f40252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f40253c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f40254d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f40255e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f40256f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean[] f40257g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f40258h;

        public static int c(long j9) {
            return (int) (j9 % 15);
        }

        public long a() {
            long j9 = this.f40255e;
            if (j9 == 0) {
                return 0L;
            }
            return this.f40256f / j9;
        }

        public long b() {
            return this.f40256f;
        }

        public boolean d() {
            long j9 = this.f40254d;
            if (j9 == 0) {
                return false;
            }
            return this.f40257g[c(j9 - 1)];
        }

        public boolean e() {
            return this.f40254d > 15 && this.f40258h == 0;
        }

        public void f(long j9) {
            int i9;
            long j10 = this.f40254d;
            if (j10 == 0) {
                this.f40251a = j9;
            } else if (j10 == 1) {
                long j11 = j9 - this.f40251a;
                this.f40252b = j11;
                this.f40256f = j11;
                this.f40255e = 1L;
            } else {
                long j12 = j9 - this.f40253c;
                int iC = c(j10);
                if (Math.abs(j12 - this.f40252b) <= 1000000) {
                    this.f40255e++;
                    this.f40256f += j12;
                    boolean[] zArr = this.f40257g;
                    if (zArr[iC]) {
                        zArr[iC] = false;
                        i9 = this.f40258h - 1;
                        this.f40258h = i9;
                    }
                } else {
                    boolean[] zArr2 = this.f40257g;
                    if (!zArr2[iC]) {
                        zArr2[iC] = true;
                        i9 = this.f40258h + 1;
                        this.f40258h = i9;
                    }
                }
            }
            this.f40254d++;
            this.f40253c = j9;
        }

        public void g() {
            this.f40254d = 0L;
            this.f40255e = 0L;
            this.f40256f = 0L;
            this.f40258h = 0;
            Arrays.fill(this.f40257g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f40245a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f40245a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f40250f;
    }

    public long d() {
        if (e()) {
            return this.f40245a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f40245a.e();
    }

    public void f(long j9) {
        this.f40245a.f(j9);
        if (this.f40245a.e() && !this.f40248d) {
            this.f40247c = false;
        } else if (this.f40249e != -9223372036854775807L) {
            if (!this.f40247c || this.f40246b.d()) {
                this.f40246b.g();
                this.f40246b.f(this.f40249e);
            }
            this.f40247c = true;
            this.f40246b.f(j9);
        }
        if (this.f40247c && this.f40246b.e()) {
            a aVar = this.f40245a;
            this.f40245a = this.f40246b;
            this.f40246b = aVar;
            this.f40247c = false;
            this.f40248d = false;
        }
        this.f40249e = j9;
        this.f40250f = this.f40245a.e() ? 0 : this.f40250f + 1;
    }

    public void g() {
        this.f40245a.g();
        this.f40246b.g();
        this.f40247c = false;
        this.f40249e = -9223372036854775807L;
        this.f40250f = 0;
    }
}
